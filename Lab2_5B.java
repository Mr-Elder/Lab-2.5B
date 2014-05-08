/**
 * @(#)Lab2_5B.java
 *
 *
 * @author 
 * @version 1.00 2013/11/6
 */
import java.text.*;

public class Lab2_5B {
	
	public static void main(String[] args){
	

    	double x1, y1, x2, y2; // coordinates of two points

        double distance;
        
        DecimalFormat format = new DecimalFormat("0.###");

        x1 = GetInfo.getDouble("Enter the x coord of the first point.");
        y1 = GetInfo.getDouble("Enter the y coord of the first point.");
          
        x2 = GetInfo.getDouble("Enter the x coord of the second point.");
        y2 = GetInfo.getDouble("Enter the y coord of the second point.");
        
        distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        
        GetInfo.showMessage("The distance between your endpoints are:\n " + format.format(distance));
	}
}