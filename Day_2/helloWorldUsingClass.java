public class helloWorldUsingClass {
    public static void main(String[] args){
        System.out.println("Using class Print hHello World ");
        Hello input = new Hello();
        input.PrintHello();
    }
}

class Hello{
    public void PrintHello(){
        System.out.println("Hello World Using Class ?");

    }
}
