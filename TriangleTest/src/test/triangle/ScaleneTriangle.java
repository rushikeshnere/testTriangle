package test.triangle;

public class ScaleneTriangle implements Triangle{
	private double sideALength, sideBLength, sideCLength;
	
	public ScaleneTriangle(double sideALength, double sideBLength, double sideCLength)
	{
		this.sideALength = sideALength;
		this.sideBLength = sideBLength;
		this.sideCLength = sideCLength;
	}
	
	public String getTriangleType() {
		return "Scalene triangle";
	}
}
