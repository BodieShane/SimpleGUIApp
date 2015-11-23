
package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;
import java.awt.event.*;
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
		firstButton = 
				new JButton("Please do not click the button");
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 41, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 116, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 41, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 116, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		this.addMouseListener(new MouseListener()
	{
		public void mouseClicked(MouseEvent click)
		{
			
		}
		
		public void mouseRelease(MouseEvent released)
		{
			
		}
		
		public void mousePressed(MouseEvent pressed)
		{
			
		}
		
	
		public void mousEntered(MouseEvent enterd)
		{
			
		}
		
		public void mouseExited(MouseEvent exited)
		{
			
		}
	});
	}
	
	
	
}
