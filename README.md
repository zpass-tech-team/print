# Print Service

## Overview
A reference implementation to print `euin`, `reprint`, `qrcode` [card types](https://github.com/mosip/id-repository/tree/1.2.0-rc2/id-repository/credential-service) in PDF format.

![](docs/print-service.png)

1.
1.
1.
1.

## Build and run (for developers)

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

The print project is a spring boot service. The project has sample card printed as a PDF. [Run guide](/docs/getStartedWithPrint.md)
    
## Deploy
To deploy Print service on Kubernetes cluster using Dockers refer to [mosip-infra](https://github.com/mosip/mosip-infra/tree/1.2.0_v3/deployment/v3)

## Configuration
Refer to the [configuration guide](/docs/configuration.md)

## Test
Automated functaionl tests available in [Functional Tests repo](https://github.com/mosip/mosip-functional-tests)`

## License
This project is licensed under the terms of [Mozilla Public License 2.0](https://github.com/mosip/mosip-platform/blob/master/LICENSE)

