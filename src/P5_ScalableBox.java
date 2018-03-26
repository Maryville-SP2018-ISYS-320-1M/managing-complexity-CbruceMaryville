

/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 3/25/2018
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		int height = 0;
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		//HERE IS THE TOP AND BOTTOM WIDTH THAT CHANGE THE WIDTH OF THE "---"
		int TopBotWidth = 10;
		for( int capDashIndex = 1; capDashIndex <= TopBotWidth - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		//HERE IS THE HEIGHT IT CAN ALSO BE CALLED VIA PARAMETER TO CHANGE IT ACCORDINGLY
		int height = 10;
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		//HERE IS THE INSIDE WIDTH THAT CAN CHANGE THE ".." INSIDE THE BOX 
		//ONCE AGAIN CAN BE CALLED AS A PARAMETER 
		int InsideWidth = 10;
		for( int insideRowIndex = 1; insideRowIndex <= InsideWidth - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
