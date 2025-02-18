/*
 * Copyright 2005-2025 the original author or authors.
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

/**
 * A Subsystem.
 *
 * @author Heiko Scherrer
 */
public class Subsystem {
    /** Unique subsystem name, that is used to identify the receiver. */
    private String name;
    /** The type the driver instance is used for. Different types allow processing different kind of telegrams. */
    private TYPE type = TYPE.conveyor;
    /** The subsystem can be configured in bi-directional duplex mode. */
    private Duplex duplex;
    /** All inbound connection configuration. */
    private Inbound inbound = new Inbound();
    /** All outbound connection configuration. */
    private Outbound outbound = new Outbound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public Duplex getDuplex() {
        return duplex;
    }

    public void setDuplex(Duplex duplex) {
        this.duplex = duplex;
    }

    public Inbound getInbound() {
        return inbound;
    }

    public void setInbound(Inbound inbound) {
        this.inbound = inbound;
    }

    public Outbound getOutbound() {
        return outbound;
    }

    public void setOutbound(Outbound outbound) {
        this.outbound = outbound;
    }

    public enum MODE {
        client, server;
    }

    public enum TYPE {
        /** Conveyor instance with latest telegram specification. */
        conveyor("1"),
        /** Crane instance with latest telegram specification. */
        crane("1"),
        /** Conveyor instance with telegram spec version 1. */
        conveyor_1("1"),
        /** Crane instance with telegram spec version 1. */
        crane_1("1");

        private String version;

        TYPE(String version) {
            this.version = version;
        }
    }

    public static class Inbound {
        /** Whether the inbound connection channel is operated in client or server mode. */
        private MODE mode = MODE.server;
        /** The hostname to connect to in client mode. */
        private String hostname = "localhost";
        /** The port to connect to in client mode. */
        private Integer port;
        /** Socket timeout in [ms], the idle time when to close the connection. */
        private Integer soTimeout;
        /** The size of the receive buffer for tcp/ip connections. */
        private Integer soReceiveBufferSize;

        public MODE getMode() {
            return mode;
        }

        public void setMode(MODE mode) {
            this.mode = mode;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
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
    }

    public static class Outbound {
        /** Whether the outbound connection channel is operated in client or server mode. */
        private MODE mode = MODE.client;
        /** The hostname to connect to in client mode. */
        private String hostname;
        /** The port to connect to in client mode. */
        private Integer port;
        /** Socket timeout in [ms], the idle time when to close the connection. */
        private Integer soTimeout;
        /** The size of the send buffer for tcp/ip connections. */
        private Integer soSendBufferSize;
        /** The telegram field name that identifies the corresponding receiving party. */
        private String identifiedByField;
        /** The value of the identifying field to match the corresponding receiving party. */
        private String identifiedByValue;

        public MODE getMode() {
            return mode;
        }

        public void setMode(MODE mode) {
            this.mode = mode;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getSoTimeout() {
            return soTimeout;
        }

        public void setSoTimeout(Integer soTimeout) {
            this.soTimeout = soTimeout;
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

        public String getIdentifiedByValue() {
            return identifiedByValue;
        }

        public void setIdentifiedByValue(String identifiedByValue) {
            this.identifiedByValue = identifiedByValue;
        }
    }

    public static class Duplex {
        /** Whether the inbound connection channel is operated in client or server mode. */
        private MODE mode = MODE.server;
        /** The hostname to connect to in client mode. */
        private String hostname;
        /** The port to connect to in client mode. */
        private Integer port;
        /** Socket timeout in [ms], the idle time when to close the connection. */
        private Integer soTimeout;
        /** The size of the send buffer for tcp/ip connections. */
        private Integer soSendBufferSize;
        /** The size of the receive buffer for tcp/ip connections. */
        private Integer soReceiveBufferSize;
        /** The telegram field name that identifies the corresponding receiving party. */
        private String identifiedByField;
        /** The value of the identifying field to match the corresponding receiving party. */
        private String identifiedByValue;

        public MODE getMode() {
            return mode;
        }

        public void setMode(MODE mode) {
            this.mode = mode;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getSoTimeout() {
            return soTimeout;
        }

        public void setSoTimeout(Integer soTimeout) {
            this.soTimeout = soTimeout;
        }

        public Integer getSoSendBufferSize() {
            return soSendBufferSize;
        }

        public void setSoSendBufferSize(Integer soSendBufferSize) {
            this.soSendBufferSize = soSendBufferSize;
        }

        public Integer getSoReceiveBufferSize() {
            return soReceiveBufferSize;
        }

        public void setSoReceiveBufferSize(Integer soReceiveBufferSize) {
            this.soReceiveBufferSize = soReceiveBufferSize;
        }

        public String getIdentifiedByField() {
            return identifiedByField;
        }

        public void setIdentifiedByField(String identifiedByField) {
            this.identifiedByField = identifiedByField;
        }

        public String getIdentifiedByValue() {
            return identifiedByValue;
        }

        public void setIdentifiedByValue(String identifiedByValue) {
            this.identifiedByValue = identifiedByValue;
        }
    }
}
