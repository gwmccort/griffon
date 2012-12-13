package eclipsetest

import ca.odell.glazedlists.*
import ca.odell.glazedlists.swing.*
import javax.swing.JTabbedPane

application(title: 'eclipseTest',
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
        button(text: 'add', actionPerformed: controller.add, constraints: NORTH)
        scrollPane(constraints: CENTER ) {
            list(id:'myList', model: model.myListModel)  //works
            //    	list(id:'myList', model: new EventListModel(model.myList))  //works
            //    	list(id:'myList')  {
            //				  eventListModel(source: model.myList)
            //			  }
        }
    }
}
