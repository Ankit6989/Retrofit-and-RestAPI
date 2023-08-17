# Retrofit-and-RestAPI

- Retrofit is a popular open-source library in the Android ecosystem that simplifies the process of making network requests to RESTful APIs. 
- REST APIs (Representational State Transfer Application Programming Interfaces) are a standard way for web services to communicate with each other over HTTP using a set of defined rules and constraints.
  
## Retrofit:

- Retrofit is a type-safe HTTP client for Android and Java applications.
- It allows you to define and configure API endpoints, request parameters, headers, and response types using simple annotations.
- Retrofit converts HTTP APIs into Kotlin or Java interfaces with methods that represent the different API endpoints.
- It provides support for serialization and deserialization of JSON data to and from Java/Kotlin objects.
- Retrofit uses OkHttp as its networking layer and can be easily integrated with other libraries.
- It abstracts away many of the complexities of network communication, making it easier to consume APIs.

## Rest API

- REST (Representational State Transfer) is an architectural style for designing networked applications.
- REST APIs use standard HTTP methods (GET, POST, PUT, DELETE) for communication between clients and servers.
- Resources are identified by URLs, and actions are performed on these resources using the appropriate HTTP methods.
- REST APIs often use JSON as the data format for requests and responses.
- They follow principles like statelessness, client-server separation, and caching to achieve scalability and simplicity.
- Example usage (HTTP methods and URL structure):
 - GET: https://api.example.com/users (Retrieve a list of users)
 - POST: https://api.example.com/users (Create a new user)
 - PUT: https://api.example.com/users/user123 (Update user with ID "user123")
 - DELETE: https://api.example.com/users/user123 (Delete user with ID "user123")

## Summary

- In summary, Retrofit is a library that helps you interact with REST APIs by providing a high-level interface to define API endpoints, make requests, and handle responses.
- REST APIs are a set of conventions and architectural principles for building web services that communicate over HTTP. Together, Retrofit and REST APIs enable efficient and standardized communication between client applications and server resources.

## SetUp

1) Plugin Required
   
```gradle
plugins {
    //...
   kotlin("kapt")
    id ("dagger.hilt.android.plugin")
}
```

2) Add the Dependencies

```gradle
    // Retrofit 2
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //coil
    implementation("io.coil-kt:coil-compose:1.4.0")

    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")

    //Dagger Hilt
    implementation ("com.google.dagger:hilt-android:2.46.1")
    kapt ("com.google.dagger:hilt-android-compiler:2.46.1")
```

3) Add this in build.gradle.kts (project:)
```gradle
   buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}
```

## API Used
```
https://www.freetogame.com/api/games
```
