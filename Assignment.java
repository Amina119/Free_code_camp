import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     Pattern pattern = Pattern.compile("n+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("@ictuniverty");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.println("Match Found");
        }
        else{
            System.out.println("Match not Found");
        }
        scanner.close();

    }
    
}
