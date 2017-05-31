package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DistanceListener  implements ActionListener{

	public static String COMMAND_CALCULATE = "COMMAND_CALCULATE_DISTANCE";
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commands.valueOf(e.getActionCommand()) ) {
		case COMMAND_CALCULATE_DISTANCE :
			System.out.println("Calcular");
			break;

		default:
			
		}
		
	}

}
