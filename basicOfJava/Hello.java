package basicOfJava;
// What is the process of running a Java program from source code to execution?

// print hello world 
// JS = console.log("hello world")

// JAVA
// JVM = run java Application
//Java is platform independednt , so it can run on mac,linux,windows anything , || Just that machine needs to have JVM 

// JVM requires Byte Code 

// Process Summary:
// what we write is Java Code(.java) 
//      ↓ (javac)
// convert to Byte Code (compiler --> javac) (.class) 
//      ↓ goes to JVM to run ==> there would be 100 of files , now JVM execute 1 file (need to have a main()
//      ↓ 
// it looks for specific signature) || public static void main(String a[])
//      ↓ 
// Program Execution

class Hello {
    public static void main(String a[]) {
        System.out.println("hello world");
    }
}