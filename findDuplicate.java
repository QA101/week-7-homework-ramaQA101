import java.util.Scanner;


public class findDuplicate {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str=input.nextLine();
        input.close();

        int count=0;
        String temp=""; 


        for(int i=0;i<str.length();i++)
        {

            char c=str.charAt(i); 

            for(int j=i;j<str.length();j++)
            {

                char k=str.charAt(j);  
  
                if(c==k && temp.indexOf(c)==-1)                                                                          
                {

                    count=count+1;

                }

            }

             if(temp.indexOf(c)==-1)  
             {


            temp=temp+c; 

            	System.out.println("Character   " + c + "   occurs   " + count + "    times");
             }  
            
              count=0;

        }

    }
}
    
