# TWeather

Source code of application TWeather.

[View app in Play market.](https://play.google.com/store/apps/details?id=bubal.tweather&hl)

A weather forecast app.

<b>Features:</b>
- Weather forecast for the next 14 days. Including day and night temperatures, humidity levels, wind direction and speed, atmospheric pressure.

- Customizable Weather widgets with detail forecast or for single day only.

- Select between several icon and color themes.

- Get a notification as soon as weather changes.

- Share your weather forecast on Facebook, Tweeter, Whatsapp , etc.

- Multiple ways to select your location: you can do it via city name, zip code or you can just find your location on the map or GPS.

- See the location you're getting the weather for on your favourite map.

- If you have a Muzei app, you can set to autoupdate your wallpapers depending on current weather.

- Choose your favourite temperature units: metric or imperial.

- Very simple and friendly interface.

- Fully optimized for tablets.

- Avaliable in English, Czech and Russian languages.

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

<img src="https://cloud.githubusercontent.com/assets/17985872/14413333/2e9be380-ff77-11e5-8afd-bde42c0a18b7.png" width="288" height="406" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413330/2e981a98-ff77-11e5-8d62-f7edd5819d71.png" width="288" height="406" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413329/2e97502c-ff77-11e5-90c3-7384cd1cbe2c.png" width="288" height="406" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413331/2e9a66d6-ff77-11e5-9e92-f4b94cf13cd7.png" width="288" height="406" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413332/2e9b1982-ff77-11e5-9bd4-89eaf45d80e9.png" width="288" height="406" />

- Tablet:

<img src="https://cloud.githubusercontent.com/assets/17985872/14413338/3ad007e4-ff77-11e5-8065-5ffdc4aa1437.png" width="363" height="532" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413337/3acea93a-ff77-11e5-91e1-e10166cbca3a.png" width="363" height="532" />
<img src="https://cloud.githubusercontent.com/assets/17985872/14413339/3ad076a2-ff77-11e5-8741-015101066277.png" width="726" height="493" />
