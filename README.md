# Project Name

The project will display the weather data via an Android application.

## Table of Contents

1. [Overview](#overview) A Kotlin Android Native mobile application that provides users with weather
   details by integrating with an Weather API (Open Weather API).

2. [Features](#features) This application's primary features include: 
   a) Displays Current Weather details -
   Details for the current location by default. Additionally, users may look up any particular city
   b) Displays data from Database if data already present.
   c) Displays 5 day weather forecast of selected location.

3. [Screenshots](#screenshots)

   | Current Weather Screen | Forecast Data Screen |

| -------------------- | ------------------- |

| ![Current Weather](https://github.com/user-attachments/assets/1622f6d8-9fb0-40b3-a630-7cbe69c7e920) | ![Forecast Data](https://github.com/user-attachments/assets/b6639013-0c87-4df0-841e-dfedc9e33a97) |

4. [Installation]

   ### Prerequisites

- Android Studio Arctic Fox or later.
- Java 11 or later.
- Gradle 7.0 or later.

### Steps

    1, Clone the repo: git clone https://github.com/JyothiGunnam29/WeatherApplication.git
    2, Open the project in Android Studio.
    3, Sync Gradle.
    4, Run the app on an emulator or device.

5. [Usage](#usage)
   The Application has two tabs implementing bottom navigation bar. on the first, it shows current
   weather information and on second tab future forecast information is present.
   User can search for required city weather information on the current weather page. If the device
   is offline and data for selected city is present in database, details of current weather will be
   fetched from database.

6. [Architecture](#architecture)

   This project include MVVM (Model-View-ViewModel)
   Model: Contains data and business logic.
   View: Displays the UI to the user.
   ViewModel: Handles communication between the View and Model.

7. [Technologies Used](#technologies-used)

   Kotlin: For the main programming language.
   Retrofit: For network requests.
   Room: For local database.
   Coroutines: For asynchronous programming.
   LiveData: For lifecycle-aware data updates.
   Mockito: To Mock objects for writing Unit Test cases.

8. [Contributing](#contributing)

   If you want to contribute:
   Fork the project.
   Create a new branch (git checkout -b feature/new-feature).
   Commit your changes (git commit -m 'Add some feature').
   Push to the branch (git push origin feature/new-feature).
   Create a new Pull Request.

9. [License](#license)
   This project is licensed under the MIT License - see the LICENSE file for details.
   
