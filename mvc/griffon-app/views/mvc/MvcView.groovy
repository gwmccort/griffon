package mvc

println 'MvcView....'

application(title: 'mvc',
		preferredSize: [320, 240],
		pack: true,
		//location: [50,50],
		locationByPlatform:true,
		iconImage: imageIcon('/griffon-icon-48x48.png').image,
		iconImages: [imageIcon('/griffon-icon-48x48.png').image,
			imageIcon('/griffon-icon-32x32.png').image,
			imageIcon('/griffon-icon-16x16.png').image]) {

			borderLayout()

//			panel (constraints: NORTH){
//				vbox{
//					label(text:'hello')
//					separator()
//				}
//			}

			panel (constraints: NORTH){
				borderLayout()
				label(text:'hello',  horizontalAlignment: JLabel.CENTER, constraints: CENTER)
				separator(constraints: SOUTH)
			}

			//			separator(constraints: CENTER)
			//			panel(id: 'myPanel', constraints: SOUTH)
			//			label(id: 'myPanel', constraints: SOUTH)
			//			widget(id: 'myPanel', constraints: SOUTH)
			//			widget(id: 'myPanel')
			//			widget(app.views.myPanel.myPanel, constraints: SOUTH)
			widget(myPanel, constraints: CENTER)
			label(text: 'end', horizontalAlignment: JLabel.CENTER, constraints: SOUTH)
		}
