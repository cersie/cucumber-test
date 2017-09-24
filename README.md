# Flipkart Assignment

How to start?
------------
First you need to install gradle to your operating system.

Clone repository
````
git clone https://github.com/cersie/cucumber-test.git
````

Change your directory as root of the project
````
cd cucumber-test
````

Running to automation with cucumber. Current chrome driver is configured for MacOS.
````
./gradlew cucumber
````

if you want to execute it on windows then change the driver path as following in `ChromeDriverManager.java` file

```
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
```

Run API tests using following command.
````
./gradlew clean test
````
