library identifier: 'jenkins-example@master', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'https://github.com/wsunccake/jenkins-example.git'])

pipeline {
    agent any
    stages {
        stage('vars') {
            steps {
                log.info 'info message'
                log.warning 'warning message'
            }
        }
    }
}
