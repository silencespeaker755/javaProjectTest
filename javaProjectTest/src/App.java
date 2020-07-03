class game {
    private String name = "Jason";

    public String getName() {
        return this.name;
    }
}

public class App {
    public static void main(String[] aStrings) throws Exception {
        System.out.println("Hello, World!");
        try{
            game game1 = new game();
            System.out.println(game1.getName());
        }finally{
            Dice aDice = new Dice();
            System.out.println(aDice.throwDice());
            System.out.println("Finish !");
        }
    }
}
