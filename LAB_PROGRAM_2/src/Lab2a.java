import java.util.*;

public class Lab2a {
	
	String name, usn, dept;
	Lab2a(String name, String usn, String dept){
		this.name = name;
		this.usn = usn;
		this.dept = dept;
	}
	
	public void display(List<Lab2a> list) {
		Iterator<Lab2a> itr = list.iterator();
		while(itr.hasNext()) {
			Lab2a ar = itr.next();
			System.out.println("**************************************************");
			System.out.println("Name : "+ar.name+", USN : "+ar.usn+", Department : "+ar.dept );
			System.out.println("**************************************************");
		}
	}
	

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Lab2a  aa = new Lab2a("Abhi","1rv21mc001", "MCA");
		List<Lab2a> list = new ArrayList<Lab2a>();
		
		
		while(true) {
			System.out.println("Select your option");
			System.out.println("1.Add Data"
					+ "\n2.Update Data"
					+ "\n3.Display ArrayList"
					+ "\n4.Remove Data"
					+ "\n5.Clear Data"
					+ "\n6.Search by name"
					+ "\n7.Exit");
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
				
				Lab2a obj = new Lab2a(name, usn, dept);
				list.add(obj);
			}
			
			if(ch==2) {
				System.out.println("Enter index number to update : ");
				int index = sc.nextInt();
				System.out.println("Enter Student Name : ");
				String name = sc.next();
				System.out.println("Enter Student USN : ");
				String usn = sc.next();
				System.out.println("Enter Student Department : ");
				String dept = sc.next();
				
				Lab2a obj2 = new Lab2a(name, usn, dept);
				list.set(index, obj2);
				
			}
			if(ch==3) {
				aa.display(list);
			}
			if(ch==4) {
				System.out.println("Enter index number to remove : ");
				int index = sc.nextInt();
				list.remove(index);
				System.out.println("**************************************************");
				System.out.println("Selected Index Data is removed");
			}
			if(ch==5) {
				list.clear();
				System.out.println("**************************************************");
				System.out.println("Array list Data is cleared");
			}
			if(ch==6) {
				System.out.println("Search Array by Name : ");
				String search = sc.next();
				Iterator<Lab2a> itr = list.iterator();
				while(itr.hasNext()) {
					Lab2a ar = itr.next();
					if(ar.name.equalsIgnoreCase(search)) {
						System.out.println(search+" Data found");
					}else {
						System.out.println(search+" Data Not Found");
					}
				}
				
			}
			if(ch==7) {
				break;
			}
			
		}sc.close();
		
		
		
	}

}
