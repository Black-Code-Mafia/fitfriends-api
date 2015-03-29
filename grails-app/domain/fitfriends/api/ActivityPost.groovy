package fitfriends.api

import grails.mongodb.geo.Point

class ActivityPost {

    String activityName
    String activityType
    String activityEndDate
    List<String> tags
    Point location
    String activityLocationName


    static constraints = {
        activityLocationName nullable: true, blank: true
        location nullable: true

    }

    static mapping = {

        location geoIndex: '2dsphere'

    }
}
