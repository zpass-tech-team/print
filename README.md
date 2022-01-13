# Print
A reference project to use mosip credential service over websub and print a digital card.

## Build
The project requires JDK 1.11. 
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

## Deploy

### Print Service in sandbox
To deploy Print on Kubernetes cluster using Dockers refer to [mosip-infra](https://github.com/mosip/mosip-infra/tree/1.2.0_v3/deployment/v3)

### Developer

1. As a developer, to run a service jar individually:
    ```
    `java -Dspring.profiles.active=<profile> -Dspring.cloud.config.uri=<config-url> -Dspring.cloud.config.label=<config-label> -jar <jar-name>.jar`
    ```
    Example:  
        _profile_: `env` (extension used on configuration property files*)    
        _config_label_: `master` (git branch of config repo*)  
        _config-url_: `http://localhost:51000` (Url of the config server*)  
	
	\* Refer to [kernel-config-server](https://github.com/mosip/commons/tree/master/kernel/kernel-config-server) for details

	
2. Note that you will have to run the dependent services like kernel-config-server to run any service successfully.
    
## Dependencies
print module depends on the following services:
* print-service
     * kernel-websubclient-api in Kernel module.
     * Kernel-config-server in Kernel module.  
     * Kernel-auth-adapter in Kernel module.
     
## Card type
An overview of various card type:
 
* euin
* reprint
* qrcode
     

## Configuration
Refer to the [configuration guide](https://github.com/mosip/mosip-config/blob/develop/sandbox/print-mz.properties).

## Test
Automated functaionl tests available in [Functional Tests repo](https://github.com/mosip/mosip-functional-tests)`

## Get started
The print project is a spring boot service. The project has sample card printed as a PDF. 

Set the following properties to setup the service in your environment.
```
mosip.event.hubURL = //Websub url
mosip.partner.id = //your partner id from partner portal
mosip.event.callBackUrl = //call back url for websub so upon a credential issued event the websub will call this url. eg: https://dev.mosip.net/v1/print/print/callback/notifyPrint
```

Once done you are set to go.

## Customizing. 
As its a reference project you may need to customize this quite often.

The v1/print/callback is the api that consumes the credential json. So in case you need to change

## Template
The template used for printing is present in the master data. You can alter that for any look and feel change. Key name in master data for template.
```
RPR_UIN_CARD_TEMPLATE
```
To understand the PDF implementation better you can look at the PrintServiceImpl.java file. 

## License
This project is licensed under the terms of [Mozilla Public License 2.0](https://github.com/mosip/mosip-platform/blob/master/LICENSE)

Refer to README in respective folders for details.
