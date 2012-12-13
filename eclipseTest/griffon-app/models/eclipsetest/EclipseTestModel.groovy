package eclipsetest

import ca.odell.glazedlists.*
import ca.odell.glazedlists.swing.*

import groovy.beans.Bindable



class EclipseTestModel {
   EventList myList = new BasicEventList()
   EventListModel myListModel = new EventListModel(myList)
   
   
   EclipseTestModel(){
	   myList.addAll(['one', 'two', 'three'])
   }
}