package fitfriends.api

import grails.converters.JSON

class ActivityPostController {

    def activityPostService

    def index() {
        def activities = ActivityPost.findAll()
        render activities as JSON
    }

    def addActivityPost() {
        def postParams = request.JSON as LinkedHashMap
        def results = activityPostService.addActivityPost(postParams)
        render results as JSON
    }

    def show() {
        def result = ActivityPost.findById(params.id as Long)
        render result as JSON
    }

    def updatePost(){
        def postParams = request.JSON as LinkedHashMap
        def id = params.id as Long
        def result = activityPostService.updateActivityPost(id, postParams)
        render result as JSON
    }
}
