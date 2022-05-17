pipeline{
    agent any
    stages{
        stage('Compile Stage'){
            steps{
                withMaven(maven : 'maven_3_8_5'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Validate Stage'){
            steps{
                withMaven(maven : 'maven_3_8_5'){
                    sh 'mvn validate'
                }
            }
        }

        stage('Test Stage'){
            steps{
                withMaven(maven : 'maven_3_8_5'){
                    sh 'mvn test'
                }
            }
        }
    }
}