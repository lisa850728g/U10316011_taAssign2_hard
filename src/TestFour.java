import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class TestFour{
	JRadioButton jrtA = new JRadioButton("A : synthetic", false);
	JRadioButton jrtB = new JRadioButton("B : tremendous", false);
	JRadioButton jrtC = new JRadioButton("C : democratic", false);
	JRadioButton jrtD = new JRadioButton("D : rigid", false);
	JTextField jtfScore = new JTextField(8);
	JButton jbtAnswer = new JButton("Answer");
	
	TestFour(){
		ButtonGroup group = new ButtonGroup();
		group.add(jrtA);
		group.add(jrtB);
		group.add(jrtC);
		group.add(jrtD);
	}
	
	public JPanel body(){
		JPanel body = new JPanel();
		body.setLayout(new GridLayout(3,1));
		body.setSize(350,300);
		body.setBorder(new TitledBorder("第 4 題 / 第 10 題"));
		body.add(new JLabel("Question : "));
		body.setBackground(Color.WHITE);
		body.add(new JLabel("The famous opera singer was greeted with _____ "));
		body.add(new JLabel("applause."));
		
		return body;
	}
	
	public JPanel choose(){
		JPanel choose = new JPanel();
		choose.setSize(200,200);
		choose.setLayout(new GridLayout(4,1));
		choose.add(jrtA);
		choose.add(jrtB);
		choose.add(jrtC);
		choose.add(jrtD);
		
		return choose;
	}
	
	public JPanel answer(){
		JPanel answer = new JPanel();
		answer.add(new JLabel("Score : "));
		answer.add(jtfScore);
		answer.add(jbtAnswer);
		
		return answer;
	}
}