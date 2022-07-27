var app = angular.module('resume', []);
app.controller('workController', function ($scope, $http) {
    $scope.loadAllWorksByUserId = function (userId) {
        $http.get('http://localhost:8888/resume-core/api/v1/works/user/' + userId)
            .then(function (response) {
                $scope.works = response.data;
            });
    };

    $scope.loadAllWorks = function () {
        $http.get('http://localhost:8888/resume-core/api/v1/works')
            .then(function (response) {
                $scope.works = response.data;
            });
    };

    $scope.updateWork = function(id, work, userId) {
        $http.put('http://localhost:8888/resume-core/api/v1/works/update/' + id, work)
            .then(function (response) {
                $scope.loadAllWorksByUserId(userId);
            });
    };

    $scope.createNewWork = function (userID) {
        $http.post('http://localhost:8888/resume-core/api/v1/works?userId=' + userID, $scope.newWork)
            .then(function (response) {
                $scope.newWork = null;
                $scope.loadAllWorksByUserId(userID);
                $scope.btnAddView = !$scope.btnAddView;
            });
    }

    $scope.loadAllWorksByUserId(1);
});