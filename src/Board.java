
public class Board {
	boolean[][] b;
	int manyCars;
	
	public Board() {
		b = new boolean[6][6]; //standard board size 6x6
		init(); //standard amount of cars.
	}
	public Board(int size) {
		b = new boolean[size][size]; //creates custom size board
		init(); //standard amount of cars
	}
	public Board(int size, int amount) {
		b = new boolean[size][size]; //Creates custom size board
		init(amount); //how many cars user wants
	}
	
	public int getDimensions() {
		return b.length;
	}
	
	public void init(){
		manyCars = getDimensions();
		int limit = manyCars/2; //may be for car size creation
		
		//incorporate car creation later
	}
	public void init(int a){
		manyCars = getDimensions();
		int limit = manyCars/2; //may be for car size creation
		//incorporate car creation later
		
	}
}