package drones;

public class Drone 
{
	private int posX; private int posY; static int droneNo;
	
	public Drone (int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
		droneNo++;
	}
	
	public void PrintCoord()
	{
		StringBuffer coords = new StringBuffer();
		coords.append("The Drone");
		coords.append("droneNo");
		coords.append("has co-ordinates of: x =");
		coords.append(posX);
		coords.append(" and y =");
		coords.append(posY);
		coords.append("\n");
		System.out.print(coords);
	}

	public static void main(String[] args) 
	{
		droneNo = 0;
		Drone d = new Drone(5, 3);
		d.PrintCoord();
		
		Drone c = new Drone (2, 7);
		c.PrintCoord();
	}

}
