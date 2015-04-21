package random.gen;


import org.junit.Test;

public class RandomGenerator {

	@Test
	public void testRandom() {
		int[] intArray = new int[20];
		
		for(int i = 0; i< 100000 ; i++){
			fillArray(intArray);
		}
		
		for(int i = 0 ; i < intArray.length; i++){
			System.out.print("\t ["+(i+70)+"]"+(intArray[i])/1000.0);
		}
		
//		switch(rand){
//			case 70 :
//				intArray[rand]+=1;
//			case 80 :
//				intArray[1]+=1;
//			default: 
//				System.out.println("default jest"+rand);
//				
//				
//		}
	}

	private void fillArray(int[] intArray) {
		int rand = (int) (Math.random()*20.0+70);
		intArray[rand-70]+=1;
	}
}
