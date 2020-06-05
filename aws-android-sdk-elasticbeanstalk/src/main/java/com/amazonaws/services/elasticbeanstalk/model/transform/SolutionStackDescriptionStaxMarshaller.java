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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SolutionStackDescription
 */
class SolutionStackDescriptionStaxMarshaller {

    public void marshall(SolutionStackDescription _solutionStackDescription, Request<?> request,
            String _prefix) {
        String prefix;
        if (_solutionStackDescription.getSolutionStackName() != null) {
            prefix = _prefix + "SolutionStackName";
            String solutionStackName = _solutionStackDescription.getSolutionStackName();
            request.addParameter(prefix, StringUtils.fromString(solutionStackName));
        }
        if (_solutionStackDescription.getPermittedFileTypes() != null) {
            prefix = _prefix + "PermittedFileTypes";
            java.util.List<String> permittedFileTypes = _solutionStackDescription
                    .getPermittedFileTypes();
            int permittedFileTypesIndex = 1;
            String permittedFileTypesPrefix = prefix;
            for (String permittedFileTypesItem : permittedFileTypes) {
                prefix = permittedFileTypesPrefix + ".member." + permittedFileTypesIndex;
                if (permittedFileTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(permittedFileTypesItem));
                }
                permittedFileTypesIndex++;
            }
            prefix = permittedFileTypesPrefix;
        }
    }

    private static SolutionStackDescriptionStaxMarshaller instance;

    public static SolutionStackDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SolutionStackDescriptionStaxMarshaller();
        return instance;
    }
}
