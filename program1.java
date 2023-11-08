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

// C: Child class inheriting from A
class C extends A {
    void methodC() {
        System.out.println("Method C");
    }
}

// D: Child class inheriting from B and implementing E interface
class D extends B implements E {
    void methodD() {
        System.out.println("Method D");
        }

    public void methodE() {
        System.out.println("Method E");
    }
}

// E: Interface
interface E {
    void methodE();
}

// Main class
public class program1 {
    public static void main(String[] args) {
        D d = new D();
        C c = new C();

        d.methodA();
        d.methodB();
         d.methodD();
        d.methodE();

        c.methodA();
        c.methodC();
    }
}