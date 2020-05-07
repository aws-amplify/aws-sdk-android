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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HostedZone
 */
class HostedZoneStaxMarshaller {

    public void marshall(HostedZone _hostedZone, Request<?> request, String _prefix) {
        String prefix;
        if (_hostedZone.getId() != null) {
            prefix = _prefix + "Id";
            String id = _hostedZone.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_hostedZone.getName() != null) {
            prefix = _prefix + "Name";
            String name = _hostedZone.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_hostedZone.getCallerReference() != null) {
            prefix = _prefix + "CallerReference";
            String callerReference = _hostedZone.getCallerReference();
            request.addParameter(prefix, StringUtils.fromString(callerReference));
        }
        if (_hostedZone.getConfig() != null) {
            prefix = _prefix + "Config";
            HostedZoneConfig config = _hostedZone.getConfig();
            HostedZoneConfigStaxMarshaller.getInstance().marshall(config, request, prefix + ".");
        }
        if (_hostedZone.getResourceRecordSetCount() != null) {
            prefix = _prefix + "ResourceRecordSetCount";
            Long resourceRecordSetCount = _hostedZone.getResourceRecordSetCount();
            request.addParameter(prefix, StringUtils.fromLong(resourceRecordSetCount));
        }
        if (_hostedZone.getLinkedService() != null) {
            prefix = _prefix + "LinkedService";
            LinkedService linkedService = _hostedZone.getLinkedService();
            LinkedServiceStaxMarshaller.getInstance()
                    .marshall(linkedService, request, prefix + ".");
        }
    }

    private static HostedZoneStaxMarshaller instance;

    public static HostedZoneStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HostedZoneStaxMarshaller();
        return instance;
    }
}
