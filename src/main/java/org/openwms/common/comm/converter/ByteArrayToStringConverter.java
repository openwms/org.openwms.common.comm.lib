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
package org.openwms.common.comm.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.integration.config.IntegrationConverter;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * A ByteArrayToStringConverter is a simple byte array to String converter; allowing the character set to be specified.
 * 
 * @author Heiko Scherrer
 */
@IntegrationConverter
@Component
class ByteArrayToStringConverter implements Converter<byte[], String> {

    private String charSet = "UTF-8";

    /**
     * {@inheritDoc}
     */
    @Override
    public String convert(byte[] bytes) {
        try {
            return new String(bytes, this.charSet);
        } catch (UnsupportedEncodingException e) {
            return new String(bytes);
        }
    }

    /**
     * @return the charSet
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * @param charSet
     *            the charSet to set
     */
    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }
}
