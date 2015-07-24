package racetrack

/*
 * Copyright (C) 2015 Epic Games, Inc. All Rights Reserved.
 */

class LoginTagLib {

    def loginControl = {
        if(request.getSession(false) && session.user){
            out << "Hello " + session.user.login;
            out << "[${link(action: "logout", controller: "user"){"Logout"}}]"

        }else {
            out << "[${link(action: "login", controller: "user"){"Login"}}]"
        }
    }
}
