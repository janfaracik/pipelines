pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 1'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 1 failed randomly')
                        }
                        echo 'Stage 1 completed'
                    }
                }
            }
        }

        stage('Stage 2') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 2'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 2 failed randomly')
                        }
                        echo 'Stage 2 completed'
                    }
                }
            }
        }

        stage('Stage 3') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 3'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 3 failed randomly')
                        }
                        echo 'Stage 3 completed'
                    }
                }
            }
        }

        stage('Stage 4') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 4'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 4 failed randomly')
                        }
                        echo 'Stage 4 completed'
                    }
                }
            }
        }

        stage('Stage 5') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 5'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 5 failed randomly')
                        }
                        echo 'Stage 5 completed'
                    }
                }
            }
        }

        stage('Stage 6') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 6'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 6 failed randomly')
                        }
                        echo 'Stage 6 completed'
                    }
                }
            }
        }

        stage('Stage 7') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 7'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 7 failed randomly')
                        }
                        echo 'Stage 7 completed'
                    }
                }
            }
        }

        stage('Stage 8') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 8'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 8 failed randomly')
                        }
                        echo 'Stage 8 completed'
                    }
                }
            }
        }

        stage('Stage 9') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 9'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 9 failed randomly')
                        }
                        echo 'Stage 9 completed'
                    }
                }
            }
        }

        stage('Stage 10') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        echo 'Running Stage 10'
                        if (new Random().nextInt(20) == 0) {
                            error('Stage 10 failed randomly')
                        }
                        echo 'Stage 10 completed'
                    }
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
