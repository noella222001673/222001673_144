// Interface
interface MyInterface {
    void display();
}

// Class implementing the interface
class ClassA implements MyInterface {
    public void display() {
        System.out.println("Method in ClassA");
    }
}

// ClassB
class ClassB {
    public void display() {
        System.out.println("Method in ClassB");
    }
}

// ClassC
class ClassC {
    public void display() {
        System.out.println("Method in ClassC");
    }
}

// ClassD
class ClassD {
    public void display() {
        System.out.println("Method in ClassD");
         }
}

public class ex1 {
    public static void main(String[] args) {
        MyInterface objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();
        ClassD objD = new ClassD();

        objA.display();
        objB.display();
        objC.display();
        objD.display();
    }
}
