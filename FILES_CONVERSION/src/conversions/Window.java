package conversions;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Elimane on Feb, 2018, at 03:51
 */
public class Window extends JFrame{
    private JEditorPane apercu, apercu2;
    private File htmlFile;

    public Window(String fileName){
        this.setSize(550, 400);
        this.setTitle("Caffichage du résultat");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.htmlFile = new File(fileName);
        this.init();
        this.setVisible(true);
    }

    private void init(){
        apercu = new JEditorPane();
        try {
            apercu.setEditorKit(new HTMLEditorKit());
            apercu.setPage(this.htmlFile.toURI().toURL());
            apercu.setEditable(false);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(apercu, BorderLayout.WEST);
    }
}
