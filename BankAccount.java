class BankAccount {
    private String name;
    private int age;
    private long acc_num,balance;
    private long deposit;
    
    public String getName(){
    
        return name;
    }
    public int getAge(){
    
        return age;
    }
    public long getAccNum(){
    
        return acc_num;
    }
    public long getBalance(){
    
        return balance;
    }
    public long Deposit(){
    
        return deposit;
    }
    
    public void setName(String name){
    
        this.name = name;
        System.out.println("Name: "+this.name);
    
    }
    public void setAge(int age){
    
        this.age = age;
        System.out.println("Age: "+this.age);
    
    }
    public void setAccNum(long acc_num){
    
        this.acc_num = acc_num;
        System.out.println("Account Number: "+this.acc_num);
    
    }
    public void setBalance(long balance){
    
        this.balance = balance;
        System.out.println("Balance: $"+this.balance);
    }
    
      public void setDeposit(long deposit){
        this.deposit = deposit;
          System.out.println("Deposit: "+this.deposit);
      }
      
      public void Summary(){
      
          this.balance = this.balance + this.deposit;
          
          System.out.println("Remaining Balance: "+this.balance);
      
      }
}

class Main{
  
    public static void main(String[] args){
    
        BankAccount b = new BankAccount();
        BankAccount b2 = new BankAccount();
        
        b.setName("Rey Sinabianan");
        b.setAge(19);
        b.setAccNum(010101);
        b.setBalance(90000000);
        b.setDeposit(1000);
        b.Summary();
        
        System.out.println("-----");
        
        b2.setName("Joash Raut-Raut");
        b2.setAge(19);
        b2.setAccNum(203203);
        b2.setBalance(3000067);
        b2.setDeposit(5000);
        b2.Summary();

    
    }
}
