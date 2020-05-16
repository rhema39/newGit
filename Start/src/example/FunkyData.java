package example;

public class FunkyData {

	public static void main(String[] args) {
		
		int[][] k = array1();
		int[][] g= array2();
		
		int arr3[][]=new int[3][4];
		for(int p=0;p<3;p++){
			for(int q=0;q<4;q++){
				
				System.out.print(arr3[p][q]=k[p][q]+g[p][q]);
			}System.out.println();
		}
		
	}
	
		static int[][] array1(){
		int arr1[][]=new int [3][4];
		
	
		int a=1;
		for(int i=0;i<3;i++){
			
			for(int j=0;j<4;j++){
				System.out.print(arr1[i][j]=a);
				a=a+1;
			};
			System.out.println();
			
		}
		return arr1;}
		static int[][] array2(){
			int arr2[][]=new int [3][4];
	int b=13;
		for(int i=0;i<3;i++){
			
			for(int j=0;j<4;j++){
				System.out.print(arr2[i][j]=b);
				b=b+1;
			};
			System.out.println();
			
		}
		return arr2;}
		

	}


