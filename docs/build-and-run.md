# Print Service Build and Run Guide

## Pre-requisites
Following tools required to run the print service locally.

### Ngrok

we are using ngrok to expose local port to remote to communicate with websub

### Required Java 11 Version.

A reference project to use mosip credential service over websub and print a digital card. [print repo](https://github.com/mosip/print)


### Config-Server

To run Print-service required Config server running in respective env.[config-server-installation-guide](config-server-installation-guide.md)


## Build

1. To build jars:
    ```
    $ cd print
    $ mvn clean install 
    ```
1. To skip JUnit tests and Java Docs:
    ```
    $ mvn install -DskipTests=true -Dmaven.javadoc.skip=true
    ```
1. To build Docker for a service:
    ```
    $ cd <service folder>
    $ docker build -f Dockerfile
    ```

The print project is a spring boot service.

## Configuration

Refer to the [configuration guide](configuration.md)

##Run 

As a developer, to run a Print service jar:

   
    java -Dspring.profiles.active=<profile> -Dspring.cloud.config.uri=<config-url> -Dspring.cloud.config.label=<config-label> -jar <print-jar-name>.jar
    
    
    Example:  

        _profile_: `env` (extension used on configuration property files*)    
        _config_label_: `master` (git branch of config repo*)  
        _config-url_: `http://localhost:51000` (Url of the config server*)  
        

## Docker 

```
1. To run Docker for a Print-service:
    ```
    $ docker run -dp 3000:3000 <name of the image>

```

