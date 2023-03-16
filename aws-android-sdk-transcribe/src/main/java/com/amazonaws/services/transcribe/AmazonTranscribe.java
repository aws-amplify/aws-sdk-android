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

package com.amazonaws.services.transcribe;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.transcribe.model.*;

/**
 * Interface for accessing Amazon Transcribe
 * <p>
 * Amazon Transcribe offers three main types of batch transcription:
 * <b>Standard</b>, <b>Medical</b>, and <b>Call Analytics</b>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Standard transcriptions</b> are the most common option. Refer to for
 * details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Medical transcriptions</b> are tailored to medical professionals and
 * incorporate medical terms. A common use case for this service is transcribing
 * doctor-patient dialogue into after-visit notes. Refer to for details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Call Analytics transcriptions</b> are designed for use with call center
 * audio on two different channels; if you're looking for insight into customer
 * service calls, use this option. Refer to for details.
 * </p>
 * </li>
 * </ul>
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
     * Creates a new Call Analytics category.
     * </p>
     * <p>
     * All categories are automatically applied to your Call Analytics
     * transcriptions. Note that in order to apply categories to your
     * transcriptions, you must create them before submitting your transcription
     * request, as categories cannot be applied retroactively.
     * </p>
     * <p>
     * When creating a new category, you can use the <code>InputType</code>
     * parameter to label the category as a <code>POST_CALL</code> or a
     * <code>REAL_TIME</code> category. <code>POST_CALL</code> categories can
     * only be applied to post-call transcriptions and <code>REAL_TIME</code>
     * categories can only be applied to real-time transcriptions. If you do not
     * include <code>InputType</code>, your category is created as a
     * <code>POST_CALL</code> category by default.
     * </p>
     * <p>
     * Call Analytics categories are composed of rules. For each category, you
     * must create between 1 and 20 rules. Rules can include these parameters: ,
     * , , and .
     * </p>
     * <p>
     * To update an existing category, see .
     * </p>
     * <p>
     * To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
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
     * Creates a new custom language model.
     * </p>
     * <p>
     * When creating a new custom language model, you must specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband
     * (audio sample rates under 16,000 Hz) base model
     * </p>
     * </li>
     * <li>
     * <p>
     * The location of your training and tuning files (this must be an Amazon S3
     * URI)
     * </p>
     * </li>
     * <li>
     * <p>
     * The language of your model
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique name for your model
     * </p>
     * </li>
     * </ul>
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
     * Before creating a new custom medical vocabulary, you must first upload a
     * text file that contains your vocabulary table into an Amazon S3 bucket.
     * Note that this differs from , where you can include a list of terms
     * within your request using the <code>Phrases</code> flag;
     * <code>CreateMedicalVocabulary</code> does not support the
     * <code>Phrases</code> flag and only accepts vocabularies in table format.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * When creating a new custom vocabulary, you can either upload a text file
     * that contains your new entries, phrases, and terms into an Amazon S3
     * bucket and include the URI in your request. Or you can include a list of
     * terms directly in your request using the <code>Phrases</code> flag.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html"
     * >Custom vocabularies</a>.
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
     * Creates a new custom vocabulary filter.
     * </p>
     * <p>
     * You can use custom vocabulary filters to mask, delete, or flag specific
     * words from your transcript. Custom vocabulary filters are commonly used
     * to mask profanity in transcripts.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters
     * for that specific language. If you use unsupported characters, your
     * custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html"
     * >Character Sets for Custom Vocabularies</a> to get the character set for
     * your language.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/vocabulary-filtering.html"
     * >Vocabulary filtering</a>.
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
     * Deletes a Call Analytics category. To use this operation, specify the
     * name of the category you want to delete using <code>CategoryName</code>.
     * Category names are case sensitive.
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
     * Deletes a Call Analytics job. To use this operation, specify the name of
     * the job you want to delete using <code>CallAnalyticsJobName</code>. Job
     * names are case sensitive.
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
     * custom language model names are case sensitive.
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
     * Deletes a medical transcription job. To use this operation, specify the
     * name of the job you want to delete using
     * <code>MedicalTranscriptionJobName</code>. Job names are case sensitive.
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
     * name of the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a transcription job. To use this operation, specify the name of
     * the job you want to delete using <code>TranscriptionJobName</code>. Job
     * names are case sensitive.
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
     * the custom vocabulary you want to delete using
     * <code>VocabularyName</code>. Custom vocabulary names are case sensitive.
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
     * Deletes a custom vocabulary filter. To use this operation, specify the
     * name of the custom vocabulary filter you want to delete using
     * <code>VocabularyFilterName</code>. Custom vocabulary filter names are
     * case sensitive.
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
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This operation also shows if the base language model that you used to
     * create your custom language model has been updated. If Amazon Transcribe
     * has updated the base model, you can create a new custom language model
     * using the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
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
     * Provides information about the specified Call Analytics category.
     * </p>
     * <p>
     * To get a list of your Call Analytics categories, use the operation.
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
     * Provides information about the specified Call Analytics job.
     * </p>
     * <p>
     * To view the job's status, refer to <code>CallAnalyticsJobStatus</code>.
     * If the status is <code>COMPLETED</code>, the job is finished. You can
     * find your completed transcript at the URI specified in
     * <code>TranscriptFileUri</code>. If the status is <code>FAILED</code>,
     * <code>FailureReason</code> provides details on why your transcription job
     * failed.
     * </p>
     * <p>
     * If you enabled personally identifiable information (PII) redaction, the
     * redacted transcript appears at the location specified in
     * <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * If you chose to redact the audio in your media file, you can find your
     * redacted media file at the location specified in
     * <code>RedactedMediaFileUri</code>.
     * </p>
     * <p>
     * To get a list of your Call Analytics jobs, use the operation.
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
     * Provides information about the specified medical transcription job.
     * </p>
     * <p>
     * To view the status of the specified medical transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * To get a list of your medical transcription jobs, use the operation.
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
     * Provides information about the specified custom medical vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom medical vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom medical vocabularies, use the operation.
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
     * Provides information about the specified transcription job.
     * </p>
     * <p>
     * To view the status of the specified transcription job, check the
     * <code>TranscriptionJobStatus</code> field. If the status is
     * <code>COMPLETED</code>, the job is finished. You can find the results at
     * the location specified in <code>TranscriptFileUri</code>. If the status
     * is <code>FAILED</code>, <code>FailureReason</code> provides details on
     * why your transcription job failed.
     * </p>
     * <p>
     * If you enabled content redaction, the redacted transcript can be found at
     * the location specified in <code>RedactedTranscriptFileUri</code>.
     * </p>
     * <p>
     * To get a list of your transcription jobs, use the operation.
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
     * Provides information about the specified custom vocabulary.
     * </p>
     * <p>
     * To view the status of the specified custom vocabulary, check the
     * <code>VocabularyState</code> field. If the status is <code>READY</code>,
     * your custom vocabulary is available to use. If the status is
     * <code>FAILED</code>, <code>FailureReason</code> provides details on why
     * your custom vocabulary failed.
     * </p>
     * <p>
     * To get a list of your custom vocabularies, use the operation.
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
     * Provides information about the specified custom vocabulary filter.
     * </p>
     * <p>
     * To get a list of your custom vocabulary filters, use the operation.
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
     * Provides a list of Call Analytics categories, including all rules that
     * make up each category.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics category, use
     * the operation.
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
     * Provides a list of Call Analytics jobs that match the specified criteria.
     * If no criteria are specified, all Call Analytics jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific Call Analytics job, use the
     * operation.
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
     * Provides a list of custom language models that match the specified
     * criteria. If no criteria are specified, all custom language models are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom language model, use
     * the operation.
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
     * Provides a list of medical transcription jobs that match the specified
     * criteria. If no criteria are specified, all medical transcription jobs
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific medical transcription job,
     * use the operation.
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
     * Provides a list of custom medical vocabularies that match the specified
     * criteria. If no criteria are specified, all custom medical vocabularies
     * are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom medical vocabulary,
     * use the operation.
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
     * Lists all tags associated with the specified transcription job,
     * vocabulary, model, or resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
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
     * Provides a list of transcription jobs that match the specified criteria.
     * If no criteria are specified, all transcription jobs are returned.
     * </p>
     * <p>
     * To get detailed information about a specific transcription job, use the
     * operation.
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
     * Provides a list of custom vocabularies that match the specified criteria.
     * If no criteria are specified, all custom vocabularies are returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary, use the
     * operation.
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
     * Provides a list of custom vocabulary filters that match the specified
     * criteria. If no criteria are specified, all custom vocabularies are
     * returned.
     * </p>
     * <p>
     * To get detailed information about a specific custom vocabulary filter,
     * use the operation.
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
     * Transcribes the audio from a customer service call and applies any
     * additional Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Call Analytics
     * provides you with call characteristics, call summarization, speaker
     * sentiment, and optional redaction of your text transcript and your audio
     * file. You can also apply custom categories to flag specified conditions.
     * To learn more about these features and insights, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/call-analytics.html"
     * >Analyzing call center audio with Call Analytics</a>.
     * </p>
     * <p>
     * If you want to apply categories to your Call Analytics job, you must
     * create them before submitting your job request. Categories cannot be
     * retroactively applied to a job. To create a new category, use the
     * operation. To learn more about Call Analytics categories, see <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-batch.html"
     * >Creating categories for post-call transcriptions</a> and <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/tca-categories-stream.html"
     * >Creating categories for real-time transcriptions</a>.
     * </p>
     * <p>
     * To make a <code>StartCallAnalyticsJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * Note that job queuing is enabled by default for Call Analytics jobs.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartCallAnalyticsJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CallAnalyticsJobName</code>: A custom name that you create for your
     * transcription job that's unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataAccessRoleArn</code>: The Amazon Resource Name (ARN) of an IAM
     * role that has permissions to access the Amazon S3 bucket that contains
     * your input files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code> or
     * <code>RedactedMediaFileUri</code>): The Amazon S3 location of your media
     * file.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * With Call Analytics, you can redact the audio contained in your media
     * file by including <code>RedactedMediaFileUri</code>, instead of
     * <code>MediaFileUri</code>, to specify the location of your input audio.
     * If you choose to redact your audio, you can find your redacted media at
     * the location specified in the <code>RedactedMediaFileUri</code> field of
     * your response.
     * </p>
     * </note>
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
     * Transcribes the audio from a medical dictation or conversation and
     * applies any additional Request Parameters you choose to include in your
     * request.
     * </p>
     * <p>
     * In addition to many standard transcription features, Amazon Transcribe
     * Medical provides you with a robust medical vocabulary and, optionally,
     * content identification, which adds flags to personal health information
     * (PHI). To learn more about these features, refer to <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works-med.html"
     * >How Amazon Transcribe Medical works</a>.
     * </p>
     * <p>
     * To make a <code>StartMedicalTranscriptionJob</code> request, you must
     * first upload your media file into an Amazon S3 bucket; you can then
     * specify the S3 location of the file using the <code>Media</code>
     * parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartMedicalTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MedicalTranscriptionJobName</code>: A custom name you create for
     * your transcription job that is unique within your Amazon Web Services
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LanguageCode</code>: This must be <code>en-US</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputBucketName</code>: The Amazon S3 bucket where you want your
     * transcript stored. If you want your output stored in a sub-folder of this
     * bucket, you must also include <code>OutputKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Specialty</code>: This must be <code>PRIMARYCARE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>: Choose whether your audio is a conversation or a
     * dictation.
     * </p>
     * </li>
     * </ul>
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
     * Transcribes the audio from a media file and applies any additional
     * Request Parameters you choose to include in your request.
     * </p>
     * <p>
     * To make a <code>StartTranscriptionJob</code> request, you must first
     * upload your media file into an Amazon S3 bucket; you can then specify the
     * Amazon S3 location of the file using the <code>Media</code> parameter.
     * </p>
     * <p>
     * You must include the following parameters in your
     * <code>StartTranscriptionJob</code> request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>region</code>: The Amazon Web Services Region where you are making
     * your request. For a list of Amazon Web Services Regions supported with
     * Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe.html"
     * >Amazon Transcribe endpoints and quotas</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TranscriptionJobName</code>: A custom name you create for your
     * transcription job that is unique within your Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Media</code> (<code>MediaFileUri</code>): The Amazon S3 location of
     * your media file.
     * </p>
     * </li>
     * <li>
     * <p>
     * One of <code>LanguageCode</code>, <code>IdentifyLanguage</code>, or
     * <code>IdentifyMultipleLanguages</code>: If you know the language of your
     * media file, specify it using the <code>LanguageCode</code> parameter; you
     * can find all valid language codes in the <a href=
     * "https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html"
     * >Supported languages</a> table. If you don't know the languages spoken in
     * your media, use either <code>IdentifyLanguage</code> or
     * <code>IdentifyMultipleLanguages</code> and let Amazon Transcribe identify
     * the languages for you.
     * </p>
     * </li>
     * </ul>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to
     * the specified resource.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html"
     * >Tagging resources</a>.
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
     * Removes the specified tags from the specified Amazon Transcribe resource.
     * </p>
     * <p>
     * If you include <code>UntagResource</code> in your request, you must also
     * include <code>ResourceArn</code> and <code>TagKeys</code>.
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
     * Updates the specified Call Analytics category with new rules. Note that
     * the <code>UpdateCallAnalyticsCategory</code> operation overwrites all
     * existing rules contained in the specified category. You cannot append
     * additional rules onto an existing category.
     * </p>
     * <p>
     * To create a new category, see .
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
     * Updates an existing custom medical vocabulary with new values. This
     * operation overwrites all existing information with your new values; you
     * cannot append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom vocabulary with new values. This operation
     * overwrites all existing information with your new values; you cannot
     * append new terms onto an existing custom vocabulary.
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
     * Updates an existing custom vocabulary filter with a new list of words.
     * The new list you provide overwrites all previous entries; you cannot
     * append new terms onto an existing custom vocabulary filter.
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
