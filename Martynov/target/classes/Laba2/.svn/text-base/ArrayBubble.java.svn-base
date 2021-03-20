package Laba2;

import javax.swing.JOptionPane;

public class ArrayBubble {

	public int[] sort() {
		int[] array = new ArrayFactory().create();
		for (int out = array.length - 1; out >= 1; out--){
		
			for (int in = 0; in < out; in++){
			
				if(array[in] > array[in + 1]) {
					// Меняем элементы местами
					int temp = array[in];
					array[in] = array[in + 1];
					array[in + 1] = temp;
				}
			}
		}
		
		
		String message = "Отсортированный массив: [ " + array[0];
		
		for (int i = 1;  i < array.length; i++)
			message += ", " + array[i];
		
		message += " ]";
		
		JOptionPane.showMessageDialog(null, message);
		
		return array;
	}
}