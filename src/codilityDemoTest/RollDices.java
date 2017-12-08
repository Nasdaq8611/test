package codilityDemoTest;

import java.util.Random;

public class RollDices {

	private void testNoPoints() {
		// TODO Auto-generated method stub

	}
	
	private void testSameNumberOccurence() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int[] diceRolls = new int[5];
		
		int[] diceRollsTestArray = {1,1,1,5,1};
		
		int score = 0;
		int previous = 0;
		int occurence = 0;
		for (int i = 0; i < 5; i++) {
			 //int current = randomGenerator.nextInt(5);
			int current = diceRollsTestArray[i];
			 
			 if(current==1 ){
				 score+=100;
				 if(previous==1 && occurence>2){
					 score+=800;
					 occurence++;
				 }
			 }
			 if(current==2){
				 if(previous==2 && occurence>2){
					 score+=200;
					 occurence++;
				 }
			 }
			 if(current==3 ){
				 if(previous==3 && occurence>2){
					 score+=300;
					 occurence++;
				 }
			 }
			 if(current==4 ){
				 if(previous==4 && occurence>2){
					 score+=400;
					 occurence++;
				 }
			 }
			 if(current==5 ){
				 score+=50;
				 if(previous==5 && occurence>2){
					 score+=500;
					 occurence++;
				 }
			 }
			 if(current==6 ){
				 if(previous==6 && occurence>2){
					 score+=600;
					 occurence++;
				 }
			 }
			 
			 previous = current;
			
		}
	}
	
}
