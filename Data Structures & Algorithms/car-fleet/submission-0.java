class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if(n==0) return 0;

        Car[] cars = new Car[n];
        for(int i=0;i<n;i++){
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, (a,b) -> Integer.compare(b.position, a.position));

        int fleet = 0;
        double currentfleettime = 0.0;

        for(int i=0; i<n; i++){
            double timeToTarget = (double) (target - cars[i].position)/cars[i].speed;

            if(currentfleettime < timeToTarget){
                fleet++;
                currentfleettime = timeToTarget;
            }

        }
        return fleet;
    }

    public static class Car{
        int position;
        int speed;

        Car(int position, int speed){
            this.position = position;
            this.speed = speed;
        }
    }
}
