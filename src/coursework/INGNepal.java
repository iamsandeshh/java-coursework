package coursework;

import com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class INGNepal implements ActionListener {
    JButton buttonAddPartTimeStaffHire, buttonAppointPartTime, buttonAppointFullTimeStaff, buttonFullTimeStaffHire, buttonTerminate, buttonClean, buttonDisplayPartTimeStaffHire, buttonDisplayFullTimeStaffHire,buttonBack;
    private JFrame frame,frameDisplay;
    ArrayList<StaffHire> staffHires;
    private JTextArea jt;
    Font font = new Font("Arial", Font.BOLD, 16);
    private JLabel labelVacancyNumber, labelDesignation, labelJobType, labelWorkingHour, labelSalary, labelStaffName, labelQualification, labelJoiningDate, labelAppointBy, labelWorkingShifts, labelWagesPerHour;
    private JTextField textFieldVacancyNumber, textFieldDesignation, textFieldJobType, textFieldWorkingHours, textFieldSalary, textFieldStaffName, textFieldQualification, textFieldJoiningDate, textFieldAppointedBy, textFieldWorkingShifts, textFieldWagesPerHour;
    StringBuilder builder;
    public  void display(String value){
        frameDisplay = new JFrame("Display");
        frameDisplay.setSize(700,500);
        frameDisplay.setLocationRelativeTo(null);
        frameDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameDisplay.setUndecorated(true);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        frameDisplay.add(panel);

        jt = new JTextArea(10,40);
        jt.setText(value);
        jt.setFont(font);
        jt.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(jt, gbc);


        buttonBack = new JButton("Back");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        panel.add(buttonBack, gbc);
        buttonBack.addActionListener(this);
        frameDisplay.setVisible(true);

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                frameDisplay.dispose();
            }
        });
    }


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
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelVacancyNumber, gbc);

        textFieldVacancyNumber = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldVacancyNumber, gbc);

        labelDesignation = new JLabel();
        labelDesignation.setText("Designation : ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelDesignation, gbc);

        textFieldDesignation = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldDesignation, gbc);


        labelWorkingHour = new JLabel();
        labelWorkingHour.setText("Working Hours : ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelWorkingHour, gbc);

        textFieldWorkingHours = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldWorkingHours, gbc);

        labelWorkingShifts = new JLabel();
        labelWorkingShifts.setText("Working Shifts: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelWorkingShifts, gbc);


        textFieldWorkingShifts = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldWorkingShifts, gbc);


        labelJobType = new JLabel();
        labelJobType.setText("JobType : ");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelJobType, gbc);

        textFieldJobType = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldJobType, gbc);


        labelSalary = new JLabel();
        labelSalary.setText("Salary : ");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelSalary, gbc);


        textFieldSalary = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldSalary, gbc);

        labelWagesPerHour = new JLabel();
        labelWagesPerHour.setText("Wages Per Hour: ");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelWagesPerHour, gbc);

        textFieldWagesPerHour = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldWagesPerHour, gbc);

        buttonAddPartTimeStaffHire = new JButton("Add Part Time");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonAddPartTimeStaffHire, gbc);
        buttonAddPartTimeStaffHire.addActionListener(this);


        buttonFullTimeStaffHire = new JButton("Add Full Time");
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonFullTimeStaffHire, gbc);
        buttonFullTimeStaffHire.addActionListener(this);


        labelStaffName = new JLabel();
        labelStaffName.setText("Staff Name : ");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelStaffName, gbc);


        textFieldStaffName = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldStaffName, gbc);


        labelQualification = new JLabel();
        labelQualification.setText("Qualification: ");
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelQualification, gbc);


        textFieldQualification = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldQualification, gbc);


        labelJoiningDate = new JLabel();
        labelJoiningDate.setText("Joining Date : ");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelJoiningDate, gbc);


        textFieldJoiningDate = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldJoiningDate, gbc);

        labelAppointBy = new JLabel();
        labelAppointBy.setText("Appointed By: ");
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(labelAppointBy, gbc);


        textFieldAppointedBy = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textFieldAppointedBy, gbc);

        buttonAppointFullTimeStaff = new JButton("Appoint Full time");
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonAppointFullTimeStaff, gbc);
        buttonAppointFullTimeStaff.addActionListener(this);

        buttonAppointPartTime = new JButton("Appoint Part Time");
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonAppointPartTime, gbc);
        buttonAppointPartTime.addActionListener(this);

        buttonDisplayFullTimeStaffHire = new JButton("Display Full Time");
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonDisplayFullTimeStaffHire, gbc);
        buttonDisplayFullTimeStaffHire.addActionListener(this);

        buttonDisplayPartTimeStaffHire = new JButton("Display Part Time");
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonDisplayPartTimeStaffHire, gbc);
        buttonDisplayPartTimeStaffHire.addActionListener(this);

        buttonClean = new JButton("Clean");
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonClean, gbc);
        buttonClean.addActionListener(this);

        buttonTerminate = new JButton("Terminate");
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonTerminate, gbc);
        buttonTerminate.addActionListener(this);

        staffHires = new ArrayList<>();

        frame.setVisible(true);
    }

    public int getVacancyNumber(){
        return (Integer.parseInt(textFieldVacancyNumber.getText()));
    }
    public String getDesignation(){
        return ((textFieldDesignation.getText()));
    }
    public int getWorkingHours(){
        return (Integer.parseInt(textFieldWorkingHours.getText()));
    }
    public String getWorkingShifts(){
        return ((textFieldWorkingShifts.getText()));
    }
    public String getJobType(){
        String jobType = textFieldJobType.getText().toLowerCase();
        String temp = "";
        if(jobType.equals("full time")){
            temp = "full time";
        }else if(jobType.equals("part time")){
            temp = "part time";
        }else {
            JOptionPane.showMessageDialog(frame, "Please Enter either 'part time' or 'full time' in job type");
        }

        return (temp);
    }
    public int getSalary(){
        return (Integer.parseInt(textFieldSalary.getText()));
    }
    public int getWagesPerHour(){
        return (Integer.parseInt(textFieldWagesPerHour.getText()));
    }
    public String getStaffName(){
        return ((textFieldStaffName.getText()));
    }
    public String getJoiningDate(){
        return (textFieldJoiningDate.getText());
    }
    public String getQualification(){
        return ((textFieldQualification.getText()));
    }
    public String getAppointedBy(){
        return ((textFieldAppointedBy.getText()));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonFullTimeStaffHire) {
            textFieldJobType.setText("Full Time");
            try {

                boolean alreadyAdded = false;

                for(StaffHire staffHire : staffHires){
                    if(getVacancyNumber() == staffHire.getVacancyNumber()){
                        alreadyAdded = true;
                        break;
                    }
                }

                if(!alreadyAdded){
                    if (!textFieldVacancyNumber.getText().equals("")){
                        if (!getDesignation().equals("") && !textFieldSalary.equals("") && !textFieldWorkingHours.equals("")) {
                            FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(getVacancyNumber(), getDesignation(), getJobType(), getSalary(), getWorkingHours());
                            staffHires.add(Integer.parseInt(textFieldVacancyNumber.getText()), fullTimeStaffHire);
                            JOptionPane.showMessageDialog(frame, "Full Time Vacancy Added Successfully.");
                            clear();
                        } else {
                            JOptionPane.showMessageDialog(frame, "");
                        }
                    }else {
                        JOptionPane.showMessageDialog(frame,"vacancy no ");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "The vacancy number is already in our list.");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Either vacancy number or working hour or salary are in non numeric format.");
            }catch (IndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(frame, "You cant add vacancy greater than " + staffHires.size());
            }catch (Exception ex){
                JOptionPane.showMessageDialog(frame, "Something went wrong");
            }
        } else if (e.getSource() == buttonAppointFullTimeStaff) {
            textFieldJobType.setText("Full Time");
           try{
               boolean alreadyPresent = false;
               if(!textFieldVacancyNumber.getText().equals("")) {
                   for (StaffHire staffHire : staffHires) {
                       if (getVacancyNumber() == staffHire.getVacancyNumber()){
                           alreadyPresent = true;
                           if (staffHires.get(getVacancyNumber()) instanceof FullTimeStaffHire) {
                               if (!((FullTimeStaffHire) staffHire).isJoined()) {
                                   if (!getStaffName().equals("") && !getAppointedBy().equals("") && !getQualification().equals("") && !getJoiningDate().equals("")) {
                                       FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffHire;
                                       fullTimeStaffHire.hireFullTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());

                                       JOptionPane.showMessageDialog(frame, "Full Time Staff Appointed Successfully.");
                                       clear();
                                   } else {
                                       JOptionPane.showMessageDialog(frame, "Empty field detected");
                                   }
                               } else {
                                   JOptionPane.showMessageDialog(frame, "Already joined");
                               }
                           } else {
                               JOptionPane.showMessageDialog(frame, "This is not a type of fullTime");
                           }
                           break;
                       }
                   }

                   if (!alreadyPresent){
                       JOptionPane.showMessageDialog(frame,"vacancy is not present");
                   }
               }else {
                   JOptionPane.showMessageDialog(frame,"Enter vacancy number");
               }
           }catch (Exception ex){
               ex.printStackTrace();
               JOptionPane.showMessageDialog(frame, "Something went wrong.");
           }


        } else if (e.getSource() == buttonAddPartTimeStaffHire) {
            textFieldJobType.setText("Part Time");
            try{

                boolean alreadyAdded = false;

                for(StaffHire staffHire : staffHires){
                    if(getVacancyNumber() == staffHire.getVacancyNumber()){
                        alreadyAdded = true;
                        break;
                    }
                }

                if(!alreadyAdded){
                    if (!textFieldVacancyNumber.getText().equals("")){
                        if (!getDesignation().equals("") && !textFieldSalary.equals("") && !textFieldWorkingHours.equals("")) {
                            PartTimeStaffHire partTimeStaffHire = new PartTimeStaffHire(getVacancyNumber(), getDesignation(), getJobType(), getWorkingHours(), getWagesPerHour(), getWorkingShifts());
                            staffHires.add(Integer.parseInt(textFieldVacancyNumber.getText()), partTimeStaffHire);
                            JOptionPane.showMessageDialog(frame, "Part Time Vacancy Added Successfully.");
                            clear();
                        }
//                        } else {
//                            JOptionPane.showMessageDialog(frame, "");
//                        }
                    } else {
                        JOptionPane.showMessageDialog(frame,"vacancy no ");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame, "You cant add this vacancy.");
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Either Vacancy Number, Working Hour, Wages Per Hour are in non numeric format.");
            }catch (IndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(frame, "You cant add vacancy greater than " + staffHires.size());
            }
        } else if (e.getSource() == buttonTerminate) {
            if (!textFieldVacancyNumber.getText().equals("")) {
                for (StaffHire staffHire : staffHires) {
                    if (getVacancyNumber() == staffHire.getVacancyNumber()) {
                        if (staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire) {
                            if (!((PartTimeStaffHire) staffHire).isTerminated()) {
                                PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                partTimeStaffHire.terminateStaff();
                                JOptionPane.showMessageDialog(frame, "Staff Terminated Successfully.");
                                clear();

                                break;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Already terminated");
                            }
                            break;
                        } else {
                            JOptionPane.showMessageDialog(frame, "The vacancy number is not of part time");
                        }
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Please enter number");
            }
        } else if (e.getSource() == buttonClean) {
            clear();
        } else if (e.getSource() == buttonDisplayFullTimeStaffHire) {
            if (staffHires.size() != 0){
                display(getDisplayFullTime());
                frame.setVisible(false);
            }else {
                JOptionPane.showMessageDialog(frame,"There is no data available please try to add");


            }
        } else if (e.getSource() == buttonDisplayPartTimeStaffHire) {
            if (staffHires.size() != 0){
                display(getDisplayPartTime());
                frame.setVisible(false);
            }else {
                JOptionPane.showMessageDialog(frame,"There is no data available please try to add");
            }
        } else if (e.getSource() == buttonAppointPartTime) {
            textFieldJobType.setText("Part Time");
            try{
                boolean alreadyPresent = false;
                if(!textFieldVacancyNumber.getText().equals("")) {
                    for (StaffHire staffHire : staffHires) {
                        if (getVacancyNumber() == staffHire.getVacancyNumber()){
                            alreadyPresent = true;
                            if (staffHires.get(getVacancyNumber()) instanceof PartTimeStaffHire) {
                                if (!((PartTimeStaffHire) staffHire).isJoined()) {
                                    if (!getStaffName().equals("") && !getAppointedBy().equals("") && !getQualification().equals("") && !getJoiningDate().equals("")) {
                                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                                        partTimeStaffHire.hirePartTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());

                                        JOptionPane.showMessageDialog(frame, "Part Time Staff Appointed Successfully.");
                                        clear();
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Empty field detected");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Already joined");
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame, "This is not a type of part Time");
                            }
                            break;
                        }
                    }

                    if (!alreadyPresent){
                        JOptionPane.showMessageDialog(frame,"vacancy is not present");
                    }
                }else {
                    JOptionPane.showMessageDialog(frame,"Enter vacancy number");
                }
            }catch (Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Something went wrong.");
            }
        }
    }

    public String getDisplayFullTime(){
        builder = new StringBuilder();
        for (StaffHire staffHire : staffHires){
            if (staffHire instanceof FullTimeStaffHire){
                FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire)staffHire;
                fullTimeStaffHire.display();

                builder.append(staffHire.getVacancyNumber());
                builder.append("|");
                builder.append(staffHire.getDesignation());
                builder.append("|");
                builder.append(staffHire.getjobType());
                builder.append(" | ");
                if(fullTimeStaffHire.isJoined()){
                    builder.append(((FullTimeStaffHire)staffHire).getQualification());
                    builder.append(" | ");
                    builder.append(((FullTimeStaffHire) staffHire).getStaffName());
                    builder.append(" | ");
                    builder.append(((FullTimeStaffHire) staffHire).getAppointedBy());
                    builder.append(" | ");
                    builder.append(((FullTimeStaffHire) staffHire).getJoiningDate());
                    builder.append("\n");
                }else {
                    builder.append("\n");
                }
            }
        }
        return String.valueOf(builder);
    }

    public String getDisplayPartTime(){
        StringBuilder builder1 = new StringBuilder();
        for (StaffHire staffHire : staffHires){
            if (staffHire instanceof PartTimeStaffHire){
                PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffHire;
                partTimeStaffHire.display();

                builder1.append(staffHire.getVacancyNumber());
                builder1.append(" | ");
                builder1.append(staffHire.getDesignation());
                builder1.append(" | ");
                builder1.append(staffHire.getjobType());
                builder1.append("|");
                if (partTimeStaffHire.isJoined()){
                    builder1.append(((PartTimeStaffHire) staffHire).getQualification());
                    builder1.append("|");
                    builder1.append(((PartTimeStaffHire) staffHire).getStaffName());
                    builder1.append(" | ");
                    builder1.append(((PartTimeStaffHire) staffHire).getAppointedBy());
                    builder1.append(" | ");
                    builder1.append(((PartTimeStaffHire) staffHire).getJoiningDate());
                    builder1.append("\n");
                }else {
                    builder1.append("\n");
                }
            }
        }
        return String.valueOf(builder1);
    }


    public void clear(){
        textFieldWorkingHours.setText("");
        textFieldSalary.setText("");
        textFieldJobType.setText("");
        textFieldDesignation.setText("");
        textFieldVacancyNumber.setText("");
        textFieldWagesPerHour.setText("");
        textFieldStaffName.setText("");
        textFieldQualification.setText("");
        textFieldWorkingShifts.setText("");
        textFieldAppointedBy.setText("");
        textFieldJoiningDate.setText("");
    }

    public static void main(String[] args) {
        new INGNepal();
    }
}