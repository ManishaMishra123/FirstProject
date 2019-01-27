//First commit of this file 
//Now no content.....
//Later we will see the examples
//First purpose of "File class" in java- getting file metadata
import java.io.File;    //File class
import java.util.Scanner;     //Scanner class to recieve data from user
import java.util.Date;        //Date class to perfrom date-time related operation
import java.lang.System.out;    //This class represents use of standarad output
public class FileEx1
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    out.print("Enter the File or Directory name : ");
    String name = in.nextLine();
    //Instantiation & Intialization of File object with enterd FileName 
    File f = new File(name);
    //Checking if the File or Directory exists or not 
    if(f.exists())
    {
      //Displayiing file or directory info
      out.println("File Name : "+f.getName());    //Method returns the file or directory name
      out.println("File : "+f.isFile());          //Method returns True if File o/w False
      out.println("Directory : "+f.isDirectory());//Method returns True if Directory o/w False
      out.println("Length : "+f.length());        //Size of file in bytes
      out.println("Path : "+f.getPath());         //returns complete path or laction of theb file
      ..............
    }
    
    else
    {
      out.println("%s does not exists....",name);
    }
  
  }
}
