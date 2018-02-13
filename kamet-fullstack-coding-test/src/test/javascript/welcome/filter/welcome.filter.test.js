/**
 * Created by ortecadmin on 25.02.2017.
 */
//import { assert } from 'chai';
import welcome from '../../../../main/webapp/src/components/welcome';
//import WelcomeService from  '../../../../main/webapp/src/components/welcome/service/welcome.service';


describe('Filter : datefilter', function() {
    let $filter;/*, $service*/;

    let datestr = 'Mon Feb 27 2017 14:12:43 GMT+0100';


    beforeEach(angular.mock.module(welcome));

    beforeEach(angular.mock.inject(function(_$filter_) {
        $filter = _$filter_;
    }));




    it(datestr + '  is a Monday', function() {

        var result = $filter('datefilter')(datestr);
        var expected = datestr + ' is Monday';
        expect(result).toEqual(expected);

    });







});