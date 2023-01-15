package homeWorks.homeWorks3;

public abstract class Person {
    private String nameOfPerson;
    private int ageOfPerson;
    private int heightOfPerson;
    private int weightOfPerson;

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
        return ageOfPerson;
    }

    public void setHeightOfPerson(int heightOfPerson) {
        this.heightOfPerson = heightOfPerson;
    }

    public void setWeightOfPerson(int weightOfPerson) {
        this.weightOfPerson = weightOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public int getHeightOfPerson() {
        return heightOfPerson;
    }

    public int getWeightOfPerson() {
        return weightOfPerson;
    }

    public abstract void die();


    public Person (String nameOfPerson, int ageOfPerson, int heightOfPerson, int weightOfPerson){
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.heightOfPerson = heightOfPerson;
        this.weightOfPerson = weightOfPerson;
    }
    public Person (){

    }

    public void infoAboutPerson(){
        System.out.println(nameOfPerson + " is " + ageOfPerson + " years old and he has height " + heightOfPerson + " and weight " + weightOfPerson + " !");
    }

    public void goToWork(){
        if(ageOfPerson < 18 || ageOfPerson > 70){
            System.out.println("Resting at home!");
        }else{
            System.out.println("Go to work! ");
        }
    }

}
