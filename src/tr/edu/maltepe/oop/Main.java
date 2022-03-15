package tr.edu.maltepe.oop;

public class Main{

    public static void main(String [] er)
    {

        Student s= new Student();
        s.setName("omar");
        s.setAge(String.valueOf(26));
        s.setstu_ID(1);
        s.studying();

        System.out.println("Student Name: " + s.getName());
        System.out.println("Age of Student is:"+s.getAge());
        System.out.println("Student ID: "+s.getstu_ID());

        Prof p= new Prof();
        p.setName("ensar");
        p.setAge(String.valueOf(46));
        p.setPro_ID(11);
        p.teaches();


        System.out.println("Prof Name: " + p.getName());
        System.out.println("Age of Prof is:"+p.getAge());
        System.out.println("Prof ID: "+p.getpro_ID(13));
    }
}