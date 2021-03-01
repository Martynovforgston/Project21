package Laba2; //пакет Java классов

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
 
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import javax.swing.text.AbstractDocument;
    
public class subversion {

	public subversion() {
		
		JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(300,300,400,415);
		main_GUI.setPreferredSize(new Dimension(400, 415));
		main_GUI.setResizable(false); // фиксированный размер окна
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
		laba_info.setBounds(120,0,150,30);
		main_panel.add(laba_info);
		
		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(270,300,100,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);
		
		JButton button_info = new JButton("Информация"); // добавляем кнопку информации
		button_info.setBounds(20,300,150,40);
		ActionListener actionListenerInfo = new InfoButton(); //создаем слушатель
		button_info.addActionListener(actionListenerInfo); //добавляем слушатель к кнопке
		main_panel.add(button_info); 
		
		// Создание контекстного меню
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Файл");
		
		// Создание изображения
        ImageUSATU img = new ImageUSATU();
        main_panel.add(img);
        img.setBounds(0, 0, 500, 600);
        // Скрытие изображения
        img.setVisible(false);
		
		// Пункт меню "Отобразить логотип УГАТУ" с изображением
	    JMenuItem showLogoItem = new JMenuItem("Отобразить логотип УГАТУ");
	    showLogoItem.addActionListener(new ActionListener() {
	
		    public void actionPerformed(ActionEvent e)
		    {
		    	// При первом отображении изображения
		    	if (!img.isVisible()) {
		    		// Отображение изображения
                    img.setVisible(true);
                    System.out.println(img.getSize().width);
		    	}
		    }
		});
	    
	    JMenuItem downloadFileItem = new JMenuItem("Загрузить файл в проект21");
	    
	    // Пункт меню из команды с выходом из программы
	    JMenuItem exitItem = new JMenuItem("Выход");
	    exitItem.addActionListener(new ListenerButton());
	    // Добавление пунктов в меню
	    menu.add(showLogoItem);
	    menu.add(downloadFileItem);
	    menu.add(exitItem);
	    
        String[] items = {
                "Установить логотип УГАТУ в верхний правый угол",
                "Установить логотип УГАТУ в центр",
                "Установить логотип УГАТУ в верхний левый угол",
                "Отсортировать данные в проекте21"
            };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(20, 260, 350, 25);
        
        ActionListener comboBoxListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                
            	if (item == "Отсортировать данные в проекте21")
            	{
            		new ArrayBubble().sort();
            		return;
            	}
            	
                if (!img.isVisible())
                    return;
                
                if (item == "Установить логотип УГАТУ в верхний правый угол")
                    img.setPositionState("right");
                else if (item == "Установить логотип УГАТУ в верхний левый угол")
                    img.setPositionState("left");
                else if (item == "Установить логотип УГАТУ в центр")
                    img.setPositionState("center");
                
                img.repaint();
            }
        };
        
        comboBox.addActionListener(comboBoxListener);
        main_panel.add(comboBox);
        
        JLabel lblR = new JLabel("Радиус:"); 
        lblR.setBounds(20, 170, 70, 20);
        JLabel lblH = new JLabel("Высота:"); 
        lblH.setBounds(200, 170, 70, 20);
        
        JTextField textFieldR = new JTextField(10);
        textFieldR.setBounds(70, 170, 100, 20);
        ((AbstractDocument)textFieldR.getDocument()).setDocumentFilter(new DocumentIntFilter());
        JTextField textFieldH = new JTextField(10);
        textFieldH.setBounds(250, 170, 100, 20);
        ((AbstractDocument)textFieldH.getDocument()).setDocumentFilter(new DocumentIntFilter());
        
        JButton button_calculate = new JButton("Расчитать"); 
        button_calculate.setBounds(20, 200, 150, 40);
        
        button_calculate.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
            {
                if (textFieldR.getText().isEmpty() | textFieldH.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(main_panel, "Заполните все поля данных");
                }
                else
                {
                    int r = Integer.parseInt(textFieldR.getText());
                    int h = Integer.parseInt(textFieldH.getText());
                    
                    if (r <= 0 || h <= 0)
                    {
                    	JOptionPane.showMessageDialog(main_panel, "Некорректный ввод данных, попробуйте еще раз");
                    	return;
                    }
                    
                    double v = (double) ((Math.PI * r * r * h) / 3); 
                    v = Math.round(v * 100);
                    v = v / 100;
                    JOptionPane.showMessageDialog(main_panel, "Результат: " + v);
                }
            }
        });
        
        main_panel.add(lblR);
        main_panel.add(lblH);
        main_panel.add(textFieldR);
        main_panel.add(textFieldH);
        main_panel.add(button_calculate);
        
        //PlainDocument doc = (PlainDocument)textField.getDocument();
        //doc.setDocumentFilter(new MyIntFilter());
        
        menuBar.add(menu);
        
        main_GUI.setJMenuBar(menuBar);
        main_GUI.pack();
        main_GUI.setVisible(true);
    }
    
    
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student = new subversion();
	}

}
