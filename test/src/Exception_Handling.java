public class Exception_Handling {

  public static void main(String[] args) {

      try{

          int b=100/0;

      }
      catch(Exception e){

          System.out.println(e);

      }
      finally {
          System.out.println("finally");

      }
  }
}
