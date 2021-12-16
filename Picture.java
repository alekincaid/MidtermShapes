
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: Alejandro Kincaid
 * @version: 12/16/2021 * 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("Christmas Tree");
        pic.setBackgroundColor("blue");

        // Draw my picture
        
        
        // wood of the tree
        Rect wood = new Rect(365, 450, 60, 90, Canvas.getColor("brown"));
        wood.makeVisible();
        
        // this object is the lower portion of the tree
        Triangle low = new Triangle(); 
        low.makeVisible();
        low.changeSize(200, 600);
        low.moveHorizontal(180);
        low.moveVertical(120); 
        
        // this object will be the middle portion of the tree
        Triangle middle = new Triangle(); 
        middle.makeVisible(); 
        middle.changeSize(150, 400); 
        middle.moveHorizontal(180);
        middle.moveVertical(60); 
        
        // this object will be the top portion of the tree
        Triangle top = new Triangle(); 
        top.makeVisible(); 
        top.changeSize(100, 200); 
        top.moveHorizontal(180); 
        top.moveVertical(0); 
        
        
        //Lights
        Circle l1 = new Circle(30, 300, 300, Canvas.getColor("red"));
        Circle l2 = new Circle(30, 350, 350, Canvas.getColor("magenta")); 
        Circle l3 = new Circle(30, 375, 250, Canvas.getColor("cyan"));
        Circle l4 = new Circle(30, 400, 400, Canvas.getColor("white"));
        Circle l5 = new Circle(30, 200, 380, Canvas.getColor("red"));  
        Circle l6 = new Circle(30, 550, 400, Canvas.getColor("cyan")); 
        Circle l7 = new Circle(30, 460, 320, Canvas.getColor("white")); 
         
        
        //new star
        Arc a1 = new Arc(356, 105, 68, 15, 45, "yellow", false);
        Arc a2 = new Arc(356, 105, 68, 75, 105, "yellow", false);
        Arc a3 = new Arc(356, 105, 68, 135, 165, "yellow", false);
        Arc a4 = new Arc(356, 105, 68, 205, 235, "yellow", false);
        Arc a5 = new Arc(356, 105, 68, 305, 335, "yellow", false);
        
        
        System.out.println("Input an even number to turn on the lights!"); 

        Scanner input = new Scanner(System.in); 
        int i = input.nextInt(); 
        if(i % 2 == 0)
        {
            l1.makeVisible(); 
            l2.makeVisible(); 
            l3.makeVisible(); 
            l4.makeVisible(); 
            l5.makeVisible(); 
            l6.makeVisible(); 
            l7.makeVisible(); 
        }
        else if(i % 2 != 0)
        {
            l1.makeInvisible();
            l2.makeInvisible();
            l3.makeInvisible();
            l4.makeInvisible();
            l5.makeInvisible();
            l6.makeInvisible();
            l7.makeInvisible();
        }
        System.out.println("Now input an odd number to make the star light up!");
        Scanner input2 = new Scanner(System.in);
        int i2 = input2.nextInt();
        if(i2 % 2 != 0)
        {
            System.out.println("Merry Christmas!"); 
        }
        
        while(i2 % 2 != 0)
        {
            a1.makeVisible();
            a2.makeVisible();
            a3.makeVisible();
            a4.makeVisible();
            a5.makeVisible();
        }
        
        
  

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "Kincaid_XmasTree.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}