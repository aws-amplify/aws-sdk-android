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

package com.amazonaws.services.synthetics;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.synthetics.model.*;

/**
 * Interface for accessing Synthetics <fullname>Amazon CloudWatch
 * Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your
 * services. You can create and manage <i>canaries</i>, which are modular,
 * lightweight scripts that monitor your endpoints and APIs from the outside-in.
 * You can set up your canaries to run 24 hours a day, once per minute. The
 * canaries help you check the availability and latency of your web services and
 * troubleshoot anomalies by investigating load time data, screenshots of the
 * UI, logs, and metrics. The canaries seamlessly integrate with CloudWatch
 * ServiceLens to help you trace the causes of impacted nodes in your
 * applications. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html"
 * >Using ServiceLens to Monitor the Health of Your Applications</a> in the
 * <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security
 * considerations. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
 * >Security Considerations for Synthetics Canaries</a>.
 * </p>
 **/
public interface Synthetics {

    /**
     * Overrides the default endpoint for this client
     * ("https://synthetics.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "synthetics.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://synthetics.us-east-1.amazonaws.com"). If the
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
     * @param endpoint The endpoint (ex: "synthetics.us-east-1.amazonaws.com")
     *            or a full URL, including the protocol (ex:
     *            "https://synthetics.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link Synthetics#setEndpoint(String)}, sets the
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
     * Creates a canary. Canaries are scripts that monitor your endpoints and
     * APIs from the outside-in. Canaries help you check the availability and
     * latency of your web services and troubleshoot anomalies by investigating
     * load time data, screenshots of the UI, logs, and metrics. You can set up
     * a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
     * href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html"
     * >UpdateCanary</a> instead.
     * </p>
     * <p>
     * To create canaries, you must have the
     * <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the the
     * <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names.
     * The canary name makes up part of the Amazon Resource Name (ARN) for the
     * canary, and the ARN is included in outbound calls over the internet. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html"
     * >Security Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @return createCanaryResult The response from the CreateCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateCanaryResult createCanary(CreateCanaryRequest createCanaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * When you delete a canary, resources used and created by the canary are
     * not automatically deleted. After you delete a canary that you do not
     * intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Lambda functions and layers used by this canary. These have the
     * prefix <code>cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name
     * of <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console,
     * these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>
     * .
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have
     * the name <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code>
     * to display the information about this canary. Make note of the
     * information returned by this operation so that you can delete these
     * resources after you delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @return deleteCanaryResult The response from the DeleteCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteCanaryResult deleteCanary(DeleteCanaryRequest deleteCanaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * This operation returns a list of the canaries in your account, along with
     * full details about each canary.
     * </p>
     * <p>
     * This operation does not have resource-level authorization, so if a user
     * is able to use <code>DescribeCanaries</code>, the user can see all of the
     * canaries in the account. A deny policy can only be used to restrict
     * access to all canaries. It cannot be used on specific resources.
     * </p>
     * 
     * @param describeCanariesRequest
     * @return describeCanariesResult The response from the DescribeCanaries
     *         service method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCanariesResult describeCanaries(DescribeCanariesRequest describeCanariesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this operation to see information from the most recent run of each
     * canary that you have created.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @return describeCanariesLastRunResult The response from the
     *         DescribeCanariesLastRun service method, as returned by
     *         Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeCanariesLastRunResult describeCanariesLastRun(
            DescribeCanariesLastRunRequest describeCanariesLastRunRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a list of Synthetics canary runtime versions. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html"
     * > Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @return describeRuntimeVersionsResult The response from the
     *         DescribeRuntimeVersions service method, as returned by
     *         Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DescribeRuntimeVersionsResult describeRuntimeVersions(
            DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves complete information about one canary. You must specify the
     * name of the canary that you want. To get a list of canaries and their
     * names, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @return getCanaryResult The response from the GetCanary service method,
     *         as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCanaryResult getCanary(GetCanaryRequest getCanaryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @return getCanaryRunsResult The response from the GetCanaryRuns service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCanaryRunsResult getCanaryRuns(GetCanaryRunsRequest getCanaryRunsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Displays the tags associated with a canary.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Use this operation to run a canary that has already been created. The
     * frequency of the canary runs is determined by the value of the canary's
     * <code>Schedule</code>. To see a canary's schedule, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html"
     * >GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @return startCanaryResult The response from the StartCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StartCanaryResult startCanary(StartCanaryRequest startCanaryRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Stops the canary to prevent all future runs. If the canary is currently
     * running, Synthetics stops waiting for the current run of the specified
     * canary to complete. The run that is in progress completes on its own,
     * publishes metrics, and uploads artifacts, but it is not recorded in
     * Synthetics as a completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the
     * canary’s current schedule at any point in the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @return stopCanaryResult The response from the StopCanary service method,
     *         as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    StopCanaryResult stopCanary(StopCanaryRequest stopCanaryRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified canary.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also
     * use them to scope user permissions, by granting a user permission to
     * access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly
     * as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a canary that
     * already has tags. If you specify a new tag key for the alarm, this tag is
     * appended to the list of tags associated with the alarm. If you specify a
     * tag key that is already associated with the alarm, the new tag value that
     * you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary.
     * </p>
     * 
     * @param tagResourceRequest
     * @return tagResourceResult The response from the TagResource service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes one or more tags from the specified canary.
     * </p>
     * 
     * @param untagResourceRequest
     * @return untagResourceResult The response from the UntagResource service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Use this operation to change the settings of a canary that has already
     * been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To
     * change the tags of an existing canary, use <a href=
     * "https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html"
     * >TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @return updateCanaryResult The response from the UpdateCanary service
     *         method, as returned by Synthetics.
     * @throws InternalServerException
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             Synthetics indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateCanaryResult updateCanary(UpdateCanaryRequest updateCanaryRequest)
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
