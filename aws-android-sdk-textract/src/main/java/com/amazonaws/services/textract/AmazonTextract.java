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

package com.amazonaws.services.textract;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.textract.model.*;

/**
 * Interface for accessing Amazon Textract
 * <p>
 * Amazon Textract detects and analyzes text in documents and converts it into
 * machine-readable text. This is the API reference documentation for Amazon
 * Textract.
 * </p>
 **/
public interface AmazonTextract {

    /**
     * Overrides the default endpoint for this client
     * ("https://textract.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "textract.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://textract.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
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
     * @param endpoint The endpoint (ex: "textract.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://textract.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonTextract#setEndpoint(String)}, sets the
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
     * Analyzes an input document for relationships between detected items.
     * </p>
     * <p>
     * The types of information returned are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related
     * information is returned in two <a>Block</a> objects each of type
     * <code>KEY_VALUE_SET</code>: a KEY Block object and a VALUE Block object.
     * For example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block object contains information
     * about a detected table. A CELL Block object is returned for each cell in
     * a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Selectable elements such as checkboxes and radio buttons. A
     * SELECTION_ELEMENT Block object contains information about a selectable
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE Block object contains one or more WORD
     * Block objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can choose which type of analysis to perform by specifying the
     * <code>FeatureTypes</code> list.
     * </p>
     * <p>
     * The output is returned in a list of <code>BLOCK</code> objects.
     * </p>
     * <p>
     * <code>AnalyzeDocument</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentAnalysis</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param analyzeDocumentRequest
     * @return analyzeDocumentResult The response from the AnalyzeDocument
     *         service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AnalyzeDocumentResult analyzeDocument(AnalyzeDocumentRequest analyzeDocumentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Detects text in the input document. Amazon Textract can detect lines of
     * text and the words that make up a line of text. The input document must
     * be an image in JPG or PNG format. <code>DetectDocumentText</code> returns
     * the detected text in an array of <a>Block</a> objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * <code>DetectDocumentText</code> is a synchronous operation. To analyze
     * documents asynchronously, use <a>StartDocumentTextDetection</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param detectDocumentTextRequest
     * @return detectDocumentTextResult The response from the DetectDocumentText
     *         service method, as returned by Amazon Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DetectDocumentTextResult detectDocumentText(DetectDocumentTextRequest detectDocumentTextRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * analyzes text in a document.
     * </p>
     * <p>
     * You start asynchronous text analysis by calling
     * <a>StartDocumentAnalysis</a>, which returns a job identifier (
     * <code>JobId</code>). When the text analysis operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentAnalysis</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentAnalysis</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * <code>GetDocumentAnalysis</code> returns an array of <a>Block</a>
     * objects. The following types of information are returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Words and lines that are related to nearby lines and words. The related
     * information is returned in two <a>Block</a> objects each of type
     * <code>KEY_VALUE_SET</code>: a KEY Block object and a VALUE Block object.
     * For example, <i>Name: Ana Silva Carolina</i> contains a key and value.
     * <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Table and table cell data. A TABLE Block object contains information
     * about a detected table. A CELL Block object is returned for each cell in
     * a table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Selectable elements such as checkboxes and radio buttons. A
     * SELECTION_ELEMENT Block object contains information about a selectable
     * element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lines and words of text. A LINE Block object contains one or more WORD
     * Block objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <code>MaxResults</code> parameter to limit the number of blocks
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code>
     * request parameter with the token value that's returned from the previous
     * call to <code>GetDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param getDocumentAnalysisRequest
     * @return getDocumentAnalysisResult The response from the
     *         GetDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentAnalysisResult getDocumentAnalysis(
            GetDocumentAnalysisRequest getDocumentAnalysisRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the results for an Amazon Textract asynchronous operation that
     * detects text in a document. Amazon Textract can detect lines of text and
     * the words that make up a line of text.
     * </p>
     * <p>
     * You start asynchronous text detection by calling
     * <a>StartDocumentTextDetection</a>, which returns a job identifier (
     * <code>JobId</code>). When the text detection operation finishes, Amazon
     * Textract publishes a completion status to the Amazon Simple Notification
     * Service (Amazon SNS) topic that's registered in the initial call to
     * <code>StartDocumentTextDetection</code>. To get the results of the
     * text-detection operation, first check that the status value published to
     * the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <code>GetDocumentTextDetection</code>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a>
     * objects.
     * </p>
     * <p>
     * Each document page has as an associated <code>Block</code> of type PAGE.
     * Each PAGE <code>Block</code> object is the parent of LINE
     * <code>Block</code> objects that represent the lines of detected text on a
     * page. A LINE <code>Block</code> object is a parent for each word that
     * makes up the line. Words are represented by <code>Block</code> objects of
     * type WORD.
     * </p>
     * <p>
     * Use the MaxResults parameter to limit the number of blocks that are
     * returned. If there are more results than specified in
     * <code>MaxResults</code>, the value of <code>NextToken</code> in the
     * operation response contains a pagination token for getting the next set
     * of results. To get the next page of results, call
     * <code>GetDocumentTextDetection</code>, and populate the
     * <code>NextToken</code> request parameter with the token value that's
     * returned from the previous call to <code>GetDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param getDocumentTextDetectionRequest
     * @return getDocumentTextDetectionResult The response from the
     *         GetDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InvalidJobIdException
     * @throws InternalServerErrorException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDocumentTextDetectionResult getDocumentTextDetection(
            GetDocumentTextDetectionRequest getDocumentTextDetectionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts asynchronous analysis of an input document for relationships
     * between detected items such as key and value pairs, tables, and selection
     * elements.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> can analyze text in documents that are
     * in JPG, PNG, and PDF format. The documents are stored in an Amazon S3
     * bucket. Use <a>DocumentLocation</a> to specify the bucket name and file
     * name of the document.
     * </p>
     * <p>
     * <code>StartDocumentAnalysis</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text analysis is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text analysis operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentAnalysis</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentAnalysis</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html"
     * >Document Text Analysis</a>.
     * </p>
     * 
     * @param startDocumentAnalysisRequest
     * @return startDocumentAnalysisResult The response from the
     *         StartDocumentAnalysis service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDocumentAnalysisResult startDocumentAnalysis(
            StartDocumentAnalysisRequest startDocumentAnalysisRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Starts the asynchronous detection of text in a document. Amazon Textract
     * can detect lines of text and the words that make up a line of text.
     * </p>
     * <p>
     * <code>StartDocumentTextDetection</code> can analyze text in documents
     * that are in JPG, PNG, and PDF format. The documents are stored in an
     * Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name
     * and file name of the document.
     * </p>
     * <p>
     * <code>StartTextDetection</code> returns a job identifier (
     * <code>JobId</code>) that you use to get the results of the operation.
     * When text detection is finished, Amazon Textract publishes a completion
     * status to the Amazon Simple Notification Service (Amazon SNS) topic that
     * you specify in <code>NotificationChannel</code>. To get the results of
     * the text detection operation, first check that the status value published
     * to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
     * <a>GetDocumentTextDetection</a>, and pass the job identifier (
     * <code>JobId</code>) from the initial call to
     * <code>StartDocumentTextDetection</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
     * >Document Text Detection</a>.
     * </p>
     * 
     * @param startDocumentTextDetectionRequest
     * @return startDocumentTextDetectionResult The response from the
     *         StartDocumentTextDetection service method, as returned by Amazon
     *         Textract.
     * @throws InvalidParameterException
     * @throws InvalidS3ObjectException
     * @throws UnsupportedDocumentException
     * @throws DocumentTooLargeException
     * @throws BadDocumentException
     * @throws AccessDeniedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws IdempotentParameterMismatchException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Textract indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartDocumentTextDetectionResult startDocumentTextDetection(
            StartDocumentTextDetectionRequest startDocumentTextDetectionRequest)
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
