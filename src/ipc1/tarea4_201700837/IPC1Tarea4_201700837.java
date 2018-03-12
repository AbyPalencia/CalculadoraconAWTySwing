
package ipc1.tarea4_201700837;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IPC1Tarea4_201700837 implements ActionListener {
JFrame v=new JFrame("Calculadora"); //Objeto de la clase JFrame, aqui se crea la ventana
JLabel uno=new JLabel("Ingrese el primer número ");//Se crea un texto
JTextField t1=new JTextField(5);//se crea un cuadro para ingresar texto
JLabel dos=new JLabel("Ingrese el segundo número ");
JTextField t2=new JTextField(5);//el 5 se refiere al tamaño del cuadro
JLabel tres=new JLabel("El resultado es = ");//Se crea un texto
JLabel esp=new JLabel("____________________________");//Se crea un texto
JLabel resultado=new JLabel("");//Se crea un texto para mostrar el resultado
JButton b1=new JButton("+"); //Se crea un botón
JButton b2=new JButton("-"); //Se crea un botón
JButton b3=new JButton("x"); //Se crea un botón
JButton b4=new JButton("/"); //Se crea un botón
JButton b5=new JButton("="); //Se crea un botón
    
IPC1Tarea4_201700837(){ //_________CONSTRUCTOR_____________
v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta es para que se cierre por defecto
v.setSize(250,200);//El tamaño de la ventana
v.setLocationRelativeTo(null); //Para que la ventana aparezca en el centro
v.setLayout(new FlowLayout());
v.setResizable(false);//para que no cambie el tamaño de la ventana
v.setVisible(true);//Para que sea visible la ventana

v.add(uno); 
v.add(t1);
v.add(dos);
v.add(t2);
v.add(tres); 
v.add(resultado);
v.add(esp);
//Agregar botones
v.add(b1);
b1.addActionListener(this);
v.add(b2);
b2.addActionListener(this);
v.add(b3);
b3.addActionListener(this);
v.add(b4);
b4.addActionListener(this);
v.add(b5);
b5.addActionListener(this);
 
}
    public static void main(String[] args) {
            new IPC1Tarea4_201700837();        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object a =ae.getSource();//SE CREA UN OBJETO
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int r;
        
        
        if(a==b1){ //SÌ SELECCIONA EL BOTÓN DE SUMAR
        r= n1+n2;
        String total=String.valueOf(r);
        resultado.setText(total);
        //JOptionPane.showMessageDialog(null, "El resultado es "+r,"Resultado de la operacion", JOptionPane.INFORMATION_MESSAGE);
        //t1.setText(null);//PARA LIMPIAR LOS CUADROS DE TEXTO
       // t2.setText(null);
        }
        
        if(a==b2){ //SÍ SELECCIONA EL BOTÓN DE RESTAR
        r= n1-n2;
        String total=String.valueOf(r);
        resultado.setText(total);
        }
         
        if(a==b3){ //SÍ SELECCIONA EL BOTÓN DE MULTIPLICAR
        r= n1*n2;
        String total=String.valueOf(r);
        resultado.setText(total);
        }
           
        if(a==b4){ //SÍ SELECCIONA EL BOTÓN DE DIVIDIR
        r= n1/n2;
        String total=String.valueOf(r);
        resultado.setText(total);
        }
        
        if(a==b5){ //SÍ SELECCIONA EL BOTÓN DE IGUAL
            if(n1==n2){
              resultado.setText("Los números son iguales");  
            }else{
                resultado.setText("Los números son diferentes");
            }
        }
    }
    
}
