package Control;



import java.util.ArrayList;

import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.util.Properties;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;



public class Gestor implements ActionListener {

    private Vista vista;

    public Gestor() {
        this.vista = new Vista();
        
        this.vista.btnStart.addActionListener(this);
        this.vista.btnExit.addActionListener(this);

        iniciar();

    }

    public void iniciar() {
        this.vista.setTitle("Carrera de Caballos");

        // Lineas para cargar el properties por primera vez

        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnExit){
            System.exit(0);
        }
        
    }
}
