import java.util.*;
import java.io.*;
import java.lang.*;

public class createFile {
	private Formatter done;
	public void openFile(){
		try
		{
			done= new Formatter("rename_me.txt");
			
		}
		catch(Exception e)
		{
			System.out.println("you got an error");
		}
	}
	public void addRecords(){
		done.format("%s%s%s%s%s", ">>>",Bio_Quiz.output,Bio_Quiz.check,"<<<"," ");
	}
	public void addPrompt(){
		done.format("%s%s%S", ">>>","after this is the short answer that thay made","<<<"," ");
	}
	public void closefile(){
		done.close();
	}
}
