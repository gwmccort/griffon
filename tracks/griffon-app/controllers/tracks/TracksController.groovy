package tracks

import javax.swing.JFileChooser

import data.Track

class TracksController {
	// these will be injected by Griffon
	def model
	def view

	def load = { evt = null ->
		println 'load action'
		def tracks = Track.getTracks(new File(/C:\Users\Glen\Downloads\SCI Fidelity Records 2012 Sampler\SCI Fidelity Records - SCI Fidelity Records 2012 Sampler/))
		edt {
			model.tracks.addAll(tracks)
		}
	}

	def choose = { evt = null ->
		println 'choose action'
		def fileChoice = view.fd.showOpenDialog()
		if (fileChoice == JFileChooser.APPROVE_OPTION){
			println view.fd.selectedFile
			def tracks = Track.getTracks(view.fd.selectedFile)
			model.tracks.addAll(tracks)
		}
	}

	def clear = { evt = null ->
		model.tracks.clear()
		execInsideUIAsync {
			println 'clear action'
		}
	}
	
	def filter = { evt = null ->
		println 'filter action'
	}

}
