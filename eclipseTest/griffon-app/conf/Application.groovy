application {
    title = 'EclipseTest'
    startupGroups = ['eclipseTest']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "eclipseTest"
    'eclipseTest' {
        model      = 'eclipsetest.EclipseTestModel'
        view       = 'eclipsetest.EclipseTestView'
        controller = 'eclipsetest.EclipseTestController'
    }

}
