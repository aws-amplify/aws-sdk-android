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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ModifyDBClusterParameterGroupRequest
 */
public class ModifyDBClusterParameterGroupRequestMarshaller
        implements
        Marshaller<Request<ModifyDBClusterParameterGroupRequest>, ModifyDBClusterParameterGroupRequest> {

    public Request<ModifyDBClusterParameterGroupRequest> marshall(
            ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest) {
        if (modifyDBClusterParameterGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBClusterParameterGroupRequest)");
        }

        Request<ModifyDBClusterParameterGroupRequest> request = new DefaultRequest<ModifyDBClusterParameterGroupRequest>(
                modifyDBClusterParameterGroupRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBClusterParameterGroup");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBClusterParameterGroupRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = modifyDBClusterParameterGroupRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (modifyDBClusterParameterGroupRequest.getParameters() != null) {
            prefix = "Parameters";
            java.util.List<Parameter> parameters = modifyDBClusterParameterGroupRequest
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
