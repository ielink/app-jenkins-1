pipeline {
   agent any

   stages {
      stage('Verify Branch') {
         steps {
             sh 'mvn clean compile'
         }
      }
      stage('Build') {
               steps {
                  echo "$GIT_BRANCH"
               }
            }
   }
}
