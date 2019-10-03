
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


            sh "docker build -t food/latest ."

  }

  stage("Deploy to staging") {

     sh "docker run -d --rm -p 8081:8081 --name food food/latest"

  }

}

