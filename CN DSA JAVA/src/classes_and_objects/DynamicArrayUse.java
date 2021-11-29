package classes_and_objects;

public class DynamicArrayUse {
    public static void main(String[] args) {
     DynamicArray d = new DynamicArray();
     for(int i=0;i<100;i++)
     {
         d.add(i+10); // adds new elements at the end of the array and makes operation good
     }
        System.out.println(d.size());

     d.set(4,10);//to insert a given element at particular index
        System.out.println(d.get(3)); // fetches the value of elements at the given index
        System.out.println(d.get(4));

        while(!d.isEmpty())  // checks the size only of the array whether it has elements or not
        {
            System.out.println(d.removeLast());//removes the last present element
            System.out.println("size "+ d.size());
        }
    }
}
