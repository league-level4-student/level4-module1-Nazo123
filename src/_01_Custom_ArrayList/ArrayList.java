package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
		
	}
	private T[] arr = (T[]) new Object[0];
	public T get(int loc) throws IndexOutOfBoundsException {

		if(arr.length>loc&&loc>=0) {
			return arr[loc];
		}
		System.out.println("IndexOutOfBoundsException");
		return null;
	}
	
	public void add(T val) {
		 T[] arrr = (T[]) new Object[arr.length+1];
		for(int i = 0; i<arrr.length;i++) {
			if(i<arr.length) {
			arrr[i] = arr[i];
			}
		}
		arrr[arrr.length-1] = val;
		arr=arrr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if(loc>arr.length&&loc<0) {
			System.out.println("IndexOutOfBoundsException");
			return;
		}
		 T[] arrr = (T[]) new Object[arr.length+1];
		 int counter = 0;
		 arrr[loc] = val;
		for(int i = 0; i < arrr.length; i++) {
			
			if(i!=loc) {
				arrr[i]=arr[counter];
						counter++;
			}
			
		}
		arr = arrr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc>arr.length&&loc<0) {
			System.out.println("IndexOutOfBoundsException");
			return;
		}
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if(loc>arr.length&&loc<0) {
			System.out.println("IndexOutOfBoundsException");
			return;
		}
		 T[] arrr = (T[]) new Object[arr.length-1];
		 int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(i!=loc) {
				arrr[counter]=arr[i];
						counter++;
			}
			
		}
		arr = arrr;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
	
		return arr.length;
	}
}