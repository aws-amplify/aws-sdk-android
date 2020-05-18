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

package com.amazonaws.services.qldb;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.qldb.model.*;

/**
 * Interface for accessing Amazon QLDB
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 **/
public interface AmazonQLDB {

    /**
     * Overrides the default endpoint for this client
     * ("https://qldb.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "qldb.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://qldb.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "qldb.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://qldb.us-east-1.amazonaws.com") of the region specific
     *            AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonQLDB#setEndpoint(String)}, sets the
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
     * Ends a given Amazon QLDB journal stream. Before a stream can be canceled,
     * its current status must be <code>ACTIVE</code>.
     * </p>
     * <p>
     * You can't restart a stream after you cancel it. Canceled QLDB stream
     * resources are subject to a 7-day retention period, so they are
     * automatically deleted after this limit expires.
     * </p>
     * 
     * @param cancelJournalKinesisStreamRequest
     * @return cancelJournalKinesisStreamResult The response from the
     *         CancelJournalKinesisStream service method, as returned by Amazon
     *         QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CancelJournalKinesisStreamResult cancelJournalKinesisStream(
            CancelJournalKinesisStreamRequest cancelJournalKinesisStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @return createLedgerResult The response from the CreateLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceAlreadyExistsException
     * @throws LimitExceededException
     * @throws ResourceInUseException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateLedgerResult createLedger(CreateLedgerRequest createLedgerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a ledger and all of its contents. This action is irreversible.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you
     * can delete the ledger using the QLDB API or the AWS Command Line
     * Interface (AWS CLI). You can disable it by calling the
     * <code>UpdateLedger</code> operation to set the flag to <code>false</code>
     * . The QLDB console disables deletion protection for you when you use it
     * to delete a ledger.
     * </p>
     * 
     * @param deleteLedgerRequest
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    void deleteLedger(DeleteLedgerRequest deleteLedgerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns detailed information about a given Amazon QLDB journal stream.
     * The output includes the Amazon Resource Name (ARN), stream name, current
     * status, creation time, and the parameters of your original stream
     * creation request.
     * </p>
     * 
     * @param describeJournalKinesisStreamRequest
     * @return describeJournalKinesisStreamResult The response from the
     *         DescribeJournalKinesisStream service method, as returned by
     *         Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeJournalKinesisStreamResult describeJournalKinesisStream(
            DescribeJournalKinesisStreamRequest describeJournalKinesisStreamRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a journal export job, including the ledger
     * name, export ID, when it was created, current status, and its start and
     * end time export parameters.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * If the export job with the given <code>ExportId</code> doesn't exist,
     * then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param describeJournalS3ExportRequest
     * @return describeJournalS3ExportResult The response from the
     *         DescribeJournalS3Export service method, as returned by Amazon
     *         QLDB.
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeJournalS3ExportResult describeJournalS3Export(
            DescribeJournalS3ExportRequest describeJournalS3ExportRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns information about a ledger, including its state and when it was
     * created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @return describeLedgerResult The response from the DescribeLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeLedgerResult describeLedger(DescribeLedgerRequest describeLedgerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Exports journal contents within a date and time range from a ledger into
     * a specified Amazon Simple Storage Service (Amazon S3) bucket. The data is
     * written as files in Amazon Ion format.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> is in
     * <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * You can initiate up to two concurrent journal export requests for each
     * ledger. Beyond this limit, journal export requests throw
     * <code>LimitExceededException</code>.
     * </p>
     * 
     * @param exportJournalToS3Request
     * @return exportJournalToS3Result The response from the ExportJournalToS3
     *         service method, as returned by Amazon QLDB.
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ExportJournalToS3Result exportJournalToS3(ExportJournalToS3Request exportJournalToS3Request)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a journal block object at a specified address in a ledger. Also
     * returns a proof of the specified block for verification if
     * <code>DigestTipAddress</code> is provided.
     * </p>
     * <p>
     * If the specified ledger doesn't exist or is in <code>DELETING</code>
     * status, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the specified ledger is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * If no block exists with the specified address, then throws
     * <code>InvalidParameterException</code>.
     * </p>
     * 
     * @param getBlockRequest
     * @return getBlockResult The response from the GetBlock service method, as
     *         returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetBlockResult getBlock(GetBlockRequest getBlockRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns the digest of a ledger at the latest committed block in the
     * journal. The response includes a 256-bit hash value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @return getDigestResult The response from the GetDigest service method,
     *         as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetDigestResult getDigest(GetDigestRequest getDigestRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a revision data object for a specified document ID and block
     * address. Also returns a proof of the specified revision for verification
     * if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @return getRevisionResult The response from the GetRevision service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of all Amazon QLDB journal stream descriptors for a
     * given ledger. The output of each stream descriptor includes the same
     * details that are returned by <code>DescribeJournalKinesisStream</code>.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items. It is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalKinesisStreamsForLedger</code> multiple times.
     * </p>
     * 
     * @param listJournalKinesisStreamsForLedgerRequest
     * @return listJournalKinesisStreamsForLedgerResult The response from the
     *         ListJournalKinesisStreamsForLedger service method, as returned by
     *         Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListJournalKinesisStreamsForLedgerResult listJournalKinesisStreamsForLedger(
            ListJournalKinesisStreamsForLedgerRequest listJournalKinesisStreamsForLedgerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of journal export job descriptions for all ledgers that
     * are associated with the current AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalS3Exports</code> multiple times.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param listJournalS3ExportsRequest
     * @return listJournalS3ExportsResult The response from the
     *         ListJournalS3Exports service method, as returned by Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListJournalS3ExportsResult listJournalS3Exports(
            ListJournalS3ExportsRequest listJournalS3ExportsRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns an array of journal export job descriptions for a specified
     * ledger.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is
     * paginated so that you can retrieve all the items by calling
     * <code>ListJournalS3ExportsForLedger</code> multiple times.
     * </p>
     * <p>
     * This action does not return any expired export jobs. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
     * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * 
     * @param listJournalS3ExportsForLedgerRequest
     * @return listJournalS3ExportsForLedgerResult The response from the
     *         ListJournalS3ExportsForLedger service method, as returned by
     *         Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(
            ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns an array of ledger summaries that are associated with the current
     * AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of 100 items and is paginated so that you
     * can retrieve all the items by calling <code>ListLedgers</code> multiple
     * times.
     * </p>
     * 
     * @param listLedgersRequest
     * @return listLedgersResult The response from the ListLedgers service
     *         method, as returned by Amazon QLDB.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListLedgersResult listLedgers(ListLedgersRequest listLedgersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates a stream for a given Amazon QLDB ledger that delivers the journal
     * data to a specified Amazon Kinesis Data Streams resource. The stream
     * captures every document revision that is committed to your journal and
     * sends it to the Kinesis data stream.
     * </p>
     * 
     * @param streamJournalToKinesisRequest
     * @return streamJournalToKinesisResult The response from the
     *         StreamJournalToKinesis service method, as returned by Amazon
     *         QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws ResourcePreconditionNotMetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StreamJournalToKinesisResult streamJournalToKinesis(
            StreamJournalToKinesisRequest streamJournalToKinesisRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds one or more tags to a specified Amazon QLDB resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags
     * for a resource, your request fails and returns an error.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from a specified Amazon QLDB resource. You can
     * specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @return updateLedgerResult The response from the UpdateLedger service
     *         method, as returned by Amazon QLDB.
     * @throws InvalidParameterException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             QLDB indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateLedgerResult updateLedger(UpdateLedgerRequest updateLedgerRequest)
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
