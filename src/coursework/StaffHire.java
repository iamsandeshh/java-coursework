package coursework;

public class StaffHire{// declearing class
    private int vacancyNumber;
    private String designation;
   private  String jobType;// assigning the value of the constructor 
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;

    }
        
    public int getVacancyNumber(){//getter method for VaccancyNo
        return vacancyNumber;
    }
        
    public void setVacancyNumber(int vacancyNumber){//Mutator method for vaccancyNo
        this.vacancyNumber = vacancyNumber;
    }
        
    public String getDesignation(){//getter  method for Designation.
        return designation;
    }
        
    public void setDesignation(){// Mutator method for Designation
        this.designation = designation;
    }
       
    public String getjobType(){ // getter method for JobType.
        return jobType;   
    }
        
    public void setjobType(String jobType){//Mutator method for vacancyNumber
        this.vacancyNumber = vacancyNumber;
    }
        
    public void display(){// Method for displaying.
        System.out.println("vacancy number is : " + getVacancyNumber());
        System.out.println("Designation is : " + getDesignation());
        System.out.println("Job Type is : " + getjobType());
    }
}