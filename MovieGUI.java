import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovieGUI extends JFrame{
    public MovieGUI(){
    	this.setBounds(400,100,400,500);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setTitle("��Ӱ��Ʊϵͳ");
    	addPanel();
    }

	private void addPanel() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.WHITE);
		this.getContentPane().add(panel);
	}
	public static void main(String[] args){
		MovieGUI movieGUI=new MovieGUI();
		movieGUI.setVisible(true);
	}
}
