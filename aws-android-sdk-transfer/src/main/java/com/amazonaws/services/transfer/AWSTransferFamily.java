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

package com.amazonaws.services.transfer;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.transfer.model.*;

/**
 * Interface for accessing AWS Transfer Family
 * <p>
 * AWS Transfer Family is a fully managed service that enables the transfer of
 * files over the the File Transfer Protocol (FTP), File Transfer Protocol over
 * SSL (FTPS), or Secure Shell (SSH) File Transfer Protocol (SFTP) directly into
 * and out of Amazon Simple Storage Service (Amazon S3). AWS helps you
 * seamlessly migrate your file transfer workflows to AWS Transfer Family by
 * integrating with existing authentication systems, and providing DNS routing
 * with Amazon Route 53 so nothing changes for your customers and partners, or
 * their applications. With your data in Amazon S3, you can use it with AWS
 * services for processing, analytics, machine learning, and archiving. Getting
 * started with AWS Transfer Family is easy since there is no infrastructure to
 * buy and set up.
 * </p>
 **/
public interface AWSTransferFamily {

    /**
     * Overrides the default endpoint for this client
     * ("https://transfer.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "transfer.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://transfer.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "transfer.us-east-1.amazonaws.com") or
     *            a full URL, including the protocol (ex:
     *            "https://transfer.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSTransferFamily#setEndpoint(String)}, sets the
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
     * Instantiates an autoscaling virtual server based on the selected file
     * transfer protocol in AWS. When you make updates to your file transfer
     * protocol-enabled server or when you work with users, use the
     * service-generated <code>ServerId</code> property that is assigned to the
     * newly created server.
     * </p>
     * 
     * @param createServerRequest
     * @return createServerResult The response from the CreateServer service
     *         method, as returned by AWS Transfer Family.
     * @throws AccessDeniedException
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceExistsException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateServerResult createServer(CreateServerRequest createServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a user and associates them with an existing file transfer
     * protocol-enabled server. You can only create and associate users with
     * servers that have the <code>IdentityProviderType</code> set to
     * <code>SERVICE_MANAGED</code>. Using parameters for
     * <code>CreateUser</code>, you can specify the user name, set the home
     * directory, store the user's public key, and assign the user's AWS
     * Identity and Access Management (IAM) role. You can also optionally add a
     * scope-down policy, and assign metadata with tags that can be used to
     * group and search for users.
     * </p>
     * 
     * @param createUserRequest
     * @return createUserResult The response from the CreateUser service method,
     *         as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes the file transfer protocol-enabled server that you specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * 
     * @param deleteServerRequest
     * @throws AccessDeniedException
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteServer(DeleteServerRequest deleteServerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a user's Secure Shell (SSH) public key.
     * </p>
     * <p>
     * No response is returned from this operation.
     * </p>
     * 
     * @param deleteSshPublicKeyRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteSshPublicKey(DeleteSshPublicKeyRequest deleteSshPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes the user belonging to a file transfer protocol-enabled server you
     * specify.
     * </p>
     * <p>
     * No response returns from this operation.
     * </p>
     * <note>
     * <p>
     * When you delete a user from a server, the user's information is lost.
     * </p>
     * </note>
     * 
     * @param deleteUserRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void deleteUser(DeleteUserRequest deleteUserRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Describes a file transfer protocol-enabled server that you specify by
     * passing the <code>ServerId</code> parameter.
     * </p>
     * <p>
     * The response contains a description of a server's properties. When you
     * set <code>EndpointType</code> to VPC, the response will contain the
     * <code>EndpointDetails</code>.
     * </p>
     * 
     * @param describeServerRequest
     * @return describeServerResult The response from the DescribeServer service
     *         method, as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeServerResult describeServer(DescribeServerRequest describeServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Describes the user assigned to the specific file transfer
     * protocol-enabled server, as identified by its <code>ServerId</code>
     * property.
     * </p>
     * <p>
     * The response from this call returns the properties of the user associated
     * with the <code>ServerId</code> value that was specified.
     * </p>
     * 
     * @param describeUserRequest
     * @return describeUserResult The response from the DescribeUser service
     *         method, as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds a Secure Shell (SSH) public key to a user account identified by a
     * <code>UserName</code> value assigned to the specific file transfer
     * protocol-enabled server, identified by <code>ServerId</code>.
     * </p>
     * <p>
     * The response returns the <code>UserName</code> value, the
     * <code>ServerId</code> value, and the name of the
     * <code>SshPublicKeyId</code>.
     * </p>
     * 
     * @param importSshPublicKeyRequest
     * @return importSshPublicKeyResult The response from the ImportSshPublicKey
     *         service method, as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ImportSshPublicKeyResult importSshPublicKey(ImportSshPublicKeyRequest importSshPublicKeyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the file transfer protocol-enabled servers that are associated with
     * your AWS account.
     * </p>
     * 
     * @param listServersRequest
     * @return listServersResult The response from the ListServers service
     *         method, as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListServersResult listServers(ListServersRequest listServersRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Number (ARN)
     * you specify. The resource can be a user, server, or role.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by AWS Transfer
     *         Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidRequestException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists the users for a file transfer protocol-enabled server that you
     * specify by passing the <code>ServerId</code> parameter.
     * </p>
     * 
     * @param listUsersRequest
     * @return listUsersResult The response from the ListUsers service method,
     *         as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidNextTokenException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from
     * <code>OFFLINE</code> to <code>ONLINE</code>. It has no impact on a server
     * that is already <code>ONLINE</code>. An <code>ONLINE</code> server can
     * accept and process file transfer jobs.
     * </p>
     * <p>
     * The state of <code>STARTING</code> indicates that the server is in an
     * intermediate state, either not fully able to respond, or not fully
     * online. The values of <code>START_FAILED</code> can indicate an error
     * condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param startServerRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void startServer(StartServerRequest startServerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Changes the state of a file transfer protocol-enabled server from
     * <code>ONLINE</code> to <code>OFFLINE</code>. An <code>OFFLINE</code>
     * server cannot accept and process file transfer jobs. Information tied to
     * your server, such as server and user properties, are not affected by
     * stopping your server. Stopping the server will not reduce or impact your
     * file transfer protocol endpoint billing.
     * </p>
     * <p>
     * The state of <code>STOPPING</code> indicates that the server is in an
     * intermediate state, either not fully able to respond, or not fully
     * offline. The values of <code>STOP_FAILED</code> can indicate an error
     * condition.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param stopServerRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void stopServer(StopServerRequest stopServerRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon
     * Resource Name (ARN). Resources are users, servers, roles, and other
     * entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void tagResource(TagResourceRequest tagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * If the <code>IdentityProviderType</code> of a file transfer
     * protocol-enabled server is <code>API_Gateway</code>, tests whether your
     * API Gateway is set up successfully. We highly recommend that you call
     * this operation to test your authentication method as soon as you create
     * your server. By doing so, you can troubleshoot issues with the API
     * Gateway integration to ensure that your users can successfully use the
     * service.
     * </p>
     * 
     * @param testIdentityProviderRequest
     * @return testIdentityProviderResult The response from the
     *         TestIdentityProvider service method, as returned by AWS Transfer
     *         Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    TestIdentityProviderResult testIdentityProvider(
            TestIdentityProviderRequest testIdentityProviderRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Detaches a key-value pair from a resource, as identified by its Amazon
     * Resource Name (ARN). Resources are users, servers, roles, and other
     * entities.
     * </p>
     * <p>
     * No response is returned from this call.
     * </p>
     * 
     * @param untagResourceRequest
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    void untagResource(UntagResourceRequest untagResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Updates the file transfer protocol-enabled server's properties after that
     * server has been created.
     * </p>
     * <p>
     * The <code>UpdateServer</code> call returns the <code>ServerId</code> of
     * the server you updated.
     * </p>
     * 
     * @param updateServerRequest
     * @return updateServerResult The response from the UpdateServer service
     *         method, as returned by AWS Transfer Family.
     * @throws AccessDeniedException
     * @throws ServiceUnavailableException
     * @throws ConflictException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceExistsException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateServerResult updateServer(UpdateServerRequest updateServerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Assigns new properties to a user. Parameters you pass modify any or all
     * of the following: the home directory, role, and policy for the
     * <code>UserName</code> and <code>ServerId</code> you specify.
     * </p>
     * <p>
     * The response returns the <code>ServerId</code> and the
     * <code>UserName</code> for the updated user.
     * </p>
     * 
     * @param updateUserRequest
     * @return updateUserResult The response from the UpdateUser service method,
     *         as returned by AWS Transfer Family.
     * @throws ServiceUnavailableException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Transfer Family indicating either a problem with the data in
     *             the request, or a server side issue.
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest) throws AmazonClientException,
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
