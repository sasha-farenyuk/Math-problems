import java.util.Scanner;
class problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("A______________B");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|              |");
       System.out.println("|______________|");       
       System.out.println("C              D");
       System.out.println("if line AB is 10 cm and AC is 4 then how much is the diagonal of BC?");
       double answer = scan.nextInt();
       double bc = Math.sqrt(10.0*10.0 + 4.0*4.0);
       if(answer==bc) System.out.println("GOOD WORK");
       else System.out.println("please check with your supervisor");
    }
}