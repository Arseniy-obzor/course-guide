package Com.Company;

public class Main {
    public static void main(String[] args) {
      /*  Shape[] arr= new Shape[] {new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++)
            arr[i].draw();*/
        Array a = new MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(23));
        System.out.println(a.Add(34));
        System.out.println(a.Add(7));
        System.out.println(a.Add(8));
        System.out.println(a.Get(2));
    }
}