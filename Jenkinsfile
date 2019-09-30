
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

    stage('Start App') {
    checkout scm
    sh "./gradlew bootRun  --no-daemon"
  }

}

