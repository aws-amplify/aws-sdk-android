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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;


/**
 * StAX request marshaller for CreateJobRequest
 */
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
        if (createJobRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateJobRequest)");
        }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AWSS3Control");
        request.addParameter("Action", "CreateJob");
        request.addParameter("Version", "2018-08-20");

        String prefix;
        if (createJobRequest.getAccountId() != null) {
            prefix = "x-amz-account-id";
            String accountId = createJobRequest.getAccountId();
            request.addParameter(prefix, StringUtils.fromString(accountId));
        }
        if (createJobRequest.getConfirmationRequired() != null) {
            prefix = "ConfirmationRequired";
            Boolean confirmationRequired = createJobRequest.getConfirmationRequired();
            request.addParameter(prefix, StringUtils.fromBoolean(confirmationRequired));
        }
        if (createJobRequest.getOperation() != null) {
            prefix = "Operation";
            JobOperation operation = createJobRequest.getOperation();
            JobOperationStaxMarshaller.getInstance().marshall(operation, request, prefix + ".");
        }
        if (createJobRequest.getReport() != null) {
            prefix = "Report";
            JobReport report = createJobRequest.getReport();
            JobReportStaxMarshaller.getInstance().marshall(report, request, prefix + ".");
        }
        if (createJobRequest.getClientRequestToken() != null) {
            prefix = "ClientRequestToken";
            String clientRequestToken = createJobRequest.getClientRequestToken();
            request.addParameter(prefix, StringUtils.fromString(clientRequestToken));
        }
        if (createJobRequest.getManifest() != null) {
            prefix = "Manifest";
            JobManifest manifest = createJobRequest.getManifest();
            JobManifestStaxMarshaller.getInstance().marshall(manifest, request, prefix + ".");
        }
        if (createJobRequest.getDescription() != null) {
            prefix = "Description";
            String description = createJobRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createJobRequest.getPriority() != null) {
            prefix = "Priority";
            Integer priority = createJobRequest.getPriority();
            request.addParameter(prefix, StringUtils.fromInteger(priority));
        }
        if (createJobRequest.getRoleArn() != null) {
            prefix = "RoleArn";
            String roleArn = createJobRequest.getRoleArn();
            request.addParameter(prefix, StringUtils.fromString(roleArn));
        }
        if (createJobRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<S3Tag> tags = createJobRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (S3Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
            S3TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                    }
                tagsIndex ++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
