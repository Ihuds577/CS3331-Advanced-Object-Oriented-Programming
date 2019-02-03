package pricewatcher.pricewatcherUI;
import pricewatcher.pricewatcherModel.*;
import javax.swing.*;

public class GuiConsole{

    private JFrame mainFrame = new JFrame();
    public static void onDraw(){
        JFrame tstFrame = new JFrame();

        JButton testButton = new JButton("Test");
        testButton.setBounds(130,150,100,40);

        tstFrame.add(testButton);

        tstFrame.setSize(400,500);
        tstFrame.setLayout(null);
        tstFrame.setVisible(true);
    }

    public void addItem(Item item){
        
    }
}