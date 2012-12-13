application {
    title = 'Mvc'
    startupGroups = ['mvc']
//    		startupGroups = [ 'myPanel', 'mvc']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "myPanel"
    'myPanel' {
        model      = 'mvc.MyPanelModel'
        view       = 'mvc.MyPanelView'
        controller = 'mvc.MyPanelController'
    }

    // MVC Group for "mvc"
    'mvc' {
        model      = 'mvc.MvcModel'
        controller = 'mvc.MvcController'
        view       = 'mvc.MvcView'
    }

}
