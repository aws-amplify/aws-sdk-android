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

package com.amazonaws.services.metering.marketplace;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.metering.marketplace.model.*;

/**
 * Interface for accessing AWSMarketplace Metering <fullname>AWS Marketplace
 * Metering Service</fullname>
 * <p>
 * This reference provides descriptions of the low-level AWS Marketplace
 * Metering Service API.
 * </p>
 * <p>
 * AWS Marketplace sellers can use this API to submit usage data for custom
 * usage dimensions.
 * </p>
 * <p>
 * For information on the permissions you need to use this API, see <a href=
 * "https://docs.aws.amazon.com/marketplace/latest/userguide/iam-user-policy-for-aws-marketplace-actions.html"
 * >AWS Marketing metering and entitlement API permissions</a> in the <i>AWS
 * Marketplace Seller Guide.</i>
 * </p>
 * <p>
 * <b>Submitting Metering Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product.
 * MeterUsage is called from an EC2 instance or a container running on EKS or
 * ECS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchMeterUsage</i>- Submits the metering record for a set of customers.
 * BatchMeterUsage is called from a software-as-a-service (SaaS) application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Accepting New Customers</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ResolveCustomer</i>- Called by a SaaS application during the registration
 * process. When a buyer visits your website during the registration process,
 * the buyer submits a Registration Token through the browser. The Registration
 * Token is resolved through this API to obtain a CustomerIdentifier and Product
 * Code.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Entitlement and Metering for Paid Container Products</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Paid container software products sold through AWS Marketplace must integrate
 * with the AWS Marketplace Metering Service and call the RegisterUsage
 * operation for software entitlement and metering. Free and BYOL products for
 * Amazon ECS or Amazon EKS aren't required to call RegisterUsage, but you can
 * do so if you want to receive usage data in your seller reports. For more
 * information on using the RegisterUsage operation, see <a href=
 * "https://docs.aws.amazon.com/marketplace/latest/userguide/container-based-products.html"
 * >Container-Based Products</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * BatchMeterUsage API calls are captured by AWS CloudTrail. You can use
 * Cloudtrail to verify that the SaaS metering records that you sent are
 * accurate by searching for records with the eventName of BatchMeterUsage. You
 * can also use CloudTrail to audit records over time. For more information, see
 * the <i> <a href=
 * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html"
 * >AWS CloudTrail User Guide</a> </i>.
 * </p>
 **/
public interface AWSMarketplaceMetering {

    /**
     * Overrides the default endpoint for this client
     * ("https://metering.marketplace.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "metering.marketplace.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex:
     * "https://metering.marketplace.us-east-1.amazonaws.com"). If the protocol
     * is not specified here, the default protocol from this client's
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
     *            "metering.marketplace.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex:
     *            "https://metering.marketplace.us-east-1.amazonaws.com") of the
     *            region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSMarketplaceMetering#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
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
     * BatchMeterUsage is called from a SaaS application listed on the AWS
     * Marketplace to post metering records for a set of customers.
     * </p>
     * <p>
     * For identical requests, the API is idempotent; requests can be retried
     * with the same records or a subset of the input records.
     * </p>
     * <p>
     * Every request to BatchMeterUsage is for one product. If you need to meter
     * usage for multiple products, you must make multiple calls to
     * BatchMeterUsage.
     * </p>
     * <p>
     * BatchMeterUsage can process up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param batchMeterUsageRequest <p>
     *            A BatchMeterUsageRequest contains UsageRecords, which indicate
     *            quantities of usage within your application.
     *            </p>
     * @return batchMeterUsageResult The response from the BatchMeterUsage
     *         service method, as returned by AWSMarketplace Metering.
     * @throws InternalServiceErrorException
     * @throws InvalidProductCodeException
     * @throws InvalidUsageDimensionException
     * @throws InvalidCustomerIdentifierException
     * @throws TimestampOutOfBoundsException
     * @throws ThrottlingException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    BatchMeterUsageResult batchMeterUsage(BatchMeterUsageRequest batchMeterUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is
     * idempotent. It simply returns the metering record ID.
     * </p>
     * <p>
     * MeterUsage is authenticated on the buyer's AWS account using credentials
     * from the EC2 instance, ECS task, or EKS pod.
     * </p>
     * 
     * @param meterUsageRequest
     * @return meterUsageResult The response from the MeterUsage service method,
     *         as returned by AWSMarketplace Metering.
     * @throws InternalServiceErrorException
     * @throws InvalidProductCodeException
     * @throws InvalidUsageDimensionException
     * @throws InvalidEndpointRegionException
     * @throws TimestampOutOfBoundsException
     * @throws DuplicateRequestException
     * @throws ThrottlingException
     * @throws CustomerNotEntitledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    MeterUsageResult meterUsage(MeterUsageRequest meterUsageRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Paid container software products sold through AWS Marketplace must
     * integrate with the AWS Marketplace Metering Service and call the
     * RegisterUsage operation for software entitlement and metering. Free and
     * BYOL products for Amazon ECS or Amazon EKS aren't required to call
     * RegisterUsage, but you may choose to do so if you would like to receive
     * usage data in your seller reports. The sections below explain the
     * behavior of RegisterUsage. RegisterUsage performs two primary functions:
     * metering and entitlement.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Entitlement</i>: RegisterUsage allows you to verify that the customer
     * running your paid software is subscribed to your product on AWS
     * Marketplace, enabling you to guard against unauthorized use. Your
     * container image that integrates with RegisterUsage is only required to
     * guard against unauthorized use at container startup, as such a
     * CustomerNotSubscribedException/PlatformNotSupportedException will only be
     * thrown on the initial call to RegisterUsage. Subsequent calls from the
     * same Amazon ECS task instance (e.g. task-id) or Amazon EKS pod will not
     * throw a CustomerNotSubscribedException, even if the customer unsubscribes
     * while the Amazon ECS task or Amazon EKS pod is still running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Metering</i>: RegisterUsage meters software use per ECS task, per
     * hour, or per pod for Amazon EKS with usage prorated to the second. A
     * minimum of 1 minute of usage applies to tasks that are short lived. For
     * example, if a customer has a 10 node Amazon ECS or Amazon EKS cluster and
     * a service configured as a Daemon Set, then Amazon ECS or Amazon EKS will
     * launch a task on all 10 cluster nodes and the customer will be charged:
     * (10 * hourly_rate). Metering for software use is automatically handled by
     * the AWS Marketplace Metering Control Plane -- your software is not
     * required to perform any metering specific actions, other than call
     * RegisterUsage once for metering of software use to commence. The AWS
     * Marketplace Metering Control Plane will also continue to bill customers
     * for running ECS tasks and Amazon EKS pods, regardless of the customers
     * subscription state, removing the need for your software to perform
     * entitlement checks at runtime.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerUsageRequest
     * @return registerUsageResult The response from the RegisterUsage service
     *         method, as returned by AWSMarketplace Metering.
     * @throws InvalidProductCodeException
     * @throws InvalidRegionException
     * @throws InvalidPublicKeyVersionException
     * @throws PlatformNotSupportedException
     * @throws CustomerNotEntitledException
     * @throws ThrottlingException
     * @throws InternalServiceErrorException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    RegisterUsageResult registerUsage(RegisterUsageRequest registerUsageRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration
     * process. When a buyer visits your website during the registration
     * process, the buyer submits a registration token through their browser.
     * The registration token is resolved through this API to obtain a
     * CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest <p>
     *            Contains input to the ResolveCustomer operation.
     *            </p>
     * @return resolveCustomerResult The response from the ResolveCustomer
     *         service method, as returned by AWSMarketplace Metering.
     * @throws InvalidTokenException
     * @throws ExpiredTokenException
     * @throws ThrottlingException
     * @throws InternalServiceErrorException
     * @throws DisabledApiException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by
     *             AWSMarketplace Metering indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    ResolveCustomerResult resolveCustomer(ResolveCustomerRequest resolveCustomerRequest)
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
