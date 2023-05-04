/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend asynchronously.
 * <p>
 * Amazon Comprehend is an Amazon Web Services service for gaining insight into
 * the content of documents. Use these actions to determine the topics contained
 * in your documents, the topics they discuss, the predominant sentiment
 * expressed in them, the predominant language used, and more.
 * </p>
 **/
public interface AmazonComprehendAsync extends AmazonComprehend {
    /**
     * <p>
     * Determines the dominant language of the input text for a batch of
     * documents. For a list of languages that Amazon Comprehend can detect, see
     * <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of
     * documents. For a list of languages that Amazon Comprehend can detect, see
     * <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectDominantLanguageResult> batchDetectDominantLanguageAsync(
            BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest,
            AsyncHandler<BatchDetectDominantLanguageRequest, BatchDetectDominantLanguageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns
     * information about them. For more information about named entities, see <a
     * href
     * ="https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html">
     * Entities</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(
            BatchDetectEntitiesRequest batchDetectEntitiesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns
     * information about them. For more information about named entities, see <a
     * href
     * ="https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html">
     * Entities</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectEntitiesResult> batchDetectEntitiesAsync(
            BatchDetectEntitiesRequest batchDetectEntitiesRequest,
            AsyncHandler<BatchDetectEntitiesRequest, BatchDetectEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(
            BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectKeyPhrasesResult> batchDetectKeyPhrasesAsync(
            BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest,
            AsyncHandler<BatchDetectKeyPhrasesRequest, BatchDetectKeyPhrasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing
     * sentiment, <code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectSentimentResult> batchDetectSentimentAsync(
            BatchDetectSentimentRequest batchDetectSentimentRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing
     * sentiment, <code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectSentimentResult> batchDetectSentimentAsync(
            BatchDetectSentimentRequest batchDetectSentimentRequest,
            AsyncHandler<BatchDetectSentimentRequest, BatchDetectSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of
     * speech of the words in the document and returns information about them.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html"
     * >Syntax</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectSyntax service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(
            BatchDetectSyntaxRequest batchDetectSyntaxRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of
     * speech of the words in the document and returns information about them.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html"
     * >Syntax</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectSyntax service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectSyntaxResult> batchDetectSyntaxAsync(
            BatchDetectSyntaxRequest batchDetectSyntaxRequest,
            AsyncHandler<BatchDetectSyntaxRequest, BatchDetectSyntaxResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects a batch of documents and returns a sentiment analysis for each
     * entity identified in the documents.
     * </p>
     * <p>
     * For more information about targeted sentiment, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
     * >Targeted sentiment</a>.
     * </p>
     * 
     * @param batchDetectTargetedSentimentRequest
     * @return A Java Future object containing the response from the
     *         BatchDetectTargetedSentiment service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectTargetedSentimentResult> batchDetectTargetedSentimentAsync(
            BatchDetectTargetedSentimentRequest batchDetectTargetedSentimentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects a batch of documents and returns a sentiment analysis for each
     * entity identified in the documents.
     * </p>
     * <p>
     * For more information about targeted sentiment, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
     * >Targeted sentiment</a>.
     * </p>
     * 
     * @param batchDetectTargetedSentimentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         BatchDetectTargetedSentiment service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws BatchSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<BatchDetectTargetedSentimentResult> batchDetectTargetedSentimentAsync(
            BatchDetectTargetedSentimentRequest batchDetectTargetedSentimentRequest,
            AsyncHandler<BatchDetectTargetedSentimentRequest, BatchDetectTargetedSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new document classification request to analyze a single
     * document in real-time, using a previously created and trained custom
     * model and an endpoint.
     * </p>
     * <p>
     * You can input plain text or you can upload a single-page input document
     * (text, PDF, Word, or image).
     * </p>
     * <p>
     * If the system detects errors while processing a page in the input
     * document, the API response includes an entry in <code>Errors</code> that
     * describes the errors.
     * </p>
     * <p>
     * If the system detects a document-level error in your input document, the
     * API returns an <code>InvalidRequestException</code> error response. For
     * details about this exception, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html"
     * > Errors in semi-structured documents</a> in the Comprehend Developer
     * Guide.
     * </p>
     * 
     * @param classifyDocumentRequest
     * @return A Java Future object containing the response from the
     *         ClassifyDocument service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ClassifyDocumentResult> classifyDocumentAsync(
            ClassifyDocumentRequest classifyDocumentRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new document classification request to analyze a single
     * document in real-time, using a previously created and trained custom
     * model and an endpoint.
     * </p>
     * <p>
     * You can input plain text or you can upload a single-page input document
     * (text, PDF, Word, or image).
     * </p>
     * <p>
     * If the system detects errors while processing a page in the input
     * document, the API response includes an entry in <code>Errors</code> that
     * describes the errors.
     * </p>
     * <p>
     * If the system detects a document-level error in your input document, the
     * API returns an <code>InvalidRequestException</code> error response. For
     * details about this exception, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html"
     * > Errors in semi-structured documents</a> in the Comprehend Developer
     * Guide.
     * </p>
     * 
     * @param classifyDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ClassifyDocument service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ClassifyDocumentResult> classifyDocumentAsync(
            ClassifyDocumentRequest classifyDocumentRequest,
            AsyncHandler<ClassifyDocumentRequest, ClassifyDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Analyzes input text for the presence of personally identifiable
     * information (PII) and returns the labels of identified PII entity types
     * such as name, address, bank account number, or phone number.
     * </p>
     * 
     * @param containsPiiEntitiesRequest
     * @return A Java Future object containing the response from the
     *         ContainsPiiEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ContainsPiiEntitiesResult> containsPiiEntitiesAsync(
            ContainsPiiEntitiesRequest containsPiiEntitiesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Analyzes input text for the presence of personally identifiable
     * information (PII) and returns the labels of identified PII entity types
     * such as name, address, bank account number, or phone number.
     * </p>
     * 
     * @param containsPiiEntitiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ContainsPiiEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ContainsPiiEntitiesResult> containsPiiEntitiesAsync(
            ContainsPiiEntitiesRequest containsPiiEntitiesRequest,
            AsyncHandler<ContainsPiiEntitiesRequest, ContainsPiiEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a dataset to upload training or test data for a model associated
     * with a flywheel. For more information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future object containing the response from the
     *         CreateDataset service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a dataset to upload training or test data for a model associated
     * with a flywheel. For more information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateDataset service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize
     * documents. To create a classifier, you provide a set of training
     * documents that are labeled with the categories that you want to use. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/training-classifier-model.html"
     * >Training classifier models</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         CreateDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(
            CreateDocumentClassifierRequest createDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize
     * documents. To create a classifier, you provide a set of training
     * documents that are labeled with the categories that you want to use. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/training-classifier-model.html"
     * >Training classifier models</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateDocumentClassifierResult> createDocumentClassifierAsync(
            CreateDocumentClassifierRequest createDocumentClassifierRequest,
            AsyncHandler<CreateDocumentClassifierRequest, CreateDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a model-specific endpoint for synchronous inference for a
     * previously trained custom model For information about endpoints, see <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return A Java Future object containing the response from the
     *         CreateEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a model-specific endpoint for synchronous inference for a
     * previously trained custom model For information about endpoints, see <a
     * href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param createEndpointRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your
     * <code>CreateEntityRecognizer</code> request is submitted, you can check
     * job status using the <code>DescribeEntityRecognizer</code> API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         CreateEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(
            CreateEntityRecognizerRequest createEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your
     * <code>CreateEntityRecognizer</code> request is submitted, you can check
     * job status using the <code>DescribeEntityRecognizer</code> API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateEntityRecognizerResult> createEntityRecognizerAsync(
            CreateEntityRecognizerRequest createEntityRecognizerRequest,
            AsyncHandler<CreateEntityRecognizerRequest, CreateEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A flywheel is an Amazon Web Services resource that orchestrates the
     * ongoing training of a model for custom classification or custom entity
     * recognition. You can create a flywheel to start with an existing trained
     * model, or Comprehend can create and train a new model.
     * </p>
     * <p>
     * When you create the flywheel, Comprehend creates a data lake in your
     * account. The data lake holds the training data and test data for all
     * versions of the model.
     * </p>
     * <p>
     * To use a flywheel with an existing trained model, you specify the active
     * model version. Comprehend copies the model's training data and test data
     * into the flywheel's data lake.
     * </p>
     * <p>
     * To use the flywheel with a new model, you need to provide a dataset for
     * training data (and optional test data) when you create the flywheel.
     * </p>
     * <p>
     * For more information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param createFlywheelRequest
     * @return A Java Future object containing the response from the
     *         CreateFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateFlywheelResult> createFlywheelAsync(CreateFlywheelRequest createFlywheelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A flywheel is an Amazon Web Services resource that orchestrates the
     * ongoing training of a model for custom classification or custom entity
     * recognition. You can create a flywheel to start with an existing trained
     * model, or Comprehend can create and train a new model.
     * </p>
     * <p>
     * When you create the flywheel, Comprehend creates a data lake in your
     * account. The data lake holds the training data and test data for all
     * versions of the model.
     * </p>
     * <p>
     * To use a flywheel with an existing trained model, you specify the active
     * model version. Comprehend copies the model's training data and test data
     * into the flywheel's data lake.
     * </p>
     * <p>
     * To use the flywheel with a new model, you need to provide a dataset for
     * training data (and optional test data) when you create the flywheel.
     * </p>
     * <p>
     * For more information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param createFlywheelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws KmsKeyValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateFlywheelResult> createFlywheelAsync(CreateFlywheelRequest createFlywheelRequest,
            AsyncHandler<CreateFlywheelRequest, CreateFlywheelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * classifier disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DeleteDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(
            DeleteDocumentClassifierRequest deleteDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * classifier disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteDocumentClassifierResult> deleteDocumentClassifierAsync(
            DeleteDocumentClassifierRequest deleteDocumentClassifierRequest,
            AsyncHandler<DeleteDocumentClassifierRequest, DeleteDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a model-specific endpoint for a previously-trained custom model.
     * All endpoints must be deleted in order for the model to be deleted. For
     * information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a model-specific endpoint for a previously-trained custom model.
     * All endpoints must be deleted in order for the model to be deleted. For
     * information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * recognizer disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DeleteEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(
            DeleteEntityRecognizerRequest deleteEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED)
     * will be deleted. If an active inference job is using the model, a
     * <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING
     * state, and it is then removed by a background job. Once removed, the
     * recognizer disappears from your account and is no longer available for
     * use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteEntityRecognizerResult> deleteEntityRecognizerAsync(
            DeleteEntityRecognizerRequest deleteEntityRecognizerRequest,
            AsyncHandler<DeleteEntityRecognizerRequest, DeleteEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a flywheel. When you delete the flywheel, Amazon Comprehend does
     * not delete the data lake or the model associated with the flywheel.
     * </p>
     * <p>
     * For more information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param deleteFlywheelRequest
     * @return A Java Future object containing the response from the
     *         DeleteFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteFlywheelResult> deleteFlywheelAsync(DeleteFlywheelRequest deleteFlywheelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a flywheel. When you delete the flywheel, Amazon Comprehend does
     * not delete the data lake or the model associated with the flywheel.
     * </p>
     * <p>
     * For more information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param deleteFlywheelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteFlywheelResult> deleteFlywheelAsync(DeleteFlywheelRequest deleteFlywheelRequest,
            AsyncHandler<DeleteFlywheelRequest, DeleteFlywheelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a resource-based policy that is attached to a custom model.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future object containing the response from the
     *         DeleteResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a resource-based policy that is attached to a custom model.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(
            DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the dataset that you specify. For more
     * information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the dataset that you specify. For more
     * information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDataset service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDatasetResult> describeDatasetAsync(
            DescribeDatasetRequest describeDatasetRequest,
            AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use
     * this operation to get the status of a classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use
     * this operation to get the status of a classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDocumentClassificationJobResult> describeDocumentClassificationJobAsync(
            DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest,
            AsyncHandler<DescribeDocumentClassificationJobRequest, DescribeDocumentClassificationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(
            DescribeDocumentClassifierRequest describeDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDocumentClassifier service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDocumentClassifierResult> describeDocumentClassifierAsync(
            DescribeDocumentClassifierRequest describeDocumentClassifierRequest,
            AsyncHandler<DescribeDocumentClassifierRequest, DescribeDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job.
     * Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeDominantLanguageDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job.
     * Use this operation to get the status of a detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeDominantLanguageDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeDominantLanguageDetectionJobResult> describeDominantLanguageDetectionJobAsync(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest,
            AsyncHandler<DescribeDominantLanguageDetectionJobRequest, DescribeDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a specific endpoint. Use this
     * operation to get the status of an endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return A Java Future object containing the response from the
     *         DescribeEndpoint service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest describeEndpointRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a specific endpoint. Use this
     * operation to get the status of an endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param describeEndpointRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEndpoint service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEndpointResult> describeEndpointAsync(
            DescribeEndpointRequest describeEndpointRequest,
            AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEntitiesDetectionJobResult> describeEntitiesDetectionJobAsync(
            DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest,
            AsyncHandler<DescribeEntitiesDetectionJobRequest, DescribeEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets
     * containing training data, recognizer metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         DescribeEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(
            DescribeEntityRecognizerRequest describeEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets
     * containing training data, recognizer metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEntityRecognizer service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEntityRecognizerResult> describeEntityRecognizerAsync(
            DescribeEntityRecognizerRequest describeEntityRecognizerRequest,
            AsyncHandler<DescribeEntityRecognizerRequest, DescribeEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the status and details of an events detection job.
     * </p>
     * 
     * @param describeEventsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEventsDetectionJobResult> describeEventsDetectionJobAsync(
            DescribeEventsDetectionJobRequest describeEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the status and details of an events detection job.
     * </p>
     * 
     * @param describeEventsDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeEventsDetectionJobResult> describeEventsDetectionJobAsync(
            DescribeEventsDetectionJobRequest describeEventsDetectionJobRequest,
            AsyncHandler<DescribeEventsDetectionJobRequest, DescribeEventsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides configuration information about the flywheel. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeFlywheelRequest
     * @return A Java Future object containing the response from the
     *         DescribeFlywheel service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeFlywheelResult> describeFlywheelAsync(
            DescribeFlywheelRequest describeFlywheelRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides configuration information about the flywheel. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeFlywheelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeFlywheel service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeFlywheelResult> describeFlywheelAsync(
            DescribeFlywheelRequest describeFlywheelRequest,
            AsyncHandler<DescribeFlywheelRequest, DescribeFlywheelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieve the configuration properties of a flywheel iteration. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeFlywheelIterationRequest
     * @return A Java Future object containing the response from the
     *         DescribeFlywheelIteration service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeFlywheelIterationResult> describeFlywheelIterationAsync(
            DescribeFlywheelIterationRequest describeFlywheelIterationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieve the configuration properties of a flywheel iteration. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param describeFlywheelIterationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeFlywheelIteration service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeFlywheelIterationResult> describeFlywheelIterationAsync(
            DescribeFlywheelIterationRequest describeFlywheelIterationRequest,
            AsyncHandler<DescribeFlywheelIterationRequest, DescribeFlywheelIterationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeKeyPhrasesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeKeyPhrasesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeKeyPhrasesDetectionJobResult> describeKeyPhrasesDetectionJobAsync(
            DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest,
            AsyncHandler<DescribeKeyPhrasesDetectionJobRequest, DescribeKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a PII entities detection job. For
     * example, you can use this operation to get the job status.
     * </p>
     * 
     * @param describePiiEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribePiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePiiEntitiesDetectionJobResult> describePiiEntitiesDetectionJobAsync(
            DescribePiiEntitiesDetectionJobRequest describePiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a PII entities detection job. For
     * example, you can use this operation to get the job status.
     * </p>
     * 
     * @param describePiiEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribePiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribePiiEntitiesDetectionJobResult> describePiiEntitiesDetectionJobAsync(
            DescribePiiEntitiesDetectionJobRequest describePiiEntitiesDetectionJobRequest,
            AsyncHandler<DescribePiiEntitiesDetectionJobRequest, DescribePiiEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the details of a resource-based policy that is attached to a custom
     * model, including the JSON body of the policy.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return A Java Future object containing the response from the
     *         DescribeResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(
            DescribeResourcePolicyRequest describeResourcePolicyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the details of a resource-based policy that is attached to a custom
     * model, including the JSON body of the policy.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(
            DescribeResourcePolicyRequest describeResourcePolicyRequest,
            AsyncHandler<DescribeResourcePolicyRequest, DescribeResourcePolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeSentimentDetectionJobResult> describeSentimentDetectionJobAsync(
            DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest,
            AsyncHandler<DescribeSentimentDetectionJobRequest, DescribeSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a targeted sentiment detection job.
     * Use this operation to get the status of the job.
     * </p>
     * 
     * @param describeTargetedSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeTargetedSentimentDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTargetedSentimentDetectionJobResult> describeTargetedSentimentDetectionJobAsync(
            DescribeTargetedSentimentDetectionJobRequest describeTargetedSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a targeted sentiment detection job.
     * Use this operation to get the status of the job.
     * </p>
     * 
     * @param describeTargetedSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTargetedSentimentDetectionJob service method, as returned
     *         by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTargetedSentimentDetectionJobResult> describeTargetedSentimentDetectionJobAsync(
            DescribeTargetedSentimentDetectionJobRequest describeTargetedSentimentDetectionJobRequest,
            AsyncHandler<DescribeTargetedSentimentDetectionJobRequest, DescribeTargetedSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this
     * operation to get the status of a detection job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTopicsDetectionJobResult> describeTopicsDetectionJobAsync(
            DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest,
            AsyncHandler<DescribeTopicsDetectionJobRequest, DescribeTopicsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of
     * languages that Amazon Comprehend can detect, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return A Java Future object containing the response from the
     *         DetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectDominantLanguageResult> detectDominantLanguageAsync(
            DetectDominantLanguageRequest detectDominantLanguageRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of
     * languages that Amazon Comprehend can detect, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
     * >Amazon Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectDominantLanguage service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectDominantLanguageResult> detectDominantLanguageAsync(
            DetectDominantLanguageRequest detectDominantLanguageRequest,
            AsyncHandler<DetectDominantLanguageRequest, DetectDominantLanguageResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detects named entities in input text when you use the pre-trained model.
     * Detects custom entities if you have a custom entity recognition model.
     * </p>
     * <p>
     * When detecting named entities using the pre-trained model, use plain text
     * as the input. For more information about named entities, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * When you use a custom entity recognition model, you can input plain text
     * or you can upload a single-page input document (text, PDF, Word, or
     * image).
     * </p>
     * <p>
     * If the system detects errors while processing a page in the input
     * document, the API response includes an entry in <code>Errors</code> for
     * each error.
     * </p>
     * <p>
     * If the system detects a document-level error in your input document, the
     * API returns an <code>InvalidRequestException</code> error response. For
     * details about this exception, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html"
     * > Errors in semi-structured documents</a> in the Comprehend Developer
     * Guide.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return A Java Future object containing the response from the
     *         DetectEntities service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detects named entities in input text when you use the pre-trained model.
     * Detects custom entities if you have a custom entity recognition model.
     * </p>
     * <p>
     * When detecting named entities using the pre-trained model, use plain text
     * as the input. For more information about named entities, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-entities.html"
     * >Entities</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * When you use a custom entity recognition model, you can input plain text
     * or you can upload a single-page input document (text, PDF, Word, or
     * image).
     * </p>
     * <p>
     * If the system detects errors while processing a page in the input
     * document, the API response includes an entry in <code>Errors</code> for
     * each error.
     * </p>
     * <p>
     * If the system detects a document-level error in your input document, the
     * API returns an <code>InvalidRequestException</code> error response. For
     * details about this exception, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync-err.html"
     * > Errors in semi-structured documents</a> in the Comprehend Developer
     * Guide.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectEntities service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceUnavailableException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest detectEntitiesRequest,
            AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return A Java Future object containing the response from the
     *         DetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(
            DetectKeyPhrasesRequest detectKeyPhrasesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectKeyPhrases service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectKeyPhrasesResult> detectKeyPhrasesAsync(
            DetectKeyPhrasesRequest detectKeyPhrasesRequest,
            AsyncHandler<DetectKeyPhrasesRequest, DetectKeyPhrasesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects the input text for entities that contain personally identifiable
     * information (PII) and returns information about them.
     * </p>
     * 
     * @param detectPiiEntitiesRequest
     * @return A Java Future object containing the response from the
     *         DetectPiiEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectPiiEntitiesResult> detectPiiEntitiesAsync(
            DetectPiiEntitiesRequest detectPiiEntitiesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Inspects the input text for entities that contain personally identifiable
     * information (PII) and returns information about them.
     * </p>
     * 
     * @param detectPiiEntitiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectPiiEntities service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectPiiEntitiesResult> detectPiiEntitiesAsync(
            DetectPiiEntitiesRequest detectPiiEntitiesRequest,
            AsyncHandler<DetectPiiEntitiesRequest, DetectPiiEntitiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (
     * <code>POSITIVE</code>, <code>NEUTRAL</code>, <code>MIXED</code>, or
     * <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return A Java Future object containing the response from the
     *         DetectSentiment service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectSentimentResult> detectSentimentAsync(DetectSentimentRequest detectSentimentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (
     * <code>POSITIVE</code>, <code>NEUTRAL</code>, <code>MIXED</code>, or
     * <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectSentiment service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectSentimentResult> detectSentimentAsync(
            DetectSentimentRequest detectSentimentRequest,
            AsyncHandler<DetectSentimentRequest, DetectSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html"
     * >Syntax</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return A Java Future object containing the response from the
     *         DetectSyntax service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest detectSyntaxRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-syntax.html"
     * >Syntax</a> in the Comprehend Developer Guide.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectSyntax service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectSyntaxResult> detectSyntaxAsync(DetectSyntaxRequest detectSyntaxRequest,
            AsyncHandler<DetectSyntaxRequest, DetectSyntaxResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects the input text and returns a sentiment analysis for each entity
     * identified in the text.
     * </p>
     * <p>
     * For more information about targeted sentiment, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
     * >Targeted sentiment</a>.
     * </p>
     * 
     * @param detectTargetedSentimentRequest
     * @return A Java Future object containing the response from the
     *         DetectTargetedSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectTargetedSentimentResult> detectTargetedSentimentAsync(
            DetectTargetedSentimentRequest detectTargetedSentimentRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Inspects the input text and returns a sentiment analysis for each entity
     * identified in the text.
     * </p>
     * <p>
     * For more information about targeted sentiment, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html"
     * >Targeted sentiment</a>.
     * </p>
     * 
     * @param detectTargetedSentimentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DetectTargetedSentiment service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TextSizeLimitExceededException
     * @throws UnsupportedLanguageException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DetectTargetedSentimentResult> detectTargetedSentimentAsync(
            DetectTargetedSentimentRequest detectTargetedSentimentRequest,
            AsyncHandler<DetectTargetedSentimentRequest, DetectTargetedSentimentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom model that replicates a source custom model that you
     * import. The source model can be in your Amazon Web Services account or
     * another one.
     * </p>
     * <p>
     * If the source model is in another Amazon Web Services account, then it
     * must have a resource-based policy that authorizes you to import it.
     * </p>
     * <p>
     * The source model must be in the same Amazon Web Services Region that
     * you're using when you import. You can't import a model that's in a
     * different Region.
     * </p>
     * 
     * @param importModelRequest
     * @return A Java Future object containing the response from the ImportModel
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ResourceUnavailableException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ImportModelResult> importModelAsync(ImportModelRequest importModelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom model that replicates a source custom model that you
     * import. The source model can be in your Amazon Web Services account or
     * another one.
     * </p>
     * <p>
     * If the source model is in another Amazon Web Services account, then it
     * must have a resource-based policy that authorizes you to import it.
     * </p>
     * <p>
     * The source model must be in the same Amazon Web Services Region that
     * you're using when you import. You can't import a model that's in a
     * different Region.
     * </p>
     * 
     * @param importModelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the ImportModel
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ResourceUnavailableException
     * @throws TooManyTagsException
     * @throws TooManyRequestsException
     * @throws ResourceLimitExceededException
     * @throws KmsKeyValidationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ImportModelResult> importModelAsync(ImportModelRequest importModelRequest,
            AsyncHandler<ImportModelRequest, ImportModelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List the datasets that you have configured in this Region. For more
     * information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List the datasets that you have configured in this Region. For more
     * information about datasets, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDatasets service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassificationJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(
            ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDocumentClassificationJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassificationJobsResult> listDocumentClassificationJobsAsync(
            ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest,
            AsyncHandler<ListDocumentClassificationJobsRequest, ListDocumentClassificationJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of summaries of the document classifiers that you have
     * created
     * </p>
     * 
     * @param listDocumentClassifierSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifierSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassifierSummariesResult> listDocumentClassifierSummariesAsync(
            ListDocumentClassifierSummariesRequest listDocumentClassifierSummariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of summaries of the document classifiers that you have
     * created
     * </p>
     * 
     * @param listDocumentClassifierSummariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifierSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassifierSummariesResult> listDocumentClassifierSummariesAsync(
            ListDocumentClassifierSummariesRequest listDocumentClassifierSummariesRequest,
            AsyncHandler<ListDocumentClassifierSummariesRequest, ListDocumentClassifierSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifiers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(
            ListDocumentClassifiersRequest listDocumentClassifiersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDocumentClassifiers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDocumentClassifiersResult> listDocumentClassifiersAsync(
            ListDocumentClassifiersRequest listDocumentClassifiersRequest,
            AsyncHandler<ListDocumentClassifiersRequest, ListDocumentClassifiersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListDominantLanguageDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have
     * submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListDominantLanguageDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListDominantLanguageDetectionJobsResult> listDominantLanguageDetectionJobsAsync(
            ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest,
            AsyncHandler<ListDominantLanguageDetectionJobsRequest, ListDominantLanguageDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of all existing endpoints that you've created. For
     * information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return A Java Future object containing the response from the
     *         ListEndpoints service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of all existing endpoints that you've created. For
     * information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param listEndpointsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEndpoints service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest,
            AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListEntitiesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEntitiesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntitiesDetectionJobsResult> listEntitiesDetectionJobsAsync(
            ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest,
            AsyncHandler<ListEntitiesDetectionJobsRequest, ListEntitiesDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of summaries for the entity recognizers that you have
     * created.
     * </p>
     * 
     * @param listEntityRecognizerSummariesRequest
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizerSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntityRecognizerSummariesResult> listEntityRecognizerSummariesAsync(
            ListEntityRecognizerSummariesRequest listEntityRecognizerSummariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of summaries for the entity recognizers that you have
     * created.
     * </p>
     * 
     * @param listEntityRecognizerSummariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizerSummaries service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntityRecognizerSummariesResult> listEntityRecognizerSummariesAsync(
            ListEntityRecognizerSummariesRequest listEntityRecognizerSummariesRequest,
            AsyncHandler<ListEntityRecognizerSummariesRequest, ListEntityRecognizerSummariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created,
     * including recognizers currently in training. Allows you to filter the
     * list of recognizers based on criteria such as status and submission time.
     * This call returns up to 500 entity recognizers in the list, with a
     * default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the
     * list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntityRecognizersResult> listEntityRecognizersAsync(
            ListEntityRecognizersRequest listEntityRecognizersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created,
     * including recognizers currently in training. Allows you to filter the
     * list of recognizers based on criteria such as status and submission time.
     * This call returns up to 500 entity recognizers in the list, with a
     * default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the
     * list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEntityRecognizers service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEntityRecognizersResult> listEntityRecognizersAsync(
            ListEntityRecognizersRequest listEntityRecognizersRequest,
            AsyncHandler<ListEntityRecognizersRequest, ListEntityRecognizersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the events detection jobs that you have submitted.
     * </p>
     * 
     * @param listEventsDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListEventsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEventsDetectionJobsResult> listEventsDetectionJobsAsync(
            ListEventsDetectionJobsRequest listEventsDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the events detection jobs that you have submitted.
     * </p>
     * 
     * @param listEventsDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListEventsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListEventsDetectionJobsResult> listEventsDetectionJobsAsync(
            ListEventsDetectionJobsRequest listEventsDetectionJobsRequest,
            AsyncHandler<ListEventsDetectionJobsRequest, ListEventsDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Information about the history of a flywheel iteration. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param listFlywheelIterationHistoryRequest
     * @return A Java Future object containing the response from the
     *         ListFlywheelIterationHistory service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListFlywheelIterationHistoryResult> listFlywheelIterationHistoryAsync(
            ListFlywheelIterationHistoryRequest listFlywheelIterationHistoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Information about the history of a flywheel iteration. For more
     * information about flywheels, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param listFlywheelIterationHistoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListFlywheelIterationHistory service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListFlywheelIterationHistoryResult> listFlywheelIterationHistoryAsync(
            ListFlywheelIterationHistoryRequest listFlywheelIterationHistoryRequest,
            AsyncHandler<ListFlywheelIterationHistoryRequest, ListFlywheelIterationHistoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the flywheels that you have created.
     * </p>
     * 
     * @param listFlywheelsRequest
     * @return A Java Future object containing the response from the
     *         ListFlywheels service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListFlywheelsResult> listFlywheelsAsync(ListFlywheelsRequest listFlywheelsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the flywheels that you have created.
     * </p>
     * 
     * @param listFlywheelsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListFlywheels service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListFlywheelsResult> listFlywheelsAsync(ListFlywheelsRequest listFlywheelsRequest,
            AsyncHandler<ListFlywheelsRequest, ListFlywheelsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListKeyPhrasesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListKeyPhrasesDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListKeyPhrasesDetectionJobsResult> listKeyPhrasesDetectionJobsAsync(
            ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest,
            AsyncHandler<ListKeyPhrasesDetectionJobsRequest, ListKeyPhrasesDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the PII entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listPiiEntitiesDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListPiiEntitiesDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPiiEntitiesDetectionJobsResult> listPiiEntitiesDetectionJobsAsync(
            ListPiiEntitiesDetectionJobsRequest listPiiEntitiesDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the PII entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listPiiEntitiesDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListPiiEntitiesDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListPiiEntitiesDetectionJobsResult> listPiiEntitiesDetectionJobsAsync(
            ListPiiEntitiesDetectionJobsRequest listPiiEntitiesDetectionJobsRequest,
            AsyncHandler<ListPiiEntitiesDetectionJobsRequest, ListPiiEntitiesDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListSentimentDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListSentimentDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListSentimentDetectionJobsResult> listSentimentDetectionJobsAsync(
            ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest,
            AsyncHandler<ListSentimentDetectionJobsRequest, ListSentimentDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given Amazon Comprehend resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given Amazon Comprehend resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of targeted sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listTargetedSentimentDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTargetedSentimentDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTargetedSentimentDetectionJobsResult> listTargetedSentimentDetectionJobsAsync(
            ListTargetedSentimentDetectionJobsRequest listTargetedSentimentDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of targeted sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listTargetedSentimentDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTargetedSentimentDetectionJobs service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTargetedSentimentDetectionJobsResult> listTargetedSentimentDetectionJobsAsync(
            ListTargetedSentimentDetectionJobsRequest listTargetedSentimentDetectionJobsRequest,
            AsyncHandler<ListTargetedSentimentDetectionJobsRequest, ListTargetedSentimentDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTopicsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(
            ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTopicsDetectionJobs service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTopicsDetectionJobsResult> listTopicsDetectionJobsAsync(
            ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest,
            AsyncHandler<ListTopicsDetectionJobsRequest, ListTopicsDetectionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a resource-based policy to a custom model. You can use this
     * policy to authorize an entity in another Amazon Web Services account to
     * import the custom model, which replicates it in Amazon Comprehend in
     * their account.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future object containing the response from the
     *         PutResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutResourcePolicyResult> putResourcePolicyAsync(
            PutResourcePolicyRequest putResourcePolicyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Attaches a resource-based policy to a custom model. You can use this
     * policy to authorize an entity in another Amazon Web Services account to
     * import the custom model, which replicates it in Amazon Comprehend in
     * their account.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         PutResourcePolicy service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<PutResourcePolicyResult> putResourcePolicyAsync(
            PutResourcePolicyRequest putResourcePolicyRequest,
            AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the
     * <code>DescribeDocumentClassificationJob</code> operation to track the
     * progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return A Java Future object containing the response from the
     *         StartDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(
            StartDocumentClassificationJobRequest startDocumentClassificationJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the
     * <code>DescribeDocumentClassificationJob</code> operation to track the
     * progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartDocumentClassificationJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartDocumentClassificationJobResult> startDocumentClassificationJobAsync(
            StartDocumentClassificationJobRequest startDocumentClassificationJobRequest,
            AsyncHandler<StartDocumentClassificationJobRequest, StartDocumentClassificationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection
     * of documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection
     * of documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartDominantLanguageDetectionJobResult> startDominantLanguageDetectionJobAsync(
            StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest,
            AsyncHandler<StartDominantLanguageDetectionJobRequest, StartDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom
     * entity recognition. In order to be used for custom entity recognition,
     * the optional <code>EntityRecognizerArn</code> must be used in order to
     * provide access to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom
     * entity recognition. In order to be used for custom entity recognition,
     * the optional <code>EntityRecognizerArn</code> must be used in order to
     * provide access to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartEntitiesDetectionJobResult> startEntitiesDetectionJobAsync(
            StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest,
            AsyncHandler<StartEntitiesDetectionJobRequest, StartEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous event detection job for a collection of documents.
     * </p>
     * 
     * @param startEventsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartEventsDetectionJobResult> startEventsDetectionJobAsync(
            StartEventsDetectionJobRequest startEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous event detection job for a collection of documents.
     * </p>
     * 
     * @param startEventsDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartEventsDetectionJobResult> startEventsDetectionJobAsync(
            StartEventsDetectionJobRequest startEventsDetectionJobRequest,
            AsyncHandler<StartEventsDetectionJobRequest, StartEventsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Start the flywheel iteration.This operation uses any new datasets to
     * train a new model version. For more information about flywheels, see <a
     * href
     * ="https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param startFlywheelIterationRequest
     * @return A Java Future object containing the response from the
     *         StartFlywheelIteration service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartFlywheelIterationResult> startFlywheelIterationAsync(
            StartFlywheelIterationRequest startFlywheelIterationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Start the flywheel iteration.This operation uses any new datasets to
     * train a new model version. For more information about flywheels, see <a
     * href
     * ="https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
     * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
     * </p>
     * 
     * @param startFlywheelIterationRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartFlywheelIteration service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartFlywheelIterationResult> startFlywheelIterationAsync(
            StartFlywheelIterationRequest startFlywheelIterationRequest,
            AsyncHandler<StartFlywheelIterationRequest, StartFlywheelIterationResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartKeyPhrasesDetectionJobResult> startKeyPhrasesDetectionJobAsync(
            StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest,
            AsyncHandler<StartKeyPhrasesDetectionJobRequest, StartKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous PII entity detection job for a collection of
     * documents.
     * </p>
     * 
     * @param startPiiEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartPiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartPiiEntitiesDetectionJobResult> startPiiEntitiesDetectionJobAsync(
            StartPiiEntitiesDetectionJobRequest startPiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous PII entity detection job for a collection of
     * documents.
     * </p>
     * 
     * @param startPiiEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartPiiEntitiesDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartPiiEntitiesDetectionJobResult> startPiiEntitiesDetectionJobAsync(
            StartPiiEntitiesDetectionJobRequest startPiiEntitiesDetectionJobRequest,
            AsyncHandler<StartPiiEntitiesDetectionJobRequest, StartPiiEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            StartSentimentDetectionJobRequest startSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of
     * documents. Use the operation to track the status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartSentimentDetectionJobResult> startSentimentDetectionJobAsync(
            StartSentimentDetectionJobRequest startSentimentDetectionJobRequest,
            AsyncHandler<StartSentimentDetectionJobRequest, StartSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous targeted sentiment detection job for a collection
     * of documents. Use the <code>DescribeTargetedSentimentDetectionJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startTargetedSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTargetedSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTargetedSentimentDetectionJobResult> startTargetedSentimentDetectionJobAsync(
            StartTargetedSentimentDetectionJobRequest startTargetedSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous targeted sentiment detection job for a collection
     * of documents. Use the <code>DescribeTargetedSentimentDetectionJob</code>
     * operation to track the status of a job.
     * </p>
     * 
     * @param startTargetedSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartTargetedSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTargetedSentimentDetectionJobResult> startTargetedSentimentDetectionJobAsync(
            StartTargetedSentimentDetectionJobRequest startTargetedSentimentDetectionJobRequest,
            AsyncHandler<StartTargetedSentimentDetectionJobRequest, StartTargetedSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the
     * <code>DescribeTopicDetectionJob</code> operation to track the status of a
     * job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(
            StartTopicsDetectionJobRequest startTopicsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the
     * <code>DescribeTopicDetectionJob</code> operation to track the status of a
     * job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartTopicsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws TooManyTagsException
     * @throws ResourceInUseException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTopicsDetectionJobResult> startTopicsDetectionJobAsync(
            StartTopicsDetectionJobRequest startTopicsDetectionJobRequest,
            AsyncHandler<StartTopicsDetectionJobRequest, StartTopicsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopDominantLanguageDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopDominantLanguageDetectionJobResult> stopDominantLanguageDetectionJobAsync(
            StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest,
            AsyncHandler<StopDominantLanguageDetectionJobRequest, StopDominantLanguageDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(
            StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopEntitiesDetectionJobResult> stopEntitiesDetectionJobAsync(
            StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest,
            AsyncHandler<StopEntitiesDetectionJobRequest, StopEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an events detection job in progress.
     * </p>
     * 
     * @param stopEventsDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopEventsDetectionJobResult> stopEventsDetectionJobAsync(
            StopEventsDetectionJobRequest stopEventsDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an events detection job in progress.
     * </p>
     * 
     * @param stopEventsDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopEventsDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopEventsDetectionJobResult> stopEventsDetectionJobAsync(
            StopEventsDetectionJobRequest stopEventsDetectionJobRequest,
            AsyncHandler<StopEventsDetectionJobRequest, StopEventsDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into
     * the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopKeyPhrasesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopKeyPhrasesDetectionJobResult> stopKeyPhrasesDetectionJobAsync(
            StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest,
            AsyncHandler<StopKeyPhrasesDetectionJobRequest, StopKeyPhrasesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a PII entities detection job in progress.
     * </p>
     * 
     * @param stopPiiEntitiesDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopPiiEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopPiiEntitiesDetectionJobResult> stopPiiEntitiesDetectionJobAsync(
            StopPiiEntitiesDetectionJobRequest stopPiiEntitiesDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a PII entities detection job in progress.
     * </p>
     * 
     * @param stopPiiEntitiesDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopPiiEntitiesDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopPiiEntitiesDetectionJobResult> stopPiiEntitiesDetectionJobAsync(
            StopPiiEntitiesDetectionJobRequest stopPiiEntitiesDetectionJobRequest,
            AsyncHandler<StopPiiEntitiesDetectionJobRequest, StopPiiEntitiesDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopSentimentDetectionJob service method, as returned by Amazon
     *         Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopSentimentDetectionJobResult> stopSentimentDetectionJobAsync(
            StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest,
            AsyncHandler<StopSentimentDetectionJobRequest, StopSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a targeted sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopTargetedSentimentDetectionJobRequest
     * @return A Java Future object containing the response from the
     *         StopTargetedSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTargetedSentimentDetectionJobResult> stopTargetedSentimentDetectionJobAsync(
            StopTargetedSentimentDetectionJobRequest stopTargetedSentimentDetectionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a targeted sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put
     * into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state
     * when you call the <code>StopDominantLanguageDetectionJob</code>
     * operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the
     * output location.
     * </p>
     * 
     * @param stopTargetedSentimentDetectionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopTargetedSentimentDetectionJob service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws JobNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTargetedSentimentDetectionJobResult> stopTargetedSentimentDetectionJobAsync(
            StopTargetedSentimentDetectionJobRequest stopTargetedSentimentDetectionJobRequest,
            AsyncHandler<StopTargetedSentimentDetectionJobRequest, StopTargetedSentimentDetectionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a document classifier training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and put into
     * the <code>STOPPED</code> state and the service sends back an HTTP 200
     * response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingDocumentClassifierRequest
     * @return A Java Future object containing the response from the
     *         StopTrainingDocumentClassifier service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(
            StopTrainingDocumentClassifierRequest stopTrainingDocumentClassifierRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a document classifier training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and put into
     * the <code>STOPPED</code> state and the service sends back an HTTP 200
     * response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingDocumentClassifierRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopTrainingDocumentClassifier service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTrainingDocumentClassifierResult> stopTrainingDocumentClassifierAsync(
            StopTrainingDocumentClassifierRequest stopTrainingDocumentClassifierRequest,
            AsyncHandler<StopTrainingDocumentClassifierRequest, StopTrainingDocumentClassifierResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an entity recognizer training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and putted
     * into the <code>STOPPED</code> state and the service sends back an HTTP
     * 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingEntityRecognizerRequest
     * @return A Java Future object containing the response from the
     *         StopTrainingEntityRecognizer service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(
            StopTrainingEntityRecognizerRequest stopTrainingEntityRecognizerRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an entity recognizer training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for
     * termination and put into the <code>STOP_REQUESTED</code> state. If the
     * training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and putted
     * into the <code>STOPPED</code> state and the service sends back an HTTP
     * 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingEntityRecognizerRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopTrainingEntityRecognizer service method, as returned by
     *         Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTrainingEntityRecognizerResult> stopTrainingEntityRecognizerAsync(
            StopTrainingEntityRecognizerRequest stopTrainingEntityRecognizerRequest,
            AsyncHandler<StopTrainingEntityRecognizerRequest, StopTrainingEntityRecognizerResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a specific tag with an Amazon Comprehend resource. A tag is a
     * key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a specific tag with an Amazon Comprehend resource. A tag is a
     * key-value pair that adds as a metadata to a resource used by Amazon
     * Comprehend. For example, a tag with "Sales" as the key might be added to
     * a resource to indicate its use by the sales department.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a specific tag associated with an Amazon Comprehend resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Comprehend.
     * @throws TooManyTagKeysException
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a specific tag associated with an Amazon Comprehend resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Comprehend.
     * @throws TooManyTagKeysException
     * @throws InvalidRequestException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates information about the specified endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return A Java Future object containing the response from the
     *         UpdateEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates information about the specified endpoint. For information about
     * endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * 
     * @param updateEndpointRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateEndpoint service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws ResourceInUseException
     * @throws ResourceLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ResourceUnavailableException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update the configuration information for an existing flywheel.
     * </p>
     * 
     * @param updateFlywheelRequest
     * @return A Java Future object containing the response from the
     *         UpdateFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateFlywheelResult> updateFlywheelAsync(UpdateFlywheelRequest updateFlywheelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update the configuration information for an existing flywheel.
     * </p>
     * 
     * @param updateFlywheelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateFlywheel service method, as returned by Amazon Comprehend.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws KmsKeyValidationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Comprehend indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateFlywheelResult> updateFlywheelAsync(UpdateFlywheelRequest updateFlywheelRequest,
            AsyncHandler<UpdateFlywheelRequest, UpdateFlywheelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
