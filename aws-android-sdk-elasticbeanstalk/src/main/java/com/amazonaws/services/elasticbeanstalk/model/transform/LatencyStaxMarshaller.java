/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Latency
 */
class LatencyStaxMarshaller {

    public void marshall(Latency _latency, Request<?> request, String _prefix) {
        String prefix;
        if (_latency.getP999() != null) {
            prefix = _prefix + "P999";
            Double p999 = _latency.getP999();
            request.addParameter(prefix, StringUtils.fromDouble(p999));
        }
        if (_latency.getP99() != null) {
            prefix = _prefix + "P99";
            Double p99 = _latency.getP99();
            request.addParameter(prefix, StringUtils.fromDouble(p99));
        }
        if (_latency.getP95() != null) {
            prefix = _prefix + "P95";
            Double p95 = _latency.getP95();
            request.addParameter(prefix, StringUtils.fromDouble(p95));
        }
        if (_latency.getP90() != null) {
            prefix = _prefix + "P90";
            Double p90 = _latency.getP90();
            request.addParameter(prefix, StringUtils.fromDouble(p90));
        }
        if (_latency.getP85() != null) {
            prefix = _prefix + "P85";
            Double p85 = _latency.getP85();
            request.addParameter(prefix, StringUtils.fromDouble(p85));
        }
        if (_latency.getP75() != null) {
            prefix = _prefix + "P75";
            Double p75 = _latency.getP75();
            request.addParameter(prefix, StringUtils.fromDouble(p75));
        }
        if (_latency.getP50() != null) {
            prefix = _prefix + "P50";
            Double p50 = _latency.getP50();
            request.addParameter(prefix, StringUtils.fromDouble(p50));
        }
        if (_latency.getP10() != null) {
            prefix = _prefix + "P10";
            Double p10 = _latency.getP10();
            request.addParameter(prefix, StringUtils.fromDouble(p10));
        }
    }

    private static LatencyStaxMarshaller instance;

    public static LatencyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LatencyStaxMarshaller();
        return instance;
    }
}
