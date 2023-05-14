public class Main {
    public static void calal(Class games){

        String name = games.getName();
        Object obj = null;
        try{
            obj = Class.forName(name).newInstance();
            System.out.println(obj.getClass().getName());

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        if(obj == null) System.out.println("null object");
        else System.out.println("not null");
    }
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getInstanceOf("Rectangle");
        System.out.println(shape.getName("s"));
    }
}