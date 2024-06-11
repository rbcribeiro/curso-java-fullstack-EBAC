import gulp from 'gulp';
import imagemin from 'gulp-imagemin';
import sass from 'gulp-sass';
import uglify from 'gulp-uglify';
import dartSass from 'sass';

const sassCompiler = sass(dartSass);

gulp.task('imagemin', () => {
  return gulp.src('src/images/*')
    .pipe(imagemin())
    .pipe(gulp.dest('dist/images'));
});

gulp.task('sass', () => {
  return gulp.src('src/scss/*.scss')
    .pipe(sassCompiler().on('error', sassCompiler.logError))
    .pipe(gulp.dest('dist/css'));
});

gulp.task('uglify', () => {
  return gulp.src('src/js/*.js')
    .pipe(uglify())
    .pipe(gulp.dest('dist/js'));
});

gulp.task('default', gulp.parallel('imagemin', 'sass', 'uglify'));
