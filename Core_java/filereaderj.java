import java.io.*;
import java.util.Scanner;
public class filereaderj {
    
     public static void main(String[] args) {
        StringBuffer nn=new StringBuffer();
        String hello;
         

        try(Scanner sc=new Scanner(new FileReader("name.txt")))
        {  
            // until reach the last line
            while(sc.hasNextLine())
            {
             hello=sc.nextLine();
             System.out.println(hello);

        } /// give the path for the specific file
            System.out.println(new File("name.txt").getAbsolutePath());
            
            //checks provided file is file or not returns true
            System.out.println(new File("name.txt").isFile());
            //checks the given file is allowed to read or not
            System.out.println(new File("name.txt").canRead());
            //checks the given file is exists or not
            System.out.println(new File("name.txt").exists());
            //it create the new file in current directory
            new File("hlo.txt").createNewFile();
            // write in the file
           try( FileWriter wrr=new FileWriter("hlo.txt",true))
           {
            wrr.write("hlo beta");
            wrr.write("hlo beta");
            wrr.write("\nhlo beta");
            wrr.write("\nhlo beta");
            wrr.write("hlo beta");
            System.out.println(new File("hlo.txt").list());
            // returns the length of file in bytes
            System.out.println(new File("hlo.txt").length());
           }
           catch(Exception e)
           {
            System.out.println(e.getMessage());
           }
           //its to delete the file
           new File("hlo.txt").delete();
           
    }  
         catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        //for all io functions is try catch is neccessory 
        try(FileReader obj=new FileReader("name.txt"))
        {  //alwys return read ascii value
            int name=obj.read();
            // ready means the obj is not closed yet
            while(obj.ready())
            {
            System.out.println((char)name);
            //read returns ascii values so you have to convert that into the character or string
            nn.append((char)name);
            name=obj.read();

            }
            System.out.println(nn);
        }
         catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        // we used append as true because it will not overrride the last adata in the file
        try (FileWriter fw=new FileWriter("name.txt",true)){
            fw.write("\nShree:");
            fw.write("\n     Love you too shiva🧡");
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
     }
}
