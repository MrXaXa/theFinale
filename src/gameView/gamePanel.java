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
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	/*
	  private void updateDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "SupahNut";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pokedexLabel.setIcon(pokemonIcon);
		repaint();
	}
	this could be good for figuring out how to paint the images on the individual squares
	*/
	
	
}
