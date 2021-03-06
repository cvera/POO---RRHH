/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultarJInternalFrame.java
 *
 * Created on 13-abr-2012, 15:35:54
 */
package vistas;
import javax.swing.*;
import modelos.*;
import java.awt.event.KeyEvent;
import controladoras.*;
import java.util.ArrayList;
/**
 *
 * @author CARLOS
 */
public class EditarJInternalFrame extends javax.swing.JInternalFrame {
     private AdmUsuarios ae = new AdmUsuarios();
    /** Creates new form ConsultarJInternalFrame */
    public EditarJInternalFrame() {
        initComponents();
        inicializar();
    }
      private void inicializar() {
        limpiar();
        cargarUsuarios();
        
    }
      
      
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel4.setText("DNI");

        jLabel6.setText("Nombre");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido Paterno");

        txtCodigoUsuario.setEditable(false);
        txtCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Usuario");

        jLabel9.setText("Correo");

        jLabel10.setText("Fecha Ingreso");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Información General");

        txtBuscarcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarcodigoKeyPressed(evt);
            }
        });

        jLabel3.setText("Código Usuario");

        jLabel11.setText("Cargo");

        jLabel13.setText("Rol");

        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        lstUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstUsuariosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        jLabel1.setText("Buscar Código");

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });

        jLabel12.setText("Apelllido materno");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addGap(67, 67, 67))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDni)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                    .addGap(72, 72, 72)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)))
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void cargarUsuarios() {
        ArrayList lst = new ArrayList();
        ae.cargarUsuarios();
        lst = ae.getListaUsuarios();
        this.lstUsuarios.removeAll();
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < lst.size(); i++) {
            Usuario e = new Usuario();
            e = (Usuario) lst.get(i);
            Rol item = new Rol();
            item.setItem("(" + String.valueOf(e.getCodigoUsuario()) + ") " + e.getDni() + ", " + e.getNombre() + ", " + e.getApellidoPaterno() + "," + e.getApellidoMaterno() + ", " + e.getUserName() + ", " + e.getCorreoE()+ ", " + e.getFechaIngreso()+ ", " + e.getCargo() + ", " + e.getRol());
            item.setItemData(String.valueOf(e.getCodigoUsuario()));
            modelo.addElement(item);
        }
        this.lstUsuarios.setModel(modelo);
    }
    
     private void setDatos(Usuario e) {
        
        if (e != null) {
            this.txtCodigoUsuario.setText(String.valueOf(e.getCodigoUsuario()));
            this.txtDni.setText(e.getDni());
            this.txtNombre.setText(e.getNombre());
            this.txtApellidoPaterno.setText(e.getApellidoPaterno());
            this.txtApellidoMaterno.setText(e.getApellidoMaterno());
            this.txtUserName.setText(e.getUserName());
            this.txtFechaIngreso.setText(e.getFechaIngreso());
            this.txtCorreoE.setText(e.getCorreoE());
            this.txtCargo.setText(e.getCargo());
            this.txtRol.setText(e.getRol());
            
            
           }
    }

private void txtBuscarcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarcodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarUsuario();        // TODO add your handling code here:
        }
}//GEN-LAST:event_txtBuscarcodigoKeyPressed

private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
        int pos = lstUsuarios.getSelectedIndex();
        if (pos >= 0) {
            limpiar();
            seleccionarUsuario(pos);
        }
}//GEN-LAST:event_lstUsuariosMouseClicked

private void lstUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstUsuariosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int pos = lstUsuarios.getSelectedIndex();
            if (pos >= 0) {
                Rol item = new Rol();
                item = (Rol) this.lstUsuarios.getModel().getElementAt(pos);
                int codigoComparar = new Integer(item.getItemData().toString()).intValue();
                Usuario e = new Usuario();
                e = this.ae.buscarUsuario(codigoComparar);
                if (e != null) {
                    limpiar();
                    setDatos(e);
                }
            }
        }
}//GEN-LAST:event_lstUsuariosKeyPressed

private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtDniActionPerformed

private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtApellidoMaternoActionPerformed

private void txtCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtCodigoUsuarioActionPerformed
// validacion de usuario editado
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if (this.txtCodigoUsuario.getText().length() > 0) {
            int codigoComparar = new Integer(this.txtCodigoUsuario.getText()).intValue();
            int pos = this.ae.buscarPosUsuario(codigoComparar);
            if (pos >= 0) {
                try {
                    if (editarCuenta(pos)) {
                        eliminarCuenta(pos + 1);
                        JOptionPane.showMessageDialog(this, "Usuario editado satisfactoriamente", "Editar usuario", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex);
                }
            }
        }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
        cargarUsuarios();
                        
}//GEN-LAST:event_jButton2ActionPerformed
  private void limpiar() {
        this.txtCodigoUsuario.setText("");
        this.txtDni.setText("");
        this.txtNombre.setText("");
        this.txtApellidoPaterno.setText("");
        this.txtApellidoMaterno.setText("");
        this.txtUserName.setText("");
        this.txtCorreoE.setText("");
        this.txtFechaIngreso.setText("");
         this.txtCargo.setText("");
         this.txtRol.setText("");
        this.lstUsuarios.removeAll();
        
        
    }
    
  private boolean buscarUsuario() {
        if (this.txtBuscarcodigo.getText().length() > 0) {
            int codigoComparar = new Integer(this.txtBuscarcodigo.getText()).intValue();
            int pos = this.ae.buscarPosUsuario(codigoComparar);
            if (pos >= 0) {
                this.lstUsuarios.setSelectedIndex(pos);
                seleccionarUsuario(pos);
                return true;
            }
        }
        limpiar();
        cargarUsuarios();
        return false;
    }
private void seleccionarUsuario(int pos) {
        Rol item = new Rol();
        item = (Rol) this.lstUsuarios.getModel().getElementAt(pos);
        int codigoComparar = new Integer(item.getItemData().toString()).intValue();
        Usuario e = new Usuario();

        e = this.ae.buscarUsuario(codigoComparar);
        setDatos(e);
    }




private boolean editarCuenta(int pos) throws Exception {
        try {
            Usuario emp = new Usuario();
            
            if (this.txtCodigoUsuario.getText().length() > 0) {
            int codigo = new Integer(this.txtCodigoUsuario.getText()).intValue();
            emp.setCodigoUsuario(codigo);
        } else {
            JOptionPane.showMessageDialog(this, "Debe Ingresar el código del Usuario", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            
            if (this.txtDni.getText().length() > 0) {
                 emp.setDni(this.txtDni.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el Dni ", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            if (this.txtNombre.getText().length() > 0) {
                emp.setNombre(this.txtNombre.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el nombre ", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (this.txtApellidoPaterno.getText().length() > 0) {
                emp.setApellidoPaterno(this.txtApellidoPaterno.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el apellido Paterno", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
             if (this.txtApellidoMaterno.getText().length() > 0) {
                emp.setApellidoMaterno(this.txtApellidoMaterno.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el apellido Materno", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
             if (this.txtUserName.getText().length() > 0) {
                emp.setUserName(this.txtUserName.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el Usuario", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
             if (this.txtCorreoE.getText().length() > 0) {
                emp.setCorreoE(this.txtCorreoE.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el Correo", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
              if (this.txtFechaIngreso.getText().length() > 0) {
                emp.setFechaIngreso(this.txtFechaIngreso.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar la Fecha de Ingreso", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
              if (this.txtCargo.getText().length() > 0) {
                emp.setCargo(this.txtCargo.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Debe Ingresar el Cargo", "Ingresar Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }
              
                
           
             //Agrega El empleado al arreglo de usuarios
            ae.agregarUsuario(emp);
            //Guarda el arreglo de empleados al fichero
            ae.cargarArchivo();
           
           
           
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
        return true;
    }

    private void eliminarCuenta(int pos) throws Exception {
        if (pos >= 0) {
            ae.eliminarUsuario(pos);
            ae.cargarArchivo();
            cargarUsuarios();
        } else {
            throw new Exception("debe seleccionar una cuenta de la lista");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstUsuarios;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtBuscarcodigo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
