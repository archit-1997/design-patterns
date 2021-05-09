# design-patterns

<br/>

## Factory Design Pattern

![factory design pattern](/images/factory/factory.jpg?raw=true)

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



