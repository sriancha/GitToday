pipeline{
    agent any
    stages{

        stage("build"){
            steps {
                println "hello Good Morning"
                sh "mvn clean package"
                sh "mvn package"
            }
        
        }
        stage("upload"){
            steps {
                println "Upload the file"
            }
        }
        stage("depoly"){
            steps {
                println "depoly the code"
            }
        }
    }
}