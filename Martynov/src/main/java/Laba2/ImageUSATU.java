package Laba2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

class ImageUSATU extends JComponent {
	
	private BufferedImage image;
	private String positionState;
	
    public ImageUSATU() {
    	//состояние позиции изображения
    	positionState = "right";
    	
    	//загружаем изображение
    	try
    	{
    		image = ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public void setPositionState(String state) {
    	this.positionState = state;
    }
    
    @Override
    public Dimension getPreferredSize()
    {
    	return new Dimension(image.getWidth(), image.getHeight());
    }
    
    @Override
    protected void paintComponent(Graphics g) {
    	
    	super.paintComponent(g);
    	
    	//Если изображение не найдено
    	if(image == null)
    		return;
    	
    	//отображение рисунка в правом верхнем углу
    	if(positionState == "right") {
    		g.drawImage(image, 165, 25, this);
    	} else if (positionState == "left") {
    		g.drawImage(image, 15, 25, this);
    	} else {
    		g.drawImage(image, 93, 25, this);
    	}
    }	
}