package students;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class StudentSystem {

	private JFrame frmStudentSystem;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSystem window = new StudentSystem();
					window.frmStudentSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentSystem = new JFrame();
		frmStudentSystem.getContentPane().setForeground(new Color(0, 250, 154));
		frmStudentSystem.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmStudentSystem.setTitle("STUDENT SYSTEM");
		frmStudentSystem.setBounds(100, 100, 1500, 800);
		frmStudentSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentSystem.getContentPane().setLayout(null);
		
		JButton buttonAddStudent = new JButton("Add Student");
		buttonAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddStudent dialog = new AddStudent();
				dialog.setModal(true);
				dialog.setVisible(true);
				
				Student student = dialog.getMainStudent();
				
				if (student == null) {
					
				}else if (student.getAverageMark() == "0") {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{student.getName(), student.getSurname(),
							student.getNumber(), "This student has no marks yet!"});
				}else {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{student.getName(), student.getSurname(),
							student.getNumber(), student.getAverageMark()});
				}
			}
		});
		buttonAddStudent.setForeground(Color.BLACK);
		buttonAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 24));
		buttonAddStudent.setBackground(new Color(50, 205, 50));
		buttonAddStudent.setBounds(645, 548, 238, 82);
		frmStudentSystem.getContentPane().add(buttonAddStudent);
		
		Object[][] rowData = new Object[0][4];
		Object[] columnNames = {"First Name", "Surname", "Number", "GPA"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 1458, 487);
		frmStudentSystem.getContentPane().add(scrollPane);
		
		table = new JTable();
		table = new JTable(new DefaultTableModel(rowData, columnNames));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JButton btnEditStudentInfo = new JButton("Update Student Info");
		btnEditStudentInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] selectedRow = table.getSelectedRows();
				if (selectedRow.length == 1) {
					String name = (String) table.getValueAt(selectedRow[0], 0);
					String surname = (String) table.getValueAt(selectedRow[0], 1);
					long number = (long) table.getValueAt(selectedRow[0], 2);
					double averageMark = 0;
					if (table.getValueAt(selectedRow[0], 3) != "This student has no marks yet!") {
						averageMark = Double.parseDouble((String) table.getValueAt(selectedRow[0], 3));
					}
					Student student = new Student(name, surname, number, averageMark);
					EditStudentInfo dialog = new EditStudentInfo(student);
					dialog.setModal(true);
					dialog.setVisible(true);
					student = dialog.getMainStudent();
					table.setValueAt(student.getName(), selectedRow[0], 0);
					table.setValueAt(student.getSurname(), selectedRow[0], 1);
					table.setValueAt(student.getNumber(), selectedRow[0], 2);
					table.setValueAt(student.getAverageMark(), selectedRow[0], 3);
				}
			}
		});
		btnEditStudentInfo.setBackground(new Color(255, 165, 0));
		btnEditStudentInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEditStudentInfo.setBounds(101, 669, 238, 56);
		frmStudentSystem.getContentPane().add(btnEditStudentInfo);
		
		JButton btnExport = new JButton("Export");
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Storage System File", "sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					if (file == null) {
						return;
					}
					String path = file.getPath();
					if (path == null) {
						return;
					}
					path = path.endsWith(".sss") ? path:path + ".sss";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);
					
					ArrayList<String> list = new ArrayList<String>();
					
					int rowCount = table.getRowCount();
					
					for (int i = 0; i < rowCount; i++) {
						String line = String.format("%s:%s:%s:%s", table.getValueAt(i, 0),
																   table.getValueAt(i, 1),
																   table.getValueAt(i, 2),
																   table.getValueAt(i, 3));
						list.add(line);
					}
					
					for (String line:list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while saving file");
				}
				JOptionPane.showMessageDialog(null, "Succesfully saved file!");
			}
		});
		btnExport.setBackground(new Color(64, 224, 208));
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExport.setBounds(806, 669, 238, 56);
		frmStudentSystem.getContentPane().add(btnExport);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files","sss"));
					fileChooser.showDialog(null, "Choose...");
					
					File file = fileChooser.getSelectedFile();
					
					List<String> fileContent = Files.readAllLines(file.toPath());
					
					for(String line:fileContent){
						
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						String[] row = line.split(":");
						String name = row[0];
						String surname = row[1];
						String number = row[2];
						String averageMark = row[3];
						long numberL = Long.parseLong(number);
						double averageMarkD = Double.parseDouble(averageMark);
						JOptionPane.showMessageDialog(null, "Succesfully loaded file!");
						
						Student student = new Student(name, surname, numberL, averageMarkD);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {student.getName(), student.getSurname(),
								student.getNumber(), student.getAverageMark()});
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error while loading file!");
				}
				
				
			}
		});
		btnImport.setBackground(new Color(255, 255, 0));
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnImport.setBounds(1164, 669, 238, 56);
		frmStudentSystem.getContentPane().add(btnImport);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int row = table.getSelectedRow();
				model.removeRow(row);
			}
		});
		btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDeleteStudent.setBackground(Color.RED);
		btnDeleteStudent.setBounds(471, 669, 238, 56);
		frmStudentSystem.getContentPane().add(btnDeleteStudent);
	}
}
