## FontawesomeLib

FontawesomeLib is a library that makes it easy to use Fontawesome on Android.

## Code Example

```java
// To get fontawesome icon text
String text = FontawesomeLib.getInstance().getText(FontawesomeLib.FontType.TYPE_SOLID, "adjust");
// text = (char) 0xf042
```

```java
// To apply the fontawesome icon to a TextView or Button
FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "adjust", buttonSample);
FontawesomeLib.getInstance().setIcon(FontawesomeLib.FontType.TYPE_SOLID, "atlas", textViewSample);
```

## Installation

Provide code examples and explanations of how to get the project.

1. Go to [fontawesome](https://fontawesome.com/download) and download "Free for Web".
2. Copy *.ttf to Android Project's /src/main/assets/fonts folder.
3. Add to build.gradle.
```gradle
implementation 'com.yypbd.fontawesomelib:fontawesomelib:0.0.1'
```
4. Initialize library.
```
FontawesomeLib.getInstance().init(getAssets(), "fonts/fa-solid-900.ttf", "fonts/fa-regular-400.ttf", "fonts/fa-brands-400.ttf");
```
5. View the sample app or code example.
6. Use FontawesomeLib. :)


## Tests

Not yet implemented.

## License

MIT License.
