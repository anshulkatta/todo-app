pipeline {
    agent any


    tools {
        maven 'M3'
    }

    stages {
        stage('checkout') {
            steps {
                git url 'https://github.com/anshulkatta/todo-app.git'
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