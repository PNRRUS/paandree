package Guli_10_23;

import javax.swing.*;
import java.awt.*;

public class SeaBattleField extends JComponent {


    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int color;
int counter4 = 0;
        //graphics.drawOval(10,10,20,20);
        int y = 40;
        boolean free;
        int gh = 40;
        int counter2 = 0;
        for (int counter = 0; counter < 11; counter++) {
            graphics.drawLine(y, 40, gh, 440);
            gh += 40;
            y += 40;
        }

        gh = 40;
        y = 40;
        for (int counter = 0; counter < 11; counter++) {
            graphics.drawLine(40, y, 440, gh);
            gh += 40;
            y += 40;
        }

        counter2 = 1;

        int counter = 0;
        int counter1 = 0;
        int arrayWidth = 10;
        int[][] arr = new int[10][10];
       // int numberShip = (int) Math.round((Math.random() * 3) + 1);
        int line;
        int column;
        //arr[line - 1][column - 1] = 1;
        for (int numberShip = 4; numberShip >= 1; numberShip--) {
            for (int ShipsQty = 1; ShipsQty <= 5 - numberShip; ShipsQty++) {
                int type = (int) Math.round((Math.random()));
                if (type == 1) {
                    do {
                        free = true;
                        column = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        line = (int) Math.round((Math.random() * 9) + 1);
                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arr, line - 1, column - 1 + i)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arr[line - 1][column - 2 + v] = numberShip;
                    }
                    //numberShip = (int) Math.round((Math.random() * 3) + 1);

                } else {
                    do {
                        free = true;
                        line = (int) Math.round((Math.random() * (9 - numberShip)) + 1);
                        column = (int) Math.round((Math.random() * 9) + 1);

                        for (int i = 0; i < numberShip; i++) {
                            if (!fieldFree(arr, line - 1 + i, column - 1)) {
                                free = false;
                                break;
                            }
                        }
                    } while (!free);

                    for (int v = 1; v <= numberShip; v++) {
                        arr[line - 2 + v][column - 1] = numberShip;
                    }

                    //numberShip = (int) Math.round((Math.random() * 3) + 1);
                }
            }
        }
        for (int o = 500; o <= 899; o += 40) {
            for (int p = 0; p <= 399; p += 40) {
                graphics.setColor(Color.WHITE);
                graphics.fill3DRect(o + 40, p + 40, 40, 40, true);

            }
        }
        for (int i = 0; i <= 399; i += 40) {
            for (int j = 0; j <= 399; j += 40) {
                if (arr[i / 40][j / 40] == 0) {
                    graphics.setColor(Color.BLUE);
                    graphics.fill3DRect( i+40, j+40, 40, 40, true);
                    graphics.setColor(Color.BLUE);
            graphics.drawOval(i + 554, j +55, 8, 8);
            graphics.drawOval(i + 555, j + 55, 8 , 8);
            graphics.drawOval(i + 556, j + 55, 8, 8);
            graphics.drawOval(i + 557, j + 55, 8, 8);
            graphics.drawOval(i + 558, j + 55, 8, 8);

                } else {
                    graphics.setColor(Color.DARK_GRAY);
                    graphics.fill3DRect(i + 40, j + 40, 40, 40, true);
                    graphics.setColor(Color.DARK_GRAY);
                    graphics.drawLine(i + 540, j + 40, i + 580, j + 80);
                    graphics.drawLine(i + 580, j + 40, i + 540, j + 80);
                    graphics.drawLine(i + 541, j + 40, i + 581, j + 80);
                    graphics.drawLine(i + 581, j + 40, i + 541, j + 80);
                    graphics.drawLine(i + 542, j + 40, i + 582, j + 80);
                    graphics.drawLine(i + 582, j + 40, i + 542, j + 80);
                   
//            graphics.drawLine(i + 500, j + 40, i + 540, j + 80);
//            graphics.drawLine(i + 500, j + 40, i + 540, j + 80);
//            graphics.drawLine(i + 500, j + 40, i + 540, j + 80);
//            graphics.drawLine(i + 500, j + 40, i + 540, j + 80);

                }
            }
            Graphics2D g2 = (Graphics2D) graphics;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
            g2.setPaint(Color.black);

            graphics.drawString("   а    б    в     г     д     е     ж     з     и    к", 40, 20);

            graphics.drawString("1 ", 0, 65);
            graphics.drawString("2 ", 0, 105);
            graphics.drawString("3 ", 0, 145);
            graphics.drawString("4 ", 0, 185);
            graphics.drawString("5 ", 0, 225);
            graphics.drawString("6 ", 0, 265);
            graphics.drawString("7 ", 0, 305);
            graphics.drawString("8 ", 0, 345);
            graphics.drawString("9 ", 0, 385);
            graphics.drawString("10", 0, 425);

            graphics.drawString("         а     б     в    г     д     е     ж     з    и     к", 500, 20);

            graphics.drawString("1 ", 500, 70);
            graphics.drawString("2 ", 500, 110);
            graphics.drawString("3 ", 500, 150);
            graphics.drawString("4 ", 500, 190);
            graphics.drawString("5 ", 500, 230);
            graphics.drawString("6 ", 500, 270);
            graphics.drawString("7 ", 500, 310);
            graphics.drawString("8 ", 500, 350);
            graphics.drawString("9 ", 500, 390);
            graphics.drawString("10", 500, 430);
        }


//                    graphics.setColor(Color.green);
//            graphics.drawLine(i + 500, 120, 820, 80);
//            graphics.drawLine(i + 500, 120, 780, 80);
//            graphics.drawLine(i + 500, 120, 821, 80);
//            graphics.drawLine(i + 500, 120, 781, 80);
//            graphics.drawLine(i + 500, 120, 822, 80);
//            graphics.drawLine(i + 500, 120, 782, 80);


//        if (arr[p / 40][o / 40] == 0) {
//            graphics.setColor(Color.red);
//            graphics.drawOval(550, 90, 20, 20);
//            graphics.drawOval(590, 90, 20, 20);
//            graphics.drawOval(551, 90, 20, 20);
//            graphics.drawOval(591, 90, 20, 20);
//            graphics.drawOval(552, 90, 20, 20);
//            graphics.drawOval(592, 90, 20, 20);
//
//        } else {
//            graphics.setColor(Color.green);
//            graphics.drawLine(780, 120, 820, 80);
//            graphics.drawLine(820, 120, 780, 80);
//            graphics.drawLine(781, 120, 821, 80);
//            graphics.drawLine(821, 120, 781, 80);
//            graphics.drawLine(782, 120, 822, 80);
//            graphics.drawLine(822, 120, 782, 80);
//        }
        //graphics.fill3DRect(820, 80, 40, 40, true);

    }

    public static boolean fieldFree(int[][] arrFree, int line, int vertical) {
        boolean fieldFreeYN;

        if (arrFree[line][vertical] != 0) return false;
        if (line <= 8 && arrFree[line + 1][vertical] != 0) return false;
        if (line <= 8 && vertical <= 8 && arrFree[line + 1][vertical + 1] != 0) return false;
        if (vertical <= 8 && arrFree[line][vertical + 1] != 0) return false;
        if (line >= 1 && vertical <= 8 && arrFree[line - 1][vertical + 1] != 0) return false;
        if (line >= 1 && arrFree[line - 1][vertical] != 0) return false;
        if (line >= 1 && vertical >= 1 && arrFree[line - 1][vertical - 1] != 0) return false;
        if (vertical >= 1 && arrFree[line][vertical - 1] != 0) return false;
        if (line <= 8 && vertical >= 1 && arrFree[line + 1][vertical - 1] != 0) return false;

        {
            fieldFreeYN = true;
        }
        return fieldFreeYN;
    }

}
//        for(int i = 0;i <= 399;i += 40){
//
//            for ( int j = 0;j <= 399;j += 40) {
//                color = (int) Math.round((Math.random() * 11) + 1);
//                switch (color) {
//                    case 1:
//                        graphics.setColor(Color.pink);
//                        break;
//                    case 2:
//                        graphics.setColor(Color.black);;
//                        break;
//                    case 3:
//                        graphics.setColor(Color.white);
//                        break;
//                    case 4:
//                        graphics.setColor(Color.MAGENTA);
//                        break;
//                    case 5:
//                        graphics.setColor(Color.DARK_GRAY);
//                        break;
//                    case 6:
//                        graphics.setColor(Color.CYAN);
//                        break;
//                    case 7:
//                        graphics.setColor(Color.BLUE);
//                        break;
//                    case 8:
//                        graphics.setColor(Color.RED);
//                        break;
//                    case 9:
//                        graphics.setColor(Color.DARK_GRAY);
//                        break;
//                    case 10:
//                        graphics.setColor(Color.green);
//                        break;
//                    case 11:
//                        graphics.setColor(Color.yellow);
//                        break;
//                    case 12:
//                        graphics.setColor(Color.gray);
//                        break;
//                    default: System.out.println("а хули так получилось?");
//                }
//
//               graphics.fill3DRect(i,j,40,40,true);
//
//                }
//        }

//        graphics.setColor(Color.BLACK);
//        graphics.fill3DRect(40,120,120,40,true);
//        graphics.fill3DRect(200,120,120,40,true);
//        graphics.setColor(Color.PINK); x
//        graphics.fill3DRect(120,320,120,40,true);
//        graphics.fill3DRect(240,280,40,40,true);
//        graphics.fill3DRect(80,280,40,40,true);


////        graphics.fill3DRect(80,120,40,40,true);
//        graphics.fill3DRect(120,120,40,40,true);
//        graphics.fill3DRect(160,120,40,40,true);
//        for (int x = 0;x <= 400;x +=40) {
//            graphics.drawLine( x ,0 ,x,399);
//        }
//        int gh = 0;
//        int y = 0;
//        for (int counter = 0;counter < 11;counter++){
//            graphics.drawLine( 0 ,y ,399,gh );
//            gh += 40;
//            y += 40;
//        }




