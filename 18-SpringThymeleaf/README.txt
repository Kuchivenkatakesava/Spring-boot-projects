Http status codes

200       OK


401       UNAUTHORIZED (Username,password not sent or not correct)




















JWT - JSON web token
 
JWT consists three parts
 
header.payload.signature
 
header - it consists of algorithm used to generate token
 
payload - it consists of claims. Claim is additional data about user entity. 
          e.g. username, expiration time etc.

signature - it is typically secret key (String which is known only to server to validate the token) 



[12:24 PM] Sandeep (Guest)
Thymeleaf

-----------------------

It is way by which we can design dynamic GUI for web applications Thymeleaf is server side template engine for web applications. (we will create web pages using thymeleaf) we need to create HTML pages (called as templates in thymeleaf) and use thymeleaf tags in them Steps 

1) add dependency in pom.xml

[12:44 PM] Sandeep (Guest)
<h2> Welcome to Message API by Zensar</h2>

