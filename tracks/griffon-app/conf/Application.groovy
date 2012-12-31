application {
    title = 'Tracks'
    startupGroups = ['tracks']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "tracks"
    'tracks' {
        model      = 'tracks.TracksModel'
        view       = 'tracks.TracksView'
        controller = 'tracks.TracksController'
    }

}
