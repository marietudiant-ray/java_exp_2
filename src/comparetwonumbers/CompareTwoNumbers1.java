package comparetwonumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompareTwoNumbers1 {
	
	public static void main(String[] args)
	{
		long time_start,time_end,time;
		
		String n1,n2;
		BufferedReader  a= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入两个数");
		try {
			n1=a.readLine();
			n2=a.readLine();
			time_start=System.currentTimeMillis();
			if(Integer.parseInt(n1)>Integer.parseInt(n2))
			{
				System.out.println("较大的数是 ： "+ Double.parseDouble(n1));
			}
			else
			{
				System.out.println("较大的数是 ： "+Double.parseDouble(n2));
			}
			time_end=System.currentTimeMillis();
			time=time_end-time_start;
			System.out.println("BufferedReader 时间 ： "+ time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		double n3,n4;
	
		Scanner b=new Scanner(System.in);
		System.out.println("请输入两个数");
			n3=b.nextDouble();
			n4=b.nextDouble();
			time_start=System.currentTimeMillis();
			if(n3>n4)
			{
				System.out.println("较大的数是 "+ n3);
			}
			else
			{
				System.out.println("较大的数是 "+ n4);
			}
		
		time_end=System.currentTimeMillis();
		time=time_end-time_start;
		System.out.println("Scanner 时间 ： "+time);
		
		 b.close();
		
	}

}
