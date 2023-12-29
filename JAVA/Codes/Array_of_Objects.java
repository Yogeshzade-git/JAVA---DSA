
// Write a program to print the roll number and average marks of 8 stud_ents in three subjects (each out of 100). The marks are entered by user.

import java.text.DecimalFormat;

class stud_ent{

    int rollno;
    int sub1, sub2, sub3;
}
public class Array_of_Objects {
    public static void main(String[] args) {

        stud_ent std1 = new stud_ent();
        std1.rollno = 34;
        std1.sub1 = 23;
        std1.sub2 = 35;
        std1.sub3 = 75;

        stud_ent std2 = new stud_ent();
        std2.rollno = 45;
        std2.sub1 = 23;
        std2.sub2 = 86;
        std2.sub3 = 45;

        stud_ent std3 = new stud_ent();
        std3.rollno = 72;
        std3.sub1 = 87;
        std3.sub2 = 45;
        std3.sub3 = 67;

        stud_ent std4 = new stud_ent();
        std4.rollno = 75;
        std4.sub1 = 87;
        std4.sub2 = 67;
        std4.sub3 = 78;

        stud_ent s[] = new stud_ent[4];
        s[0] = std1;
        s[1] = std2;
        s[2] = std3;
        s[3] = std4;


        //int avg = (((int)s[1].sub1)+((int)s[1].sub2)+((int)s[1].sub3))/300*100;
        //System.out.println((((double)s[1].sub1)+((double)s[1].sub2)+((double)s[1].sub3))/300*100);

        DecimalFormat dForm = new DecimalFormat("#.##");


        for(int i=0;i<s.length;i++){
            float avg =  ( ((float)s[i].sub1+(float)s[i].sub2+(float)s[i].sub3 )/300)*100;
            System.out.println("RollNo."+s[i].rollno + " | " + "average: " + dForm.format(avg)+"%" );
        }
        
    }
}
