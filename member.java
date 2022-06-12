
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;
//import dto;


	public class member
	{

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			HashMap <String, String> member = new HashMap<String, String>();
			String ni, na = null, ni2;
			boolean bool = true;
			String findKey = "";
			String check;

			boolean swit[] = new boolean[20];
			//dtoClass dto[] = new dtoClass[20];

			while(bool) 
			{
	            System.out.println("1.회원등록");
	            System.out.println("2.회원검색");
				System.out.println("3.업데이트");
				System.out.println("4.종료");

	           
	            int input = sc.nextInt();
	            switch(input) 
	            {
	            case 1:
	            	System.out.println("등록할 이름을 입력하세요");
	                na = sc.next();
					System.out.println("등록할 아이디를 입력하세요");
	                ni = sc.next();
	                member.put(na, ni);
	                System.out.println("등록한 이름은 : " + na + " 등록한 아이디는 : " + ni );

	                break;
	                
	            case 2:
	            	System.out.println("검색할 아이디의 이름을 입력하세요");
	            	String name;		
	        		
	        		name = sc.next();
	        		System.out.println("검색한 아이디의 이름은 : "+member.get(name)+" 입니다.");

					break;
				case 3:
	            
					{
						
						System.out.println("이름을 입력하세요 : ");
						ni = sc.next();
						System.out.println("수정할 id를 입력하세요 : ");
						ni2 = sc.next();
						
						member.replace(ni,ni2);
						System.out.println("업데이트 되었습니다.");
						System.out.println("수정 목록 : "+member.toString());
						
						
					}
						break;
	        		
	            

	            case 4:
	              
	            	System.out.println("종료하겠습니다.");
	                bool = false;

	            }
			}
		}
	}

