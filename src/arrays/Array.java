package arrays;

public class Array {
	//Two types --- single dimensional and multi dimensional
	
		public void method1() {
			//either declare the size and initialize the values or directly declare the values
			int i[]= {1,2,3,4,5,6,7};
			
			String str[]= {"ramesh","rajesh","nagesh","subhash"};
			
			for (String string : str) {
				System.out.println(string);
			}
			
			for (int k : i) {
				System.out.println(k);
			}
			
			for (int k = 0; k < i.length; k++) {
				System.out.println(i[k]);
			}
			
			int j[]=new int[6];
			j[0]=100;
			j[1]=200;
			j[2]=300;
			j[3]=400;
			j[4]=500;
			j[5]=600;
			
			for (int a : j) {
				System.out.println(a);
			}
			
			for (int b = 0; b < j.length; b++) {
				System.out.println(j[b]);
			}
		}
		
		public void method2() {
			//Multidimensional Array --- based on matrices --- rows and columns
			int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			int b[][]=new int[3][3];
			b[0][0]=1;
			b[0][1]=2;
			b[0][2]=3;
			b[1][0]=4;
			b[1][1]=5;
			b[1][2]=6;
			b[2][0]=7;
			b[2][1]=8;
			b[2][2]=9;
			

			
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			Array array=new Array();
			array.method1();
			array.method2();
		}

}
