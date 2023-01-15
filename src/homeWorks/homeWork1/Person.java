package homeWorks.homeWork1;

public class Person {
    String nameOfPerson;
    int ageOfPerson;
    int heightOfPerson;
    int weightOfPerson;

    public Person (String nameOfPerson, int ageOfPerson, int heightOfPerson,int weightOfPerson){
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
