pipeline {
   agent any

   stages {
      stage('Verify Branch') {
         steps {
            withMaven(maven : 'maven_new') {
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
