package com.gmail.quarzekk.worldstudio.ui.render.component;

/**
 * 
 * Represents a renderer that assists the major renderers such as
 * {@link StudioRenderer} and {@link WorldRenderer} by generating content such
 * as vertex and texture information.
 * 
 */
public interface IComponentRenderer {
	
	/**
	 * Initializes the renderer. All, if any, initialization routines are
	 * performed here.
	 */
	public void initialize();
	
}
