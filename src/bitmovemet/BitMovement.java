package bitmovemet;

import javax.swing.JOptionPane;

public class BitMovement {

	public int number1,result1,result2;
	public String inputNumber1,resultfinal;
	
	public BitMovement()
	{
		inputNumber1=JOptionPane.showInputDialog("请输入一个整数");
		number1=Integer.parseInt(inputNumber1);
		result1=number1<<5;
		result2=number1>>3;
		resultfinal=number1+"<<5="+result1+"\n";
		resultfinal+=number1+">>3="+result2+"\n";
	    JOptionPane.showMessageDialog(null, resultfinal, "移位的结果",JOptionPane.INFORMATION_MESSAGE);		
	}
	
	public static void main(String[] args)
	{
		BitMovement bitmovement=new BitMovement();
		System.exit(0);
	}
}
