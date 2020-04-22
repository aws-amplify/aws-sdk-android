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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HsmClientCertificate
 */
class HsmClientCertificateStaxMarshaller {

    public void marshall(HsmClientCertificate _hsmClientCertificate, Request<?> request,
            String _prefix) {
        String prefix;
        if (_hsmClientCertificate.getHsmClientCertificateIdentifier() != null) {
            prefix = _prefix + "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = _hsmClientCertificate
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }
        if (_hsmClientCertificate.getHsmClientCertificatePublicKey() != null) {
            prefix = _prefix + "HsmClientCertificatePublicKey";
            String hsmClientCertificatePublicKey = _hsmClientCertificate
                    .getHsmClientCertificatePublicKey();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificatePublicKey));
        }
        if (_hsmClientCertificate.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _hsmClientCertificate.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
    }

    private static HsmClientCertificateStaxMarshaller instance;

    public static HsmClientCertificateStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HsmClientCertificateStaxMarshaller();
        return instance;
    }
}
