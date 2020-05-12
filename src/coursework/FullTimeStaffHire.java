package coursework;

public class FullTimeStaffHire extends StaffHire{//// declearing class
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType,int salary,int workingHour){//assigning the value of constructor.
        super(vacancyNumber, designation, jobType);////it passes value to the parents class constructor.
        this.salary = salary;
        this.workingHour = workingHour;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }

    public int getSalary(){//getter method for salary
        return salary;
    }

    public int getWorkingHour(){//getter method for workingHours
        return workingHour;
    }

    public String getJoiningDate(){//getter method forjoiningDate
        return joiningDate;
    }

    public String getStaffName(){//getter method for staffName
        return staffName;
    }

    public String getQualification(){//getter method forqualification.
        return qualification;
    }

    public String getAppointedBy(){//getter method for appointedBy.
        return appointedBy;
    }

    public boolean isJoined(){//getter method for joined.
        return joined;
    }

    public void setSalary(int salary){
        if (joined == false){//if else condition
            this.salary = salary;
        } else{
            System.out.println("Developer already appinted");
        }
    }

    public void setWorkinghour(int workingHour){
        this.workingHour = workingHour;
    }

    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification,String appointedBy){
        if(joined  == true){// if else condition
            System.out.println("Staff name is : " + getStaffName());
            System.out.println("joined Date : " + getJoiningDate());
        } else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
        } 
    }

    public void display(){// method for displaying.
        super.display();
        if(joined == true){
            System.out.println("staff name is : + " + getStaffName());
            System.out.println("Salary : " + getSalary());
            System.out.println("Working Hour : " + getWorkingHour());
            System.out.println("joining Date : " + getJoiningDate());
            System.out.println("Qualification : " + getQualification());
            System.out.println("Appointed BY : " + getAppointedBy());
        }
    }
}

