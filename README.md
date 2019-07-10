# crypto-currency-binance-api
Binance API Application with Spring Boot, Maven and Java Binance API.

GET method http://localhost:8080/depth does a connection test returns the server time.

POST method http://localhost:8080/saveAllPairs fetches all the XYZBTC pairs and saves them to the Local MySQL Db. The database table structure is in the file mstakx.sql

The database connection properties are saved in src/main/application.properties.

GET method http://localhost:8080/cache_depth_events initates a depth cache and checks for updates. The symbols(XYZBTC pairs) are fetched from the database table saved using the above mentioned POST method.


