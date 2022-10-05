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

    public class Admin extends Functions {}

    public class User extends Functions {}

    private class Functions {
        protected int getX() {
            return x;
        }
        
        protected void setX(int _x) {
            // if (new Exception().getStackTrace()[1].getClassName().equals(Admin.class.getName()))
            // if (new Exception().getStackTrace()[1].getClass().isInstance(new Admin())) x = _x;
            StackTraceElement[] trace =  new Exception().getStackTrace();
            for (int i = 0; i < trace.length; i++) {
                java.lang.System.out.println(trace[i].getClassName());
            }
            // else throw new RuntimeException("Access Denied! ");
        }

        protected int getY() {
            return y;
        }
        
        protected void setY(int _y) {
            if (new Exception().getStackTrace()[1].getClassName().equals(Admin.class.getName()))
            y = _y;
            else throw new RuntimeException("Access Denied!");
        }
    } 
}
