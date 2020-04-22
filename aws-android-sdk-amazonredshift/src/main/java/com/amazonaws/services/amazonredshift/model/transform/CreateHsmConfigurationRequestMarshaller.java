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
 * StAX request marshaller for CreateHsmConfigurationRequest
 */
public class CreateHsmConfigurationRequestMarshaller implements
        Marshaller<Request<CreateHsmConfigurationRequest>, CreateHsmConfigurationRequest> {

    public Request<CreateHsmConfigurationRequest> marshall(
            CreateHsmConfigurationRequest createHsmConfigurationRequest) {
        if (createHsmConfigurationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateHsmConfigurationRequest)");
        }

        Request<CreateHsmConfigurationRequest> request = new DefaultRequest<CreateHsmConfigurationRequest>(
                createHsmConfigurationRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateHsmConfiguration");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createHsmConfigurationRequest.getHsmConfigurationIdentifier() != null) {
            prefix = "HsmConfigurationIdentifier";
            String hsmConfigurationIdentifier = createHsmConfigurationRequest
                    .getHsmConfigurationIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmConfigurationIdentifier));
        }
        if (createHsmConfigurationRequest.getDescription() != null) {
            prefix = "Description";
            String description = createHsmConfigurationRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createHsmConfigurationRequest.getHsmIpAddress() != null) {
            prefix = "HsmIpAddress";
            String hsmIpAddress = createHsmConfigurationRequest.getHsmIpAddress();
            request.addParameter(prefix, StringUtils.fromString(hsmIpAddress));
        }
        if (createHsmConfigurationRequest.getHsmPartitionName() != null) {
            prefix = "HsmPartitionName";
            String hsmPartitionName = createHsmConfigurationRequest.getHsmPartitionName();
            request.addParameter(prefix, StringUtils.fromString(hsmPartitionName));
        }
        if (createHsmConfigurationRequest.getHsmPartitionPassword() != null) {
            prefix = "HsmPartitionPassword";
            String hsmPartitionPassword = createHsmConfigurationRequest.getHsmPartitionPassword();
            request.addParameter(prefix, StringUtils.fromString(hsmPartitionPassword));
        }
        if (createHsmConfigurationRequest.getHsmServerPublicCertificate() != null) {
            prefix = "HsmServerPublicCertificate";
            String hsmServerPublicCertificate = createHsmConfigurationRequest
                    .getHsmServerPublicCertificate();
            request.addParameter(prefix, StringUtils.fromString(hsmServerPublicCertificate));
        }
        if (createHsmConfigurationRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createHsmConfigurationRequest.getTags();
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
