class person{

    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;            // Getters and Setters can have different naems bu t to keep code Readable to others also thats why use get and set at start
    }
    public String getName() {
        return name;               // by only declaring the private variable we can get code for the Getters and Setters by Going to ---
    }                                       // Rightclick -> Sourrce Actions -> Generate getters and setters -> select variables to genrate getter setter for
    public void setName(String name) {
        this.name = name;
    }
}

public class gettersAndsetters {
    public static void main(String[] args) {
        
        person p = new person();

        p.setAge(23);
        p.setName("Sai");

        System.out.println(p.getAge() + " " + p.getName());

    }
}
