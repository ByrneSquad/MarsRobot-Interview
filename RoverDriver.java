package marsrover;

import java.util.Arrays;
import marsrover.LocationInterface;
import marsrover.Rover;
import marsrover.LocationInterface.Direction;
import marsrover.Rover.Order;
import java.util.Scanner;

// RoverDriver is our driver class. This is where all the action will occur.
// We can place our test cases into this class to make sure the program does 
// what we want it to 
public class RoverDriver {

    public static void main(String[] args) {

        // Our test cases will go here //
        // The compiler will give us the output results //
        int boardheight;
        int boardwidth;

        int startX;
        int startY;
        String startDirection;
        String decision;
        String strCommand;

        Scanner keyboard = new Scanner(System.in);
        Grid mars = new Grid();

        System.out.println("Enter the size of the board");

        System.out.println("Enter Height with space then Width.");
        System.out.println("Format would be (width, height).");
        boardheight = keyboard.nextInt();
        boardwidth = keyboard.nextInt();

        mars.setGridHeight(boardheight);
        mars.setGridWidth(boardwidth);

        System.out.println("Enter a starting point followed by a starting direction.");
        System.out.println("North = N, East = E, South = S, West = W");
        System.out.println("Format would be ('x','y',starting direction).");

        startX = keyboard.nextInt();
        startY = keyboard.nextInt();
        startDirection = keyboard.next();
        //make input to upper case and add a default for the switch for error trapping.
        switch (startDirection) {
            case "N":
                // marsrover.LocationInterface.Direction.valueOf(Direction.whereTo(NORTH));
          
                break;
            case "E":
                startDirection = "EAST";
                break;
            case "S":
                startDirection = "SOUTH";
                break;
            case "W":
                startDirection = "WEST";
                break;
        }

        System.out.println("Enter a list of Commands: ");
        System.out.println("Enter Commands");
        System.out.println("Forward = M, Left = L, Right = R");

        Rover audi = new Rover(new LocationInterface.Spot(startX), new LocationInterface.Spot(startY),
                marsrover.LocationInterface.Direction.valueOf(startDirection));
        
        strCommand = keyboard.nextLine();
        strCommand = strCommand.toUpperCase();
        char commandHolder;
        for (int i = 0; i < strCommand.length(); i++) {
            commandHolder = strCommand.charAt(i);
            //error W
            switch(commandHolder){
                case 'L':
                    audi.actionOrders(new Order[]{Order.LEFT});
                    break;
                case 'R':
                    audi.actionOrders(new Order[]{Order.RIGHT});
                    break;
                case 'M':
                    audi.actionOrders(new Order[]{Order.FORWARD});
                    break;
                default:
                    //error trapping.
                    break;
            }
           
        }



        // Test Case 1 //
//        Rover bentley = new Rover(new LocationInterface.Spot(1),
//                new LocationInterface.Spot(2), marsrover.LocationInterface.Direction.NORTH);
//        
//        bentley.actionOrders(new Order[]{Order.LEFT, Order.FORWARD, Order.LEFT, Order.FORWARD, Order.LEFT, Order.FORWARD,
//            Order.LEFT, Order.FORWARD, Order.FORWARD});
//        System.out.println(bentley.getLocation());
        // Test Case 2 //
//        Rover mercedes = new Rover(new LocationInterface.Spot(3),
//                new LocationInterface.Spot(3), marsrover.LocationInterface.Direction.EAST);
//        
//        mercedes.actionOrders(new Order[]{Order.FORWARD, Order.FORWARD, Order.RIGHT, Order.FORWARD, Order.FORWARD, Order.RIGHT,
//            Order.FORWARD, Order.RIGHT, Order.RIGHT, Order.FORWARD});
//        System.out.println(mercedes.getLocation());
        System.out.println("");
        System.out.println("Output: ");
        System.out.println("Board Dimensions: " + mars.getGridHeight() + " " + mars.getGridWidth());
        System.out.println("Direction: " + startDirection);

        System.out.println("Commands: ");
//        for (int i = 0; i < charCommand.length; i++) {
//            System.out.print(charCommand[i] + " ");
//        }

        System.out.println("");
        System.out.println("");
        System.out.println(audi.getLocation());
        System.out.println("");

        System.out.println(strCommand);

    }

}
