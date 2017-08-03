export class PersonController {
  constructor ($timeout, webDevTec, personService, toastr) {
    'ngInject';

    this.awesomeThings = [];
    this.personList = [];
    this.classAnimation = '';
    this.creationDate = 1500995678680;
    this.toastr = toastr;
    this.personService = personService;
    this.activate($timeout, webDevTec);

    var columnDefs = [
      {headerName: "First Name", field: "firstName", width: 200},
      {headerName: "Last Name", field: "lastName", width: 200},
      {headerName: "Address", field: "address", width: 200},
      {headerName: "Date Of Birth", field: "dateOfBirth", width: 200}
    ];

    this.gridOptions = {
      columnDefs: columnDefs,
      rowData: null,
      rowSelection: 'multiple',
      enableSorting: true,
      enableFilter: true,
      pagination: true,
      paginationAutoPageSize: true,
      animateRows: true,
      getRowNodeId: function(data) { return data.id; },
      onGridReady: (params) => {
        params.api.sizeColumnsToFit();
      }
    };

  }

  getData() {

    var data = [];
    for (var i = 0; i< 1; i++) {
      data.push({firstName: "firstName", lastName: "lastName", address: "person.address", dateOfBirth: "person.dateOfBirth"});
    }
    return data;
  }

  getAllPersons(){
    this.personService
      .getAll()
      .then( response => {
          var data = [];
          angular.forEach(response, (person) => {
            data.push({id: person.id, firstName: person.firstName, lastName: person.lastName, address: person.address, dateOfBirth: person.dateOfBirth});
          });
        this.gridOptions.api.setRowData(data);
        });
  }

  activate($timeout, webDevTec) {
    this.getWebDevTec(webDevTec);
    $timeout(() => {
      this.classAnimation = 'rubberBand';
    }, 4000);
  }

  getWebDevTec(webDevTec) {
    this.awesomeThings = webDevTec.getTec();

    angular.forEach(this.awesomeThings, (awesomeThing) => {
      awesomeThing.rank = Math.random();
    });
  }

  showToastr() {
    this.toastr.info('Fork <a href="https://github.com/Swiip/generator-gulp-angular" target="_blank"><b>generator-gulp-angular</b></a>');
    this.classAnimation = '';
  }
}
