import java.util.Scanner;

public class LineCompare
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1, y1 and x2, y2 for line1:");
		int x1 = scan.newInt();
		int y1 = scan.newInt();
		int x2 = scan.newInt();
		int y2 = scan.newInt();

		double length1,length2;

		length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("Enter x1, y1 and x2,y2 for line2: ");
		int a1 = scan.newInt();
		int b1 = scan.newInt();
		int a2 = scan.newInt();
		int b2 = scan.newInt();

		length2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		
		 System.out.println("Length of line :");
		System.out.println(length1);
		 System.out.println("Length of line :");
		System.out.println(length2); 
		if(length1 == length2)
		{
			System.out.println("Lines are equal");
		}
		else
		{
			System.out.println("Lines are not equal");
		}


	}
}
