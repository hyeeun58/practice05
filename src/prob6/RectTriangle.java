package prob6;

public class RectTriangle extends Shape 
{
	private double width;
	private double height;
	
	// 생성자
	public RectTriangle(double w, double h)
	{
		width = w;
		height = h;
	}
	
	//getter/setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	// 넓이
	@Override
	protected double getArea() 
	{
		return ((width * height) / 2.0);
	}

	// 직각 삼각형의 둘레
	@Override
	protected double getPerimeter() 
	{
		return (width + height + Math.sqrt( Math.pow(width, 2) + Math.pow(height, 2)) );
	}

}
