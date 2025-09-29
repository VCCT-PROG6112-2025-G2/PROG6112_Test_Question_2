package PROG6112_Question2;


public abstract class Cricket implements ICricket{
    protected String batsmanName;
    protected String stadiumName;
    protected int runsScored;
    
    public Cricket(String batsmanName, String stadiumName, int runsScored){
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.runsScored = runsScored;
    }
    
    //-------------------------------GETTER METHODS------------------------
    public String getBatsmanName(){
        return batsmanName;
    }
    
    public String getStadiumName(){
        return stadiumName;
    }
    
    @Override
    public int getRunsScored(){
        return runsScored;
    }
}
