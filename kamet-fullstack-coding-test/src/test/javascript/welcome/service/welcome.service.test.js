/**
 * Created by ortecadmin on 25.02.2017.
 */
//import { assert } from 'chai';
//import WelcomeService from '../../../../main/webapp/src/components/welcome';
import WelcomeService from  '../../../../main/webapp/src/components/welcome/service/welcome.service';
import WelcomeModel from  '../../../../main/webapp/src/components/welcome/model/welcome.model';


describe('Service: Welcome', function() {
    let  $service;


    beforeEach(() => {
        $service = new WelcomeService();

    });



    it('names array length is not 0', function() {

        let service = $service;

        expect(service.names.length).toBeGreaterThan(0);


    });

    it('calling getName() gets value from WelcomeModel', function() {


        let service = $service;
        let myname = 'NAME';
        service.names = [new WelcomeModel(myname)];
        let name = service.getName();
        expect(name).toBe(myname);

    });


});