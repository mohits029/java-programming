class Microsoft{
    private int emp_id;
    String emp_name;
    String emp_mobile;

    public void setId(int id){
        this.emp_id= id;
    }
    public int getId(){
        return this.emp_id;
    }
}


public class Employee {
    public static void main(String args[]){
        Microsoft emp1= new Microsoft();
        emp1.emp_name= "Mohit Sarkar";
        emp1.emp_mobile= "8755352965";

        emp1.setId(23);

        int id= emp1.getId();
        

        System.out.println(emp1.emp_name);
        System.out.println(emp1.emp_mobile);
        System.out.println(id);
    }
}
