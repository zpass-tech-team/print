# Print Service Configuration Guide

## Overview
The guide here lists down some of the important properties that may be customised for a given installation. Note that the listing here is not exhaustive, but a checklist to review properties that are likely to be different from default. If you would like to see all the properites, then refer to the files listed below.

## Configuration files
Print service uses the following configuration files:
```
application-default.properties
print-default.properties
registration-processor-print-text-file.json
identity-mapping.json
```
The above files are located in [mosip-config](https://github.com/mosip/mosip-config/blob/develop3-v3/) repo

## Template
The template used for printing is present in the master data. You can alter that for any look and feel change. Key name in master data for template.
```
RPR_UIN_CARD_TEMPLATE
```
mosip.template-language=eng

To understand the PDF implementation better you can look at the PrintServiceImpl.java file. 

## websub

websub configuration, websub is used to communicate with other services through event.

Set the following properties to setup the service in your environment.
```
mosip.event.hubURL = //Websub url
mosip.partner.id = //your partner id from partner portal
mosip.event.callBackUrl = //call back url for websub so upon a credential issued event the websub will call this url. eg: https://dev.mosip.net/v1/print/print/callback/notifyPrint
mosip.event.topic = // event topic
mosip.event.delay-millisecs = // subscription delay time. 
print-websub-resubscription-delay-millisecs = // resubscription delay time.
mosip.event.secret = //secret key 
```

## datashare

datashare configuration, datashare is used in print-service to stored pdf bytes and shared that link throguh websub.

```
mosip.datashare.partner.id = /your partner id from partner portal
mosip.datashare.policy.id = /your policy id from partner portal
CREATEDATASHARE = //datashare url 

```






