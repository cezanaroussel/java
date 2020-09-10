
package programmingproject1;

import java.util.Scanner;

public class ProgrammingProject1 {

    
    public static void main(String[] args) {
        
        int containerType; // create a string variable for containerType 
        final double PI = 3.14; // assign PI to the value 3.14
        int radius; // create an int variable for radius
        int height; // create an int variable for height 
        int width; // create an int variable for width
        int length; // create an int variable for length
        
    
        
        System.out.println("What type of container are you filling today?");
        System.out.println("");
        System.out.println("   Please Enter '1' for Cylinder, Enter '2' for Cube, and Enter '3' for Cone. "); //print the prompt for user to enter input
        Scanner input = new Scanner(System.in); //create an object of scanner class, input from keyboard
        containerType = input.nextInt(); //call method nextLine() to take input from user
     
        if (containerType == 1) { // if user chooses '1' - use formula for cylinder 
            System.out.println(""); // whitespace for better user visibility
            System.out.println("The type of container you've chosen to fill today is a Cylinder.");
            System.out.println(""); 
            System.out.println("What is the radius? "); //prompt user to input radius 
            radius = input.nextInt(); //take input from user for radius 
            System.out.println(""); 
            System.out.println("What is the height? "); // prompt user to input height 
            height = input.nextInt(); //take input from user for height 
        
            double cylinderVolume = PI * radius * radius * height; //formula for finding the volume of a cylinder 
            System.out.println("");
            System.out.printf("The volume of the Cylinder (in gallons) is: %.2f", (cylinderVolume * 7.48052)); //Display cylinderVolume, converted from cubic ft to gallons 
            
        }
        
        
        else if (containerType == 2) { // if user chooses '2' - use formula for cube shaped container 
            System.out.println("");
            System.out.println("The type of container you've chosen to fill today is a Cube.");
            System.out.println("");
            System.out.println("What is the length? "); //prompt user to input radius 
            length = input.nextInt(); //take input from user for radius 
            System.out.println("");
            System.out.println("What is the width? "); // prompt user to input width 
            width = input.nextInt(); //take input from user for height
            System.out.println("");
            System.out.println("What is the height? "); // prompt user to input height 
            height = input.nextInt();
        
            double cubeVolume = length * width * height; //formula for finding volume of a cube 
            System.out.println("");
            System.out.printf("The volume of the Cube (in gallons) is: %.2f",(cubeVolume * 7.48052)); //Display cubeVolume, converted from cubic ft to gallons 
        
        }
        
        else if (containerType == 3) { // if user chooses '3' - executes the following 
            System.out.println(""); //whitespace 
            System.out.println("The type of container you've chosen to fill today is a Cone.");
            System.out.println("");
            System.out.println("What is the radius? ");
            radius = input.nextInt();
            System.out.println("");
            System.out.println("What is the height? ");
            height = input.nextInt();
            
            double coneVolume = PI * (radius * radius) * height / 3; //formula for finding volume of a Cone 
            System.out.println("");
            System.out.printf("The volume of the Cone (in gallons) is: %.2f", (coneVolume * 7.48052)); //Display coneVolume, converted from cubic ft to gallons 
    }
            
        else {
            System.out.println("  Please Enter '1' for Cylinder, Enter '2' for Cube, and Enter '3' for Cone.");
        }
        
    
    
   }

}
