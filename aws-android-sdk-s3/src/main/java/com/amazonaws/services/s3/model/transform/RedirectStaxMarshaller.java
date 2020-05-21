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
 * StAX marshaller for POJO Redirect
 */
class RedirectStaxMarshaller {

    public void marshall(Redirect _redirect, Request<?> request, String _prefix) {
        String prefix;
        if (_redirect.getHostName() != null) {
            prefix = _prefix + "HostName";
            String hostName = _redirect.getHostName();
            request.addParameter(prefix, StringUtils.fromString(hostName));
        }
        if (_redirect.getHttpRedirectCode() != null) {
            prefix = _prefix + "HttpRedirectCode";
            String httpRedirectCode = _redirect.getHttpRedirectCode();
            request.addParameter(prefix, StringUtils.fromString(httpRedirectCode));
        }
        if (_redirect.getProtocol() != null) {
            prefix = _prefix + "Protocol";
            String protocol = _redirect.getProtocol();
            request.addParameter(prefix, StringUtils.fromString(protocol));
        }
        if (_redirect.getReplaceKeyPrefixWith() != null) {
            prefix = _prefix + "ReplaceKeyPrefixWith";
            String replaceKeyPrefixWith = _redirect.getReplaceKeyPrefixWith();
            request.addParameter(prefix, StringUtils.fromString(replaceKeyPrefixWith));
        }
        if (_redirect.getReplaceKeyWith() != null) {
            prefix = _prefix + "ReplaceKeyWith";
            String replaceKeyWith = _redirect.getReplaceKeyWith();
            request.addParameter(prefix, StringUtils.fromString(replaceKeyWith));
        }
    }

    private static RedirectStaxMarshaller instance;

    public static RedirectStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RedirectStaxMarshaller();
        return instance;
    }
}
