package ctec.view;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.util.ArrayList;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	//more arraylists here
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
	}
	
	public void addRectangle()
	{
		//random info here
		rectangleList.add(new Rectangle(10,20,50,10));
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		//draw in here!
	}
}
