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

package com.amazonaws.services.translate.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The confidence that Amazon Comprehend accurately detected the source language
 * is low. If a low confidence level is acceptable for your application, you can
 * use the language in the exception to call Amazon Translate again. For more
 * information, see the <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/API_DetectDominantLanguage.html"
 * >DetectDominantLanguage</a> operation in the <i>Amazon Comprehend Developer
 * Guide</i>.
 * </p>
 */
public class DetectedLanguageLowConfidenceException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The language code of the auto-detected language from Amazon Comprehend.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String detectedLanguageCode;

    /**
     * Constructs a new DetectedLanguageLowConfidenceException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public DetectedLanguageLowConfidenceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The language code of the auto-detected language from Amazon Comprehend.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code of the auto-detected language from Amazon
     *         Comprehend.
     *         </p>
     */
    public String getDetectedLanguageCode() {
        return detectedLanguageCode;
    }

    /**
     * <p>
     * The language code of the auto-detected language from Amazon Comprehend.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param detectedLanguageCode <p>
     *            The language code of the auto-detected language from Amazon
     *            Comprehend.
     *            </p>
     */
    public void setDetectedLanguageCode(String detectedLanguageCode) {
        this.detectedLanguageCode = detectedLanguageCode;
    }
}
