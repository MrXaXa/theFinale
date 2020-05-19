package gameView;

import javax.swing.JFrame;
import finalController.Controller;

public class gameFrame extends JFrame
{
	private Controller app;
	private gamePanel panel;
	
	public gameFrame(Controller app)
	{
		super();
		this.app = app;
		panel = new gamePanel(this.app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setTitle("Sliding Puzzle Game");
		this.setResizable(true);
		this.setSize(800,800);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
