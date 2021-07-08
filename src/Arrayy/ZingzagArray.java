package Arrayy;

public class ZingzagArray {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6};
		int [] b = {7,8,9,10,11,12,13,14,15};
		
		int zigzag[]=new int[a.length+b.length];
		
		int k =0;
		for(int i =0;i<a.length;i++) {
			zigzag[k]=a[i];
			k++;
			zigzag[k]=b[i];
			k++;
		}
		if(b.length>a.length) {
			
			for(int i= a.length;i<b.length;i++) {
				zigzag[k]=b[i];
				k++;
			}
		}
		for(int i=0;i<zigzag.length;i++) {
			System.out.println(zigzag[i]);
		}

	}

}
