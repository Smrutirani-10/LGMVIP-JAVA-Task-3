
//Scientific Calculator for LetsGrowMore tasks-3


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorLGM implements ActionListener{

    JFrame frame;
    JLabel label1, label2, labelResult;
    JTextField tf1, tf2 ,tfResult;
    JButton btnPlus, btnMinus, btnMultiplication, btnDivide, btnModulo, btnPower, btnFactorial, btnRoot;
    JButton btnSin, btnCos, btnTan, btnCosec, btnSec, btnCot, btnLog, btnMod, btnP, btnC, btnE;
    CalculatorLGM() {
        frame = new JFrame("Scientific Calculator");
        frame.setLayout(null);
        frame.setLocation(500,100);
        frame.setSize(350,450);

        
        label1 = new JLabel("First No: ");
        label1.setBounds(20,10,70,20);
        frame.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(100,10,85,20);
        frame.add(tf1);

        label2 = new JLabel("Second No: ");
        label2.setBounds(20,50,70,20);
        frame.add(label2);

        tf2 = new JTextField();
        tf2.setBounds(100,50,85,20);
        frame.add(tf2);

        labelResult = new JLabel("Result");
        labelResult.setBounds(205,25,70,20);
        frame.add(labelResult);

        tfResult = new JTextField();
        tfResult.setBounds(205,50,120,20);
        frame.add(tfResult);

        btnPlus = new JButton("+");
        btnPlus.setBounds(20,90,50,40);
        frame.add(btnPlus);
        btnPlus.addActionListener(this);

        btnMinus = new JButton("-");
        btnMinus.setBounds(100,90,50,40);
        frame.add(btnMinus);
        btnMinus.addActionListener(this);

        btnMultiplication = new JButton("X");
        btnMultiplication.setBounds(180,90,50,40);
        frame.add(btnMultiplication);
        btnMultiplication.addActionListener(this);

        btnDivide = new JButton("/");
        btnDivide.setBounds(260,90,50,40);
        frame.add(btnDivide);
        btnDivide.addActionListener(this);

        btnModulo = new JButton("%");
        btnModulo.setBounds(20,150,50,40);
        frame.add(btnModulo);
        btnModulo.addActionListener(this);

        btnPower = new JButton("^");
        btnPower.setBounds(100,150,50,40);
        frame.add(btnPower);
        btnPower.addActionListener(this);

        btnFactorial = new JButton("x!");
        btnFactorial.setBounds(180,150,50,40);
        frame.add(btnFactorial);
        btnFactorial.addActionListener(this);

        btnRoot = new JButton("Root");
        btnRoot.setBounds(255,150,65,40);
        frame.add(btnRoot);
        btnRoot.addActionListener(this);

        btnSin = new JButton("sin");
        btnSin.setBounds(20,210,60,40);
        frame.add(btnSin);
        btnSin.addActionListener(this);

        btnCos = new JButton("cos");
        btnCos.setBounds(100,210,60,40);
        frame.add(btnCos);
        btnCos.addActionListener(this);

        btnTan = new JButton("tan");
        btnTan.setBounds(180,210,60,40);
        frame.add(btnTan);
        btnTan.addActionListener(this);

        btnLog = new JButton("log");
        btnLog.setBounds(255,210,60,40);
        frame.add(btnLog);
        btnLog.addActionListener(this);

        btnCosec = new JButton("cosec");
        btnCosec.setBounds(20,270,70,40);
        frame.add(btnCosec);
        btnCosec.addActionListener(this);

        btnSec = new JButton("sec");
        btnSec.setBounds(100,270,60,40);
        frame.add(btnSec);
        btnSec.addActionListener(this);

        btnCot = new JButton("cot");
        btnCot.setBounds(180,270,60,40);
        frame.add(btnCot);
        btnCot.addActionListener(this);

        btnMod = new JButton("|x|");
        btnMod.setBounds(255,270,60,40);
        frame.add(btnMod);
        btnMod.addActionListener(this);

        btnP = new JButton("nPr");
        btnP.setBounds(20,330,60,40);
        frame.add(btnP);
        btnP.addActionListener(this);

        btnC = new JButton("nCr");
        btnC.setBounds(100,330,60,40);
        frame.add(btnC);
        btnC.addActionListener(this);

        btnE = new JButton("e^x");
        btnE.setBounds(180,330,60,40);
        frame.add(btnE);
        btnE.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public double fact(double n){
        double f=1;
        for(int i=2;i<=n;i++) { f = f*i; }
        return f;
    }
    public void actionPerformed(ActionEvent ae){

        double c = 0;
        if(ae.getSource().equals(btnPlus) || ae.getSource().equals(btnMinus)
        || ae.getSource().equals(btnMultiplication) ||ae.getSource().equals(btnDivide)
        || ae.getSource().equals(btnModulo) || ae.getSource().equals(btnPower)
        || ae.getSource().equals(btnP) || ae.getSource().equals(btnC) )
        {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());

            if(ae.getSource().equals(btnPlus)){
                c = a + b;
            }
            else if(ae.getSource().equals(btnMinus)){
                c = a - b;
            }
            else if(ae.getSource().equals(btnMultiplication)){
                c = a * b;
            }
            else if(ae.getSource().equals(btnDivide)){
                c = a / b;
            }
            else if(ae.getSource().equals(btnModulo)){
                c = a % b;
            }
            else if(ae.getSource().equals(btnPower)){
                c = Math.pow(a,b);
            }
            else if(ae.getSource().equals(btnP)){
                c = fact(a)/fact(a-b);
            }
            else if(ae.getSource().equals(btnC)){
                c = fact(a) / (fact(b) * fact(a-b)) ;
            }
        }
        else {
            double a = Double.parseDouble(tf1.getText());
            if(ae.getSource().equals(btnFactorial)) {
                c = 1;
                for (int i = 2; i <= a; i++) {
                    c = c * i;
                }
            }
            else if(ae.getSource().equals(btnRoot)){
                c = Math.sqrt(a);
            }
            else if(ae.getSource().equals(btnSin)){
                c = Math.sin(a);
            }
            else if(ae.getSource().equals(btnCos)){
                c = Math.cos(a);
            }
            else if(ae.getSource().equals(btnTan)){
                c = Math.tan(a);
            }
            else if(ae.getSource().equals(btnLog)){
                c = Math.log(a);
            }
            else if(ae.getSource().equals(btnCosec)){
                c = 1/Math.sin(a);
            }
            else if(ae.getSource().equals(btnSec)){
                c = 1/Math.cos(a);
            }
            else if(ae.getSource().equals(btnCot)){
                c = 1/Math.tan(a);
            }
            else if(ae.getSource().equals(btnMod)){
                c = Math.abs(a);
            }
            else if(ae.getSource().equals(btnE)){
                c = Math.pow(2.718281828,a) ;
            }
        }
        tfResult.setText(""+c);
    }

    public static void main(String[] args) {
        CalculatorLGM obj = new CalculatorLGM();
    }
}
