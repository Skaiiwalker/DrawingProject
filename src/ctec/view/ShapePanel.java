package ctec.view;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		triangleList = new ArrayList<Polygon>();
		circleList = new ArrayList<Ellipse2D>();
		ellipseList = new ArrayList<Ellipse2D>();
		polygonList = new ArrayList<Polygon>();
		
	}
	
	public void addRectangle()
	{
		int xPosition = (int)(Math.random() * getWidth());
		int yPosition = (int)(Math.random() * getHeight());
		int width = (int)(Math.random() * 250) + 50;
		int height = (int)(Math.random() * 250) + 50;
		
		Rectangle rectangle = new Rectangle(xPosition, yPosition, width, height);
		rectangleList.add(rectangle);
	}
	
	public void addSquare()
	{
		int xPosition = (int)(Math.random() * getWidth());
		int yPosition = (int)(Math.random() * getHeight());
		int side = (int)((Math.random() * 200) + 50);
		
		Rectangle square = new Rectangle(xPosition, yPosition, side, side);
		squareList.add(square);
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int [3];
		int [] yPoints = new int [3];
		
		for(int sides = 0; sides < 3; sides ++)
		{
			xPoints[sides] = (int)(Math.random() * getWidth());
			yPoints[sides] = (int)(Math.random() * getHeight());
		}
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
	}
	
	public void addCircle()
	{
		int xPoint = (int)(Math.random() * getWidth());
		int yPoint = (int)(Math.random() * getHeight());
		int diameter = (int)((Math.random() * 300) + 50);
		
		Ellipse2D circle = new Ellipse2D.Double(xPoint, yPoint, diameter, diameter);
		circleList.add(circle);
	}
	
	public void addEllipse()
	{
		int xPoint = (int)(Math.random() * getWidth());
		int yPoint = (int)(Math.random() * getHeight());
		int xDiameter = (int)((Math.random() * 250) + 50);
		int yDiameter = (int)((Math.random() * 250) + 50);

		
		Ellipse2D ellipse = new Ellipse2D.Double(xPoint, yPoint, xDiameter, yDiameter);
		ellipseList.add(ellipse);
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)((Math.random() * 7) +3);
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * getWidth());
			yPoints[sides] = (int)(Math.random() * getHeight());
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	public void addRandom()
	{
		int choice = (int)(Math.random() * 6);
		
		if(choice == 0)
		{
			int xPosition = (int)(Math.random() * getWidth());
			int yPosition = (int)(Math.random() * getHeight());
			int width = (int)(Math.random() * 250) + 50;
			int height = (int)(Math.random() * 250) + 50;
			
			Rectangle rectangle = new Rectangle(xPosition, yPosition, width, height);
			rectangleList.add(rectangle);
		}
		
		if(choice == 1)
		{
			int xPosition = (int)(Math.random() * getWidth());
			int yPosition = (int)(Math.random() * getHeight());
			int side = (int)((Math.random() * 200) + 50);
			
			Rectangle square = new Rectangle(xPosition, yPosition, side, side);
			squareList.add(square);
		}
		
		if(choice == 2)
		{
			int [] xPoints = new int [3];
			int [] yPoints = new int [3];
			
			for(int sides = 0; sides < 3; sides ++)
			{
				xPoints[sides] = (int)(Math.random() * getWidth());
				yPoints[sides] = (int)(Math.random() * getHeight());
			}
			
			Polygon triangle = new Polygon(xPoints, yPoints, 3);
			triangleList.add(triangle);
		}
		
		if(choice == 3)
		{
			int xPoint = (int)(Math.random() * getWidth());
			int yPoint = (int)(Math.random() * getHeight());
			int diameter = (int)((Math.random() * 300) + 50);
			
			Ellipse2D circle = new Ellipse2D.Double(xPoint, yPoint, diameter, diameter);
			circleList.add(circle);
		}
		
		if(choice == 4)
		{
			int xPoint = (int)(Math.random() * getWidth());
			int yPoint = (int)(Math.random() * getHeight());
			int xDiameter = (int)((Math.random() * 250) + 50);
			int yDiameter = (int)((Math.random() * 250) + 50);

			
			Ellipse2D ellipse = new Ellipse2D.Double(xPoint, yPoint, xDiameter, yDiameter);
			ellipseList.add(ellipse);
		}
		
		if(choice == 5)
		{
			int numberOfSides = (int)((Math.random() * 7) +3);
			int [] xPoints = new int [numberOfSides];
			int [] yPoints = new int [numberOfSides];
			
			for (int sides = 0; sides < numberOfSides; sides++)
			{
				xPoints[sides] = (int)(Math.random() * getWidth());
				yPoints[sides] = (int)(Math.random() * getHeight());
			}
			
			Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
			polygonList.add(myPolygon);
		}
	}
	
	public void clear()
	{
		rectangleList.clear();
		squareList.clear();
		triangleList.clear();
		circleList.clear();
		ellipseList.clear();
		polygonList.clear();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		//Loops to do lists.
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		
		for(Rectangle current : rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize= (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(current);
		}
		
		for(Rectangle square : squareList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize= (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(square);
		}
		
		for(Polygon triangle : triangleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize= (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(triangle);
		}
		
		for(Ellipse2D circle : circleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize= (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(circle);
		}
		
		for(Ellipse2D ellipse : ellipseList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize= (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(ellipse);
		}
		
		for(Polygon current : polygonList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			int pencilSize = (int)(Math.random() * 15) + 5;
			
			mainGraphics.setColor(new Color(red, green, blue));
			mainGraphics.setStroke(new BasicStroke(pencilSize));
			mainGraphics.fill(current);
		}
	}
}
