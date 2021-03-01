package Laba2;

import javax.swing.JOptionPane;

public class ArrayFactory {

	public int[] create() {
	
		int[] array = new int[14];
		
		// Заполняем массив случайными числами
		for (int i = 0; i < array.length; i++) {
			array[i] = RandomNumber.getRandomNumber();
		}
		
		String message = "Исходный массив: [ " + array[0];
		
		for (int i = 1;  i < array.length; i++)
			message += ", " + array[i];
		
		message += " ]";
		
		JOptionPane.showMessageDialog(null, message);
		
		return array;
	}
}