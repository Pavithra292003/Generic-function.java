public class GenericFunction{
     static <r> void display(r input) {
         System.out.println(input.getClass().getName() + "=" + input);
     }
    public static void main(String args[]) {
         display(2.5);
    display(10);
    display("OOTY");

    }
}