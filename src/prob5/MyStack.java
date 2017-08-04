package prob5;

public class MyStack 
{
	String[] arrStr = null;
	int currIndex;
	
	// 생성자
	public MyStack(int cnt)
	{
		arrStr = new String[cnt];
		currIndex = 0;
	}
	
	// push/pop
	public void push(String str)
	{
		if(arrStr.length == currIndex)	resize();

		arrStr[currIndex] = str;
		currIndex++;
	}
	
	public String pop() throws MyStackException 
	{
		if(isEmpty()) 
			throw new MyStackException("stack is empty"); 

		String result = arrStr[--currIndex];
		arrStr[currIndex] = null;
		
		return result;
	}
	
	
	public void resize()
	{
		int len = arrStr.length;
		String[] newArr = new String[(len * 2)];
		
		for(int i=0; i<len; i++)
		{
			newArr[i] = arrStr[i];
		}
		arrStr = newArr;
	}
	
	public boolean isEmpty()
	{
		if(currIndex == 0) 
			return true;
		else 
			return false;
	}
}
