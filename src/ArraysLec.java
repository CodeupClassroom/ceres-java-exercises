import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLec {

    static String[] names = new String[4];
    static String[] languages = {"html", "css", "javascript", "java"};
    static Person[] people = new Person[2];

    public static void main(String[] args) {

        names[0] = "fer";
        names[1] = "fer1";
        names[2] = "fer2";
        names[3] = "fer3";

        names[0] = "1";

        people[0] = new Person("fer", "mendoza");
        people[1] = new Person("daniel", "rodriguez");


        System.out.println("names = " + names.length);

        for(int x =0; x < people.length; x++){
            System.out.println(people[x].sayHello());
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(people));

//        for(String name : names){
//            System.out.println(name);
//        }

//        for(Person person : people){
//            System.out.println(person.sayHello());
//        }

        for (String lang : languages){
            System.out.println("lang = " + lang);
        }

        String[] newLangs = Arrays.copyOf(languages, languages.length+1);
        newLangs[4] = "groovy";

        Arrays.sort(newLangs);

        for (String lang : newLangs){
            System.out.println("lang = " + lang);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        System.out.println(matrix[1][1]);

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");


    }
}
