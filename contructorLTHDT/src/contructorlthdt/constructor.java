
package contructorlthdt;
 

public class constructor {
    private String name;
    private int age;
    private String address; 

    public constructor() {
    }

    public constructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void setName(String name){
        this.name=name;
        
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public void setAddress(String address){
        this.address=address;
        
    }
    
}
