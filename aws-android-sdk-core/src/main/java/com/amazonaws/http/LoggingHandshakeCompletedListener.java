/*
 *
 *  * Copyright 2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License").
 *  * You may not use this file except in compliance with the License.
 *  * A copy of the License is located at
 *  *
 *  *  http://aws.amazon.com/apache2.0
 *  *
 *  * or in the "license" file accompanying this file. This file is distributed
 *  * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  * express or implied. See the License for the specific language governing
 *  * permissions and limitations under the License.
 *
 */

package com.amazonaws.http;

import com.amazonaws.logging.LogFactory;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;

public class LoggingHandshakeCompletedListener implements HandshakeCompletedListener {

    private static final com.amazonaws.logging.Log log =
            LogFactory.getLog(LoggingHandshakeCompletedListener.class);
    @Override
    public void handshakeCompleted(HandshakeCompletedEvent event) {
        SSLSession session = event.getSession();
        String protocol = session.getProtocol();
        String cipherSuite = session.getCipherSuite();

        log.debug("Protocol: " + protocol + ", CipherSuite: " + cipherSuite);
    }
}