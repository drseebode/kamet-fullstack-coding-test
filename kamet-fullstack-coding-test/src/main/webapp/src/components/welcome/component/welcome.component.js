import controller  from '../controller/welcome.controller'
//import logo from '../../../assets/images/logo_apf.png'
//import template    from '../template.html'

const myImg = '../../assets/images/Download.jpg'


export const WelcomeComponent = {
    bindings: {
        name: '=name'
    },
    template:`
    <style>
    #home-header {
        text-align: center;
    }
    .main {
        position: relative;
        padding: 30px;
        text-align: center;
    }
   .grid {
        width: 100%;
        height: 250px;
    }
</style>
<div id="home-header" class="jumbotron" ng-controller="WelcomeController as welcome">
    <img src="./assets/images/Download.jpg">
    <img src={${myImg} />
    <h1>You selected: {{column}}</h1>
    
    
    <select ng-model="column" ng-change="welcome.selectedItemChanged(column)">
    <option ng-repeat="x in welcome.columns()">{{x}}</option>
    </select>
    
    <div id="grid1" ui-grid="welcome.gridOptions" ui-grid-selection class="grid"></div>
    
 
</div>
`,
    //styleUrls: ['./welcome.scss'],// template and controller using ES6 shorthand
    //template,
    controller
}