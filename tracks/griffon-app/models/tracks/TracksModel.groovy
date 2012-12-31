package tracks

import ca.odell.glazedlists.EventList
import ca.odell.glazedlists.BasicEventList
import ca.odell.glazedlists.SortedList

import data.Track;

class TracksModel {
   EventList<Track> tracks = new SortedList<Track>(new BasicEventList<Track>(),
     {a, b -> a.title <=> b.title} as Comparator<Track>)
   
//   TracksModel(){
//	   println '--- TracksModel constructer'
//	   tracks << new Track(title: 'title1', artist: 'artist1')
//	   tracks << new Track(title: 'title2', artist: 'artist2')
//	   println tracks
//   }
   
//   static {
//	   println '---- TracksModel static init'
//   }
}