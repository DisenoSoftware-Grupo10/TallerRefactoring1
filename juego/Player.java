public class Player{

    int wins;
    int winTotal;

    public String playerChoice(){
        String choice="";
        int c=(int)(Math.random()*3);
        switch(c){
            case 0:
                choice=("rock");
                break;
            case 1:
                choice=("paper");
                break;
            case 2:
                choice=("scissors");
                break;
            }
        return choice;
        
    }
}