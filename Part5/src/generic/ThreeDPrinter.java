package generic;

public class ThreeDPrinter {
	
	private Plastic meterial;

	public Plastic getMeterial() {
		return meterial;
	}

	public void setMeterial(Plastic meterial) {
		this.meterial = meterial;
	}
	
	public String toString() {
		return "재료는 Plastic 입니다";
	}

}
