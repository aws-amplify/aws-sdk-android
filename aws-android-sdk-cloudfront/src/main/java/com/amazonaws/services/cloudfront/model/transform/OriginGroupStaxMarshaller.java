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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OriginGroup
 */
class OriginGroupStaxMarshaller {

    public void marshall(OriginGroup _originGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_originGroup.getId() != null) {
            prefix = _prefix + "Id";
            String id = _originGroup.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_originGroup.getFailoverCriteria() != null) {
            prefix = _prefix + "FailoverCriteria";
            OriginGroupFailoverCriteria failoverCriteria = _originGroup.getFailoverCriteria();
            OriginGroupFailoverCriteriaStaxMarshaller.getInstance().marshall(failoverCriteria,
                    request, prefix + ".");
        }
        if (_originGroup.getMembers() != null) {
            prefix = _prefix + "Members";
            OriginGroupMembers members = _originGroup.getMembers();
            OriginGroupMembersStaxMarshaller.getInstance().marshall(members, request, prefix + ".");
        }
    }

    private static OriginGroupStaxMarshaller instance;

    public static OriginGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OriginGroupStaxMarshaller();
        return instance;
    }
}
