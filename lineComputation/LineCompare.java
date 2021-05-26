public class LineCompare
{
	public static void main(String[] args)
	{
		int x1=2,x2=8,y1=3,y2=7;
		double length;

		length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		 System.out.println("Length of line :"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);

	}
}
