

package javaapplication32;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      int  siz=0,sizU=0;
     Scanner in=new Scanner(System.in);
      Student student=new Student();
     Student[] s=new Student[10];
    User[] u=new User[10];
    for(int i=0;i<10;i++){
        s[i]=student;
        u[i]=new User();
    }
    while(true){
        System.out.println("1.Admin");
           System.out.println("2.User");
      int op;
      op=in.nextInt();
    if(op==1){
          String uname,pass;
       System.out.println("Enter username: ");
       uname=in.nextLine();
       System.out.println("Enter Password: ");
       pass=in.nextLine();
       Admin admin=new Admin();
       if(uname==admin.username&&pass==admin.pass){
            System.out.println("1.Add  ");
             System.out.println("2.View  ");
              System.out.println("3.Edit  ");
               System.out.println("4.Delete  ");
                System.out.println("5.Logout  ");
               int op2;
               op2=in.nextInt();
                int id;
                   String name;
              double due;
               switch(op2){              
                   case 1:    System.out.println("Enter ID  ");id=in.nextInt();   System.out.println("Enter The Name : "); name=in.nextLine();
                   u[sizU]=new User(id,name);sizU++;break;
                   
                   
                   case 2:for(int i=0;i<10;i++){
                       System.out.println(s[i].getter());
                   };break;
                   case 3: System.out.println("Enter ID  ");id=in.nextInt();  
                       for(int i=0;i<10;i++){
                       if(id==(s[i].getid())){
                          System.out.println("Enter ID  ");id=in.nextInt();   System.out.println("Enter The Name : "); name=in.nextLine();
                   System.out.println("Enter The Due Fee : "); due=in.nextDouble();
                   s[i]=new Student(id,name,due);; 
                       }
                   };break;
                       
                   case 4:System.out.println("Enter ID  ");id=in.nextInt();  
                       for(int i=0;i<10;i++){
                       if(id==(s[i].getid())){
                         s[i].delet();  
                       };
                       }break;
                   
               }
       }
    }
    else if(op==2){
           System.out.println("1.Add  ");
             System.out.println("2.View  ");
              System.out.println("3.Edit  ");
               System.out.println("4.Delete  ");
               System.out.println("5.Logout  ");
           int op2;
               op2=in.nextInt();
                int id;
                   String name;
              double due;
               switch(op2){              
                   case 1:    System.out.println("Enter ID  ");id=in.nextInt();   System.out.println("Enter The Name : "); name=in.nextLine();
                   System.out.println("Enter The Due Fee : "); due=in.nextDouble();
                   s[siz]=new Student(id,name,due);siz++;
                   
                   
                   case 2:for(int i=0;i<10;i++){
                       System.out.println(s[i].getter());
                   };
                   case 3: System.out.println("Enter ID  ");id=in.nextInt();  
                       for(int i=0;i<10;i++){
                       if(id==(u[i].getid())){
                          System.out.println("Enter ID  ");id=in.nextInt();   System.out.println("Enter The Name : "); name=in.nextLine();
                  
                   u[i]=new User(id,name);; 
                       }
                   };
                       ;
                   case 4:System.out.println("Enter ID  ");id=in.nextInt();  
                       for(int i=0;i<10;i++){
                       if(id==(u[i].getid())){
                         u[i].delet();  
                       };
                       }
                   
               }
       }else {
             System.out.println("error of username or password !!");
       }
    }
    
    }
     
    }
    

class Student{
   private int id;
   private String name;
   private double due_fee;
   public Student(){
    }
   public Student(int id,String name,double due){
       this.id=id;
        this.name=name;
        this.due_fee=due;
    }
   public void delet(){
       this.id = 0;
       name="";
       due_fee=0;
   }
   
    
    public void setter(int id,String name,double due){
        this.id=id;
        this.name=name;
        this.due_fee=due;
    }
    public String getter(){
        return "ID : "+id+"\nName : "+name+"\n Due fee : "+due_fee;
    }
       public void setDue_fee(double due){
        this.due_fee=due;
    }
    public String getDue_fee(){
        return " Due fee : "+due_fee;
    }
     public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return "\nName : "+name;
    }
    public int getid(){
        return id;
    }
    
}
class User{
   private int id;
   private String name;
   public User(){
   }
    public void delet(){
       this.id = 0;
       name="";
   }
  public User(int id ,String name){
       this.id=id;
       this.name=name;
   }
    public int getid(){
        return id;
    }
   public void setter(int id ,String name){
       this.id=id;
       this.name=name;
   }
   public String getter(){
          return "ID : "+id+"\nName : "+name;
   }
     public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return "\nName : "+name;
    }
}
class Admin{
    String username;
    String pass;
  Admin(){
      username="Ali123";
      pass="a1234";
  }
  public String getuser(){
      return username;
  }
  public String getPass(){
      return pass;
  }
  
}