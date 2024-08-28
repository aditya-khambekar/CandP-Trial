import javax.swing.JFrame;

public class App extends JFrame{
    public App(String framename) {
        super(framename);
    }

    public static void main(String[]args){
        App app = new App("Generic");
        app.setSize(1600, 900);
        app.setVisible(true);
    }
}