public class TestD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Dept d=new Dept();
		DeptDAO ddao=new DeptDAOImpl();
        
		System.out.println("Enter the dept id:");
		d.setDno(sc.nextInt());
		
		System.out.println("Enter the dept name:");
		d.setDname(sc.next());
		
		System.out.println("Enter the dept location:");
		d.setLocation(sc.next());
		
		ddao.addDept(d);
		
		//findById
		System.out.println("Enter dept id:");
		Dept deptl=ddao.findById(sc.nextInt());
		System.out.println(deptl);
		
		//findByAll
		List<Dept> ls=ddao.findAll();
        for(Dept ele : ls) {
      	System.out.println(ele);
      	}
		deleteDept
		System.out.println("Enter dept number which you want to delete");
		Dept deptl=ddao.deleteDept(sc.nextInt());
		System.out.println(deptl);
		
		//UpdateAll
		System.out.println("Enter dept id:");
		Dept d=ddao.findById(sc.nextInt());
		System.out.println("Before update");
		System.out.println(d);
		System.out.println("Details are here");
		System.out.println("1. Dno");
		System.out.println("2. Dname");
		System.out.println("3. Location");
		System.out.println("Enter the choice you have to be updated");
		Integer choice=sc.nextInt();
		switch(choice){
			case 1: System.out.println("Enter dno to be updated");
			d.setDno(sc.nextInt());
			break;
			
			case 2:System.out.println("Enter dname to be updated");
			d.setDname(sc.next());
			break;
			
			case 3:System.out.println("Enter location to be updated");
			d.setLocation(sc.next());
			break;
			
			default:System.out.println("Invalid choice");
		}
		ddao.updateDept(d);
		System.out.println("data modified");
		System.out.println("After Updated");
		System.out.println(d);
	}
}	
	
