package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InfoButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame info_GUI = new JFrame("Info");	// создание графического окна информации
		info_GUI.setTitle ("Информация о команде");
		info_GUI.setBounds(800,400,350,250);
		info_GUI.setResizable(false); // фиксированный размер окна	
		
		JPanel info_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		info_panel.setLayout(null);
		info_GUI.add(info_panel);
		
		try {
			//Получение пути для класса 
			String directory = System.getProperty("java.class.path").split(";")[0];
			
			Path path = Paths.get(directory);
			Path parent1 = path.getParent();
			Path parent2 = parent1.getParent();
			
			String path2 = parent2.toString() + "/src/main/resources/fio.txt";			
			Scanner scanner = new Scanner(new File(path2));
	
			String data = "<html>";
			
			while(scanner.hasNext())
				data += scanner.nextLine() + "<br>";
			
			JLabel dataLbl = new JLabel(data);
			dataLbl.setBounds(10, 5, 300, 85);
			info_panel.add(dataLbl);
			
			} catch (Exception ex) { //обработка исключения
				JOptionPane.showMessageDialog(info_panel, ex.getLocalizedMessage());
			}
		
			JButton button_back = new JButton("Назад"); // добавляем кнопку назад
			button_back.setBounds(150,150,100,40);
			button_back.addActionListener(new ActionListener() {
	
			    public void actionPerformed(ActionEvent e)
			    {
			        info_GUI.dispatchEvent(new WindowEvent(info_GUI, WindowEvent.WINDOW_CLOSING)); //вызов события закрытия окна
			    }
			});
			info_panel.add(button_back); 
			
			info_GUI.setVisible(true);
		}
}
