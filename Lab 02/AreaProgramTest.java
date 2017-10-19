/*
 *Steven Ramirez
 *ECE 251
 *Lab 02
 */
 
import javax.swing.JOptionPane;
public class AreaProgramTest {
    public static void main(String args[]) {
        AreaProgram areaProgram = new AreaProgram( );
        JOptionPane.showMessageDialog(null, "The area is " +  
areaProgram.computeArea( ));
}
}
