/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

public class MockRequestHandler1 implements RequestHandler {

    @Override
    public void beforeRequest(Request<?> request) {
    }

    @Override
    public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo) {
    }

    @Override
    public void afterError(Request<?> request, Exception e) {
    }

    @Override
    public int hashCode() {
        return 1;
    }

}
