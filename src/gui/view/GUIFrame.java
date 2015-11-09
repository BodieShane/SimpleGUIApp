package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;
import gui.view.GUIPanel;
/**
 * 
 * @author bsha6756
 *@version 0.2 Nov 9, 2015 updated the setupFrame to load the content Pane
 */

public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel (baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Silly app!!");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
	
}
