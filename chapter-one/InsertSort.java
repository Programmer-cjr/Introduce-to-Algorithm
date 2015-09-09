/**
  * @Date: 2015-08-30
  * @Author: chenjingran
  * @Description: The first example in Introduce to Alogrithm
  */

public class InsertSort{
	public static void main(String[] args){
		int[] num = {3,1,34,67,89,43,23,124};
		
		insertSort(num);
		for(int i = 0; i < num.length; i++)
			System.out.println(num[i]);

	}

	public static void insertSort(int[] num){
		int i,j,temp;
		for(i = 1; i <  num.length; i++){
			temp = num[i];
			j = i - 1;
			while(j >= 0 && num[j] > temp){
				num[j+1] = num[j];
				j--;
			}
            num[j+1] = temp;
		}
	}
}