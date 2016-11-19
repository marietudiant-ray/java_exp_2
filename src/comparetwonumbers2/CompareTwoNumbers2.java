package comparetwonumbers2;

import javax.swing.JOptionPane;

public class CompareTwoNumbers2 {
	public String  inputNumber1,inputNumber2;
	public double  number1,number2;
	
	public CompareTwoNumbers2()
	{
		inputNumber1=JOptionPane.showInputDialog(null, "请输入一个数字", "输入", JOptionPane.INFORMATION_MESSAGE);
		inputNumber2=JOptionPane.showInputDialog(null, "请输入一个数字", "输入", JOptionPane.INFORMATION_MESSAGE);
		
		number1=Double.parseDouble(inputNumber1);
		number2=Double.parseDouble(inputNumber2);
		if(number1>number2)
		{
			JOptionPane.showMessageDialog(null, "较大的数是 ： "+inputNumber1);
		}
		else{
			JOptionPane.showMessageDialog(null, "较大的数是 ： "+inputNumber2);
		}
	}
	public static void main(String[] args)
	{
		CompareTwoNumbers2 a= new CompareTwoNumbers2();
	    System.exit(0);	
	}

}
