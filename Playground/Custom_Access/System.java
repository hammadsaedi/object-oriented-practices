package Playground.Custom_Access;

public class System {
    private int x;
    private int y;

    System(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "System [x=" + x + ", y=" + y + "]";
    }

    public class Admin extends Caller {}

    public class User extends Caller {}

    private class Caller {
        protected int getX() {
            return x;
        }
        
        protected void setX(int _x) {
            
            if (this.getClass().getName().equals(System.Admin.class.getName()))
                x = _x;
            else throw new RuntimeException("Access Denied!");
        }

        protected int getY() {
            return y;
        }
        
        protected void setY(int _y) {
            if (this.getClass().getName().equals(System.Admin.class.getName()))
                y = _y;
            else throw new RuntimeException("Access Denied!");
        }
    } 
}
