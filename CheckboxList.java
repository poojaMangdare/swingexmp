package swingexample.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import com.sun.xml.internal.ws.api.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class CheckboxList {
boolean itm1=false,itm2=false,itm3=false,itm4=false,itm5=false,itm6=false,itm7=false;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxList window = new CheckboxList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckboxList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox item1chk = new JCheckBox("item1");
		item1chk.setBounds(10, 9, 73, 23);
		item1chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				itm1=true;
			}
			else {
				   itm1=false;
			}
			}
	});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(item1chk);
		
		JCheckBox item3chk = new JCheckBox("item3");
		item3chk.setBounds(10, 61, 73, 22);
		item3chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm3=true;
				}
				else {
					itm3=false;
				}
			}
		});
		frame.getContentPane().add(item3chk);
		
		JCheckBox item2chk = new JCheckBox("item2");
		item2chk.setBounds(10, 38, 73, 20);
		item2chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm2=true;
				}
				else {
					itm2=false;
				}
			}
		});
		frame.getContentPane().add(item2chk);
		
		JCheckBox item4chk = new JCheckBox("item4");
		item4chk.setBounds(10, 86, 73, 23);
		item4chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm4=true;
				}
				else {
					itm4=false;
				}
			}
		});
		frame.getContentPane().add(item4chk);
		
		JCheckBox item5chk = new JCheckBox("item5");
		item5chk.setBounds(10, 112, 73, 23);
		item5chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm5=true;
				}
				else {
					itm5=false;
				}
			}
		});
		frame.getContentPane().add(item5chk);
		
		JCheckBox item6chk = new JCheckBox("item6");
		item6chk.setBounds(10, 138, 73, 23);
		item6chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm6=true;
				}
				else {
					itm6=false;
				}
			}
		});
		frame.getContentPane().add(item6chk);
		
		JCheckBox item7chk = new JCheckBox("item7");
		item7chk.setBounds(10, 164, 73, 23);
		item7chk.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					itm7=true;
				}
				else {
					itm7=false;
				}
			}
		});
		frame.getContentPane().add(item7chk);
		
		JButton btnList = new JButton("List selected items");
		btnList.setBounds(10, 194, 128, 23);
		btnList.addActionListener(new ActionListener() {
		private JTextArea textArea;

		public void actionPerformed(ActionEvent e) {
			
			//String value =(String)JCheckBox.setSelected(item1chk);
		    //textArea.setText(value);
			
			String msg = "selected";
		if(itm1==true) {
			textArea.setText(msg+="item1");
		}
			 if(itm2==true)
				{
				 textArea.setText(msg+="item2");
				}  if(itm3==true) {
					textArea.setText(msg+="item3");
			}
			 if(itm4==true)
			{
				 textArea.setText(msg+="item4");
			} if(itm5==true) {
				textArea.setText(msg+="item5");}
			 if(itm6==true) {
				 textArea.setText(msg+="item6");}
			 if(itm7==true) {
				 textArea.setText(msg+="item7");}
	
		//JOptionPane.showMessageDialog(null, msg);
		}
		
//		
	
		});
		frame.getContentPane().add(btnList);
		
		JButton btnClear = new JButton("Clear checkBox items");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			item1chk.setSelected(false);
			item2chk.setSelected(false);
			item3chk.setSelected(false);
			item4chk.setSelected(false);
			item5chk.setSelected(false);
			item6chk.setSelected(false);
			item7chk.setSelected(false);
			}
		});
		btnClear.setBounds(158, 194, 156, 23);
		frame.getContentPane().add(btnClear);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tri state enabled");
		chckbxNewCheckBox_2.setBounds(320, 194, 108, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 238, 399, 104);
		frame.getContentPane().add(textArea);
	}
}
