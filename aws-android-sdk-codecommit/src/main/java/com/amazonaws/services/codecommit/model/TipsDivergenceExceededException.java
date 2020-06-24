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

package com.amazonaws.services.codecommit.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The divergence between the tips of the provided commit specifiers is too
 * great to determine whether there might be any merge conflicts. Locally
 * compare the specifiers using <code>git diff</code> or a diff tool.
 * </p>
 */
public class TipsDivergenceExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TipsDivergenceExceededException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public TipsDivergenceExceededException(String message) {
        super(message);
    }
}
