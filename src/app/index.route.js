export function routerConfig ($stateProvider, $urlRouterProvider) {
  'ngInject';
  $stateProvider
    .state('home', {
      url: '/',
      templateUrl: 'app/main/main.html',
      controller: 'MainController',
      controllerAs: 'main'
    })
    .state('persons',{
      url: '/persons',
      templateUrl: 'app/persons/persons.html',
      controller: 'PersonController',
      controllerAs: 'person'
    });

  $urlRouterProvider.otherwise('/');
}
