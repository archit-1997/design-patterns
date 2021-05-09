# design-patterns

![design pattern](/images/designpattern.png?raw=true)
<br/>

## Introduction

Design patterns are the best formalized practices a programmer can use to solve common problems when designing an application or system.

Design patterns can speed up the development process by providing tested, proven development paradigms.

Reusing design patterns help prevent subtle issues that cause major problems, and it also improves code readability for coders and architects who are familiar with the patterns.

<br/>

## Factory Design Pattern

<br/>

- creational design pattern that provides an interface for creating objects in a superclass
- also known as **virtual constructor**

#### Advantages 

- allows subclasses to choose the type of objects that will be created.
- promotes **loose-coupling** by eliminating the need to bing application-specific class into the code

#### Uses 

- when a class is unaware of the type of subclass it has to create
- when a class wants to give the control of creating its objects to it's subclass

#### [Implementation](https://github.com/archit-1997/design-patterns/tree/main/src/main/java/factory)

<br/>

## Singleton Design Pattern

<br/>

- creational design pattern the provides a static method to access the instance of a given class
- one of the simplest design pattern in java

#### Advantages 

- ensures that the class has a single instance
- provides a global access point to the instance

#### Uses

- when only a single instance of the class is required to control the action throughout the complete execution
- logging, database connections, driver objects and thread-pool

#### [Implementation](https://github.com/archit-1997/design-patterns/tree/main/src/main/java/singleton)

<br/>

## Code Style
This project uses [prettier-java](https://github.com/jhipster/prettier-java) to format JAVA code.

### Install
<br/>

#### Prerequisites
- [Node Version](https://nodejs.org/en/download/releases/) 10+
- [Prettier](https://github.com/prettier/prettier)

#### Install Prettier and Prettier-Java plugin
```shell
# Local installation
npm install prettier-plugin-java --save-dev

# Or globally
npm install -g prettier prettier-plugin-java
```

#### Formatting the code

```shell
make fmt
```

You can customize the formatting rules by editing the `.prettierrc.yaml` file present in the project root.



