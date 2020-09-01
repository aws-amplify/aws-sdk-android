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

package com.amazonaws.services.comprehend.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Amazon Comprehend can't process the language of the input text. For all
 * custom entity recognition APIs (such as <code>CreateEntityRecognizer</code>),
 * only English, Spanish, French, Italian, German, or Portuguese are accepted.
 * For most other APIs, such as those for Custom Classification, Amazon
 * Comprehend accepts text in all supported languages. For a list of supported
 * languages, see <a>supported-languages</a>.
 * </p>
 */
public class UnsupportedLanguageException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnsupportedLanguageException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public UnsupportedLanguageException(String message) {
        super(message);
    }
}
