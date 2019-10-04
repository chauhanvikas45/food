
def gitRepoUrl = 'https://github.com/chauhanvikas45/food.git'
def serviceName = 'food'

node {
 agent { dockerfile true }
  stage('Build App') {
    checkout scm
    sh "./gradlew clean build --no-daemon"
  }

  stage('UnitTest App') {
    checkout scm
    sh "./gradlew test  --no-daemon"
  }


  stage("Docker build") {

    def customImage = docker.build("my-image:${env.BUILD_ID}")
        customImage.push()

        customImage.push('latest')
        #sh "docker build -t food/latest ."

  }

  stage("Deploy to staging") {

     sh "docker run -d --rm -p 8081:8081 --name food "my-image:${env.BUILD_ID}/latest"

  }

}

