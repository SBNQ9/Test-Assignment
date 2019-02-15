// Code goes here

var app = angular.module('app', []);

app.directive('toggleButton',['$http', function($http) {
  return {
    require: 'ngModel',
    scope: {
      activeText: '@activeText',
      inactiveText: '@inactiveText',
      lightState: '=ngModel'
    },
    replace: true,
    transclude: true,
    template: '<div>' +
      '<span ng-transclude></span> ' +
      '<button class="btn leftbtn" ng-class="{\'btn-primary\': state.value}" ng-click="state.toggle(\'left\')">{{activeText}}</button>' +
      '<button class="btn rgtbtn" ng-class="{\'btn-primary\': !state.value}" ng-click="state.toggle(\'right\')">{{inactiveText}}</button>' +
      '</div>',
    link: function postLink(scope) {
      scope.lightState = [];

      scope.state = {
        value: false,
        toggle: function(check) {
          if (check == 'left') {
            this.value = true;
            //scope.lightState = [{}, {}, {}];
            
             $http({
              method: 'GET',
              url: 'https://localhost:8080/assignment/users'
            }).then(function successCallback(response) {
              scope.lightState = response.data;
            }, function errorCallback(response) {
              alert("Error. Try Again!");
            });
            
            
          } else if (check == 'right') {
            this.value = false;
            //scope.lightState = [{}, {}, {}];
             $http({
              method: 'GET',
              url: 'https://localhost:8080/assignment/users'
            }).then(function successCallback(response) {
              scope.lightState = response.data;
            }, function errorCallback(response) {
              alert("Error. Try Again!");
            });
          }
          // scope.lightState = this.value ? scope.activeText : scope.inactiveText;
        },
      };
    }
  }
}]);

app.directive('toggleVideoButton',['$http', function($http) {
  return {
    require: 'ngModel',
    scope: {
      activeText: '@activeText',
      inactiveText: '@inactiveText',
      lightState: '=ngModel'
    },
    replace: true,
    transclude: true,
    template: '<div>' +
      '<span ng-transclude></span> ' +
      '<button class="btn leftbtn" ng-class="{\'btn-primary\': state.value}" ng-click="state.toggle(\'left\')">{{activeText}}</button>' +
      '<button class="btn rgtbtn" ng-class="{\'btn-primary\': !state.value}" ng-click="state.toggle(\'right\')">{{inactiveText}}</button>' +
      '</div>',
    link: function postLink(scope) {
      scope.lightState = [];
      $http({
        method: 'GET',
        url: 'https://localhost:8080/assignment/users'
      }).then(function successCallback(response) {
        scope.lightState = response.data;
      }, function errorCallback(response) {
        alert("Error. Try Again!");
      });


      scope.state = {
        value: false,
        toggle: function(check) {
          if (check == 'left') {
            this.value = true;
            //scope.lightState = [{}, {}, {}];
            $http({
              method: 'GET',
              url: 'https://localhost:8080/assignment/users'
            }).then(function successCallback(response) {
              scope.lightState = response.data;
            }, function errorCallback(response) {
              alert("Error. Try Again!");
            });

          } else if (check == 'right') {
            this.value = false;
            // scope.lightState = [{}, {}, {}];

            $http({
              method: 'GET',
              url: 'https://localhost:8080/assignment/users'
            }).then(function successCallback(response) {
              scope.lightState = response.data;
            }, function errorCallback(response) {
              alert("Error. Try Again!");
            });
          }
          // scope.lightState = this.value ? scope.activeText : scope.inactiveText;
        },
      };
    }
  }
}]);

app.controller("SaveUserVideo", function() {
  $scope.save = function() {
    $http({

      method: 'POST',
      url: 'https://localhost:8080/assignment/save',
      data: $scope.details

    }).then(function successCallback(response) {

      alert("User and video has inserted Successfully")

    }, function errorCallback(response) {

      alert("Error. while created user Try Again!");

    });

  };
});
