import java.util.Scanner;
import java.util.ArrayList;


public class create 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList name = new ArrayList();
		
		ArrayList password = new ArrayList();
		String ni, na, nu;
		boolean bool = true;
		
		while(bool) 
		{
            System.out.println("1.회원등록");
            System.out.println("2.종료");

            // 보기를 선택받음
            int input = sc.nextInt();
            switch(input) {
            case 1:
            	System.out.println("등록할 이름을 입력하세요");
                na = sc.next();
                 
                System.out.println("등록할 아이디를 입력하세요");
                ni = sc.next();
             
                if(name.indexOf(na) == -1) 
                {
                    name.add(na);
                    System.out.println("등록할 비밀번호를 입력하세요");
                    nu = sc.next();
                   
                    password.add(nu);
                    System.out.println("등록된 이름은 : "+ na + " / 등록된 아이디는 : " + ni + " / 비밀번호는 : " + nu + " 입니다.");
                  
                
                } else 
                {
                    System.out.println("중복된 아이디가 있습니다.");
                }
                break;
            case 2:
              
                System.out.println("종료하겠습니다.");
                bool = false;
      
        
          
            }
        }
    }
}
