package Package1;

public class Constructor {

    Constructor(){
        this(1,2,3,4);
        System.out.println("Default Constructor");
    }
    Constructor (int a){
        this();
        System.out.println("One Parameterized Constructor");
    }
    Constructor (int a , int b){
        this(1,2,3);
        System.out.println("Two Parameterized Constructor");
    }
    Constructor (int a , int b , int c){
        this(1);
        System.out.println("Three Parameterized Constructor");
    }
    Constructor (int a, int b , int c ,int d){
        System.out.println("Four Parameterized Constructor");
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(1,2);
    }
}
