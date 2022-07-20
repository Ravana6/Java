package com.day5.inheritance.Hierarchicalinheritance;



class Emp   //EMP ---> employee
{
	String Ename;
	private int eid;

	public int geteid()
	{
		return this.eid;
	}
	private double sal;
	
	public double getsal()
	{
		return this.sal;
	}
	
	public void setsal(double sal)
	{
		if (sal>=10500)
		{
				this.sal=sal;
		}
	
	}
	


	public  void set_SAL(double a)
	{
		if (a>=10500)
		{
			this.sal=a;
		}
		
	}


	int deptno;
	String desg;

	void work()
	{
		System.out.println(this.Ename+ "  is working in with a desg"+this.desg);
	}
	
		Emp(String Ename,int eid,double sal,int deptno,String desg)
	{
			this.Ename=Ename;
			this.eid=eid;
			if (sal>=10500)
			{
				this.sal=sal;
			}
			else
			{
				this.sal=10500;
			}
			
			this.deptno=deptno;
			this.desg=desg;
	}
	Emp()
	{
	}
}

class DEV extends Emp       //DEV --->developer
{
	String ProgLang;

	DEV(String Ename,int eid,double sal,int deptno,String desg,String ProgLang)
	{
		super(Ename,eid,sal,deptno,desg);
		this.ProgLang=ProgLang;
	}
	DEV()
	{

	}
}

class BED extends DEV    //BackEnd Developer extends developer
{
	BED(String Ename,int eid,double sal,String ProgLang)
	{
		super(Ename,eid,sal,4,"BED",ProgLang);
	}
}

class FED extends DEV      //Front-End  Developer extends developer
{
	FED(String Ename,int eid,double sal,String ProgLang)
	{
		super(Ename,eid,sal,3,"FED",ProgLang);
	}
}

class TE extends Emp   //TE --->Test Engineer
{
	String domain;

	TE(String Ename,int eid,double sal,int deptno,String desg,String domain)
	{
		super(Ename,eid,sal,deptno,desg);
		this.domain=domain;
	}
	TE()
	{
	}
}


class ATE extends TE  //Automation Test Engineer   extends  Test Engineer
{
	ATE(String Ename,int eid,double sal,String domain)
	{
		super(Ename,eid,sal,2,"ATE",domain);
		
	}
}

class MTE extends TE   // Manual  Test Engineer  extends  Test Engineer
{
	MTE(String Ename,int eid,double sal,String domain)
	{
		super(Ename,eid,sal,1,"MTE",domain);
		
	}
}
public class Company {
    
	public static void main(String[] args) 
	{

		MTE e1=new MTE("gunda",1,13000,"BANKING");
		System.out.println("name :  "+e1.Ename);//gunda
		System.out.println("eid :  "+e1.geteid());//1
		System.out.println("sal : "+e1.getsal());//13000
		System.out.println("deptno : "+e1.deptno);//1
		System.out.println("desn :  "+e1.desg);//MTE
		System.out.println("domain  : "+e1.domain);//banking
		e1.setsal(15000);
		System.out.println("sal :  "+e1.getsal());//13000
		e1.work();
		
		System.out.println("===========================================");
		System.out.println("===========================================");

		ATE e2=new ATE("sundra",2,10500,"Ecomerce");
		System.out.println("name :  "+e2.Ename);
		System.out.println("eid :  "+e2.geteid());
		System.out.println("sal : "+e2.getsal());
		System.out.println("deptno : "+e2.deptno);
		System.out.println("desn : "+e2.desg);
		System.out.println("domain : "+e2.domain);
		e2.setsal(14000);
		System.out.println("sal : "+e2.getsal());
		e2.work();


	}
}
