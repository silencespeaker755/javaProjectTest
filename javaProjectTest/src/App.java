import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.io.*;
// import java.util.ArrayList;

class game {
    private String name = "Dice";

    public String getName() {
        return this.name;
    }
}

public class App {
    public static void main(String[] aStrings) throws Exception {
        LocalDateTime myDay = LocalDateTime.now(); //Create a date object
        DateTimeFormatter myFormattedobj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = myDay.format(myFormattedobj);
        System.out.println("Welcome, Today is " + formattedDate);
        try{
            Player playerA = new Player();
            game game1 = new game();
            Scanner myObj = new Scanner(System.in);
            String[] playerName;
            playerName = new String[2];
            System.out.println("Please enter your age:");
            int playerAge;
            playerAge = myObj.nextInt();
            if(playerAge < 18){
                System.out.println("Illegal age!");
                System.exit(0);
            }
            System.out.println("Please enter your first name:");
            playerName[0] = myObj.nextLine();  // throws the trash "\r"
            playerName[0] = myObj.nextLine();
            System.out.println("Please enter your  last name:");
            playerName[1] = myObj.nextLine();
            playerA.setName(playerAge, playerName[0], playerName[1]);
            System.out.print(playerA.fname + " " + playerA.lname + " is ");
            // ArrayList<String> members = new ArrayList<String>();
            // members.add(playerA.fname + " " + playerA.lname);
            playerA.study();
            System.out.println("Game's name is " + game1.getName());
            myObj.close();
        } catch(Exception e) {
            System.out.println("Somethong went wrong !");
            e.printStackTrace();
        }finally{
            Dice aDice = new Dice();
            System.out.println(aDice.throwDice());
            System.out.println("Finish !");
        }
    }
}
