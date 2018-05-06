package asianpaints.model;

public class Paint {
	private int pid;
	private String name;
	private float cost;

	public Paint() {
		// TODO Auto-generated constructor stub
	}

	public Paint(int pid, String name, float cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

}
