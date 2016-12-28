/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Calculator;

import java.awt.event.*;
import java.io.IOException;

/**
 *
 * @author TRANDAISON
 */
public class main {

    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();


        
        calc.setTitle("Calculator v1.2");
        calc.setBounds(550, 220, 277, 246);
        calc.setVisible(true);
        //calc.setAlwaysOnTop(true);
        calc.setResizable(false);

        calc.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
            }
        });
    }
}

//    public static void main(String[] args) {
//        AboutCalc about = new AboutCalc();
//        about.setSize(350, 220);
//        about.setVisible(true);
//}
//}
