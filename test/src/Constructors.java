

class Check_Constructor
{
    String name;
    Check_Constructor()
    {
        System.out.println("Constructor");
    }
    Check_Constructor(String  name)
    {
        this.name=name;
        System.out.println("Parameterised Constructor");
    }
    Check_Constructor(Check_Constructor c)
    {
        this.name=c.name;
        System.out.println("Copy Constructor");

    }
}
public class Constructors {
public static void main(String[] args) {

    //Default Contructor Called
    Check_Constructor obj = new Check_Constructor();

    //Parameterised Contrcutor
    Check_Constructor c = new Check_Constructor("Neeraj");
    System.out.println(c.name);

    //Copy Contructor
    Check_Constructor c2 = new Check_Constructor(c);
    System.out.println(c2.name);
}
}
