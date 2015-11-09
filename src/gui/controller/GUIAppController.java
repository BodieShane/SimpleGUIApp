package gui.controller;

import gui.view.GUIFrame;
/**
 * AppController for the Simple GUI Application
 * @author bsha6756
 *@version 0.x nov 9,2015
 */


public class GUIAppController
{
	private GUIFrame baseFrame;
	
	public GUIAppController()
	{
		baseFrame = new GUIFrame(this);
	}

	public void start()
	{}
}
