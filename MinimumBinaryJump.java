package assignment1;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class MinimumBinaryJump
	    {
	        private int count = 0;
	        public int[] Array;

	        public MinimumBinaryJump(int[] arr)
	        {
	            Array = arr;//{0, 0, 1, 0, 0}
	        }

	        public int MinJump()
	        {
	            if (Array.length == 0)
	                return 0;
	            else
	            {
	                for (int i = 0; i < Array.length-1; i++)
	                {
	                    if (i == Array.length - 2)//i.e. 2nd last bit
	                    {
	                        if (Array[i + 1] == 0)
	                            count++;
	                        break;
	                    }
	                    else
	                    {
	                        if (Array[i + 2] == 0)
	                        {
	                            ++i;
	                            count++;
	                        }

	                        else if (Array[i + 1] == 0)
	                            count++;

	                        else
	                        {
	                            for (i += 1; i < Array.length; i++)
	                            {
	                                if (Array[i] == 0)
	                                {
	                                    count = -1;
	                                    return count;
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	            return count;
	        }
	//Driver class
	public static void main(String[] args)throws IOException
	        {
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				int n = Integer.parseInt(br.readLine());
	            int[] inputArray = new int[n];

	            for (int i = 0; i < n; i++)
	                inputArray[i] = Integer.parseInt(br.readLine());

	            MinimumBinaryJump ob = new MinimumBinaryJump(inputArray);
	            int count = ob.MinJump();
	            if (count == -1)
	                System.out.println("Couldn't reach last 0");
	            else
	               System.out.println(count);

	        }
	    }