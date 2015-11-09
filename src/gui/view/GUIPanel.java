
package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import gui.controller.GUIAppController;
/**
 * @author bsha6756
 * @version 0.x nov 9,2015
 */

public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public GUIPanel (GUIAppController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
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
	
}
