public class TestLogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dept d=new Dept();
		DeptDAO ddao=new DeptDAOImpl();
		Employee e=new Employee();
		EmployeeDAO edao = new EmployeeDAOImpl();
		System.out.println("Enter employee mail and password:");
		String mail=sc.next();
		System.out.println("Enter the password:");
		String password=sc.next();
		e=edao.findByMailAndPassword(mail,password);
		System.out.println(e);
		
		if(e!=null) {
			System.out.println("Login successfully");
			if(e.getId()==5) {
				System.out.println("1. Add an employee");
				System.out.println("2. View all employee");
				System.out.println("3. Delete the Employee");
				System.out.println("4. Add Dept");
				System.out.println("5. Update Dept");
				System.out.println("6. Delete Dept");
				System.out.println("7. View the Dept");
				System.out.println("8. Exit");
				System.out.println("Enter your choice");
				Integer choice=sc.nextInt();
				switch(choice) {
				case 1:

			    System.out.println("Enter Employee details you want to add");
			    System.out.println("Enter the emp id");
			    e.setId(sc.nextInt());

			    System.out.println("Enter the emp name");
			    e.setName(sc.next());

			    System.out.println("Enter job role");
			    e.setJob(sc.next());

			    System.out.println("Enter the mail");
			   e.setMail(sc.next());

			    System.out.println("Enter the dno");
			    e.setDno(sc.nextInt());

			    System.out.println("Enter the salary");
			    e.setSal(sc.nextDouble());

			    edao.addEmployee(e);
			    System.out.println(e);
			    break;
				
				case 2: List<Employee> ls=edao.findAll();
			            for(Employee ele : ls) {
			        	    System.out.println(ele);
			        }
			    break;
			    
				case 3: System.out.println("Enter the Employee id you want to delete");
				edao.deleteEmployee(sc.nextInt());
				break;
				
				case 4: System.out.println("Enter the dept details you want add");
					System.out.println("Enter the dept id:");
					d.setDno(sc.nextInt());
					
					System.out.println("Enter the dept name:");
					d.setDname(sc.next());
					
					System.out.println("Enter the dept location:");
					d.setLocation(sc.next());
					
					ddao.addDept(d);
					break;
					
				case 5:
					System.out.println("Enter dept id:");
					d = ddao.findById(sc.nextInt());
					System.out.println("Before update");
					System.out.println(d);
					System.out.println("Details are here");
					System.out.println("1. Dno");
					System.out.println("2. Dname");
					System.out.println("3. Location");
					System.out.println("Enter the choice you have to be updated");
					Integer dchoice=sc.nextInt();
					switch(dchoice){
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
				break;
				
				case 6: System.out.println("Enter the Dept id you want to delete");
				ddao.deleteDept(sc.nextInt());
				System.out.println(d);
				break;
				
				case 7:
					List<Dept> l=ddao.findAll();
			         for(Dept ele : l) {
			       	System.out.println(ele);
			       	}
					
			    break;
			    
				case 8: System.out.println("exit");
				break;
				
				default : System.out.println("Inalid!");
				}
				
			} else {
				System.out.println("1. View your account");
				System.out.println("2. Update your account");
				System.out.println("3. Exit");
				System.out.println("Enter the your choices");
				Integer choice1=sc.nextInt();
				switch(choice1) {
				case 1: System.out.println("Enter your employee id");
				e=edao.findById(sc.nextInt());
				System.out.println(e);
				break;
				
				case 2: 
					System.out.println("Enter employee id:");
					Integer id=sc.nextInt();
					e=edao.findById(id);
					System.out.println("Before updated");
					System.out.println(e);
					System.out.println("Details to update ");
					System.out.println("1. Name");
					System.out.println("2. Job");
					System.out.println("3. salary");
					System.out.println("4. Dno");
					System.out.println("5. Mail");
					System.out.println("6. Password");
					System.out.println("7. Id");
					System.out.println("Enter the choices you have to be updated:");
					
					Integer choice=sc.nextInt();
					switch(choice) {
					case 1: System.out.println("Enter the name to be updated");
					e.setName(sc.next());
					break;
					
					case 2: System.out.println("Enter the job role to be updated");
					e.setJob(sc.next());
					break;
					
					case 3: System.out.println("Enter the salary to be updated");
					e.setSal(sc.nextDouble());
					break;
					
					case 4: System.out.println("Enter the dno to be updated");
					e.setDno(sc.nextInt());
					break;
					
					case 5: System.out.println("Enter the mail to be updated");
					e.setMail(sc.next());
					break;
					
					case 6: System.out.println("Enter the password to be updated");
					e.setPassword(sc.next());
					break;
					
					case 7: System.out.println("Enter the id to be updated");
					e.setId(sc.nextInt());
					break;
					
					default : System.out.println("invalid choice");
					}
					edao.updateEmployee(e);
					System.out.println("Data modified");
					System.out.println("After update");
					System.out.println(e);
					break;
					
				case 3:System.out.println("Exit");
				break;
				
				default: System.out.println("Invalid");
				}	
			}
		} else {
			System.out.println("login failed");
		}
	}

}

