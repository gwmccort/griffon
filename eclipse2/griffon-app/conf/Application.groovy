application {
    title = 'Eclipse2'
    startupGroups = ['eclipse2']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "eclipse2"
    'eclipse2' {
        model      = 'eclipse2.Eclipse2Model'
        view       = 'eclipse2.Eclipse2View'
        controller = 'eclipse2.Eclipse2Controller'
    }

}
