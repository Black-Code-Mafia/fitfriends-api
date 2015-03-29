class UrlMappings {

	static mappings = {

        "/activityposts"(controller:'activityPost'){
            action = [GET:'index', POST:'addActivityPost']
        }
        "/activityposts?"
        "/activityposts/$id"(controller: 'activityPost'){
            action =[GET:'show', PUT:'updatePost']
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
