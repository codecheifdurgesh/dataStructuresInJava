package dynamicArray;

public class DynamicArray{

	int count=0;
	int[] arr=new int[3];
	
	public void add(int inp) {
		if(count<arr.length) {
			arr[count]=inp;
			count++;
		}
		else {
			int[] temp=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i];
			}
			temp[count]=inp;
			arr=temp;
			count++;
		}
	}
	
	public int get(int index) {
		if(index>=count){
			return Integer.MIN_VALUE;
		}
		return arr[index];
		
		}
	public int size() {
		return count;
	}
	public int remove(int index) {
		if(index>=count){
			return Integer.MIN_VALUE;
		}
		int[] temp=new int[arr.length-1];
		int removed=arr[index];
		int i=0;int j=0;
		while(i<arr.length && j<temp.length) {
			if(i==index) {
				i++;
				
			}
			else {
				temp[j]=arr[i];
				i++;
				j++;
			}
			
		}
		count--;
		arr=temp;
		return removed;
		
	}
	public int[] set(int index,int value) {
		if(index>=count) {
			return null;
		}
		else {
			arr[index]=value;
			return arr;
		}
	}
	public void print() {
		if(arr.length==0) {
			return;
		}
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	}
	

