public class ShapeFactory {

    Shape getInstanceOf(String str){
        if(str.equals("Square")){
            return new Square();
        }
        else if(str.equals("Rectangle")){
            return new Rectangle();
        }
        else if(str.equals("Circle")){
            return new Circle();
        }
        else {
            return null;
        }
    }
}
