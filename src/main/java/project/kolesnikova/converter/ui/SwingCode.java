package project.kolesnikova.converter.ui;

import project.kolesnikova.converter.entities.ValCurs;
import project.kolesnikova.converter.entities.valute.TypesCurrencies;
import project.kolesnikova.converter.entities.valute.Valute;
import project.kolesnikova.converter.parser.ParseCbr;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class SwingCode extends JFrame {

    public static final String TITLE = "Converter";
    private JPanel mainPanel;
    JMenuBar greenMenuBar;
    private JComboBox comboBoxValute;
    private JSpinner spinner;
    private JButton button;
    private JLabel label;


    public void init() {

//==========================   mainPanel
        setTitle(TITLE);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setResizable(false);
        mainPanel.setLayout(new GridLayout(3, 3));
        this.add(mainPanel);


        mainPanel = new JPanel();
//==========================   JMenuBar
        greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));


//==========================   leibl

        label = new JLabel("Лейбл");
        mainPanel.add(label);
//==========================   comboBoxValute
        ParseCbr parseCbr = new ParseCbr();
        String[] strings = parseCbr.parser()
                .getValute()
                .stream()
                .map(Valute::getCharCode)
                .toArray(String[]::new);
        comboBoxValute = new JComboBox<>(strings);
        comboBoxValute.addActionListener(this.comboBoxValute);

        mainPanel.add(comboBoxValute);

//==========================   JSpinner

        spinner = new JSpinner();
        mainPanel.add(spinner);


        //==========================   JSpinner
        button = new JButton("Обмен");
        mainPanel.add(button);

//        button.addActionListener(e ->

//                String typesq = new String(comboBoxValute.getActionListeners());


//        );


        this.setVisible(true);

//        enter.addActionListener(e -> {
//            String passTxt = new String(password.getPassword());
//            if (passTxt.equals("123123")) {
//                label.setText(login.getText() + "is OK");
//            } else {
//                label.setText("incoorect pass");
//            }
//        });


    }


    public static void main(String[] args) {
        new SwingCode().init();


    }


}

