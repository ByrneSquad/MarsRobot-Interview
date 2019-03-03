
package marsrover;

import marsrover.LocationInterface.Direction;
import marsrover.LocationInterface.Spot;

// This is an entity class to define our rover object //
// Also included is a list of actions the rover can perform //
public class Rover {

    // Set our location to null. //
    private Location location = null;
    


    // Here are our Orders for the Mars Rover. //
    public enum Order {

        LEFT, RIGHT, FORWARD;

        // Here are the actions taken when the order is sent through //
        // Left means the rover will rotate left 90 degrees but not move //
        // Right means the rover will rotate right 90 degrees but not move //
        // Forward means the rover will move forward whichever direction //
        // that will be as previously set.                              //
        
        private void action(Location location) {
            if (this == RIGHT) {
                location.setDirectionRight();
            } else if (this == LEFT) {
                location.setDirectionLeft();
            } else if (this == FORWARD) {
                switch (location.getDirection()) {
                    case NORTH:
                        location.getY().add();
                        break;
                    case EAST:
                        location.getX().add();
                        break;
                    case SOUTH:
                        location.getY().subtract();
                        break;
                    case WEST:
                        location.getX().subtract();
                }
            }
        }
    }  
   
    // Create our default constructor to populate our rover object //
    public Rover(Spot x, Spot y, Direction direction) {
        this.location = new Location(x, y, direction);
    }
    

    
    // So the test cases are a list of orders, so we need to store the list
    // in an array instead of typing each order through user input. //
    // We can do this with a for loop //
    // The list of orders will be inserted by the driver //
    
    public void actionOrders(Order[] order) {
            
            order[1].action(location);
      
    }
    // Simple getter to obtain current location of the rover //
    public LocationInterface getLocation() {
        return location;
    }
}
