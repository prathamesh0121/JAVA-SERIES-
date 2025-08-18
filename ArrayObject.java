class student
{
    String name;
    int marks;
    
}


public class ArrayObject {
    public static void main(String[] args) 
    {
        student s1= new student();
        s1.name="ABC";
        s1.marks=90;

        student s2= new student();
        s2.name="PQR";
        s2.marks=80;

        student s3= new student();
        s3.name="XYZ";
        s3.marks=70;

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i].name+":"+students[i].marks);
            
        }

        
    }
}
