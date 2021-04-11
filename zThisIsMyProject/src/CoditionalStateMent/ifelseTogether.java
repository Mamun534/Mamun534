package CoditionalStateMent;

public class ifelseTogether {
		
		//public static void main(String[] args) 
	
	
	{	
		// if want else excuted to all of condition i have to use 
			//else if like bellow
			
			int x = 100;
			
			boolean flag = (x==95);
			boolean flag1 = (x<=100);
			boolean flag2  = (x>=101);
		
			 if(x==100) {
				System.out.println("This condition is true");
			}
			 else if(x>100) {
				 System.out.println("This conditinon is fals");
			 }
			 
			  if(x<100) {
				 System.out.println("x is less then 100 ");
			 }
			  
			  // else is not like that i hav eto use else 
			  //its deffence on backlog 
			
			else {
				System.out.println("this is flase");
			}
			  if(flag1) {
					
					System.out.println("this is true");
				}
				
				
				else if(flag2) {
				}
				else {
					
					System.out.println("flase");
				}
			}
			
}