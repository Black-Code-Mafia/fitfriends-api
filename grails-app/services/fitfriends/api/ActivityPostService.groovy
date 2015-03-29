package fitfriends.api

import grails.mongodb.geo.Point
import grails.transaction.Transactional

@Transactional
class ActivityPostService {

    def addActivityPost(LinkedHashMap params) {
        def newPost = new ActivityPost(params)
        def results = newPost.save()
        results
    }

    def updateActivityPost(Long id, LinkedHashMap params){
        def post = ActivityPost.findById(id)
        if(params.location){
            def longitude = params.location[0] as double
            def latitude = params.location[1] as double
            params.location = new Point(longitude, latitude)
        }
        post.properties = params

       def result = post.save()
        result
    }
}
