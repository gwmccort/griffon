application {
	title = 'GroovyPomodoro'
	startupGroups = ['groovyPomodoro']

	// Should Griffon exit when no Griffon created frames are showing?
	autoShutdown = true

	// If you want some non-standard application class, apply it here
	//frameClass = 'javax.swing.JFrame'
}
mvcGroups {
	// MVC Group for "clock"
	'clock' {
		model      = 'groovypomodoro.ClockModel'
		view       = 'groovypomodoro.ClockView'
		controller = 'groovypomodoro.ClockController'
	}

	// MVC Group for "groovyPomodoro"
	'groovyPomodoro' {
		model      = 'groovypomodoro.GroovyPomodoroModel'
		controller = 'groovypomodoro.GroovyPomodoroController'
		view       = 'groovypomodoro.GroovyPomodoroView'
	}

}
