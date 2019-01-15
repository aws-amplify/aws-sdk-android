/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Destination
 */
class DestinationStaxMarshaller {

    public void marshall(Destination _destination, Request<?> request, String _prefix) {
        String prefix;
        if (_destination.getToAddresses() != null) {
            prefix = _prefix + "ToAddresses";
            java.util.List<String> toAddresses = _destination.getToAddresses();
            int toAddressesIndex = 1;
            String toAddressesPrefix = prefix;
            for (String toAddressesItem : toAddresses) {
                prefix = toAddressesPrefix + ".member." + toAddressesIndex;
                if (toAddressesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(toAddressesItem));
                }
                toAddressesIndex++;
            }
            prefix = toAddressesPrefix;
        }
        if (_destination.getCcAddresses() != null) {
            prefix = _prefix + "CcAddresses";
            java.util.List<String> ccAddresses = _destination.getCcAddresses();
            int ccAddressesIndex = 1;
            String ccAddressesPrefix = prefix;
            for (String ccAddressesItem : ccAddresses) {
                prefix = ccAddressesPrefix + ".member." + ccAddressesIndex;
                if (ccAddressesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(ccAddressesItem));
                }
                ccAddressesIndex++;
            }
            prefix = ccAddressesPrefix;
        }
        if (_destination.getBccAddresses() != null) {
            prefix = _prefix + "BccAddresses";
            java.util.List<String> bccAddresses = _destination.getBccAddresses();
            int bccAddressesIndex = 1;
            String bccAddressesPrefix = prefix;
            for (String bccAddressesItem : bccAddresses) {
                prefix = bccAddressesPrefix + ".member." + bccAddressesIndex;
                if (bccAddressesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(bccAddressesItem));
                }
                bccAddressesIndex++;
            }
            prefix = bccAddressesPrefix;
        }
    }

    private static DestinationStaxMarshaller instance;

    public static DestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationStaxMarshaller();
        return instance;
    }
}
