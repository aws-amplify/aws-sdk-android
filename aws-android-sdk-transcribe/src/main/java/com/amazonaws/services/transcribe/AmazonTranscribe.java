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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe
 * <p>
 * Operations and objects for transcribing speech to text.
 * </p>
 **/
public interface AmazonTranscribe {

    /**
     * Overrides the default endpoint for this client
     * ("https://transcribe.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "transcribe.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://transcribe.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "transcribe.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://transcribe.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonTranscribe#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

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
     * @return createCallAnalyticsCategoryResult The response from the
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
    CreateCallAnalyticsCategoryResult createCallAnalyticsCategory(
            CreateCallAnalyticsCategoryRequest createCallAnalyticsCategoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createLanguageModelResult The response from the
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
    CreateLanguageModelResult createLanguageModel(
            CreateLanguageModelRequest createLanguageModelRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return createMedicalVocabularyResult The response from the
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
    CreateMedicalVocabularyResult createMedicalVocabulary(
            CreateMedicalVocabularyRequest createMedicalVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return createVocabularyResult The response from the CreateVocabulary
     *         service method, as returned by Amazon Transcribe.
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
    CreateVocabularyResult createVocabulary(CreateVocabularyRequest createVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new vocabulary filter that you can use to filter words from
     * your transcription output. For example, you can use this operation to
     * remove profanity from your transcript.
     * </p>
     * 
     * @param createVocabularyFilterRequest
     * @return createVocabularyFilterResult The response from the
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
    CreateVocabularyFilterResult createVocabularyFilter(
            CreateVocabularyFilterRequest createVocabularyFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a call analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsCategoryRequest
     * @return deleteCallAnalyticsCategoryResult The response from the
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
    DeleteCallAnalyticsCategoryResult deleteCallAnalyticsCategory(
            DeleteCallAnalyticsCategoryRequest deleteCallAnalyticsCategoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a call analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>.
     * </p>
     * 
     * @param deleteCallAnalyticsJobRequest
     * @return deleteCallAnalyticsJobResult The response from the
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
    DeleteCallAnalyticsJobResult deleteCallAnalyticsJob(
            DeleteCallAnalyticsJobRequest deleteCallAnalyticsJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom language model. To use this operation, specify the name
     * of the language model you want to delete using <code>ModelName</code>.
     * </p>
     * 
     * @param deleteLanguageModelRequest
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
    void deleteLanguageModel(DeleteLanguageModelRequest deleteLanguageModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a medical transcription job, along with any related information.
     * To use this operation, specify the name of the job you want to delete
     * using <code>MedicalTranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteMedicalTranscriptionJobRequest
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
    void deleteMedicalTranscriptionJob(
            DeleteMedicalTranscriptionJobRequest deleteMedicalTranscriptionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom medical vocabulary. To use this operation, specify the
     * name of the vocabulary you want to delete using
     * <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteMedicalVocabularyRequest
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
    void deleteMedicalVocabulary(DeleteMedicalVocabularyRequest deleteMedicalVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a transcription job, along with any related information. To use
     * this operation, specify the name of the job you want to delete using
     * <code>TranscriptionJobName</code>.
     * </p>
     * 
     * @param deleteTranscriptionJobRequest
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
    void deleteTranscriptionJob(DeleteTranscriptionJobRequest deleteTranscriptionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a custom vocabulary. To use this operation, specify the name of
     * the vocabulary you want to delete using <code>VocabularyName</code>.
     * </p>
     * 
     * @param deleteVocabularyRequest
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
    void deleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a vocabulary filter. To use this operation, specify the name of
     * the vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>.
     * </p>
     * 
     * @param deleteVocabularyFilterRequest
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
    void deleteVocabularyFilter(DeleteVocabularyFilterRequest deleteVocabularyFilterRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return describeLanguageModelResult The response from the
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
    DescribeLanguageModelResult describeLanguageModel(
            DescribeLanguageModelRequest describeLanguageModelRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a call analytics category.
     * </p>
     * 
     * @param getCallAnalyticsCategoryRequest
     * @return getCallAnalyticsCategoryResult The response from the
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
    GetCallAnalyticsCategoryResult getCallAnalyticsCategory(
            GetCallAnalyticsCategoryRequest getCallAnalyticsCategoryRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return getCallAnalyticsJobResult The response from the
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
    GetCallAnalyticsJobResult getCallAnalyticsJob(
            GetCallAnalyticsJobRequest getCallAnalyticsJobRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getMedicalTranscriptionJobResult The response from the
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
    GetMedicalTranscriptionJobResult getMedicalTranscriptionJob(
            GetMedicalTranscriptionJobRequest getMedicalTranscriptionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a medical vocabulary.
     * </p>
     * 
     * @param getMedicalVocabularyRequest
     * @return getMedicalVocabularyResult The response from the
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
    GetMedicalVocabularyResult getMedicalVocabulary(
            GetMedicalVocabularyRequest getMedicalVocabularyRequest) throws AmazonClientException,
            AmazonServiceException;

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
     * @return getTranscriptionJobResult The response from the
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
    GetTranscriptionJobResult getTranscriptionJob(
            GetTranscriptionJobRequest getTranscriptionJobRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a vocabulary.
     * </p>
     * 
     * @param getVocabularyRequest
     * @return getVocabularyResult The response from the GetVocabulary service
     *         method, as returned by Amazon Transcribe.
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
    GetVocabularyResult getVocabulary(GetVocabularyRequest getVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a vocabulary filter.
     * </p>
     * 
     * @param getVocabularyFilterRequest
     * @return getVocabularyFilterResult The response from the
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
    GetVocabularyFilterResult getVocabularyFilter(
            GetVocabularyFilterRequest getVocabularyFilterRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Provides more information about the call analytics categories that you've
     * created. You can use the information in this list to find a specific
     * category. You can then use the operation to get more information about
     * it.
     * </p>
     * 
     * @param listCallAnalyticsCategoriesRequest
     * @return listCallAnalyticsCategoriesResult The response from the
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
    ListCallAnalyticsCategoriesResult listCallAnalyticsCategories(
            ListCallAnalyticsCategoriesRequest listCallAnalyticsCategoriesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * List call analytics jobs with a specified status or substring that
     * matches their names.
     * </p>
     * 
     * @param listCallAnalyticsJobsRequest
     * @return listCallAnalyticsJobsResult The response from the
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
    ListCallAnalyticsJobsResult listCallAnalyticsJobs(
            ListCallAnalyticsJobsRequest listCallAnalyticsJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Provides more information about the custom language models you've
     * created. You can use the information in this list to find a specific
     * custom language model. You can then use the operation to get more
     * information about it.
     * </p>
     * 
     * @param listLanguageModelsRequest
     * @return listLanguageModelsResult The response from the ListLanguageModels
     *         service method, as returned by Amazon Transcribe.
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
    ListLanguageModelsResult listLanguageModels(ListLanguageModelsRequest listLanguageModelsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists medical transcription jobs with a specified status or substring
     * that matches their names.
     * </p>
     * 
     * @param listMedicalTranscriptionJobsRequest
     * @return listMedicalTranscriptionJobsResult The response from the
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
    ListMedicalTranscriptionJobsResult listMedicalTranscriptionJobs(
            ListMedicalTranscriptionJobsRequest listMedicalTranscriptionJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If you
     * don't enter a value in any of the request parameters, returns the entire
     * list of vocabularies.
     * </p>
     * 
     * @param listMedicalVocabulariesRequest
     * @return listMedicalVocabulariesResult The response from the
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
    ListMedicalVocabulariesResult listMedicalVocabularies(
            ListMedicalVocabulariesRequest listMedicalVocabulariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all tags associated with a given transcription job, vocabulary, or
     * resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
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
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists transcription jobs with the specified status.
     * </p>
     * 
     * @param listTranscriptionJobsRequest
     * @return listTranscriptionJobsResult The response from the
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
    ListTranscriptionJobsResult listTranscriptionJobs(
            ListTranscriptionJobsRequest listTranscriptionJobsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of vocabularies that match the specified criteria. If no
     * criteria are specified, returns the entire list of vocabularies.
     * </p>
     * 
     * @param listVocabulariesRequest
     * @return listVocabulariesResult The response from the ListVocabularies
     *         service method, as returned by Amazon Transcribe.
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
    ListVocabulariesResult listVocabularies(ListVocabulariesRequest listVocabulariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about vocabulary filters.
     * </p>
     * 
     * @param listVocabularyFiltersRequest
     * @return listVocabularyFiltersResult The response from the
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
    ListVocabularyFiltersResult listVocabularyFilters(
            ListVocabularyFiltersRequest listVocabularyFiltersRequest)
            throws AmazonClientException, AmazonServiceException;

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
     * @return startCallAnalyticsJobResult The response from the
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
    StartCallAnalyticsJobResult startCallAnalyticsJob(
            StartCallAnalyticsJobRequest startCallAnalyticsJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts a batch job to transcribe medical speech to text.
     * </p>
     * 
     * @param startMedicalTranscriptionJobRequest
     * @return startMedicalTranscriptionJobResult The response from the
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
    StartMedicalTranscriptionJobResult startMedicalTranscriptionJob(
            StartMedicalTranscriptionJobRequest startMedicalTranscriptionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts an asynchronous job to transcribe speech to text.
     * </p>
     * 
     * @param startTranscriptionJobRequest
     * @return startTranscriptionJobResult The response from the
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
    StartTranscriptionJobResult startTranscriptionJob(
            StartTranscriptionJobRequest startTranscriptionJobRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Tags an Amazon Transcribe resource with the given list of tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon Transcribe.
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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes specified tags from a specified Amazon Transcribe resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon Transcribe.
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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the call analytics category with new values. The
     * <code>UpdateCallAnalyticsCategory</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateCallAnalyticsCategoryRequest
     * @return updateCallAnalyticsCategoryResult The response from the
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
    UpdateCallAnalyticsCategoryResult updateCallAnalyticsCategory(
            UpdateCallAnalyticsCategoryRequest updateCallAnalyticsCategoryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a vocabulary with new values that you provide in a different text
     * file from the one you used to create the vocabulary. The
     * <code>UpdateMedicalVocabulary</code> operation overwrites all of the
     * existing information with the values that you provide in the request.
     * </p>
     * 
     * @param updateMedicalVocabularyRequest
     * @return updateMedicalVocabularyResult The response from the
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
    UpdateMedicalVocabularyResult updateMedicalVocabulary(
            UpdateMedicalVocabularyRequest updateMedicalVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing vocabulary with new values. The
     * <code>UpdateVocabulary</code> operation overwrites all of the existing
     * information with the values that you provide in the request.
     * </p>
     * 
     * @param updateVocabularyRequest
     * @return updateVocabularyResult The response from the UpdateVocabulary
     *         service method, as returned by Amazon Transcribe.
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
    UpdateVocabularyResult updateVocabulary(UpdateVocabularyRequest updateVocabularyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates a vocabulary filter with a new list of filtered words.
     * </p>
     * 
     * @param updateVocabularyFilterRequest
     * @return updateVocabularyFilterResult The response from the
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
    UpdateVocabularyFilterResult updateVocabularyFilter(
            UpdateVocabularyFilterRequest updateVocabularyFilterRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
