import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name = input.next();
    System.out.println("Hi " + name + "! I'm Javabot. Where are you from?");
    String from = input.next();
    System.out.println("I hear it's beautiful at " + from + "! I'm from a place called Oracle. How old are you?");
    int age = input.nextInt();
    System.out.println("So you are " + age + ", cool! I'm 400 years old.");
    int divide = 400 / age;
    System.out.println("This means I'm " + divide + " times older than you.");
    System.out.println("Enough about me. What's your favourite language? (just don't say Python😂)");
    String lang = input.next();
    System.out.println(lang + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
  }
}