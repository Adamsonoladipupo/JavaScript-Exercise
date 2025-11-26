public class AutomaticBike {
    private boolean turnedOn = false;
    private boolean bikeKey = false;
    private int speed = 0;
    private int gear = 0;

    AutomaticBike(){

    }
    AutomaticBike(boolean key){
        this.bikeKey = key;
    }

    AutomaticBike(boolean key, int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void startBike(boolean bikeKey){
        if (bikeKey == true){
            turnedOn = true;
        }
        if (bikeKey == false){
            turnedOn = false;
        }
    }

    public boolean getBikeStatus(){
        return turnedOn;
    }

    public void changeSpeed(int speed){
        if (speed >= 0 && speed <= 20){
            gear = 1;
        }
        else if (speed >= 21 && speed <= 30){
            gear = 2;
        }
        else if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        if (speed >= 41){
            gear = 4;
        }
    }

    public int getBikeSpeed(){
        return speed;
    }

    public int getBikeGear(){
        return gear;
    }

}
