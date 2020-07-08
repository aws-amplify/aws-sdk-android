/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.testutils.util;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public final class InternetConnectivity {
    private InternetConnectivity() {}

    public synchronized static void goOnline() {
        RetryStrategies.linear(new RetryStrategies.Retryable() {
            @Override
            public void call() {
                AirplaneMode.disable();
            }
        }, new RetryStrategies.Condition() {
            @Override
            public boolean isMet() {
                return InternetConnectivity.isOnline();
            }
        }, 3, 2);
    }

    public synchronized static void goOffline() {
        RetryStrategies.linear(new RetryStrategies.Retryable() {
            @Override
            public void call() {
                AirplaneMode.enable();
            }
        }, new RetryStrategies.Condition() {
            @Override
            public boolean isMet() {
                return InternetConnectivity.isOffline();
            }
        }, 3, 2);
    }

    private static boolean isOnline() {
        int connectionTimeoutMs = (int) TimeUnit.SECONDS.toMillis(2);
        String host = "amazon.com";
        int port = 443;

        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port), connectionTimeoutMs);
            socket.close();
            return true;
        } catch (IOException socketFailure) {
            return false;
        }
    }

    private static boolean isOffline() {
        return !isOnline();
    }
}