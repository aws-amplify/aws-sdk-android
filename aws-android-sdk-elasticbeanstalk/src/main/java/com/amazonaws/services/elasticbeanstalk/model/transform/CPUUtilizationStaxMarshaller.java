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
 * StAX marshaller for POJO CPUUtilization
 */
class CPUUtilizationStaxMarshaller {

    public void marshall(CPUUtilization _cPUUtilization, Request<?> request, String _prefix) {
        String prefix;
        if (_cPUUtilization.getUser() != null) {
            prefix = _prefix + "User";
            Double user = _cPUUtilization.getUser();
            request.addParameter(prefix, StringUtils.fromDouble(user));
        }
        if (_cPUUtilization.getNice() != null) {
            prefix = _prefix + "Nice";
            Double nice = _cPUUtilization.getNice();
            request.addParameter(prefix, StringUtils.fromDouble(nice));
        }
        if (_cPUUtilization.getSystem() != null) {
            prefix = _prefix + "System";
            Double system = _cPUUtilization.getSystem();
            request.addParameter(prefix, StringUtils.fromDouble(system));
        }
        if (_cPUUtilization.getIdle() != null) {
            prefix = _prefix + "Idle";
            Double idle = _cPUUtilization.getIdle();
            request.addParameter(prefix, StringUtils.fromDouble(idle));
        }
        if (_cPUUtilization.getIOWait() != null) {
            prefix = _prefix + "IOWait";
            Double iOWait = _cPUUtilization.getIOWait();
            request.addParameter(prefix, StringUtils.fromDouble(iOWait));
        }
        if (_cPUUtilization.getIRQ() != null) {
            prefix = _prefix + "IRQ";
            Double iRQ = _cPUUtilization.getIRQ();
            request.addParameter(prefix, StringUtils.fromDouble(iRQ));
        }
        if (_cPUUtilization.getSoftIRQ() != null) {
            prefix = _prefix + "SoftIRQ";
            Double softIRQ = _cPUUtilization.getSoftIRQ();
            request.addParameter(prefix, StringUtils.fromDouble(softIRQ));
        }
        if (_cPUUtilization.getPrivileged() != null) {
            prefix = _prefix + "Privileged";
            Double privileged = _cPUUtilization.getPrivileged();
            request.addParameter(prefix, StringUtils.fromDouble(privileged));
        }
    }

    private static CPUUtilizationStaxMarshaller instance;

    public static CPUUtilizationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CPUUtilizationStaxMarshaller();
        return instance;
    }
}
