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

package com.amazonaws.services.route53;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing Amazon Route 53
 * <p>
 * Amazon Route 53 is a highly available and scalable Domain Name System (DNS)
 * web service.
 * </p>
 **/
public interface AmazonRoute53 {

    /**
     * Overrides the default endpoint for this client
     * ("https://route53.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "route53.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://route53.us-east-1.amazonaws.com"). If the protocol is not
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
     * @param endpoint The endpoint (ex: "route53.us-east-1.amazonaws.com") or a
     *            full URL, including the protocol (ex:
     *            "https://route53.us-east-1.amazonaws.com") of the region
     *            specific AWS endpoint this client will communicate with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRoute53#setEndpoint(String)}, sets the
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
     * Associates an Amazon VPC with a private hosted zone.
     * </p>
     * <note>
     * <p>
     * To perform the association, the VPC and the private hosted zone must
     * already exist. Also, you can't convert a public hosted zone into a
     * private hosted zone.
     * </p>
     * </note>
     * <p>
     * If you want to associate a VPC that was created by one AWS account with a
     * private hosted zone that was created by a different account, do one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the AWS account that created the private hosted zone to submit a <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateVPCAssociationAuthorization.html"
     * >CreateVPCAssociationAuthorization</a> request. Then use the account that
     * created the VPC to submit an <code>AssociateVPCWithHostedZone</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a subnet in the VPC was shared with another account, you can use the
     * account that the subnet was shared with to submit an
     * <code>AssociateVPCWithHostedZone</code> request. For more information
     * about sharing subnets, see <a href=
     * "https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html"
     * >Working with Shared VPCs</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateVPCWithHostedZoneRequest <p>
     *            A complex type that contains information about the request to
     *            associate a VPC with a private hosted zone.
     *            </p>
     * @return associateVPCWithHostedZoneResult The response from the
     *         AssociateVPCWithHostedZone service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchHostedZoneException
     * @throws NotAuthorizedException
     * @throws InvalidVPCIdException
     * @throws InvalidInputException
     * @throws PublicZoneVPCAssociationException
     * @throws ConflictingDomainExistsException
     * @throws LimitsExceededException
     * @throws PriorRequestNotCompleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates, changes, or deletes a resource record set, which contains
     * authoritative DNS information for a specified domain name or subdomain
     * name. For example, you can use <code>ChangeResourceRecordSets</code> to
     * create a resource record set that routes traffic for test.example.com to
     * a web server that has an IP address of 192.0.2.44.
     * </p>
     * <p>
     * <b>Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * To delete a resource record set, you must specify all the same values
     * that you specified when you created it.
     * </p>
     * <p>
     * <b>Change Batches and Transactional Changes</b>
     * </p>
     * <p>
     * The request body must include a document with a
     * <code>ChangeResourceRecordSetsRequest</code> element. The request body
     * contains a list of change items, known as a change batch. Change batches
     * are considered transactional changes. Route 53 validates the changes in
     * the request and then either makes all or none of the changes in the
     * change batch request. This ensures that DNS routing isn't adversely
     * affected by partial changes to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, suppose a change batch request contains two changes: it
     * deletes the <code>CNAME</code> resource record set for www.example.com
     * and creates an alias resource record set for www.example.com. If
     * validation for both records succeeds, Route 53 deletes the first resource
     * record set and creates the second resource record set in a single
     * operation. If validation for either the <code>DELETE</code> or the
     * <code>CREATE</code> action fails, then the request is canceled, and the
     * original <code>CNAME</code> record continues to exist.
     * </p>
     * <note>
     * <p>
     * If you try to delete the same resource record set more than once in a
     * single change batch, Route 53 returns an <code>InvalidChangeBatch</code>
     * error.
     * </p>
     * </note>
     * <p>
     * <b>Traffic Flow</b>
     * </p>
     * <p>
     * To create resource record sets for complex routing configurations, use
     * either the traffic flow visual editor in the Route 53 console or the API
     * actions for traffic policies and traffic policy instances. Save the
     * configuration as a traffic policy, then associate the traffic policy with
     * one or more domain names (such as example.com) or subdomain names (such
     * as www.example.com), in the same hosted zone or in multiple hosted zones.
     * You can roll back the updates if the new configuration isn't performing
     * as expected. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html"
     * >Using Traffic Flow to Route DNS Traffic</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Create, Delete, and Upsert</b>
     * </p>
     * <p>
     * Use <code>ChangeResourceRecordsSetsRequest</code> to perform the
     * following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes an existing resource record set that has the
     * specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set does not already exist, AWS
     * creates it. If a resource set does exist, Route 53 updates it with the
     * values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Syntaxes for Creating, Updating, and Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * The syntax for a request depends on the type of resource record set that
     * you want to create, delete, or update, such as weighted, alias, or
     * failover. The XML elements in your request must appear in the order
     * listed in the syntax.
     * </p>
     * <p>
     * For an example for each type of resource record set, see "Examples."
     * </p>
     * <p>
     * Don't refer to the syntax in the "Parameter Syntax" section, which
     * includes all of the elements for every kind of resource record set that
     * you can create, delete, or update by using
     * <code>ChangeResourceRecordSets</code>.
     * </p>
     * <p>
     * <b>Change Propagation to Route 53 DNS Servers</b>
     * </p>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Route 53
     * propagates your changes to all of the Route 53 authoritative DNS servers.
     * While your changes are propagating, <code>GetChange</code> returns a
     * status of <code>PENDING</code>. When propagation is complete,
     * <code>GetChange</code> returns a status of <code>INSYNC</code>. Changes
     * generally propagate to all Route 53 name servers within 60 seconds. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     * >GetChange</a>.
     * </p>
     * <p>
     * <b>Limits on ChangeResourceRecordSets Requests</b>
     * </p>
     * <p>
     * For information about the limits on a
     * <code>ChangeResourceRecordSets</code> request, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
     * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest <p>
     *            A complex type that contains change information for the
     *            resource record set.
     *            </p>
     * @return changeResourceRecordSetsResult The response from the
     *         ChangeResourceRecordSets service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchHostedZoneException
     * @throws NoSuchHealthCheckException
     * @throws InvalidChangeBatchException
     * @throws InvalidInputException
     * @throws PriorRequestNotCompleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ChangeResourceRecordSetsResult changeResourceRecordSets(
            ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest <p>
     *            A complex type that contains information about the tags that
     *            you want to add, edit, or delete.
     *            </p>
     * @return changeTagsForResourceResult The response from the
     *         ChangeTagsForResource service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws NoSuchHealthCheckException
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ChangeTagsForResourceResult changeTagsForResource(
            ChangeTagsForResourceRequest changeTagsForResourceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * For information about adding health checks to resource record sets, see
     * <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId"
     * >HealthCheckId</a> in <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
     * >ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * <b>ELB Load Balancers</b>
     * </p>
     * <p>
     * If you're registering EC2 instances with an Elastic Load Balancing (ELB)
     * load balancer, do not create Amazon Route 53 health checks for the EC2
     * instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar
     * function to a Route 53 health check.
     * </p>
     * <p>
     * <b>Private Hosted Zones</b>
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a
     * private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 health checkers are outside the VPC. To check the health of an
     * endpoint within a VPC by IP address, you must assign a public IP address
     * to the instance in the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure a health checker to check the health of an external
     * resource that the instance relies on, such as a database server.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a CloudWatch metric, associate an alarm with the metric,
     * and then create a health check that is based on the state of the alarm.
     * For example, you might create a CloudWatch metric that checks the status
     * of the Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to
     * the metric, and then create a health check that is based on the state of
     * the alarm. For information about creating CloudWatch metrics and alarms
     * by using the CloudWatch console, see the <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html"
     * >Amazon CloudWatch User Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createHealthCheckRequest <p>
     *            A complex type that contains the health check request
     *            information.
     *            </p>
     * @return createHealthCheckResult The response from the CreateHealthCheck
     *         service method, as returned by Amazon Route 53.
     * @throws TooManyHealthChecksException
     * @throws HealthCheckAlreadyExistsException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateHealthCheckResult createHealthCheck(CreateHealthCheckRequest createHealthCheckRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new public or private hosted zone. You create records in a
     * public hosted zone to define how you want to route traffic on the
     * internet for a domain, such as example.com, and its subdomains
     * (apex.example.com, acme.example.com). You create records in a private
     * hosted zone to define how you want to route traffic for a domain and its
     * subdomains within one or more Amazon Virtual Private Clouds (Amazon
     * VPCs).
     * </p>
     * <important>
     * <p>
     * You can't convert a public hosted zone to a private hosted zone or vice
     * versa. Instead, you must create a new hosted zone with the same name and
     * create new resource record sets.
     * </p>
     * </important>
     * <p>
     * For more information about charges for hosted zones, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD) such as .com.
     * </p>
     * </li>
     * <li>
     * <p>
     * For public hosted zones, Route 53 automatically creates a default SOA
     * record and four NS records for the zone. For more information about SOA
     * and NS records, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"
     * >NS and SOA Records that Route 53 Creates for a Hosted Zone</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you want to use the same name servers for multiple public hosted
     * zones, you can optionally associate a reusable delegation set with the
     * hosted zone. See the <code>DelegationSetId</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Route 53, you
     * must update the name servers with your registrar to make Route 53 the DNS
     * service for the domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html"
     * >Migrating DNS Service for an Existing Domain to Amazon Route 53</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>CreateHostedZone</code> request, the initial
     * status of the hosted zone is <code>PENDING</code>. For public hosted
     * zones, this means that the NS and SOA records are not yet available on
     * all Route 53 DNS servers. When the NS and SOA records are available, the
     * status of the zone changes to <code>INSYNC</code>.
     * </p>
     * 
     * @param createHostedZoneRequest <p>
     *            A complex type that contains information about the request to
     *            create a public or private hosted zone.
     *            </p>
     * @return createHostedZoneResult The response from the CreateHostedZone
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidDomainNameException
     * @throws HostedZoneAlreadyExistsException
     * @throws TooManyHostedZonesException
     * @throws InvalidVPCIdException
     * @throws InvalidInputException
     * @throws DelegationSetNotAvailableException
     * @throws ConflictingDomainExistsException
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest createHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a configuration for DNS query logging. After you create a query
     * logging configuration, Amazon Route 53 begins to publish log data to an
     * Amazon CloudWatch Logs log group.
     * </p>
     * <p>
     * DNS query logs contain information about the queries that Route 53
     * receives for a specified public hosted zone, such as the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 edge location that responded to the DNS query
     * </p>
     * </li>
     * <li>
     * <p>
     * Domain or subdomain that was requested
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS record type, such as A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS response code, such as <code>NoError</code> or <code>ServFail</code>
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>Log Group and Resource Policy</dt>
     * <dd>
     * <p>
     * Before you create a query logging configuration, perform the following
     * operations.
     * </p>
     * <note>
     * <p>
     * If you create a query logging configuration using the Route 53 console,
     * Route 53 performs these operations automatically.
     * </p>
     * </note>
     * <ol>
     * <li>
     * <p>
     * Create a CloudWatch Logs log group, and make note of the ARN, which you
     * specify when you create a query logging configuration. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create the log group in the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must use the same AWS account to create the log group and the hosted
     * zone that you want to configure query logging for.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you create log groups for query logging, we recommend that you use a
     * consistent prefix, for example:
     * </p>
     * <p>
     * <code>/aws/route53/<i>hosted zone name</i> </code>
     * </p>
     * <p>
     * In the next step, you'll create a resource policy, which controls access
     * to one or more log groups and the associated AWS resources, such as Route
     * 53 hosted zones. There's a limit on the number of resource policies that
     * you can create, so we recommend that you use a consistent prefix so you
     * can use the same resource policy for all the log groups that you create
     * for query logging.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Create a CloudWatch Logs resource policy, and give it the permissions
     * that Route 53 needs to create log streams and to send query logs to log
     * streams. For the value of <code>Resource</code>, specify the ARN for the
     * log group that you created in the previous step. To use the same resource
     * policy for all the CloudWatch Logs log groups that you created for query
     * logging configurations, replace the hosted zone name with <code>*</code>,
     * for example:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*</code>
     * </p>
     * <note>
     * <p>
     * You can't use the CloudWatch console to create or edit a resource policy.
     * You must use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.
     * </p>
     * </note></li>
     * </ol>
     * </dd>
     * <dt>Log Streams and Edge Locations</dt>
     * <dd>
     * <p>
     * When Route 53 finishes creating the configuration for DNS query logging,
     * it does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a log stream for an edge location the first time that the edge
     * location responds to DNS queries for the specified hosted zone. That log
     * stream is used to log all queries that Route 53 responds to for that edge
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins to send query logs to the applicable log stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of each log stream is in the following format:
     * </p>
     * <p>
     * <code> <i>hosted zone ID</i>/<i>edge location code</i> </code>
     * </p>
     * <p>
     * The edge location code is a three-letter code and an arbitrarily assigned
     * number, for example, DFW3. The three-letter code typically corresponds
     * with the International Air Transport Association airport code for an
     * airport near the edge location. (These abbreviations might change in the
     * future.) For a list of edge locations, see "The Route 53 Global Network"
     * on the <a href="http://aws.amazon.com/route53/details/">Route 53 Product
     * Details</a> page.
     * </p>
     * </dd>
     * <dt>Queries That Are Logged</dt>
     * <dd>
     * <p>
     * Query logs contain only the queries that DNS resolvers forward to Route
     * 53. If a DNS resolver has already cached the response to a query (such as
     * the IP address for a load balancer for example.com), the resolver will
     * continue to return the cached response. It doesn't forward another query
     * to Route 53 until the TTL for the corresponding resource record set
     * expires. Depending on how many DNS queries are submitted for a resource
     * record set, and depending on the TTL for that resource record set, query
     * logs might contain information about only one query out of every several
     * thousand queries that are submitted to DNS. For more information about
     * how DNS works, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html"
     * >Routing Internet Traffic to Your Website or Web Application</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Log File Format</dt>
     * <dd>
     * <p>
     * For a list of the values in each query log and the format of each value,
     * see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html"
     * >Logging DNS Queries</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Pricing</dt>
     * <dd>
     * <p>
     * For information about charges for query logs, see <a
     * href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch
     * Pricing</a>.
     * </p>
     * </dd>
     * <dt>How to Stop Logging</dt>
     * <dd>
     * <p>
     * If you want Route 53 to stop sending query logs to CloudWatch Logs,
     * delete the query logging configuration. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html"
     * >DeleteQueryLoggingConfig</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createQueryLoggingConfigRequest
     * @return createQueryLoggingConfigResult The response from the
     *         CreateQueryLoggingConfig service method, as returned by Amazon
     *         Route 53.
     * @throws ConcurrentModificationException
     * @throws NoSuchHostedZoneException
     * @throws NoSuchCloudWatchLogsLogGroupException
     * @throws InvalidInputException
     * @throws QueryLoggingConfigAlreadyExistsException
     * @throws InsufficientCloudWatchLogsResourcePolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateQueryLoggingConfigResult createQueryLoggingConfig(
            CreateQueryLoggingConfigRequest createQueryLoggingConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be
     * reused by multiple hosted zones that were created by the same AWS
     * account.
     * </p>
     * <p>
     * You can also create a reusable delegation set that uses the four name
     * servers that are associated with an existing hosted zone. Specify the
     * hosted zone ID in the <code>CreateReusableDelegationSet</code> request.
     * </p>
     * <note>
     * <p>
     * You can't associate a reusable delegation set with a private hosted zone.
     * </p>
     * </note>
     * <p>
     * For information about using a reusable delegation set to configure white
     * label name servers, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html"
     * >Configuring White Label Name Servers</a>.
     * </p>
     * <p>
     * The process for migrating existing hosted zones to use a reusable
     * delegation set is comparable to the process for configuring white label
     * name servers. You need to perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate hosted zones, and reduce the TTL to 60 seconds or less.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate resource record sets in the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the registrar's name servers to use the name servers for the new
     * hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Monitor traffic for the website or application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change TTLs back to their original values.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to migrate existing hosted zones to use a reusable delegation
     * set, the existing hosted zones can't use any of the name servers that are
     * assigned to the reusable delegation set. If one or more hosted zones do
     * use one or more name servers that are assigned to the reusable delegation
     * set, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For small numbers of hosted zones—up to a few hundred—it's relatively
     * easy to create reusable delegation sets until you get one that has four
     * name servers that don't overlap with any of the name servers in your
     * hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, the easiest solution is to use more
     * than one reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, you can also migrate hosted zones
     * that have overlapping name servers to hosted zones that don't have
     * overlapping name servers, then migrate the hosted zones again to use the
     * reusable delegation set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createReusableDelegationSetRequest
     * @return createReusableDelegationSetResult The response from the
     *         CreateReusableDelegationSet service method, as returned by Amazon
     *         Route 53.
     * @throws DelegationSetAlreadyCreatedException
     * @throws LimitsExceededException
     * @throws HostedZoneNotFoundException
     * @throws InvalidArgumentException
     * @throws InvalidInputException
     * @throws DelegationSetNotAvailableException
     * @throws DelegationSetAlreadyReusableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateReusableDelegationSetResult createReusableDelegationSet(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource
     * record sets for one domain name (such as example.com) or one subdomain
     * name (such as www.example.com).
     * </p>
     * 
     * @param createTrafficPolicyRequest <p>
     *            A complex type that contains information about the traffic
     *            policy that you want to create.
     *            </p>
     * @return createTrafficPolicyResult The response from the
     *         CreateTrafficPolicy service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws TooManyTrafficPoliciesException
     * @throws TrafficPolicyAlreadyExistsException
     * @throws InvalidTrafficPolicyDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTrafficPolicyResult createTrafficPolicy(
            CreateTrafficPolicyRequest createTrafficPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource record
     * sets with a specified domain name (such as example.com) or subdomain name
     * (such as www.example.com). Amazon Route 53 responds to DNS queries for
     * the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest <p>
     *            A complex type that contains information about the resource
     *            record sets that you want to create based on a specified
     *            traffic policy.
     *            </p>
     * @return createTrafficPolicyInstanceResult The response from the
     *         CreateTrafficPolicyInstance service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws TooManyTrafficPolicyInstancesException
     * @throws NoSuchTrafficPolicyException
     * @throws TrafficPolicyInstanceAlreadyExistsException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a
     * new version of a traffic policy, you specify the ID of the traffic policy
     * that you want to update and a JSON-formatted document that describes the
     * new version. You use traffic policies to create multiple DNS resource
     * record sets for one domain name (such as example.com) or one subdomain
     * name (such as www.example.com). You can create a maximum of 1000 versions
     * of a traffic policy. If you reach the limit and need to create another
     * version, you'll need to start a new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest <p>
     *            A complex type that contains information about the traffic
     *            policy that you want to create a new version for.
     *            </p>
     * @return createTrafficPolicyVersionResult The response from the
     *         CreateTrafficPolicyVersion service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     * @throws TooManyTrafficPolicyVersionsForCurrentPolicyException
     * @throws ConcurrentModificationException
     * @throws InvalidTrafficPolicyDocumentException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateTrafficPolicyVersionResult createTrafficPolicyVersion(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Authorizes the AWS account that created a specified VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request to associate the VPC with
     * a specified hosted zone that was created by a different account. To
     * submit a <code>CreateVPCAssociationAuthorization</code> request, you must
     * use the account that created the hosted zone. After you authorize the
     * association, use the account that created the VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * <note>
     * <p>
     * If you want to associate multiple VPCs that you created by using one
     * account with a hosted zone that you created by using a different account,
     * you must submit one authorization request for each VPC.
     * </p>
     * </note>
     * 
     * @param createVPCAssociationAuthorizationRequest <p>
     *            A complex type that contains information about the request to
     *            authorize associating a VPC with your private hosted zone.
     *            Authorization is only required when a private hosted zone and
     *            a VPC were created by using different accounts.
     *            </p>
     * @return createVPCAssociationAuthorizationResult The response from the
     *         CreateVPCAssociationAuthorization service method, as returned by
     *         Amazon Route 53.
     * @throws ConcurrentModificationException
     * @throws TooManyVPCAssociationAuthorizationsException
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    CreateVPCAssociationAuthorizationResult createVPCAssociationAuthorization(
            CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a health check.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if
     * the health check is associated with one or more resource record sets. If
     * you delete a health check and you don't update the associated resource
     * record sets, the future status of the health check can't be predicted and
     * may change. This will affect the routing of DNS queries for your DNS
     * failover configuration. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the <i>Amazon Route 53
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If you're using AWS Cloud Map and you configured Cloud Map to create a
     * Route 53 health check when you register an instance, you can't use the
     * Route 53 <code>DeleteHealthCheck</code> command to delete the health
     * check. The health check is deleted automatically when you deregister the
     * instance; there can be a delay of several hours before the health check
     * is deleted from Route 53.
     * </p>
     * 
     * @param deleteHealthCheckRequest <p>
     *            This action deletes a health check.
     *            </p>
     * @return deleteHealthCheckResult The response from the DeleteHealthCheck
     *         service method, as returned by Amazon Route 53.
     * @throws NoSuchHealthCheckException
     * @throws HealthCheckInUseException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest deleteHealthCheckRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a hosted zone.
     * </p>
     * <p>
     * If the hosted zone was created by another service, such as AWS Cloud Map,
     * see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html#delete-public-hosted-zone-created-by-another-service"
     * >Deleting Public Hosted Zones That Were Created by Another Service</a> in
     * the <i>Amazon Route 53 Developer Guide</i> for information about how to
     * delete it. (The process is the same for public and private hosted zones
     * that were created by another service.)
     * </p>
     * <p>
     * If you want to keep your domain registration but you want to stop routing
     * internet traffic to your website or web application, we recommend that
     * you delete resource record sets in the hosted zone instead of deleting
     * the hosted zone.
     * </p>
     * <important>
     * <p>
     * If you delete a hosted zone, you can't undelete it. You must create a new
     * hosted zone and update the name servers for your domain registration,
     * which can require up to 48 hours to take effect. (If you delegated
     * responsibility for a subdomain to a hosted zone and you delete the child
     * hosted zone, you must update the name servers in the parent hosted zone.)
     * In addition, if you delete a hosted zone, someone could hijack the domain
     * and route traffic to their own resources using your domain name.
     * </p>
     * </important>
     * <p>
     * If you want to avoid the monthly charge for the hosted zone, you can
     * transfer DNS service for the domain to a free DNS service. When you
     * transfer DNS service, you have to update the name servers for the domain
     * registration. If the domain is registered with Route 53, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html"
     * >UpdateDomainNameservers</a> for information about how to replace Route
     * 53 name servers with name servers for the new DNS service. If the domain
     * is registered with another registrar, use the method provided by the
     * registrar to update name servers for the domain registration. For more
     * information, perform an internet search on "free DNS service."
     * </p>
     * <p>
     * You can delete a hosted zone only if it contains only the default SOA
     * record and NS resource record sets. If the hosted zone contains other
     * resource record sets, you must delete them before you can delete the
     * hosted zone. If you try to delete a hosted zone that contains other
     * resource record sets, the request fails, and Route 53 returns a
     * <code>HostedZoneNotEmpty</code> error. For information about deleting
     * records from your hosted zone, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
     * >ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * To verify that the hosted zone has been deleted, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>GetHostedZone</code> action to request information about
     * the hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>ListHostedZones</code> action to get a list of the hosted
     * zones associated with the current AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteHostedZoneRequest <p>
     *            A request to delete a hosted zone.
     *            </p>
     * @return deleteHostedZoneResult The response from the DeleteHostedZone
     *         service method, as returned by Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws HostedZoneNotEmptyException
     * @throws PriorRequestNotCompleteException
     * @throws InvalidInputException
     * @throws InvalidDomainNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest deleteHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a configuration for DNS query logging. If you delete a
     * configuration, Amazon Route 53 stops sending query logs to CloudWatch
     * Logs. Route 53 doesn't delete any logs that are already in CloudWatch
     * Logs.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>.
     * </p>
     * 
     * @param deleteQueryLoggingConfigRequest
     * @return deleteQueryLoggingConfigResult The response from the
     *         DeleteQueryLoggingConfig service method, as returned by Amazon
     *         Route 53.
     * @throws ConcurrentModificationException
     * @throws NoSuchQueryLoggingConfigException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteQueryLoggingConfigResult deleteQueryLoggingConfig(
            DeleteQueryLoggingConfigRequest deleteQueryLoggingConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a reusable delegation set.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if it isn't associated with
     * any hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any
     * hosted zones, submit a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSet.html"
     * >GetReusableDelegationSet</a> request and specify the ID of the reusable
     * delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest <p>
     *            A request to delete a reusable delegation set.
     *            </p>
     * @return deleteReusableDelegationSetResult The response from the
     *         DeleteReusableDelegationSet service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetInUseException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteReusableDelegationSetResult deleteReusableDelegationSet(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest <p>
     *            A request to delete a specified traffic policy version.
     *            </p>
     * @return deleteTrafficPolicyResult The response from the
     *         DeleteTrafficPolicy service method, as returned by Amazon Route
     *         53.
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     * @throws TrafficPolicyInUseException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTrafficPolicyResult deleteTrafficPolicy(
            DeleteTrafficPolicyRequest deleteTrafficPolicyRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy
     * records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest <p>
     *            A request to delete a specified traffic policy instance.
     *            </p>
     * @return deleteTrafficPolicyInstanceResult The response from the
     *         DeleteTrafficPolicyInstance service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws InvalidInputException
     * @throws PriorRequestNotCompleteException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Removes authorization to submit an
     * <code>AssociateVPCWithHostedZone</code> request to associate a specified
     * VPC with a hosted zone that was created by a different account. You must
     * use the account that created the hosted zone to submit a
     * <code>DeleteVPCAssociationAuthorization</code> request.
     * </p>
     * <important>
     * <p>
     * Sending this request only prevents the AWS account that created the VPC
     * from associating the VPC with the Amazon Route 53 hosted zone in the
     * future. If the VPC is already associated with the hosted zone,
     * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC
     * from the hosted zone. If you want to delete an existing association, use
     * <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </important>
     * 
     * @param deleteVPCAssociationAuthorizationRequest <p>
     *            A complex type that contains information about the request to
     *            remove authorization to associate a VPC that was created by
     *            one AWS account with a hosted zone that was created with a
     *            different AWS account.
     *            </p>
     * @return deleteVPCAssociationAuthorizationResult The response from the
     *         DeleteVPCAssociationAuthorization service method, as returned by
     *         Amazon Route 53.
     * @throws ConcurrentModificationException
     * @throws VPCAssociationAuthorizationNotFoundException
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DeleteVPCAssociationAuthorizationResult deleteVPCAssociationAuthorization(
            DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can submit a <code>DisassociateVPCFromHostedZone</code> request using
     * either the account that created the hosted zone or the account that
     * created the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateVPCFromHostedZoneRequest <p>
     *            A complex type that contains information about the VPC that
     *            you want to disassociate from a specified private hosted zone.
     *            </p>
     * @return disassociateVPCFromHostedZoneResult The response from the
     *         DisassociateVPCFromHostedZone service method, as returned by
     *         Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     * @throws VPCAssociationNotFoundException
     * @throws LastVPCAssociationException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the specified limit for the current account, for example, the
     * maximum number of health checks that you can create using the account.
     * </p>
     * <p>
     * For the default limit, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
     * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>. To request a
     * higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * <note>
     * <p>
     * You can also view account limits in AWS Trusted Advisor. Sign in to the
     * AWS Management Console and open the Trusted Advisor console at <a
     * href="https://console.aws.amazon.com/trustedadvisor"
     * >https://console.aws.amazon.com/trustedadvisor/</a>. Then choose
     * <b>Service limits</b> in the navigation pane.
     * </p>
     * </note>
     * 
     * @param getAccountLimitRequest <p>
     *            A complex type that contains information about the request to
     *            create a hosted zone.
     *            </p>
     * @return getAccountLimitResult The response from the GetAccountLimit
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetAccountLimitResult getAccountLimit(GetAccountLimitRequest getAccountLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one
     * of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not
     * propagated to all Amazon Route 53 DNS servers. This is the initial status
     * of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have propagated to all
     * Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest <p>
     *            The input for a GetChange request.
     *            </p>
     * @return getChangeResult The response from the GetChange service method,
     *         as returned by Amazon Route 53.
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetChangeResult getChange(GetChangeRequest getChangeRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <important>
     * <p>
     * <code>GetCheckerIpRanges</code> still works, but we recommend that you
     * download ip-ranges.json, which includes IP address ranges for all AWS
     * services. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html"
     * >IP Address Ranges of Amazon Route 53 Servers</a> in the <i>Amazon Route
     * 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param getCheckerIpRangesRequest <p>
     *            Empty request.
     *            </p>
     * @return getCheckerIpRangesResult The response from the GetCheckerIpRanges
     *         service method, as returned by Amazon Route 53.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetCheckerIpRangesResult getCheckerIpRanges(GetCheckerIpRangesRequest getCheckerIpRangesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about whether a specified geographic location is
     * supported for Amazon Route 53 geolocation resource record sets.
     * </p>
     * <p>
     * Use the following syntax to determine whether a continent is supported
     * for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?continentcode=<i>two-letter abbreviation for a continent</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a country is supported for
     * geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a subdivision of a country
     * is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i>&amp;subdivisioncode=<i>subdivision code</i> </code>
     * </p>
     * 
     * @param getGeoLocationRequest <p>
     *            A request for information about whether a specified geographic
     *            location is supported for Amazon Route 53 geolocation resource
     *            record sets.
     *            </p>
     * @return getGeoLocationResult The response from the GetGeoLocation service
     *         method, as returned by Amazon Route 53.
     * @throws NoSuchGeoLocationException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetGeoLocationResult getGeoLocation(GetGeoLocationRequest getGeoLocationRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specified health check.
     * </p>
     * 
     * @param getHealthCheckRequest <p>
     *            A request to get information about a specified health check.
     *            </p>
     * @return getHealthCheckResult The response from the GetHealthCheck service
     *         method, as returned by Amazon Route 53.
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     * @throws IncompatibleVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHealthCheckResult getHealthCheck(GetHealthCheckRequest getHealthCheckRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the number of health checks that are associated with the
     * current AWS account.
     * </p>
     * 
     * @param getHealthCheckCountRequest <p>
     *            A request for the number of health checks that are associated
     *            with the current AWS account.
     *            </p>
     * @return getHealthCheckCountResult The response from the
     *         GetHealthCheckCount service method, as returned by Amazon Route
     *         53.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHealthCheckCountResult getHealthCheckCount(
            GetHealthCheckCountRequest getHealthCheckCountRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets the reason that a specified health check failed most recently.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest <p>
     *            A request for the reason that a health check failed most
     *            recently.
     *            </p>
     * @return getHealthCheckLastFailureReasonResult The response from the
     *         GetHealthCheckLastFailureReason service method, as returned by
     *         Amazon Route 53.
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets status of a specified health check.
     * </p>
     * 
     * @param getHealthCheckStatusRequest <p>
     *            A request to get the status for a health check.
     *            </p>
     * @return getHealthCheckStatusResult The response from the
     *         GetHealthCheckStatus service method, as returned by Amazon Route
     *         53.
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHealthCheckStatusResult getHealthCheckStatus(
            GetHealthCheckStatusRequest getHealthCheckStatusRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about a specified hosted zone including the four name
     * servers assigned to the hosted zone.
     * </p>
     * 
     * @param getHostedZoneRequest <p>
     *            A request to get information about a specified hosted zone.
     *            </p>
     * @return getHostedZoneResult The response from the GetHostedZone service
     *         method, as returned by Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHostedZoneResult getHostedZone(GetHostedZoneRequest getHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves the number of hosted zones that are associated with the current
     * AWS account.
     * </p>
     * 
     * @param getHostedZoneCountRequest <p>
     *            A request to retrieve a count of all the hosted zones that are
     *            associated with the current AWS account.
     *            </p>
     * @return getHostedZoneCountResult The response from the GetHostedZoneCount
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHostedZoneCountResult getHostedZoneCount(GetHostedZoneCountRequest getHostedZoneCountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the specified limit for a specified hosted zone, for example, the
     * maximum number of records that you can create in the hosted zone.
     * </p>
     * <p>
     * For the default limit, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
     * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>. To request a
     * higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getHostedZoneLimitRequest <p>
     *            A complex type that contains information about the request to
     *            create a hosted zone.
     *            </p>
     * @return getHostedZoneLimitResult The response from the GetHostedZoneLimit
     *         service method, as returned by Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws HostedZoneNotPrivateException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest getHostedZoneLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specified configuration for DNS query logging.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a> and <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html"
     * >Logging DNS Queries</a>.
     * </p>
     * 
     * @param getQueryLoggingConfigRequest
     * @return getQueryLoggingConfigResult The response from the
     *         GetQueryLoggingConfig service method, as returned by Amazon Route
     *         53.
     * @throws NoSuchQueryLoggingConfigException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetQueryLoggingConfigResult getQueryLoggingConfig(
            GetQueryLoggingConfigRequest getQueryLoggingConfigRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves information about a specified reusable delegation set,
     * including the four name servers that are assigned to the delegation set.
     * </p>
     * 
     * @param getReusableDelegationSetRequest <p>
     *            A request to get information about a specified reusable
     *            delegation set.
     *            </p>
     * @return getReusableDelegationSetResult The response from the
     *         GetReusableDelegationSet service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetReusableDelegationSetResult getReusableDelegationSet(
            GetReusableDelegationSetRequest getReusableDelegationSetRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the maximum number of hosted zones that you can associate with the
     * specified reusable delegation set.
     * </p>
     * <p>
     * For the default limit, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html"
     * >Limits</a> in the <i>Amazon Route 53 Developer Guide</i>. To request a
     * higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getReusableDelegationSetLimitRequest <p>
     *            A complex type that contains information about the request to
     *            create a hosted zone.
     *            </p>
     * @return getReusableDelegationSetLimitResult The response from the
     *         GetReusableDelegationSetLimit service method, as returned by
     *         Amazon Route 53.
     * @throws InvalidInputException
     * @throws NoSuchDelegationSetException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetReusableDelegationSetLimitResult getReusableDelegationSetLimit(
            GetReusableDelegationSetLimitRequest getReusableDelegationSetLimitRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * 
     * @param getTrafficPolicyRequest <p>
     *            Gets information about a specific traffic policy version.
     *            </p>
     * @return getTrafficPolicyResult The response from the GetTrafficPolicy
     *         service method, as returned by Amazon Route 53.
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy
     * records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest <p>
     *            Gets information about a specified traffic policy instance.
     *            </p>
     * @return getTrafficPolicyInstanceResult The response from the
     *         GetTrafficPolicyInstance service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTrafficPolicyInstanceResult getTrafficPolicyInstance(
            GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest <p>
     *            Request to get the number of traffic policy instances that are
     *            associated with the current AWS account.
     *            </p>
     * @return getTrafficPolicyInstanceCountResult The response from the
     *         GetTrafficPolicyInstanceCount service method, as returned by
     *         Amazon Route 53.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of supported geographic locations.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon
     * Route 53 supports subdivisions for a country (for example, states or
     * provinces), the subdivisions for that country are listed in alphabetical
     * order immediately after the corresponding country.
     * </p>
     * <p>
     * For a list of supported geolocation codes, see the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GeoLocation.html"
     * >GeoLocation</a> data type.
     * </p>
     * 
     * @param listGeoLocationsRequest <p>
     *            A request to get a list of geographic locations that Amazon
     *            Route 53 supports for geolocation resource record sets.
     *            </p>
     * @return listGeoLocationsResult The response from the ListGeoLocations
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListGeoLocationsResult listGeoLocations(ListGeoLocationsRequest listGeoLocationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieve a list of the health checks that are associated with the current
     * AWS account.
     * </p>
     * 
     * @param listHealthChecksRequest <p>
     *            A request to retrieve a list of the health checks that are
     *            associated with the current AWS account.
     *            </p>
     * @return listHealthChecksResult The response from the ListHealthChecks
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws IncompatibleVersionException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListHealthChecksResult listHealthChecks(ListHealthChecksRequest listHealthChecksRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of the public and private hosted zones that are
     * associated with the current AWS account. The response includes a
     * <code>HostedZones</code> child element for each hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of hosted zones, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listHostedZonesRequest <p>
     *            A request to retrieve a list of the public and private hosted
     *            zones that are associated with the current AWS account.
     *            </p>
     * @return listHostedZonesResult The response from the ListHostedZones
     *         service method, as returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListHostedZonesResult listHostedZones(ListHostedZonesRequest listHostedZonesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. The
     * response includes a <code>HostedZones</code> child element for each
     * hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the
     * labels reversed. For example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some
     * circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode,
     * <code>ListHostedZonesByName</code> alphabetizes the domain name using the
     * escaped or Punycoded value, which is the format that Amazon Route 53
     * saves in its database. For example, to create a hosted zone for
     * exämple.com, you specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For
     * more information about valid domain name formats, including
     * internationalized domain names, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html"
     * >DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <p>
     * Route 53 returns up to 100 items in each response. If you have a lot of
     * hosted zones, use the <code>MaxItems</code> parameter to list them in
     * groups of up to 100. The response includes values that help navigate from
     * one group of <code>MaxItems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the
     * response contain the values, if any, specified for the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters in the
     * request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxItems</code> element in the response contains the value, if
     * any, that you specified for the <code>maxitems</code> parameter in the
     * request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there
     * are more hosted zones associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, this response includes the last
     * hosted zone that is associated with the current account. The
     * <code>NextDNSName</code> element and <code>NextHostedZoneId</code>
     * elements are omitted from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements
     * in the response contain the domain name and the hosted zone ID of the
     * next hosted zone that is associated with the current AWS account. If you
     * want to list more hosted zones, make another call to
     * <code>ListHostedZonesByName</code>, and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     * respectively.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByNameRequest <p>
     *            Retrieves a list of the public and private hosted zones that
     *            are associated with the current AWS account in ASCII order by
     *            domain name.
     *            </p>
     * @return listHostedZonesByNameResult The response from the
     *         ListHostedZonesByName service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws InvalidDomainNameException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListHostedZonesByNameResult listHostedZonesByName(
            ListHostedZonesByNameRequest listHostedZonesByNameRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the configurations for DNS query logging that are associated with
     * the current AWS account or the configuration that is associated with a
     * specified hosted zone.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>. Additional information, including the
     * format of DNS query logs, appears in <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html"
     * >Logging DNS Queries</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param listQueryLoggingConfigsRequest
     * @return listQueryLoggingConfigsResult The response from the
     *         ListQueryLoggingConfigs service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws InvalidPaginationTokenException
     * @throws NoSuchHostedZoneException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListQueryLoggingConfigsResult listQueryLoggingConfigs(
            ListQueryLoggingConfigsRequest listQueryLoggingConfigsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record
     * sets at a time in ASCII order, beginning at a position specified by the
     * <code>name</code> and <code>type</code> elements.
     * </p>
     * <p>
     * <b>Sort order</b>
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> sorts results first by DNS name with
     * the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order when the record
     * name contains characters that appear before <code>.</code> (decimal 46)
     * in the ASCII table. These characters include the following:
     * <code>! " # $ % &amp; ' ( ) * + , -</code>
     * </p>
     * <p>
     * When multiple records have the same DNS name,
     * <code>ListResourceRecordSets</code> sorts results by the record type.
     * </p>
     * <p>
     * <b>Specifying where to start listing records</b>
     * </p>
     * <p>
     * You can use the name and type elements to specify the resource record set
     * that the list begins with:
     * </p>
     * <dl>
     * <dt>If you do not specify Name or Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set that the hosted zone
     * contains.
     * </p>
     * </dd>
     * <dt>If you specify Name but not Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose
     * name is greater than or equal to <code>Name</code>.
     * </p>
     * </dd>
     * <dt>If you specify Type but not Name</dt>
     * <dd>
     * <p>
     * Amazon Route 53 returns the <code>InvalidInput</code> error.
     * </p>
     * </dd>
     * <dt>If you specify both Name and Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose
     * name is greater than or equal to <code>Name</code>, and whose type is
     * greater than or equal to <code>Type</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Resource record sets that are PENDING</b>
     * </p>
     * <p>
     * This action returns the most current version of the records. This
     * includes records that are <code>PENDING</code>, and that are not yet
     * available on all Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Changing resource record sets</b>
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets
     * for a hosted zone at a point in time, do not submit a
     * <code>ChangeResourceRecordSets</code> request while you're paging through
     * the results of a <code>ListResourceRecordSets</code> request. If you do,
     * some pages may display results without the latest changes while other
     * pages display results with the latest changes.
     * </p>
     * <p>
     * <b>Displaying the next page of results</b>
     * </p>
     * <p>
     * If a <code>ListResourceRecordSets</code> command returns more than one
     * page of results, the value of <code>IsTruncated</code> is
     * <code>true</code>. To display the next page of results, get the values of
     * <code>NextRecordName</code>, <code>NextRecordType</code>, and
     * <code>NextRecordIdentifier</code> (if any) from the response. Then submit
     * another <code>ListResourceRecordSets</code> request, and specify those
     * values for <code>StartRecordName</code>, <code>StartRecordType</code>,
     * and <code>StartRecordIdentifier</code>.
     * </p>
     * 
     * @param listResourceRecordSetsRequest <p>
     *            A request for the resource record sets that are associated
     *            with a specified hosted zone.
     *            </p>
     * @return listResourceRecordSetsResult The response from the
     *         ListResourceRecordSets service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListResourceRecordSetsResult listResourceRecordSets(
            ListResourceRecordSetsRequest listResourceRecordSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Retrieves a list of the reusable delegation sets that are associated with
     * the current AWS account.
     * </p>
     * 
     * @param listReusableDelegationSetsRequest <p>
     *            A request to get a list of the reusable delegation sets that
     *            are associated with the current AWS account.
     *            </p>
     * @return listReusableDelegationSetsResult The response from the
     *         ListReusableDelegationSets service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListReusableDelegationSetsResult listReusableDelegationSets(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest <p>
     *            A complex type containing information about a request for a
     *            list of the tags that are associated with an individual
     *            resource.
     *            </p>
     * @return listTagsForResourceResult The response from the
     *         ListTagsForResource service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws NoSuchHealthCheckException
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest <p>
     *            A complex type that contains information about the health
     *            checks or hosted zones for which you want to list tags.
     *            </p>
     * @return listTagsForResourcesResult The response from the
     *         ListTagsForResources service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws NoSuchHealthCheckException
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     * @throws ThrottlingException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTagsForResourcesResult listTagsForResources(
            ListTagsForResourcesRequest listTagsForResourcesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that
     * is associated with the current AWS account. Policies are listed in the
     * order that they were created in.
     * </p>
     * 
     * @param listTrafficPoliciesRequest <p>
     *            A complex type that contains the information about the request
     *            to list the traffic policies that are associated with the
     *            current AWS account.
     *            </p>
     * @return listTrafficPoliciesResult The response from the
     *         ListTrafficPolicies service method, as returned by Amazon Route
     *         53.
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTrafficPoliciesResult listTrafficPolicies(
            ListTrafficPoliciesRequest listTrafficPoliciesRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using the current AWS account.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request,
     * there's a brief delay while Amazon Route 53 creates the resource record
     * sets that are specified in the traffic policy definition. For more
     * information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a
     * lot of traffic policy instances, you can use the <code>MaxItems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesRequest <p>
     *            A request to get information about the traffic policy
     *            instances that you created by using the current AWS account.
     *            </p>
     * @return listTrafficPolicyInstancesResult The response from the
     *         ListTrafficPolicyInstances service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a
     * specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a
     * lot of traffic policy instances, you can use the <code>MaxItems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest <p>
     *            A request for the traffic policy instances that you created in
     *            a specified hosted zone.
     *            </p>
     * @return listTrafficPolicyInstancesByHostedZoneResult The response from
     *         the ListTrafficPolicyInstancesByHostedZone service method, as
     *         returned by Amazon Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws NoSuchHostedZoneException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using a specify traffic policy version.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a
     * lot of traffic policy instances, you can use the <code>MaxItems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest <p>
     *            A complex type that contains the information about the request
     *            to list your traffic policy instances.
     *            </p>
     * @return listTrafficPolicyInstancesByPolicyResult The response from the
     *         ListTrafficPolicyInstancesByPolicy service method, as returned by
     *         Amazon Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws NoSuchTrafficPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy.
     * </p>
     * <p>
     * Traffic policy versions are listed in numerical order by
     * <code>VersionNumber</code>.
     * </p>
     * 
     * @param listTrafficPolicyVersionsRequest <p>
     *            A complex type that contains the information about the request
     *            to list your traffic policies.
     *            </p>
     * @return listTrafficPolicyVersionsResult The response from the
     *         ListTrafficPolicyVersions service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListTrafficPolicyVersionsResult listTrafficPolicyVersions(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can
     * be associated with a specified hosted zone because you've submitted one
     * or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * The response includes a <code>VPCs</code> element with a <code>VPC</code>
     * child element for each VPC that can be associated with the hosted zone.
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest <p>
     *            A complex type that contains information about that can be
     *            associated with your hosted zone.
     *            </p>
     * @return listVPCAssociationAuthorizationsResult The response from the
     *         ListVPCAssociationAuthorizations service method, as returned by
     *         Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws InvalidPaginationTokenException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    ListVPCAssociationAuthorizationsResult listVPCAssociationAuthorizations(
            ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Gets the value that Amazon Route 53 returns in response to a DNS request
     * for a specified record name and type. You can optionally specify the IP
     * address of a DNS resolver, an EDNS0 client subnet IP address, and a
     * subnet mask.
     * </p>
     * 
     * @param testDNSAnswerRequest <p>
     *            Gets the value that Amazon Route 53 returns in response to a
     *            DNS request for a specified record name and type. You can
     *            optionally specify the IP address of a DNS resolver, an EDNS0
     *            client subnet IP address, and a subnet mask.
     *            </p>
     * @return testDNSAnswerResult The response from the TestDNSAnswer service
     *         method, as returned by Amazon Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    TestDNSAnswerResult testDNSAnswer(TestDNSAnswerRequest testDNSAnswerRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates an existing health check. Note that some values can't be updated.
     * </p>
     * <p>
     * For more information about updating health checks, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html"
     * >Creating, Updating, and Deleting Health Checks</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param updateHealthCheckRequest <p>
     *            A complex type that contains information about a request to
     *            update a health check.
     *            </p>
     * @return updateHealthCheckResult The response from the UpdateHealthCheck
     *         service method, as returned by Amazon Route 53.
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     * @throws HealthCheckVersionMismatchException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest updateHealthCheckRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the comment for a specified hosted zone.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest <p>
     *            A request to update the comment for a hosted zone.
     *            </p>
     * @return updateHostedZoneCommentResult The response from the
     *         UpdateHostedZoneComment service method, as returned by Amazon
     *         Route 53.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateHostedZoneCommentResult updateHostedZoneComment(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest <p>
     *            A complex type that contains information about the traffic
     *            policy that you want to update the comment for.
     *            </p>
     * @return updateTrafficPolicyCommentResult The response from the
     *         UpdateTrafficPolicyComment service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyException
     * @throws ConcurrentModificationException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to
     * respond to DNS queries for the root resource record set name (such as
     * example.com) while it replaces one group of resource record sets with
     * another. Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Route 53 creates a new group of resource record sets based on the
     * specified traffic policy. This is true regardless of how significant the
     * differences are between the existing resource record sets and the new
     * resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Route 53
     * starts to respond to DNS queries for the root resource record set name
     * (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Route 53 deletes the old group of resource record sets that are
     * associated with the root resource record set name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest <p>
     *            A complex type that contains information about the resource
     *            record sets that you want to update based on a specified
     *            traffic policy instance.
     *            </p>
     * @return updateTrafficPolicyInstanceResult The response from the
     *         UpdateTrafficPolicyInstance service method, as returned by Amazon
     *         Route 53.
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyException
     * @throws NoSuchTrafficPolicyInstanceException
     * @throws PriorRequestNotCompleteException
     * @throws ConflictingTypesException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by Amazon
     *             Route 53 indicating either a problem with the data in the
     *             request, or a server side issue.
     */
    UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest)
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
