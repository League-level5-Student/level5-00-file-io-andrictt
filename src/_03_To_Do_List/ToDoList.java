package _03_To_Do_List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JButton addTask = new JButton("Add");
	JButton viewTask = new JButton("View");
	JButton removeTask = new JButton("Remove");
	JButton saveTask = new JButton("Save");
	JButton loadTask = new JButton("Load");
	
	ArrayList<String> dummy = new ArrayList<String>();
	
	void Start() {
		frame.add(panel);
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveTask);
		panel.add(loadTask);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		addTask.addActionListener(this);
		viewTask.addActionListener(this);
		removeTask.addActionListener(this);
		saveTask.addActionListener(this);
		loadTask.addActionListener(this);
	}
	
	public static void main(String[] args) {
		ToDoList todoo = new ToDoList();
		todoo.Start();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addTask) {
			String ask = JOptionPane.showInputDialog("Enter a task");
			dummy.add(ask);
		}
		else if(e.getSource() == viewTask) {
			String hiii = "";
			for(int i = 0; i < dummy.size(); i++) {
				hiii += dummy.get(i) + "\t";
			}
			JOptionPane.showMessageDialog(null, hiii);
		}
		else if(e.getSource() == removeTask) {
			String ask = JOptionPane.showInputDialog("Remove a task");
			for(int i = dummy.size() - 1; i >= 0; i--) {
				if(ask.equals(dummy.get(i))) {
					dummy.remove(i);
				}
			}
		}
		
	}
	
	
	
}
