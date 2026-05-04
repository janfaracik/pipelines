pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Running the initial build stage'
            }
        }

        stage('Approval') {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    input message: 'Continue to the final stage?', ok: 'Approve'
                }
            }
        }

        stage('Final Stage') {
            steps {
                echo 'Approval received, continuing the pipeline'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
    }
}
