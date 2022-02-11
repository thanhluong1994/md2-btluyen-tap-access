import java.awt.geom.Area;

public class Circle {
        private double radius;
        private String color;
        public Circle(){
            this.color="red";
            this.radius=1.0;
        }
        public Circle(double radius,String color){
            this.radius=radius;
            this.color=color;
        }
        public Circle(double radius){
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }
        public String getColor() {
            return color;
        }
        public double getArea() {
            double Dientich=Math.PI*radius*radius;
            return Dientich;
        }

}

