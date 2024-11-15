import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Recipe> recipebook;
    public static void main(String[] args) {
        recipebook = new ArrayList<>();
        readRecipesFromCSV("src/rezeptbuch.csv");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bitte geben Sie den Namen des gesuchten Rezepts ein (oder 'exit' zum Beenden): ");
            String recipeTitle = scanner.nextLine();
            if (recipeTitle.equalsIgnoreCase("exit")) {
                break;
            }
            List<Recipe> recipeFound = searchRecipeFromRecipeBook(recipeTitle);
            if(recipeFound.isEmpty()){
                System.out.println("Leider kein Rezept gefunden");
            }
            else {
                for(Recipe recipe : recipeFound){
                    System.out.println(recipe);
                }
            }
        }
        scanner.close();
    }
    public static void readRecipesFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                Recipe recipe = new Recipe (data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                recipebook.add(recipe);
                // Herr Hausknecht Ich habe nur zwei Klasse erstellt, so ich weiß nicht, ob das richtig ist, oder wir brauchen für jedes (Hauptspeise und vorspeise) eigine klassen, ich habe alles gemacht, was ich in dem unterricht verstanden habe.//
                /*System.out.println(recipe);
                System.out.println();*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Recipe> searchRecipeFromRecipeBook(String Mohammed) {
        List<Recipe> recipeList = new ArrayList<>();
        for (Recipe recipe : recipebook) {
            if (recipe.getTitel().equalsIgnoreCase(Mohammed)) {
               recipeList.add(recipe);
            }
        }
        return recipeList;
    }
}