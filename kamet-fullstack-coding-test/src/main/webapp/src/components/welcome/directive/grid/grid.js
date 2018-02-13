//import template from './nice.html';
import { Inject } from 'angular-es6';


export default class Nice extends Inject {
    /*@ngInject;*/
    //static $inject = ['$http'];

    constructor(...args) {
    super(...args);


    this.restrict = 'E';

}

link(scope) {
    const { $http } = this.$inject;

    scope.onClick = () => this.onClick();
    scope.text = 'Directives are working';
}

onClick() {
    const { scope } = this.link.$inject;

    scope.text = 'Directives events are working too';
}

buildMenu(){

    const { scope } = this.link.$inject;

    this.menuItems = [
        {
            context: this.$scope,
            title: 'Column Title Alert',
            action: this.menuClicked(context.col.displayName)

        }
    ];

    for (var i = 0; i < scope.gridOptions.columnDefs.length; i++) {
        scope.gridOptions.columnDefs[i].menuItems = this.menuItems;

    }
    this.$scope.gridApi.grid.refresh();

}

menuClicked(name){
    alert('Column: ' + name);
}
}
