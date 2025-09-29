
package PROG6112_Question2;


public class CricketRunsScored extends Cricket {

    public CricketRunsScored(String batsmanName, String stadiumName, int runsScored){
        super(batsmanName, stadiumName, runsScored);
    }
    
    public void printReport(){
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("************************************************");
        System.out.println("CRICKET PLAYER: " + getBatsmanName());
        System.out.println("STADIUM: " + getStadiumName());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }

    @Override
    public String getBatsman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getStadium() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
