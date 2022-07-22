package com.day7.OOPS;

/*
The purpose of the application is to help a ficticious company called karthik Burgers to manage
their process of selling hamburgers.
*/

/*
 Our application will help Bill to select types of burgers, some of the additional items (additions) to
 be added to the burgers and pricing.
*/

 class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

// The basic hamburger should have the following items.

    // bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
	// the customer can select to be added to the burger.

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
        System.out.println("Added "+this.addition1Name+" for an extra " +this.addition1Price);
        this.price+=this.addition1Price;

    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
        System.out.println("Added "+this.addition2Name+" for an extra " +this.addition2Price);
        this.price+=this.addition2Price;

    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
        System.out.println("Added "+this.addition3Name+" for an extra " +this.addition3Price);
        this.price+=this.addition3Price;

    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
        System.out.println("Added "+this.addition4Name+" for an extra " +this.addition4Price);
        this.price+=this.addition4Price;

    }

    public double itemizehamburger(){
        System.out.println(this.name+" hamburger "+"on a "+this.breadRollType+" roll "+"with "+this.meat+", price is "+this.price );
        return this.price;
    }

}


	//  Healthy burger (on a  bread roll), plus two addition items can be added.
 class HealthyBurger extends Hamburger {
    private  String healthyExtra1Name;
    private double  healthyExtra1Price;

    private  String healthyExtra2Name;
    private double  healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, "Brown  rey ", price);
    }

    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1Price=price;
    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice =super.itemizehamburger();
        if(this.healthyExtra1Name!= null){
            hamburgerPrice+=this.healthyExtra1Price;
            System.out.println("Added "+this.healthyExtra1Name+"for an extra "+this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name!= null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra2Name+"for an extra "+this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}





 // Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
     class DeluxeBurger extends Hamburger {
        public DeluxeBurger() {
            super("Deluxe", "Sausage & Bacon", "white Roll", 19.10);
        }

        @Override
        public void addHamburgerAddition1(String addition1Name, double addition1Price) {
    //        super.addHamburgerAddition1(addition1Name, addition1Price);
            System.out.println("cannot add additional items to a deluxe burger");
        }

        @Override
        public void addHamburgerAddition2(String addition2Name, double addition2Price) {
    //        super.addHamburgerAddition2(addition2Name, addition2Price);
            System.out.println("cannot add additional items to a deluxe burger");
        }

        @Override
        public void addHamburgerAddition3(String addition3Name, double addition3Price) {
    //        super.addHamburgerAddition3(addition3Name, addition3Price);
            System.out.println("cannot add additional items to a deluxe burger");
        }

        @Override
        public void addHamburgerAddition4(String addition4Name, double addition4Price) {
    //        super.addHamburgerAddition4(addition4Name, addition4Price);
            System.out.println("cannot add additional items to a deluxe burger");
        }
    }






 class OOPS {


    public static void main(String[] args) {
   
        Hamburger a=new Hamburger("karthik","goat","sp",10);

       
        System.out.println(a.itemizehamburger());
        a.addHamburgerAddition1("Egg",5);
        System.out.println(a.itemizehamburger());
        a.addHamburgerAddition2("cheese",10);
        System.out.println(a.itemizehamburger());
        a.addHamburgerAddition3("panner",56);
        System.out.println(a.itemizehamburger());
        a.addHamburgerAddition4("corn",30);
        System.out.println(a.itemizehamburger());



        //  DeluxeBurger db=new DeluxeBurger();
        //  db.addHamburgerAddition1("Egg",21.3);
        //  db.addHamburgerAddition2("meat",21.3);
        //  System.out.println(db.itemizehamburger());
 
        // HealthyBurger hb=new HealthyBurger("bacon",5.67);
        //  hb.addHamburgerAddition1("Egg",5.43);
        //  hb.addHealthyAddition1("lentils",3.41);
        //  System.out.println(hb.itemizehamburger());





        // Hamburger hamburger=new Hamburger("Basic","Sausage","white",3.56);
        // double price=hamburger.itemizehamburger();
        // hamburger.addHamburgerAddition1("tomato",0.27);
        // hamburger.addHamburgerAddition2("Lettuce",0.75);
        // hamburger.addHamburgerAddition3("cheese",1.13);
        // System.out.println("Total Burger Price is "+ hamburger.itemizehamburger());


        // HealthyBurger healthyBurger=new HealthyBurger("Bacon",5.67);
        // healthyBurger.addHamburgerAddition1("Egg",5.43);
        // healthyBurger.addHealthyAddition1("Lentils",3.41);
        // System.out.println("Total Healthly Burger Price is "+healthyBurger.itemizehamburger());
    }
    }
