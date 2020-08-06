/*
 *  Copyright 2020 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.continuations;

import java.util.concurrent.CountDownLatch;

/**
 * A {@link CountDownLatch} which implements the {@link Runnable} contract by
 * counting down the latch whenever {@link Runnable#run()} is invoked.
 *
 * A CountDownRunnable always starts at 1.
 */
final class CountDownRunnable extends CountDownLatch implements Runnable {
    private CountDownRunnable() {
        super(1);
    }

    static CountDownRunnable create() {
        return new CountDownRunnable();
    }

    @Override
    public void run() {
        super.countDown();
    }
}
