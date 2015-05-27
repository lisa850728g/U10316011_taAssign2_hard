import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class TestNine{
	JRadioButton jrtA = new JRadioButton("A : or so ", false);
	JRadioButton jrtB = new JRadioButton("B : or something", false);
	JRadioButton jrtC = new JRadioButton("C : or otherwise", false);
	JRadioButton jrtD = new JRadioButton("D : at one time", false);
	JTextField jtfScore = new JTextField(8);
	JButton jbtAnswer = new JButton("Answer");
	
	TestNine(){
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
		body.setBorder(new TitledBorder("第 9 題 / 第 10 題"));
		body.add(new JLabel("Question : "));
		body.setBackground(Color.WHITE);
		body.add(new JLabel("I don't know Ms.Smith very well. I think she is a lawyer"));
		body.add(new JLabel(" ________."));
		
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