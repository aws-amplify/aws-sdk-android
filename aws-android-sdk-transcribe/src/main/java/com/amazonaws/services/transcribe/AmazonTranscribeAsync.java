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

package com.amazonaws.services.transcribe;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe asynchronously.
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 **/
public interface AmazonTranscribeAsync extends AmazonTranscribe {
    /**
     * <p>
     * Creates a call analytics category. Amazon Transcribe applies the
     * conditions specified by your call analytics categories to your call
     * analytics jobs. For each analytics category, you must create between 1
     * and 20 rules. For example, you can create a 'greeting' category with a
     * rule that flags calls in which your agent does not use a specified phrase
     * (for example: "Please note this call may be recorded.") in the first 15
     * seconds of the call. When you start a call analytics job, Amazon
     * Transcribe applies all your existing call analytics categories to that
     * job.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         CreateCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a call analytics category. Amazon Transcribe applies the
     * conditions specified by your call analytics categories to your call
     * analytics jobs. For each analytics category, you must create between 1
     * and 20 rules. For example, you can create a 'greeting' category with a
     * rule that flags calls in which your agent does not use a specified phrase
     * (for example: "Please note this call may be recorded.") in the first 15
     * seconds of the call. When you start a call analytics job, Amazon
     * Transcribe applies all your existing call analytics categories to that
     * job.
     * </p>
     * 
     * @param createCallAnalyticsCategoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateCallAnalyticsCategoryResult> createCallAnalyticsCategoryAsync(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest,
            AsyncHandler<CreateCallAnalyticsCategoryRequest, CreateCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom language model. When creating a new language model,
     * you must specify if you want a Wideband (audio sample rates over 16,000
     * Hz) or Narrowband (audio sample rates under 16,000 Hz) base model. You
     * then include the S3 URI location of your training and tuning files, the
     * language for the model, a unique name, and any tags you want associated
     * with your model.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         CreateLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateLanguageModelResult> createLanguageModelAsync(
            CreateLanguageModelRequest createLanguageModelRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new custom language model. When creating a new language model,
     * you must specify if you want a Wideband (audio sample rates over 16,000
     * Hz) or Narrowband (audio sample rates under 16,000 Hz) base model. You
     * then include the S3 URI location of your training and tuning files, the
     * language for the model, a unique name, and any tags you want associated
     * with your model.
     * </p>
     * 
     * @param createLanguageModelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateLanguageModelResult> createLanguageModelAsync(
            CreateLanguageModelRequest createLanguageModelRequest,
            AsyncHandler<CreateLanguageModelRequest, CreateLanguageModelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * When creating a new medical vocabulary, you must upload a text file that
     * contains your new entries, phrases, and terms into an S3 bucket. Note
     * that this differs from , where you can include a list of terms within
     * your request using the <code>Phrases</code> flag, as
     * <code>CreateMedicalVocabulary</code> does not support the
     * <code>Phrases</code> flag.
     * </p>
     * <p>
     * For more information on creating a custom vocabulary text file, see <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary-create.html"
     * >Creating a custom vocabulary</a>.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(
            CreateMedicalVocabularyRequest createMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom medical vocabulary.
     * </p>
     * <p>
     * When creating a new medical vocabulary, you must upload a text file that
     * contains your new entries, phrases, and terms into an S3 bucket. Note
     * that this differs from , where you can include a list of terms within
     * your request using the <code>Phrases</code> flag, as
     * <code>CreateMedicalVocabulary</code> does not support the
     * <code>Phrases</code> flag.
     * </p>
     * <p>
     * For more information on creating a custom vocabulary text file, see <a
     * href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary-create.html"
     * >Creating a custom vocabulary</a>.
     * </p>
     * 
     * @param createMedicalVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateMedicalVocabularyResult> createMedicalVocabularyAsync(
            CreateMedicalVocabularyRequest createMedicalVocabularyRequest,
            AsyncHandler<CreateMedicalVocabularyRequest, CreateMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new medical vocabulary, you can either upload a text file
     * that contains your new entries, phrases, and terms into an S3 bucket or
     * include a list of terms directly in your request using the
     * <code>Phrases</code> flag.
     * </p>
     * <p>
     * For more information on creating a custom vocabulary, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary-create.html"
     * >Creating a custom vocabulary</a>.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyResult> createVocabularyAsync(
            CreateVocabularyRequest createVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Creates a new custom vocabulary.
     * </p>
     * <p>
     * When creating a new medical vocabulary, you can either upload a text file
     * that contains your new entries, phrases, and terms into an S3 bucket or
     * include a list of terms directly in your request using the
     * <code>Phrases</code> flag.
     * </p>
     * <p>
     * For more information on creating a custom vocabulary, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary-create.html"
     * >Creating a custom vocabulary</a>.
     * </p>
     * 
     * @param createVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyResult> createVocabularyAsync(
            CreateVocabularyRequest createVocabularyRequest,
            AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words from
     * your transcription output. For example, you can use this operation to
     * remove profanity from your transcript.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         CreateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(
            CreateVocabularyFilterRequest createVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words from
     * your transcription output. For example, you can use this operation to
     * remove profanity from your transcript.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         CreateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(
            CreateVocabularyFilterRequest createVocabularyFilterRequest,
            AsyncHandler<CreateVocabularyFilterRequest, CreateVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a call analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a call analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteCallAnalyticsCategoryResult> deleteCallAnalyticsCategoryAsync(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest,
            AsyncHandler<DeleteCallAnalyticsCategoryRequest, DeleteCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a call analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(
            DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a call analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DeleteCallAnalyticsJobResult> deleteCallAnalyticsJobAsync(
            DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest,
            AsyncHandler<DeleteCallAnalyticsJobRequest, DeleteCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DeleteLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteLanguageModelAsync(DeleteLanguageModelRequest deleteLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * </p>
     * 
     * @param deleteLanguageModelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteLanguageModelAsync(DeleteLanguageModelRequest deleteLanguageModelRequest,
            AsyncHandler<DeleteLanguageModelRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a medical transcription job, along with any related information.
     * To use this operation, specify the name of the job you want to delete
     * using <code>MedicalTranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteMedicalTranscriptionJobAsync(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a medical transcription job, along with any related information.
     * To use this operation, specify the name of the job you want to delete
     * using <code>MedicalTranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteMedicalTranscriptionJobAsync(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest,
            AsyncHandler<DeleteMedicalTranscriptionJobRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the vocabulary you want to delete using
     * <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteMedicalVocabularyAsync(
            DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the vocabulary you want to delete using
     * <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteMedicalVocabularyAsync(
            DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest,
            AsyncHandler<DeleteMedicalVocabularyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a transcription job, along with any related information. To use
     * this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         DeleteTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteTranscriptionJobAsync(
            DeleteTranscriptionJobRequest deleteTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a transcription job, along with any related information. To use
     * this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteTranscriptionJobAsync(
            DeleteTranscriptionJobRequest deleteTranscriptionJobRequest,
            AsyncHandler<DeleteTranscriptionJobRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the vocabulary you want to delete using <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the vocabulary you want to delete using <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteVocabularyAsync(DeleteVocabularyRequest deleteVocabularyRequest,
            AsyncHandler<DeleteVocabularyRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a vocabulary filter. To use this operation, specify the name of
     * the vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         DeleteVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteVocabularyFilterAsync(
            DeleteVocabularyFilterRequest deleteVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a vocabulary filter. To use this operation, specify the name of
     * the vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DeleteVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<Void> deleteVocabularyFilterAsync(
            DeleteVocabularyFilterRequest deleteVocabularyFilterRequest,
            AsyncHandler<DeleteVocabularyFilterRequest, Void> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about a specific custom language model in your
     * Amazon Web Services account.
     * </p>
     * <p>
     * This operation also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this operation to help identify the reason.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @return A Java Future object containing the response from the
     *         DescribeLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeLanguageModelResult> describeLanguageModelAsync(
            DescribeLanguageModelRequest describeLanguageModelRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information about a specific custom language model in your
     * Amazon Web Services account.
     * </p>
     * <p>
     * This operation also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this operation to help identify the reason.
     * </p>
     * 
     * @param describeLanguageModelRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         DescribeLanguageModel service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<DescribeLanguageModelResult> describeLanguageModelAsync(
            DescribeLanguageModelRequest describeLanguageModelRequest,
            AsyncHandler<DescribeLanguageModelRequest, DescribeLanguageModelResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a call analytics category.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(
            GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a call analytics category.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCallAnalyticsCategoryResult> getCallAnalyticsCategoryAsync(
            GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest,
            AsyncHandler<GetCallAnalyticsCategoryRequest, GetCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a call analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to the
     * <code>CallAnalyticsJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can then find your
     * transcript at the URI specified in the <code>TranscriptFileUri</code>
     * field. If you enabled personally identifiable information (PII)
     * redaction, the redacted transcript appears in the
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(
            GetCallAnalyticsJobRequest getCallAnalyticsJobRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves information about a call analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to the
     * <code>CallAnalyticsJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can then find your
     * transcript at the URI specified in the <code>TranscriptFileUri</code>
     * field. If you enabled personally identifiable information (PII)
     * redaction, the redacted transcript appears in the
     * <code>RedactedTranscriptFileUri</code> field.
     * </p>
     * 
     * @param getCallAnalyticsJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetCallAnalyticsJobResult> getCallAnalyticsJobAsync(
            GetCallAnalyticsJobRequest getCallAnalyticsJobRequest,
            AsyncHandler<GetCallAnalyticsJobRequest, GetCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a medical transcription job.
     * </p>
     * <p>
     * To view the job's status, refer to the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can then find your
     * transcript at the URI specified in the <code>TranscriptFileUri</code>
     * field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a medical transcription job.
     * </p>
     * <p>
     * To view the job's status, refer to the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can then find your
     * transcript at the URI specified in the <code>TranscriptFileUri</code>
     * field.
     * </p>
     * 
     * @param getMedicalTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMedicalTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest,
            AsyncHandler<GetMedicalTranscriptionJobRequest, GetMedicalTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(
            GetMedicalVocabularyRequest getMedicalVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetMedicalVocabularyResult> getMedicalVocabularyAsync(
            GetMedicalVocabularyRequest getMedicalVocabularyRequest,
            AsyncHandler<GetMedicalVocabularyRequest, GetMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the
     * job, check the <code>TranscriptionJobStatus</code> field. If the status
     * is <code>COMPLETED</code>, the job is finished and you can find the
     * results at the location specified in the <code>TranscriptFileUri</code>
     * field. If you enable content redaction, the redacted transcript appears
     * in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         GetTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTranscriptionJobResult> getTranscriptionJobAsync(
            GetTranscriptionJobRequest getTranscriptionJobRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns information about a transcription job. To see the status of the
     * job, check the <code>TranscriptionJobStatus</code> field. If the status
     * is <code>COMPLETED</code>, the job is finished and you can find the
     * results at the location specified in the <code>TranscriptFileUri</code>
     * field. If you enable content redaction, the redacted transcript appears
     * in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * 
     * @param getTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetTranscriptionJobResult> getTranscriptionJobAsync(
            GetTranscriptionJobRequest getTranscriptionJobRequest,
            AsyncHandler<GetTranscriptionJobRequest, GetTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return A Java Future object containing the response from the
     *         GetVocabulary service method, as returned by Amazon Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest getVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetVocabulary service method, as returned by Amazon Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest getVocabularyRequest,
            AsyncHandler<GetVocabularyRequest, GetVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         GetVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetVocabularyFilterResult> getVocabularyFilterAsync(
            GetVocabularyFilterRequest getVocabularyFilterRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         GetVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws BadRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<GetVocabularyFilterResult> getVocabularyFilterAsync(
            GetVocabularyFilterRequest getVocabularyFilterRequest,
            AsyncHandler<GetVocabularyFilterRequest, GetVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more information about the call analytics categories that you've
     * created. You can use the information in this list to find a specific
     * category. You can then use the operation to get more information about
     * it.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsCategories service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more information about the call analytics categories that you've
     * created. You can use the information in this list to find a specific
     * category. You can then use the operation to get more information about
     * it.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsCategories service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListCallAnalyticsCategoriesResult> listCallAnalyticsCategoriesAsync(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest,
            AsyncHandler<ListCallAnalyticsCategoriesRequest, ListCallAnalyticsCategoriesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List call analytics jobs with a specified status or substring that
     * matches their names.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(
            ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List call analytics jobs with a specified status or substring that
     * matches their names.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListCallAnalyticsJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListCallAnalyticsJobsResult> listCallAnalyticsJobsAsync(
            ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest,
            AsyncHandler<ListCallAnalyticsJobsRequest, ListCallAnalyticsJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides more information about the custom language models you've
     * created. You can use the information in this list to find a specific
     * custom language model. You can then use the operation to get more
     * information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return A Java Future object containing the response from the
     *         ListLanguageModels service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLanguageModelsResult> listLanguageModelsAsync(
            ListLanguageModelsRequest listLanguageModelsRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Provides more information about the custom language models you've
     * created. You can use the information in this list to find a specific
     * custom language model. You can then use the operation to get more
     * information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListLanguageModels service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListLanguageModelsResult> listLanguageModelsAsync(
            ListLanguageModelsRequest listLanguageModelsRequest,
            AsyncHandler<ListLanguageModelsRequest, ListLanguageModelsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring
     * that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalTranscriptionJobs service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring
     * that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListMedicalTranscriptionJobs service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest,
            AsyncHandler<ListMedicalTranscriptionJobsRequest, ListMedicalTranscriptionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you
     * don't enter a value in any of the request parameters, returns the entire
     * list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListMedicalVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(
            ListMedicalVocabulariesRequest listMedicalVocabulariesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you
     * don't enter a value in any of the request parameters, returns the entire
     * list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListMedicalVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListMedicalVocabulariesResult> listMedicalVocabulariesAsync(
            ListMedicalVocabulariesRequest listMedicalVocabulariesRequest,
            AsyncHandler<ListMedicalVocabulariesRequest, ListMedicalVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given transcription job, vocabulary, or
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Lists all tags associated with a given transcription job, vocabulary, or
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return A Java Future object containing the response from the
     *         ListTranscriptionJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(
            ListTranscriptionJobsRequest listTranscriptionJobsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListTranscriptionJobs service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(
            ListTranscriptionJobsRequest listTranscriptionJobsRequest,
            AsyncHandler<ListTranscriptionJobsRequest, ListTranscriptionJobsResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no
     * criteria are specified, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListVocabulariesResult> listVocabulariesAsync(
            ListVocabulariesRequest listVocabulariesRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no
     * criteria are specified, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListVocabularies service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListVocabulariesResult> listVocabulariesAsync(
            ListVocabulariesRequest listVocabulariesRequest,
            AsyncHandler<ListVocabulariesRequest, ListVocabulariesResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return A Java Future object containing the response from the
     *         ListVocabularyFilters service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(
            ListVocabularyFiltersRequest listVocabularyFiltersRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         ListVocabularyFilters service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(
            ListVocabularyFiltersRequest listVocabularyFiltersRequest,
            AsyncHandler<ListVocabularyFiltersRequest, ListVocabularyFiltersResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous analytics job that not only transcribes the audio
     * recording of a caller and agent, but also returns additional insights.
     * These insights include how quickly or loudly the caller or agent was
     * speaking. To retrieve additional insights with your analytics jobs,
     * create categories. A category is a way to classify analytics jobs based
     * on attributes, such as a customer's sentiment or a particular phrase
     * being used during the call. For more information, see the operation.
     * </p>
     * 
     * @param startCallAnalyticsJobRequest
     * @return A Java Future object containing the response from the
     *         StartCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(
            StartCallAnalyticsJobRequest startCallAnalyticsJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous analytics job that not only transcribes the audio
     * recording of a caller and agent, but also returns additional insights.
     * These insights include how quickly or loudly the caller or agent was
     * speaking. To retrieve additional insights with your analytics jobs,
     * create categories. A category is a way to classify analytics jobs based
     * on attributes, such as a customer's sentiment or a particular phrase
     * being used during the call. For more information, see the operation.
     * </p>
     * 
     * @param startCallAnalyticsJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartCallAnalyticsJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartCallAnalyticsJobResult> startCallAnalyticsJobAsync(
            StartCallAnalyticsJobRequest startCallAnalyticsJobRequest,
            AsyncHandler<StartCallAnalyticsJobRequest, StartCallAnalyticsJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartMedicalTranscriptionJob service method, as returned by
     *         Amazon Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest,
            AsyncHandler<StartMedicalTranscriptionJobRequest, StartMedicalTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return A Java Future object containing the response from the
     *         StartTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTranscriptionJobResult> startTranscriptionJobAsync(
            StartTranscriptionJobRequest startTranscriptionJobRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         StartTranscriptionJob service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<StartTranscriptionJobResult> startTranscriptionJobAsync(
            StartTranscriptionJobRequest startTranscriptionJobRequest,
            AsyncHandler<StartTranscriptionJobRequest, StartTranscriptionJobResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tags an Amazon Transcribe resource with the given list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Transcribe.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Tags an Amazon Transcribe resource with the given list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the TagResource
     *         service method, as returned by Amazon Transcribe.
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes specified tags from a specified Amazon Transcribe resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes specified tags from a specified Amazon Transcribe resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UntagResource service method, as returned by Amazon Transcribe.
     * @throws LimitExceededException
     * @throws BadRequestException
     * @throws ConflictException
     * @throws NotFoundException
     * @throws InternalFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the call analytics category with new values. The
     * <code>UpdateCallAnalyticsCategory</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return A Java Future object containing the response from the
     *         UpdateCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the call analytics category with new values. The
     * <code>UpdateCallAnalyticsCategory</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateCallAnalyticsCategory service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateCallAnalyticsCategoryResult> updateCallAnalyticsCategoryAsync(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest,
            AsyncHandler<UpdateCallAnalyticsCategoryRequest, UpdateCallAnalyticsCategoryResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text
     * file from the one you used to create the vocabulary. The
     * <code>UpdateMedicalVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(
            UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text
     * file from the one you used to create the vocabulary. The
     * <code>UpdateMedicalVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateMedicalVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateMedicalVocabularyResult> updateMedicalVocabularyAsync(
            UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest,
            AsyncHandler<UpdateMedicalVocabularyRequest, UpdateMedicalVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an existing vocabulary with new values. The
     * <code>UpdateVocabulary</code> operation overwrites all of the existing
     * information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateVocabularyResult> updateVocabularyAsync(
            UpdateVocabularyRequest updateVocabularyRequest) throws AmazonServiceException,
            AmazonClientException;

    /**
     * <p>
     * Updates an existing vocabulary with new values. The
     * <code>UpdateVocabulary</code> operation overwrites all of the existing
     * information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateVocabulary service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateVocabularyResult> updateVocabularyAsync(
            UpdateVocabularyRequest updateVocabularyRequest,
            AsyncHandler<UpdateVocabularyRequest, UpdateVocabularyResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return A Java Future object containing the response from the
     *         UpdateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(
            UpdateVocabularyFilterRequest updateVocabularyFilterRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         UpdateVocabularyFilter service method, as returned by Amazon
     *         Transcribe.
     * @throws BadRequestException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @throws NotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Transcribe indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(
            UpdateVocabularyFilterRequest updateVocabularyFilterRequest,
            AsyncHandler<UpdateVocabularyFilterRequest, UpdateVocabularyFilterResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
