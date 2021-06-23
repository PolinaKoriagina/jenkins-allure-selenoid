# jenkins-allure-selenoid

Hi!
Welcome to my project, 
Here You can use Jenkins to start your tests remotely with Selenoid.

Your steps to start:

1. open https://jenkins.autotests.cloud
2. create new job
3. add in tasks clean test -DselenoidUrl=${SELENOID_URL} -DvideoUrl=${VIDEO_URL}  
4. add String parameter
   name SELENOID_URL Default Value selenoid.autotests.cloud
   name VIDEO_URL Default Value https://selenoid.autotests.cloud/video/
5. add Repository URL https://github.com/PolinaKoriagina/jenkins-allure-selenoid
6. Branch Specifier (blank for 'any')  */owner
7. build the job


  
