package magical;

public class Main {
	public static void main(String[] args){
		int n = 4;
		System.out.println("Input: " + n);
	
		System.out.println("Solution: " + magicalString(n));

	}
	
	public static int magicalString(int n) {
        if (n <= 0){
           return 0; 
        }
        
        if (n <= 3){
            return 1;
        }
        
        int[] a = new int[n + 1];
        
        a[0] = 1; 
        
        a[1] = 2; 
        
        a[2] = 2;

        int head = 2;
        
        int tail = 3;
        
        int num = 1; 
        
        int result = 1;
        
        while (tail < n) 
        {
            for (int i = 0; i < a[head]; i++) 
            {
                a[tail] = num;
                
                if (num == 1 && tail < n) {
                    result++;
                }
                
                tail++;
            }
            
            num = num ^ 3;
            
            head++;
        }
        
        return result;     
    }
}
