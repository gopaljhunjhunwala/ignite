/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.client;

/**
 * This exception is thrown when a client handshake has failed.
 */
public class GridClientHandshakeException extends GridClientException {
    /** */
    private static final long serialVersionUID = 0L;

    /** Status code for handshake error. */
    private final byte statusCode;

    /**
     * Constructor.
     *
     * @param statusCode Error status code.
     * @param msg Error message.
     */
    public GridClientHandshakeException(byte statusCode, String msg) {
        super(msg);

        this.statusCode = statusCode;
    }

    /**
     * @return Error status code.
     */
    public byte getStatusCode() {
        return statusCode;
    }
}
