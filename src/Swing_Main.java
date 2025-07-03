import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Calculator for Two Integer Number");
		frame.setSize(700,700);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setText("num1: ");
		label1.setBounds(0, 0, 50, 20);
		frame.add(label1);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(60, 1, 100, 20);
		frame.add(tf1);
		
		JLabel label2 = new JLabel();
		label2.setText("num2: ");
		label2.setBounds(0, 30, 50, 20);
		frame.add(label2);
		
		JTextField tf2 = new JTextField();
		tf2.setBounds(60, 30, 100, 20);
		frame.add(tf2);

		JButton bt1 = new JButton();
		bt1.setText("Add");
		bt1.setBounds(280, 60, 100, 30);
		frame.add(bt1);
		
		JButton bt2 = new JButton();
		bt2.setText("Subtraction");
		bt2.setBounds(250, 100, 150, 30);
		frame.add(bt2);
		
		JButton bt3 = new JButton();
		bt3.setText("Multiplication");
		bt3.setBounds(250, 140, 150, 30);
		frame.add(bt3);
		
		JButton bt4 = new JButton();
		bt4.setText("Divison");
		bt4.setBounds(280, 180, 100, 30);
		frame.add(bt4);
		
		JLabel label3 = new JLabel();
		label3.setBounds(5, 250, 400, 20);
		frame.add(label3);
		
		JLabel label4= new JLabel();
		label4.setBounds(5, 250, 400, 20);
		frame.add(label4);
		
		JLabel label5 = new JLabel();
		label5.setBounds(5, 250, 400, 20);
		frame.add(label5);
		
		JLabel label6 = new JLabel();
		label6.setBounds(5, 250, 400, 20);
		frame.add(label6);
		
		bt1.addActionListener(e->{
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			int sum = n1+n2;
			label3.setText("Ans = "+sum);
		});
		
		bt2.addActionListener(e->{
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			int sub = n1-n2;
			label3.setText("Ans = "+sub);
		});
		
		bt3.addActionListener(e->{
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			int multi = n1*n2;
			label3.setText("Ans = "+multi);
		});
		
		bt4.addActionListener(e->{
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			double div = n1/(n2 * 1.0);
			label3.setText("Ans = "+div);
		});
		
		frame.setVisible(true);
	}

}
