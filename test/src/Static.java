class Check
{
    static int number=0;
    final String s = "Hi";
    static void printname()
    {
        System.out.println("Hello World");
    }
}

public class Static {
    public static void main(String[] args) {

        Check obj = new Check();
        System.out.println(obj.s);
    }
}
