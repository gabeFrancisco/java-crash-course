import entities.Product;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

// OOP 1 ----------------------------------------------------------
        // Solving problem without OOP
//      double xA, xB, xC, yA, yB, yC;

        // Now with OOP and Triangle class

//        Triangle x, y;
//
//        x = new Triangle();
//        y = new Triangle();
//
//        System.out.println("Enter the measures of triangle X: ");
//        x.a = sc.nextDouble();
//        x.b = sc.nextDouble();
//        x.c = sc.nextDouble();
//
//        System.out.println("Enter the measures of triangle X: ");
//        y.a = sc.nextDouble();
//        y.b = sc.nextDouble();
//        y.c = sc.nextDouble();
//
//        double areaX = x.getArea();
//        double areaY = y.getArea();
//
//        System.out.printf("Triangle X area: %.4f%n", areaX);
//        System.out.printf("Triangle Y area: %.4f%n", areaY);
//
//        if(areaX > areaY){
//            System.out.println("Larger area: X");
//        }
//        else{
//            System.out.println("Larger area: Y");
//        }

// OOP 2 -----------------------------------------------------------------------

//        Product product = new Product();
//
//        System.out.println("Enter product data");
//        System.out.print("Name: ");
//        product.name = sc.nextLine();
//
//        System.out.print("Price: ");
//        product.price = sc.nextDouble();
//
//        System.out.print("Quantity: ");
//        product.quantity = sc.nextInt();
//
//        System.out.println(product.toString());
//
//        int value = menu(sc);
//
//        if(value == 1){
//            product.addProducts(1);
//            System.out.println(product.toString());
//        }
//        else if(value == 2){
//            product.removeProducts(1);
//            System.out.println(product.toString());
//        }
//        else{
//            System.out.println("Select a number between 1 and 2!");
//        }
//
//        value = menu(sc);
//
        // VECTORS -------------------------------------------------------------------------------//
        System.out.println("Type the array size below:");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }

        for (double v : vect) {
            System.out.println(v);
        }

        sc.close();
    }

    public static int menu(Scanner sc) {
        System.out.println("Select an option:\n1 - ADD\n2 - SUBTRACT\n");
        int value = sc.nextInt();

        if (value > 2 || value < 1) {
            return 0;
        }

        return value;
    }
}