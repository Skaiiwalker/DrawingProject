package ctec.view;

import javax.swing.*;
import ctec.controller.DrawingController;

/**
 * @author lbar8299
 * @version 0.x May 27, 2016
 */

public class DrawingFrame extends JFrame
{
	private DrawingPanel basePanel;
	private DrawingController baseController;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Drawing stuff in Java");
		this.setSize(800,800);
		this.setVisible(true);
	}
}
