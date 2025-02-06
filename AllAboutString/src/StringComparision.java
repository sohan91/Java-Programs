public class StringComparision {
    public static void main(String[] args) {
        stringComp("Sohan Prasad");

    }
    public static void stringComp(String string) {
        String var = "Sohan prasad";
        if (var.contains(string)) {
            System.out.println("yes, the content is matches");
        }
        if (var.equals(string)) {
            System.out.println("yes,its matches for equals operator");
        }
        if (var.equalsIgnoreCase(string)) {
            System.out.println("it's getting match with equalIgonore case");
        }
        if (string.contentEquals("Mani"))
        {
            System.out.println("it is satisfy the contentEquals");
        }
        if(string.startsWith("soh"))
        {
            System.out.println("Yes,starts with");
        }
        if(string.endsWith("mani"))
        {
            System.out.println("Mani is matched");
        }

    }


}
