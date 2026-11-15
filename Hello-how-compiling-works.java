
public class Hello { 
    /*
    Compile the java source code to Java bytecode using javac.
    It created a file called Hello.class that contains the bytecode representation of the Hello class.
    The bytecode sits above the standard library and the Java Virtual Machine (JVM) sit under the standard library. 
    The JVM is responsible for executing the bytecode and providing a runtime environment for Java applications.
    */
    public static void main(String[] arg) {
        System.out.print("Hello Bri!") // This system class is an example of Java SE APIs used in this program. The Java SE APIs provide a set of pre-built classes and methods that can be used to perform common tasks in Java programming.
    }
}
/*
To run the bytecode, we use the java command followed by the name of the class that contains the main method. 
The JVM loads the bytecode from the Hello.class file and executes it, resulting in the output "Hello Bri!" being displayed on the console.
 */