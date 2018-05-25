/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate asynchronously.
 * <p>
 * Provides translation between English and one of six languages, or between one
 * of the six languages and English.
 * </p>
 **/
public interface AmazonTranslateAsync extends AmazonTranslate {
    /**
     * <p>
     * Translates input text from the source language to the target language.
     * You can translate between English (en) and one of the following
     * languages, or between one of the following languages and English.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * 
     * @param translateTextRequest
     * @return A Java Future object containing the response from the
     *         TranslateText service method, as returned by Amazon Translate.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws DetectedLanguageLowConfidenceException
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Translates input text from the source language to the target language.
     * You can translate between English (en) and one of the following
     * languages, or between one of the following languages and English.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Arabic (ar)
     * </p>
     * </li>
     * <li>
     * <p>
     * Chinese (Simplified) (zh)
     * </p>
     * </li>
     * <li>
     * <p>
     * French (fr)
     * </p>
     * </li>
     * <li>
     * <p>
     * German (de)
     * </p>
     * </li>
     * <li>
     * <p>
     * Portuguese (pt)
     * </p>
     * </li>
     * <li>
     * <p>
     * Spanish (es)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To have Amazon Translate determine the source language of your text, you
     * can specify <code>auto</code> in the <code>SourceLanguageCode</code>
     * field. If you specify <code>auto</code>, Amazon Translate will call
     * Amazon Comprehend to determine the source language.
     * </p>
     * 
     * @param translateTextRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         TranslateText service method, as returned by Amazon Translate.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws DetectedLanguageLowConfidenceException
     * @throws InternalServerException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TranslateTextResult> translateTextAsync(TranslateTextRequest translateTextRequest,
            AsyncHandler<TranslateTextRequest, TranslateTextResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
