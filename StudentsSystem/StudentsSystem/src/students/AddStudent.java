package students;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.awt.event.ActionEvent;

public class AddStudent extends JDialog {

	private Student mainStudent;
	
	public Student getMainStudent(){
		return mainStudent;
	}

	/**
	 * Create the dialog.
	 */
	public AddStudent() {
		setTitle("ADD STUDENT");
		setBounds(100, 100, 450, 676);
		getContentPane().setLayout(null);
		
		JButton btnAddStudent = new JButton("Add Student");
		
		JFormattedTextField formattedNameTextField = new JFormattedTextField();
		formattedNameTextField.setBounds(179, 36, 227, 22);
		getContentPane().add(formattedNameTextField);
		
		JFormattedTextField formattedSurnameTextField = new JFormattedTextField();
		formattedSurnameTextField.setBounds(179, 72, 227, 22);
		getContentPane().add(formattedSurnameTextField);
		
		JFormattedTextField formattedNumberTextField  = new JFormattedTextField("{0,number,#}");
		formattedNumberTextField .setBounds(179, 106, 227, 22);
		formattedNumberTextField .setValue(new Long(0L));
		getContentPane().add(formattedNumberTextField );
		
		JFormattedTextField formattedMathTextField = new JFormattedTextField();
		formattedMathTextField.setBounds(179, 228, 227, 22);
		getContentPane().add(formattedMathTextField);
		
		JFormattedTextField formattedEnglishTextField = new JFormattedTextField();
		formattedEnglishTextField.setBounds(179, 289, 227, 22);
		getContentPane().add(formattedEnglishTextField);
		
		JFormattedTextField formattedEconomicsTextField = new JFormattedTextField();
		formattedEconomicsTextField.setBounds(179, 353, 227, 22);
		getContentPane().add(formattedEconomicsTextField);
	
		
		JFormattedTextField formattedLowTextField = new JFormattedTextField();
		formattedLowTextField.setBounds(179, 413, 227, 22);
		getContentPane().add(formattedLowTextField);
		
		JFormattedTextField formattedInformaticsTextField = new JFormattedTextField();
		formattedInformaticsTextField.setBounds(179, 479, 227, 22);
		getContentPane().add(formattedInformaticsTextField);
		
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainStudent = new Student();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				String name = formattedNameTextField.getText();
				String surname = formattedSurnameTextField.getText();
				long number = 0;
				String[] mathMarks = formattedMathTextField.getText().split("[,; ]+");
				String[] englMarks = formattedEnglishTextField.getText().split("[,; ]+");
				String[] ecoMarks = formattedEconomicsTextField.getText().split("[,; ]+");
				String[] lowMarks = formattedLowTextField.getText().split("[,; ]");
				String[] informMarks = formattedInformaticsTextField.getText().split("[,; ]+");
				
				ArrayList<Double> mathematicsMarks = new ArrayList<Double>();
				ArrayList<Double> englishMarks = new ArrayList<Double>();
				ArrayList<Double> economicsMarks = new ArrayList<Double>();
				ArrayList<Double> lowFundMarks = new ArrayList<Double>();
				ArrayList<Double> informaticsMarks = new ArrayList<Double>();
				ArrayList<Double> marks = new ArrayList<>();
				int markCount = 0;
				
				StringBuilder mathematic = new StringBuilder();
				mathematic.append("");
				for (int i = 0; i < mathMarks.length; i++) {
					try {
						Double mathM = Double.parseDouble(mathMarks[i]);
						if (mathM >= 2 && mathM <= 6) {
							mathematicsMarks.add(mathM);
							marks.add(mathM);
							mathematic.append(mathM+",");
							markCount++;
						}
					} catch (NullPointerException npe) {
						
					}catch (NumberFormatException nfe) {
						
					}
				}
				int lastMathComma = mathematic.lastIndexOf(",");
				
				StringBuilder english = new StringBuilder();
				english.append("");
				for (int i = 0; i < englMarks.length; i++) {
					try {
						Double englishM = Double.parseDouble(englMarks[i]);
						if (englishM >= 2 && englishM <= 6) {
							englishMarks.add(englishM);
							marks.add(englishM);
							english.append(englishM+",");
							markCount++;
						}
					} catch (NullPointerException npe) {
						
					}catch (NumberFormatException nfe) {
						
					}
				}
				int lastEnglComma = english.lastIndexOf(",");
				
				StringBuilder economics = new StringBuilder();
				economics.append("");
				for (int i = 0; i < ecoMarks.length; i++) {
					try {
						Double economicsM = Double.parseDouble(ecoMarks[i]);
						if (economicsM >= 2 && economicsM <= 6) {
							economicsMarks.add(economicsM);
							marks.add(economicsM);
							economics.append(economicsM+",");
							markCount++;
						}
					} catch (NullPointerException npe) {
						
					}catch (NumberFormatException nfe) {
						
					}
				}
				
				StringBuilder low = new StringBuilder();
				low.append("");
				for (int i = 0; i < lowMarks.length; i++) {
					try {
						Double lowM = Double.parseDouble(lowMarks[i]);
						if (lowM >= 2 && lowM <= 6) {
							lowFundMarks.add(lowM);
							marks.add(lowM);
							low.append(lowM+",");
							markCount++;
						}
					} catch (NullPointerException npe) {
						
					}catch (NumberFormatException nfe) {
						
					}
				}
				
				StringBuilder informatics = new StringBuilder();
				informatics.append("");
				for (int i = 0; i < informMarks.length; i++) {
					try {
						Double informaticsM = Double.parseDouble(informMarks[i]);
						if (informaticsM >= 2 && informaticsM <= 6) {
							informaticsMarks.add(informaticsM);
							marks.add(informaticsM);
							informatics.append(informaticsM+",");
							markCount++;
						}
					} catch (NullPointerException npe) {

					}catch (NumberFormatException nfe) {
						
					}
				}
				
				Double sumMarks = 0d;
				for (Double mark:marks) {
					sumMarks += mark;
				}
				Double averageMark = sumMarks/markCount;
				
				try {
					number = numberFormat.parse(formattedNumberTextField.getText()).longValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Please enter 10 digits for faculty number!");
					ex.printStackTrace();
				}

				if (formattedNameTextField.getText() == null || formattedNameTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter a valid name!");
					
				} else if (formattedSurnameTextField.getText() == null || 
						formattedSurnameTextField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please enter a valid surname!");
				} else if (formattedNumberTextField.getText() == null || 
						formattedNumberTextField.getText().equals("") ||
						number < 0 || formattedNumberTextField.getText().length() != 10)
						 {
					JOptionPane.showMessageDialog(null, "Please enter 10 digits for faculty number!");
					
				}  else {
					mainStudent.setName(name);
					mainStudent.setSurname(surname);
					mainStudent.setNumber(number);
					mainStudent.setMathematicsMarks(mathematic);
					mainStudent.setEnglishMarks(english);
					mainStudent.setEconomicsMarks(economics);
					mainStudent.setLowFundMarks(low);
					mainStudent.setInformaticsMarks(informatics);
					setVisible(false);
				}
			}
		});
		btnAddStudent.setBackground(new Color(154, 205, 50));
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddStudent.setBounds(29, 559, 156, 43);
		getContentPane().add(btnAddStudent);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancel.setBackground(new Color(173, 216, 230));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(226, 559, 156, 43);
		getContentPane().add(btnCancel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(12, 27, 103, 35);
		getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSurname.setBounds(12, 63, 103, 35);
		getContentPane().add(lblSurname);
		
		JLabel lblFacultyNumber = new JLabel("Faculty Number:");
		lblFacultyNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFacultyNumber.setBounds(12, 93, 150, 35);
		getContentPane().add(lblFacultyNumber);
		
		JLabel lblSubjectsAndMarks = new JLabel("Subjects and Marks");
		lblSubjectsAndMarks.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSubjectsAndMarks.setBounds(113, 164, 189, 35);
		getContentPane().add(lblSubjectsAndMarks);
		
		JLabel lblMaths = new JLabel("Mathematics:");
		lblMaths.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblMaths.setBounds(28, 223, 150, 28);
		getContentPane().add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblEnglish.setBounds(28, 284, 150, 28);
		getContentPane().add(lblEnglish);
		
		JLabel lblEconomy = new JLabel("Economics:");
		lblEconomy.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblEconomy.setBounds(28, 348, 150, 28);
		getContentPane().add(lblEconomy);
		
		JLabel lblLowFundamental = new JLabel("Low Fundamental:");
		lblLowFundamental.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblLowFundamental.setBounds(29, 408, 150, 28);
		getContentPane().add(lblLowFundamental);
		
		JLabel lblInformatics = new JLabel("Informatics:");
		lblInformatics.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblInformatics.setBounds(29, 474, 150, 28);
		getContentPane().add(lblInformatics);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 141, 384, 2);
		getContentPane().add(separator);
	}
}
