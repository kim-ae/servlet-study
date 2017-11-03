Simple example of Servlet, using Servlet interface and using HttpServlet extention. 
* /\*: is mapped to interface implementation s1.
* /bye: is mapped to interface implementation s2.
* /extends: is mapped to class extention s3. 

javax.Servlet is provided, this war must be used inside a web container (i.e. tomcat)

the eclipse plugin permits the integration between the gradle and the eclipse in order to deploy and use the web container inside eclipse.

To create war file: `gradlew clean war`
