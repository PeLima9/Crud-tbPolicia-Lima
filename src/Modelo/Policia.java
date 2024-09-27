
package Modelo;

import Vista.FrmPolicia;
import java.sql.*;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Policia {
    private String UUID_Policia;
    private String Nombre_Policia;
    private int Edad_Policia;
    private double Peso_Policia;
    private String Correo_Policia;

    public String getUUID_Policia() {
        return UUID_Policia;
    }

    public void setUUID_Policia(String UUID_Policia) {
        this.UUID_Policia = UUID_Policia;
    }

    public String getNombre_Policia() {
        return Nombre_Policia;
    }

    public void setNombre_Policia(String Nombre_Policia) {
        this.Nombre_Policia = Nombre_Policia;
    }

    public int getEdad_Policia() {
        return Edad_Policia;
    }

    public void setEdad_Policia(int Edad_Policia) {
        this.Edad_Policia = Edad_Policia;
    }

    public double getPeso_Policia() {
        return Peso_Policia;
    }

    public void setPeso_Policia(int Peso_Policia) {
        this.Peso_Policia = Peso_Policia;
    }

    public String getCorreo_Policia() {
        return Correo_Policia;
    }

    public void setCorreo_Policia(String Correo_Policia) {
        this.Correo_Policia = Correo_Policia;
    }
    
    //Select
    public void SelectPolicia(JTable Table){
        //Conectar a Oracle
        Connection connection = ConnectionClass.getConnection();
        
        //Configurar Tabla
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"UUID_Policia", "Nombre_Policia", "Edad_Policia", "Peso_Policia", "Correo_Policia"});
        
        //Preparar Query
        try{
            Statement statement = connection.createStatement();
            
            //SQL Query
            ResultSet rs = statement.executeQuery("SELECT * FROM tbPolicia");
            
            //Agregar filas con datos
            while (rs.next()){
                model.addRow(new Object[]{
                rs.getString("UUID_Policia"),
                rs.getString("Nombre_Policia"),
                rs.getInt("Edad_Policia"),
                rs.getInt("Peso_Policia"),
                rs.getString("Correo_Policia")
                });
            }
            Table.setModel(model);
        }
        catch(Exception e){
            System.out.println("[Policia] Error en SelectPolicia: " + e + "\n");
        }
    }
    
    //Select
    public void LoadPolicia(FrmPolicia Vista){
        //Cargar fila seleccionada
        int selectedRow = Vista.jtbPolicia.getSelectedRow();

        //Verificar fila seleccionada
        if (selectedRow != -1){
            String uuidTb = Vista.jtbPolicia.getValueAt(selectedRow, 0).toString();
            String nombreTb = Vista.jtbPolicia.getValueAt(selectedRow, 1).toString();
            String edadTb = Vista.jtbPolicia.getValueAt(selectedRow, 2).toString();
            String pesoTb = Vista.jtbPolicia.getValueAt(selectedRow, 3).toString();
            String correoTb = Vista.jtbPolicia.getValueAt(selectedRow, 4).toString();
            
            //Asignar valores al TextField
            Vista.txtNombre.setText(nombreTb);
            Vista.txtEdad.setText(edadTb);
            Vista.txtPeso.setText(pesoTb);
            Vista.txtCorreo.setText(correoTb);
        }
    }
    
    //Insert
    public void InsertPolicia(){
        //Obtener Conexión
        Connection connection = ConnectionClass.getConnection();
        
        //Preparar Query
        try{
            PreparedStatement addPolicia = connection.prepareStatement("INSERT INTO tbPolicia (UUID_Policia, Nombre_Policia, Edad_Policia, Peso_Policia, Correo_Policia) VALUES (?, ?, ?, ?, ?)");
            
            //Establecer Valores
            addPolicia.setString(1, UUID.randomUUID().toString());
            addPolicia.setString(2, getNombre_Policia());
            addPolicia.setInt(3, getEdad_Policia());
            addPolicia.setDouble(4, getPeso_Policia());
            addPolicia.setString(5, getCorreo_Policia());
            
            //Ejecutar Query
            addPolicia.executeUpdate();
            
            //Imprimir en Consola
            System.out.println("Dato guardado exitosamente\n");
        }
        catch (Exception e){
            System.out.println("[Policia] Error en InsertPolicia" + e + "\n");
        }
    }
    
    //Update
    public void UpdatePolicia(JTable Tabla){
        //Obtener Conexión
        Connection connection = ConnectionClass.getConnection();
        
        //Seleccionar fila de la tabla
        int selectedRow = Tabla.getSelectedRow();
        if (selectedRow != 1) {
            String selectedUUID = Tabla.getValueAt(selectedRow, 0).toString();
            
            //Preparar Query
            try{
                //SQL Query
                PreparedStatement updatePolicia = connection.prepareStatement("UPDATE tbPolicia SET Nombre_Policia = ?, Edad_Policia = ?, Peso_Policia = ?, Correo_Policia = ? WHERE UUID_Policia = ?");
            
                //Asignar Valores
                updatePolicia.setString(1, getNombre_Policia());
                updatePolicia.setInt(2, getEdad_Policia());
                updatePolicia.setDouble(3, getPeso_Policia());
                updatePolicia.setString(4, getCorreo_Policia());
            
                //Asignar UUID
                updatePolicia.setString(5, selectedUUID);
                
                //Ejecutar Query
                updatePolicia.executeUpdate();
                
                //Imprimir en Consola
                System.out.println("Dato actualizado exitosamente\n");
                }
            catch (Exception e){
                System.out.println("[Policia] Error en UpdatePolicia: " + e + "\n");
            }
        }
    }
    
    //Delete
    public void DeletePolicia(JTable Tabla){
        //Obtener Conexión
        Connection connection = ConnectionClass.getConnection();
        
        //Seleccionar fila de la tabla
        int selectedRow = Tabla.getSelectedRow();
        String UUID = Tabla.getValueAt(selectedRow, 0).toString();
            
        //Preparar Query
        try{
            //SQL Query
            PreparedStatement deletePolicia = connection.prepareStatement("DELETE FROM Empleados WHERE UUID_Policia = ?");
            
            //Asignar Valores
            deletePolicia.setString(1, UUID);
            
            //Ejecutar Query
            deletePolicia.executeUpdate();

            //Imprimir en Consola
            System.out.println("Dato eliminado exitosamente \n");
        }
        catch (Exception e){
            System.out.println("[Policia] Error en DeletePolicia: " + e + "\n");
        }
    }   
}
