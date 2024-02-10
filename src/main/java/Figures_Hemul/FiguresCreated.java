package Figures_Hemul;

import Guli_10_23.SeaBattleFieldUS10;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.io.IOException;
//import org.openqa.selenium.WebDriver;


public class FiguresCreated {

    public static void main(String[] Args) {

        JFrame field = new JFrame("Figures");


        field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //кнопка закрытия окна
        field.setSize(new Dimension(990,742)); // размер окна
        //field.setLayout(new BorderLayout()); // менеджер компановки?
        //field.getContentPane().setLayout((LayoutManager)null);
        //field.setLocationRelativeTo(null);
//        field.setAlwaysOnTop(true);
        field.setResizable(false);
        //field.setLayout(new GridBagLayout());


        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 990, 21);
        field.getContentPane().add(menuBar);

        JMenu mnGame = new JMenu("Game");
        menuBar.add(mnGame);
        JMenuItem mntmNewGame = new JMenuItem("New game");
        mnGame.add(mntmNewGame);
        JMenuItem mntmProperties = new JMenuItem("Properties");
        mnGame.add(mntmProperties);
        JMenuItem mntmExit = new JMenuItem("Exit");
        mnGame.add(mntmExit);
        JMenu mnHelp = new JMenu("Help");
        menuBar.add(mnHelp);
        JMenuItem mntmAbout = new JMenuItem("About");
        mnHelp.add(mntmAbout);





        FiguresDraw figureGraphicsComponent = new FiguresDraw();
        field.add(figureGraphicsComponent);

        field.setVisible(true);



  //      System.out.println();
//        Circle circleA = new Circle(10,20,5);
//        System.out.println(circleA.toString());
//
//
//        circleA.square();
//        circleA.move(5,-5);
//        System.out.println(circleA.toString());
//
//        System.out.println();
//        Rectangle rectangleA = new Rectangle(-10,40,5, 13);
//        System.out.println(rectangleA.toString());
//        rectangleA.square();
//        rectangleA.move(2,-1);
//        System.out.println(rectangleA.toString());
//
//        System.out.println();
//        Quadrate quadrateA = new Quadrate(0,-1,5);
//        System.out.println(quadrateA.toString());
//        quadrateA.square();
//        quadrateA.move(5,-5);
//        System.out.println(quadrateA.toString());
//
//        System.out.println();
//        Cube cubeA = new Cube(100,101,5,16);
//        System.out.println(cubeA.toString());
//        cubeA.square();
//        cubeA.move(5,-5);
//        cubeA.moveZ(44);
//        System.out.println(cubeA.toString());

    }
}
