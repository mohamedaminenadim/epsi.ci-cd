package cicd.learn.tp1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Messager messager = new Messager("This is the feature #002");
        System.out.println( "CI CD update - release 1.1" );
        System.out.println( "Package update - release 1.1.1" );
        System.out.println(messager.getMessage());
    }
}
