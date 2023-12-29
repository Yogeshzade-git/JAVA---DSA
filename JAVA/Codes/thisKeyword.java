// this Keyword -- this is a keyword which represents the current object
        // by this keyword we are targeting the instance variable

class car{
    private int regnum;
    private String model;
    public int getRegnum() {
        return regnum;
    }

    // public void setRegnum(int ren) {       // this will work
    //     regnum = ren;
    // }

    //But 
    // public void setRegnum(int regnum) {     // this will print regnum as 0   // not worked
    //     regnum = regnum;
    // }

    public void setRegnum(int regnum, car c) {   // it will work by passing object of class to specify that its a instance variable 
        c.regnum = regnum;                               // But java provides a fuctionality of " this " keyword - it targets the instance variable o class
    }

    public void setRegnum(int regnum) {
        this.regnum = regnum;          //this is a keyword which represents the current object
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    
}

public class thisKeyword {
    public static void main(String[] args) {
        
        car c = new car();
        // c.setRegnum(7289, c);  /// by passing the object to the method      // don't recommended
        c.setRegnum(7289);
        c.setModel("Tata Harrier");

        System.out.println(c.getRegnum() + " | " + c.getModel());
    

    }
}
