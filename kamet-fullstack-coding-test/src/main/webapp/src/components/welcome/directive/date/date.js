/**
 * Created by ortecadmin on 24.02.2017.
 */
//import template from './date.html';
import { Inject } from 'angular-es6';

export default class WelcomeDirective extends Inject {
    /*@ngInject;*/
    //static $inject = ['$http'];

    constructor(...args) {
        super(...args);

        this.template = `<button type="button" ng-click="onClick()" class="btn btn-default">{{text | datefilter}}</button>`;
        this.restrict = 'E';
    }

    link(scope) {
        const { $http } = this.$inject;

        scope.onClick = () => this.onClick();
        scope.text = 'Directives are working';
    }

    onClick() {
        const { scope } = this.link.$inject;


        scope.text = new Date();
    }

}
