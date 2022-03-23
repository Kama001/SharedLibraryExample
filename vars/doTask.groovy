void call(def task, Map settings) {
  pipeline {
    agent any 
    stages {
      stage('Check') {
        steps {
//           echo "in doTask file"
//           echo "${settings.Region.asia}"
//           echo "${task.check()}"
            helloWorld(['CANoe64.exe', 'SupportAssistant.exe'])
            cleanWs()
        }
      }
    }
  }
}
// void call() {
//   echo "helloWorld"
// }
