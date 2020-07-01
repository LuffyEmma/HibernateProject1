package school;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class School {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StandardServiceRegistry registry =new StandardServiceRegistryBuilder().configure().build();
			MetadataSources mds = new MetadataSources(registry);
			Metadata md =mds.getMetadataBuilder().build();
			SessionFactory sessionF =md.getSessionFactoryBuilder().build();
			Session session =sessionF.openSession();

			boolean flag =true;

			while(flag) {
				System.out.println("Press 1 For Class-9"+"\n"+"Press 2 For Class-10"+"\n"+"Press 3 For EXIT");
				System.out.println("Enter Your Choice : ");
				System.out.println("*****************************");
				int key =sc.nextInt();
				switch (key) {
				case 1:
					boolean flag1=true;
					System.out.println("Class-9 Student's Details");
					System.out.println("*****************************");
					while(flag1) {
						System.out.println("Press 1 For Enter Details"+"\n"+"Press 2 For Retrieve Details"+"\n"+"Press 3 For GoTO Main Menu"+"\n"+"Press 4 For Terminate Programm");
						System.out.println("Enter Your Choice : ");
						System.out.println("*****************************");
						int ch =sc.nextInt();
						switch (ch) {
						case 1:
							Class9 class9 =new Class9();
							System.out.println("Enter Student's Name");
							class9.setName(sc.next());

							System.out.println("Enter Class-9 Section(A/B/C/D)");
							class9.setSection(sc.next());

							System.out.println("Enter student's Current Year Percentage");
							class9.setCurrent_Percent(sc.nextDouble());

							System.out.println("Enter student's Last Year Percentage");
							class9.setLast_Year_Percent(sc.nextDouble());

							session.save(class9);
							session.beginTransaction().commit();
							System.out.println("*****************************");

							break;

						case 2:         
							System.out.println("Enter Student Name :");
							String name =sc.next();
							Class9 cls9 = session.get(Class9.class, name);
							System.out.println("*****************************");
							System.out.println("Student Name :"+ cls9.getName());	
							System.out.println("Section : " + cls9.getSection());
							System.out.println("Current Year Percentage :"+ cls9.getCurrent_Percent());	
							System.out.println("Last Year Percentage : " + cls9.getLast_Year_Percent());
							System.out.println("*****************************");

							break;
						case 3:
							flag1=false;
							break;
						case 4:
							System.out.println("Thank You...");
							System.exit(0);
							break;

						default:
							System.out.println("InVaLiD INPUT...");
							break;
						}
					}
					break;

				case 2:
					boolean flag2=true;
					System.out.println("Class-10 Student's Details");
					System.out.println("*****************************");
					while(flag2) {
						System.out.println("Press 1 For Enter Details"+"\n"+"Press 2 For Retrieve Details"+"\n"+"Press 3 For GoTO Main Menu"+"\n"+"Press 4 For Terminate Programm");
						System.out.println("Enter Your Choice : ");
						System.out.println("*****************************");
						int ch =sc.nextInt();
						switch (ch) {
						case 1:
							Class10 class10 =new Class10();

							System.out.println("Enter Student's Name");
							class10.setName(sc.next());

							System.out.println("Enter Class-10 Section(A/B/C/D)");
							class10.setSection(sc.next());

							System.out.println("Enter student's Current Year Percentage");
							class10.setCurrent_Percent(sc.nextDouble());

							System.out.println("Enter student's Last Year Percentage");
							class10.setLat_Year_Percent(sc.nextDouble());

							session.save(class10);
							session.beginTransaction().commit();
							System.out.println("*****************************");

							break;

						case 2:
							System.out.println("Enter Student Name :");
							String name =sc.next();
							Class10 cls10 = session.load(Class10.class, name);
							System.out.println("*****************************");
							System.out.println("Student Name :"+ cls10.getName());	
							System.out.println("Section : " + cls10.getSection());
							System.out.println("Current Year Percentage :"+ cls10.getCurrent_Percent());	
							System.out.println("Last Year Percentage : " + cls10.getLast_Year_Percent());
							System.out.println("*****************************");
							break;
						case 3:
							flag2=false;
							break;
						case 4:
							System.out.println("Thank You...");
							System.exit(0);
							break;
							
						default:
							System.out.println("InVaLiD INPUT...");
							break;
						}
					}
					break;

				case 3:	
					System.out.println("Thank You...");
					System.exit(0);
					break;

				default:
					System.out.println("InVaLiD INPUT...");
					break;
				}
			}
		}
	}
}
