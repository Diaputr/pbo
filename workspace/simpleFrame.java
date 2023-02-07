package workspace;
import javax.swing.JFrame;
public class simpleFrame extends JFrame {
    public simpleFrame(){
        super("Frame Title");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        simpleFrame sf = new simpleFrame();
    }
}