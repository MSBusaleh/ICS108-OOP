package Module02;

import Module01.Student;

public class Undergraduate extends Student {

    public Undergraduate(String id, double gpa){
        super(id, gpa);


    }

    @Override
    public String getStatus() {
        if(this.getGpa()>=3)
            status = "Honor";
        else if(gpa>=2)
            status = "Good";
        else
            status = "Probation";
        return status;
    }
}
