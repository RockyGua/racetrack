/* Copyright (c) 2012-2013 Epic Games, Inc. All Rights Reserved. */
'use strict';

angular.module("healthCheckControllers", []).
    controller("HealthCheckCtrl", ["$scope", "$timeout", "$location",
        function ($scope, $timeout, $location) {
            $timeout(function(){
                alert($scope);
            },0);
            alert($scope);
        }]);
