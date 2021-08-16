package design.patterns.behavior.proxy.virtural;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * description: Client
 * date: 2021/8/12 下午4:20
 * author: cc
 */
public class Client {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Cd Cover viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<String, String>();

    public Client() throws Exception {
        cds.put("image1", "https://m.media-amazon.com/images/I/41c3X+RaZ5L._AC_US40_.jpg");
        cds.put("image2", "https://m.media-amazon.com/images/I/41BRUscVXEL._AC_US40_.jpg");
        URL initialURL = new URL(cds.get("image1"));
        menuBar = new JMenuBar();
        menu = new JMenu("菜单1");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }


        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //    ImageComponent imageComponent;
    public static void main(String[] args) throws Exception {
        Client client = new Client();
    }
}
