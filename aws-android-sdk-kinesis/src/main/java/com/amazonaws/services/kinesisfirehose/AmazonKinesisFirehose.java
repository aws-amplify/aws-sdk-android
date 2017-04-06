/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisfirehose;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.kinesisfirehose.model.*;

/**
 * Interface for accessing Amazon Kinesis Firehose <fullname>Amazon Kinesis
 * Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Firehose is a fully-managed service that delivers real-time
 * streaming data to destinations such as Amazon Simple Storage Service (Amazon
 * S3), Amazon Elasticsearch Service (Amazon ES), and Amazon Redshift.
 * </p>
 **/
public interface AmazonKinesisFirehose {

    /**
     * Overrides the default endpoint for this client
     * ("https://firehose.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "firehose.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://firehose.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "firehose.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://firehose.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonKinesisFirehose#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     * Writes multiple data records into a delivery stream in a single call,
     * which can achieve higher throughput per producer than when writing single
     * records. To write single data records into a delivery stream, use
     * <a>PutRecord</a>. Applications using these operations are referred to as
     * producers.
     * </p>
     * <p>
     * Each <a>PutRecordBatch</a> request supports up to 500 records. Each
     * record in the request can be as large as 1,000 KB (before 64-bit
     * encoding), up to a limit of 4 MB for the entire request. By default, each
     * delivery stream can take in up to 2,000 transactions per second, 5,000
     * records per second, or 5 MB per second. Note that if you use
     * <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate
     * across these two operations for each delivery stream. For more
     * information about limits and how to request an increase, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon
     * Kinesis Firehose Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when
     * using <a>PutRecord</a>. The data record consists of a data blob that can
     * be up to 1,000 KB in size, and any kind of data, for example, a segment
     * from a log file, geographic location data, web site clickstream data, and
     * so on.
     * </p>
     * <p>
     * Firehose buffers records before delivering them to the destination. To
     * disambiguate the data blobs at the destination, a common solution is to
     * use delimiters in the data, such as a newline (<code>\n</code>) or some
     * other character unique within the data. This allows the consumer
     * application(s) to parse individual data items when reading the data from
     * the destination.
     * </p>
     * <p>
     * The <a>PutRecordBatch</a> response includes a count of any failed
     * records, <b>FailedPutCount</b>, and an array of responses,
     * <b>RequestResponses</b>. The <b>FailedPutCount</b> value is a count of
     * records that failed. Each entry in the <b>RequestResponses</b> array
     * gives additional information of the processed record. Each entry in
     * <b>RequestResponses</b> directly correlates with a record in the request
     * array using the same ordering, from the top to the bottom of the request
     * and response. <b>RequestResponses</b> always includes the same number of
     * records as the request array. <b>RequestResponses</b> both successfully
     * and unsuccessfully processed records. Firehose attempts to process all
     * records in each <a>PutRecordBatch</a> request. A single record failure
     * does not stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes a <b>RecordId</b> value, which
     * is a unique value identified for the record. An unsuccessfully processed
     * record includes <b>ErrorCode</b> and <b>ErrorMessage</b> values.
     * <b>ErrorCode</b> reflects the type of error and is one of the following
     * values: <code>ServiceUnavailable</code> or <code>InternalFailure</code>.
     * <code>ErrorMessage</code> provides more detailed information about the
     * error.
     * </p>
     * <p>
     * If <b>FailedPutCount</b> is greater than 0 (zero), retry the request. A
     * retry of the entire batch of records is possible; however, we strongly
     * recommend that you inspect the entire response and resend only those
     * records that failed processing. This minimizes duplicate records and also
     * reduces the total bytes sent (and corresponding charges).
     * </p>
     * <p>
     * If the <a>PutRecordBatch</a> operation throws a
     * <b>ServiceUnavailableException</b>, back off and retry. If the exception
     * persists, it is possible that the throughput limits have been exceeded
     * for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Firehose are stored for 24 hours from the time they
     * are added to a delivery stream as it attempts to send the records to the
     * destination. If the destination is unreachable for more than 24 hours,
     * the data is no longer available.
     * </p>
     * 
     * @param putRecordBatchRequest <p>
     *            Contains the parameters for <a>PutRecordBatch</a>.
     *            </p>
     * @return putRecordBatchResult The response from the PutRecordBatch service
     *         method, as returned by Amazon Kinesis Firehose.
     * @throws ResourceNotFoundException
     * @throws InvalidArgumentException
     * @throws ServiceUnavailableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Kinesis Firehose indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PutRecordBatchResult putRecordBatch(PutRecordBatchRequest putRecordBatchRequest)
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
