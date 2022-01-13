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
To understand the PDF implementation better you can look at the PrintServiceImpl.java file. 




