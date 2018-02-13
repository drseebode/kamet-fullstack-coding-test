import angular from 'angular';
import uirouter from '@uirouter/angularjs';
import home from './views/home';
import page2 from './views/page2';
import page3 from './views/page3';
import welcome from './components/welcome';


export default angular.module('my-app', [
    uirouter,
    home,
    page2,
    page3,
    welcome
]);
