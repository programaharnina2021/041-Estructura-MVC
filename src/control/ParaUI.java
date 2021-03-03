package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.UI;

public class ParaUI extends UI {
	Controlador controlador=new Controlador();
	public ParaUI() {
		super();
		getBtnHaz().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controlador.hazAlgo();
			}
		});
	}
	
}
