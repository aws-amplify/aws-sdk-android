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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Rule
 */
class RuleStaxMarshaller {

    public void marshall(Rule _rule, Request<?> request, String _prefix) {
        String prefix;
        if (_rule.getExpiration() != null) {
            prefix = _prefix + "Expiration";
            LifecycleExpiration expiration = _rule.getExpiration();
            LifecycleExpirationStaxMarshaller.getInstance().marshall(expiration, request,
                    prefix + ".");
        }
        if (_rule.getID() != null) {
            prefix = _prefix + "ID";
            String iD = _rule.getID();
            request.addParameter(prefix, StringUtils.fromString(iD));
        }
        if (_rule.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _rule.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_rule.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _rule.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_rule.getTransition() != null) {
            prefix = _prefix + "Transition";
            Transition transition = _rule.getTransition();
            TransitionStaxMarshaller.getInstance().marshall(transition, request, prefix + ".");
        }
        if (_rule.getNoncurrentVersionTransition() != null) {
            prefix = _prefix + "NoncurrentVersionTransition";
            NoncurrentVersionTransition noncurrentVersionTransition = _rule
                    .getNoncurrentVersionTransition();
            NoncurrentVersionTransitionStaxMarshaller.getInstance().marshall(
                    noncurrentVersionTransition, request, prefix + ".");
        }
        if (_rule.getNoncurrentVersionExpiration() != null) {
            prefix = _prefix + "NoncurrentVersionExpiration";
            NoncurrentVersionExpiration noncurrentVersionExpiration = _rule
                    .getNoncurrentVersionExpiration();
            NoncurrentVersionExpirationStaxMarshaller.getInstance().marshall(
                    noncurrentVersionExpiration, request, prefix + ".");
        }
        if (_rule.getAbortIncompleteMultipartUpload() != null) {
            prefix = _prefix + "AbortIncompleteMultipartUpload";
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload = _rule
                    .getAbortIncompleteMultipartUpload();
            AbortIncompleteMultipartUploadStaxMarshaller.getInstance().marshall(
                    abortIncompleteMultipartUpload, request, prefix + ".");
        }
    }

    private static RuleStaxMarshaller instance;

    public static RuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RuleStaxMarshaller();
        return instance;
    }
}
