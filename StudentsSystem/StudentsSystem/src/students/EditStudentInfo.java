package students;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class EditStudentInfo extends JDialog {

private Student mainStudent;

public Student getMainStudent(){
	return mainStudent;
}

/**
 * Create the dialog.
 */
public EditStudentInfo(Student student) {
	mainStudent = student;
	setTitle("EDIT STUDENT INFO");
	setBounds(100, 100, 450, 676);
	getContentPane().setLayout(null);
	
	JButton btnAddStudent = new JButton("Update");
	
	JFormattedTextField formattedNameTextField = new JFormattedTextField();
	formattedNameTextField.setBounds(179, 36, 227, 22);
	formattedNameTextField .setValue(mainStudent.getName());
	getContentPane().add(formattedNameTextField);
	
	JFormattedTextField formattedSurnameTextField = new JFormattedTextField();
	formattedSurnameTextField.setBounds(179, 72, 227, 22);
	formattedSurnameTextField .setValue(mainStudent.getSurname());
	getContentPane().add(formattedSurnameTextField);
	
	JFormattedTextField formattedNumberTextField  = new JFormattedTextField("{0,number,#}");
	formattedNumberTextField .setBounds(179, 106, 227, 22);
	formattedNumberTextField .setValue(mainStudent.getNumber());
	getContentPane().add(formattedNumberTextField );
	
	JFormattedTextField formattedMathTextField = new JFormattedTextField();
	formattedMathTextField.setBounds(179, 228, 227, 22);
	formattedMathTextField .setValue(mainStudent.getMarks());
	getContentPane().add(formattedMathTextField);
	
	JFormattedTextField formattedEnglishTextField = new JFormattedTextField();
	formattedEnglishTextField.setBounds(179, 289, 227, 22);
	formattedEnglishTextField .setValue(mainStudent.getEnglishMarks());
	getContentPane().add(formattedEnglishTextField);
	
	JFormattedTextField formattedEconomicsTextField = new JFormattedTextField();
	formattedEconomicsTextField.setBounds(179, 353, 227, 22);
	formattedEconomicsTextField .setValue(mainStudent.getEconomicsMarks());
	getContentPane().add(formattedEconomicsTextField);
	
	JFormattedTextField formattedLowTextField = new JFormattedTextField();
	formattedLowTextField.setBounds(179, 413, 227, 22);
	formattedLowTextField .setValue(mainStudent.getLowFundMarks());
	getContentPane().add(formattedLowTextField);
	
	JFormattedTextField formattedInformaticsTextField = new JFormattedTextField();
	formattedInformaticsTextField.setBounds(179, 479, 227, 22);
	formattedInformaticsTextField .setValue(mainStudent.getInformaticsMarks());
	getContentPane().add(formattedInformaticsTextField);
	
	btnAddStudent.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
			
			String name = formattedNameTextField.getText();
			String surname = formattedSurnameTextField.getText();
			long number = 0;
			String[] mathMarks = formattedMathTextField.getText().split("[,; ]+");
			String[] englMarks = formattedEnglishTextField.getText().split("[,; ]+");
			String[] ecoMarks = formattedEconomicsTextField.getText().split("[,; ]+");
			String[] lowMarks = formattedLowTextField.getText().split("[,; ]");
			String[] informMarks = formattedInformaticsTextField.getText().split("[,; ]+");
			
			ArrayList<Double> mathematicsMarks = new ArrayList<>();
			ArrayList<Double> englishMarks = new ArrayList<>();
			ArrayList<Double> economicsMarks = new ArrayList<>();
			ArrayList<Double> lowFundMarks = new ArrayList<>();
			ArrayList<Double> informaticsMarks = new ArrayList<>();
			ArrayList<Double> marks = new ArrayList<>();
			int markCount = 0;
			
			for (int i = 0; i < mathMarks.length; i++) {
				try {
					Double mathM = Double.parseDouble(mathMarks[i]);
					if (mathM >= 2 && mathM <= 6) {
						mathematicsMarks.add(mathM);
						marks.add(mathM);
						markCount++;
					}
				} catch (NullPointerException npe) {
					
				}catch (NumberFormatException nfe) {
					
				}
			}
			
			for (int i = 0; i < englMarks.length; i++) {
				try {
					Double englishM = Double.parseDouble(englMarks[i]);
					if (englishM >= 2 && englishM <= 6) {
						englishMarks.add(englishM);
						marks.add(englishM);
						markCount++;
					}
				} catch (NullPointerException npe) {
					
				}catch (NumberFormatException nfe) {
					
				}
			}
			
			for (int i = 0; i < ecoMarks.length; i++) {
				try {
					Double economicsM = Double.parseDouble(ecoMarks[i]);
					if (economicsM >= 2 && economicsM <= 6) {
						economicsMarks.add(economicsM);
						marks.add(economicsM);
						markCount++;
					}
				} catch (NullPointerException npe) {
					
				}catch (NumberFormatException nfe) {
					
				}
			}
			
			for (int i = 0; i < lowMarks.length; i++) {
				try {
					Double lowM = Double.parseDouble(lowMarks[i]);
					if (lowM >= 2 && lowM <= 6) {
						lowFundMarks.add(lowM);
						marks.add(lowM);
						markCount++;
					}
				} catch (NullPointerException npe) {
					
				}catch (NumberFormatException nfe) {
					
				}
			}
			
			for (int i = 0; i < informMarks.length; i++) {
				try {
					Double informaticsM = Double.parseDouble(informMarks[i]);
					if (informaticsM >= 2 && informaticsM <= 6) {
						informaticsMarks.add(informaticsM);
						marks.add(informaticsM);
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
				JOptionPane.showMessageDialog(null, "You didn't enter right faculty number!");
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
				JOptionPane.showMessageDialog(null, "You didn't enter right faculty number!");
				
			}  else {
				student.setName(name);
				student.setSurname(surname);
				student.setNumber(number);
				student.setMathematicsMarks(mathematicsMarks);
				student.setEnglishMarks(englishMarks);
				student.setEconomicsMarks(economicsMarks);
				student.setLowFundMarks(lowFundMarks);
				student.setInformaticsMarks(informaticsMarks);
				student.setMarks(marks);
				student.setAverageMark(averageMark);
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
