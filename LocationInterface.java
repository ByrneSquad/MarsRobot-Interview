package marsrover;

public interface LocationInterface {

    // Quick class for interface to hold a spot on the Mars Grid //
    // Also gives the ability to add/subtract from the location value //
    public static class Spot {

        int dot = 0;

        public Spot(int dot) {
            this.dot = dot;
        }

        void subtract() {
            dot--;
        }

        void add() {
            dot++;
        }

        public int getSpot() {
            return dot;
        }
    }

    // Now we are going to define our Directions North, East, South, West as Enums. //
    // We want to override the Directions to associate the paths left and right
    // of our current location. Basically we are defining the directions left
    // and right of our current forward facing direction.//
    public enum Direction {

        NORTH {
            @Override
            public Direction left() {
                return WEST;
            }

            @Override
            public Direction right() {
                return EAST;
            }
        },
        EAST {
            @Override
            public Direction left() {
                return NORTH;
            }

            @Override
            public Direction right() {
                return SOUTH;
            }
        },
        SOUTH {
            @Override
            public Direction left() {
                return EAST;
            }

            @Override
            public Direction right() {
                return WEST;
            }
        },
        WEST {
            @Override
            public Direction left() {
                return SOUTH;
            }

            @Override
            public Direction right() {
                return NORTH;
            }
        };

        public abstract Direction left();

        public abstract Direction right();

        public String whereTo(Direction d) {
            //
            String directing= "";
            switch(d){
                case NORTH:
                   directing = "NORTH";
                   break;
            }
            return directing;
        }

    }

    // We need some getters to get data from our other classes //
    // These three methods will be written in Location.java //
    public Direction getDirection();

    public Spot getX();

    public Spot getY();

    @Override
    public String toString();
}
