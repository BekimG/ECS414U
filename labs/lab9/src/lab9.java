import java.util.*;

class Lab9
{
    public static void main (String[] args)
    {
        //Testing Requirement 1
        Scanner lengthInput = new Scanner(System.in);
        Scanner arrayListInput = new Scanner(System.in);
        Scanner sizeInput = new Scanner(System.in);

        int size;
        int length;
        String arrayElement;

        System.out.println("Enter the amount of elements you want to input");
        size = sizeInput.nextInt();

        System.out.println("Please enter the minimum length of the element");
        length = lengthInput.nextInt();

        ArrayList<String> items = new ArrayList<>();
        System.out.println("Enter your elements");
        for(int i=0; i< size; i++){
            arrayElement = arrayListInput.nextLine();
            items.add(arrayElement);
        }
        Req1(items, length);
        System.out.println(items);

        System.exit(0);

    }
    //Method for Requirement 1
    public static void Req1(ArrayList<String> items, int length){
        for(int i=0; i<items.size(); i++){
            if(items.get(i).length() < length){
                items.remove(i);
                i--;
            }
        }

    }
}