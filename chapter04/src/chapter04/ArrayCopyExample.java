package chapter04;

public class ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0 ,newStrArray, 0, oldStrArray.length);
		
	
		newStrArray[3] = "추가";
		newStrArray[4] = "했다";
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		
		

	}

}
