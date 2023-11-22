package samuel.mortha;

public class SwitchDemo {
    
    public String getDayOfWeek(int dayOfWeek){
        String result = "";
        switch(dayOfWeek){
            case 1 : 
                result = "MONDAY";
                break;
            
            case 2 : case 3: 
                result = "TWD";
                break;
            
            case 4 : case 5:
                result = "THFRD";
                break;
            
            case 6 : case 7: 
                result = "SATSUN";
                break;
            
            default : 
                result = "ANYDAY";
        }
        return result;
    }
    public Person getManager(Person p){
        Person result = null;
        Person a = new Person("a",1L);
        Person b = new Person("b",2L);
        Person c = new Person("c",3L);
        switch(p){
            case a : 
                System.out.println("case a");
                result = a;
            case b : 
                System.out.println("case b");
                result = b;    
            default :
                System.out.println("case default");
                result = c;
        }
    }
    public String getPartOfDay(String partOfDay){
        String result = "";
        switch(partOfDay){
            case "morning" :
                result = "AM";
                break;
            case "afternoon" :
                result = "PM";
                break;
            case "evening" :
                result = "APM";
                break;
            default :
                result = "anytime";
        }
        return result;
    }
    class Person{
        String name;
        Long id;
        Person(String name,Long id){
            this.name = name;
            this.id = id;
        }
    }
}