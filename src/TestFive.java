import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class TestFive{
	JRadioButton jrtA = new JRadioButton("A : categories", false);
	JRadioButton jrtB = new JRadioButton("B : dialogues", false);
	JRadioButton jrtC = new JRadioButton("C : legends", false);
	JRadioButton jrtD = new JRadioButton("D : varieties", false);
	JTextField jtfScore = new JTextField(8);
	JButton jbtAnswer = new JButton("Answer");
	
	TestFive(){
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
		body.setBorder(new TitledBorder("第 5 題 / 第 10 題"));
		body.add(new JLabel("Question : "));
		body.setBackground(Color.WHITE);
		body.add(new JLabel("Non-native English speakers usually fail to understand"));
		body.add(new JLabel("the ___ of English spoken around the world."));
		
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