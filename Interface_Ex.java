package CSE;
//First parent interface
interface A {
 void methodA();
}

//Second parent interface
interface B {
 void methodB();
}

//Child interface extends both A and B
interface C extends A, B {
 void methodC();
}
class MyClass implements C {
    public void methodA() {
        System.out.println("Method A implemented");
    }

    public void methodB() {
        System.out.println("Method B implemented");
    }

    public void methodC() {
        System.out.println("Method C implemented");
    }
}

// Driver class
public class Interface_Ex {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}



