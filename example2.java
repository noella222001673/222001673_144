// Interface
interface MyInterface {
    void speak();
}

// Class implementing the interface
class ClassX implements MyInterface {
    public void speak() {
        System.out.println("ClassX speaks: How are you?");
    }
}

// ClassY
class ClassY {
    public void talk() {
        System.out.println("ClassY talks: Let's have a chat.");
    }
}
// ClassZ
class ClassZ {
    public void communicate() {
        System.out.println("ClassZ communicates: Communication is key.");
    }
}

// ClassW
class ClassW {
    public void discuss() {
        System.out.println("ClassW discusses: Let's discuss this further.");
    }
}
public class example2 {
    public static void main(String[] args) {
        MyInterface objX = new ClassX();
        ClassY objY = new ClassY();
        ClassZ objZ = new ClassZ();
        ClassW objW = new ClassW();

        objX.speak();
        objY.talk();
        objZ.communicate();
        objW.discuss();
    }
}