import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.math.*;

class SurfaceInterface extends JFrame implements ActionListener {
	
	static JFrame window;
    static JTextField entry;
    
    String firstNumber, output, equalizer;
    
    public static void main(String args[]){
    	
    	SurfaceInterface main = new SurfaceInterface();
    	window = new JFrame("Scientific Calculator");
    	
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	JPanel subSection = new JPanel();
    	
    	
    	
    	
    	
    	entry = new JTextField(16);
    	entry.setEditable(false);
    	entry.setText("Yaschika");
    	
    	JButton one, two, three, four, five, six, seven, eight, nine, zero;
    	
    	one = new JButton("1");
    	subSection.add(one);
    	one.addActionListener(main);
    	
        two = new JButton("2");
        subSection.add(two);
        two.addActionListener(main);
        
        three = new JButton("3");
        subSection.add(three);
        three.addActionListener(main);
        
        four = new JButton("4");
        subSection.add(four);
        four.addActionListener(main);
        
        five = new JButton("5");
        subSection.add(five);
        five.addActionListener(main);
        
        six = new JButton("6");
        subSection.add(six);
        six.addActionListener(main);

        seven = new JButton("7");
        subSection.add(seven);
        seven.addActionListener(main);

        eight = new JButton("8");
        subSection.add(eight);
        eight.addActionListener(main);

        nine = new JButton("9");
        subSection.add(nine);
        nine.addActionListener(main);
        
        zero = new JButton("0");
        subSection.add(zero);
        zero.addActionListener(main);

        JButton equals, add, subtract, multiply, divide;
        
    	equals = new JButton ("=");
    	subSection.add(equals);
    	equals.addActionListener(main);
    	
    	add = new JButton("+");
    	subSection.add(add);
    	add.addActionListener(main);
    	
    	subtract = new JButton ("-");
    	subSection.add(subtract);
    	subtract.addActionListener(main);
    	
    	multiply = new JButton ("*");
    	subSection.add(multiply);
     	multiply.addActionListener(main);
     	
     	divide = new JButton ("/");
     	subSection.add(divide);
     	divide.addActionListener(main);
     	
     	
     	
     	subSection.setBackground(Color.gray);
    	window.add(subSection);
    	window.setSize(200, 220);
    	window.show();
    }
    public void clicking(ActionEvent click) {
    	
    	String input = click.getActionCommand();
    	
    	//if(input.charAt(0) >= '0' && input.charAt(0) <= '9'||input.charAt(0) == '.');
    	
    	double numbers;
    	int total1 = 0;
    	int count = 0;
    	
    	if(input.startsWith("1"||"2"||"3"||"4"||"5"||"6"||"7"||"8"||"9")) {
    		if(firstNumber.contains("+")) {
    			for(int i = count; i<input.indexOf("-"||"/"||"*"); i++) {
    				count++;
    				char temp = input.charAt(i);
    				if(Character.isDigit(temp)) {
    					double temp1 = Double.parseDouble(String.valueOf(temp));
    					total1 = total1 + temp;
    					}
    				}
    			}
    		else if(firstNumber.contains("-")) {
    			for(int i = count; i<input.indexOf("+"||"/"||"*"); i++) {
    				count++;	
    				char temp = input.charAt(i);
    				if(Character.isDigit(temp)) {
    					double temp1 = Double.parseDouble(String.valueOf(temp));
    					total1 = total1 - temp;
    					}
    				}
    			}
    		else if(firstNumber.contains("*")) {
    			for(int i = count; i<input.indexOf("-"||"/"||"+"); i++) {
    				count++;
    				char temp = input.charAt(i);
    				if(Character.isDigit(temp)) {
    					double temp1 = Double.parseDouble(String.valueOf(temp));
    					total1 = total1*temp;
    					}
    				}
    			}
    		else if(firstNumber.contains("/")) {
    			for(int i = count; i<input.indexOf("-"||"+"||"*"); i++) {
    				count++;
    				char temp = input.charAt(i);
    				if(Character.isDigit(temp)) {
    					double temp1 = Double.parseDouble(String.valueOf(temp));
    					total1 = total1/temp;
    				}
    			}
    		}
    		output = Double.toString(total1); 			
    	}
    }   

//Future updates 
    
  //JButton conexp, trig;
 	
 	//JButton expon, squared, euler, pi, log, ln;
 	
 	//JButton sine, cosine, tangent, secant, cosecant, cotangent;
 	
 	//JButton arcsine, arccosine, arctangent, arcsecant, arccosecant, arccotangent;
    
    	//if(firstNumber.startsWith("sin")) {
    	//	total = Math.sin(Double.parseDouble(firstNumber));
    	//}
        //else if(firstNumber.startsWith("cos")) {
        // total = Math.cos(Double.parseDouble(firstNumber));
        //	}
        //else if(firstNumber.startsWith("tan")) {
    	//total = Math.tan(Double.parseDouble(firstNumber));
    	//}
        //else if(firstNumber.startsWith("sec")) {
    	//total = 1/Math.cos(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("csc")) {
    	//total = 1/Math.sin(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("cot")) {
    	//total = 1/Math.tan(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arcsin")) {
    	//total = Math.asin(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arccos")) {
    	//total = Math.acos(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arctan")) {
    	//total = Math.atan(Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arcsec")) {
    	//total = Math.acos(1/Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arccsc")) {
    	//total = Math.asin(1/Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("arccot")) {
    	//total = Math.atan(1/Double.parseDouble(firstNumber));
    	//}
    	//else if(firstNumber.startsWith("ln")) {
    	//total = Math.log(Double.parseDouble(firstNumber));
    	//}		

}