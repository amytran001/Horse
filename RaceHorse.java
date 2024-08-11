public class RaceHorse extends Horse {
    private int numberOfRaces;

    //Constructor
    public RaceHorse(String name, String color, int birthYear, int numberOfRaces){
        super(name,color,birthYear);
        this.numberOfRaces = numberOfRaces;
    }
    //Getter and Setter Methods
    public int getNumberOfRaces(){
        return numberOfRaces;
    }
    public void setNumberOfRaces(int numberOfRaces){
        this.numberOfRaces = numberOfRaces;
    }

}
