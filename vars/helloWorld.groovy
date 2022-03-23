// def call(Map config = [:]) {
//     sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
// }
void call(List<String> processes) {
    List<String> cmds = []
    processes.each { process ->
            cmds.add("tasklist | find /i \"${process}\" && taskkill /im ${process} /F")
    }
    cmds.join('\n')
    echo "$cmds"
}
