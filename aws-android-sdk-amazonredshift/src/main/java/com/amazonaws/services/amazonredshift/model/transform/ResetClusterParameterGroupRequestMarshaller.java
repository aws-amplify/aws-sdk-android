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
 * StAX request marshaller for ResetClusterParameterGroupRequest
 */
public class ResetClusterParameterGroupRequestMarshaller implements
        Marshaller<Request<ResetClusterParameterGroupRequest>, ResetClusterParameterGroupRequest> {

    public Request<ResetClusterParameterGroupRequest> marshall(
            ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) {
        if (resetClusterParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ResetClusterParameterGroupRequest)");
        }

        Request<ResetClusterParameterGroupRequest> request = new DefaultRequest<ResetClusterParameterGroupRequest>(
                resetClusterParameterGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "ResetClusterParameterGroup");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (resetClusterParameterGroupRequest.getParameterGroupName() != null) {
            prefix = "ParameterGroupName";
            String parameterGroupName = resetClusterParameterGroupRequest.getParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupName));
        }
        if (resetClusterParameterGroupRequest.getResetAllParameters() != null) {
            prefix = "ResetAllParameters";
            Boolean resetAllParameters = resetClusterParameterGroupRequest.getResetAllParameters();
            request.addParameter(prefix, StringUtils.fromBoolean(resetAllParameters));
        }
        if (resetClusterParameterGroupRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = resetClusterParameterGroupRequest
                    .getParameters();
            int parametersIndex = 1;
            String parametersPrefix = prefix;
            for (Parameter parametersItem : parameters) {
                prefix = parametersPrefix + "." + parametersIndex;
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
