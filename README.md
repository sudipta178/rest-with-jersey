# rest-with-jersey
RESTfulExample Jersey Webapp

# Local workspace setup

#### Clone master branch
1. `$ git remote add origin ssh://git@github.com/sudipta178/rest-with-jersey.git`
2. `$ git clone https://github.com/sudipta178/rest-with-jersey.git`

#### Set up your local branch
1. `$ git checkout -b <YOUR_BRANCH_NAME>`
2. `$ git push origin +<YOUR_BRANCH_NAME>`
3. `$ git branch --set-upstream-to=origin/<YOUR_BRANCH_NAME>  <YOUR_BRANCH_NAME>`

#### Build and Start rest-with-jersey using main 
1. `$ mvn clean install`
2. `$ java -jar target/rest-with-jersey.jar`
