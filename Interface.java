import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.math.*;

class Interface extends JFrame implements ActionListener {
    
    static JFrame window;
    static JTextField bar;
    String firstNumber,number,value;
    Interface(){
        firstNumber = number = value = "";
    }
 
    public static void main(String args[]){
        window = new JFrame("Trigonomic calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 
        Interface calculator = new Interface();
        
        bar = new JTextField(16);
        
        bar.setEditable(false);
        
        JPanel choices = new JPanel();
       
        JButton sine, cosine, tangent, secant, cosecant, cotangent, arcsine, arccosine, arctangent, arcsecant, arccosecant, arccotangent, equals;
        
        sine = new JButton("sin");
        sine.addActionListener(calculator);
        choices.add(sine);
        
        cosine = new JButton("cos");
        cosine.addActionListener(calculator);
        choices.add(cosine);
        
        tangent = new JButton("tan");
        tangent.addActionListener(calculator);
        choices.add(tangent);
        
        secant = new JButton("sec");
        secant.addActionListener(calculator);
        choices.add(secant);
        
        cosecant= new JButton("csc");
        cosecant.addActionListener(calculator);
        choices.add(cosecant);
        
        cotangent = new JButton("cot");
        cotangent.addActionListener(calculator);
        choices.add(cotangent);
        
        arcsine= new JButton("arcsin");
        arcsine.addActionListener(calculator);
        choices.add(arcsine);
        
        arccosine = new JButton("arccos");
        arccosine.addActionListener(calculator);
        choices.add(arccosine);
        
        arctangent = new JButton("arctan");
        arctangent.addActionListener(calculator);
        choices.add(arctangent);
        
        arcsecant = new JButton("arcsec");
        arcsecant.addActionListener(calculator);
        choices.add(arcsecant);
        
        arccosecant = new JButton("arccsc");
        arccosecant.addActionListener(calculator);
        choices.add(arccosecant);
        
        arccotangent = new JButton("arccot");
        arccotangent.addActionListener(calculator);
        choices.add(arccotangent);
        
        equals = new JButton("=");
        equals.addActionListener(calculator);
        choices.add(equals);
        
        choices.setBackground(Color.cyan);
        
        window.add(choices);
        window.setSize(600, 800);
        window.setVisible(true);
    }

	public void actionPerformed(ActionEvent e) {
		String numbers = e.getActionCommand();
		if ((numbers.charAt(0) >= '0' && numbers.charAt(0) <= '9') || numbers.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!number.equals(""))
                value = value + numbers;
            else
                firstNumber = firstNumber + numbers;
 
            // set the value of text
            bar.setText(firstNumber + number + value);
        }
		else if (numbers.charAt(0) == 'C') {
			firstNumber = number = value = "";
            bar.setText(firstNumber + number + value);
		}
		else if(numbers.charAt(0) == '=') {
			double total = 0;
			if(firstNumber.startsWith("sin")) 
				total = Math.sin(Double.parseDouble(number));
		    
		    else if(firstNumber.startsWith("cos")) 
		        total = Math.cos(Double.parseDouble(number));
		        
		        else if(firstNumber.startsWith("tan")) 
		    	total = Math.tan(Double.parseDouble(number));

		        else if(firstNumber.startsWith("sec")) 
		    	total = 1/Math.cos(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("csc")) 
		    	total = 1/Math.sin(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("cot"))
		    	total = 1/Math.tan(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arcsin")) 
		    	total = Math.asin(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arccos")) 
		    	total = Math.acos(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arctan")) 
		    	total = Math.atan(Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arcsec")) 
		    	total = Math.acos(1/Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arccsc")) 
		    	total = Math.asin(1/Double.parseDouble(number));

		    	else if(firstNumber.startsWith("arccot")) 
		    	total = Math.atan(1/Double.parseDouble(number));
		    	
		    	else if(firstNumber.startsWith("ln")) 
		    	total = Math.log(Double.parseDouble(number));
			
			    bar.setText(firstNumber + number + "=" + total);
		    	firstNumber = Double.toString(total);
		    	number = "";
		}
		else {
			if (firstNumber.equals("") || number.equals(""))
                number = numbers;
			else {
				double total = 0;
				if(firstNumber.startsWith("sin")) 
					total = Math.sin(Double.parseDouble(number));
			    
			    else if(firstNumber.startsWith("cos")) 
			        total = Math.cos(Double.parseDouble(number));
			        
			        else if(firstNumber.startsWith("tan")) 
			    	total = Math.tan(Double.parseDouble(number));

			        else if(firstNumber.startsWith("sec")) 
			    	total = 1/Math.cos(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("csc")) 
			    	total = 1/Math.sin(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("cot"))
			    	total = 1/Math.tan(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arcsin")) 
			    	total = Math.asin(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arccos")) 
			    	total = Math.acos(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arctan")) 
			    	total = Math.atan(Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arcsec")) 
			    	total = Math.acos(1/Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arccsc")) 
			    	total = Math.asin(1/Double.parseDouble(number));

			    	else if(firstNumber.startsWith("arccot")) 
			    	total = Math.atan(1/Double.parseDouble(number));
			    	
			    	else if(firstNumber.startsWith("ln")) 
			    	total = Math.log(Double.parseDouble(number));
				
				firstNumber = Double.toString(total);
				number = numbers;
				value = "";
			}
			bar.setText(firstNumber + number + value);
		}	    	
	}
}