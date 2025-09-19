pipeline {
    agent any

    tools {
        maven 'Maven3'   // Make sure Maven is configured in Jenkins Global Tools
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Deekshitha145/login_app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                sh 'cp target/my-login-app.war ~/cicdtools/tomcat/apache-tomcat-8.5.100/webapps/'
            }
        }
    }
}

