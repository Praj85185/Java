public class Associate {
    int associateId;
    String associateName;
    String technology;
    int experienceInYears;
    Associate(String associateName,int associateId,String technology,int experienceInYears){
        this.associateId=associateId;
        this.associateName=associateName;
        this.technology=technology;
        this.experienceInYears=experienceInYears;
    }
    public int getAssociateId(){
        return associateId;
    }
    public String getAssociateName(){
        return associateName;
    }
    public String getTechnology(){
        return technology;
    }
    public int getExperienceInYears(){
        return experienceInYears;
    }
    public void setAssociateId(int associateId){
        this.associateId=associateId;
    }
    public void setAssociateName(String associateName){
        this.associateName=associateName;
    }
    public String toString(){
        return this.associateName+" "+this.associateId+" "+this.technology+" "+this.experienceInYears+" ";
    }

}
