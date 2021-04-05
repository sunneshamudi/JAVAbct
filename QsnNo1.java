package assignment1;
import java.io.*;
import java.util.*;
public class QsnNo1
    {       
       public static void main(String[] args)throws IOException
        {
            int arrayLength,i;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println ("Enter length of the array : ");
            arrayLength = Integer.parseInt(br.readLine());
            String arr[] = new String[arrayLength];
            System.out.println ("Enter elements in array : ");
            for (i = 0; i < arrayLength; i++)
            {
                arr[i] = br.readLine();
                arr[i] = arr[i].toLowerCase();
            }
            ArrayList<String> aListColors = new ArrayList<String>();
            for(i=0; i < arrayLength; i++){
    
                    if(!aListColors.contains(arr [i]) ){
                        aListColors.add(arr [i]);
                    }
                }
                System.out.println("Count of distinct pairs : " + aListColors.size());
            }
         }