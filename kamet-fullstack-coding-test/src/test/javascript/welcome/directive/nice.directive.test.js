/**
 * Created by ortecadmin on 25.02.2017.
 */
//import { assert } from 'chai';
import welcome from '../../../../main/webapp/src/components/welcome';
import Nice from  '../../../../main/webapp/src/components/welcome/directive/nice/Nice';


describe('Directive: Nice', function() {

    var compiledDirective, scope, nice;

    beforeEach(angular.mock.module(welcome));

    beforeEach(angular.mock.inject(function ($rootScope, $compile) {
        scope = $rootScope.$new();

        //var content = '<button type="button" ng-click="onClick()" class="btn btn-default">{{text}}</button>';


        nice = new Nice();
        var content = nice.template;

        compiledDirective = $compile(content)(scope);




        scope.$digest();
    }));

    /*it('should display the defined name', () => {
        let expected = 'Directives are working';

        //scope.name = name;
        compiledDirective.triggerHandler('click');
        scope.$digest();

        expect(compiledDirective.text()).toContain(expected);
    });*/

    it('should get called on a click and have the right text value', function () {

        //var button = compiledDirective.find('button');
        /*console.log(scope);
        console.log(compiledDirective);
        console.log(button);*/
        //console.log(compiledDirective.text());

        var expected = 'PowW';


        spyOn(nice,'onClick').and.callFake(function() {
            scope.text = expected;
        })
        scope.onClick = () => nice.onClick();


        browserTrigger(compiledDirective, 'click');
        scope.$digest();
        expect(nice.onClick).toHaveBeenCalled();
        expect(compiledDirective.text()).toBe(expected);
        //console.log(compiledDirective.text());


    });

});