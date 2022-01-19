# Print Service Build and Run Guide

## Pre-requisites
Following tools required to run the print service locally.

###Ngrok

we are using ngrok to expose local port to remote to communicate with websub

###Required Java 11 Version.

A reference project to use mosip credential service over websub and print a digital card. [print repo](https://github.com/mosip/print)


## Build

## Run

## Configuration

Refer to the [configuration guide](/docs/configuration.md)

##Run 

### Config server run

As a developer, to run a service jar individually:
    ```
    `java -Dspring.profiles.active=<profile> -Dspring.cloud.config.uri=<config-url> -Dspring.cloud.config.label=<config-label> -jar <jar-name>.jar`
    ```
    Example:  
        _profile_: `env` (extension used on configuration property files*)    
        _config_label_: `master` (git branch of config repo*)  
        _config-url_: `http://localhost:51000` (Url of the config server*)  
	
	\* Refer to [kernel-config-server](https://github.com/mosip/commons/tree/master/kernel/kernel-config-server) for details

## Docker

