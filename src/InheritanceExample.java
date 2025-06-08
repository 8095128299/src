

// Child class inheriting from Parent
class Child extends Parent {
    void displayMessage() {
        System.out.println("Hello from the Child class!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Child childObject = new Child();
        childObject.showMessage();  // Inherited method from Parent
        childObject.displayMessage(); // Method from Child class
    }
}