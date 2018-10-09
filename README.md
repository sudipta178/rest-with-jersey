# rest-with-jersey
RESTfulExample Jersey Webapp

# Local workspace setup

$ git remote add origin ssh://git@github.com/sudipta178/rest-with-jersey.git
$ git clone https://github.com/sudipta178/rest-with-jersey.git

$ git checkout -b <YOUR_BRANCH_NAME>
$ git push origin +<YOUR_BRANCH_NAME>
$ git branch --set-upstream-to=origin/<YOUR_BRANCH_NAME>  <YOUR_BRANCH_NAME>

$ mvn clean install
$ java -jar target/rest-with-jersey.jar
