package mvc

class MvcController {
    // these will be injected by Griffon
    def model
    def view

	MvcController(){
		println 'MvcController() ...'
//		def (m, v, c) = createMVCGroup('myPanel')
	}
	
	void mvcGroupInit(Map args) {
		def mvc = buildMVCGroup('myPanel')
		view.myPanel = mvc.view.myPanel
	}
//     void mvcGroupInit(Map args) {
//		 println 'MvcController.mvcGroupInit()...'
//		 
//        def (m, v, c) = createMVCGroup('myPanel')
//		println "m: $m, v: $v, c: $c"
//		println "app $app"
//		println app.views
//		println app.views['myPanel']
//		println app.views.myPanel
//		println app.views.myPanel.view
//		
//     }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
       
    def action = { evt = null ->
    }
    */
	 
	 
}
