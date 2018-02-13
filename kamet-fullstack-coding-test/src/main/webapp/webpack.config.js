const path = require('path');
const NODE_ENV = process.env.NODE_ENV || "production";
const DEVELOPMENT = NODE_ENV === "production" ? false : true;
const rootPublic = path.resolve('./src');
const stylesLoader = 'css?root=' + rootPublic + '&sourceMap!postcss!sass?outputStyle=expanded&sourceMap=true&sourceMapContents=true';
const ExtractTextPlugin = require("extract-text-webpack-plugin");
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
    output: {
        publicPath: '/build/'
    },
    // If you need to make requests to a backend server, remove this devServer config. You also need to serve index.html from the backend.
    devServer: {
        // Disable frontend-app built-in proxy options for historyApiFallback.
        proxy: {},
        // Webpack Dev Server serves index.html from project root.
        historyApiFallback: true
    },
    module: {
        loaders: [
            // ...
            {
                test: /\.(scss|sass)$/,
                use: DEVELOPMENT ? ('style!' + stylesLoader) : ExtractTextPlugin.extract({
                        fallback: "style",
                        use: stylesLoader
                    })
            }/*,
            {
                //test: /\.(png|jpg)$/,
                //loader: 'file-loader?name=assets/images/[name].[ext]'
                //loader: 'file-loader',
                //options: {}
                test: /\.(jpe?g|png|gif|svg)$/i,
                //use: 'file-loader?name=[path][name].[ext]'
                use: [
                    {
                        loader: 'url-loader',
                        options: {
                            limit: 100000
                        }
                    }
                    ],
                //include: path.join(__dirname, 'src/assets/images'),
            }*/,
            {
                // HTML LOADER
                // Reference: https://github.com/webpack/raw-loader
                // Allow loading html through js
                test: /\.html$/,
                use: 'html-loader'
            },
            {
                // JS LOADER
                // Reference: https://github.com/babel/babel-loader
                // Transpile .js files using babel-loader
                // Compiles ES6 and ES7 into ES5 code
                test: /\.js$/,
                use: 'babel-loader',
                exclude: /node_modules/
            },
            {
                test: [/ui-grid\.svg/, /ui-grid\.eot/, /ui-grid\.ttf/, /ui-grid\.woff/, /ui-grid\.woff2/],
                use: 'file-loader?name=fonts/[name].[ext]'
            },
            {
                test: /\.css$/,
                use: ['style-loader', 'css-loader']
            }

        ]
    },
    plugins: [
        new ExtractTextPlugin({
            filename: 'assets/styles/css/[contenthash]' + (NODE_ENV === 'development' ? '' : '.[chunkhash]') + '.css',
            allChunks: true
        }),
        new HtmlWebpackPlugin({
            template: './src/index.html',
            inject: 'body'
        }),
        // Copy assets from the public folder
        // Reference: https://github.com/kevlened/copy-webpack-plugin
        // Copy assets from the public folder
        // Reference: https://github.com/kevlened/copy-webpack-plugin
        new CopyWebpackPlugin([{
            from: __dirname + '/src/assets/images/',
            to: __dirname + '/build/assets/images/'
        }])
    ]

};
