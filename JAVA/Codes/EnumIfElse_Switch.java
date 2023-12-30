
// enum can be used with if-else and switch case also      (mostly used with Switch case)

enum Status{
    RUNNING, PENDING, SUCCESS, FAILED;  // <<<--- here semicolon is optional
}

public class EnumIfElse_Switch {
    public static void main(String[] args) {
        
        Status s = Status.FAILED;

        if(s == Status.RUNNING)     // if-else 
            System.out.println("Processing");
        else if(s == Status.PENDING)
            System.out.println("Please wait");
        else if(s == Status.SUCCESS)
            System.out.println("Done");
        else
            System.out.println("Opps! Try again");


         Status k = Status.SUCCESS;

            switch(k){        // switch case
        case RUNNING:
                    System.out.println("Processing");
                    break;
        case PENDING:
                    System.out.println("Please wait");
                    break; 
        case SUCCESS:
                    System.out.println("Done");
                    break;
        default:
                    System.out.println("Opps! Try again");
                    break;
        }
    }

}


