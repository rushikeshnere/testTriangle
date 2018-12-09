package test.triangle;

public class TriangleFactory {

	public Triangle getTriangle(double sideALength, double sideBLength, double sideCLength)
	{
		if(sideALength == sideBLength && sideBLength == sideCLength)
		{
			return new EquilateralTriangle(sideALength, sideBLength, sideCLength);
		}
		else if(sideALength == sideBLength || sideBLength == sideCLength || sideALength == sideCLength)
		{
			return new IsoscelesTriangle(sideALength, sideBLength, sideCLength);
		}
		else
		{
			return new ScaleneTriangle(sideALength, sideBLength, sideCLength);
		}
	}
}
