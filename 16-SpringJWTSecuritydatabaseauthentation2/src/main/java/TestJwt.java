import java.util.Scanner;

import com.zensar.messageapi.security.jwt.util.JWTUtil;

public class TestJwt {

	public static void main(String[] args) {
		
		JWTUtil util=new JWTUtil();
		
		String token=util.generateToken("zensar");
		new Scanner(System.in).next();
		
		try
		{
			util.validateToken(token);
			System.out.println("Token is vaild");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Token is invaild");
	}
}
