pipeline{
    agent any
    stages{

        stage("build"){
            steps{
                println"hello ...Good Morning"
                sh"mvn clean package"
                sh"mvn package"
            }
        
        }
        stages('upload'){
            steps{
                println("Upload the file")
            }
        }
        stages{
            steps{
                println("depoly the code")
            }
        }
    }
}