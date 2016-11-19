package dollarconvertor;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DollarConvertor {
	public double dollar,rmb;
	public String result;
	public DollarConvertor()
	{
		System.out.println("输入美元数："+"\n");
		Scanner scanner=new Scanner(System.in);
		dollar=scanner.nextDouble();
		rmb=dollar*8.0601;
		result="$"+dollar+"=￥"+rmb;
		JOptionPane.showMessageDialog(null,result , "转换结果", JOptionPane.INFORMATION_MESSAGE);
		scanner.close();
	}
	public static void main(String[] args)
	{
		DollarConvertor dollarconvertor=new DollarConvertor();
		System.exit(0);
	}

}
