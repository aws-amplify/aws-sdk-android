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
 * StAX marshaller for POJO VirtualMFADevice
 */
class VirtualMFADeviceStaxMarshaller {

    public void marshall(VirtualMFADevice _virtualMFADevice, Request<?> request, String _prefix) {
        String prefix;
        if (_virtualMFADevice.getSerialNumber() != null) {
            prefix = _prefix + "SerialNumber";
            String serialNumber = _virtualMFADevice.getSerialNumber();
            request.addParameter(prefix, StringUtils.fromString(serialNumber));
        }
        if (_virtualMFADevice.getBase32StringSeed() != null) {
            prefix = _prefix + "Base32StringSeed";
            java.nio.ByteBuffer base32StringSeed = _virtualMFADevice.getBase32StringSeed();
            request.addParameter(prefix, StringUtils.fromByteBuffer(base32StringSeed));
        }
        if (_virtualMFADevice.getQRCodePNG() != null) {
            prefix = _prefix + "QRCodePNG";
            java.nio.ByteBuffer qRCodePNG = _virtualMFADevice.getQRCodePNG();
            request.addParameter(prefix, StringUtils.fromByteBuffer(qRCodePNG));
        }
        if (_virtualMFADevice.getUser() != null) {
            prefix = _prefix + "User";
            User user = _virtualMFADevice.getUser();
            UserStaxMarshaller.getInstance().marshall(user, request, prefix + ".");
        }
        if (_virtualMFADevice.getEnableDate() != null) {
            prefix = _prefix + "EnableDate";
            java.util.Date enableDate = _virtualMFADevice.getEnableDate();
            request.addParameter(prefix, StringUtils.fromDate(enableDate));
        }
    }

    private static VirtualMFADeviceStaxMarshaller instance;

    public static VirtualMFADeviceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualMFADeviceStaxMarshaller();
        return instance;
    }
}
