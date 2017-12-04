int [][] Arr = new int [5][5];
public class happyface {
	Arr[1][1]=0;
	Arr[3][1]=0;
	Arr[2][2]=0;
	Arr[3][0]=0;
	Arr[4][1]=0;
	Arr[4][2]=0;
	Arr[4][3]=0;
	Arr[3][4]=0;
	public static void print2d(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}