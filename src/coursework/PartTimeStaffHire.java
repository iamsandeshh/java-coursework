package coursework;

public class PartTimeStaffHire extends StaffHire{// declearing class
    //declearing variable
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    // Assigning the value of the constructor.
    public PartTimeStaffHire(int vacancyNumber,String designation, String jobType, int workingHour, int wagesPerHour,String shifts){
        super(vacancyNumber,designation,jobType);//it passes value to the parents class constructor.
        this.workingHour = workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=false;  
    }

    public int getWorkingHour(){//getter method for WokringHour
        return workingHour;
    }

    public int getWagesPerHour(){//getter method for WagesPerHour.
        return wagesPerHour;
    }

    public String getStaffName(){//getter method for StffName.
        return staffName;
    }

    public String getJoiningDate(){//getter method for joiningDate 
        return joiningDate;
    }

    public String getQualification(){//getter method for qualification.
        return qualification;
    }

    public String getAppointedBy(){////getter method for appointedBy
        return appointedBy;
    } 

    public String getShifts(){//getter method for shifts.
        return shifts;
    }

    public boolean isJoined(){//getter method for joined.
        return joined;
    }

    public boolean isTerminated(){// getter  method for terminated.
        return terminated;
    }

    public void setShifts(String shifts){//mutator method for shifts.
        if(joined == false){
        this.shifts=shifts;
        }
    }

    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){//method for hirePartTimeStaff.
        if (joined == true){// using if else condition.
            System.out.println("Name of staff : " + getStaffName());
            System.out.println("Joining Date : " + getJoiningDate());
        } else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.terminated = false;
            this.joined = true;
        }
    }

    public void terminateStaff(){
        if(terminated == true){//using if else condition
            System.out.println("Staff already terminated");
        } else{
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }

    public void display(){// method for displaying.
        super.display();
        if (joined == true){
            System.out.println("Staff Name : " + getStaffName());
            System.out.println("Wages Per Hour : " + getWagesPerHour());
            System.out.println("Working Hour : " + getWorkingHour());
            System.out.println("Joining Date : " + getJoiningDate());
            System.out.println("Qualification : " + getQualification());
            System.out.println("Appointed By : " + getAppointedBy());
            System.out.println("Income Per Day : " + (getWagesPerHour() * getWorkingHour()));
        }
    }
}