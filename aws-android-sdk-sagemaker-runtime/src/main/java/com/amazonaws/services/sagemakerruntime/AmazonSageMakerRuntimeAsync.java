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

package com.amazonaws.services.sagemakerruntime;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.sagemakerruntime.model.*;

/**
 * Interface for accessing Amazon SageMaker Runtime Service asynchronously.
 * <p>
 * The Amazon SageMaker runtime API.
 * </p>
 **/
public interface AmazonSageMakerRuntimeAsync extends AmazonSageMakerRuntime {
    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting
     * services, your client applications use this API to get inferences from
     * the model hosted at the specified endpoint.
     * </p>
     * <p>
     * For an overview of Amazon SageMaker, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html"
     * >How It Works</a>.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the
     * API. Amazon SageMaker might add additional headers. You should not rely
     * on the behavior of headers outside those enumerated in the request
     * syntax.
     * </p>
     * <p>
     * Cals to <code>InvokeEndpoint</code> are authenticated by using AWS
     * Signature Version 4. For information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"
     * >Authenticating Requests (AWS Signature Version 4)</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * <note>
     * <p>
     * Endpoints are scoped to an individual account, and are not public. The
     * URL does not contain the account ID, but Amazon SageMaker determines the
     * account ID from the authentication token that is supplied by the caller.
     * </p>
     * </note>
     * 
     * @param invokeEndpointRequest
     * @return A Java Future object containing the response from the
     *         InvokeEndpoint service method, as returned by Amazon SageMaker
     *         Runtime Service.
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ValidationErrorException
     * @throws ModelErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Runtime Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<InvokeEndpointResult> invokeEndpointAsync(InvokeEndpointRequest invokeEndpointRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting
     * services, your client applications use this API to get inferences from
     * the model hosted at the specified endpoint.
     * </p>
     * <p>
     * For an overview of Amazon SageMaker, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html"
     * >How It Works</a>.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the
     * API. Amazon SageMaker might add additional headers. You should not rely
     * on the behavior of headers outside those enumerated in the request
     * syntax.
     * </p>
     * <p>
     * Cals to <code>InvokeEndpoint</code> are authenticated by using AWS
     * Signature Version 4. For information, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html"
     * >Authenticating Requests (AWS Signature Version 4)</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * <note>
     * <p>
     * Endpoints are scoped to an individual account, and are not public. The
     * URL does not contain the account ID, but Amazon SageMaker determines the
     * account ID from the authentication token that is supplied by the caller.
     * </p>
     * </note>
     * 
     * @param invokeEndpointRequest
     * @param asyncHandler Asynchronous callback handler for events in the
     *            life-cycle of the request. Users could provide the
     *            implementation of the four callback methods in this interface
     *            to process the operation result or handle the exception.
     * @return A Java Future object containing the response from the
     *         InvokeEndpoint service method, as returned by Amazon SageMaker
     *         Runtime Service.
     * @throws InternalFailureException
     * @throws ServiceUnavailableException
     * @throws ValidationErrorException
     * @throws ModelErrorException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             SageMaker Runtime Service indicating either a problem with
     *             the data in the request, or a server side issue.
     */
    Future<InvokeEndpointResult> invokeEndpointAsync(InvokeEndpointRequest invokeEndpointRequest,
            AsyncHandler<InvokeEndpointRequest, InvokeEndpointResult> asyncHandler)
            throws AmazonServiceException, AmazonClientException;

}
