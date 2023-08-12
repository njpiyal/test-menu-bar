import java.awt.*;
import java.awt.event.*;

public class TestMenuBar implements WindowListener, ActionListener{
    private Frame f;
    private MenuBar mb;
    private Menu m1,m2,m3;
    private MenuItem mi1, mi2,mi3,mi4,mi5,mi6,mi7,mi8;

    public TestMenuBar(){
        f = new Frame("MenuBar Example");
        mb = new MenuBar();
        m1 = new Menu("File");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");
        mi1 = new MenuItem("New");
        mi2 = new MenuItem("Save");
        mi3 = new MenuItem("Load");
        mi4 = new MenuItem("Quit");
        mi5 = new MenuItem("Cut");
        mi6 = new MenuItem("Paste");
        mi7 = new MenuItem("Copy");
        mi8 = new MenuItem("About");
    }
    public void launch(){
        mi4.addActionListener(this);

//        mi1.addActionListener(this);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);

        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);

        m3.add(mi8);



        mb.add(m1);
        mb.add(m2);
        mb.setHelpMenu(m3);

        f.setMenuBar(mb);
        f.addWindowListener(this);
        f.setSize(400,400);
        f.setBackground(Color.magenta);
        f.setLayout(null);

    f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        System.out.println("User Pressed the quit button !!");
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}

    @Override
    public void windowClosing(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public static void main(String[] args){
        TestMenuBar tmb = new TestMenuBar(){
            public void windowClosing(WindowEvent e){

            }
        };
        tmb.launch();
    }
}