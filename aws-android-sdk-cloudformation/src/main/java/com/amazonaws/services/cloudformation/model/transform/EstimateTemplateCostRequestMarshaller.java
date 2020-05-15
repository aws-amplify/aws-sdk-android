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
 * StAX request marshaller for EstimateTemplateCostRequest
 */
public class EstimateTemplateCostRequestMarshaller implements
        Marshaller<Request<EstimateTemplateCostRequest>, EstimateTemplateCostRequest> {

    public Request<EstimateTemplateCostRequest> marshall(
            EstimateTemplateCostRequest estimateTemplateCostRequest) {
        if (estimateTemplateCostRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(EstimateTemplateCostRequest)");
        }

        Request<EstimateTemplateCostRequest> request = new DefaultRequest<EstimateTemplateCostRequest>(
                estimateTemplateCostRequest, "AWSCloudFormation");
        request.addParameter("Action", "EstimateTemplateCost");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (estimateTemplateCostRequest.getTemplateBody() != null) {
            prefix = "TemplateBody";
            String templateBody = estimateTemplateCostRequest.getTemplateBody();
            request.addParameter(prefix, StringUtils.fromString(templateBody));
        }
        if (estimateTemplateCostRequest.getTemplateURL() != null) {
            prefix = "TemplateURL";
            String templateURL = estimateTemplateCostRequest.getTemplateURL();
            request.addParameter(prefix, StringUtils.fromString(templateURL));
        }
        if (estimateTemplateCostRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = estimateTemplateCostRequest.getParameters();
            int parametersIndex = 1;
            String parametersPrefix = prefix;
            for (Parameter parametersItem : parameters) {
                prefix = parametersPrefix + ".member." + parametersIndex;
                if (parametersItem != null) {
                    ParameterStaxMarshaller.getInstance().marshall(parametersItem, request,
                            prefix + ".");
                }
                parametersIndex++;
            }
            prefix = parametersPrefix;
        }

        return request;
    }
}
