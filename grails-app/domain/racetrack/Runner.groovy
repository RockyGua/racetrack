package racetrack

class Runner {

    static constraints = {
        firstName(blank:false)
        lastName(blank:false)
        dateOfBirth()
        gender(inList:["M", "F"])
        address()
        city()
        state()
        zipcode()
        email(email:true)
    }
    static hasMany = [registrations:Registration]
    String firstName
    String lastName
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipcode
    String email
    String toString(){
        "${lastName}, ${firstName} (${email})"
    }

    Date dateCreated //注意：这是一个特殊的名字
    /*lastUpdated 癿日期字段，Grails 将在每次抂更新后癿记弽存回数据库癿时候填
    充返个日期。*/
    Date lastUpdated

    /*返个惯例可以轻易地通过配置关闭——叧需简单地在你癿类中增加static mapping 代码
    块：*/
    static mapping = {
        autoTimestamp true
//        sort "startDate"//可以指定某一字段排序
    }

}
