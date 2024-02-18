package eumelia;

import java.util.*;

public class SortedBooks extends Registration {
  String paper, pencil, sharpner;
  int pencilsprice, papersprice, page;

  int science() {
    System.out.println("    -------------------------------------");
    System.out.println(" *                                         *");
    System.out.println("|Code: 1000                                  |");
    System.out.println("|Title: Data Structure                       |");
    System.out.println("|Code: 1001                                  |");
    System.out.println("|Title: Programming with C                   |");
    System.out.println("|Code: 1002                                  |");
    System.out.println("|Title: Programming with python              |");
    System.out.println("|Code: 1003                                  |");
    System.out.println("|Title: Algorithom                           |");
    System.out.println("|Code: 1004                                  |");
    System.out.println("|Title: Compitative Programming with C++     |");
    System.out.println("|Code: 1005                                  |");
    System.out.println("|Title: Object Oriented Programming by Java  |");
    System.out.println(" *                                         *");
    System.out.println("    -------------------------------------");
    Scanner scan_code = new Scanner(System.in);
    System.out.print(" Give Code Number which one You want: ");
    int code = scan_code.nextInt();
    return code;
  }

  int literature() {
    System.out.println("    -------------------------------------");
    System.out.println(" *                                         *");
    System.out.println("|Code: 2000                                  |");
    System.out.println("|Title: Kishor Alo                           |");
    System.out.println("|Code: 2001                                  |");
    System.out.println("|Title: Aguner porosmoni                     |");
    System.out.println("|Code: 2002                                  |");
    System.out.println("|Title: Dipo No: 2                           |");
    System.out.println("|Code: 2003                                  |");
    System.out.println("|Title: Gitanjoli                            |");
    System.out.println("|Code: 2004                                  |");
    System.out.println("|Title: Language Movement of 1952            |");
    System.out.println("|Code: 2005                                  |");
    System.out.println("|Title: Mukti Bahini                         |");
    System.out.println(" *                                         *");
    System.out.println("    -------------------------------------");
    Scanner scan_code = new Scanner(System.in);
    System.out.print(" Give Code Number which one You want: ");
    int code = scan_code.nextInt();
    return code;
  }
  int religius() {
	    System.out.println("    -------------------------------------");
	    System.out.println(" *                                         *");
	    System.out.println("|Code: 3000                                  |");
	    System.out.println("|Title: Sunnah of profet Mohammad            |");
	    System.out.println("|Code: 3001                                  |");
	    System.out.println("|Title: Morur Pothe                          |");
	    System.out.println("|Code: 3002                                  |");
	    System.out.println("|Title: Nobider Jiboni                       |");
	    System.out.println("|Code: 3003                                  |");
	    System.out.println("|Title: Madina                               |");
	    System.out.println("|Code: 3004                                  |");
	    System.out.println("|Title: Shohi Hadis                          |");
	    System.out.println("|Code: 3005                                  |");
	    System.out.println("|Title: Fajayele Amol                        |");
	    System.out.println(" *                                         *");
	    System.out.println("    -------------------------------------");
	    Scanner scan_code = new Scanner(System.in);
	    System.out.print(" Give Code Number which one You want: ");
	    int code = scan_code.nextInt();
	    return code;
	  }

	  void Shopdetails(String p, String w, int pt, int ps) {
	    paper = p;
	    pencil = w;
	    pencilsprice = pt;
	    papersprice = ps;
	  }

	  void Sorted(String p, String dt) {
	    super.Regi(p, dt);
	  }
	  // this.page=page;

	  void SortedB(String p, String pt, int page) {
	    this.Sorted(p, pt);
	    this.page = page;

	  }

	  void display() {

	    super.writersdisplay();

	    System.out.println(" Paper's Company:" + paper);
	    System.out.println(" pencil's Company:" + pencil);
	    System.out.println(" Paper's price:" + papersprice);
	    System.out.println(" pencil's price:" + pencilsprice);
	    System.out.println(" page:" + page);
	  }
	}