import app from './app';

app.config(function ($urlRouterProvider) {
    "ngInject";

    $urlRouterProvider
        .otherwise('/');
});
