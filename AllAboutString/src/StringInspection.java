public class StringInspection {
    public static void main(String[] args) {
        stringOperation("Hello World");
        stringOperation(" ");
        stringOperation("");

    }
    public  static void stringOperation(String character){
       int length =  character.length();
       System.out.println("Length of String is "+length);
       System.out.println("character at Stiring is "+character.charAt(7));
       System.out.println("Character of last index is "+character.charAt(length-1));
       if(character.isEmpty())
       {
           System.out.println("String is Empty");
       }
        System.out.println("Length of String after isEmpty comparison "+length);
       if(character.isBlank())
       {
           System.out.println("String have only whit Spaces and tabs");
       }
       System.out.println("Index of"+character.indexOf('l'));
        System.out.println("Index of String is"+character.indexOf("World"));
       System.out.println("Last index  of character is "+character.lastIndexOf('l'));
        System.out.println("Last index  of String is "+character.lastIndexOf("World"));
        System.out.println("\3n");
    }
}
