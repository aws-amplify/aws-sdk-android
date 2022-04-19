/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because the state of the specified resource is not
 * valid for this request.
 * </p>
 * <p>
 * For more information about how key state affects the use of a KMS key, see <a
 * href
 * ="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key
 * states of KMS keys</a> in the <i> <i>Key Management Service Developer
 * Guide</i> </i>.
 * </p>
 */
public class KMSInvalidStateException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KMSInvalidStateException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public KMSInvalidStateException(String message) {
        super(message);
    }
}
