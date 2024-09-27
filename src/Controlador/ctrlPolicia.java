
package Controlador;

import Modelo.Policia;
import Vista.FrmPolicia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ctrlPolicia implements ActionListener, MouseListener{
    
    //Llamar otros paquetes
    private FrmPolicia Vista;
    private Policia Modelo;
        
        public ctrlPolicia(FrmPolicia Vista, Policia Modelo){
            //Asignar Modelo y Vista
            this.Vista = Vista;
            this.Modelo = Modelo;
            
            //Agregar ActionListener
            this.Vista.btnAdd.addActionListener(this);
            this.Vista.btnUpdate.addActionListener(this);
            this.Vista.btnDelete.addActionListener(this);
            this.Vista.btnClear.addActionListener(this);
            
            //Agregar Mouse Listener
            this.Vista.jtbPolicia.addMouseListener(this);
            
            //Configurar JTable
            Modelo.SelectPolicia(Vista.jtbPolicia);
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton Agregar
        if (e.getSource() == Vista.btnAdd){
            
            //Validación de Datos
            if (Vista.txtNombre.getText().isEmpty() || Vista.txtEdad.getText().isEmpty() || Vista.txtPeso.getText().isEmpty() || Vista.txtCorreo.getText().isEmpty()){
                //Mostrar JOptionPane
                JOptionPane.showMessageDialog(Vista, "No pueden haber campos vacíos, intente nuevamente.");
            }
            else{
                //Asignar Datos
                Modelo.setNombre_Policia(Vista.txtNombre.getText());
            
                //Convertir Edad a int
                String edadTexto = Vista.txtEdad.getText().trim();
                int edad = Integer.parseInt(edadTexto);
                Modelo.setEdad_Policia(edad);
                
                //Convertir Peso a Double
                String pesoTexto = Vista.txtEdad.getText().trim();
                double peso = Double.parseDouble(pesoTexto);
                Modelo.setPeso_Policia(peso);

                Modelo.setCorreo_Policia(Vista.txtCorreo.getText());
                
                //Insertar Datos
                Modelo.InsertPolicia();
                
                //Select
                Modelo.SelectPolicia(Vista.jtbPolicia);
                
                //Limpiar Campos
                Vista.txtNombre.setText(null);
                Vista.txtEdad.setText(null);
                Vista.txtPeso.setText(null);
                Vista.txtCorreo.setText(null);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Cargar datos en TextField
        if (e.getSource() == Vista.jtbPolicia) {
            Modelo.LoadPolicia(Vista);
            System.out.println("Datos mostrados exitosamente\n");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
