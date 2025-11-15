package oopsInJava;

import strings.Student;


public class Main {

//Created a Class Student (basically a blueprint of properties and Function || which are enclosed by this Student )
public static class Student{
    int rnos ;
    String[] name;
    double marks ;
}
    //store data of 5 rollnos
    int[] rollNom = new int[5];

    //store data of 5 names
    String[] name = new String[5];

    //but what if we want to store STUDENT 5 no.'s in 1 which includes there name , rollNos and Marks
    //We use Classes and Objects
    //basically we define our own Data type which will hold our data

    //here Student(is a class)
    Student[] stu = new Student[5];

    //creating a new Objects using template Student

}
