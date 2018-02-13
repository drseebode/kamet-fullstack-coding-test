import angular from 'angular';
import uirouter from '@uirouter/angularjs';
import WelcomeController from './controller/welcome.controller';
import {WelcomeComponent}  from './component/welcome.component'
import WelcomeService from './service/welcome.service';
import './directive';
import datefilter from './filter/datefilter'
import { exception, compileProvider} from 'angular-es6';
import 'angular-ui-grid/ui-grid.css';
import uigrid from 'angular-ui-grid';

//import './sass/welcome.scss'


export default angular.module('my-app.welcome', [
    uirouter,
    uigrid, 'ui.grid.treeView', 'ui.grid.pagination', 'ui.grid.resizeColumns', 'ui.grid.selection', 'ui.grid.expandable', 'ui.grid.exporter', 'ui.grid.autoResize'
]).config(function ($stateProvider) {
        "ngInject";

        $stateProvider
            .state('my-app.welcome', {
                url: '/',
                component: 'welcome'
            });
    })
    .config(exception)
    .config(compileProvider)
    .controller('WelcomeController', WelcomeController)
    .service('WelcomeService', WelcomeService)
    .filter({datefilter})
    .component('welcome', WelcomeComponent).name;




