package evalti;

import java.awt.Image;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author LuikFear
 */
public class ModUs extends javax.swing.JFrame {

    int estado;
    int usuario = 0;
    int usuario_id = -1;

    /**
     * Creates new form ModUs
     */
    public ModUs(usuarios usuario) {
        initComponents();
        this.setLocationRelativeTo(this);
        SetimageLabel(jLabel1, "src/pic/Mod.png");
//        SetimageLabel(jLabel2,"src/pic/edge.gif");
//        SetimageLabel(jLabel3,"src/pictures/frame select.gif");
//        SetimageLabel(jLabel4,"src/pictures/frame select.gif");
        cargar(usuario);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JTfecha = new javax.swing.JTextField();
        JTnombre = new javax.swing.JTextField();
        JTapellido = new javax.swing.JTextField();
        JTelefono = new javax.swing.JTextField();
        JTdireccion = new javax.swing.JTextField();
        JTcorreo = new javax.swing.JTextField();
        PFcontra = new javax.swing.JPasswordField();
        JRinactivo = new javax.swing.JRadioButton();
        JRactivo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(450, 580));

        jPanel1.setPreferredSize(new java.awt.Dimension(580, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTfechaActionPerformed(evt);
            }
        });
        jPanel1.add(JTfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, 260, 30));
        jPanel1.add(JTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 260, 30));
        jPanel1.add(JTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, 260, 30));
        jPanel1.add(JTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 98, 260, 30));
        jPanel1.add(JTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, 30));
        jPanel1.add(JTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 162, 260, 30));

        PFcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFcontraActionPerformed(evt);
            }
        });
        jPanel1.add(PFcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 30));

        grupo1.add(JRinactivo);
        jPanel1.add(JRinactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 305, -1, -1));

        grupo1.add(JRactivo);
        JRactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRactivoActionPerformed(evt);
            }
        });
        jPanel1.add(JRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 305, -1, -1));

        jButton1.setText("Agregar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 80));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Mod.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTfechaActionPerformed

    private void PFcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PFcontraActionPerformed

    private void JRactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRactivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_JRactivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (JTapellido.getText().isEmpty() && JTnombre.getText().isEmpty()
                && JTfecha.getText().isEmpty() && JTdireccion.getText().isEmpty() && JTelefono.getText().isEmpty() && PFcontra.getText().isEmpty() && JTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        } else {
            enviar();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        MainUs Newframe = new MainUs();
        Newframe.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Mostrar(int usuario_id) {

        usuario = usuario_id;
        UsuariosDAORelacional sd = new UsuariosDAORelacional();

        usuarios usuarios = sd.obtener(usuario_id);

        JTnombre.setText(usuarios.getNombre() + "");
        JTapellido.setText(usuarios.getApellido() + "");
        JTelefono.setText(usuarios.getTelefono() + "");
        JTdireccion.setText(usuarios.getDireccion() + "");
        JTcorreo.setText(usuarios.getCorreo() + "");
        JTfecha.setText(usuarios.getFecha_nacimiento() + "");
        PFcontra.setText(usuarios.getContra() + "");

    }

    private void enviar() {
        ButtonModel seleccion = grupo1.getSelection();
        int valor = seleccion.equals(JRactivo.getModel()) ? 1 : 0;
        usuarios US = new usuarios(usuario_id, JTnombre.getText(), JTapellido.getText(), Integer.parseInt(JTelefono.getText()), JTdireccion.getText(), JTcorreo.getText(), JTfecha.getText(), 2, valor, PFcontra.getText());
        UsuariosDAORelacional ud = new UsuariosDAORelacional();
        ud.mod(US);
        MainUs Newframe = new MainUs();
        Newframe.setVisible(true);
        dispose();

    }

    private void SetimageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));

        labelName.setIcon(icon);
        this.repaint();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRactivo;
    private javax.swing.JRadioButton JRinactivo;
    private javax.swing.JTextField JTapellido;
    private javax.swing.JTextField JTcorreo;
    private javax.swing.JTextField JTdireccion;
    private javax.swing.JTextField JTelefono;
    private javax.swing.JTextField JTfecha;
    private javax.swing.JTextField JTnombre;
    private javax.swing.JPasswordField PFcontra;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void cargar(usuarios usuario) {
        JTnombre.setText(usuario.getNombre());
        JTapellido.setText(usuario.getApellido());
        JTelefono.setText(String.valueOf(usuario.getTelefono()));
        JTdireccion.setText(usuario.getDireccion());
        JTcorreo.setText(usuario.getCorreo());
        JTfecha.setText(usuario.getFecha_nacimiento());
        PFcontra.setText(usuario.getContra());
        int estado;
        estado = usuario.getEstado();
        if (estado == 1) {
            JRactivo.setSelected(true);
        } else {
            JRinactivo.setSelected(true);
        }
        usuario_id = usuario.getUsuario_id();
    }
}
