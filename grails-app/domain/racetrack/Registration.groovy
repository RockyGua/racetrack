package racetrack

import com.acme.Race

class Registration {

    static constraints = {
        race()
        runner()
        paid()
        dateCreated()
    }

    static belongsTo = [race:Race, runner:Runner]
    Boolean paid
    Date dateCreated


     /*领域类的生命周期事件 */
    def beforeInsert = {
    // your code goes here
    }
    def beforeUpdate = {
    // your code goes here
    }
    def beforeDelete = {
    // your code goes here
    }
    def onLoad = {
    //
    }


}
