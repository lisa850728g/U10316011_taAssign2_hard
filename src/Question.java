import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question extends JFrame{
	JButton jbtNext = new JButton("NEXT");
	JButton jbtNext1 = new JButton("NEXT"); 
	JButton jbtNext2 = new JButton("NEXT"); 
	JButton jbtNext3 = new JButton("NEXT"); 
	JButton jbtNext4 = new JButton("NEXT"); 
	JButton jbtNext5 = new JButton("NEXT"); 
	JButton jbtNext6 = new JButton("NEXT"); 
	JButton jbtNext7 = new JButton("NEXT"); 
	JButton jbtNext8 = new JButton("NEXT");
	JButton jbtEnd = new JButton("End");
	JPanel end = new JPanel();
	JPanel score = new JPanel();
	
	int getScore = 0;

	Question(){
		TestOne testOne = new TestOne();
		add(testOne.body());
		add(testOne.choose());
		add(testOne.answer());
		add(jbtNext);
		
		testOne.jbtAnswer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(testOne.jrtD.isSelected()){
					getScore += 10;
					testOne.jtfScore.setText(String.format("%d", getScore));
				}
				else{
					testOne.jtfScore.setText(String.format("%d", getScore));
				}
			}
		});
		
		jbtNext.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestTwo testTwo = new TestTwo();
				getContentPane().add(testTwo.body());
				getContentPane().add(testTwo.choose());
				getContentPane().add(testTwo.answer());
				
				testTwo.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext1);
				
				testTwo.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testTwo.jrtC.isSelected()){
							getScore += 10;
							testTwo.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testTwo.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestThree testThree = new TestThree();
				getContentPane().add(testThree.body());
				getContentPane().add(testThree.choose());
				getContentPane().add(testThree.answer());
				
				testThree.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext2);
				
				testThree.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testThree.jrtA.isSelected()){
							getScore += 10;
							testThree.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testThree.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestFour testFour = new TestFour();
				getContentPane().add(testFour.body());
				getContentPane().add(testFour.choose());
				getContentPane().add(testFour.answer());
				
				testFour.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext3);
				
				testFour.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testFour.jrtB.isSelected()){
							getScore += 10;
							testFour.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testFour.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestFive testFive = new TestFive();
				getContentPane().add(testFive.body());
				getContentPane().add(testFive.choose());
				getContentPane().add(testFive.answer());
				
				testFive.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext4);
				
				testFive.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testFive.jrtD.isSelected()){
							getScore += 10;
							testFive.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testFive.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestSix testSix = new TestSix();
				getContentPane().add(testSix.body());
				getContentPane().add(testSix.choose());
				getContentPane().add(testSix.answer());
				
				testSix.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext5);
				
				testSix.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testSix.jrtC.isSelected()){
							getScore += 10;
							testSix.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testSix.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestSeven testSeven = new TestSeven();
				getContentPane().add(testSeven.body());
				getContentPane().add(testSeven.choose());
				getContentPane().add(testSeven.answer());
				
				testSeven.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext6);
				
				testSeven.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testSeven.jrtA.isSelected()){
							getScore += 10;
							testSeven.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testSeven.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestEight testEight = new TestEight();
				getContentPane().add(testEight.body());
				getContentPane().add(testEight.choose());
				getContentPane().add(testEight.answer());
				
				testEight.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext7);
				
				testEight.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testEight.jrtD.isSelected()){
							getScore += 10;
							testEight.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testEight.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestNine testNine = new TestNine();
				getContentPane().add(testNine.body());
				getContentPane().add(testNine.choose());
				getContentPane().add(testNine.answer());
				
				testNine.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtNext8);
				
				testNine.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testNine.jrtB.isSelected()){
							getScore += 10;
							testNine.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testNine.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtNext8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				TestTen testTen = new TestTen();
				getContentPane().add(testTen.body());
				getContentPane().add(testTen.choose());
				getContentPane().add(testTen.answer());
				
				testTen.jtfScore.setText(String.format("%d", getScore));
				
				getContentPane().add(jbtEnd);
				
				testTen.jbtAnswer.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						if(testTen.jrtB.isSelected()){
							getScore += 10;
							testTen.jtfScore.setText(String.format("%d", getScore));
						}
						else{
							testTen.jtfScore.setText(String.format("%d", getScore));
						}
					}
				});
		
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
		
		jbtEnd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getContentPane().removeAll();
				end.add(new JLabel("Thank you for testing these tests"));
				score.add(new JLabel("Your score in total is : " + getScore));
				getContentPane().add(end);
				getContentPane().add(score);
				getContentPane().validate();
				getContentPane().repaint();
			}
		});
	}
		
	public static void main(String[] args){
		Question frame = new Question();
		frame.setTitle("U10316011_question");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	  	frame.setSize(340,300);
	    frame.setVisible(true);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING));
	}
}