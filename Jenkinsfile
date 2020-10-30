pipeline {
   agent any

   stages {
      stage('Verify Branch') {
         steps {
            withMaven(maven : 'maven-3.6.3') {
               sh 'mvn clean compile'
            }
             
         }
      }
      stage('Build') {
               steps {
                  echo "$GIT_BRANCH"
               }
            }
   }
}
