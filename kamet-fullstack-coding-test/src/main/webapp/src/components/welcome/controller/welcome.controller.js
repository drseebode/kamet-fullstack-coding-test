//import WelcomeService from '../service/welcome.service';

export default class WelcomeController  {
    /*@ngInject*/
    constructor(appService, $rootScope,uiGridConstants) {
        this.appService = appService;
        //this.service = new WelcomeService();
        this.name = 'World';
        this.$scope = $rootScope;
        this.uiGridConstants = uiGridConstants;
        this.gridApi = null;










        appService.findOne((data) => {
        console.log("controller::" + JSON.stringify(data));
        this.data = data;
        this.firstDataSet = data;
        this.gridOptions.data = [];
        //this.gridOptions.data.push(this.data);


        });

    }




    columns(){

        return Object.keys(this.firstDataSet);
    }

    changeName() {
       // this.name = this.service.getName();
    }

    sampleData(){
        //return this.service.getSample();
    }

    menuClicked(name){
        alert('Column: ' + name);
    }

    selectedItemChanged(column){
        if(column===null) return
        console.log("controller::clicked::" + column);
        this.appService.getByColumn(column,(data) => {
            console.log("controller::columndata" + JSON.stringify(data));


            this.data = data;
        //this.gridOptions.data = [];
        //this.gridOptions.columnDefs = [];
        //this.gridOptions.columnDefs.push([{ name: 'fieldValue', field: 'fieldValue' }, { name: 'count', field: 'count' }, { name: 'averageAge', field: 'averageAge' }]);
        this.gridOptions.data = this.data;
    });


    }


    /*buildMenu(){



        this.menuItems = [
            {
                context: this.$scope,
                title: 'Column Title Alert',
                action: this.menuClicked(this.$scope.col.displayName)

            }
        ];

        for (var i = 0; i < this.$scope.gridOptions.columnDefs.length; i++) {
            this.$scope.gridOptions.columnDefs[i].menuItems = this.menuItems;

        }
        this.$scope.gridApi.grid.refresh();

    }*/


    gridOptions(){
        this.gridOptions = { data: this.sampleData() };
        this.buildMenu();

        return this.gridOptions
    }








}

//WelcomeController.$inject = ['$scope'];