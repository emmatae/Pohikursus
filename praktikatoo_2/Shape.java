package Analytics;

class Shape{
    private String color;

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Shape(String color){
        this.color = color;
    }

    public double getArea(){
        return 0.0;
    }

    public double getDiameter(){
        return 0.0;
    }

    public String toString(){
        return "This is a shape.";
    }
}

class Circle extends Shape{

    public Circle(String color){
        super(color);
    }

    public String toString(){
        return "This is a circle!";
    }

}