/**
 * Created by ortecadmin on 25.02.2017.
 */
//import { assert } from 'chai';
import welcome from '../../../../main/webapp/src/components/welcome';
import WelcomeDirective from  '../../../../main/webapp/src/components/welcome/directive/date/date';


describe('Directive: Date', function() {

    var compiledDirective, scope, date;

    beforeEach(angular.mock.module(welcome));

    beforeEach(angular.mock.inject(function ($rootScope, $compile) {
        scope = $rootScope.$new();

        //var content = '<button type="button" ng-click="onClick()" class="btn btn-default">{{text}}</button>';


        date = new WelcomeDirective();
        var content = date.template;

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

        var expected = new Date();


        spyOn(date,'onClick').and.callFake(function() {
            scope.text = expected;
        })
        scope.onClick = () => date.onClick();


        browserTrigger(compiledDirective, 'click');
        scope.$digest();
        expect(date.onClick).toHaveBeenCalled();
        expect(compiledDirective.text()).toContain(expected);
        //console.log(compiledDirective.text());


    });

});