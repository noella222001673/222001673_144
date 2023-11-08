// A: Parent class
class A {
    void methodA() {
        System.out.println("Method A");
    }
}

// B: Child class inheriting from A
class B extends A {
    void methodB() {
        System.out.println("Method B");
    }
}

// C: Child class inheriting from B
class C extends B {
    void methodC() {
        System.out.println("Method C");
    }
}

// D: Child class inheriting from C
class D extends C {
    void methodD() {
        System.out.println("Method D");
    }
}

// E: Interface
interface E {
    void methodE();
}

// Class implementing interface E
class F implements E {
    public void methodE() {
        System.out.println("Method E");
    }
}

// Main class
public class program2 {
    public static void main(String[] args) {
        D d = new D();
        F f = new F();
        
        d.methodA();
        d.methodB();
        d.methodC();
        d.methodD();
        f.methodE();
    }
}


        