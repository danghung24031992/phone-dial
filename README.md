
# react-native-phone-dial

## Getting started

`$ npm install react-native-phone-dial --save`

### Mostly automatic installation

`$ react-native link react-native-phone-dial`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-phone-dial` and add `RNPhoneDial.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNPhoneDial.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.dh.phone.dial.RNPhoneDialPackage;` to the imports at the top of the file
  - Add `new RNPhoneDialPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-phone-dial'
  	project(':react-native-phone-dial').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-phone-dial/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-phone-dial')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNPhoneDial.sln` in `node_modules/react-native-phone-dial/windows/RNPhoneDial.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Phone.Dial.RNPhoneDial;` to the usings at the top of the file
  - Add `new RNPhoneDialPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNPhoneDial from 'react-native-phone-dial';

// TODO: What to do with the module?
RNPhoneDial;
```
  # phone-dial
