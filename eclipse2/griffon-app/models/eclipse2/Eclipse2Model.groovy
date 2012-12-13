package eclipse2

import groovy.beans.Bindable

class Eclipse2Model {
	@Bindable String text
	@Bindable String textOutput

	static {
		"println in Eclipse2Model static initializer...."
	}
}