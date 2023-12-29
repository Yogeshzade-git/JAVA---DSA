
class student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        
        student s1 = new student();
        s1.rollno = 72;
        s1.name = "Yogesh";
        s1.marks = 43;

        student s2 = new student();
        s2.rollno = 24;
        s2.name = "Sai";
        s2.marks = 86;

        student s3 = new student();
        s3.rollno = 4;
        s3.name = "Pratiksha";
        s3.marks = 94;

        student s4 = new student();
        s4.rollno = 25;
        s4.name = "Gayatri";
        s4.marks = 67;

        student s5 = new student();
        s5.rollno = 18;
        s5.name = "Ram";
        s5.marks = 78;

        student stud[] = new student[5];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        stud[3] = s4;
        stud[4] = s5;


            //System.out.println(stud[2].rollno + " | " + stud[2].name + " | " + stud[2].marks);
             System.out.println("Rollno. | Name | Marks ");
        for(int i=0;i<stud.length;i++){                                                            // traditional for loop for printing the array
            System.out.println(stud[i].rollno + " | " + stud[i].name + " | " + stud[i].marks);
        }

            System.out.println();

        for(student st : stud){
             System.out.println(st.rollno + " | " + st.name + " | " + st.marks);     //using the enhanced for loop for printing elements
        }
 
    }
}
