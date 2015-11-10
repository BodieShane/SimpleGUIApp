
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
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 100, SpringLayout.WEST, this);
		firstTextField = new JTextField ("Words can be typed here");
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 41, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 116, SpringLayout.WEST, this);
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
