class student{
    String name;
    int marks;
}

public class Enhanceloop {
    public static void main(String[] args) {
        
        student s1=new student();
        s1.name="ABC";
        s1.marks=90;

        student s2=new student();
        s2.name="PQR";
        s2.marks=80;

        student s3=new student();
        s3.name="XYZ";
        s3.marks=70;

        student studets[]=new student[3];
        studets[0]=s1;
        studets[1]=s2;
        studets[2]=s3;

        for(student n : studets)
        {
            System.out.println(n.name+" : "+n.marks);
        }
    }
   

        
}



