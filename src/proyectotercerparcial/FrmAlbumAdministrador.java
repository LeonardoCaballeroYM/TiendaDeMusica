package proyectotercerparcial;

import java.awt.Desktop;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAB01-PC23
 */
public class FrmAlbumAdministrador extends javax.swing.JFrame {

    int noClave = -1;
    Archivo archivo = new Archivo("Canciones.txt");
    Archivo archivoCompras = new Archivo("CancionesCompradas.txt");
    ArrayList<Cancion> listaCanciones = new ArrayList<>();
    ArrayList<Cancion> listaCancionesCompradas = new ArrayList<>();

    /**
     * Creates new form FrmAlbum1
     */
    public FrmAlbumAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Iconos/101-headset.png")).getImage());

        listaCanciones = archivo.leerArchivo();
        llenarTablaCanciones();

        listaCancionesCompradas = archivoCompras.leerArchivo();
        llenarCancionesCompradas();
    }

    private void llenarTablaCanciones() {
        DefaultTableModel llenar
                = (DefaultTableModel) tablaCanciones
                        .getModel();
        Object[] fila = new Object[8];
        for (int i = 0; i < tablaCanciones.getRowCount(); i++) {
            llenar.removeRow(i);
            i = i - 1;
        }
        //llenar tabla
        for (Cancion aux : listaCanciones) {
            fila[0] = aux.getClave();
            fila[1] = aux.getNombreCancion();
            fila[2] = aux.getNombreCantante();
            fila[3] = aux.getGenero();
            fila[4] = aux.getPortada();
            fila[5] = aux.getAlbum();
            fila[6] = aux.getArchivo();
            fila[7] = aux.getPrecio();
            llenar.addRow(fila);
        }

    }

    public void LimpiarCajas() {
        txtClave.setText("");
        txtNombreCancion.setText("");
        txtNombreCantante.setText("");
        txtGenero.setText("");
        txtPortada.setText("");
        txtAlbum.setText("");
        txtArchivo.setText("");
        txtPrecio.setText("");

    }

    private void llenarCancionesCompradas() {
        DefaultTableModel llenar
                = (DefaultTableModel) tablaCompradas
                        .getModel();
        Object[] fila = new Object[8];
        for (int i = 0; i < tablaCompradas.getRowCount(); i++) {
            llenar.removeRow(i);
            i = i - 1;
        }
        //llenar tabla
        for (Cancion aux : listaCancionesCompradas) {
            fila[0] = aux.getClave();
            fila[1] = aux.getNombreCancion();
            fila[2] = aux.getNombreCantante();
            fila[3] = aux.getGenero();
            fila[4] = aux.getPortada();
            fila[5] = aux.getAlbum();
            fila[6] = aux.getArchivo();
            fila[7] = aux.getPrecio();
            llenar.addRow(fila);
        }

    }

    private boolean cuentaRepetida() {
        for (Cancion aux : listaCanciones) {
            if (noClave == aux.getClave()) {
                return true;
            }
        }
        return false;
    }

    private boolean buscar() {
        for (Cancion aux : listaCancionesCompradas) {
            if (noClave == aux.getClave()) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarCajas() {

        try {
            if (txtClave.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner la clave");
            }
            if (txtNombreCancion.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el nombre de la cancion");
            }
            if (txtNombreCantante.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el nombre del cantante");
            }
            if (txtGenero.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el genero");
            }
            if (txtPortada.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el nombre de la portada");
            }
            if (txtAlbum.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el nombre del album");
            }
            if (txtArchivo.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el nombre del archivo");
            }
            if (txtPrecio.getText().compareTo("") == 0) {
                throw new Exception(
                        "Debe poner el precio");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage());
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombreCancion = new javax.swing.JTextField();
        txtNombreCantante = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtPortada = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtArchivo = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCanciones = new javax.swing.JTable();
        btnVerPagina = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtClaveBuscar = new javax.swing.JTextField();
        btnBuscarClave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCompradas = new javax.swing.JTable();
        btnVerPagina1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu del administrador");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clave:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre de la Cancion:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, -1));
        jPanel1.add(txtNombreCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));
        jPanel1.add(txtNombreCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre del Cantante:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Genero:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));
        jPanel1.add(txtPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Portada:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Album:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Archivo:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Precio:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 178, -1));
        jPanel1.add(txtArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 180, -1));
        jPanel1.add(txtAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 178, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-investment-3_15x15.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x-button_15x15.png"))); // NOI18N
        jButton1.setText("Cerrar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ac7fc9e1623686abf9112482b842a49b.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 270, 240));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 380, 290));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 340, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/tumblr_static_keith_haring_windows_theme_by_impotentgrandpa-d4njqpe.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 350));

        jTabbedPane1.addTab("Registro de canciones", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCanciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        tablaCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Cancion", "Cantante", "Genero", "Portada", "Album", "Archivo", "Precio"
            }
        ));
        tablaCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCancionesMouseClicked(evt);
            }
        });
        tablaCanciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaCancionesKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCanciones);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 190));

        btnVerPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-investment-3_15x15.png"))); // NOI18N
        btnVerPagina.setText("Ver pagina web");
        btnVerPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPaginaActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 268, -1, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x-button_15x15.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 268, -1, -1));

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-safe-box_15x15.png"))); // NOI18N
        btnCambiar.setText("Editar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 268, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dame clave a buscar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 322, -1, -1));
        jPanel2.add(txtClaveBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 319, 100, -1));

        btnBuscarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-stats-6_15x15.png"))); // NOI18N
        btnBuscarClave.setText("Buscar clave");
        btnBuscarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 318, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Canciones dadas de alta");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 820, 220));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Patterns--FhIGWn.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 630, 350));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Patterns--FhIGWn.png"))); // NOI18N
        jLabel9.setText("jLabel7");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        jTabbedPane1.addTab("Mostrar registro", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCompradas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaCompradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Cancion", "Cantante", "Genero", "Portada", "Album", "Archivo", "Precio"
            }
        ));
        jScrollPane4.setViewportView(tablaCompradas);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 190));

        btnVerPagina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-investment-3_15x15.png"))); // NOI18N
        btnVerPagina1.setText("Ver pagina web de compras realizadas por usuarios");
        btnVerPagina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPagina1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerPagina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Canciones compradas por usuarios");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel11.setText("jLabel11");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, 230));

        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 400, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMG_20161120_165313.jpg"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 350));

        jTabbedPane1.addTab("Reporte Canciones Compradas", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));

        image.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 255, 255)));
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 310, 220));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/101-stats-6_15x15.png"))); // NOI18N
        btnBuscar.setText("Buscar clave");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        txtDatos.setBackground(new java.awt.Color(102, 102, 102));
        txtDatos.setColumns(20);
        txtDatos.setForeground(new java.awt.Color(255, 255, 255));
        txtDatos.setRows(5);
        txtDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtDatos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 370, 200));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Buscar los datos de las canciones");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel29.setText("jLabel29");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, 280));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 310, 90));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 130));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 540, 90));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 310, 130));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 540, 130));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aranzasinte___BaxxmgigUxx___.jpg"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 310, 130));

        jTabbedPane1.addTab("Busqueda datos de la cancion", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!verificarCajas()) {
            return;

        }
        try {
            int Clave = Integer.parseInt(txtClave.getText());
            String NombreCancion = txtNombreCancion.getText();
            String NombreCantante = txtNombreCantante.getText();
            String Genero = txtGenero.getText();
            String Portada = txtPortada.getText();
            String Album = txtAlbum.getText();
            String Archivo = txtArchivo.getText();
            double Precio = Double.parseDouble(txtPrecio.getText());
            Cancion registro = new Cancion(Clave, NombreCancion,
                    NombreCantante, Genero, Portada, Album, Archivo, Precio);
            listaCanciones.add(registro);
            archivo.EscribirArchivo(listaCanciones);
            llenarTablaCanciones();
            LimpiarCajas();
            JOptionPane.showMessageDialog(this,
                    "Registro dado de alta");
        } catch (NumberFormatException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(this, "Debe ingresar valores enteros",
                    "Error", 0);
        }
        if (cuentaRepetida() == true) {
            JOptionPane.showMessageDialog(this, "Ya comprado");
            return;
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVerPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPaginaActionPerformed
        PaginaWebAdmin pagweb = new PaginaWebAdmin("CancionesAd.html");
        pagweb.EscribirArchivo(listaCanciones);
        //abrir el archivo en el programador
        try {
            File pagina = new File("CancionesAd.html");
            Desktop.getDesktop().open(pagina);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnVerPaginaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            int busca = Integer.parseInt(txtBuscar.getText());
            for (Cancion aux : listaCanciones) {
                if (aux.getClave() == busca) {
                    txtDatos.setText(aux.toString());
                    String path = "img/" + aux.getPortada() + ".jpg";
                    ImageIcon fot = new ImageIcon(path);
                    Icon icono2 = new ImageIcon(fot.getImage().getScaledInstance(
                            image.getWidth(), image.getHeight(),
                            Image.SCALE_DEFAULT));
                    image.setIcon(icono2);
                    this.repaint();
                    return;
                }
            }
            String path = "img/no.jpg";
            ImageIcon fot = new ImageIcon(path);
            Icon icono2 = new ImageIcon(fot.getImage().getScaledInstance(
                    image.getWidth(), image.getHeight(),
                    Image.SCALE_DEFAULT));
            image.setIcon(icono2);
            this.repaint();
            txtDatos.setText("No se encontro");
        } catch (NumberFormatException ex) {
            System.out.println("Error:" + ex);
            JOptionPane.showMessageDialog(this, "Debe ingresar valores enteros",
                    "Error", 0);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (noClave == -1) {
            JOptionPane.showMessageDialog(this, "Debe tener un registro activo");
            return;
        }
        int boton = JOptionPane.showConfirmDialog(this, "Desea borrar este elemento?",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (boton == JOptionPane.YES_OPTION) {
            Iterator<Cancion> iteratorX = listaCanciones.iterator();
            while (iteratorX.hasNext()) {
                if (iteratorX.next().getClave() == noClave) {
                    iteratorX.remove();
                    JOptionPane.showMessageDialog(this, "Eliminado");
                    archivo.EscribirArchivo(listaCanciones);
                    noClave = -1;
                    llenarTablaCanciones();
                }
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (noClave == -1) {
            JOptionPane.showMessageDialog(this, "Debe tener un registro activo");
            return;
        }
        for (Cancion aux : listaCanciones) {
            if (noClave == aux.getClave()) {
                FrmEditar frm = new FrmEditar(aux);
                frm.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnBuscarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClaveActionPerformed
        if (txtClaveBuscar.getText().compareTo("") == 0) {
            llenarTablaCanciones();
            return;
        }
        int claveB;
        try {
            claveB = Integer.parseInt(txtClaveBuscar.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe escibir numero");
            return;
        }
        DefaultTableModel llenar = (DefaultTableModel) tablaCanciones.getModel();
        Object[] fila = new Object[8];
        //limpiar tabla
        for (int i = 0; i < tablaCanciones.getRowCount(); i++) {
            llenar.removeRow(i);
            i = i - 1;
        }
        //PONER EL ELEMENTO EN LA TABLA, SI LO ENCUENTRA
        for (Cancion aux : listaCanciones) {
            if (aux.getClave() == claveB) {
                fila[0] = aux.getClave();
                fila[1] = aux.getNombreCancion();
                fila[2] = aux.getNombreCantante();
                fila[3] = aux.getGenero();
                fila[4] = aux.getPortada();
                fila[5] = aux.getAlbum();
                fila[6] = aux.getArchivo();
                fila[7] = aux.getPrecio();
                llenar.addRow(fila);

            }

        }
    }//GEN-LAST:event_btnBuscarClaveActionPerformed

    private void tablaCancionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaCancionesKeyReleased
        if (tablaCanciones.getSelectedRows().length > 0) {
            int fila = tablaCanciones.getSelectedRow();
            noClave = Integer.parseInt(String.valueOf(
                    tablaCanciones.getValueAt(fila, 0)));

        }
    }//GEN-LAST:event_tablaCancionesKeyReleased

    private void tablaCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCancionesMouseClicked
        int fila = tablaCanciones.getSelectedRow();
        noClave = Integer.parseInt(String.valueOf(
                tablaCanciones.getValueAt(fila, 0)));
    }//GEN-LAST:event_tablaCancionesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmLoginAdministrador P1 = new FrmLoginAdministrador();
        P1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVerPagina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPagina1ActionPerformed
        PaginaWebCompras pagweb = new PaginaWebCompras("Canciones.html");
        pagweb.EscribirArchivo(listaCancionesCompradas);
        //abrir el archivo en el programador
        try {
            File pagina = new File("Canciones.html");
            Desktop.getDesktop().open(pagina);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnVerPagina1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlbumAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlbumAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlbumAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlbumAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlbumAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarClave;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnVerPagina;
    private javax.swing.JButton btnVerPagina1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaCanciones;
    private javax.swing.JTable tablaCompradas;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClaveBuscar;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombreCancion;
    private javax.swing.JTextField txtNombreCantante;
    private javax.swing.JTextField txtPortada;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
