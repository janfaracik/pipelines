pipeline {
    agent any

    parameters {
        string(name: 'ENVIRONMENT', defaultValue: 'dev', description: 'Target environment to run in')
        choice(name: 'DEPLOY_TYPE', choices: ['fast', 'slow', 'full'], description: 'Type of deployment')
        password(name: 'API_KEY', defaultValue: 'supersecret', description: 'API key for integration')
    }

    stages {
        stage('Hello') {
            steps {
                echo "Hello World - ENVIRONMENT=${params.ENVIRONMENT}"
                echo "DEPLOY_TYPE=${params.DEPLOY_TYPE}"
                echo "API_KEY=${params.API_KEY.replaceAll('.', '*')}" // mask it when echoing
            }
        }
        stage('Jello') {
            steps {
                echo "Jello World - still on ${params.ENVIRONMENT}"
            }
        }
    }
}
