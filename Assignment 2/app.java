// Name: Nadia Sapano
// Applied Math Major, Business, Econ, Data Science Minors 
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //SATC Themed Game! 
        int score =0; 
        // Question 1 
        System.out.println("How old is Carrie in season one of SATC?");
        int age = sc.nextInt();
        if (age == 32){
            System.out.println("Correct! She is 32.");
            score = score + 1; 
        }
        else{
            System.out.println("Incorrect! She is 32");
        }
        // Question 2 
        System.out.println("How many kids does Miranda have?");
        int kids = sc.nextInt();
        if (kids == 1){
            System.out.println("Correct! She has 1 son named Brady");
            score = score + 1;
        }
        else{
            System.out.println("Incorrect! She has 1 son");
        }
        // Question 3 
        System.out.println("How many husbands has Charlotte had?");
        int husbands = sc.nextInt();
        if (husbands == 2) {
            System.out.println("Correct She had 2 husbands");
            score = score + 1;
        }
        else if (husbands < 2 ){
            System.out.println("Incorrect! She married Trey and then Harry");
        }
        else {
            System.out.println("Incorrect! She only had 2 husbands");
        }
        // Final Score 
        System.out.println("Your final score is " + score + " out of 3, congratulations");

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else if (var1<4){
            System.out.println("Var1 is less than 4");
        }
        else{
            System.out.println("Var1 is 4");
        }

        int var2 = 6;
        if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else if (var2 <= 5){
            System.out.println("Var2 is less than or equal to 5");
        } else{
            System.out.println("Var2 is 6");
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else if (var3 < 10){
            System.out.println("Var3 is less than 10");
        }
        else{ 
            System.out.println("Var3 is 10");
        }




        //for this section: why are we not entering the if statement?
        String school = "Marist";
        if (school.equals("marist") || school.equals("Marist")){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }
    }
 }
