package dynamicArray;

public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray arr=new DynamicArray();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr.get(0));
		arr.add(50);
		arr.add(70);
		arr.print();
		System.out.println("\n size"+arr.size());
		System.out.println(arr.remove(1));
		arr.print();
		arr.set(0, 90);
		arr.print();
		System.out.println(arr.size());

	}

}
