
//import java.awt.Cursor;
import java.awt.*;

/*
 * ClientInterface.java
 *
 * Created on March 19, 2009, 11:11 AM
 */
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;



/**
 *
 * @author  usherhymezz
 */
public class ClientInterface extends javax.swing.JFrame {

//    Client group1=new Client();

    /** Creates new form ClientInterface */
    public ClientInterface() {
        
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        java.awt.GridBagConstraints gridBagConstraints;
        
        mainPanel = new javax.swing.JPanel();
        name = new javax.swing.JTextArea();
        //use = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        //password = new javax.swing.JPasswordField();
        //go = new javax.swing.JButton("log in",new javax.swing.ImageIcon("resource/in.png"));
        //pasname = new javax.swing.JLabel();
        //pix = new javax.swing.JLabel(new javax.swing.ImageIcon("resource/fadis.png"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setBounds(new java.awt.Rectangle(1, 1, 1, 1));
        setForeground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        this.setPreferredSize(new Dimension(1200, 800));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBackground(new java.awt.Color(204, 255, 255));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        name.setColumns(10);
        name.setEditable(false);
        name.setRows(25);
        name.setToolTipText("Activities of Client");
        name.setDisabledTextColor(new  Color(255, 255, 255));
        name.setAutoscrolls(true);
        name.setBorder( BorderFactory.createBevelBorder( BevelBorder.RAISED));
        //jScrollPane1.setViewportView(name);

        //name.setColumns(javax.swing.JTextField.LEFT);
        //name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 255), 2, true));
        name.setText("\t\tMESSAGE ID \t\t SENDER'S NUMBER "); // NOI18N
        /*name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });*/
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.CENTER;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 100, 4, 100);
        mainPanel.add(name, gridBagConstraints);
/*
        use.setBackground(new java.awt.Color(51, 255, 255));
        use.setFont(new java.awt.Font("Tahoma", 1, 14));
        use.setForeground(new java.awt.Color(0, 0, 204));
        use.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        use.setText("USERNAME");
        use.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        use.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 300, 4, 4);
        mainPanel.add(use, gridBagConstraints);*/

        welcome.setBackground(new java.awt.Color(102, 0, 255));
        welcome.setFont(new java.awt.Font("Times New Roman", 1, 36));
        welcome.setForeground(new java.awt.Color(0, 0, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("WELCOME TO SUPS CLIENT");
        welcome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 2, true));
        welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        mainPanel.add(welcome, gridBagConstraints);

        /*password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255), 2));
        password.setName(""); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 250);
        mainPanel.add(password, gridBagConstraints);

        go.setCursor(new Cursor(Cursor.HAND_CURSOR));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        mainPanel.add(go, gridBagConstraints);

        pasname.setBackground(new java.awt.Color(51, 255, 255));
        pasname.setFont(new java.awt.Font("Tahoma", 1, 14));
        pasname.setForeground(new java.awt.Color(0, 0, 204));
        pasname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pasname.setText("PASSWORD");
        pasname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pasname.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        mainPanel.add(pasname, gridBagConstraints);
        
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 30, 60);
        mainPanel.add(pix, gridBagConstraints);*/

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(mainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
    new ClientInterface().setVisible(true);
    }
    });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //public javax.swing.JButton go;
    private javax.swing.JPanel mainPanel;
    public static javax.swing.JTextArea name;
    //private javax.swing.JLabel pasname;
    //public javax.swing.JPasswordField password;
    //public javax.swing.JLabel pix;
    //private javax.swing.JLabel use;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

}
