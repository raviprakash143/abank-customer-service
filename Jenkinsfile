pipeline {
  agent any
  tools { 
        maven 'Maven'
        jdk 'JAVA_HOME'
  }
  stages {
    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace... */
      steps {
        checkout scm
      }
    }
    stage('Build Project and Generate Docker Images') {
      steps {
        sh 'mvn clean install -DskipTests'
        sh 'docker image build -t abank-customer-service:app .'
        sh 'docker tag abank-customer-service:app docker7301/abank-customer-service:app'
        sh 'docker image push docker7301/abank-customer-service:app'
        sh 'docker run -p 9123:9123 docker7301/abank-customer-service:app .'
        sh 'echo $USER'
        sh 'echo whoami'
      }
    }
  }
}
