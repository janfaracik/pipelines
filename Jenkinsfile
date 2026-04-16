pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -ntp clean compile'
            }
        }

        stage('Unit Tests') {
            steps {
                catchError(buildResult: 'FAILURE', stageResult: 'FAILURE') {
                    sh 'mvn -B -ntp test'
                }
            }
            post {
                always {
                    junit testResults: 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Warnings') {
            steps {
                sh 'mvn -B -ntp checkstyle:checkstyle'
            }
            post {
                always {
                    recordIssues(
                        enabledForFailure: true,
                        qualityGates: [[threshold: 1, type: 'TOTAL', unstable: true]],
                        tools: [checkStyle(pattern: 'target/checkstyle-result.xml')]
                    )
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
    }
}
