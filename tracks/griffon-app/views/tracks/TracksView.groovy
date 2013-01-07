package tracks

import javax.swing.JFileChooser

import ca.odell.glazedlists.FilterList
import ca.odell.glazedlists.TextFilterator
import ca.odell.glazedlists.swing.TextComponentMatcherEditor

fd = fileChooser(fileSelectionMode: JFileChooser.DIRECTORIES_ONLY)

def tracksMatcherEditor = new TextComponentMatcherEditor(
	textField(id: 'filterText'),
	{baseList, track ->
	   baseList << track.title
	   baseList << track.artist
	   baseList << track.album
	} as TextFilterator
 )

def filteredTracks = new FilterList(model.tracks, tracksMatcherEditor)

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
				button('Filter', actionPerformed: controller.filter)
//				textField(id: 'filterText', columns: 20)
				widget(filterText, columns: 20)
			}
			scrollPane(constraints: CENTER) {
				table {
					tableFormat = defaultTableFormat(columnNames: ['Title', 'Artist', 'Album', 'File'])
//					eventTableModel(source: model.tracks, format: tableFormat)
//					installTableComparatorChooser(source: model.tracks)
					eventTableModel(source: filteredTracks, format: tableFormat)
					installTableComparatorChooser(source: model.tracks)
				}
			}
		}
