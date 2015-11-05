import javax.swing.*;

class HelloWorldWindow
{
    public static void main(String args[])
    {
	JFrame frame = new JFrame("Hello");
	JLabel label = new JLabel(" Hello Java", JLabel.CENTER);
        frame.add(label);	
	frame.setSize(300, 300);
	frame.setVisible(true);
    }
}
