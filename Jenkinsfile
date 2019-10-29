
def gitRepoUrl = 'https://github.com/chauhanvikas45/food.git'
def serviceName = 'food'

node {
    try {
    stage("Building SONAR ...") {
        sh './gradlew clean sonarqube'
    }
    } catch (e) {
        emailext attachLog: true, body: 'See attached log', subject: 'BUSINESS Build Failure', to: 'chauhanvikas45@yahoo.co.in.com'
        step([$class: 'WsCleanup'])
            return
        }

  stage('Build App') {
    checkout scm
    sh "./gradlew build --no-daemon"
  }

  stage('UnitTest App') {
    checkout scm
    sh "./gradlew test  --no-daemon"
  }


  stage("Docker build") {


            sh "docker build -t food/latest ."

  }

  stage("Deploy to staging") {

     sh "docker run -d --rm -p 8081:8081 --restart=always --name food food/latest"

  }

}

