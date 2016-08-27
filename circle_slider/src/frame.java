package circle;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class frame extends JFrame {
	
	private JSlider slider;
	private draw myPanel;
	
	public frame(){
		super("GUI");
		myPanel = new draw();
		myPanel.setBackground(Color.BLACK);
		
		slider = new JSlider(SwingConstants.HORIZONTAL , 0 , 200 , 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setd(slider.getValue());
						
					}
				}
		);
		add(slider , BorderLayout.SOUTH);
		add(myPanel , BorderLayout.CENTER);
	}
	
}
