public class PojoEmployee {
    private String id;
    private  String name;
    private String registerInList;
    private  String subject;

    public PojoEmployee(String id, String name, String registerInList, String subject) {
        this.id = id;
        this.name = name;
        this.registerInList = registerInList;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterInList() {
        return registerInList;
    }

    public void setRegisterInList(String registerInList) {
        this.registerInList = registerInList;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "PojoEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registerInList='" + registerInList + '\'' +
                ", subject='" + subject + '\'' +
                '}';

    }
}
