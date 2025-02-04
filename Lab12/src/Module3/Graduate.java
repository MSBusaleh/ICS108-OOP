package Module3;

import Module01.Student;

public class Graduate extends Student {
    private String status;

    public Graduate(String id, double gpa){
        super(id, gpa);

        if(gpa>=3)
            status = "Good";
        else
            status = "Probation";
    }

    @Override
    public String getStatus() {
        return status;
    }


}
