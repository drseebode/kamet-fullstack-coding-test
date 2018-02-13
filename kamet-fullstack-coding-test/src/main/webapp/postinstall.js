require('fs').writeFileSync(
    require.resolve('font-awesome-webpack/index.js'),
    'require("style-loader!css-loader!less-loader!./font-awesome-styles.loader!./font-awesome.config.js");'
);