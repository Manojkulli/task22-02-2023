package task;

public class PalindromeArray {

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5,5};
		int brr[]=convert(arr);
		int a=palindromeCheck(brr);
		System.out.println(a);
	}

	private static int palindromeCheck(int[] brr) {
		if(brr.length%2==0) {
			int count0=0,count1=0;
			for (int i = 0; i < brr.length; i++) {
				if(brr[i]==0) {
					count0++;
				}else {
					count1++;
				}
			}
			if(count0%2==0 && count1%2==0) {
				return 1;
			}else {
				return 0;
			}
		}else {
			int count0=0,count1=0;
			for (int i = 0; i < brr.length; i++) {
				if(brr[i]==0) {
					count0++;
				}else {
					count1++;
				}
			}
			if((count0%2==0 && count1%2==1)||(count0%2==1 && count1%2==0)) {
				return 1;
			}else {
				return 0;
			}
		}
		
	}

	public static int[] convert(int[] arr) {
		int brr[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i]=arr[i]%2;
		}
		return brr;
	}
}
