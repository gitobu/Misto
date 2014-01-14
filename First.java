public class Misto {
	private String firstName;
	private String lastName;
	private int blocks;
	
	public void showName(){
		System.out.println(firstName + ' ' + lastName + " made " + blocks + " blocks.");
		
	}
	
	public static void main(String[] args) {
		Misto hj = new Misto();
		hj.firstName = "King";
		hj.lastName = "Dunlap";
		hj.blocks = 34;
		hj.showName();
	
	}

}
