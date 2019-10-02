import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoLecture {

    public static void main(String[] args) {

        // ============================ PATH

//        Path fileLecturePath = Paths.get( "src","Test.java");
//        System.out.println(fileLecturePath);
//        System.out.println(fileLecturePath.toAbsolutePath());

//        Path otherPath = Paths.get("src", "../", "src", "../", "src", "FileIoLecture");
//        System.out.println(otherPath);
//        System.out.println(otherPath.normalize());

//        System.out.println(otherPath.toAbsolutePath());
//        System.out.println(otherPath.normalize().toAbsolutePath());

        // ============================ FILE METHODS

//        System.out.println(Files.exists(fileLecturePath));
//        System.out.println(Files.exists(Paths.get("bob.txt")));
//
//        String directory = "data";
//        String filename = "info.txt";
//        Path dirPath = Paths.get(directory, "sub-data", "sub-sub-data");
//        Path pathToFile = Paths.get(directory, filename);
//        System.out.println(pathToFile);
//
//        if (Files.notExists(dirPath)) {
//
//            try {
//                Files.createDirectories(dirPath);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }


        // ============================ READING FILES

//        Path p = Paths.get("data", "test.txt");
//
//        List<String> lines = new ArrayList<>();
//
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(lines);

//        for (String name : lines) {
//            System.out.println("Hello, " + name + "!");
//        }


//        try {
//
//            List<String> contents = Files.readAllLines(
//                Paths.get("data", "bob.txt")
//            );
//            for (String line : contents) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println("Exception!");
//            e.printStackTrace();
//        }



        // ============================ WRITING FILES

//        Path p = Paths.get("data",  "names.txt");
//
//        List<String> newNames = Arrays.asList("Justin", "Sophie", "Fer");
//        try {
//            Files.write(p, newNames);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//            Path p = Paths.get("data",  "names.txt");
//
//            List<String> names = new ArrayList<>();
//            names.add("Tim");
//            names.add("Sally");
//            names.add("Mary");
//            try {
//                Files.write(p, names, StandardOpenOption.APPEND);
//            } catch(IOException e) {
//                e.printStackTrace();
//            }


        // ============================ ADDITIONAL SLIDE EXAMPLES


        // Print out each line in an existing file, along with the line number

//        Path groceriesPath = Paths.get("data", "groceries.txt");
//        try {
//            List<String> groceryList = Files.readAllLines(groceriesPath);
//            for (int i = 0; i < groceryList.size(); i += 1) {
//                System.out.println((i + 1) + ": " + groceryList.get(i));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




        // Add a line to an existing file

//        try {
//            Files.write(
//                    Paths.get("data", "groceries.txt"),
//                    Arrays.asList("bread"), // list with one item
//                    StandardOpenOption.APPEND
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Replace "milk" with "cream"
       updateGroceryItem("milk", "cream", Paths.get("data", "groceries.txt"));

    }

    // exercise example
    public static List<String> getContents(String location) throws IOException {
        Path p = Paths.get(location);
        return Files.readAllLines(p);
    }

    public static void updateGroceryItem(String oldItem, String newItem, Path path) {
        try {
            List<String> fileContents = getContents(path.toString());
            List<String> newList = new ArrayList<>();
            for (String line : fileContents) {
                if (line.equals(oldItem)) {
                    newList.add(newItem); // remove this line causes the method to delete an item
                    continue;
                }
                newList.add(line);
            }
            Files.write(path, newList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

