package samuel.mortha;

public class SwitchIntDemo {
    public static String switchIntDemo(int key){
        String result = "Initial value";
        switch(key){
            case 1 : case 5 :
                System.out.println("Key is : " + 1);
                result = "One";
            break;
            case 2 : case 6: System.out.println("Key is : " + 2);
                result = "Two";
            break;
            case 3 : System.out.println("Key is : " + 3);
                result = "Three";
            break;
            default : System.out.println("Key is default");
        }
        return result;
    }
}
