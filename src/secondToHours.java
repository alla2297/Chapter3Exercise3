import java.util.Scanner;

public class secondToHours {


        public static void main(String[] args) {
            //write your code here
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;
           // while (!exit) {
                int time = scanner.nextInt();
                int hour = time/3600;
                int minutes = (time % 3600)/60;
                int second = ( time % 3600 %60 );
                System.out.println(hour);
            System.out.println(minutes);
            System.out.println(second);




            }

    }


