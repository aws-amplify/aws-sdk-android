/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PhoneNumberInformation
 */
class PhoneNumberInformationStaxMarshaller {

    public void marshall(PhoneNumberInformation _phoneNumberInformation, Request<?> request,
            String _prefix) {
        String prefix;
        if (_phoneNumberInformation.getCreatedAt() != null) {
            prefix = _prefix + "CreatedAt";
            java.util.Date createdAt = _phoneNumberInformation.getCreatedAt();
            request.addParameter(prefix, StringUtils.fromDate(createdAt));
        }
        if (_phoneNumberInformation.getPhoneNumber() != null) {
            prefix = _prefix + "PhoneNumber";
            String phoneNumber = _phoneNumberInformation.getPhoneNumber();
            request.addParameter(prefix, StringUtils.fromString(phoneNumber));
        }
        if (_phoneNumberInformation.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _phoneNumberInformation.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_phoneNumberInformation.getIso2CountryCode() != null) {
            prefix = _prefix + "Iso2CountryCode";
            String iso2CountryCode = _phoneNumberInformation.getIso2CountryCode();
            request.addParameter(prefix, StringUtils.fromString(iso2CountryCode));
        }
        if (_phoneNumberInformation.getRouteType() != null) {
            prefix = _prefix + "RouteType";
            String routeType = _phoneNumberInformation.getRouteType();
            request.addParameter(prefix, StringUtils.fromString(routeType));
        }
        if (_phoneNumberInformation.getNumberCapabilities() != null) {
            prefix = _prefix + "NumberCapabilities";
            java.util.List<String> numberCapabilities = _phoneNumberInformation
                    .getNumberCapabilities();
            int numberCapabilitiesIndex = 1;
            String numberCapabilitiesPrefix = prefix;
            for (String numberCapabilitiesItem : numberCapabilities) {
                prefix = numberCapabilitiesPrefix + ".member." + numberCapabilitiesIndex;
                if (numberCapabilitiesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(numberCapabilitiesItem));
                }
                numberCapabilitiesIndex++;
            }
            prefix = numberCapabilitiesPrefix;
        }
    }

    private static PhoneNumberInformationStaxMarshaller instance;

    public static PhoneNumberInformationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PhoneNumberInformationStaxMarshaller();
        return instance;
    }
}
