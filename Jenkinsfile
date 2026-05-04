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
                script {
                    def approval = timeout(time: 1, unit: 'HOURS') {
                        input(
                            id: 'approve-build',
                            message: 'Approve build?',
                            ok: 'Yes',
                            cancel: 'No',
                            submitterParameter: 'approvedBy',
                            parameters: [
                                string(name: 'who', defaultValue: 'me', description: 'who approved'),
                                string(name: 'another', defaultValue: 'person', description: 'who approved')
                            ]
                        )
                    }

                    env.APPROVED_BY = approval['approvedBy']
                    env.WHO = approval['who']
                    env.ANOTHER = approval['another']
                }
            }
        }

        stage('Final Stage') {
            steps {
                echo "Approval received from ${env.APPROVED_BY}"
                echo "who: ${env.WHO}"
                echo "another: ${env.ANOTHER}"
                echo 'Continuing the pipeline'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
    }
}
