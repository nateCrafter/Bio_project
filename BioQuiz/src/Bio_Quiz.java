import java.util.*;
import javax.mail.*;
import javax.activation.*;

public class Bio_Quiz  {
	public static String output;
	public static String check="*";
	public static double grade;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int correct = 0;
		 ;
		String answer;
		createFile q = new createFile();//importing createFile class
		q.openFile();// opening file
		Scanner s= new Scanner(System.in);
		//******************email set up ************************
		
		//word bank
		System.out.println("Word bank:heart,transpiration,xylem,lung,waste");
		System.out.println();
		check="";
		//******************start of fill in the blanks************************** 1-5
		
		//question1
		System.out.print("Question 1,The __________ is the main part of the cardiovasuler system:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("heart") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question 2
		System.out.print("Question 2,Water moves thought the xylem throught________.:");
		answer = s.nextLine();//input
		answer.toLowerCase();//formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("transpiration") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question3
		System.out.print("Question 3,The ________ carries water from roots to leaves:");
		answer = s.nextLine();//input
		answer.toLowerCase();//Formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("xylem") == 0){
			correct=(correct+1);	
			check="";
		}
		q.addRecords();// writing to file
		
		//question4
		System.out.print("Question 4,The __________ is an essential part of you respiratory system:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("lung") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question5
		System.out.print("Question 5,The excretory system rremoves _________ from your body:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("waste") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//****************** end of fill in tha blanks********************
		
		//****************** start of true and false*************************6-10
		//question1
		System.out.print("Question 6,The heart is part of your cardiovasuler system, true or false:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("true") == 0){
			correct=(correct+1);
			check="";
		}
		else if (answer.compareTo("t") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question2
		System.out.print("Question 7,plants hava a veins that transport blood, true or false:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("false") == 0){
			correct=(correct+1);
			check="";
		}
		else if (answer.compareTo("f") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//Question 3
		System.out.print("Question 8,plants have a respiatory system, true or false :");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("false") == 0){
			correct=(correct+1);
			check="";
		}
		else if (answer.compareTo("f") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		 
		//question 4
		System.out.print("Question 9,your nose and mouth are part of your respiatory system, true or false :");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("true") == 0){
			correct=(correct+1);
			check="";
		}
		else if (answer.compareTo("t") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//Question 5
		System.out.print("Question 10,your ventricles are in the top chambers, true or false :");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("flase") == 0){
			correct=(correct+1);
			check="";
		}
		else if (answer.compareTo("f") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//********************end of ture and false *****************************
		
		//********************start of  mutiplechose **************************
		//question1
		System.out.println("Question 11,__________ carries dissolved suger though the plant.");
		System.out.println("a.roots");
		System.out.println("b.leaves");
		System.out.println("c.phyloem");
		System.out.println("d.xylem");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("c") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
				
		//question2
		System.out.println("Question 12,Circulatory system transports.");
		System.out.println("a.gases");
		System.out.println("b.nutrients");
		System.out.println("c.chemicals");
		System.out.println("d.all of the above");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("d") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question3
		System.out.println("Question 13,_______ circulation moves blood to all parts of the body.");
		System.out.println("a.pulmonary");
		System.out.println("b.systemic");
		System.out.println("c.respiratory");
		System.out.println("d.none of the above");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("b") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question4
		System.out.println("Question 14,Which system helps maintain homeostasis.");
		System.out.println("a.Respiratory");
		System.out.println("b.Circulatory");
		System.out.println("c.excetory");
		System.out.println("d.cardiovascular");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("b") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		
		//question5
		System.out.println("Question 15,_______ filters blood in your body.");
		System.out.println("a.ureter");
		System.out.println("b.urinary bladder");
		System.out.println("c.kidney");
		System.out.println("d.large intestine");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		check="*";
		//*********************answer check*****************
		if (answer.compareTo("c") == 0){
			correct=(correct+1);
			check="";
		}
		q.addRecords();// writing to file
		//********************end of multipelchose****************************
		
		// *******************start of short answer **********************
		check="";
		q.addPrompt();
		//question 1
		System.out.print("Question 16,what is the purpos of an artery?:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		q.addRecords();// writing to file
		
		//question 2
		System.out.print("Question 17,what are capillarys?:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		q.addRecords();// writing to file

		//question 3
		System.out.print("Question 18,what is the jobs of a vain?:");
		answer = s.nextLine();//input
		answer.toLowerCase();// formating
		output=answer;
		q.addRecords();// writing to file
		
		//********************Finishing calculations**************************
		check="";
		grade=correct;
		output=(correct+"/15");
		q.addRecords();
		grade=((grade/15)*100);
		System.out.println("you got "+grade+"%");
		q.closefile();
		System.out.println("rename the rename_me.txt to have your first and last name put where your teacher instruches.");
		System.out.print("Press any Enter to exit...............");
		answer = s.nextLine();
		
	}

}
