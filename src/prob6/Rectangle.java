package prob6;

public class Rectangle extends Shape implements Resizable 
{
	private double width;
	private double height;
	
	// 생성자
	public Rectangle(double w, double h)
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
	
	
	@Override
	public void resize(double s) 
	{
		width *= s;
		height *= s;
	}

	@Override
	protected double getArea() 
	{
		return (width * height);
	}

	@Override
	protected double getPerimeter() 
	{
		return ((width + height) * 2);
	}

}
