package client;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class ClientBasic {

	public static void main(String[] args) {
		
		// Following this URL on server we want to access
        String url ="http://localhost:8085/api/message";
        
        //RestTemplate is a class given by spring to consume restweb service
        RestTemplate rt=new RestTemplate();
        String credentials="zensar:zensar";
        
        //Following line is used to convert string credentials to base64 encode form
        //Using Base64 class given by java
        //Because server expects credentials in this form
        byte[] encode=Base64.getEncoder().encode(credentials.trim().getBytes());
        String encodedCredentials=new String(encode).trim();
        System.out.println(encodedCredentials);
        //This encoded credentials need to be passed to server using Http header
        //Name of the header is Authorization
        //it is done as follows 
        
        HttpHeaders headers=new HttpHeaders();
        
		headers.add("Authorization","Basic "+encodedCredentials);
        HttpEntity<String>entity=new HttpEntity<String>(headers);
        rt.exchange(url,HttpMethod.GET, entity,String.class);
	}
	

}