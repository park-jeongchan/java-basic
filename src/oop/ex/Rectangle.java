package oop.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea() {
        area = this.width * this.height;
        System.out.println("넓이: " + area);
    }

    void calculaterperimeter() {
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare() {
        square = (width == height);
        System.out.println("정사각형 여부: " + square);


    }
}
