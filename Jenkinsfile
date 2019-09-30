
def gitRepoUrl = 'https://github.com/chauhanvikas45/food.git'
def serviceName = 'food'

node {
  stage('Build App') {
    checkout scm
    sh "./gradlew clean build --no-daemon"
  }

  stage('UnitTest App') {
    checkout scm
    sh "./gradlew test  --no-daemon"
  }

  stage("Docker build") {


            sh "docker build -t food/food_1 ."

  }
  stage("Docker push") {

     sh "docker login -u chauhanvikas45 -p Docker@1234"

  sh "docker push food/food_1"

  }
  stage("Deploy to staging") {


            sh "docker run -d --rm -p 8081:8081 --name food_1 food/food_1"

  }

}

