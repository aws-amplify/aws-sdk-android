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
 * StAX marshaller for POJO User
 */
class UserStaxMarshaller {

    public void marshall(User _user, Request<?> request, String _prefix) {
        String prefix;
        if (_user.getPath() != null) {
            prefix = _prefix + "Path";
            String path = _user.getPath();
            request.addParameter(prefix, StringUtils.fromString(path));
        }
        if (_user.getUserName() != null) {
            prefix = _prefix + "UserName";
            String userName = _user.getUserName();
            request.addParameter(prefix, StringUtils.fromString(userName));
        }
        if (_user.getUserId() != null) {
            prefix = _prefix + "UserId";
            String userId = _user.getUserId();
            request.addParameter(prefix, StringUtils.fromString(userId));
        }
        if (_user.getArn() != null) {
            prefix = _prefix + "Arn";
            String arn = _user.getArn();
            request.addParameter(prefix, StringUtils.fromString(arn));
        }
        if (_user.getCreateDate() != null) {
            prefix = _prefix + "CreateDate";
            java.util.Date createDate = _user.getCreateDate();
            request.addParameter(prefix, StringUtils.fromDate(createDate));
        }
        if (_user.getPasswordLastUsed() != null) {
            prefix = _prefix + "PasswordLastUsed";
            java.util.Date passwordLastUsed = _user.getPasswordLastUsed();
            request.addParameter(prefix, StringUtils.fromDate(passwordLastUsed));
        }
        if (_user.getPermissionsBoundary() != null) {
            prefix = _prefix + "PermissionsBoundary";
            AttachedPermissionsBoundary permissionsBoundary = _user.getPermissionsBoundary();
            AttachedPermissionsBoundaryStaxMarshaller.getInstance().marshall(permissionsBoundary,
                    request, prefix + ".");
        }
        if (_user.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _user.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
    }

    private static UserStaxMarshaller instance;

    public static UserStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UserStaxMarshaller();
        return instance;
    }
}
