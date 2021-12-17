package Classes;

 class Car {
     // Nitelikler
     String model;
     String type;
     String color;
     int speed;
     int speedLimit = 180;


     //Constructor
     Car (String model, String type, String color, int speed) {

         this.model = model;
         this.type = type;
         this.color = color;
         this.speed = speed;

     }


     // Davranislar
     void increaseSpeed (int increment) {
         if ((this.speed + increment) < this.speedLimit) {
             this.speed += increment;
         }
     }

     void  decreaseSpeed (int decrease) {
         if (this.speed > 0) {
            this.speed -= decrease;
         }
     }


     void printSpeed () {
     }

     void printInfo() {
         System.out.println("Model =>" + this.model + " Type :" + this.type + " Color :" + this.color + " Speed :" + this.speed);
     }


}
