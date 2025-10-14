# Understanding JDK, JVM, and JRE

## 1. JDK (Java Development Kit)

- **What is it?**  
   The JDK is a toolkit for developers. It lets you write Java code and **compiles** it into **bytecode**.

## 2. JVM (Java Virtual Machine)

- **What is it?**  
   The JVM is like a virtual computer. It **runs** the bytecode produced by the JDK.
- **Why do we need it?**  
   It provides a space for your Java program to execute, making Java platform-independent.

## 3. JRE (Java Runtime Environment)

- **What is it?**  
   The JRE is a package that contains the JVM **plus** all the libraries and resources your program needs at runtime.
- **Why do we need it?**  
   Your code might depend on external libraries. The JRE provides these, so your program can run smoothly.

---

### **How They Work Together**

```mermaid
graph TD
        A[JDK<br>(Development)] --> B[JVM<br>(Execution)]
        B --> C[JRE<br>(Libraries & Resources)]
```

- **JDK**: For writing and compiling code.
- **JVM**: For running the compiled code.
- **JRE**: For providing everything needed at runtime.

---

> **In short:**
>
> - Write code with JDK
> - Run code with JVM
> - Get extra resources from JRE
