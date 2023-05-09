package Question3;

public class Room {
	private int roomNo;
	private String roomType;
	private String roomArea;
	
	
	
	public void  setData(int roomNo, String roomType, String roomArea) {
		
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
	}
	
	public void displayData()
	{
		System.out.println("Room no. is " +roomNo);
		System.out.println("Room type is " +roomType);
		System.out.println("Room Area is " +roomArea);
	}

	
	public static void main(String[] args) {
		Room r1 = new Room();
		r1.setData(101, "Luxury", "570");
		
		r1.displayData();
	}

	

}
