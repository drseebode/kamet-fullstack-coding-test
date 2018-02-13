import angular from 'angular';
import app from '../../components/App';
import template from './template.html';
import 'font-awesome-webpack';

export default angular.module('my-app.page2', [
    app,
])
    .config(function ($stateProvider) {
        "ngInject";

        $stateProvider
            .state('page2', {
                url: '/page2',
                template: '<page2></page2>'
            });
    })
    .component('page2', {template}).name;
