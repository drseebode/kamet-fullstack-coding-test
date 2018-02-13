// Karma configuration
// Generated on Sat Feb 25 2017 16:52:41 GMT+0100 (Mitteleuropäische Zeit)

var webpackConfig = require('./webpack.config.js');
//webpackConfig.entry = {};
webpackConfig.devtool = 'inline-source-map';


module.exports = function(config) {
  config.set({

    // base path that will be used to resolve all patterns (eg. files, exclude)
    basePath: '',


    // frameworks to use
    // available frameworks: https://npmjs.org/browse/keyword/karma-adapter
    frameworks: ['jasmine'],


    // list of files / patterns to load in the browser
    files: [
        './tests.webpack.js'
        //  './build/bundle.js',
        //  './node_modules/angular-mocks/angular-mocks.js',
        // './node_modules/angular/angular.js',
        //  '../../test/javascript/**/*.test.js'
    ],


    // list of files to exclude
    exclude: [
    ],


    // preprocess matching files before serving them to the browser
    // available preprocessors: https://npmjs.org/browse/keyword/karma-preprocessor
    preprocessors: {
         // './build/bundle.js': ['webpack'],
         // '../../test/javascript/*.test.js': ['babel']
        './tests.webpack.js': ['webpack', 'sourcemap', 'babel']
    },


    // test results reporter to use
    // possible values: 'dots', 'progress'
    // available reporters: https://npmjs.org/browse/keyword/karma-reporter
    reporters: ['progress', 'junit', 'html'],

      junitReporter: {
          outputDir: '../../../target/karma-reports', // results will be saved as $outputDir/$browserName.xml
      },
      htmlReporter: {
          outputDir: '../../../target/karma-reports', // where to put the reports
      },


    // web server port
    port: 9876,


    // enable / disable colors in the output (reporters and logs)
    colors: true,


    // level of logging
    // possible values: config.LOG_DISABLE || config.LOG_ERROR || config.LOG_WARN || config.LOG_INFO || config.LOG_DEBUG
    logLevel: config.LOG_INFO,


    // enable / disable watching file and executing tests whenever any file changes
    autoWatch: true,


    // start these browsers
    // available browser launchers: https://npmjs.org/browse/keyword/karma-launcher
    browsers: ['Chrome', 'Firefox'],


    // Continuous Integration mode
    // if true, Karma captures browsers, runs the tests and exits
    singleRun: false,

    // Concurrency level
    // how many browser should be started simultaneous
    concurrency: Infinity,
    webpack: webpackConfig,

    webpackMiddleware: {
          noInfo: true
    }
  })
}
