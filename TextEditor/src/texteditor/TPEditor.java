
package texteditor;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.undo.UndoManager;import javax.swing.event.CaretListener;


public class TPEditor {
    //Instancies finestra
    private JFrame finestraPrincipal;
    private JMenuBar barraMenu;
    private JToolBar barraEines;
    private JTextArea areaText;
    private JPopupMenu menuEmergent;
    private JPanel barraEstat;
    
    //Instancies menu accessibles
    private JCheckBoxMenuItem lineWrap;
    private JCheckBoxMenuItem mostrarBarraEines;
    private JCheckBoxMenuItem fixarBarraEines;
    private JCheckBoxMenuItem mostrarBarraEstat;
    private JMenuItem mbItemUndo;
    private JMenuItem mbItemRedo;
    private JMenuItem mpItemUndo;
    private JMenuItem mpItemRedo;
          
    //Instancies botons Undo/Redo
    private JButton buttonUndo;
    private JButton buttonRedo;

    //Etiquetas    
    private JLabel sbFilePath;//Ruta arxiu
    private JLabel sbFileSize;//Tamany arxiu
    private JLabel sbCaretPos;//Posicio cursor
   
    //Estat Document y document actual
    private boolean hasChanged = false;
    private File currentFile = null;
    
    //Instancies accions
    private final EventHandler eventHandler;
    private final ActionPerformer actionPerformer;
    private final UndoManager undoManager; 
    
    
    public static void main(String[] args) {
        
    }

}
