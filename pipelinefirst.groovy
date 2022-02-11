pipeline{
    agent any
    stages{

        stage("build"){
            steps {
                print "hello Good Morning"
                sh "mvn clean package"

            }
        
        }
        stage("upload"){
            steps {
                println "Upload the file"
            }
        }
        stage("depoly"){
            steps {
                println "depoly the code in to env"
            }
        }
    }
}