package groovy.learning

import groovy.learning.domain.Message

/**
 * This class shows how to make use of Groovy operators
 * - Elvis operator ?:
 * - Safe navigation operator ?.
 *
 */
class GroovyOperators {

	static main(args) {

		// ELVIS operator ?:
		Message message = new Message(type:'PLAIN TEXT')
		String messageContent = message.content ?: 'undefined'
		println "elvis op / messageContent: ${messageContent}"

		// safe navigation operator ?.
		Message message1 = null
		String messageContent1 = message1?.content
		println "safe navigation op / messageContent1: ${messageContent1}"
	}
}
