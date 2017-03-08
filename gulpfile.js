'use strict';

const gulp = require('gulp');
const pug = require('gulp-pug');
const exec = require('child_process').exec;
const del = require('del');

gulp.task('js', (cb) => {
  exec('lein cljsbuild once', (err, stdout, stderr) => {
    if (stdout !== '') { console.log(stdout); }
    if (stderr !== '') { console.log(stderr); }
    cb(err);
  });
});

gulp.task('html', () => {
  return gulp.src('./src/**/*.pug')
    .pipe(pug({}))
    .pipe(gulp.dest('./out'));
});

gulp.task('default', ['js', 'html'], () => {
});

gulp.task('clean', (cb) => {
  del(['out'], cb);
});
