public class StringManipulation {
    public static void main(String[] args) {
        String dateOfBirth = "10/05/1980";
        System.out.println("dateOfBirth is "+dateOfBirth);
        int year = dateOfBirth.indexOf("1980");
        String BrithYear = dateOfBirth.substring(year);
        System.out.println("Birth Year is "+BrithYear);
        String birthMonth = dateOfBirth.substring(3,5);
        System.out.println("Birth Year is "+birthMonth);
        String birthdate = dateOfBirth.substring(0,2);
        System.out.println("Birth date is  is "+birthdate);
        String newDate = String.join("/","10","05","1980");
        System.out.println("new Born date is "+newDate);
        String newDateOfBirth = "10";
        newDateOfBirth = newDateOfBirth.concat("/"+"05");
        newDateOfBirth = newDateOfBirth.concat("/"+"1980");
        System.out.println("New date of Birth is "+newDateOfBirth);

        System.out.println("replace " +newDateOfBirth.replace('/','-'));
        System.out.println("replace ALl "+newDateOfBirth.replaceAll("-","/"));
        System.out.println("replace first "+newDateOfBirth.replaceFirst("10","05"));
        System.out.println("replace "+newDateOfBirth.replace("0","1"));
        System.out.println("replace All "+newDateOfBirth.replaceAll("/","----"));

        System.out.println("SOHAN\n".repeat(5));
        System.out.println("-".repeat(20));
        System.out.println("SOHAN\n".repeat(5).indent(5));
        System.out.println("-".repeat(20));
    }
}
