package UI;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Coordenate;

public class JPanelDistance extends JPanel {
	private JPanelCoordenate jPanelCoordenate;
	private JPanelCoordenate jPanelCoordenateTwo;
	private JLabel jLabelDistance;

	public JPanelDistance(String nameOne, String nameTwo,String nameThree) {
		jPanelCoordenate = new JPanelCoordenate(nameOne);
		jPanelCoordenateTwo = new JPanelCoordenate(nameTwo);
		jLabelDistance = new JLabel();
		this.jLabelDistance.setBorder(BorderFactory.createTitledBorder(nameThree));
		init();
	}

	private void init() {
		this.add(this.jPanelCoordenate);
		this.add(this.jPanelCoordenateTwo);
		this.add(this.jLabelDistance);

	}

	public void set(Coordenate coordenateOne, Coordenate coordenateTwo) {
		this.jPanelCoordenate.set(coordenateOne);
		this.jPanelCoordenateTwo.set(coordenateTwo);
		
		System.out.println(coordenateOne.getDistance(coordenateTwo));
		this.jLabelDistance.setText("" + (coordenateOne.getDistance(coordenateTwo)));
	}

	public void set() {
		this.jLabelDistance.setText(""+jPanelCoordenate.get().getDistance(jPanelCoordenateTwo.get()));
	}

	public double get() {
		return Double.parseDouble(jLabelDistance.getText());
	}

	public Coordenate getCoordenateOne() {
		return jPanelCoordenate.get();
	}

	public Coordenate getCoordenateTwo() {
		return jPanelCoordenateTwo.get();
	}

}
