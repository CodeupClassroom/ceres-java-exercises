public class ServerNameGenerator {

    public static String[] nouns = {
            "technology",
            "clothes",
            "perspective",
            "procedure",
            "library",
            "coffee",
            "midnight",
            "owner",
            "problem",
            "vehicle"
    };

    public static String[] adjectives = {
            "political",
            "famous",
            "obvious",
            "capable",
            "pure",
            "wooden",
            "nervous",
            "efficient",
            "guilty",
            "various"
    };

    public static String returnRandEle(String[] arr) {
        int index = (int)(Math.random() * ((arr.length - 1) + 1));
        return arr[index];
    }

    public static void main(String[] args) {

        String message = String.format("%s-%s", returnRandEle(adjectives), returnRandEle(nouns));
        System.out.println(message);

    }

}
