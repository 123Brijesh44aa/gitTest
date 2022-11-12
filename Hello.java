import java.util.Scanner;

public class Hello {

    private String name;

    private void name(String name) {
        this.name = name;
        System.out.println("name is : " + name);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        Hello hello = new Hello();
        hello.name(name);  
        System.out.println("your name is : "+hello.name);
        scanner.close();

        System.out.println("This is my first gitTest repository made in VS code");

        System.out.println(hello.name);

    }
}