# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/2.3.5.RELEASE/reference/html/#reference)
* [H2 Database](https://www.h2database.com/html/main.html)
* [HTTPie](https://httpie.io/docs)
* [Node.js](https://nodejs.org/en/docs/)
* [webpack](https://webpack.js.org/guides)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Web Project
The following is the reference data used during `.\eatgo-web\npm init`

<pre>
.\eatgo-web> npm init

This utility will walk you through creating a package.json file.
It only covers the most common items, and tries to guess sensible defaults.

See `npm help init` for definitive documentation on these fields
and exactly what they do.

Use `npm install <pkg>` afterwards to install a package and
save it as a dependency in the package.json file.

Press ^C at any time to quit.
package name: (eatgo-web)
version: (1.0.0)
description: Eat Go Web Project
entry point: (index.js) src/index.js
test command: jest
git repository:
keywords:
author: fastcampus
license: (ISC)
About to write to .\eatgo-web\package.json:

{
  "name": "eatgo-web",
  "version": "1.0.0",
  "description": "Eat Go Web Project",
  "main": "src/index.js",
  "scripts": {
    "test": "jest"
  },
  "author": "fastcampus",
  "license": "ISC"
}


Is this OK? (yes)
</pre>

### Webpack Dev Server
To install `webpack-dev-server`, use the following command.
<pre>
./eatgo-web>npm install --save-dev webpack webpack-cli webpack-dev-server
</pre>

There is an issue to start up `webpack-dev-server`.
It depends on the version of `webpack-cli`.
To resolve this, Use the appropriate command according to the version in `./eatgo-wep/package.json`.

For webpack-cli 3.x:
<pre>
"scripts": {
  "start": "webpack-dev-server"
} 
</pre>

For webpack-cli 4.x:
<pre>
"scripts": {
  "start": "webpack serve"
} 
</pre>