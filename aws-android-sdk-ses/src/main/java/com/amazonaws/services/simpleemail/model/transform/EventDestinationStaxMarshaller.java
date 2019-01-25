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
 * StAX marshaller for POJO EventDestination
 */
class EventDestinationStaxMarshaller {

    public void marshall(EventDestination _eventDestination, Request<?> request, String _prefix) {
        String prefix;
        if (_eventDestination.getName() != null) {
            prefix = _prefix + "Name";
            String name = _eventDestination.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_eventDestination.getEnabled() != null) {
            prefix = _prefix + "Enabled";
            Boolean enabled = _eventDestination.getEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(enabled));
        }
        if (_eventDestination.getMatchingEventTypes() != null) {
            prefix = _prefix + "MatchingEventTypes";
            java.util.List<String> matchingEventTypes = _eventDestination.getMatchingEventTypes();
            int matchingEventTypesIndex = 1;
            String matchingEventTypesPrefix = prefix;
            for (String matchingEventTypesItem : matchingEventTypes) {
                prefix = matchingEventTypesPrefix + ".member." + matchingEventTypesIndex;
                if (matchingEventTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(matchingEventTypesItem));
                }
                matchingEventTypesIndex++;
            }
            prefix = matchingEventTypesPrefix;
        }
        if (_eventDestination.getKinesisFirehoseDestination() != null) {
            prefix = _prefix + "KinesisFirehoseDestination";
            KinesisFirehoseDestination kinesisFirehoseDestination = _eventDestination
                    .getKinesisFirehoseDestination();
            KinesisFirehoseDestinationStaxMarshaller.getInstance().marshall(
                    kinesisFirehoseDestination, request, prefix + ".");
        }
        if (_eventDestination.getCloudWatchDestination() != null) {
            prefix = _prefix + "CloudWatchDestination";
            CloudWatchDestination cloudWatchDestination = _eventDestination
                    .getCloudWatchDestination();
            CloudWatchDestinationStaxMarshaller.getInstance().marshall(cloudWatchDestination,
                    request, prefix + ".");
        }
        if (_eventDestination.getSNSDestination() != null) {
            prefix = _prefix + "SNSDestination";
            SNSDestination sNSDestination = _eventDestination.getSNSDestination();
            SNSDestinationStaxMarshaller.getInstance().marshall(sNSDestination, request,
                    prefix + ".");
        }
    }

    private static EventDestinationStaxMarshaller instance;

    public static EventDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EventDestinationStaxMarshaller();
        return instance;
    }
}
