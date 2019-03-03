package marsrover;

// This is an entity class to implement the LocationInterface //
// Manages the values of x,y and direction for our grid. //
// Defines the location object //
public class Location implements LocationInterface {

    // We set all variables to null. Values will be set by our driver
    // via our setters //
    private Spot x = null;
    private Spot y = null;
    private Direction direction = null;
    private Direction startDirection = direction;
   
    //Define our default constructor to populate our object//
    // Do not allow x,y or direction to have a null value at this point. //
    // Logically the rover wouldnt be anywhere on Mars if thats the case. //
    public Location(Spot x, Spot y, Direction direction) {
        if (x == null || y == null || direction == null) {
            throw new IllegalArgumentException("x,y or direction cannot be null.");
        }
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    // Our 3 methods defined from LocationInterface.java //
    @Override
    public Direction getDirection() {
        return direction;
    }

    @Override
    public Spot getX() {
        return x;
    }

    @Override
    public Spot getY() {
        return y;
    }

    // A couple of abstract methods as defined in LocationInterface.java //
    // A couple of setters used by our driver to set data in this class //
    void setDirectionLeft() {
        direction = direction.left();
    }

    void setDirectionRight() {
        direction = direction.right();
    }
    
    void setDirection(Direction direction) {
        direction = this.direction;
    }


    @Override
    public String toString() {
        return getX().getSpot() + "  " + getY().getSpot() + "  "
                + getDirection().name();
    }
}
