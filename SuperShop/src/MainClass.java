import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		int shop=0, shop_flag = 1, answer=0, book_code=0;
		String book_title=null;
		while(true)
		{
				if(shop_flag == 1)
				{
						System.out.println("Press 1 for Buying Books.");
						System.out.println("Press 2 for Topic wise shorted Books.");
						System.out.println("Press 3 for Registration.");
						System.out.println("Press 4 for Close.");
						System.out.print("Give the value: ");
						Scanner scanshop = new Scanner(System.in);
						shop = scanshop.nextInt();
				
						if(shop == 1)
						{
							System.out.println("Okay It's 1");
							shop_flag = 2;
						}
						else if(shop == 2)
						{
							System.out.println("Select Your Favorite Category.");
							System.out.println("Press 1 for Science Books.");
							System.out.println("Press 2 for Literature Books.");
							System.out.println("Press 3 for Religius Books.");
							System.out.print("Give Input here: ");
							int press = scanshop.nextInt();
							if(press == 1)
							{
								SortedBooks science = new SortedBooks();
								int code = science.science();
								book_code = code;
								if(code == 1000)
								{
									book_title = "Data Structure";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 1001)
								{
									book_title = "Programming with C";
									System.out.println("Code: 1001"+" Title: "+book_title);
								}
								else if(code == 1002)
								{
									book_title = "Programming with python";
									System.out.println("Code: 1002"+" Title: "+book_title);
								}
								else if(code == 1003)
								{
									book_title = "Algorithom";
									System.out.println("Code: 1003"+" Title: "+book_title);
								}
								else if(code == 1004)
								{
									book_title = "Compitative Programming with C++";
									System.out.println("Code: 1004"+" Title: "+book_title);
								}
								else if(code == 1005)
								{
									book_title = "Object Oriented Programming by Java";
									System.out.println("Code: 1005"+" Title: "+book_title);
								}
								Scanner scan_user = new Scanner(System.in);
								while(true)
								{
									System.out.println("To Go User Dashboard press 1 and do registration for Confirm");
									System.out.print("Press Here: ");
									int user = scan_user.nextInt();
									if(user == 1)
									{
										shop = 3;
										shop_flag = 1;
										break;
									}
									else
									{
										continue;
									}
									
								}
							}
							else if(press == 2)
							{
								SortedBooks literature = new SortedBooks();
								int code = literature.literature();
								book_code = code;
								if(code == 2000)
								{
									book_title = "Kishor Alo";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 2001)
								{
									book_title = "Aguner porosmoni";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 2002)
								{
									book_title = "Dipo No: 2";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 2003)
								{
									book_title = "Gitanjoli";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 2004)
								{
									book_title = "Language Movement of 1952";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 2005)
								{
									book_title = "Mukti Bahini";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								Scanner scan_user = new Scanner(System.in);
								while(true)
								{
									System.out.println("To Go User Dashboard press 1 and do registration for Confirm");
									System.out.print("Press Here: ");
									int user = scan_user.nextInt();
									if(user == 1)
									{
										shop = 3;
										shop_flag = 1;
										break;
									}
									else
									{
										continue;
									}
									
								}
							}
							else if(press == 3)
							{
								SortedBooks religius = new SortedBooks();
								int code = religius.religius();
								book_code = code;
								if(code == 3000)
								{
									book_title = "Sunnah of profet Mohammad";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 3001)
								{
									book_title = "Morur Pothe";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 3002)
								{
									book_title = "Nobider Jiboni";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 3003)
								{
									book_title = "Madina";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 3004)
								{
									book_title = "Shohi Hadis";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								else if(code == 3005)
								{
									book_title = "Fajayele Amol";
									System.out.println("Code: "+code+" Title: "+book_title);
								}
								Scanner scan_user = new Scanner(System.in);
								while(true)
								{
									System.out.println("To Go User Dashboard press 1 and do registration for Confirm");
									System.out.print("Press Here: ");
									int user = scan_user.nextInt();
									if(user == 1)
									{
										shop = 3;
										shop_flag = 1;
										break;
									}
									else
									{
										continue;
									}
									
								}
							}
							if(shop != 3)
							{
								shop_flag = 2;
							}
							
						}
						else if(shop == 3)
						{
							
							Scanner student1 = new Scanner(System.in);
							System.out.print("Give Your Name: ");
							String name = student1.nextLine();
							System.out.print("Give Your ID Number: ");
							String id = student1.nextLine();
							System.out.print("Give Your University Mail: ");
							String versity_mail = student1.nextLine();
							if(book_code == 0)
							{
								Registration customer1 = new Registration(name, id, versity_mail);
								customer1.display();
								shop_flag = 2;
							}
							else
							{
								Registration customer1 = new Registration(name, id, versity_mail, book_code, book_title);
								customer1.display();
								shop_flag = 2;
							}
						}
						else if(shop == 4)
						{
							shop_flag = 0;
						}
						else
						{
							System.out.println("Sorry It's an Invalid Input. See intructions properly");
							shop_flag = 1;
							continue;
						}
						
				}
				else if(shop_flag == 0)
				{
					break;
				}
				else if(shop_flag == 2)
				{
					System.out.println("Wants to continue?");
					System.out.println("0 for No.");
					System.out.println("1 for Yes.");
					Scanner scan = new Scanner(System.in);
					System.out.print("Give Your Answer: ");
					answer = scan.nextInt();
					if(answer == 0)
					{
						shop_flag = 0;
					}
					else if(answer == 1)
					{
						shop_flag = 1;
					}
				}
		}

	}

}
