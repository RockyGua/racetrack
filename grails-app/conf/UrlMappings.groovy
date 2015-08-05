class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
//		"/template/healthCheck"(controller: "user", action: "auth")
		"/template/healthCheck"(view: "/health/health")

		"/template/api/version"(controller: "user", action: "login")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
