import java.util.Scanner;
class problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        System.out.println("type in a string");
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='x');
             //if(str.charAt[i].equals("x"));
            count++;
        }
       System.out.println(count);
    }
}