# TWeather

Source code of application TWeather.

[View app in Play market.](https://play.google.com/store/apps/details?id=bubal.tweather&hl)

A weather forecast app.

<b>Features:</b>
- Weather forecast for the next 14 days. Including day and night temperatures, humidity levels, wind direction and speed, atmospheric pressure.

- Customizable Weather widgets with detail forecast or for single day only.

- Select between several icon themes.

- Get a notification as soon as weather changes.

- Share your weather forecast on Facebook, Tweeter, Whatsapp , etc.

- Multiple ways to select your location: you can do it via city name, zip code or you can just find your location on the map or GPS.

- See the location you're getting the weather for on your favourite map.

- If you have a Muzei app, you can set to autoupdate your wallpapers depending on current weather.

- Choose your favourite temperature units: metric or imperial.

- Very simple and friendly interface.

- Fully optimized for tablets.

<b>Realisation:</b>
- Weather acquired from [OpenWeatherMap.](http://openweathermap.org/) Throught their API I`m sending a query and receiving a JSON which parsed for weather data.

- App uses fragments. Threading, refreshing, cashing are made with AssyncTask.

- Weather stored in SQLite database, only fresh weather data stored. I have 2 databases - for weather and locations. Weather uses location databases via foreign key. So, when user decides to return to his previous location, he don't have to download it again - it`s stoed in database. Also it allows app to work without Internet connection (after first initial weather download).

- Settings made with SharingPreferences.

- Special layouts and values for portrait/land orientation,  tablets and old devices.

- Special class for autoselecting elements for tablets.

- Background synchronisation with server made with SyncAdapter.

- Annotations are supported for conviniense (i.e. for checking up different things like errors with database, server, incorrect locations etc.)

- Custom EditText for checking the input from user.

- Glide API used for downloading icons from web (my github branch "resources" act like server for icons). But app alson have standart set of icons. Also, standart set is used, when it`s impossible to download different icons from web.

- Accessibility features like ContentDescriptions, correct focuse order and etc.  for TalkBack and other stuff.

- Design made with Google Material Design Guidelines (Toolbar, CardView, animations, "surface feeling", etc.)

- Implemented Google Cloud Messagging system. In theory, it supposed to serve as instant notification service for emergency weather. But, since i don`t have a server, it`s only a test feature.

- Map Places API and Google PlacePicker are used for selecting location (but it`s also possible to select location via name or ZIP code).

- Weather notifications are implemented with help of Alarm Manager, Broadcast Reciever and Notification Manager.

- Implemented Muzei API. If user have Muzei app installed, he can select TWeather as a source for images. And background wallpaper will dynamically change, depending on weather.

- Widgets are made with AppWidgetProvider. Also, there is one dynamic widget - depending on it`s size it will change his own layout and show different information.


<b>Screenshots.</b>

- Phone:

<img src="https://cloud.githubusercontent.com/assets/17985872/14280611/1fef1cc2-fb34-11e5-837a-31f63aadba09.png" width="288" height="432" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280613/25383b14-fb34-11e5-9cd8-06d94dd9fcc0.png" width="288" height="432" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280618/2ca4550e-fb34-11e5-8864-af539b9a76e4.png" width="288" height="432" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280956/71eba7aa-fb36-11e5-8d8e-f4a2485393f1.png" width="420" height="232" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280958/742f7bf4-fb36-11e5-91db-25d885fdf9a5.png" width="420" height="232" />

- Tablet:

<img src="https://cloud.githubusercontent.com/assets/17985872/14280635/3f1d330e-fb34-11e5-9b8e-600ed6d3d416.png" width="360" height="423" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280631/3c891cf2-fb34-11e5-93e9-cfe845a149b3.png" width="480" height="311" />

- Different icon set and Muzei integration:

<img src="https://cloud.githubusercontent.com/assets/17985872/14280618/2ca4550e-fb34-11e5-8864-af539b9a76e4.png" width="288" height="432" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280627/374e0f2c-fb34-11e5-846b-6499eaa43738.png" width="288" height="432" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14280628/394c1f26-fb34-11e5-8245-908cda258d57.png" width="288" height="432" />
