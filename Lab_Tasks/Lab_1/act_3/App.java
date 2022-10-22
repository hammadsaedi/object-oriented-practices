package Lab_Tasks.Lab_1.act_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarPart carPart = new CarPart();
        String buffer = new String();

        System.out.print("Enter Model Number: ");
        buffer = input.nextLine();
        carPart.setModelNumber(buffer);

        System.out.print("Enter Part Number: ");
        buffer = input.nextLine();
        carPart.setPartNumber(buffer);

        System.out.print("Enter Cost: ");
        buffer = input.nextLine();
        carPart.setCost(buffer);
        
        input.close();
        System.out.println();
        System.out.println(carPart);
    }    
}
