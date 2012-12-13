package groovypomodoro

class GroovyPomodoroController {
    // these will be injected by Griffon
    def model
    def view

   void mvcGroupInit(Map args) {
        def clockMvc = buildMVCGroup('clock')
        view.clockPanel = clockMvc.view.clockPanel
    }
}
