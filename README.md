# Avanza
Controller for the unofficial Avanza API created only for the purpose of learning Java. 
Project is inspired by existing project - [fhqvst - Avanza](https://github.com/fhqvst/avanza).


**Note** project is re-implementated based on a proof of concept, do not use any code in this project for trading purposes. 
The author will not be responsible for any indirect damages.
# Project Status
Incomplete. 
Please feel free to contribute, review or comment.
# Usage
TODO
Example LOGIN
```java
/*TOTP -> Generated with the totp class*/
API avanzaApi = new API("USERNAME", "PASSWORD","TOTP");
```

Generate TOTP with your TOTP key
```java
totp secret = new totp("TOTPKEY");
```

# Credit
The implementation is based on similar projects and the original authors should be credited for their work, please check them out. 
The author does not take any credit for parts of code or ideas that are not original.

API:
- [fhqvst - Avanza](https://github.com/fhqvst/avanza)
- [Qluxzz - Avanza](https://github.com/Qluxzz/avanza)
- [Eitraz - avanza-api](https://github.com/Eitraz/avanza-api)

TOTP:
- [susam - mintotp](https://github.com/susam/mintotp)

Response classes was autogenerated with jsonschema2pojo 
- [joelittlejohn - jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo)

