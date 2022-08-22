/*
 * Copyright 2005-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openwms.common.comm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * A Connections.
 *
 * @author Heiko Scherrer
 */
@Component
@ConfigurationProperties(prefix = "owms.driver.connections")
public class Connections {

    /** The hostname to connect to in client mode. */
    private String hostname = "localhost";
    /** The listening port used in synchronous mode. */
    private String portRest;
    /** Socket timeout in [ms], the idle time when to close the connection. */
    private Integer soTimeout;
    /** The size of the receive buffer for tcp/ip connections. */
    private Integer soReceiveBufferSize = 160;
    /** The size of the send buffer for tcp/ip connections. */
    private Integer soSendBufferSize = 160;
    /** The field name in the message that identifies the message receiver. */
    private String identifiedByField = "RECV";
    /** All subsystems. */
    private List<Subsystem> subsystems = new ArrayList<>();

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPortRest() {
        return portRest;
    }

    public void setPortRest(String portRest) {
        this.portRest = portRest;
    }

    public Integer getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(Integer soTimeout) {
        this.soTimeout = soTimeout;
    }

    public Integer getSoReceiveBufferSize() {
        return soReceiveBufferSize;
    }

    public void setSoReceiveBufferSize(Integer soReceiveBufferSize) {
        this.soReceiveBufferSize = soReceiveBufferSize;
    }

    public Integer getSoSendBufferSize() {
        return soSendBufferSize;
    }

    public void setSoSendBufferSize(Integer soSendBufferSize) {
        this.soSendBufferSize = soSendBufferSize;
    }

    public String getIdentifiedByField() {
        return identifiedByField;
    }

    public void setIdentifiedByField(String identifiedByField) {
        this.identifiedByField = identifiedByField;
    }

    public List<Subsystem> getSubsystems() {
        return subsystems;
    }

    public void setSubsystems(List<Subsystem> subsystems) {
        this.subsystems = subsystems;
    }
}
