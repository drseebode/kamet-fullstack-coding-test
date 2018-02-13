export default class AppService {
    /*@ngInject*/
    constructor($rootScope, $http) {
        this.$http = $http;
        this.$rootScope = $rootScope;
       /* this.models = {};
        this.modules = {};*/
       this.data = {};

    }


    findOne(callback) {
        var request = this.$http({
            method: "get",
            url: `http://ec2-52-59-40-94.eu-central-1.compute.amazonaws.com:8080/api/censusdata/5a81d7f23f17e7147c187fc9`,
        });
        return (request.then((response) => {
            console.log("Success " + response.status);
            console.log(response.data);
            this.data = response.data;
            callback(response.data);
    }));
    };


    getByColumn(column,callback) {
        var request = this.$http({
            method: "get",
            url: `http://ec2-52-59-40-94.eu-central-1.compute.amazonaws.com:8080/api/censusdata/bycolumn/${column}`,
        });
        return (request.then((response) => {
            console.log("Success " + response.status);
        console.log(response.data);
        this.data = response.data;
        callback(response.data);
    }));
    };




}