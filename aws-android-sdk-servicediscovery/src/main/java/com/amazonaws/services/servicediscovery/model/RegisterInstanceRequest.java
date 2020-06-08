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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates one or more records and, optionally, creates a health
 * check based on the settings in a specified service. When you submit a
 * <code>RegisterInstance</code> request, the following occurs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For each DNS record that you define in the service that is specified by
 * <code>ServiceId</code>, a record is created or updated in the hosted zone
 * that is associated with the corresponding namespace.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the service includes <code>HealthCheckConfig</code>, a health check is
 * created based on the settings in the health check configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * The health check, if any, is associated with each of the new or updated
 * records.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * One <code>RegisterInstance</code> request must complete before you can submit
 * another request and specify the same service ID and instance ID.
 * </p>
 * </important>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html"
 * >CreateService</a>.
 * </p>
 * <p>
 * When AWS Cloud Map receives a DNS query for the specified DNS name, it
 * returns the applicable value:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>If the health check is healthy</b>: returns all the records
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>If the health check is unhealthy</b>: returns the applicable value for the
 * last healthy instance
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>If you didn't specify a health check configuration</b>: returns all the
 * records
 * </p>
 * </li>
 * </ul>
 * <p>
 * For the current limit on the number of instances that you can register using
 * the same namespace and using the same service, see <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS
 * Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
 * </p>
 */
public class RegisterInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String serviceId;

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * settings for an SRV record, the value of <code>InstanceId</code> is
     * automatically included as part of the value for the SRV record. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     * >DnsRecord &gt; Type</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among
     * instances that you register by using the same service.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and
     * <code>ServiceId</code>, AWS Cloud Map updates the existing DNS records,
     * if any. If there's also an existing health check, AWS Cloud Map deletes
     * the old health check and creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a
     * while if you submit a <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>RegisterInstance</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CreatorRequestId</code> string every time you submit a
     * <code>RegisterInstance</code> request if you're registering additional
     * instances for the same namespace and service.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

    /**
     * <p>
     * A string map that contains the following information for the service that
     * you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the
     * DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     * >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by
     * <code>ServiceId</code> must include settings for an A record, an AAAA
     * record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of
     * <code>RoutingPolicy</code> must be <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * <code>HealthCheckConfig</code> settings, AWS Cloud Map will create the
     * Route 53 health check, but it won't associate the health check with the
     * alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route
     * traffic to AWS resources other than ELB load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify
     * values for any of the <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes
     * <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the
     * custom health check, <code>HEALTHY</code> or <code>UNHEALTHY</code>. If
     * you don't specify a value for <code>AWS_INIT_HEALTH_STATUS</code>, the
     * initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that
     * you want Route 53 to return in response to DNS queries, for example,
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an A record. If the service includes settings for
     * an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an AAAA record. If the service includes settings
     * for an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53
     * to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the
     * endpoint that you want Route 53 to send requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record or a
     * Route 53 health check when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the
     * maximum length of the attribute name is 255 characters, and the maximum
     * length of the attribute value is 1,024 characters. Total size of all
     * provided attributes (sum of all keys and values) must not exceed 5,000
     * characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the service that you want to use for settings for the
     *         instance.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that you want to use for settings for
     *            the instance.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that you want to use for settings for
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstanceRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * settings for an SRV record, the value of <code>InstanceId</code> is
     * automatically included as part of the value for the SRV record. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     * >DnsRecord &gt; Type</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among
     * instances that you register by using the same service.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and
     * <code>ServiceId</code>, AWS Cloud Map updates the existing DNS records,
     * if any. If there's also an existing health check, AWS Cloud Map deletes
     * the old health check and creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a
     * while if you submit a <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         An identifier that you want to associate with the instance. Note
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the service that is specified by <code>ServiceId</code>
     *         includes settings for an SRV record, the value of
     *         <code>InstanceId</code> is automatically included as part of the
     *         value for the SRV record. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     *         >DnsRecord &gt; Type</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can use this value to update an existing instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To register a new instance, you must specify a value that is
     *         unique among instances that you register by using the same
     *         service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an existing <code>InstanceId</code> and
     *         <code>ServiceId</code>, AWS Cloud Map updates the existing DNS
     *         records, if any. If there's also an existing health check, AWS
     *         Cloud Map deletes the old health check and creates a new one.
     *         </p>
     *         <note>
     *         <p>
     *         The health check isn't deleted immediately, so it will still
     *         appear for a while if you submit a <code>ListHealthChecks</code>
     *         request, for example.
     *         </p>
     *         </note></li>
     *         </ul>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * settings for an SRV record, the value of <code>InstanceId</code> is
     * automatically included as part of the value for the SRV record. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     * >DnsRecord &gt; Type</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among
     * instances that you register by using the same service.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and
     * <code>ServiceId</code>, AWS Cloud Map updates the existing DNS records,
     * if any. If there's also an existing health check, AWS Cloud Map deletes
     * the old health check and creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a
     * while if you submit a <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            An identifier that you want to associate with the instance.
     *            Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the service that is specified by <code>ServiceId</code>
     *            includes settings for an SRV record, the value of
     *            <code>InstanceId</code> is automatically included as part of
     *            the value for the SRV record. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     *            >DnsRecord &gt; Type</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can use this value to update an existing instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To register a new instance, you must specify a value that is
     *            unique among instances that you register by using the same
     *            service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify an existing <code>InstanceId</code> and
     *            <code>ServiceId</code>, AWS Cloud Map updates the existing DNS
     *            records, if any. If there's also an existing health check, AWS
     *            Cloud Map deletes the old health check and creates a new one.
     *            </p>
     *            <note>
     *            <p>
     *            The health check isn't deleted immediately, so it will still
     *            appear for a while if you submit a
     *            <code>ListHealthChecks</code> request, for example.
     *            </p>
     *            </note></li>
     *            </ul>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * settings for an SRV record, the value of <code>InstanceId</code> is
     * automatically included as part of the value for the SRV record. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     * >DnsRecord &gt; Type</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among
     * instances that you register by using the same service.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and
     * <code>ServiceId</code>, AWS Cloud Map updates the existing DNS records,
     * if any. If there's also an existing health check, AWS Cloud Map deletes
     * the old health check and creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a
     * while if you submit a <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            An identifier that you want to associate with the instance.
     *            Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the service that is specified by <code>ServiceId</code>
     *            includes settings for an SRV record, the value of
     *            <code>InstanceId</code> is automatically included as part of
     *            the value for the SRV record. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_DnsRecord.html#cloudmap-Type-DnsRecord-Type"
     *            >DnsRecord &gt; Type</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can use this value to update an existing instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To register a new instance, you must specify a value that is
     *            unique among instances that you register by using the same
     *            service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify an existing <code>InstanceId</code> and
     *            <code>ServiceId</code>, AWS Cloud Map updates the existing DNS
     *            records, if any. If there's also an existing health check, AWS
     *            Cloud Map deletes the old health check and creates a new one.
     *            </p>
     *            <note>
     *            <p>
     *            The health check isn't deleted immediately, so it will still
     *            appear for a while if you submit a
     *            <code>ListHealthChecks</code> request, for example.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>RegisterInstance</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CreatorRequestId</code> string every time you submit a
     * <code>RegisterInstance</code> request if you're registering additional
     * instances for the same namespace and service.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed <code>RegisterInstance</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CreatorRequestId</code> string every time you submit
     *         a <code>RegisterInstance</code> request if you're registering
     *         additional instances for the same namespace and service.
     *         <code>CreatorRequestId</code> can be any unique string, for
     *         example, a date/time stamp.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>RegisterInstance</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CreatorRequestId</code> string every time you submit a
     * <code>RegisterInstance</code> request if you're registering additional
     * instances for the same namespace and service.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>RegisterInstance</code> requests to be retried
     *            without the risk of executing the operation twice. You must
     *            use a unique <code>CreatorRequestId</code> string every time
     *            you submit a <code>RegisterInstance</code> request if you're
     *            registering additional instances for the same namespace and
     *            service. <code>CreatorRequestId</code> can be any unique
     *            string, for example, a date/time stamp.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>RegisterInstance</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CreatorRequestId</code> string every time you submit a
     * <code>RegisterInstance</code> request if you're registering additional
     * instances for the same namespace and service.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>RegisterInstance</code> requests to be retried
     *            without the risk of executing the operation twice. You must
     *            use a unique <code>CreatorRequestId</code> string every time
     *            you submit a <code>RegisterInstance</code> request if you're
     *            registering additional instances for the same namespace and
     *            service. <code>CreatorRequestId</code> can be any unique
     *            string, for example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstanceRequest withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
        return this;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that
     * you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the
     * DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     * >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by
     * <code>ServiceId</code> must include settings for an A record, an AAAA
     * record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of
     * <code>RoutingPolicy</code> must be <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * <code>HealthCheckConfig</code> settings, AWS Cloud Map will create the
     * Route 53 health check, but it won't associate the health check with the
     * alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route
     * traffic to AWS resources other than ELB load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify
     * values for any of the <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes
     * <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the
     * custom health check, <code>HEALTHY</code> or <code>UNHEALTHY</code>. If
     * you don't specify a value for <code>AWS_INIT_HEALTH_STATUS</code>, the
     * initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that
     * you want Route 53 to return in response to DNS queries, for example,
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an A record. If the service includes settings for
     * an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an AAAA record. If the service includes settings
     * for an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53
     * to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the
     * endpoint that you want Route 53 to send requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record or a
     * Route 53 health check when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the
     * maximum length of the attribute name is 255 characters, and the maximum
     * length of the attribute value is 1,024 characters. Total size of all
     * provided attributes (sum of all keys and values) must not exceed 5,000
     * characters.
     * </p>
     *
     * @return <p>
     *         A string map that contains the following information for the
     *         service that you specify in <code>ServiceId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The attributes that apply to the records that are defined in the
     *         service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each attribute, the applicable value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Supported attribute keys include the following:
     *         </p>
     *         <p>
     *         <b>AWS_ALIAS_DNS_NAME</b>
     *         </p>
     *         <p>
     *         <b/>
     *         </p>
     *         <p>
     *         If you want AWS Cloud Map to create an Amazon Route 53 alias
     *         record that routes traffic to an Elastic Load Balancing load
     *         balancer, specify the DNS name that is associated with the load
     *         balancer. For information about how to get the DNS name, see
     *         "DNSName" in the topic <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     *         >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     *         </p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The configuration for the service that is specified by
     *         <code>ServiceId</code> must include settings for an A record, an
     *         AAAA record, or both.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the service that is specified by <code>ServiceId</code>, the
     *         value of <code>RoutingPolicy</code> must be <code>WEIGHTED</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the service that is specified by <code>ServiceId</code>
     *         includes <code>HealthCheckConfig</code> settings, AWS Cloud Map
     *         will create the Route 53 health check, but it won't associate the
     *         health check with the alias record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Auto naming currently doesn't support creating alias records that
     *         route traffic to AWS resources other than ELB load balancers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't
     *         specify values for any of the <code>AWS_INSTANCE</code>
     *         attributes.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>AWS_INIT_HEALTH_STATUS</b>
     *         </p>
     *         <p>
     *         If the service configuration includes
     *         <code>HealthCheckCustomConfig</code>, you can optionally use
     *         <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status
     *         of the custom health check, <code>HEALTHY</code> or
     *         <code>UNHEALTHY</code>. If you don't specify a value for
     *         <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is
     *         <code>HEALTHY</code>.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_CNAME</b>
     *         </p>
     *         <p>
     *         If the service configuration includes a CNAME record, the domain
     *         name that you want Route 53 to return in response to DNS queries,
     *         for example, <code>example.com</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by
     *         <code>ServiceId</code> includes settings for an CNAME record.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_IPV4</b>
     *         </p>
     *         <p>
     *         If the service configuration includes an A record, the IPv4
     *         address that you want Route 53 to return in response to DNS
     *         queries, for example, <code>192.0.2.44</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by
     *         <code>ServiceId</code> includes settings for an A record. If the
     *         service includes settings for an SRV record, you must specify a
     *         value for <code>AWS_INSTANCE_IPV4</code>,
     *         <code>AWS_INSTANCE_IPV6</code>, or both.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_IPV6</b>
     *         </p>
     *         <p>
     *         If the service configuration includes an AAAA record, the IPv6
     *         address that you want Route 53 to return in response to DNS
     *         queries, for example,
     *         <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by
     *         <code>ServiceId</code> includes settings for an AAAA record. If
     *         the service includes settings for an SRV record, you must specify
     *         a value for <code>AWS_INSTANCE_IPV4</code>,
     *         <code>AWS_INSTANCE_IPV6</code>, or both.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_PORT</b>
     *         </p>
     *         <p>
     *         If the service includes an SRV record, the value that you want
     *         Route 53 to return for the port.
     *         </p>
     *         <p>
     *         If the service includes <code>HealthCheckConfig</code>, the port
     *         on the endpoint that you want Route 53 to send requests to.
     *         </p>
     *         <p>
     *         This value is required if you specified settings for an SRV
     *         record or a Route 53 health check when you created the service.
     *         </p>
     *         <p>
     *         <b>Custom attributes</b>
     *         </p>
     *         <p>
     *         You can add up to 30 custom attributes. For each key-value pair,
     *         the maximum length of the attribute name is 255 characters, and
     *         the maximum length of the attribute value is 1,024 characters.
     *         Total size of all provided attributes (sum of all keys and
     *         values) must not exceed 5,000 characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that
     * you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the
     * DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     * >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by
     * <code>ServiceId</code> must include settings for an A record, an AAAA
     * record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of
     * <code>RoutingPolicy</code> must be <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * <code>HealthCheckConfig</code> settings, AWS Cloud Map will create the
     * Route 53 health check, but it won't associate the health check with the
     * alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route
     * traffic to AWS resources other than ELB load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify
     * values for any of the <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes
     * <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the
     * custom health check, <code>HEALTHY</code> or <code>UNHEALTHY</code>. If
     * you don't specify a value for <code>AWS_INIT_HEALTH_STATUS</code>, the
     * initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that
     * you want Route 53 to return in response to DNS queries, for example,
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an A record. If the service includes settings for
     * an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an AAAA record. If the service includes settings
     * for an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53
     * to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the
     * endpoint that you want Route 53 to send requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record or a
     * Route 53 health check when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the
     * maximum length of the attribute name is 255 characters, and the maximum
     * length of the attribute value is 1,024 characters. Total size of all
     * provided attributes (sum of all keys and values) must not exceed 5,000
     * characters.
     * </p>
     *
     * @param attributes <p>
     *            A string map that contains the following information for the
     *            service that you specify in <code>ServiceId</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The attributes that apply to the records that are defined in
     *            the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each attribute, the applicable value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Supported attribute keys include the following:
     *            </p>
     *            <p>
     *            <b>AWS_ALIAS_DNS_NAME</b>
     *            </p>
     *            <p>
     *            <b/>
     *            </p>
     *            <p>
     *            If you want AWS Cloud Map to create an Amazon Route 53 alias
     *            record that routes traffic to an Elastic Load Balancing load
     *            balancer, specify the DNS name that is associated with the
     *            load balancer. For information about how to get the DNS name,
     *            see "DNSName" in the topic <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     *            >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     *            </p>
     *            <p>
     *            Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The configuration for the service that is specified by
     *            <code>ServiceId</code> must include settings for an A record,
     *            an AAAA record, or both.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the service that is specified by <code>ServiceId</code>,
     *            the value of <code>RoutingPolicy</code> must be
     *            <code>WEIGHTED</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the service that is specified by <code>ServiceId</code>
     *            includes <code>HealthCheckConfig</code> settings, AWS Cloud
     *            Map will create the Route 53 health check, but it won't
     *            associate the health check with the alias record.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Auto naming currently doesn't support creating alias records
     *            that route traffic to AWS resources other than ELB load
     *            balancers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>,
     *            don't specify values for any of the <code>AWS_INSTANCE</code>
     *            attributes.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>AWS_INIT_HEALTH_STATUS</b>
     *            </p>
     *            <p>
     *            If the service configuration includes
     *            <code>HealthCheckCustomConfig</code>, you can optionally use
     *            <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial
     *            status of the custom health check, <code>HEALTHY</code> or
     *            <code>UNHEALTHY</code>. If you don't specify a value for
     *            <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is
     *            <code>HEALTHY</code>.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_CNAME</b>
     *            </p>
     *            <p>
     *            If the service configuration includes a CNAME record, the
     *            domain name that you want Route 53 to return in response to
     *            DNS queries, for example, <code>example.com</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an CNAME record.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_IPV4</b>
     *            </p>
     *            <p>
     *            If the service configuration includes an A record, the IPv4
     *            address that you want Route 53 to return in response to DNS
     *            queries, for example, <code>192.0.2.44</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an A record. If
     *            the service includes settings for an SRV record, you must
     *            specify a value for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_IPV6</b>
     *            </p>
     *            <p>
     *            If the service configuration includes an AAAA record, the IPv6
     *            address that you want Route 53 to return in response to DNS
     *            queries, for example,
     *            <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an AAAA record.
     *            If the service includes settings for an SRV record, you must
     *            specify a value for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_PORT</b>
     *            </p>
     *            <p>
     *            If the service includes an SRV record, the value that you want
     *            Route 53 to return for the port.
     *            </p>
     *            <p>
     *            If the service includes <code>HealthCheckConfig</code>, the
     *            port on the endpoint that you want Route 53 to send requests
     *            to.
     *            </p>
     *            <p>
     *            This value is required if you specified settings for an SRV
     *            record or a Route 53 health check when you created the
     *            service.
     *            </p>
     *            <p>
     *            <b>Custom attributes</b>
     *            </p>
     *            <p>
     *            You can add up to 30 custom attributes. For each key-value
     *            pair, the maximum length of the attribute name is 255
     *            characters, and the maximum length of the attribute value is
     *            1,024 characters. Total size of all provided attributes (sum
     *            of all keys and values) must not exceed 5,000 characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that
     * you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the
     * DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     * >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by
     * <code>ServiceId</code> must include settings for an A record, an AAAA
     * record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of
     * <code>RoutingPolicy</code> must be <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * <code>HealthCheckConfig</code> settings, AWS Cloud Map will create the
     * Route 53 health check, but it won't associate the health check with the
     * alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route
     * traffic to AWS resources other than ELB load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify
     * values for any of the <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes
     * <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the
     * custom health check, <code>HEALTHY</code> or <code>UNHEALTHY</code>. If
     * you don't specify a value for <code>AWS_INIT_HEALTH_STATUS</code>, the
     * initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that
     * you want Route 53 to return in response to DNS queries, for example,
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an A record. If the service includes settings for
     * an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an AAAA record. If the service includes settings
     * for an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53
     * to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the
     * endpoint that you want Route 53 to send requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record or a
     * Route 53 health check when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the
     * maximum length of the attribute name is 255 characters, and the maximum
     * length of the attribute value is 1,024 characters. Total size of all
     * provided attributes (sum of all keys and values) must not exceed 5,000
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A string map that contains the following information for the
     *            service that you specify in <code>ServiceId</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The attributes that apply to the records that are defined in
     *            the service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each attribute, the applicable value.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Supported attribute keys include the following:
     *            </p>
     *            <p>
     *            <b>AWS_ALIAS_DNS_NAME</b>
     *            </p>
     *            <p>
     *            <b/>
     *            </p>
     *            <p>
     *            If you want AWS Cloud Map to create an Amazon Route 53 alias
     *            record that routes traffic to an Elastic Load Balancing load
     *            balancer, specify the DNS name that is associated with the
     *            load balancer. For information about how to get the DNS name,
     *            see "DNSName" in the topic <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     *            >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     *            </p>
     *            <p>
     *            Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The configuration for the service that is specified by
     *            <code>ServiceId</code> must include settings for an A record,
     *            an AAAA record, or both.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            In the service that is specified by <code>ServiceId</code>,
     *            the value of <code>RoutingPolicy</code> must be
     *            <code>WEIGHTED</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the service that is specified by <code>ServiceId</code>
     *            includes <code>HealthCheckConfig</code> settings, AWS Cloud
     *            Map will create the Route 53 health check, but it won't
     *            associate the health check with the alias record.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Auto naming currently doesn't support creating alias records
     *            that route traffic to AWS resources other than ELB load
     *            balancers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>,
     *            don't specify values for any of the <code>AWS_INSTANCE</code>
     *            attributes.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>AWS_INIT_HEALTH_STATUS</b>
     *            </p>
     *            <p>
     *            If the service configuration includes
     *            <code>HealthCheckCustomConfig</code>, you can optionally use
     *            <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial
     *            status of the custom health check, <code>HEALTHY</code> or
     *            <code>UNHEALTHY</code>. If you don't specify a value for
     *            <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is
     *            <code>HEALTHY</code>.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_CNAME</b>
     *            </p>
     *            <p>
     *            If the service configuration includes a CNAME record, the
     *            domain name that you want Route 53 to return in response to
     *            DNS queries, for example, <code>example.com</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an CNAME record.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_IPV4</b>
     *            </p>
     *            <p>
     *            If the service configuration includes an A record, the IPv4
     *            address that you want Route 53 to return in response to DNS
     *            queries, for example, <code>192.0.2.44</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an A record. If
     *            the service includes settings for an SRV record, you must
     *            specify a value for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_IPV6</b>
     *            </p>
     *            <p>
     *            If the service configuration includes an AAAA record, the IPv6
     *            address that you want Route 53 to return in response to DNS
     *            queries, for example,
     *            <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *            </p>
     *            <p>
     *            This value is required if the service specified by
     *            <code>ServiceId</code> includes settings for an AAAA record.
     *            If the service includes settings for an SRV record, you must
     *            specify a value for <code>AWS_INSTANCE_IPV4</code>,
     *            <code>AWS_INSTANCE_IPV6</code>, or both.
     *            </p>
     *            <p>
     *            <b>AWS_INSTANCE_PORT</b>
     *            </p>
     *            <p>
     *            If the service includes an SRV record, the value that you want
     *            Route 53 to return for the port.
     *            </p>
     *            <p>
     *            If the service includes <code>HealthCheckConfig</code>, the
     *            port on the endpoint that you want Route 53 to send requests
     *            to.
     *            </p>
     *            <p>
     *            This value is required if you specified settings for an SRV
     *            record or a Route 53 health check when you created the
     *            service.
     *            </p>
     *            <p>
     *            <b>Custom attributes</b>
     *            </p>
     *            <p>
     *            You can add up to 30 custom attributes. For each key-value
     *            pair, the maximum length of the attribute name is 255
     *            characters, and the maximum length of the attribute value is
     *            1,024 characters. Total size of all provided attributes (sum
     *            of all keys and values) must not exceed 5,000 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstanceRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that
     * you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that
     * routes traffic to an Elastic Load Balancing load balancer, specify the
     * DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html"
     * >AliasTarget</a> in the <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by
     * <code>ServiceId</code> must include settings for an A record, an AAAA
     * record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of
     * <code>RoutingPolicy</code> must be <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes
     * <code>HealthCheckConfig</code> settings, AWS Cloud Map will create the
     * Route 53 health check, but it won't associate the health check with the
     * alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route
     * traffic to AWS resources other than ELB load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify
     * values for any of the <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes
     * <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the
     * custom health check, <code>HEALTHY</code> or <code>UNHEALTHY</code>. If
     * you don't specify a value for <code>AWS_INIT_HEALTH_STATUS</code>, the
     * initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that
     * you want Route 53 to return in response to DNS queries, for example,
     * <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an A record. If the service includes settings for
     * an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address
     * that you want Route 53 to return in response to DNS queries, for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code>
     * includes settings for an AAAA record. If the service includes settings
     * for an SRV record, you must specify a value for
     * <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53
     * to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the
     * endpoint that you want Route 53 to send requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record or a
     * Route 53 health check when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the
     * maximum length of the attribute name is 255 characters, and the maximum
     * length of the attribute value is 1,024 characters. Total size of all
     * provided attributes (sum of all keys and values) must not exceed 5,000
     * characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterInstanceRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public RegisterInstanceRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterInstanceRequest == false)
            return false;
        RegisterInstanceRequest other = (RegisterInstanceRequest) obj;

        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
