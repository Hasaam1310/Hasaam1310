package drones;
import java.util.Random;

public class DroneArena 
{
	private int arenaX; private int arenaY;
	private Drone d;
	Random randomGen;
	
	
	public DroneArena(int arenaX, int arenaY)
	{
		this.arenaX = arenaX;
		this.arenaY = arenaY;
	}
	
	public Drone addDrone()
	{
		randomGen = new Random();
		Drone d = new Drone(randomGen.nextInt(arenaX + 1), randomGen.nextInt(arenaY + 1));
		return d;
	}
	
	
	public static void main(String[] args)
	{
		DroneArena a = new DroneArena(20,10);
		Drone d = a.addDrone();
		d.PrintCoord();
		Drone c = a.addDrone();
		c.PrintCoord();
	}
	

}
