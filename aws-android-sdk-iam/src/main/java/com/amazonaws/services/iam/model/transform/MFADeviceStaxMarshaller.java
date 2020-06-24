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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MFADevice
 */
class MFADeviceStaxMarshaller {

    public void marshall(MFADevice _mFADevice, Request<?> request, String _prefix) {
        String prefix;
        if (_mFADevice.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _mFADevice.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_mFADevice.getSerialNumber() != null) {
            prefix = _prefix + "SerialNumber";
            String serialNumber = _mFADevice.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (_mFADevice.getEnableDate() != null) {
            prefix = _prefix + "EnableDate";
            java.util.Date enableDate = _mFADevice.getEnableDate();
            request.addParameter(prefix, StringUtils.fromDate(enableDate));
        }
    }

    private static MFADeviceStaxMarshaller instance;

    public static MFADeviceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MFADeviceStaxMarshaller();
        return instance;
    }
}
