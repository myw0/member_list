import java.util.Scanner;

import java.util.HashMap;


public class create
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap <String, String> member = new HashMap<String, String>();
		String ni, na;
		boolean bool = true;
		
		
		while(bool) 
		{
            System.out.println("1.회원등록");
            System.out.println("2.종료");
         

           
            int input = sc.nextInt();
            switch(input) 
            {
            case 1:
            	System.out.println("등록할 이름과 아이디를 입력하세요");
                na = sc.next();
                ni = sc.next();
                member.put(na, ni);
                System.out.println("등록한 이름은 : " + na + " 아이디는 : " + ni );
                break;
                
           
            case 2:
              
            	System.out.println("종료하겠습니다.");
                bool = false;
      
        
          
            }
        }
    }
}
