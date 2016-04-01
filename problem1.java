import java.util.Scanner;
class  problem1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Simplify:(x+5)(x^2-9)/(x+3)(x^2-5^2)");
       String answer = scan.nextLine();
       if(answer.equals("(x-3)/(x-5)")) System.out.println("GOOD WORK");
       else System.out.println("INCORRECT, Please check with your supivisor");
                                   
    }
}