package sdu.fullTextSearch.main;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread insertDataThread = new InsertDataThread();
		insertDataThread.start();
		
	}

}
