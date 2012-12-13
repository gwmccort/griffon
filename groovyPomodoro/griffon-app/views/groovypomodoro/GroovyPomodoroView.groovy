package groovypomodoro

application(title: 'GroovyPomodoro',
  preferredSize: [900, 600],
  pack: true,
  location: [50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    // add content here
//    label('Content Goes Here') // delete me
	
	vbox {
		widget(clockPanel)
		def tabPane = tabbedPane(tabPlacement: JTabbedPane.TOP) {
		  label('Today ToDo', title:'Today ToDo', tabToolTip:'Uno!')
			label('Green', title:'Urgent', tabBackground:java.awt.Color.GREEN)
			label('Stop Operation', title:'Activities', tabMnemonic:'O')
			label('Stop Operation', title:'Summary/Recording', tabDisplayedMnemonicIndex:5)
		}
   }
}
