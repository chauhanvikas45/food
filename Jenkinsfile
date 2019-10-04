
def gitRepoUrl = 'https://github.com/chauhanvikas45/food.git'
def serviceName = 'food'

environment {
    registry = "chauhanvikas45/app"
    registryCredential = 'chauhanvikas45docker'
    dockerImage=''
}

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

           dockerImage = docker.build registry + ":$BUILD_NUMBER"
           docker.withRegistry( '', registryCredential ) {
                       dockerImage.push()
            sh "docker rmi $registry:$BUILD_NUMBER"

  }

  stage("Deploy to staging") {

     sh "docker run -d --rm -p 8081:8081 --name food $registry:$BUILD_NUMBER/latest"

  }

}

