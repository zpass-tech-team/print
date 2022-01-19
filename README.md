# Print Service

## Overview
A reference implementation to print `euin`, `reprint`, `qrcode` [card types](https://github.com/mosip/id-repository/tree/1.2.0-rc2/id-repository/credential-service) in PDF format. This service is intended to be custimized and used by a card printing agency who need to onboard onto MOSIP as [Credential Partner]() before deploying the service.  

![](docs/print-service.png)

1.
1.
1.
1.

The card data in JSON format is publised as Websub event.  The print service consumes the data from event, decrypts using partner private key and converts into PDF using a predefined [template](docs/configuration.md#template)

## Build and run (for developers)
Refer [Build and Run](docs/build-and-run.md)
    
## Deploy
The deploy print service in production follow the given steps:

1. Onboard your organisation as [Credential Partner](https://nayakrounak.gitbook.io/mosip-docs/partners#credential-partner-cp)
1. Place your `.p12` file in `../src/main/resources` folder.
1. Set configuration as in given [here](docs/configuation.md)
1. Build and run as given [here](docs/build-and-run.md)

## Configuration
Refer to the [configuration guide](/docs/configuration.md)

## Test
Automated functaionl tests available in [Functional Tests repo](https://github.com/mosip/mosip-functional-tests)`

## License
This project is licensed under the terms of [Mozilla Public License 2.0](https://github.com/mosip/mosip-platform/blob/master/LICENSE)
