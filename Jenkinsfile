pipeline {
    agent any


    tools {
        maven 'M3'
    }

    stages {
        stage('checkout') {
            steps {
                git branch: 'master', credentialsId: 'ccd27842-0f66-400c-bba3-2ae44964525e', url: 'https://github.com/anshulkatta/todo-app.git'
            }
        }

        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('test') {
            steps {
                sh 'mvn test'
            }
         }

    }

    post {
            always {
                cleanWs()
            }

            success {
                echo 'Build and deployment succeeded!'
            }

            failure {
                echo 'Build failed!'
            }
        }
}