import java.awt.Color;
import java.awt.Graphics;



public class Launcher {
	
	public Button[] buttons;
	
	
	public Launcher() {
		buttons = new Button[3];
		
		buttons[0] = new Button(100, 700/3+40, 905-200, 50, "Start Game");
		buttons[1] = new Button(100, 700/3+100,905-200, 50, "About Us");
		buttons[2] = new Button(100, 700/3+160,905-200, 50, "Exit Game");
	}
	
	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 905,700);
		
		for(int i=0;i<buttons.length;i++) 
		{
			buttons[i].render(g);
		}
	}

}
