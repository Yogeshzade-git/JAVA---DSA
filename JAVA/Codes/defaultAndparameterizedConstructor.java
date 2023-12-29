

class User1 {
    private int id;      // instance variables
    private String pass;    // instance variables

                            // Even if we doesn't create  a constructor, java will create a Default constructor each time object called

    public User1(){    // Default Constructor
        
        this.id = (int)(Math.random()*100);
        this.pass = "admin";
    }

    public User1(int id, String pass){    // parameterized Constructor
        this.id = id; //<-- Local variable
        this.pass = pass;  //<-- Local variable
    }

    public User1(String pass){    // parameterized Constructor
        this.id = (int)(Math.random()*100);
        this.pass = pass;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}

public class defaultAndparameterizedConstructor {
    public static void main(String[] args) {

        User1 u1 = new User1();  // default
        System.out.println(u1.getId() + " | " + u1.getPass());

        User1 u2 = new User1(12, "Yz@sai39"); // parameterized
        System.out.println(u2.getId() + " | " + u2.getPass());

        User1 u3 = new User1("Yogsh");  // parameterized                   
        System.out.println(u3.getId() + " | " + u3.getPass());

        User1 u4 = new User1();  // default
        System.out.println(u4.getId() + " | " + u4.getPass());

        
    }
}
