
// Object Class equals toString hashcode      -->  learn this topic again while preparing in depth     -- > telesco on YT

class hello{

    String model;
    int value;
    String desc;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + value;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        hello other = (hello) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (value != other.value)
            return false;
        return true;
    }
}

public class ObjectClass {
    public static void main(String[] args) {

        hello h1 = new hello();
        h1.value = 200;
        h1.model = "Hp";
        
        hello h2 = new hello();
        h2.value = 200;
        h2.model = "Hp";

        System.out.println(h1.equals(h2));


    }
}
