dfghjklpublic class main {
    public static void main(String[] args) {
       String user = "Sohan" + ", Mani";
       user.concat("Both are Good Boys");
       StringBuilder name = new StringBuilder("Mani"+" Teja");
     name = name.append(" is a good Boy");
       string(user);
       string(name );
    name =name.replace(15,16,"G");
    name = name.delete(0,4).replace(0,5,"Sohan");
        string(name );

    }
    public static void string(String name)
    {
        System.out.println("Name = "+name);
        System.out.println("Length = "+name.length());
    }
    public static void string(StringBuilder builder)
    {
        System.out.println("Builder = "+builder);
        System.out.println("Builder capacity = "+builder.capacity());
    }
}
