package pattern;

public class Array_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,54,1};
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("min element "+min);
	}

}
