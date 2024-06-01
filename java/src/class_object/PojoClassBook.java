package class_object;

import java.util.Scanner;

class Liabrary
{
	int bid,bprice;
	String bname, bauthor, bpublication;

	public int getBid() 
	{
		return bid;
	}
	public void setBid(int bid) 
	{
		this.bid = bid;
	}
	public String getBname() 
	{
		return bname;
	}
	public void setBname(String bname) 
	{
		this.bname = bname;
	}
	public String getBauthor() 
	{
		return bauthor;
	}
	public void setBauthor(String bauthor) 
	{
		this.bauthor = bauthor;
	}
	public String getBpublication() 
	{
		return bpublication;
	}
	public void setBpublication(String bpublication) 
	{
		this.bpublication = bpublication;
	}
	public int getBprice() 
	{
		return bprice;
	}
	public void setBprice(int bprice) 
	{
		this.bprice = bprice;
	}
}
public class PojoClassBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,price, size;
		String name, author, pub;
		 System.out.println("Enter the size");
		   size= sc.nextInt();
		Liabrary l[] = new Liabrary[size+1];
		
		int ch ;
		do 
		{
			System.out.println("----------Welcome to- Publication Control---------");
			System.out.println("Enter choice for foloowing operation:--->");
			System.out.println("1.Add Book detail\n2.Display all book detail\n"
					+ "3.Display Book(price 100-500)\n4.Search Book\n"
					+ "5.Update Book Details\n6.Delete Book Details\n"
					+ "7.Count Book Details\n8.Sort Book by Id\n9.Exit code");
			System.out.println("__________________________________________________");
		 ch = sc.nextInt();
		switch(ch)
		{
		
		case 1://Add Book details
		{
			for(int i=0;i<size;i++)
			{
				l[i] = new Liabrary();
				System.out.println("Enter Book Id, Name, Author, Publication and Price ");
				id = sc.nextInt();
				l[i].setBid(id);
				
				sc.nextLine();
				name = sc.nextLine();
				l[i].setBname(name);
				
				author = sc.nextLine();
				l[i].setBauthor(author);
				
				pub = sc.nextLine();
				l[i].setBpublication(pub);
				
				price = sc.nextInt();
				l[i].setBprice(price);
			}
		}
			break;
		case 2://Display All Book details
			System.out.println("The all Books Details is here:--->");
			for(int i=0;i<size;i++)
			{
				System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
				System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
			}
			break;
		case 3://Book under 100-500
			System.out.println("The all Books under 100-500rs:--->");
			for(int i=0;i<size;i++)
			{
				if(l[i].getBprice()>100 && l[i].getBprice()<500)
				{
					System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
					System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
				}	
			}
			break;
		case 4://Search Book
			int c;
			do
			{
				System.out.println("Enter search by:");
				System.out.println("1.by id\n2.by Name\n3.by Author\n4.by Publication\n5.by Price\n6.Exit from Search");
				c = sc.nextInt();
				sc.nextLine();
				switch(c)
				{
				case 1:
					System.out.println("Enter The Book Id For Search:");
					int sid=sc.nextInt();
					for(int i=0; i<size;i++)
					{
					   if(sid==l[i].getBid()) 
					   {
						   System.out.println("Book\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice()); 
						   System.out.println("---Succesfully Searched---");
					   }
					}
					break;
				case 2:
					System.out.println("Enter The Book name For Search:");
					String bn = sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(bn.compareTo(l[i].getBname())==0) 
					   {
						   System.out.println("Book id\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						   System.out.println("---Succesfully Searched---");
					   }	
					}
					break;
				case 3:
					System.out.println("Enter The Book Author For Search:");
					String au=sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(au.compareTo(l[i].getBauthor())==0) 
					   {
						   System.out.println("Book id\tName\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						   System.out.println("---Succesfully Searched---");
						}	
					}
					break;
				case 4:
					System.out.println("Enter The Book Publication For Search:");
					String bp=sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(bp.compareTo(l[i].getBpublication())==0) 
					   {
						   System.out.println("Book id\tName\tAuhor\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t\t"+l[i].getBprice());
						   System.out.println("---Succesfully Searched---");
						}	
					}
					break;
				case 5:
					System.out.println("Enter The Book Price For Search:");
					int Bp=sc.nextInt();
					for(int i=0; i<size;i++)
					{
					   if(Bp==l[i].getBprice()) 
					   {
						   System.out.println("Book id\tName\tAuhor\tPublication");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication());
						   System.out.println("---Succesfully Searched---");
						}	
					}
					break;
				}
			}
			while(c<=5);
			break;
		case 5://Update Book
			int U;
			do
			{
				System.out.println("Enter Update by:");
				System.out.println("1.by id\n2.by Name\n3.by Author\n4.by Publication\n5.by Price\n6.Exit from Update");
				U = sc.nextInt();
				sc.nextLine();
				switch(U)
				{
				case 1:
					System.out.println("Enter The Book Id For Update:");
					int sid=sc.nextInt();
					System.out.println("Enter new id");
					int Nid = sc.nextInt();
					for(int i=0; i<size;i++)
					{
					   if(sid==l[i].getBid()) 
					   {
						   l[i].setBid(Nid);
						   System.out.println("Book Id\tBook Name\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						   System.out.println("---Succesfully Updated---");
					   }
					}
					break;
				case 2:
					System.out.println("Enter The Book name For Update:");
					String bn=sc.nextLine();
					System.out.println("Enter new name");
					String Nnm = sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(bn.compareTo(l[i].getBname())==0) 
					   {
						   l[i].setBname(Nnm);
						   System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						}	
					}
					break;
				case 3:
					System.out.println("Enter The Book Author For Update:");
					String au=sc.nextLine();
					System.out.println("Enter new Author");
					String Nau = sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(au.compareTo(l[i].getBauthor())==0) 
					   {
						   l[i].setBauthor(Nau);
						   System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						}	
					}
					break;
				case 4:
					System.out.println("Enter The Book Publication For Update:");
					String bp=sc.nextLine();
					System.out.println("Enter new Publication");
					String Npb = sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(bp.compareTo(l[i].getBpublication())==0) 
					   {
						   l[i].setBpublication(Npb);
						   System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						}	
					}
					break;
				case 5:
					System.out.println("Enter The Book Price For Update:");
					int Bp=sc.nextInt();
					System.out.println("Enter new Price");
					int Npr = sc.nextInt();
					for(int i=0; i<size;i++)
					{
					   if(Bp==l[i].getBprice()) 
					   {
						   l[i].setBprice(Npr);
						   System.out.println("Book id\tName\\tAuhor\tPublication\tPrice");
						   System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
						}	
					}
					break;
				}
			}while(U<=5);
		break;
		case 6://Delete
			int d;
			do
			{
				System.out.println("Enter delete by:");
				System.out.println("1.by id\n2.by Name\n3.by Author\n4.by Publication\n5.by Price\\n6.Exit from Delete");
				d = sc.nextInt();
				switch(d)
				{
				case 1:
					System.out.println("Enter The Book Id you want to delete:");
					int sid=sc.nextInt();
					
					for(int i=0; i<size;i++)
					{
					   if(sid==l[i].getBid()) 
					   {
						   for(int j=i;j<size;j++)
						   {
							   l[j]=l[j+1];
						   }
						   size--;
					   }
					}
					for(int i=0;i<size;i++)
					{
						System.out.println("Book id\tName\tPublication\tPrice");
						System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
					}	
					break;
				case 2:
					System.out.println("Enter The Book name For Search:");
					String bn=sc.next();
					
					for(int i=0; i<size;i++)
					{
					   if(bn.compareTo(l[i].getBname())==0) 
					   {
						   for(int j=i;j<size;j++)
						   {
							   l[j]=l[j+1];
						   }
						   size--;
					   }
					}
					for(int i=0;i<size;i++)
					{
						System.out.println("Book id\tName\tPublication\tPrice");
						System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
					}	
					break;
				case 3:
					System.out.println("Enter The Book Author For Delete:");
					String au=sc.nextLine();
					for(int i=0; i<size;i++)
					{
					   if(au.compareTo(l[i].getBauthor())==0) 
					   {
						   for(int j=i;j<size;j++)
						   {
							   l[j]=l[j+1];
						   }
						   size--;
					   }
					}
					for(int i=0;i<size;i++)
					{
						System.out.println("Book id\tName\tPublication\tPrice");
						System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
					}	
					break;
				case 4:
					sc.nextLine();
					System.out.println("Enter The Book Publication For Delete:");
					String bp=sc.next();
					for(int i=0; i<size;i++)
					{
					   if(bp.compareTo(l[i].getBpublication())==0) 
					   {
						   for(int j=i;j<size;j++)
						   {
							   l[j]=l[j+1];
						   }
						   size--;
					   }
					}
					for(int i=0;i<size;i++)
					{
						System.out.println("Book id\tName\tPublication\tPrice");
						System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
					}	
					break;
				case 5:
					System.out.println("Enter The Book Price For Delete:");
					int Bp=sc.nextInt();
					for(int i=0; i<size;i++)
					{
					   if(Bp==l[i].getBprice()) 
					   {
						   for(int j=i;j<size;j++)
						   {
							   l[j]=l[j+1];
						   }
						   size--;
					   }
					}
					for(int i=0;i<size;i++)
					{
						System.out.println("Book id\tName\tPublication\tPrice");
						System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
					}	
					break;
				}
			}while(d<=5);
		break;
		case 7://count 
			int C;
			do
			{
				System.out.println("Enter Count by:");
				System.out.println("1.by id\n2.by Name\n3.by Author\n4.by Publication\n5.by Price\\n6.Exit from Count");
				C = sc.nextInt();
				switch(C)
				{
				case 1:
					System.out.println("Enter The Book Id For count:");
					int sid = sc.nextInt();
					int c1=0;
					for(int i=0; i<size;i++)
					{
					   if(sid==l[i].getBid()) 
					   {
						   c1++;
					   }
					}
					System.out.println("Count of this id is:-->"+c1);
					break;
				case 2:
					System.out.println("Enter The Book name For count:");
					sc.nextLine();
					String bn = sc.nextLine();
					int c2=0;
					for(int i=0; i<size;i++)
					{
					   if(bn.compareTo(l[i].getBname())==0) 
					   {
						   c2++;
					   }
					}
					System.out.println("Count of this id is:-->"+c2);
					break;
				case 3:
					System.out.println("Enter The Book Author For Count:");
					sc.nextLine();
					String au=sc.nextLine();
					int c3=0;
					for(int i=0; i<size;i++)
					{
					   if(au.compareTo(l[i].getBauthor())==0) 
					   {
						   c3++;
					   }
					}
					System.out.println("Count of this id is:-->"+c3);
					break;
				case 4:
					System.out.println("Enter The Book Publication For Count:");
					sc.nextLine();
					String bp=sc.nextLine();
					int c4=0;
					for(int i=0; i<size;i++)
					{
					   if(bp.compareTo(l[i].getBpublication())==0) 
					   {
						   c4++;
					   }
					}
					System.out.println("Count of this id is:-->"+c4);
					break;
				case 5:
					System.out.println("Enter The Book Price For Count:");
					int Bp=sc.nextInt();
					int c5=0;
					for(int i=0; i<size;i++)
					{
					   if(Bp==l[i].getBprice()) 
					   {
						   c5++;
					   }
					}
					System.out.println("Count of this id is:-->"+c5);
					break;
				}
			}
			while(C<=5);
		break;
		case 8://sort by Id
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					if(l[i].getBid()<l[j].getBid())
					{
						Liabrary li = l[i];
						l[i] = l[j];
						l[j] = li;
					}
				}
			}
			for(int i=0;i<size;i++)
			{
				System.out.println("Book id\tName\tAuhor\tPublication\tPrice");
				System.out.println(l[i].getBid()+"\t"+l[i].getBname()+"\t"+l[i].getBauthor()+"\t"+l[i].getBpublication()+"\t\t"+l[i].getBprice());
			}
			System.out.println("<---Sorted Succesfully--->");
			break;
		case 9://Exit
			System.out.println("@Thank You@\n<----Re-explore---->");
			System.out.println("Exit the code");
		}
		}
		while(ch<9);
	}
	
	
	private static void shiftArrayElements(Liabrary[] l, int i) {		
	}
	private static boolean compare(String bn, String bname) {
		return false;
	}
}