import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class About extends JPanel {

    private final ImageIcon back;
    private Sound soundMainMenu = new Sound();
    private Sound soundClick = new Sound();

    public About(){
        // Ukuran layar
        setSize(793, 560);
        setFocusable(true);
        // Get source img 
        back = new ImageIcon(getClass().getResource("about.png"));

        mouseListener();
    }

    private void mouseListener(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if ((x >= 52 && x <= 79) && (y >= 40 && y <= 61)){
                    Start start = new Start();

                    Functions.dispose();
                    Functions.frame(start);
                    soundClick.play();
                    soundMainMenu.stop();
                }

            }
        });
    }

    public void paint(Graphics g){
        ImageIcon about = new ImageIcon(getClass().getResource("about.png"));
        about.paintIcon(this, g, 0, 0);

        back.paintIcon(this, g, 49, 36);

    }
}