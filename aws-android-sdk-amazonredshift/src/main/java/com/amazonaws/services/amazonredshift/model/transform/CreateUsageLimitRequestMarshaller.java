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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateUsageLimitRequest
 */
public class CreateUsageLimitRequestMarshaller implements
        Marshaller<Request<CreateUsageLimitRequest>, CreateUsageLimitRequest> {

    public Request<CreateUsageLimitRequest> marshall(CreateUsageLimitRequest createUsageLimitRequest) {
        if (createUsageLimitRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateUsageLimitRequest)");
        }

        Request<CreateUsageLimitRequest> request = new DefaultRequest<CreateUsageLimitRequest>(
                createUsageLimitRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateUsageLimit");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createUsageLimitRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = createUsageLimitRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (createUsageLimitRequest.getFeatureType() != null) {
            prefix = "FeatureType";
            String featureType = createUsageLimitRequest.getFeatureType();
            request.addParameter(prefix, StringUtils.fromString(featureType));
        }
        if (createUsageLimitRequest.getLimitType() != null) {
            prefix = "LimitType";
            String limitType = createUsageLimitRequest.getLimitType();
            request.addParameter(prefix, StringUtils.fromString(limitType));
        }
        if (createUsageLimitRequest.getAmount() != null) {
            prefix = "Amount";
            Long amount = createUsageLimitRequest.getAmount();
            request.addParameter(prefix, StringUtils.fromLong(amount));
        }
        if (createUsageLimitRequest.getPeriod() != null) {
            prefix = "Period";
            String period = createUsageLimitRequest.getPeriod();
            request.addParameter(prefix, StringUtils.fromString(period));
        }
        if (createUsageLimitRequest.getBreachAction() != null) {
            prefix = "BreachAction";
            String breachAction = createUsageLimitRequest.getBreachAction();
            request.addParameter(prefix, StringUtils.fromString(breachAction));
        }
        if (createUsageLimitRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createUsageLimitRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
