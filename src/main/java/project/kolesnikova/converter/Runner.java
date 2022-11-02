package project.kolesnikova.converter;


import project.kolesnikova.converter.controller.MainController;
import project.kolesnikova.converter.ui.Swing.Swing;

public class Runner {

    //пример массива [CAD, 55]
    public static void main(String[] args) {

        //build swing app
        MainController mainController = new MainController();
        Swing swing = new Swing(mainController);

        //run swing app
        swing.init();

    }
}
