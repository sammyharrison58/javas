public class Vehicle {
    int passengers;
    int fuel;
    int mpg;
}
class VehicleDemo{
    public static void main(String[] args){
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers=7;
        minivan.fuel=16;
        minivan.mpg=21;

        range=minivan.fuel*minivan.mpg;
        System.out.println("minivan can carry " + minivan.passengers + " with a range of " + range);

    }
}