import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class JmenuBar_2 extends JFrame implements ActionListener{
	
	JMenuBar menubar;
	JMenu file;
	JMenu edit;
	JMenu help;
	JMenuItem load;
	JMenuItem save;
	JMenuItem exit;
	
	
	JmenuBar_2(){
		
		menubar = new JMenuBar();
		
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);
		
		
		load = new JMenuItem("Load");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		
		
		file.setMnemonic(KeyEvent.VK_F);//Alt + F for file
		edit.setMnemonic(KeyEvent.VK_E);//Alt + E for edit
		help.setMnemonic(KeyEvent.VK_H);//alt + H for help
		
		load.setMnemonic(KeyEvent.VK_L);//L for load
		save.setMnemonic(KeyEvent.VK_S);//S for save
		exit.setMnemonic(KeyEvent.VK_E);//E for exit
		
		load.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		file.add(load);
		file.add(save);
		file.add(exit);
		
		this.setJMenuBar(menubar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==load) {
			System.out.println("PEEP POOP , you load the file!");
		}
		if(e.getSource()==save) {
			System.out.println("PEEP POOP , you save the file!");
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
		
	}
}
