package behavioral.command.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The test class or client */
public class PressSwitch {
   public static void main(final String[] arguments) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       System.out.println("Enter your value:"); 
       String str = br.readLine(); 

      final Light lamp = new Light();
	  
      final Command switchUp = new FlipUpCommand(lamp);
      final Command switchDown = new FlipDownCommand(lamp);

      final Switch mySwitch = new Switch();

      switch(str) {
         case "ON":
            mySwitch.storeAndExecute(switchUp);
            break;
         case "OFF":
            mySwitch.storeAndExecute(switchDown);
            break;
         default:
            System.err.println("Argument \"ON\" or \"OFF\" is required.");
            System.exit(-1);
      }
   }
}