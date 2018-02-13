import WelcomeModel from '../model/welcome.model';

export default class WelcomeService {

    /*
     The below annotation will be processes by ngAnnotate, which
     will annotate the constructor after compiling for minification.
     */
    /*@ngInject;*/
    constructor() {
        this.names = [new WelcomeModel('John'), new WelcomeModel('Elisa'), new WelcomeModel('Mark'), new WelcomeModel('Annie')];

        this.sample = new WelcomeModel("Sample");

    }


    getName() {

        const totalNames = this.names.length;
        const rand = Math.floor(Math.random() * totalNames);
        var select = this.names[rand];
        return select.getName();
    }

    getSample(){
        return this.sample.getSampleData();
    }



}
