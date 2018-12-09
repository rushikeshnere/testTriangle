package test.triangle;

public class EquilateralTriangle implements Triangle{
	private double sideALength, sideBLength, sideCLength;

	public EquilateralTriangle(double sideALength, double sideBLength, double sideCLength)
	{
		this.sideALength = sideALength;
		this.sideBLength = sideBLength;
		this.sideCLength = sideCLength;
	}

	public String getTriangleType() {
		return "Equilateral triangle";
	}
}
