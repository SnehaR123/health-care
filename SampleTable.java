import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import java.awt.GridBagConstraints;

/**
*
*/
/**
* @author MH370
*
*/
public class SampleTable extends JFrame {
private static final long serialVersionUID = 1L;
private JPanel jContentPane = null;
private JButton sendBtn = null;
private JTextField firmCodeTxt = null;
private JPanel jPanel = null;
private JScrollPane jScrollPane = null;
private JTable priceTbl = null;
private DefaultTableModel tableModel = null;
/**
* This is the default constructor
*/
public SampleTable() {
    super();
    initialize();
}
/**
* This method initializes this
*
* @return void
*/
private void initialize() {
    this.setSize(600, 600);
    this.setContentPane(getJContentPane());
    this.setTitle("Price Indent Sender");
}
/**
* This method initializes jContentPane
*
* @return javax.swing.JPanel
*/
private JPanel getJContentPane() {
    if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJButton(), null);
            jContentPane.add(getJTextField(), null);
            jContentPane.add(getJPanel(), null);
        }
    return jContentPane;
    }
/**
* This method initializes jButton
*
* @return javax.swing.JButton
*/
private JButton getJButton() {
if (sendBtn == null) {
sendBtn = new JButton();
sendBtn.setBounds(new Rectangle(218, 50, 176, 23));
sendBtn.setText("send file");
sendBtn.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent e) {

 
System.out.println(" sending file ..."); // TODO Auto-generated Event stub actionPerformed()
}
});
}
return sendBtn;
}
/**
* This method initializes jTextField
*
* @return javax.swing.JTextField
*/
private JTextField getJTextField() {
    if (firmCodeTxt == null) {
        firmCodeTxt = new JTextField();
        firmCodeTxt.setBounds(new Rectangle(30, 49, 170, 26));
    }
    return firmCodeTxt;
}
/**
* This method initializes jPanel
*
* @return javax.swing.JPanel
*/
private JPanel getJPanel() {
    if (jPanel == null) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = 0;

        jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        jPanel.setBounds(new Rectangle(22, 105, 524, 214));
        jPanel.add(getJScrollPane(), gridBagConstraints);
    }
return jPanel;
}
/**
* This method initializes jScrollPane
*
* @return javax.swing.JScrollPane
*/
private JScrollPane getJScrollPane() {
        if (jScrollPane == null) {
                jScrollPane = new JScrollPane();
                jScrollPane.setViewportView(getJTable());
            }
    return jScrollPane;
}
/**
* This method initializes jTable
*
* @return javax.swing.JTable
*/
    private JTable getJTable() {
        if (priceTbl == null) {
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Item code");
            tableModel.addColumn(" M R P");
            tableModel.addColumn(" Price");
            tableModel.addColumn(" Autobatch ");
            // Initial row
            String [] data = {"","","",""};
            tableModel.addRow(data);
           
            priceTbl = new JTable(tableModel);
            Font font = new Font("Book Antiqua", Font.PLAIN, 20);
            priceTbl.setRowHeight(25);
            priceTbl.setFont(font);
            priceTbl.getModel().addTableModelListener(new TableModelListener() {
               
                @Override
                public void tableChanged(TableModelEvent e) {
                    // TODO Auto-generated method stub

                    if(e.getColumn()==3 && (tableModel.getRowCount()-1)==e.getLastRow()){
                       
                       
                        String [] newRow = {"","","",""};
                        tableModel.addRow(newRow);
                       
                    }
                   
                }
            });
           

        }
        return priceTbl;
    }
   
   
public static void main(String[] args) {
	SampleTable ebola = new SampleTable();
    ebola.setVisible(true);
    ebola.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}