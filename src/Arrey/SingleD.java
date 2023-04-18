package Arrey;


public class SingleD {
	
public static void main(String[] args) {
	int[] a= new int [4];
	a[0]=12;
	a[1]=23;
	a[2]=26;
	a[3]=79;
	System.out.println(a[0]);
	SingleD D = new SingleD();
	D.arry();
}

public void arry() {
	int [][] B= new int [2][4];                  // B                  Matrixx arrey
	B[0][0]=22;                                  //[0][1]   [i][j]
	B[0][1]=45;                            //[0,0][0,1][0,2][0,3]  [1,0][1,1][1,2][1,3]
	B[0][2]=42;                          //
	B[0][3]=12;                             
    B[1][0]=24;
	B[1][1]=54;
	B[1][2]=23;
	B[1][3]=98;
	System.out.println(B);//[[I@2c7b84de 2d arry
	System.out.println(B[0]);//[I@2c7b84de  1darrey
	System.out.println(B[0].length);//4
	System.out.println(B[0][0]);
	
}

//public void arrey1() {
//	int [][][] c = new int [3][4][2];            // Jagged Arrey 
//	                                           //  c
//	                                       //     [0][1][2]
//	                                     //   [0][1][2][3]  
//	                                 //[][] [][] [][] [][]   [][],[][],[][],[][]    [][] [][] [][] [][]
//	 
//	c[0][0][0]=67;
//	c[0][0][1]=97;
//	c[0][0][2]=66;
//	c[0][0][3]=67;
//	c[0][1][0]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;                            xxxxxxxxxxxxxxx
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	c[0][1][1]=67;
//	
//	
//}

} 
