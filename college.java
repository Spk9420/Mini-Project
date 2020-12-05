//engineering college activity system
package miniproject1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

abstract class Engineering_College
{
	public static void Sports()  
	{
		System.out.println("Cricket");
		System.out.println("Football");
	}
	public static void Festival()
	{
		System.out.println("Traditional days");
		System.out.println("Garba Night");
		System.out.println("Cultural Activity");
	}
	public void Non_Technical_Events()
	{
		System.out.println("Blind-Folder");
		System.out.println("Fun-Fare");
		System.out.println("Tresure Hunt");
	}
	public static void Print_Dept_List(HashMap<Engineering_College,Integer> map)
	{
		Set<Entry<Engineering_College, Integer>> set=map.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	
	@Override
	public String toString() {
		return "Dept = " + getClass().getSimpleName()+" , participants";
	}
	public abstract void Technical_Activities();
}
class Extc extends Engineering_College
{
	@Override
	public void Technical_Activities() 
	{
		System.out.println("Circuit Breaker /n ");
		System.out.println("Arduino Workshop");
		System.out.println("PCB Design");
	}
	public void Non_Technical_Events()
	{
		super.Non_Technical_Events(); 
		System.out.println("PUBG");  
	}
	
}
class Mech extends Engineering_College
{

	@Override
	public void Technical_Activities() 
	{
		System.out.println("Robotics");
		System.out.println("Technical Talk on HVAC");
		System.out.println("Project Design");
	}
	public void Non_Technical_Events()
	{
		super.Non_Technical_Events();
		System.out.println("Blood-Donation");
	}
}
class Civil extends Engineering_College
{

	@Override
	public void Technical_Activities() 
	{
		System.out.println("Site Survey");
		System.out.println("Prototypes Designing");
		System.out.println("Technical Quiz");
		
	}
	public void Non_Technical_Events()
	{
		super.Non_Technical_Events();
		System.out.println("Painting");
	}
	
}
class IT extends Engineering_College
{

	@Override
	public void Technical_Activities() 
	{
		System.out.println("Coding competetion");
		System.out.println("Web Site Developing");
		System.out.println("Code Pair");
	}
	public void Non_Technical_Events()
	{
		super.Non_Technical_Events();
		System.out.println("Rangoli Competetion");
	}
	
}

public class college 
{
	public static void main(String[] args) 
	{
		
		Extc e=new Extc();  
		Mech m=new Mech();
		Civil c=new Civil();
		IT i=new IT();
		
		HashMap<Engineering_College,Integer> map=new HashMap<Engineering_College,Integer>();
		map.put(e, 10);
		map.put(m, 15);
		map.put(c, 12);
		map.put(i, 17);
		int no; 
		do    
		{
			System.out.println("\n1.Sports: \n2.Festival \n3.Non-Technical-Event \n4.Technical-Activity \n5.Print DeptList with participants \n0:Exit");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Input: ");
			no=sc.nextInt();
			
			switch(no)  
			{
			case 1:
				Engineering_College.Sports();
				break;
				
			case 2:
				Engineering_College.Festival();
				break;
				
			case 3:
				int x;  
				do
				{
					System.out.println("\n1.Non-Tech for Extc: \n2.Non-Tech for Mech: \n3.Non-Tech for Civil: \n4.Non-Tech for IT: \n0.Exit");
					System.out.print("Enter for for which Dept: ");
					x=sc.nextInt();
					
					switch(x)
					{
					case 1:
						e.Non_Technical_Events();
						break;
						
					case 2:
						m.Non_Technical_Events();
						break;
						
					case 3:
						c.Non_Technical_Events();
						break;
						
					case 4:
						i.Non_Technical_Events();
						break;
						
					case 0:
						System.out.println("Exiting...");
						break;
						
					default:
						System.out.println("Please select valid Input");
						break;
					}
				}
				while(x!=0);
				break;
				
			case 4:
				int z;
				do
				{
					System.out.println("\n1.Technical Activity for Extc: \n2.Technical Activity for Mech: \n3.Technical Activity for Civil: \n4.Technical Activity for IT: \n0.Exit");
					System.out.print("Enter for for which Dept: ");
					z=sc.nextInt();
					
					switch(z)
					{
					case 1:
						e.Technical_Activities();
						break;
						
					case 2:
						m.Technical_Activities();
						break;
						
					case 3:
						c.Technical_Activities();
						break;
						
					case 4:
						i.Technical_Activities();
						break;
						
					case 0:
						System.out.println("Exiting...");
						break;
						
					default:
						System.out.println("Please select valid Input");
						break;
					}
				}
				while(z!=0);
				break;
				
			case 5:
				Engineering_College.Print_Dept_List(map);
				break;
				
			case 0:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Please enter valid Input");
				
			}
		}
		while(no!=0);
	}
}