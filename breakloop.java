public class breakloop {
        public static void main(String args[]){  
            for(int i =1; i <= 10; i++){
                if (i == 7){
                    System.out.println("Breaking the loop at i = 5");
                    break;
                }
               System.out.println("i="+i); 
            }
        }
    }
