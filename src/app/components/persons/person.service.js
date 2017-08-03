/**
 * Created by amarendrakumar on 01/08/17.
 */
export class PersonService {
  constructor($http,$log) {
    'ngInject';
    this.$http = $http;
    this.$log = $log;
  }
  getAll() {
    // Simple GET request example:
    return this.$http({
      method: 'GET',
      url: '/api/persons'
    }).then(function successCallback(response) {
      // this callback will be called asynchronously
      // when the response is available
      return response.data._embedded.persons;
    });
  }
}
