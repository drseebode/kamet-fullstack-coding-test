/**
 * Created by ortecadmin on 25.02.2017.
 */
//import { assert } from 'chai';
import welcome from '../../../../main/webapp/src/components/welcome';
//import WelcomeService from  '../../../../main/webapp/src/components/welcome/service/welcome.service';


describe('Controller: Welcome', function() {
    let $controller/*, $service*/;


    beforeEach(angular.mock.module(welcome));

    beforeEach(angular.mock.inject(function(_$controller_) {
        $controller = _$controller_;
    }));

    /*beforeEach(() => {
        $service = new WelcomeService();

    });*/



   /* it('name is initialized to World', function() {

        let ctrl = $controller('WelcomeController');
        expect(ctrl.name).toBe('World');
        //assert.equal(ctrl.name, 'World');

    });*/


    /*it('calling changeName() should return a name from WelcomeService', function(){

        let ctrl = $controller('WelcomeController');
        spyOn(ctrl.service, 'getName').and.returnValue('NAME');


        ctrl.changeName();
        expect(ctrl.service.getName).toHaveBeenCalled();


    });
*/




});