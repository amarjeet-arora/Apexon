package mobileapp;

public class ScreenResolution {
	private int width;
	private int height;
	public ScreenResolution(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public ScreenResolution() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "ScreenResolution [width=" + width + ", height=" + height + "]";
	}
	

}
