# Purpose

This shared library is the heart of the [OpenWMS.org TCP/IP driver](https://openwms.github.io/org.openwms.common.comm) that contains the
actual implementation of the driver module but not the message specific implementation details. OpenWMS.org ships with an implementation of
the [OSIP message specification](https://interface21-io.gitbook.io/osip) that is bundled in a separate module and can easily be replaced in
projects with different message structures. For instance a project that connects to PLC that communicate with SAP EWM messages might
implement and integrate their own library with that particular kind of messages but still require this essential shared lib.

![Module composition][1]

# Resources
Find further documentation in the [Wiki](https://wiki.openwms.cloud/projects/common-tcp-slash-ip-driver/wiki)

[![Build status](https://github.com/openwms/org.openwms.common.comm.lib/actions/workflows/master-build.yml/badge.svg)](https://github.com/openwms/org.openwms.common.comm.lib/actions/workflows/master-build.yml)
[![Quality](https://sonarcloud.io/api/project_badges/measure?project=org.openwms:org.openwms.common.comm.lib&metric=alert_status)](https://sonarcloud.io/dashboard?id=org.openwms:org.openwms.common.comm.lib)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)
[![Maven central](https://img.shields.io/maven-central/v/org.openwms/org.openwms.common.comm.lib)](https://search.maven.org/search?q=a:org.openwms.common.comm.lib)
[![Join the chat at https://gitter.im/openwms/org.openwms](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/openwms/org.openwms?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# Build and Release

Build the component locally and release to Maven Central
```
$ mvn deploy -Prelease,gpg
```

[1]: src/site/resources/images/module_composition.png
