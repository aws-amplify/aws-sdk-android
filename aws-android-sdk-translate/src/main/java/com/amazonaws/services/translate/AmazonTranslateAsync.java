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

package com.amazonaws.services.translate;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.translate.model.*;

/**
 * Interface for accessing Amazon Translate asynchronously.
 * <p>
 * Provides translation of the input content from the source language to the
 * target language.
 * </p>
 **/
public interface AmazonTranslateAsync extends AmazonTranslate {
    /**
     * <p>
     * Creates a parallel data resource in Amazon Translate by importing an
     * input file from Amazon S3. Parallel data files contain examples that show
     * how you want segments of text to be translated. By adding parallel data,
     * you can influence the style, tone, and word choice in your translation
     * output.
     * </p>
     * 
     * @param createParallelDataRequest
     * @return A Java Future object containing the response from the
     *         CreateParallelData service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws ConflictException
     * @throws ConcurrentModificationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateParallelDataResult> createParallelDataAsync(
            CreateParallelDataRequest createParallelDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a parallel data resource in Amazon Translate by importing an
     * input file from Amazon S3. Parallel data files contain examples that show
     * how you want segments of text to be translated. By adding parallel data,
     * you can influence the style, tone, and word choice in your translation
     * output.
     * </p>
     * 
     * @param createParallelDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateParallelData service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws ConflictException
     * @throws ConcurrentModificationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateParallelDataResult> createParallelDataAsync(
            CreateParallelDataRequest createParallelDataRequest,
            AsyncHandler<CreateParallelDataRequest, CreateParallelDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a parallel data resource in Amazon Translate.
     * </p>
     * 
     * @param deleteParallelDataRequest
     * @return A Java Future object containing the response from the
     *         DeleteParallelData service method, as returned by Amazon
     *         Translate.
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteParallelDataResult> deleteParallelDataAsync(
            DeleteParallelDataRequest deleteParallelDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Deletes a parallel data resource in Amazon Translate.
     * </p>
     * 
     * @param deleteParallelDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteParallelData service method, as returned by Amazon
     *         Translate.
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteParallelDataResult> deleteParallelDataAsync(
            DeleteParallelDataRequest deleteParallelDataRequest,
            AsyncHandler<DeleteParallelDataRequest, DeleteParallelDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @return A Java Future object containing the response from the
     *         DeleteTerminology service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * A synchronous action that deletes a custom terminology.
     * </p>
     * 
     * @param deleteTerminologyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteTerminology service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InvalidParameterValueException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteTerminologyAsync(DeleteTerminologyRequest deleteTerminologyRequest,
            AsyncHandler<DeleteTerminologyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with an asynchronous batch translation job
     * including name, ID, status, source and target languages, input/output S3
     * buckets, and so on.
     * </p>
     * 
     * @param describeTextTranslationJobRequest
     * @return A Java Future object containing the response from the
     *         DescribeTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(
            DescribeTextTranslationJobRequest describeTextTranslationJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the properties associated with an asynchronous batch translation job
     * including name, ID, status, source and target languages, input/output S3
     * buckets, and so on.
     * </p>
     * 
     * @param describeTextTranslationJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeTextTranslationJobResult> describeTextTranslationJobAsync(
            DescribeTextTranslationJobRequest describeTextTranslationJobRequest,
            AsyncHandler<DescribeTextTranslationJobRequest, DescribeTextTranslationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about a parallel data resource.
     * </p>
     * 
     * @param getParallelDataRequest
     * @return A Java Future object containing the response from the
     *         GetParallelData service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetParallelDataResult> getParallelDataAsync(GetParallelDataRequest getParallelDataRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about a parallel data resource.
     * </p>
     * 
     * @param getParallelDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetParallelData service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetParallelDataResult> getParallelDataAsync(
            GetParallelDataRequest getParallelDataRequest,
            AsyncHandler<GetParallelDataRequest, GetParallelDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @return A Java Future object containing the response from the
     *         GetTerminology service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a custom terminology.
     * </p>
     * 
     * @param getTerminologyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTerminology service method, as returned by Amazon Translate.
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTerminologyResult> getTerminologyAsync(GetTerminologyRequest getTerminologyRequest,
            AsyncHandler<GetTerminologyRequest, GetTerminologyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether one already
     * exists for the given terminology name. Importing a terminology with the
     * same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. The only supported merge strategy is OVERWRITE,
     * where the imported terminology overwrites the existing terminology of the
     * same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new
     * terminology takes up to 10 minutes to fully propagate. After that,
     * translations have access to the new terminology.
     * </p>
     * 
     * @param importTerminologyRequest
     * @return A Java Future object containing the response from the
     *         ImportTerminology service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws ConcurrentModificationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ImportTerminologyResult> importTerminologyAsync(
            ImportTerminologyRequest importTerminologyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates or updates a custom terminology, depending on whether one already
     * exists for the given terminology name. Importing a terminology with the
     * same name as an existing one will merge the terminologies based on the
     * chosen merge strategy. The only supported merge strategy is OVERWRITE,
     * where the imported terminology overwrites the existing terminology of the
     * same name.
     * </p>
     * <p>
     * If you import a terminology that overwrites an existing one, the new
     * terminology takes up to 10 minutes to fully propagate. After that,
     * translations have access to the new terminology.
     * </p>
     * 
     * @param importTerminologyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ImportTerminology service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws TooManyTagsException
     * @throws ConcurrentModificationException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ImportTerminologyResult> importTerminologyAsync(
            ImportTerminologyRequest importTerminologyRequest,
            AsyncHandler<ImportTerminologyRequest, ImportTerminologyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of languages (RFC-5646 codes and names) that Amazon
     * Translate supports.
     * </p>
     * 
     * @param listLanguagesRequest
     * @return A Java Future object containing the response from the
     *         ListLanguages service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws UnsupportedDisplayLanguageCodeException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLanguagesResult> listLanguagesAsync(ListLanguagesRequest listLanguagesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of languages (RFC-5646 codes and names) that Amazon
     * Translate supports.
     * </p>
     * 
     * @param listLanguagesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListLanguages service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws UnsupportedDisplayLanguageCodeException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLanguagesResult> listLanguagesAsync(ListLanguagesRequest listLanguagesRequest,
            AsyncHandler<ListLanguagesRequest, ListLanguagesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of your parallel data resources in Amazon Translate.
     * </p>
     * 
     * @param listParallelDataRequest
     * @return A Java Future object containing the response from the
     *         ListParallelData service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListParallelDataResult> listParallelDataAsync(
            ListParallelDataRequest listParallelDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides a list of your parallel data resources in Amazon Translate.
     * </p>
     * 
     * @param listParallelDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListParallelData service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListParallelDataResult> listParallelDataAsync(
            ListParallelDataRequest listParallelDataRequest,
            AsyncHandler<ListParallelDataRequest, ListParallelDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given Amazon Translate resource. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given Amazon Translate resource. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @return A Java Future object containing the response from the
     *         ListTerminologies service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTerminologiesResult> listTerminologiesAsync(
            ListTerminologiesRequest listTerminologiesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides a list of custom terminologies associated with your account.
     * </p>
     * 
     * @param listTerminologiesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTerminologies service method, as returned by Amazon
     *         Translate.
     * @throws InvalidParameterValueException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTerminologiesResult> listTerminologiesAsync(
            ListTerminologiesRequest listTerminologiesRequest,
            AsyncHandler<ListTerminologiesRequest, ListTerminologiesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the batch translation jobs that you have submitted.
     * </p>
     * 
     * @param listTextTranslationJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTextTranslationJobs service method, as returned by Amazon
     *         Translate.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(
            ListTextTranslationJobsRequest listTextTranslationJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a list of the batch translation jobs that you have submitted.
     * </p>
     * 
     * @param listTextTranslationJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTextTranslationJobs service method, as returned by Amazon
     *         Translate.
     * @throws InvalidRequestException
     * @throws TooManyRequestsException
     * @throws InvalidFilterException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTextTranslationJobsResult> listTextTranslationJobsAsync(
            ListTextTranslationJobsRequest listTextTranslationJobsRequest,
            AsyncHandler<ListTextTranslationJobsRequest, ListTextTranslationJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous batch translation job. Use batch translation jobs
     * to translate large volumes of text across multiple documents at once. For
     * batch translation, you can input documents with different source
     * languages (specify <code>auto</code> as the source language). You can
     * specify one or more target languages. Batch translation translates each
     * input document into each of the target languages. For more information,
     * see <a href="https://docs.aws.amazon.com/translate/latest/dg/async.html">
     * Asynchronous batch processing</a>.
     * </p>
     * <p>
     * Batch translation jobs can be described with the
     * <a>DescribeTextTranslationJob</a> operation, listed with the
     * <a>ListTextTranslationJobs</a> operation, and stopped with the
     * <a>StopTextTranslationJob</a> operation.
     * </p>
     * 
     * @param startTextTranslationJobRequest
     * @return A Java Future object containing the response from the
     *         StartTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTextTranslationJobResult> startTextTranslationJobAsync(
            StartTextTranslationJobRequest startTextTranslationJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous batch translation job. Use batch translation jobs
     * to translate large volumes of text across multiple documents at once. For
     * batch translation, you can input documents with different source
     * languages (specify <code>auto</code> as the source language). You can
     * specify one or more target languages. Batch translation translates each
     * input document into each of the target languages. For more information,
     * see <a href="https://docs.aws.amazon.com/translate/latest/dg/async.html">
     * Asynchronous batch processing</a>.
     * </p>
     * <p>
     * Batch translation jobs can be described with the
     * <a>DescribeTextTranslationJob</a> operation, listed with the
     * <a>ListTextTranslationJobs</a> operation, and stopped with the
     * <a>StopTextTranslationJob</a> operation.
     * </p>
     * 
     * @param startTextTranslationJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws TooManyRequestsException
     * @throws UnsupportedLanguagePairException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InvalidParameterValueException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTextTranslationJobResult> startTextTranslationJobAsync(
            StartTextTranslationJobRequest startTextTranslationJobRequest,
            AsyncHandler<StartTextTranslationJobRequest, StartTextTranslationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an asynchronous batch translation job that is in progress.
     * </p>
     * <p>
     * If the job's state is <code>IN_PROGRESS</code>, the job will be marked
     * for termination and put into the <code>STOP_REQUESTED</code> state. If
     * the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state. Otherwise, the job is put into the
     * <code>STOPPED</code> state.
     * </p>
     * <p>
     * Asynchronous batch translation jobs are started with the
     * <a>StartTextTranslationJob</a> operation. You can use the
     * <a>DescribeTextTranslationJob</a> or <a>ListTextTranslationJobs</a>
     * operations to get a batch translation job's <code>JobId</code>.
     * </p>
     * 
     * @param stopTextTranslationJobRequest
     * @return A Java Future object containing the response from the
     *         StopTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(
            StopTextTranslationJobRequest stopTextTranslationJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an asynchronous batch translation job that is in progress.
     * </p>
     * <p>
     * If the job's state is <code>IN_PROGRESS</code>, the job will be marked
     * for termination and put into the <code>STOP_REQUESTED</code> state. If
     * the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state. Otherwise, the job is put into the
     * <code>STOPPED</code> state.
     * </p>
     * <p>
     * Asynchronous batch translation jobs are started with the
     * <a>StartTextTranslationJob</a> operation. You can use the
     * <a>DescribeTextTranslationJob</a> or <a>ListTextTranslationJobs</a>
     * operations to get a batch translation job's <code>JobId</code>.
     * </p>
     * 
     * @param stopTextTranslationJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StopTextTranslationJob service method, as returned by Amazon
     *         Translate.
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StopTextTranslationJobResult> stopTextTranslationJobAsync(
            StopTextTranslationJobRequest stopTextTranslationJobRequest,
            AsyncHandler<StopTextTranslationJobRequest, StopTextTranslationJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a specific tag with a resource. A tag is a key-value pair that
     * adds as a metadata to a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a specific tag with a resource. A tag is a key-value pair that
     * adds as a metadata to a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws TooManyTagsException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Translates the input document from the source language to the target
     * language. This synchronous operation supports plain text or HTML for the
     * input document. <code>TranslateDocument</code> supports translations from
     * English to any supported language, and from any supported language to
     * English. Therefore, specify either the source language code or the target
     * language code as “en” (English).
     * </p>
     * <p>
     * <code>TranslateDocument</code> does not support language auto-detection.
     * </p>
     * <p>
     * If you set the <code>Formality</code> parameter, the request will fail if
     * the target language does not support formality. For a list of target
     * languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html"
     * >Setting formality</a>.
     * </p>
     * 
     * @param translateDocumentRequest
     * @return A Java Future object containing the response from the
     *         TranslateDocument service method, as returned by Amazon
     *         Translate.
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws UnsupportedLanguagePairException
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
    Future<TranslateDocumentResult> translateDocumentAsync(
            TranslateDocumentRequest translateDocumentRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Translates the input document from the source language to the target
     * language. This synchronous operation supports plain text or HTML for the
     * input document. <code>TranslateDocument</code> supports translations from
     * English to any supported language, and from any supported language to
     * English. Therefore, specify either the source language code or the target
     * language code as “en” (English).
     * </p>
     * <p>
     * <code>TranslateDocument</code> does not support language auto-detection.
     * </p>
     * <p>
     * If you set the <code>Formality</code> parameter, the request will fail if
     * the target language does not support formality. For a list of target
     * languages that support formality, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/customizing-translations-formality.html"
     * >Setting formality</a>.
     * </p>
     * 
     * @param translateDocumentRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         TranslateDocument service method, as returned by Amazon
     *         Translate.
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ResourceNotFoundException
     * @throws UnsupportedLanguagePairException
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
    Future<TranslateDocumentResult> translateDocumentAsync(
            TranslateDocumentRequest translateDocumentRequest,
            AsyncHandler<TranslateDocumentRequest, TranslateDocumentResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Translates input text from the source language to the target language.
     * For a list of available languages and language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
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
     * @throws ResourceNotFoundException
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
     * For a list of available languages and language codes, see <a href=
     * "https://docs.aws.amazon.com/translate/latest/dg/what-is-languages.html"
     * >Supported languages</a>.
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
     * @throws ResourceNotFoundException
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

    /**
     * <p>
     * Removes a specific tag associated with an Amazon Translate resource. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a specific tag associated with an Amazon Translate resource. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/translate/latest/dg/tagging.html">
     * Tagging your resources</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Translate.
     * @throws InvalidParameterValueException
     * @throws ConcurrentModificationException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a previously created parallel data resource by importing a new
     * input file from Amazon S3.
     * </p>
     * 
     * @param updateParallelDataRequest
     * @return A Java Future object containing the response from the
     *         UpdateParallelData service method, as returned by Amazon
     *         Translate.
     * @throws ConcurrentModificationException
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateParallelDataResult> updateParallelDataAsync(
            UpdateParallelDataRequest updateParallelDataRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates a previously created parallel data resource by importing a new
     * input file from Amazon S3.
     * </p>
     * 
     * @param updateParallelDataRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateParallelData service method, as returned by Amazon
     *         Translate.
     * @throws ConcurrentModificationException
     * @throws InvalidParameterValueException
     * @throws InvalidRequestException
     * @throws LimitExceededException
     * @throws TooManyRequestsException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Translate indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateParallelDataResult> updateParallelDataAsync(
            UpdateParallelDataRequest updateParallelDataRequest,
            AsyncHandler<UpdateParallelDataRequest, UpdateParallelDataResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
