/**
 * Created by ortecadmin on 24.02.2017.
 */

export default function () {

    return function (text = '') {


        var days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

        var index = new Date(text).getDay();




        return text + ' is ' + days[index];
    }
}



