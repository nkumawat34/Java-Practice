
class Name
{
    private String name;

    public String getname()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}


public class Encapsulation {

    public  static void main(String args[]) {
        Name name = new Name();
        name.setName("Neeraj");
        System.out.println(name.getname());

    }

}
