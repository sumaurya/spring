package prepare.interview;

public class Triangle {

	private String type;
	private int height;

	public Triangle(int height) {
		super();
		this.height = height;
	}

	public Triangle(String type){
		this.type = type;
	}

	public Triangle(String type, int height){
		this.height = height;
		this.type = type;
	}

	public int getHeight() {
		return height;
	}
	
	public String getType() {
		return type;
	}

	public void draw(){
		System.out.println(getType() + " " + getHeight() + " Triangle drawn");
	}
}
