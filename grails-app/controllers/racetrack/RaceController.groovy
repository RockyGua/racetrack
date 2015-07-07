package racetrack

import com.acme.Race

class RaceController {

//    def index() {
//        render "Hello World"
//    }
    /*当Grails 看到控制器中癿scaffold 属性，它会动态地产生针对指定领域类的增删查改和必要的视图。所有返些只要一行代码而已*/
    def scaffold = Race
}
