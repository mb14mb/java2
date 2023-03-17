
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab2b {
	
	String name, usn, dept;
	Lab2b(String name, String usn, String dept){
		this.name = name;
		this.usn = usn;
		this.dept = dept;
	}
	
	public void display(List<Lab2b> list) {
		Iterator<Lab2b> itr = list.iterator();
		while(itr.hasNext()) {
			Lab2b ar = itr.next();
			System.out.println("**************************************************");
			System.out.println(ar.name+","+ar.usn+","+ar.dept );
			System.out.println("**************************************************");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Lab2b> list = new LinkedList<Lab2b>();
		
		LinkedList<Lab2b> list1 = new LinkedList<Lab2b>(list);
		Lab2b  aa = new Lab2b("Abhi","1rv21mc001", "MCA");
		
		
		
		while(true) {
			System.out.println("Select your option");
			System.out.println("1.Add First"
					+ "\n2.Add Last"
					+ "\n3.Update Data"
					+ "\n4.Display LinkedList"
					+ "\n5.Remove First"
					+ "\n6.Remove Last"
					+ "\n7.Clear Data"
					+ "\n8.Search By Name"
					+ "\n9.Exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			
			  
			if(ch==1) {
				System.out.println("Enter Student Details");
				System.out.println("Enter Student Name : ");
				String name = sc.next();
				System.out.println("Enter Student USN : ");
				String usn = sc.next();
				System.out.println("Enter Student Department : ");
				String dept = sc.next();
				
				Lab2b obj = new Lab2b(name, usn, dept);
				list1.addFirst(obj);
				
			}
			
			if(ch==2) {
				System.out.println("Enter Student Details");
				System.out.println("Enter Student Name : ");
				String name = sc.next();
				System.out.println("Enter Student USN : ");
				String usn = sc.next();
				System.out.println("Enter Student Department : ");
				String dept = sc.next();
				
				Lab2b obj = new Lab2b(name, usn, dept);
				list1.addLast(obj);
			}
			
			if(ch==3) {
				System.out.println("Enter index number to update : ");
				int index = sc.nextInt();
				System.out.println("Enter Student Name : ");
				String name = sc.next();
				System.out.println("Enter Student USN : ");
				String usn = sc.next();
				System.out.println("Enter Student Department : ");
				String dept = sc.next();
				
				Lab2b obj2 = new Lab2b(name, usn, dept);
				list1.set(index, obj2);
				
			}
			if(ch==4) {
				if(list1.isEmpty()) {
					System.out.println("Linked List is Empty!!!");
				}else {
					
					aa.display(list1);
				}
			}
			if(ch==5) {
				
				list1.removeFirst();
				System.out.println("**************************************************");
				System.out.println("First Data Removed");
			}
			if(ch==6) {
				list1.removeLast();
				System.out.println("**************************************************");
				System.out.println("Last Data Removed");
			}
			if(ch==7) {
				list1.clear();
				System.out.println("**************************************************");
				System.out.println("Linked list Data is cleared");
			}
			
			if(ch==8) {
				System.out.println("Search Linked List by Name : ");
				String search = sc.next();
				Iterator<Lab2b> itr = list1.iterator();
				while(itr.hasNext()) {
					Lab2b ar = itr.next();
					if(ar.name.equalsIgnoreCase(search)) {
						System.out.println(search+" Data found");
					}else {
						System.out.println(search+" Data Not Found");
					}
				}
				
			}
			if(ch==9) {
				break;
			}
			
		}sc.close();
		
		
		
	}

}

