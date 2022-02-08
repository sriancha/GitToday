pipeline{
    agent any
    stages{

        stage("build"){
            steps {
                println "hello Good Morning"

            }
        
        }
        stage("upload"){
            steps {
                println "Upload the file"
                sh "mvn clean package"
            }
        }
        stage("depoly"){
            steps {
                println "depoly the code"
            }
        }
    }
}