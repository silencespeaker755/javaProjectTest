abstract class Person {
    protected String fname = "Apple";
    protected String lname = "Banana";
    protected String email = "We@re.pipneapple";
    protected int age = 18;
    protected abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Player extends Person {
    public int graduationYear = 2021;

    public void study() {
      System.out.println("Playing all day long");
    }

    public void setName(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }
  }