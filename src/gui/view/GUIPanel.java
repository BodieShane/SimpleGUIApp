
package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;
/**
 * @author bsha6756
 * @version 0.x nov 9,2015
 */

public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel (GUIAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField ("Words can be typed here");
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		
		this.add(firstTextField);
		this.setLayout(baseLayout);
		this.add(firstButton);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
	
}
