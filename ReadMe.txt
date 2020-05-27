A very basic implementation of Java Servlets and JSPs using
1. Eclipse IDE
2. Apache Tomcat Server v8.5

Three JSP files login.jsp, welcome.jsp, photos.jsp have been created.

The user has to first login using a valid username and password.
Then the user will be directed to the welcome page where the user will have the
option to either proceed to the photos link provided or can logout and get
redirected to the login page.

If the user enters the wrong details he will be directed back to the login page.

Session has been used to make the welcome and photos a protected page(i.e assesble
only by the authorized user) whereas the login page and the about us page has
been made public.

setHeader method has been used to remove the cache so that user cant access the
pages if logged out once.

A MySql database has been connected to the project named as Login which contains
the usernames and passwords of the allowed users.The databse is connected by 
using a separate class named as LoginDao.java The username is checked in the 
database by making the use of prepared statement to carry out the query. 
