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

package com.amazonaws.services.machinelearning;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.machinelearning.model.*;

/**
 * Interface for accessing Amazon Machine Learning Definition of the public APIs
 * exposed by Amazon Machine Learning
 **/
public interface AmazonMachineLearning {

    /**
     * Overrides the default endpoint for this client
     * ("https://machinelearning.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "machinelearning.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://machinelearning.us-east-1.amazonaws.com"). If the
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
     *            "machinelearning.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://machinelearning.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonMachineLearning#setEndpoint(String)}, sets
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
     * Returns an <code>MLModel</code> that includes detailed metadata, data
     * source information, and the current status of the <code>MLModel</code>.
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     * 
     * @param getMLModelRequest
     * @return getMLModelResult The response from the GetMLModel service method,
     *         as returned by Amazon Machine Learning.
     * @throws InvalidInputException <p>
     *             An error on the client occurred. Typically, the cause is an
     *             invalid input value.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             A specified resource cannot be located.
     *             </p>
     * @throws InternalServerException <p>
     *             An error on the server occurred when trying to process a
     *             request.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Machine Learning indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    GetMLModelResult getMLModel(GetMLModelRequest getMLModelRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Generates a prediction for the observation using the specified
     * <code>ML Model</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * Not all response parameters will be populated. Whether a response
     * parameter is populated depends on the type of model requested.
     * </p>
     * </note>
     * 
     * @param predictRequest
     * @return predictResult The response from the Predict service method, as
     *         returned by Amazon Machine Learning.
     * @throws InvalidInputException <p>
     *             An error on the client occurred. Typically, the cause is an
     *             invalid input value.
     *             </p>
     * @throws ResourceNotFoundException <p>
     *             A specified resource cannot be located.
     *             </p>
     * @throws LimitExceededException <p>
     *             The subscriber exceeded the maximum number of operations.
     *             This exception can occur when listing objects such as
     *             <code>DataSource</code>.
     *             </p>
     * @throws InternalServerException <p>
     *             An error on the server occurred when trying to process a
     *             request.
     *             </p>
     * @throws PredictorNotMountedException <p>
     *             The exception is thrown when a predict request is made to an
     *             unmounted <code>MLModel</code>.
     *             </p>
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Machine Learning indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    PredictResult predict(PredictRequest predictRequest) throws AmazonClientException,
            AmazonServiceException;

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
