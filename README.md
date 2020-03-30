## FontawesomeLib

FontawesomeLib is a library that makes it easy to use Fontawesome on Android.

It is based on Fontawesome 5

1. Easily get the typeface and text of fontawesome by name of cheatsheet.
2. Easily apply icons to Button, TextView.


## Supported version

| Fontawesome | This library |
|-----------|-----------|
| [5.10.1](https://fontawesome.com/download) | 1.0.1 |
| [5.8.1](https://fontawesome.com/download) | 1.0.0 |
| [5.8.1](https://fontawesome.com/download) | 0.0.1 |


## Sample Screenshot

| SampleApp | Icon List | Draw to Button, ImageView |
|----------|-------------|------|
| ![Sample App - Draw to ImageView](https://raw.githubusercontent.com/yypbd/FontawesomeLib/master/screenshot/scr_sample_1.png) | ![Sample App - Icon List](https://raw.githubusercontent.com/yypbd/FontawesomeLib/master/screenshot/scr_sample_2.png) | ![Sample App - Draw to Button, ImageView](https://raw.githubusercontent.com/yypbd/FontawesomeLib/master/screenshot/scr_sample_3.png) |


## Code Example

```java
// Initialize
FontawesomeLib.getInstance().init(getAssets(), "fonts/fa-solid-900.ttf", "fonts/fa-regular-400.ttf", "fonts/fa-brands-400.ttf");

// To get fontawesome icon text
String text = FontawesomeLib.getInstance().getText(FontawesomeLib.FontType.TYPE_SOLID, "adjust");
// -> text is 0xf042

// To get typeface
Typeface tf = FontawesomeLib.getInstance().getTypeface(FontawesomeLib.FontType.TYPE_SOLID);

// To apply the fontawesome icon to a TextView or Button
FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "adjust", buttonTest);
FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "atlas", textViewTest);
```

```kotlin


```


## Installation

1. Go to [fontawesome](https://fontawesome.com/download) and download "Free for Web".
2. Copy webfonts/*.ttf to Android Project's /src/main/assets/fonts folder.
3. Add to build.gradle.
```gradle
implementation 'com.yypbd.fontawesomelib:fontawesomelib:1.x.x'
```
4. View the sample app or code example.



## Reference

### [Fontawesome Cheatsheet](https://fontawesome.com/cheatsheet)

### [fontawesome Download](https://fontawesome.com/download)

### [TextDrawable used in SampleApp](https://github.com/devunwired/textdrawable)


## License

MIT License.
