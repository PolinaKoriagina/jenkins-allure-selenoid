# jenkins-allure-selenoid

Hi!
Welcome to my project, 
Here You can use Jenkins to start your tests remotely with Selenoid.

Your steps to start:

# open https://jenkins.autotests.cloud
# create new job
# add in tasks clean test -DselenoidUrl=${SELENOID_URL} -DvideoUrl=${VIDEO_URL}  
# add String parameter
#   name SELENOID_URL Default Value selenoid.autotests.cloud
#   name VIDEO_URL Default Value https://selenoid.autotests.cloud/video/
# add Repository URL https://github.com/PolinaKoriagina/jenkins-allure-selenoid
# Branch Specifier (blank for 'any')  */owner
# build the job


  
