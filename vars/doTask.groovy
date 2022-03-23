void call(def task, Map settings) {
  pipeline {
    agent any 
    stages {
      stage('Check') {
        steps {
//           echo "in doTask file"
//           echo "${settings.Region.asia}"
//           echo "${task.check()}"
             
//           helloWorld(['a.exe', 'b.exe'])
          
//           cleanWs()
             
             helloWorld("file1.txt")
        }
      }
    }
  }
}
// void call() {
//   echo "helloWorld"
// }
