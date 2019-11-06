package toe.tac.tic;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {
	JButton one, two, three, four, five, six, seven, eight, nine;
	boolean x = true;
	boolean a = true;
	boolean b = true;
	boolean c = true;
	boolean d = true;
	boolean e1 = true;
	boolean f = true;
	boolean g = true;
	boolean h = true;
	boolean i = true;
	public MyJPanel() {
		
		setLayout(null);
		one = new JButton();
		one.setBounds(0, 0, 200, 200);
		one.addActionListener(e -> {
		if(a) {
			if(x == true) {
			one.setText("X");
			x = false;
			a = false;
		}
		else {
			one.setText("O");
			x = true;
			a = false;
		}}});
		
		two = new JButton();
		two.setBounds(0, 200, 200, 200);
		two.addActionListener(e -> {
			if(b) {
				if(x == true) {
				two.setText("X");
				x = false;
				b = false;
			}
			else {
				two.setText("O");
				x = true;
				b = false;
			}}});
		
		three = new JButton();
		three.setBounds(0, 400, 200, 200);
		three.addActionListener(e -> {
			if(c) {
				if(x == true) {
				three.setText("X");
				x = false;
				c = false;
			}
			else {
				three.setText("O");
				x = true;
				c = false;
			}}});
		
		four = new JButton();
		four.setBounds(200, 0, 200, 200);
		four.addActionListener(e -> {
			if(d) {
				if(x == true) {
				four.setText("X");
				x = false;
				d = false;
			}
			else {
				four.setText("O");
				x = true;
				d = false;
			}}});
		
		five = new JButton();
		five.setBounds(200, 200, 200, 200);
		five.addActionListener(e -> {
			if(e1) {
				if(x == true) {
				five.setText("X");
				x = false;
				e1 = false;
			}
			else {
				five.setText("O");
				x = true;
				e1 = false;
			}}});
		
		six = new JButton();
		six.setBounds(200, 400, 200, 200);
		six.addActionListener(e -> {
			if(f) {
				if(x == true) {
				six.setText("X");
				x = false;
				f = false;
			}
			else {
				six.setText("O");
				x = true;
				f = false;
			}}});
		
		seven = new JButton();
		seven.setBounds(400, 0, 200, 200);
		seven.addActionListener(e -> {
			if(g) {
				if(x == true) {
				seven.setText("X");
				x = false;
				g = false;
			}
			else {
				seven.setText("O");
				x = true;
				g = false;
			}}});
		
		eight = new JButton();
		eight.setBounds(400, 200, 200, 200);
		eight.addActionListener(e -> {
			if(h) {
				if(x == true) {
				eight.setText("X");
				x = false;
				h = false;
			}
			else {
				eight.setText("O");
				x = true;
				h = false;
			}}});
		
		nine = new JButton();
		nine.setBounds(400, 400, 200, 200);
		nine.addActionListener(e -> {
			if(i) {
				if(x == true) {
				nine.setText("X");
				x = false;
				i = false;
			}
			else {
				nine.setText("O");
				x = true;
				i = false;
			}}});
	
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
	}
}
