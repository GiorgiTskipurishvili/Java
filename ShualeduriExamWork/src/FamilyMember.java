public class FamilyMember {
    private String name ;
    private String lastName;
    private int age;
    private String status;


//    public familymember(String name, String lastName, int age, String status){
//        this.name =name;
//        this.lastName = lastName;
//        this.age= age;
//        this.status = status;
//    }


    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getStatus(){
        return status;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age =age;
    }
    public void setStatus(String status){
        this.status = status;
    }

}
