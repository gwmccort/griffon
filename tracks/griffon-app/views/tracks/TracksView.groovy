package tracks

import javax.swing.JFileChooser

fd = fileChooser(fileSelectionMode: JFileChooser.DIRECTORIES_ONLY)

application(title: 'tracks',
		preferredSize: [320, 240],
		pack: true,
		//location: [50,50],
		locationByPlatform:true,
		iconImage: imageIcon('/griffon-icon-48x48.png').image,
		iconImages: [imageIcon('/griffon-icon-48x48.png').image,
			imageIcon('/griffon-icon-32x32.png').image,
			imageIcon('/griffon-icon-16x16.png').image]) {
			borderLayout()
			toolBar(floatable: false, constraints: NORTH) {
				button('Load',  actionPerformed: controller.load)
				button('Choose',  actionPerformed: controller.choose)
				button('Clear', actionPerformed: controller.&clear)
			}
			scrollPane(constraints: CENTER) {

				//	  label(text:'hello')
				table {
					tableFormat = defaultTableFormat(columnNames: ['Title', 'Artist', 'Album', 'File'])
					eventTableModel(source: model.tracks, format: tableFormat)
					installTableComparatorChooser(source: model.tracks)
				}
			}
		}
