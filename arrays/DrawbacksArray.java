package arrays;

class Student {
    int rollNo;
    String name;
    int marks;
}

public class DrawbacksArray {
    public static void main(String[] args) {
        // array : Object
        // takes lot of space || for anything traverse through all the elements time
        // taking
        // use when u have the fix size

        // to overcome this we have collections

        int nums[] = new int[6];

        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // student object
        Student s1 = new Student();
        s1.marks = 88;
        s1.name = "Satyam";
        s1.rollNo = 1;

        Student s2 = new Student();
        s2.marks = 77;
        s2.name = "Sattu";
        s2.rollNo = 2;

        Student s3 = new Student();
        s3.marks = 90;
        s3.name = "Priyatam";
        s3.rollNo = 3;

        // create array of students
        // s1,s2,s3
        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // print all the details of the student
        for (int i = 0; i < student.length; i++) {
            // System.out.println(student[i]);
            // this will give you the address of all elements

            System.out.println(student[i].name + " : " + student[i].marks);

        }
        // Satyam : 88
        // Sattu : 77
        // Priyatam : 90

        // in this for-each loop we do not define it as int , || use the class type as
        // STUDENT

        for (Student s : student) {
            System.out.println(s.name + ": " + s.marks);
        }

    }
}
