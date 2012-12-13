package eclipse2


println "in Eclipse2View..."

application(title: 'eclipse2',
  preferredSize: [320, 240],
  pack: true,
  //location: [50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    

  panel {
	  borderLayout()
	  hbox (constraints: NORTH) {
		  label('Text:')
		  textField(text: bind('text', target: model))
		  button('Enter', actionPerformed: controller.enterAction)
	  }
//	  textField(text: bind('text', source: model), constraints: CENTER)
	  vbox (constraints: WEST){
		  label('Auto Update')
		  textField(text: bind{ model.text })
		  //	  textField(text: bind('text', source: model), constraints: CENTER)
	  }
	  
	  vbox (constraints: EAST){
		  label('Event Update')
		  textField(text: bind{ model.textOutput })
	  }
  }
}
