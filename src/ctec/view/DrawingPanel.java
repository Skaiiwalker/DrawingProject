package ctec.view;

import javax.swing.*;

import ctec.controller.*;

import java.awt.event.*;
import java.awt.*;

import ctec.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel;
	private JButton addRectangleButton;
	private JButton addSquareButton;
	private JButton addTriangleButton;
	private JButton addCircleButton;
	private JButton addEllipseButton;
	private JButton addPolygonButton;
	private JButton clearButton;
	private JButton seizureButton;
	public Boolean seizure;
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
		
		addRectangleButton = new JButton("Draw a rectangle");
		addSquareButton = new JButton("Draw a square");
		addTriangleButton = new JButton("Draw a triangle");
		addCircleButton = new JButton("Draw a circle");
		addEllipseButton = new JButton("Draw an ellipse");
		addPolygonButton = new JButton("Draw a polygon");
		clearButton = new JButton("Clear the board");
		seizureButton = new JButton("Seizure Warning");
		
		seizure = new Boolean(false);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(shapePanel);
		this.add(addRectangleButton);
		this.add(addSquareButton);
		this.add(addTriangleButton);
		this.add(addCircleButton);
		this.add(addEllipseButton);
		this.add(addPolygonButton);
		this.add(clearButton);
		this.add(seizureButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, seizureButton, 0, SpringLayout.NORTH, clearButton);
		baseLayout.putConstraint(SpringLayout.EAST, seizureButton, -6, SpringLayout.WEST, clearButton);
		baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addRectangleButton, -6, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.WEST, addSquareButton, 6, SpringLayout.EAST, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, addSquareButton, -6, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.NORTH, addTriangleButton, 0, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, addTriangleButton, 6, SpringLayout.EAST, addSquareButton);
		baseLayout.putConstraint(SpringLayout.WEST, addCircleButton, 6, SpringLayout.EAST, addTriangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, addCircleButton, -6, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.WEST, addEllipseButton, 6, SpringLayout.EAST, addCircleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, addEllipseButton, -6, SpringLayout.NORTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.NORTH, addPolygonButton, 0, SpringLayout.NORTH, addRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, addPolygonButton, 6, SpringLayout.EAST, addEllipseButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, clearButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -50, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		addRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});
		
		addSquareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addSquare();
				repaint();
			}
		});
		
		addTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangle();
				repaint();
			}
		});
		
		addCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircle();
				repaint();
			}
		});
		
		addEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
		});
		
		addPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		});
		
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.clear();
				repaint();
			}
		});
		
		seizureButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(seizure == false)
				{
					seizure = true;
				}
				else
				{
					seizure = false;
				}
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(seizure == true)
				{
					shapePanel.addRandom();
					repaint();
				}
			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				
			}
		});
	}
}
