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

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourceChangeDetail
 */
class ResourceChangeDetailStaxMarshaller {

    public void marshall(ResourceChangeDetail _resourceChangeDetail, Request<?> request,
            String _prefix) {
        String prefix;
        if (_resourceChangeDetail.getTarget() != null) {
            prefix = _prefix + "Target";
            ResourceTargetDefinition target = _resourceChangeDetail.getTarget();
            ResourceTargetDefinitionStaxMarshaller.getInstance().marshall(target, request,
                    prefix + ".");
        }
        if (_resourceChangeDetail.getEvaluation() != null) {
            prefix = _prefix + "Evaluation";
            String evaluation = _resourceChangeDetail.getEvaluation();
            request.addParameter(prefix, StringUtils.fromString(evaluation));
        }
        if (_resourceChangeDetail.getChangeSource() != null) {
            prefix = _prefix + "ChangeSource";
            String changeSource = _resourceChangeDetail.getChangeSource();
            request.addParameter(prefix, StringUtils.fromString(changeSource));
        }
        if (_resourceChangeDetail.getCausingEntity() != null) {
            prefix = _prefix + "CausingEntity";
            String causingEntity = _resourceChangeDetail.getCausingEntity();
            request.addParameter(prefix, StringUtils.fromString(causingEntity));
        }
    }

    private static ResourceChangeDetailStaxMarshaller instance;

    public static ResourceChangeDetailStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeDetailStaxMarshaller();
        return instance;
    }
}
