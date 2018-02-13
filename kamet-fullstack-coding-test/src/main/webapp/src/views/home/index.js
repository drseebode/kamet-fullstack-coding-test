import angular from 'angular';
import app from '../../components/App';
import template from './template.html';

export default angular.module('my-app.home', [
    app,
])
    .config(function ($stateProvider) {
        "ngInject";

        $stateProvider
            .state('home', {
                url: '/',
                template: '<home></home>'
            });
    })
    .component('home', {template}).name;
