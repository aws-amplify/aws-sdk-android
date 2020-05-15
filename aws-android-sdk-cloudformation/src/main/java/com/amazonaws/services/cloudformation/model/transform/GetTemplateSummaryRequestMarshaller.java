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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for GetTemplateSummaryRequest
 */
public class GetTemplateSummaryRequestMarshaller implements
        Marshaller<Request<GetTemplateSummaryRequest>, GetTemplateSummaryRequest> {

    public Request<GetTemplateSummaryRequest> marshall(
            GetTemplateSummaryRequest getTemplateSummaryRequest) {
        if (getTemplateSummaryRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetTemplateSummaryRequest)");
        }

        Request<GetTemplateSummaryRequest> request = new DefaultRequest<GetTemplateSummaryRequest>(
                getTemplateSummaryRequest, "AWSCloudFormation");
        request.addParameter("Action", "GetTemplateSummary");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (getTemplateSummaryRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = getTemplateSummaryRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (getTemplateSummaryRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = getTemplateSummaryRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (getTemplateSummaryRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = getTemplateSummaryRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (getTemplateSummaryRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = getTemplateSummaryRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }

        return request;
    }
}
