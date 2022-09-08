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