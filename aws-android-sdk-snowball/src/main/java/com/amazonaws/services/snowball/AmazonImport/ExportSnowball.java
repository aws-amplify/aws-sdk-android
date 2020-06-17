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

package com.amazonaws.services.snowball;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.snowball.model.*;

/**
 * Interface for accessing Amazon Import/Export Snowball
 *
 * <p>AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The Snowball commands described here provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you to create and manage jobs for Snowball. To transfer data locally with a Snowball device, you'll need to use the Snowball client or the Amazon S3 API adapter for Snowball. For more information, see the <a href="https://docs.aws.amazon.com/AWSImportExport/latest/ug/api-reference.html">User Guide</a>.</p>
 *
 **/
public interface AmazonImport/ExportSnowball {

    /**
     * Overrides the default endpoint for this client ("https://snowball.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "snowball.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://snowball.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "snowball.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://snowball.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonImport/ExportSnowball#setEndpoint(String)}, sets the
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
     * <p>Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status. You'll have at least an hour after creating a cluster job to cancel it.</p>
     * @param cancelClusterRequest 
     * @return cancelClusterResult The response from the CancelCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws KMSRequestFailedException 
     * @throws InvalidJobStateException 
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CancelClusterResult cancelCluster(CancelClusterRequest cancelClusterRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action returns a job's <code>JobState</code> as part of the response element data returned.</p>
     * @param cancelJobRequest 
     * @return cancelJobResult The response from the CancelJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. If the address is invalid or unsupported, then an exception is thrown.</p>
     * @param createAddressRequest 
     * @return createAddressResult The response from the CreateAddress service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidAddressException 
     * @throws UnsupportedAddressException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CreateAddressResult createAddress(CreateAddressRequest createAddressRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.</p>
     * @param createClusterRequest 
     * @return createClusterResult The response from the CreateCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for a node in a cluster, you only need to provide the <code>clusterId</code> value; the other job attributes are inherited from the cluster. </p>
     * @param createJobRequest 
     * @return createJobResult The response from the CreateJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws ClusterLimitExceededException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Takes an <code>AddressId</code> and returns specific details about that address in the form of an <code>Address</code> object.</p>
     * @param describeAddressRequest 
     * @return describeAddressResult The response from the DescribeAddress service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeAddressResult describeAddress(DescribeAddressRequest describeAddressRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return addresses from the list of all addresses associated with this account in all US regions.</p>
     * @param describeAddressesRequest 
     * @return describeAddressesResult The response from the DescribeAddresses service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns information about a specific cluster including shipping information, cluster status, and other important metadata.</p>
     * @param describeClusterRequest 
     * @return describeClusterResult The response from the DescribeCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns information about a specific job including shipping information, job status, and other important metadata. </p>
     * @param describeJobRequest 
     * @return describeJobResult The response from the DescribeJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made. To access the manifest file after 60 minutes have passed, you'll have to make another call to the <code>GetJobManifest</code> action.</p> <p>The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code> status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to the Snowball through the Snowball client when the client is started for the first time.</p> <p>As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.</p> <p>The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is created.</p>
     * @param getJobManifestRequest 
     * @return getJobManifestResult The response from the GetJobManifest service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetJobManifestResult getJobManifest(GetJobManifestRequest getJobManifestRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value can be accessed for up to 90 days after the associated job has been created.</p> <p>The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the Snowball client when the client is started for the first time.</p> <p>As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access to the Snowball associated with that job.</p>
     * @param getJobUnlockCodeRequest 
     * @return getJobUnlockCodeResult The response from the GetJobUnlockCode service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest getJobUnlockCodeRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns information about the Snowball service limit for your account, and also the number of Snowballs your account has in use.</p> <p>The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase your service limit, contact AWS Support.</p>
     * @param getSnowballUsageRequest 
     * @return getSnowballUsageResult The response from the GetSnowballUsage service method, as returned by Amazon Import/Export Snowball.
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest getSnowballUsageRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns an Amazon S3 presigned URL for an update file associated with a specified <code>JobId</code>.</p>
     * @param getSoftwareUpdatesRequest 
     * @return getSoftwareUpdatesResult The response from the GetSoftwareUpdates service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    GetSoftwareUpdatesResult getSoftwareUpdates(GetSoftwareUpdatesRequest getSoftwareUpdatesRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code> object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.</p>
     * @param listClusterJobsRequest 
     * @return listClusterJobsResult The response from the ListClusterJobs service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListClusterJobsResult listClusterJobs(ListClusterJobsRequest listClusterJobsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status information.</p>
     * @param listClustersRequest 
     * @return listClustersResult The response from the ListClusters service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS account that would be supported for use on a Snowball Edge device. Currently, supported AMIs are based on the CentOS 7 (x86_64) - with Updates HVM, Ubuntu Server 14.04 LTS (HVM), and Ubuntu 16.04 LTS - Xenial (HVM) images, available on the AWS Marketplace.</p>
     * @param listCompatibleImagesRequest 
     * @return listCompatibleImagesResult The response from the ListCompatibleImages service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListCompatibleImagesResult listCompatibleImages(ListCompatibleImagesRequest listCompatibleImagesRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs associated with this account in all US regions.</p>
     * @param listJobsRequest 
     * @return listJobsResult The response from the ListJobs service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidNextTokenException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60 minutes after the cluster being created, this action is no longer available.</p>
     * @param updateClusterRequest 
     * @return updateClusterResult The response from the UpdateCluster service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest) throws AmazonClientException, AmazonServiceException;

    /**
     * <p>While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created, this action is no longer available.</p>
     * @param updateJobRequest 
     * @return updateJobResult The response from the UpdateJob service method, as returned by Amazon Import/Export Snowball.
     * @throws InvalidResourceException 
     * @throws InvalidJobStateException 
     * @throws KMSRequestFailedException 
     * @throws InvalidInputCombinationException 
     * @throws ClusterLimitExceededException 
     * @throws Ec2RequestFailedException 
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by Amazon Import/Export Snowball indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) throws AmazonClientException, AmazonServiceException;

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
