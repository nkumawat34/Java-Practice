interface Car
{
    void engine();


}

class Maruti implements Car
{
    public void engine()
    {
        System.out.println("Maruti");
    }

}

public class Interface {

    public static void main(String[] args) {
        Car car = new Maruti();
        car.engine();
    }
}
