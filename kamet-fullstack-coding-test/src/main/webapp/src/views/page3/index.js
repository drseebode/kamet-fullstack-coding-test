import angular from 'angular';
import app from '../../components/App';
import template from './template.html';
import 'font-awesome-webpack';

export default angular.module('my-app.page3', [
    app
])
    .config(function ($stateProvider) {
        "ngInject";

        $stateProvider
            .state('page3', {
                url: '/page3',
                template: '<page3></page3>'
            });
    })
    .component('page3', {template}).name;
