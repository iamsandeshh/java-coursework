package coursework;

import javax.swing.*;
import java.awt.*;

public class INGNepal {
    private JFrame frame;
    private JLabel labelVacancyNumber, labelDesignation, labelJobType, labelWorkingHour,labelSalary,labelStaffName, labelQualification, labelJoiningDate, labelAppointBy, labelWorkingShifts, labelWagesPerHour;
    private JTextField textFieldVacancyNumber, textFieldDesignation,textFieldJobType,textFieldWorkingHours,textFieldSalary,textFieldStaffName,textFieldQualification,textFieldJoiningDate,textFieldAppointedBy,textFieldWorkingShifts,textFieldWagesPerHour;
  private INGNepal() {
      frame = new JFrame("INGNepal");
      frame.setSize(700, 500);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      GridBagLayout layout = new GridBagLayout();
      GridBagConstraints gbc = new GridBagConstraints();
      JPanel panel = new JPanel();
      panel.setBackground(Color.green);
      panel.setLayout(layout);
      frame.add(panel);

      labelVacancyNumber = new JLabel();
      labelVacancyNumber.setText("Vacancy Number : ");
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets = new Insets(5, 5, 5, 5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelVacancyNumber, gbc);

      textFieldVacancyNumber = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=0;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldVacancyNumber,gbc);

      labelDesignation = new JLabel();
      labelDesignation.setText("Designation : ");
      gbc.gridx=0;
      gbc.gridy=1;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelDesignation,gbc);

      textFieldDesignation = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldDesignation,gbc);


      labelWorkingHour = new JLabel();
      labelWorkingHour.setText("Working Hours : ");
      gbc.gridx=0;
      gbc.gridy=2;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelWorkingHour,gbc);

      textFieldWorkingHours = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=2;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldWorkingHours,gbc);

      labelWorkingShifts = new JLabel();
      labelWorkingShifts.setText("Working Shifts: ");
      gbc.gridx=0;
      gbc.gridy=3;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelWorkingShifts,gbc);


      textFieldWorkingShifts = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=3;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldWorkingShifts,gbc);




      labelJobType = new JLabel();
      labelJobType.setText("JobType : ");
      gbc.gridx=2;
      gbc.gridy=0;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelJobType,gbc);

      textFieldJobType = new JTextField(10);
      gbc.gridx=3;
      gbc.gridy=0;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldJobType,gbc);


     labelSalary = new JLabel();
      labelSalary.setText("Salary : ");
      gbc.gridx=2;
      gbc.gridy=1;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelSalary,gbc);


      textFieldSalary = new JTextField(10);
      gbc.gridx=3;
      gbc.gridy=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldSalary,gbc);

      labelWagesPerHour = new JLabel();
      labelWagesPerHour.setText("Wages Per Hour: ");
      gbc.gridx=2;
      gbc.gridy=2;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelWagesPerHour,gbc);

      textFieldWagesPerHour = new JTextField(10);
      gbc.gridx=3;
      gbc.gridy=2;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldWagesPerHour,gbc);

      JButton buttonAddPartTimeStaffHire = new JButton("Add Part Time");
      gbc.gridx=3;
      gbc.gridy=3;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonAddPartTimeStaffHire,gbc);


      JButton buttonFullTimeStaffHire = new JButton("Add Full Time");
      gbc.gridx=3;
      gbc.gridy=4;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonFullTimeStaffHire,gbc);

      labelStaffName = new JLabel();
      labelStaffName.setText("Staff Name : ");
      gbc.gridx=0;
      gbc.gridy=5;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelStaffName,gbc);


      textFieldStaffName = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=5;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldStaffName,gbc);


      labelQualification = new JLabel();
      labelQualification.setText("Qualification: ");
      gbc.gridx=2;
      gbc.gridy=5;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelQualification,gbc);


      textFieldQualification = new JTextField(10);
      gbc.gridx=3;
      gbc.gridy=5;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldQualification,gbc);


      labelJoiningDate = new JLabel();
      labelJoiningDate.setText("Joining Date : ");
      gbc.gridx=0;
      gbc.gridy=6;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelJoiningDate,gbc);


      textFieldJoiningDate = new JTextField(10);
      gbc.gridx=1;
      gbc.gridy=6;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldJoiningDate,gbc);

      labelAppointBy = new JLabel();
      labelAppointBy.setText("Appointed By: ");
      gbc.gridx=2;
      gbc.gridy=6;
      gbc.insets= new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(labelAppointBy,gbc);


      textFieldAppointedBy = new JTextField(10);
      gbc.gridx=3;
      gbc.gridy=6;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(textFieldAppointedBy,gbc);

      JButton buttonAppointFullTimeStaff= new JButton("Appoint Full time");
      gbc.gridx=1;
      gbc.gridy=7;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonAppointFullTimeStaff,gbc);

      JButton buttonAppointPartTime= new JButton("Appoint Part Time");
      gbc.gridx=1;
      gbc.gridy=8;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonAppointPartTime,gbc);

      JButton buttonDisplayFullTimeStaffHire = new JButton("Display Full Time");
      gbc.gridx=2;
      gbc.gridy=7;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonDisplayFullTimeStaffHire,gbc);

      JButton buttonDisplayPartTimeStaffHire = new JButton("Display Part Time");
      gbc.gridx=2;
      gbc.gridy=8;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonDisplayPartTimeStaffHire,gbc);


      JButton buttonClean = new JButton("Clean");
      gbc.gridx=1;
      gbc.gridy=9;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonClean,gbc);

      JButton buttonTerminate = new JButton("Terminate");
      gbc.gridx=2;
      gbc.gridy=9;
      gbc.gridwidth=1;
      gbc.insets = new Insets(5,5,5,5);
      gbc.fill=GridBagConstraints.HORIZONTAL;
      panel.add(buttonTerminate,gbc);







            frame.setVisible(true);
        }


    public static void main(String[] args) {
        new INGNepal();
    }
}