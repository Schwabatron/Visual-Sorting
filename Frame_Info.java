import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;





public class Frame_Info {
	
	

	public static void make_frame(JFrame window) {
		//Creating the Jframe to add visuals to 
				//Jframe = a GUI window to add components to 
				
				//JFrame window = new JFrame(); //Creates a frame 
				
				window.setVisible(true); //Make the frame visable
				
				window.setSize(700, 500); //Sets the x, y dementions 
				
				window.setTitle("Sorting Algorithm Visualizer");//Setting the name for the frame
				
				/*
				 * When using the "x" in the corner of the screen it
				 * Actually doesnt close the window but rather hides it.
				 * By altering this setting we can make it so the window
				 * actually closes when the "x" botton is pressed
				 */
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				window.setResizable(false);//Stops the user from manually resizing window
				
				//ImageIcon Name = new ImageIcon("fileName") 
				
				window.getContentPane().setBackground(new Color(168,218,222));//Setting color for the frame
				
				
				//Creating Title for the window
				JLabel title = new JLabel("Sorting Algorithm Visualizer");
				
				//Adding the text to the window
				window.add(title);
				
				//Putting the title in the center of the screen
				title.setHorizontalAlignment(JLabel.CENTER);
				
				//Putting the title near the top of the screen 
				title.setVerticalAlignment(JLabel.TOP);
				
				//Setting font and font size 
				title.setFont(new Font("Georgia", Font.PLAIN, 25));
				
						
	}
	
	
	
	
	
	
	
}
