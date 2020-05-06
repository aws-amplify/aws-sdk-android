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

package com.amazonaws.services.codestar-connections;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.codestar-connections.model.*;

/**
 * Interface for accessing AWS CodeStar connections
 *
 * <p>This AWS CodeStar Connections API Reference provides descriptions and usage examples of the operations and data types for the AWS CodeStar Connections API. You can use the Connections API to work with connections and installations.</p> <p> <i>Connections</i> are configurations that you use to connect AWS resources to external code repositories. Each connection is a resource that can be given to services such as CodePipeline to connect to a third-party repository such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers your pipeline when a code change is made to your third-party code repository. Each connection is named and associated with a unique ARN that is used to reference the connection.</p> <p>When you create a connection, the console initiates a third-party connection handshake. <i>Installations</i> are the apps that are used to conduct this handshake. For example, the installation for the Bitbucket provider type is the Bitbucket Cloud app. When you create a connection, you can choose an existing installation or create one.</p> <p>You can work with connections by calling:</p> <ul> <li> <p> <a>CreateConnection</a>, which creates a uniquely named connection that can be referenced by services such as CodePipeline.</p> </li> <li> <p> <a>DeleteConnection</a>, which deletes the specified connection.</p> </li> <li> <p> <a>GetConnection</a>, which returns information about the connection, including the connection status.</p> </li> <li> <p> <a>ListConnections</a>, which lists the connections associated with your account.</p> </li> </ul> <p>For information about how to use AWS CodeStar Connections, see the <a href="https://docs.aws.amazon.com/codepipeline/latest/userguide/welcome.html">AWS CodePipeline User Guide</a>.</p>
 *
 **/
public interface AWSCodeStarConnections {

    /**
     * Overrides the default endpoint for this client ("https://codestar-connections.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "codestar-connections.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://codestar-connections.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "codestar-connections.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://codestar-connections.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCodeStarConnections#setEndpoint(String)}, sets the
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
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>Creates a connection that can then be given to other AWS services like CodePipeline so that it can access third-party code repositories. The connection is in pending status until the third-party connection handshake is completed from the console.</p>
     * @param createConnectionRequest 
     * @return createConnectionResult The response from the CreateConnection service method, as returned by AWS CodeStar connections.
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>The connection to be deleted.</p>
     * @param deleteConnectionRequest 
     * @return deleteConnectionResult The response from the DeleteConnection service method, as returned by AWS CodeStar connections.
     * @throws ResourceNotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the connection ARN and details such as status, owner, and provider type.</p>
     * @param getConnectionRequest 
     * @return getConnectionResult The response from the GetConnection service method, as returned by AWS CodeStar connections.
     * @throws ResourceNotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Lists the connections associated with your account.</p>
     * @param listConnectionsRequest 
     * @return listConnectionsResult The response from the ListConnections service method, as returned by AWS CodeStar connections.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListConnectionsResult listConnections(ListConnectionsRequest listConnectionsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Gets the set of key-value pairs (metadata) that are used to manage the resource.</p>
     * @param listTagsForResourceRequest 
     * @return listTagsForResourceResult The response from the ListTagsForResource service method, as returned by AWS CodeStar connections.
     * @throws ResourceNotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.</p>
     * @param tagResourceRequest 
     * @return tagResourceResult The response from the TagResource service method, as returned by AWS CodeStar connections.
     * @throws ResourceNotFoundException 
     * @throws LimitExceededException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Removes tags from an AWS resource.</p>
     * @param untagResourceRequest 
     * @return untagResourceResult The response from the UntagResource service method, as returned by AWS CodeStar connections.
     * @throws ResourceNotFoundException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWS CodeStar connections indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
