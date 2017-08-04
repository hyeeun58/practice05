package prob6;

import java.util.ArrayList;

public class ShapeTest 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(5, 6);
		RectTriangle rtri = new RectTriangle(6, 2);
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(rect);
		list.add(rtri);
		
		for(int i=0; i<list.size(); i++)
		{
			Shape sh = list.get(i);
			
			System.out.println("area : " + sh.getArea());
			System.out.println("perimeter : " + sh.getPerimeter());
			
			if(sh instanceof Resizable)
			{
				((Resizable) sh).resize(0.5);
				System.out.println("area : " + sh.getArea());
				System.out.println("perimeter : " + sh.getPerimeter());
			}
		}
	}

}
