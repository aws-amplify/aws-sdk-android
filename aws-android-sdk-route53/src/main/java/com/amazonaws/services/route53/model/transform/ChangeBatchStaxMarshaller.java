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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ChangeBatch
 */
class ChangeBatchStaxMarshaller {

    public void marshall(ChangeBatch _changeBatch, Request<?> request, String _prefix) {
        String prefix;
        if (_changeBatch.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _changeBatch.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
        if (_changeBatch.getChanges() != null) {
            prefix = _prefix + "Changes";
            java.util.List<Change> changes = _changeBatch.getChanges();
            int changesIndex = 1;
            String changesPrefix = prefix;
            for (Change changesItem : changes) {
                prefix = changesPrefix + "." + changesIndex;
                if (changesItem != null) {
                    ChangeStaxMarshaller.getInstance().marshall(changesItem, request, prefix + ".");
                }
                changesIndex++;
            }
            prefix = changesPrefix;
        }
    }

    private static ChangeBatchStaxMarshaller instance;

    public static ChangeBatchStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeBatchStaxMarshaller();
        return instance;
    }
}
