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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Group
 */
class GroupStaxMarshaller {

    public void marshall(Group _group, Request<?> request, String _prefix) {
        String prefix;
        if (_group.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _group.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_group.getGroupName() != null) {
            prefix = _prefix + "GroupName";
            String groupName = _group.getGroupName();
            request.addParameter(prefix, StringUtils.fromString(groupName));
        }
        if (_group.getGroupId() != null) {
            prefix = _prefix + "GroupId";
            String groupId = _group.getGroupId();
            request.addParameter(prefix, StringUtils.fromString(groupId));
        }
        if (_group.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _group.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_group.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _group.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
    }

    private static GroupStaxMarshaller instance;

    public static GroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GroupStaxMarshaller();
        return instance;
    }
}
