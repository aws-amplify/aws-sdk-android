/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO BulkEmailDestination
 */
class BulkEmailDestinationStaxMarshaller {

    public void marshall(BulkEmailDestination _bulkEmailDestination, Request<?> request,
            String _prefix) {
        String prefix;
        if (_bulkEmailDestination.getDestination() != null) {
            prefix = _prefix + "Destination";
            Destination destination = _bulkEmailDestination.getDestination();
            DestinationStaxMarshaller.getInstance().marshall(destination, request, prefix + ".");
        }
        if (_bulkEmailDestination.getReplacementTags() != null) {
            prefix = _prefix + "ReplacementTags";
            java.util.List<MessageTag> replacementTags = _bulkEmailDestination.getReplacementTags();
            int replacementTagsIndex = 1;
            String replacementTagsPrefix = prefix;
            for (MessageTag replacementTagsItem : replacementTags) {
                prefix = replacementTagsPrefix + ".member." + replacementTagsIndex;
                if (replacementTagsItem != null) {
                    MessageTagStaxMarshaller.getInstance().marshall(replacementTagsItem, request,
                            prefix + ".");
                }
                replacementTagsIndex++;
            }
            prefix = replacementTagsPrefix;
        }
        if (_bulkEmailDestination.getReplacementTemplateData() != null) {
            prefix = _prefix + "ReplacementTemplateData";
            String replacementTemplateData = _bulkEmailDestination.getReplacementTemplateData();
            request.addParameter(prefix, StringUtils.fromString(replacementTemplateData));
        }
    }

    private static BulkEmailDestinationStaxMarshaller instance;

    public static BulkEmailDestinationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BulkEmailDestinationStaxMarshaller();
        return instance;
    }
}
