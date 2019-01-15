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

package com.amazonaws.services.polly;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.polly.model.*;

/**
 * Interface for accessing Amazon Polly
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from
 * text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing
 * high-quality speech from plain text and Speech Synthesis Markup Language
 * (SSML), along with managing pronunciations lexicons that enable you to get
 * the best results for your application domain.
 * </p>
 **/
public interface AmazonPolly {

    /**
     * Overrides the default endpoint for this client
     * ("https://https://polly.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "https://polly.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://https://polly.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex:
     *            "https://polly.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://https://polly.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonPolly#setEndpoint(String)}, sets the
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
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A
     * lexicon which has been deleted is not available for speech synthesis, nor
     * is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @return deleteLexiconResult The response from the DeleteLexicon service
     *         method, as returned by Amazon Polly.
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteLexiconResult deleteLexicon(DeleteLexiconRequest deleteLexiconRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the list of voices that are available for use when requesting
     * speech synthesis. Each voice speaks a specified language, is either male
     * or female, and is identified by an ID, which is the ASCII version of the
     * voice name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide
     * the voice ID for the voice you want from the list of voices returned by
     * <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a
     * specific language, but giving a user the option to choose the voice.
     * Using the <code>DescribeVoices</code> operation you can provide the user
     * with a list of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available
     * voices. For example, if you specify <code>en-US</code>, the operation
     * returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @return describeVoicesResult The response from the DescribeVoices service
     *         method, as returned by Amazon Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeVoicesResult describeVoices(DescribeVoicesRequest describeVoicesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the content of the specified pronunciation lexicon stored in an
     * AWS Region. For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @return getLexiconResult The response from the GetLexicon service method,
     *         as returned by Amazon Polly.
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetLexiconResult getLexicon(GetLexiconRequest getLexiconRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This
     * object contains information about the given speech synthesis task,
     * including the status of the task, and a link to the S3 bucket containing
     * the output of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @return getSpeechSynthesisTaskResult The response from the
     *         GetSpeechSynthesisTask service method, as returned by Amazon
     *         Polly.
     * @throws InvalidTaskIdException
     * @throws ServiceFailureException
     * @throws SynthesisTaskNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetSpeechSynthesisTaskResult getSpeechSynthesisTask(
            GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return listLexiconsResult The response from the ListLexicons service
     *         method, as returned by Amazon Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListLexiconsResult listLexicons(ListLexiconsRequest listLexiconsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of SpeechSynthesisTask objects ordered by their creation
     * date. This operation can filter the tasks by their status, for example,
     * allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @return listSpeechSynthesisTasksResult The response from the
     *         ListSpeechSynthesisTasks service method, as returned by Amazon
     *         Polly.
     * @throws InvalidNextTokenException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(
            ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the
     * same name already exists in the region, it is overwritten by the new
     * lexicon. Lexicon operations have eventual consistency, therefore, it
     * might take some time before the lexicon is available to the
     * SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
     * >Managing Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @return putLexiconResult The response from the PutLexicon service method,
     *         as returned by Amazon Polly.
     * @throws InvalidLexiconException
     * @throws UnsupportedPlsAlphabetException
     * @throws UnsupportedPlsLanguageException
     * @throws LexiconSizeExceededException
     * @throws MaxLexemeLengthExceededException
     * @throws MaxLexiconsNumberExceededException
     * @throws ServiceFailureException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    PutLexiconResult putLexicon(PutLexiconRequest putLexiconRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Allows the creation of an asynchronous synthesis task, by starting a new
     * <code>SpeechSynthesisTask</code>. This operation requires all the
     * standard information needed for speech synthesis, plus the name of an
     * Amazon S3 bucket for the service to store the output of the synthesis
     * task and two optional parameters (OutputS3KeyPrefix and SnsTopicArn).
     * Once the synthesis task is created, this operation will return a
     * SpeechSynthesisTask object, which will include an identifier of this task
     * as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @return startSpeechSynthesisTaskResult The response from the
     *         StartSpeechSynthesisTask service method, as returned by Amazon
     *         Polly.
     * @throws TextLengthExceededException
     * @throws InvalidS3BucketException
     * @throws InvalidS3KeyException
     * @throws InvalidSampleRateException
     * @throws InvalidSnsTopicArnException
     * @throws InvalidSsmlException
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws MarksNotSupportedForFormatException
     * @throws SsmlMarksNotSupportedForTextTypeException
     * @throws LanguageNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartSpeechSynthesisTaskResult startSpeechSynthesisTask(
            StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML
     * input must be valid, well-formed SSML. Some alphabets might not be
     * available with all the voices (for example, Cyrillic might not be read at
     * all by English voices) unless phoneme mapping is used. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html"
     * >How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return synthesizeSpeechResult The response from the SynthesizeSpeech
     *         service method, as returned by Amazon Polly.
     * @throws TextLengthExceededException
     * @throws InvalidSampleRateException
     * @throws InvalidSsmlException
     * @throws LexiconNotFoundException
     * @throws ServiceFailureException
     * @throws MarksNotSupportedForFormatException
     * @throws SsmlMarksNotSupportedForTextTypeException
     * @throws LanguageNotSupportedException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Polly indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest synthesizeSpeechRequest)
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
