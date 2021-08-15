
public class Solution {

	public static void main(String[] args) {
		int a[][]={{1,1,1,1,1},{2,2,2,2,2},{3,3,0,3,3},{4,4,4,4,4},{5,5,5,5,5}};  
		new Solution().toZeroMatrix(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	public void toZeroMatrix(int a[][]) {
		
		int [] zeroRows=new int [a.length];
		int [] zeroColums=new int [a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j]==0) {
					zeroRows[i]=1;
					zeroColums[j]=1;
				}
			}
			
		}
		
		for (int i = 0; i < zeroRows.length; i++) {
			if(zeroRows[i]==1){
				for (int j = 0; j < a[0].length; j++) {
					a[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < zeroColums.length; i++) {
			if(zeroRows[i]==1){
				for (int j = 0; j < a.length; j++) {
					a[j][i]=0;
				}
			}
		}
	}

}
