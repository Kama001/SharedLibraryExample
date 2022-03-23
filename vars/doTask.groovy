void call(def task, Map settings) {
  pipeline {
    agent any 
    stages {
      stage('Check') {
        steps {
//           echo "in doTask file"
//           echo "${settings.Region.asia}"
//           echo "${task.check()}"
            killProcess(['CANoe64.exe', 'SupportAssistant.exe'])
        }
      }
    }
  }
}
// void call() {
//   echo "helloWorld"
// }
