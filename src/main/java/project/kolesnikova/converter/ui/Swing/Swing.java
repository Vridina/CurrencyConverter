package project.kolesnikova.converter.ui.Swing;

import project.kolesnikova.converter.controller.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Swing extends JFrame {

    MainController controller;

    public Swing(MainController controller) {
        this.controller = controller;
    }

    private JPanel mainPanel;
    private JTabbedPane tabbedPanel;
    private JPanel exchangePanel;
    private JPanel exchange;
    private JComboBox typesValuteBox;
    private JSpinner spinner;
    private JButton exchangeButton;


    public void init() {
        setIcon();
        //todo - почему если в этот метод добавить сет визибл то иконка не подгружается..?
        initView();
    }

    private void initView() {



        this.add(mainPanel);
        setSize(300, 200);
        setTitle("Exchanger");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        setVisible(true);
    }


    private void setIcon() {    //todo - the icon is not displayed
        URL png = getClass().getResource("/icon.png");
        Image image = Toolkit.getDefaultToolkit().getImage(png);
        setIconImage(image);
    }

    public Swing() {


        exchangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.printf("Кнопка нажата ");
            }
        });
    }

}

