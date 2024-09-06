pipeline {
    agent any


    tools {
        maven 'M3'
    }

    stages {
        stage('checkout') {
            git url: 'https://github.com/anshulkatta/todo-app.git', branch: main
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