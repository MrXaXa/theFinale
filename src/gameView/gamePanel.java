package gameView;

import finalController.Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class gamePanel extends JPanel
{
	private Controller app;
	private SpringLayout appLayout;
	
	public ImageIcon iconOne;
	public ImageIcon iconTwo;
	public ImageIcon iconThree;
	public ImageIcon iconFour;
	public ImageIcon iconFive;
	public ImageIcon iconSix;
	public ImageIcon iconSeven;
	public ImageIcon iconEight;
	
	public ImageIcon iconBlank;
	
	public gamePanel(Controller app)
	{
		super();
		this.app = app;
		this.appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	//What if I got Karlson Vibe to play in the program? Funny.
	
	private void setupDropDown()
	{
		// I don't believe I need this method
	}
	
	private void setupPanel()
	{
		//We may need a button to start the game or initiate an if/else statement on the order of blocks
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		// Make sure you input commands to select a square and move it
	}
	
	
	  private void updateDisplay(String name)
	{
		String path = "/empty/imageIcons/Desktop/";
		String defaultName = "nasaIcon1";
		String extension = ".jpg";
		try
		{
			iconOne = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			iconBlank = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		repaint();
	}
	
	
}
