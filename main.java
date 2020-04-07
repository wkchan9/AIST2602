import javax.swing.*;
import java.awt.*;
public class main {
	public static void main(String args[]) {
		JFrame fra = new JFrame();
		gui jp = new gui();
		fra.getContentPane().add(jp);
		fra.setSize(new Dimension(520,500));
		fra.setVisible(true);
	}
}
