package Playground.Custom_Access;

public class Main {
    public static void main(String[] args) {        
        System system = new System(0, 0);
        System.Admin admin = system.new Admin();
        System.User user = system.new User();
        
        admin.setX(14);
        java.lang.System.out.println("X: " + user.getX());

        try {
            user.setY(19);
        } catch (RuntimeException e){
            java.lang.System.out.println(e);
        }

        java.lang.System.out.println("Y: " + user.getY());
    }
}
