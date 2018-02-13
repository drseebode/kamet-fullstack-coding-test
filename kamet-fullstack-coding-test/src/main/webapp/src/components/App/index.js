import angular from 'angular';
import template from './template.html';
import appService from './service/app.service';


export default angular.module('my-app.app', [])
    .service('appService', appService)
    .component('app', {
        template,
        transclude: true
    }).name;
