package chapter03;

public class Exam08 {
	
	public String name;
    public int totalmoney;
    
    Exam08(String name ,int totalmoney) {
        this.name = name;
        this.totalmoney = totalmoney;
        
    }
    
    public int totalIn(int money) {
       totalmoney += money;
       return totalmoney;
    }
    
    public int totalOut(int money) {
        totalmoney -= money;
        return totalmoney;
    }
    
    public void showTotal() {
        System.out.println(totalmoney);
    }
}
