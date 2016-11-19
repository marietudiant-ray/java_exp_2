package count;

public class Count {
	public static void main(String[] args)
	{
		int i=0;
		double x=2.3;
		
		System.out.println("result 1: "+(--i+i+i++));
		System.out.println("i: "+i);
		System.out.println("result 2: "+(i+++i));
		i+=i+(i=4);
		System.out.println("result 3: "+i);
	    i=i+3*2%i--;
	    System.out.println("result 4: "+i);    
		x+=1.2*3+x++;
		System.out.println("result 5: "+x);
		System.out.println(x%3);
		x=x%3+4*2+x--;
		System.out.println("result 6: "+x);
		
			
	}

}
