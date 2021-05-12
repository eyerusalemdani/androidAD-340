# This is a project android application  at North seattle college.

**HW2 UI Layout**

 Let's liven up your application with some more visual elements and interactivity on the main screen.

-    Add a text entry field and 'send' button to your main activity.
      The text field should have fixed spacing to the left edge of the screen and to the button on its         right. Field width should vary according to screen size. The button should have fixed spacing on        its right to the screen edge.
-   Add a 2 x 2 grid of buttons below the text entry field.

    Each button should have unique text. The left edge of the grid should be aligned with the text field     and right edge should be have a equal amount of spacing with the right edge of the screen. Spacing       between each column of buttons should vary according to screen size,

-   Enable each button with a click event, where tapping the button displays a 'toast' with the text of that button. 

UI elements should be fully visible on a range of phone screen sizes.

Text strings should be defined in a resource file separate from your layout elements.

**
HW3 - Zombie Activities**

This week you've learned about the Activity lifecycle and using Intents to start activities.

We'll put this into practice by adding a few new screens to your app and passing information between them.

Add two new activities to your app - 'Movies', 'Movie Details'
Update your home page to launch 'Movies' when the corresponding button in your 'grid' is clicked,
The Movies activity should display the title and year for each movie in this list. (source: https://collider.com/best-zombie-movies-of-all-time/ (Links to an external site.))
When a list item is selected, launch the movie detail activity to display  title, year, director,  and description for the selected item. Your detail activity should receive movie data as part of the intent bundle.
Enable screen title and 'back' navigation on each activity
Layout & sizing of UI elements should appropriate for a range of phone screen sizes. List and description fields should be scrollable.

Extra Credit

Display movie image on the detail screen
You can use this 3rd-party library to load images from a url - https://square.github.io/picasso/

 
**HW4 - Live Cams**

This week you learned how Android applications can connect with other resources via a network. Let's use that knowledge to show Seattle-area traffic cameras in your application;

Add a new activity to display a list of traffic camera locations. The list should display description and image for each camera. You can re-use much of the layout code from HW4,
Camera data can be loaded from https://web6.seattle.gov/Travelers/api/Map/Data?zoomId=13&type=2 (Links to an external site.). 
JSON data should be mapped to a Camera class for use within your application,
Your activity should check the device connectivity status and display a graceful warning if not connected. You should only make a network request if the application has connectivity
Update one of the buttons on your main screen to launch this new activity when clicked
 

**HW5 - Location, Location, Location**

This week you learned how to work with device location in Android.

Let's apply this to your application by adding a new activity that:

detects the user's location
displays a map, centered on the user's location,
displays a marker for each traffic camera loaded in the previous homework,
displays the camera label when a marker is clicked,
Your new activity should look something like this:
