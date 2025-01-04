public class string_Buffer_Builder{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");  //StringBuffer is thread safe 

        System.out.println(sb.length());
        System.out.println(sb.append(" Zade"));
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
     sb.ensureCapacity(76);
     
        StringBuilder sbil = new StringBuilder("Gayatri");  // It is not Thread safe
        System.out.println(sbil.length());
        System.out.println(sbil.append(" Zade"));
        System.out.println(sbil.capacity());
        System.out.println(sbil.reverse());
     sbil.ensureCapacity(76);

     String strrr = "bab";
     StringBuilder sb2 = new StringBuilder(strrr);
     System.out.println("bab".equals(sb2.reverse().toString()));

    }
}