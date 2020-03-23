'use strict';
require('./check-versions')();

process.env.NODE_ENV = 'production';

const ora = require('ora');
const rm = require('rimraf');
const path = require('path');
const chalk = require('chalk');
const webpack = require('webpack');
const config = require('../config');
const fse = require('fs-extra');

const webpackConfig = require('./webpack.prod.conf');

const spinner = ora('building for production...');
spinner.start();
function cleanStaticFile(oldTo) {
  var imgDir = path.join(oldTo, "img/");
  var compsDir = path.join(oldTo, "tinymce/");
  var js = path.join(oldTo, "jquery.min.js");
  var cssDir = path.join(oldTo, "css/");
  var fontsDir = path.join(oldTo, "fonts/");
  var jsDir = path.join(oldTo, "js");

  console.log(chalk.cyan('clean path:' + imgDir));
  rm(imgDir, error => {
    if(error) throw error;
  });
  console.log(chalk.cyan('clean path:' + compsDir));
  rm(compsDir, error => {
    if(error) throw error;
  });
  console.log(chalk.cyan('clean path:' + js));
  rm(js, error => {
    if(error) throw error;
  });
  console.log(chalk.cyan('clean path:' + cssDir));
  rm(cssDir, error => {
    if(error) throw error;
  });
  console.log(chalk.cyan('clean path:' + fontsDir));
  rm(fontsDir, error => {
    if(error) throw error;
  });
  console.log(chalk.cyan('clean path:' + jsDir));
  rm(jsDir, error => {
    if(error) throw error;
  });
}

rm(path.join(config.build.assetsRoot, config.build.assetsSubDirectory), err => {
  if (err) throw err;
  webpack(webpackConfig, (err, stats) => {
    spinner.stop();
    if (err) throw err
    process.stdout.write(stats.toString({
      colors: true,
      modules: false,
      children: false, // If you are using ts-loader, setting this to true will make TypeScript errors show up during build.
      chunks: false,
      chunkModules: false
    }) + '\n\n');

    if (stats.hasErrors()) {
      console.log(chalk.red('  Build failed with errors.\n'));
      process.exit(1)
    }

    console.log(chalk.cyan('  Build complete.\n'));
    console.log(chalk.yellow(
      '  Tip: built files are meant to be served over an HTTP server.\n' +
      '  Opening index.html over file:// won\'t work.\n'
    ));
    if (process.env.npm_config_preview) {
      server.start({
        port: 9528,
        directory: './dist',
        file: '/index.html'
      });
      console.log('> Listening at ' + 'http://localhost:9528' + '\n')
    } else if (process.env.NODE_ENV === 'production') {
      var from = path.join(__dirname, "../dist/");
      console.log(chalk.cyan('from:' + from));
      var to = path.join(__dirname, "../../", config.build.DIST_TO);
      console.log(chalk.cyan('to:' + to));
      var oldTo = path.join(__dirname, "../../", config.build.DIST_TO + config.build.assetsSubDirectory);
      rm(oldTo, error => {
        if(error) throw error;
        try{
          fse.copySync(from, to);
          console.log("copy success");
          cleanStaticFile(oldTo);
        } catch (e) {
          console.error(e)
        }
      });
    }
  })
});
