import java.util.Scanner;

public class Seasons{
    public static String season(){
        Scanner scanner = new Scanner(System.in);
        int s= scanner.nextInt();
        if (s==3||s==4||s==5){
            return "Vesna";
        } else if (s==6||s==7||s==8) {
            return "Leto";
        } else if (s==9||s==10||s==11) {
            return "Osen";
        } else if (s==1||s==2||s==12) {
            return "Zima";
        }
 return "";   }
    }
