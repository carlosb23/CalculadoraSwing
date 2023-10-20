package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.String.*;

/**
 * Esta clase representa una calculadora GUI con operaciones básicas.
 * Permite realizar operaciones de suma, resta, multiplicación y división.(Añadi tambien la raiz cuadrada y numeros negativos)
 * Además, incluye funciones para borrar la pantalla y encender/apagar la calculadora.
 */
public class VentanaCarculadora extends JFrame {


    private JPanel Calculadora;
    private JTextField Pantalla;
    private JButton xButton;
    private JButton ACButton;
    private JButton ONButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton button12;
    private JButton a1Button;
    private JButton button14;
    private JButton a5Button;
    private JButton button9;
    private JButton button17;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton Button0;
    private JButton Punto;
    private JButton igualButton;
    private JButton Raiz;
    private boolean calculadoraEncendida = false;
    double a, b, result;
    String op;

    /**
     * Constructor de la clase VentanaCalculadora.
     * Inicializa la interfaz gráfica de la calculadora y configura los botones y acciones.
     */
    public VentanaCarculadora() {

        this.setContentPane(Calculadora);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("CalculadoraSwing");
        Pantalla.setText("0");
        pack();

        //Cambio de icono
        this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("calculadora.png")).getImage());



        ACButton.addActionListener(new ActionListener() {

            /**
             * Maneja las acciones de los botones de la calculadora.
             * @param e El evento de acción que desencadena la operación.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a7Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a7Button.getText());
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a8Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a8Button.getText());
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a9Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a9Button.getText());
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a4Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a4Button.getText());
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a5Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a5Button.getText());
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a6Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a6Button.getText());
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a1Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a1Button.getText());
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a2Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a2Button.getText());
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(a3Button.getText());
                } else {
                    Pantalla.setText(pantallaText + a3Button.getText());
                }
            }
        });
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.equals("0")) {
                    Pantalla.setText(Button0.getText());
                } else {
                    Pantalla.setText(pantallaText + Button0.getText());
                }
            }
        });
        Punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Pantalla.getText().contains(".")){
                    Pantalla.setText(Pantalla.getText() + Punto.getText());
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Pantalla.getText());
                op = "+";
                Pantalla.setText("");
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantallaText = Pantalla.getText();
                if (pantallaText.isEmpty()) {
                    Pantalla.setText("-");
                } else {
                    a = Double.parseDouble(pantallaText);
                    op = "-";
                    Pantalla.setText("");
                }
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Pantalla.getText());
                op = "*";
                Pantalla.setText("");
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Pantalla.getText());
                op = "/";
                Pantalla.setText("");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if(Pantalla.getText().length()>0){
                    StringBuilder str = new StringBuilder(Pantalla.getText());
                    str.deleteCharAt(Pantalla.getText().length() - 1);
                    backspace = valueOf(str);
                    Pantalla.setText(backspace);
                }
            }
        });
        igualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(Pantalla.getText());
                if(op == "+"){
                    result= a+b;
                    Pantalla.setText(String.valueOf(result));
                } else if (op == "-") {
                    result= a-b;
                    Pantalla.setText(String.valueOf(result));
                }else if (op == "*") {
                    result= a*b;
                    Pantalla.setText(String.valueOf(result));
                }else if (op == "/") {
                    result= a/b;
                    Pantalla.setText(String.valueOf(result));
                }

                if (result % 1 == 0) {
                    Pantalla.setText(String.valueOf((int)result)); // Convierte result a int
                } else {
                    Pantalla.setText(String.valueOf(result)); // Muestra el número de coma flotante
                }
            }
        });

        //esto es una mejora que implemento apagarla y endenderla
        ONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton[] botones = {xButton,ACButton,a7Button,a4Button,a8Button,a2Button,button12,a1Button,button14,
                        a5Button,button9,button17,a9Button,a6Button,a3Button,Button0,Punto,igualButton,Raiz};
                calculadoraEncendida = !calculadoraEncendida; // Cambia el estado de la calculadora
                if (calculadoraEncendida) {
                    ONButton.setText("ON");
                    ONButton.setBackground(Color.GREEN);
                    habilitarBotones(botones);
                    Pantalla.setEnabled(true);
                } else {
                    ONButton.setText("OFF");
                    ONButton.setBackground(Color.RED);
                    deshabilitarBotones(botones);
                }


            }
            /**
             * Deshabilita un conjunto de botones de la calculadora.
             * @param botones Arreglo de botones a deshabilitar.
             */
            private void deshabilitarBotones(JButton[] botones) {
                for (JButton boton: botones){
                    boton.setEnabled(false);
                }
                Pantalla.setEnabled(false);
            }
            /**
             * Habilita un conjunto de botones de la calculadora.
             * @param botones Arreglo de botones a habilitar.
             */
            private void habilitarBotones(JButton[] botones) {
                for (JButton boton : botones){
                    boton.setEnabled(true);
                }
            }
        });


        Raiz.addActionListener(new ActionListener() {
            /**
             * Maneja la acción del botón de raíz cuadrada.
             * Calcula y muestra la raíz cuadrada del número en pantalla si es no negativo.
             * En caso de un número negativo, muestra un mensaje de error temporal.
             * @param e El evento de acción que desencadena la operación.
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(Pantalla.getText());
                if (numero >= 0) {
                    //No sabia como calcular la raiz busque en internet y decian que se hace con sqrt y si que va
                    double resultado = Math.sqrt(numero);
                    Pantalla.setText(String.valueOf(resultado));
                } else {
                    Pantalla.setForeground(Color.red);
                    Pantalla.setText("Error: No Raices negativas");

                    Timer timer = new Timer(4000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Pantalla.setForeground(Color.BLACK);
                            Pantalla.setText("");
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();

                }
            }
        });
    }
    /**
     * Muestra la ventana de la calculadora haciendo que sea visible para el usuario.
     */
    public void load(){
        setVisible(true);
    }
}
