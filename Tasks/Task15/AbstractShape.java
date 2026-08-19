package Tasks.Task15;

  abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    AbstractShape() {
    }

    AbstractShape(String color, double length, double width) {
      this.color = color;
      this.length = length;
      this.width = width;
    }

  }