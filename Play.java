 
import java.io.*;
class Play
{
    public static void Play_The_Game()
    {
        try
        {
            Question_Hour obj=new Question_Hour();
            obj.drawing();
            obj.call();
            obj.play();
            System.out.println("The Rules:-");
            obj.call();
            System.out.println();
            obj.rules();
            System.out.println();
            obj.call();
            System.out.println();
            obj.random1();
            obj.Switch();
            obj.bal+=1000;
            System.out.println("Your balance Rs."+obj.bal);
            System.out.println();
            if(obj.v==0)
            {
                obj.random2();
                obj.Switch();
                obj.bal+=1000;
                System.out.println("Your balance Rs."+obj.bal);
            }
        }
        catch(Exception ex)
        {
            System.out.println("\nError.\nFollow the instructions properly and play again.");
        }
    }
}
        
