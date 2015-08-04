'use strict';

try {
    angular.module("raceTrackApp");
    throw 'App is already initialized, exiting';
} catch (err) {
    /* failed to require This is expected if the app isn't yet loaded.*/
}

var raceTrackAppModule = angular.module("raceTrackApp", ["ngRoute", "healthCheckControllers"]);
raceTrackAppModule.constant("module", {});
raceTrackAppModule.config(function ($routeProvider,$locationProvider) {
    $routeProvider.
        when("/", {
            templateUrl: '/template/healthCheck',
            controller: 'HealthCheckCtrl'
        });
});
//raceTrackAppModule.run(function($rootScope) {
//        alert("sdadadadadad");
//    });