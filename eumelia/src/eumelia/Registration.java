package eumelia;

public class Registration  {
  String name, id, versity_mail, title;
  int code;
  String studentname,Bookname,Writername,adress;
  float discount;
  int price,money;
  String publishers,date;
  static final String shopname;
  void Regis(String name, String id, String versity_mail, int code, String title)
  {
    this.name = name;
    this.id = id;
    this.versity_mail = versity_mail;
    this.code = code;
    this.title = title;
  }
  void Regist(String name, String id, String versity_mail)
  {
    this.name = name;
    this.id = id;
    this.versity_mail = versity_mail;
  }
  void display()
  {
    System.out.println(" Your Name is: "+name);
    System.out.println(" Your ID is: "+id);
    System.out.println(" Your Versity Mail: "+versity_mail);
    if(code != 0)
    {
      System.out.println(" Code Number: "+code);
      System.out.println(" Book Title: "+title);
    }
    else
    {
      System.out.println(" You Have not selected any book til now. Please Go back and Select any Book from our Library.");
    }
  }
  static{
    shopname="Grontho Diyari";
  }
  private int phonenumber;
  private String email;
  static String city="Notunbazar";
  void Information(String cn,String ad) {
    studentname=cn;
      adress=ad;
      
    
  }
  void Regi(String p,String dt){
    publishers=p;
    date=dt;  
  }
  static void information() {
    String shopadress="NotunBazar,Mymensingh";
    String shopowner="Sharmin Islam";
    System.out.println();
    System.out.println("    -------------------------------------");
    System.out.println(" *                                         *");
    System.out.println("|************ Only For Students ******** |");
    System.out.println("|Students will get 40% discount on each item |");
    System.out.println(" *                                         *");
    System.out.println("    -------------------------------------");
    System.out.println(" Shops's Information");
    System.out.println(" Shop's Adress:"+shopadress);
    System.out.println(" Shop's Owner:"+shopowner);
    System.out.println(" Shop's Name:"+shopname);
    
  }
  public String Setemail(String ea) {
    email=ea;
    return email;
  }


   void display4() {

    System.out.println(" Student's name:"+studentname);
    System.out.println(" Student's Adress:"+adress);
    //System.out.println("Phone Number:"+phonenumber);
    System.out.println(" City Name:"+city);
    System.out.println();
  }
  public int Setphone(int ph) {

    phonenumber=ph;
    return phonenumber;
    
  }
  void BookInfo(String Bookname,String Writername,int price,float discount){
    this.Bookname=Bookname;
    this.Writername=Writername;
    this.price=price;
    this.discount=discount;
    
  }
  void BookInfo(String Bookname,String Writername,int price){
    this.Bookname=Bookname;
    this.Writername=Writername;
    this.price=price;
  }  

  public int returnmoney(int money) {
    return 40*(money)/100;
    
  }
  void writersdisplay() {
    
    System.out.println(" Book's Information");
  System.out.println(" Book's Name:"+Bookname);
    System.out.println(" Writer's name:"+Writername);
    System.out.println(" Book's price:"+price);
    System.out.println(" Book's discount:"+discount);
    System.out.println(" Publishers name:"+publishers);
    System.out.println(" Date:"+date);
  }

  void Information2(String cn,float f) {
    studentname=cn;
    discount=f;
    System.out.println();
    System.out.println(" 2nd Student's Information");
    System.out.println(" Student's name:"+studentname);
    System.out.println(" Student's discount:"+discount);
  }
  void totalsell(int...sell) {
    int calculation=0;
    for(int taka:sell) {
    calculation=calculation+taka;
    
    }
    System.out.println(" Total Sell:"+calculation);
  }
  }