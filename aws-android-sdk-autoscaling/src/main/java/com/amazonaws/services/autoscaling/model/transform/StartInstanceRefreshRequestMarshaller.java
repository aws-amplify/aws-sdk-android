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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for StartInstanceRefreshRequest
 */
public class StartInstanceRefreshRequestMarshaller implements
        Marshaller<Request<StartInstanceRefreshRequest>, StartInstanceRefreshRequest> {

    public Request<StartInstanceRefreshRequest> marshall(
            StartInstanceRefreshRequest startInstanceRefreshRequest) {
        if (startInstanceRefreshRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartInstanceRefreshRequest)");
        }

        Request<StartInstanceRefreshRequest> request = new DefaultRequest<StartInstanceRefreshRequest>(
                startInstanceRefreshRequest, "AmazonAutoScaling");
        request.addParameter("Action", "StartInstanceRefresh");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (startInstanceRefreshRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = startInstanceRefreshRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (startInstanceRefreshRequest.getStrategy() != null) {
            prefix = "Strategy";
            String strategy = startInstanceRefreshRequest.getStrategy();
            request.addParameter(prefix, StringUtils.fromString(strategy));
        }
        if (startInstanceRefreshRequest.getPreferences() != null) {
            prefix = "Preferences";
            RefreshPreferences preferences = startInstanceRefreshRequest.getPreferences();
            RefreshPreferencesStaxMarshaller.getInstance().marshall(preferences, request,
                    prefix + ".");
        }

        return request;
    }
}
