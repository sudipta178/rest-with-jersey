# rest-with-jersey
RESTfulExample Jersey Webapp

# Local workspace setup

#### Clone master branch
`$ git remote add origin ssh://git@github.com/sudipta178/rest-with-jersey.git`
`$ git clone https://github.com/sudipta178/rest-with-jersey.git`

#### Set up your local branch
`$ git checkout -b <YOUR_BRANCH_NAME>`
`$ git push origin +<YOUR_BRANCH_NAME>`
`$ git branch --set-upstream-to=origin/<YOUR_BRANCH_NAME>  <YOUR_BRANCH_NAME>`

#### Build and Start rest-with-jersey using main 
`$ mvn clean install`
`$ java -jar target/rest-with-jersey.jar`
