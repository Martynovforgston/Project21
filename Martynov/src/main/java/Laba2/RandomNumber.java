package Laba2;

public class RandomNumber {
	public static int getRandomNumber (){
		int min=50;
		int max=80;
		return min + (int) (Math.random() * ((max-min)+1));
		}
}
