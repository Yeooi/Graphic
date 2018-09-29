import javax.swing.*;

public class main{
	
	public static void main(String[] args)
	{	
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Player p = new Player();
		f.add(p);
		f.setSize(600,600);
		f.setVisible(true);
	}
}