import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Jcombobox_2 extends JFrame implements ActionListener{


//	FileReader file;
//	int data;
	JComboBox combobox;
	Jcombobox_2() throws IOException{
//		
//		   file = new FileReader("dog.txt");
//		   data = file.read();
//		    while(data != -1) {
//		    	System.out.print((char)data);
//		    	data = file.read();
//		    }
//		    file.close();
		    
		String[]animals = {"dog","cat","bird"};
		combobox = new JComboBox();
		combobox.addActionListener(this);
		//combobox.setEditable(true);
		//System.out.println(combobox.getItemCount());
		//combobox.addItem("horse");
		//combobox.insertItemAt("horse",0);
		//combobox.setSelectedItem("cat");
		//combobox.removeItem("dog");
		//combobox.removeItemAt(0);
		//combobox.removeAllItems();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(combobox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==combobox) {
			//System.out.println(combobox.getSelectedIndex());
			System.out.println(combobox.getSelectedItem());
			
		}
		
	}

}
