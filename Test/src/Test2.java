
public class Test2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		칼 칼 = new 칼();
		칼 칼1 = new 칼();
		칼 칼2 = new 칼();
		총 총 = new 총();
		총 총1 = new 총();
		활 활 = new 활();
		활 활1 = new 활();
		활 활2 = new 활();
		활 활3 = new 활();
		
		무기[] arr = {칼, 칼1, 칼2, 총, 총1, 활, 활1, 활2, 활3};
		
		for(무기 mugi : arr) {
			System.out.println(mugi + "주웠다!");
		}
		
//		칼[] arr = {칼, 칼1, 칼2};
//		총[] arr2 = {총, 총1};
//		활[] arr3 = {활, 활1, 활2, 활3};
		
		
		
		
//		int[] arr = {1, 2, 3, 4};
//		
//		for(int i=0; i<arr.length; i++) {
//			int num = arr[i];
//			System.out.println(num);
//
//			num++;
//		}
		
		// 향상된 for문
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
	}

}

class Hero {
//	칼 left;
//	총 left2;
//	활 left3;
	
	private 무기 left;
	
	public void set무기(무기 무기) {
		left = 무기;
	}
	
}



class 무기 {
	int demage;
	int 공격속도;
}

class 칼 extends 무기 {}
class 총 extends 무기 {}
class 활 extends 무기 {}




