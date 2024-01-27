package Figures_Hemul;

import Guli_10_23.SeaBattleFieldUS10;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class FiguresCreated {

    public static void main(String[] Args) {

        JFrame field = new JFrame("Figures");


        field.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //кнопка закрытия окна
        field.setSize(999, 742); // размер окна
        field.setLayout(new BorderLayout()); // менеджер компановки?
        field.setLocationRelativeTo(null);
        field.setAlwaysOnTop(true);
        field.setResizable(false);
        field.setVisible(true);

        FiguresDraw figureGraphicsComponent = new FiguresDraw();
        field.add(figureGraphicsComponent);

        System.out.println();
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
