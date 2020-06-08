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

/**
 * <p>
 * A complex type that contains information about a specified service.
 * </p>
 */
public class ServiceSummary implements Serializable {
    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service
     * when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     */
    private String name;

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The number of instances that are currently associated with the service.
     * Instances that were previously associated with the service but that have
     * been deleted are not included in the count. The count might not reflect
     * pending registrations and deregistrations.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 DNS
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     */
    private DnsConfig dnsConfig;

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional health check. If you specify settings for a
     * health check, AWS Cloud Map associates the health check with the records
     * that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Note the following about configuring health checks.
     * </p>
     * <p>
     * <b>A and AAAA records</b>
     * </p>
     * <p>
     * If <code>DnsConfig</code> includes configurations for both A and AAAA
     * records, AWS Cloud Map creates a health check that uses the IPv4 address
     * to check the health of the resource. If the endpoint that is specified by
     * the IPv4 address is unhealthy, Route 53 considers both the A and AAAA
     * records to be unhealthy.
     * </p>
     * <p>
     * <b>CNAME records</b>
     * </p>
     * <p>
     * You can't specify settings for <code>HealthCheckConfig</code> when the
     * <code>DNSConfig</code> includes <code>CNAME</code> for the value of
     * <code>Type</code>. If you do, the <code>CreateService</code> request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Request interval</b>
     * </p>
     * <p>
     * A Route 53 health checker in each health-checking region sends a health
     * check request to an endpoint every 30 seconds. On average, your endpoint
     * receives a health check request about every two seconds. However, health
     * checkers don't coordinate with one another, so you'll sometimes see
     * several requests per second followed by a few seconds with no health
     * checks at all.
     * </p>
     * <p>
     * <b>Health checking regions</b>
     * </p>
     * <p>
     * Health checkers perform checks from all Route 53 health-checking regions.
     * For a list of the current regions, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     * >Regions</a>.
     * </p>
     * <p>
     * <b>Alias records</b>
     * </p>
     * <p>
     * When you register an instance, if you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route
     * 53 alias record. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for
     * alias records. When <code>EvaluateTargetHealth</code> is true, the alias
     * record inherits the health of the referenced AWS resource. such as an ELB
     * load balancer. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     * >EvaluateTargetHealth</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>HealthCheckConfig</code> and then use the service to
     * register an instance that creates an alias record, Route 53 doesn't
     * create the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Charges for health checks</b>
     * </p>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check. A custom health check, which requires that you use a third-party
     * health checker to evaluate the health of your resources, is useful in the
     * following circumstances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use a health check that is defined by
     * <code>HealthCheckConfig</code> because the resource isn't available over
     * the internet. For example, you can use a custom health check when the
     * instance is in an Amazon VPC. (To check the health of resources in a VPC,
     * the health checker must also be in the VPC.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to use a third-party health checker regardless of where your
     * resources are.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * To change the status of a custom health check, submit an
     * <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud Map
     * doesn't monitor the status of the resource, it just keeps a record of the
     * status specified in the most recent
     * <code>UpdateInstanceCustomHealthStatus</code> request.
     * </p>
     * <p>
     * Here's how custom health checks work:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create a service and specify a value for
     * <code>FailureThreshold</code>.
     * </p>
     * <p>
     * The failure threshold indicates the number of 30-second intervals you
     * want AWS Cloud Map to wait between the time that your application sends
     * an <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     * >UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud
     * Map stops routing internet traffic to the corresponding resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * You register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You configure a third-party health checker to monitor the resource that
     * is associated with the new instance.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map doesn't check the health of the resource directly.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The third-party health-checker determines that the resource is unhealthy
     * and notifies your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your application submits an <code>UpdateInstanceCustomHealthStatus</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't
     * arrive during that time to change the status back to healthy, AWS Cloud
     * Map stops routing traffic to the resource.
     * </p>
     * </li>
     * </ol>
     */
    private HealthCheckCustomConfig healthCheckCustomConfig;

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID that AWS Cloud Map assigned to the service when you
     *         created it.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID that AWS Cloud Map assigned to the service when you
     *            created it.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that AWS Cloud Map assigned to the service when you created it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID that AWS Cloud Map assigned to the service when you
     *            created it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service
     * when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     *         service when you create it.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service
     * when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that AWS Cloud Map assigns to
     *            the service when you create it.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service
     * when you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that AWS Cloud Map assigns to
     *            the service when you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @return <p>
     *         The name of the service.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @param name <p>
     *            The name of the service.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @param name <p>
     *            The name of the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The description that you specify when you create the service.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description that you specify when you create the service.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you specify when you create the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description that you specify when you create the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service.
     * Instances that were previously associated with the service but that have
     * been deleted are not included in the count. The count might not reflect
     * pending registrations and deregistrations.
     * </p>
     *
     * @return <p>
     *         The number of instances that are currently associated with the
     *         service. Instances that were previously associated with the
     *         service but that have been deleted are not included in the count.
     *         The count might not reflect pending registrations and
     *         deregistrations.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service.
     * Instances that were previously associated with the service but that have
     * been deleted are not included in the count. The count might not reflect
     * pending registrations and deregistrations.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances that are currently associated with the
     *            service. Instances that were previously associated with the
     *            service but that have been deleted are not included in the
     *            count. The count might not reflect pending registrations and
     *            deregistrations.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances that are currently associated with the service.
     * Instances that were previously associated with the service but that have
     * been deleted are not included in the count. The count might not reflect
     * pending registrations and deregistrations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances that are currently associated with the
     *            service. Instances that were previously associated with the
     *            service but that have been deleted are not included in the
     *            count. The count might not reflect pending registrations and
     *            deregistrations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 DNS
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the Amazon Route
     *         53 DNS records that you want AWS Cloud Map to create when you
     *         register an instance.
     *         </p>
     */
    public DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 DNS
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Amazon
     *            Route 53 DNS records that you want AWS Cloud Map to create
     *            when you register an instance.
     *            </p>
     */
    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 DNS
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Amazon
     *            Route 53 DNS records that you want AWS Cloud Map to create
     *            when you register an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional health check. If you specify settings for a
     * health check, AWS Cloud Map associates the health check with the records
     * that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Note the following about configuring health checks.
     * </p>
     * <p>
     * <b>A and AAAA records</b>
     * </p>
     * <p>
     * If <code>DnsConfig</code> includes configurations for both A and AAAA
     * records, AWS Cloud Map creates a health check that uses the IPv4 address
     * to check the health of the resource. If the endpoint that is specified by
     * the IPv4 address is unhealthy, Route 53 considers both the A and AAAA
     * records to be unhealthy.
     * </p>
     * <p>
     * <b>CNAME records</b>
     * </p>
     * <p>
     * You can't specify settings for <code>HealthCheckConfig</code> when the
     * <code>DNSConfig</code> includes <code>CNAME</code> for the value of
     * <code>Type</code>. If you do, the <code>CreateService</code> request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Request interval</b>
     * </p>
     * <p>
     * A Route 53 health checker in each health-checking region sends a health
     * check request to an endpoint every 30 seconds. On average, your endpoint
     * receives a health check request about every two seconds. However, health
     * checkers don't coordinate with one another, so you'll sometimes see
     * several requests per second followed by a few seconds with no health
     * checks at all.
     * </p>
     * <p>
     * <b>Health checking regions</b>
     * </p>
     * <p>
     * Health checkers perform checks from all Route 53 health-checking regions.
     * For a list of the current regions, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     * >Regions</a>.
     * </p>
     * <p>
     * <b>Alias records</b>
     * </p>
     * <p>
     * When you register an instance, if you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route
     * 53 alias record. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for
     * alias records. When <code>EvaluateTargetHealth</code> is true, the alias
     * record inherits the health of the referenced AWS resource. such as an ELB
     * load balancer. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     * >EvaluateTargetHealth</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>HealthCheckConfig</code> and then use the service to
     * register an instance that creates an alias record, Route 53 doesn't
     * create the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Charges for health checks</b>
     * </p>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     *
     * @return <p>
     *         <i>Public DNS and HTTP namespaces only.</i> A complex type that
     *         contains settings for an optional health check. If you specify
     *         settings for a health check, AWS Cloud Map associates the health
     *         check with the records that you specify in <code>DnsConfig</code>
     *         .
     *         </p>
     *         <important>
     *         <p>
     *         If you specify a health check configuration, you can specify
     *         either <code>HealthCheckCustomConfig</code> or
     *         <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         Health checks are basic Route 53 health checks that monitor an
     *         AWS endpoint. For information about pricing for health checks,
     *         see <a href="http://aws.amazon.com/route53/pricing/">Amazon Route
     *         53 Pricing</a>.
     *         </p>
     *         <p>
     *         Note the following about configuring health checks.
     *         </p>
     *         <p>
     *         <b>A and AAAA records</b>
     *         </p>
     *         <p>
     *         If <code>DnsConfig</code> includes configurations for both A and
     *         AAAA records, AWS Cloud Map creates a health check that uses the
     *         IPv4 address to check the health of the resource. If the endpoint
     *         that is specified by the IPv4 address is unhealthy, Route 53
     *         considers both the A and AAAA records to be unhealthy.
     *         </p>
     *         <p>
     *         <b>CNAME records</b>
     *         </p>
     *         <p>
     *         You can't specify settings for <code>HealthCheckConfig</code>
     *         when the <code>DNSConfig</code> includes <code>CNAME</code> for
     *         the value of <code>Type</code>. If you do, the
     *         <code>CreateService</code> request will fail with an
     *         <code>InvalidInput</code> error.
     *         </p>
     *         <p>
     *         <b>Request interval</b>
     *         </p>
     *         <p>
     *         A Route 53 health checker in each health-checking region sends a
     *         health check request to an endpoint every 30 seconds. On average,
     *         your endpoint receives a health check request about every two
     *         seconds. However, health checkers don't coordinate with one
     *         another, so you'll sometimes see several requests per second
     *         followed by a few seconds with no health checks at all.
     *         </p>
     *         <p>
     *         <b>Health checking regions</b>
     *         </p>
     *         <p>
     *         Health checkers perform checks from all Route 53 health-checking
     *         regions. For a list of the current regions, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     *         >Regions</a>.
     *         </p>
     *         <p>
     *         <b>Alias records</b>
     *         </p>
     *         <p>
     *         When you register an instance, if you include the
     *         <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates
     *         a Route 53 alias record. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Route 53 automatically sets <code>EvaluateTargetHealth</code> to
     *         true for alias records. When <code>EvaluateTargetHealth</code> is
     *         true, the alias record inherits the health of the referenced AWS
     *         resource. such as an ELB load balancer. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     *         >EvaluateTargetHealth</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you include <code>HealthCheckConfig</code> and then use the
     *         service to register an instance that creates an alias record,
     *         Route 53 doesn't create the health check.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Charges for health checks</b>
     *         </p>
     *         <p>
     *         Health checks are basic Route 53 health checks that monitor an
     *         AWS endpoint. For information about pricing for health checks,
     *         see <a href="http://aws.amazon.com/route53/pricing/">Amazon Route
     *         53 Pricing</a>.
     *         </p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional health check. If you specify settings for a
     * health check, AWS Cloud Map associates the health check with the records
     * that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Note the following about configuring health checks.
     * </p>
     * <p>
     * <b>A and AAAA records</b>
     * </p>
     * <p>
     * If <code>DnsConfig</code> includes configurations for both A and AAAA
     * records, AWS Cloud Map creates a health check that uses the IPv4 address
     * to check the health of the resource. If the endpoint that is specified by
     * the IPv4 address is unhealthy, Route 53 considers both the A and AAAA
     * records to be unhealthy.
     * </p>
     * <p>
     * <b>CNAME records</b>
     * </p>
     * <p>
     * You can't specify settings for <code>HealthCheckConfig</code> when the
     * <code>DNSConfig</code> includes <code>CNAME</code> for the value of
     * <code>Type</code>. If you do, the <code>CreateService</code> request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Request interval</b>
     * </p>
     * <p>
     * A Route 53 health checker in each health-checking region sends a health
     * check request to an endpoint every 30 seconds. On average, your endpoint
     * receives a health check request about every two seconds. However, health
     * checkers don't coordinate with one another, so you'll sometimes see
     * several requests per second followed by a few seconds with no health
     * checks at all.
     * </p>
     * <p>
     * <b>Health checking regions</b>
     * </p>
     * <p>
     * Health checkers perform checks from all Route 53 health-checking regions.
     * For a list of the current regions, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     * >Regions</a>.
     * </p>
     * <p>
     * <b>Alias records</b>
     * </p>
     * <p>
     * When you register an instance, if you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route
     * 53 alias record. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for
     * alias records. When <code>EvaluateTargetHealth</code> is true, the alias
     * record inherits the health of the referenced AWS resource. such as an ELB
     * load balancer. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     * >EvaluateTargetHealth</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>HealthCheckConfig</code> and then use the service to
     * register an instance that creates an alias record, Route 53 doesn't
     * create the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Charges for health checks</b>
     * </p>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     *
     * @param healthCheckConfig <p>
     *            <i>Public DNS and HTTP namespaces only.</i> A complex type
     *            that contains settings for an optional health check. If you
     *            specify settings for a health check, AWS Cloud Map associates
     *            the health check with the records that you specify in
     *            <code>DnsConfig</code>.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            Health checks are basic Route 53 health checks that monitor an
     *            AWS endpoint. For information about pricing for health checks,
     *            see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     *            Route 53 Pricing</a>.
     *            </p>
     *            <p>
     *            Note the following about configuring health checks.
     *            </p>
     *            <p>
     *            <b>A and AAAA records</b>
     *            </p>
     *            <p>
     *            If <code>DnsConfig</code> includes configurations for both A
     *            and AAAA records, AWS Cloud Map creates a health check that
     *            uses the IPv4 address to check the health of the resource. If
     *            the endpoint that is specified by the IPv4 address is
     *            unhealthy, Route 53 considers both the A and AAAA records to
     *            be unhealthy.
     *            </p>
     *            <p>
     *            <b>CNAME records</b>
     *            </p>
     *            <p>
     *            You can't specify settings for <code>HealthCheckConfig</code>
     *            when the <code>DNSConfig</code> includes <code>CNAME</code>
     *            for the value of <code>Type</code>. If you do, the
     *            <code>CreateService</code> request will fail with an
     *            <code>InvalidInput</code> error.
     *            </p>
     *            <p>
     *            <b>Request interval</b>
     *            </p>
     *            <p>
     *            A Route 53 health checker in each health-checking region sends
     *            a health check request to an endpoint every 30 seconds. On
     *            average, your endpoint receives a health check request about
     *            every two seconds. However, health checkers don't coordinate
     *            with one another, so you'll sometimes see several requests per
     *            second followed by a few seconds with no health checks at all.
     *            </p>
     *            <p>
     *            <b>Health checking regions</b>
     *            </p>
     *            <p>
     *            Health checkers perform checks from all Route 53
     *            health-checking regions. For a list of the current regions,
     *            see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     *            >Regions</a>.
     *            </p>
     *            <p>
     *            <b>Alias records</b>
     *            </p>
     *            <p>
     *            When you register an instance, if you include the
     *            <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map
     *            creates a Route 53 alias record. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Route 53 automatically sets <code>EvaluateTargetHealth</code>
     *            to true for alias records. When
     *            <code>EvaluateTargetHealth</code> is true, the alias record
     *            inherits the health of the referenced AWS resource. such as an
     *            ELB load balancer. For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     *            >EvaluateTargetHealth</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you include <code>HealthCheckConfig</code> and then use the
     *            service to register an instance that creates an alias record,
     *            Route 53 doesn't create the health check.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Charges for health checks</b>
     *            </p>
     *            <p>
     *            Health checks are basic Route 53 health checks that monitor an
     *            AWS endpoint. For information about pricing for health checks,
     *            see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     *            Route 53 Pricing</a>.
     *            </p>
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional health check. If you specify settings for a
     * health check, AWS Cloud Map associates the health check with the records
     * that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Note the following about configuring health checks.
     * </p>
     * <p>
     * <b>A and AAAA records</b>
     * </p>
     * <p>
     * If <code>DnsConfig</code> includes configurations for both A and AAAA
     * records, AWS Cloud Map creates a health check that uses the IPv4 address
     * to check the health of the resource. If the endpoint that is specified by
     * the IPv4 address is unhealthy, Route 53 considers both the A and AAAA
     * records to be unhealthy.
     * </p>
     * <p>
     * <b>CNAME records</b>
     * </p>
     * <p>
     * You can't specify settings for <code>HealthCheckConfig</code> when the
     * <code>DNSConfig</code> includes <code>CNAME</code> for the value of
     * <code>Type</code>. If you do, the <code>CreateService</code> request will
     * fail with an <code>InvalidInput</code> error.
     * </p>
     * <p>
     * <b>Request interval</b>
     * </p>
     * <p>
     * A Route 53 health checker in each health-checking region sends a health
     * check request to an endpoint every 30 seconds. On average, your endpoint
     * receives a health check request about every two seconds. However, health
     * checkers don't coordinate with one another, so you'll sometimes see
     * several requests per second followed by a few seconds with no health
     * checks at all.
     * </p>
     * <p>
     * <b>Health checking regions</b>
     * </p>
     * <p>
     * Health checkers perform checks from all Route 53 health-checking regions.
     * For a list of the current regions, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     * >Regions</a>.
     * </p>
     * <p>
     * <b>Alias records</b>
     * </p>
     * <p>
     * When you register an instance, if you include the
     * <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route
     * 53 alias record. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for
     * alias records. When <code>EvaluateTargetHealth</code> is true, the alias
     * record inherits the health of the referenced AWS resource. such as an ELB
     * load balancer. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     * >EvaluateTargetHealth</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you include <code>HealthCheckConfig</code> and then use the service to
     * register an instance that creates an alias record, Route 53 doesn't
     * create the health check.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Charges for health checks</b>
     * </p>
     * <p>
     * Health checks are basic Route 53 health checks that monitor an AWS
     * endpoint. For information about pricing for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckConfig <p>
     *            <i>Public DNS and HTTP namespaces only.</i> A complex type
     *            that contains settings for an optional health check. If you
     *            specify settings for a health check, AWS Cloud Map associates
     *            the health check with the records that you specify in
     *            <code>DnsConfig</code>.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            Health checks are basic Route 53 health checks that monitor an
     *            AWS endpoint. For information about pricing for health checks,
     *            see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     *            Route 53 Pricing</a>.
     *            </p>
     *            <p>
     *            Note the following about configuring health checks.
     *            </p>
     *            <p>
     *            <b>A and AAAA records</b>
     *            </p>
     *            <p>
     *            If <code>DnsConfig</code> includes configurations for both A
     *            and AAAA records, AWS Cloud Map creates a health check that
     *            uses the IPv4 address to check the health of the resource. If
     *            the endpoint that is specified by the IPv4 address is
     *            unhealthy, Route 53 considers both the A and AAAA records to
     *            be unhealthy.
     *            </p>
     *            <p>
     *            <b>CNAME records</b>
     *            </p>
     *            <p>
     *            You can't specify settings for <code>HealthCheckConfig</code>
     *            when the <code>DNSConfig</code> includes <code>CNAME</code>
     *            for the value of <code>Type</code>. If you do, the
     *            <code>CreateService</code> request will fail with an
     *            <code>InvalidInput</code> error.
     *            </p>
     *            <p>
     *            <b>Request interval</b>
     *            </p>
     *            <p>
     *            A Route 53 health checker in each health-checking region sends
     *            a health check request to an endpoint every 30 seconds. On
     *            average, your endpoint receives a health check request about
     *            every two seconds. However, health checkers don't coordinate
     *            with one another, so you'll sometimes see several requests per
     *            second followed by a few seconds with no health checks at all.
     *            </p>
     *            <p>
     *            <b>Health checking regions</b>
     *            </p>
     *            <p>
     *            Health checkers perform checks from all Route 53
     *            health-checking regions. For a list of the current regions,
     *            see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
     *            >Regions</a>.
     *            </p>
     *            <p>
     *            <b>Alias records</b>
     *            </p>
     *            <p>
     *            When you register an instance, if you include the
     *            <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map
     *            creates a Route 53 alias record. Note the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Route 53 automatically sets <code>EvaluateTargetHealth</code>
     *            to true for alias records. When
     *            <code>EvaluateTargetHealth</code> is true, the alias record
     *            inherits the health of the referenced AWS resource. such as an
     *            ELB load balancer. For more information, see <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
     *            >EvaluateTargetHealth</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you include <code>HealthCheckConfig</code> and then use the
     *            service to register an instance that creates an alias record,
     *            Route 53 doesn't create the health check.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Charges for health checks</b>
     *            </p>
     *            <p>
     *            Health checks are basic Route 53 health checks that monitor an
     *            AWS endpoint. For information about pricing for health checks,
     *            see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     *            Route 53 Pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check. A custom health check, which requires that you use a third-party
     * health checker to evaluate the health of your resources, is useful in the
     * following circumstances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use a health check that is defined by
     * <code>HealthCheckConfig</code> because the resource isn't available over
     * the internet. For example, you can use a custom health check when the
     * instance is in an Amazon VPC. (To check the health of resources in a VPC,
     * the health checker must also be in the VPC.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to use a third-party health checker regardless of where your
     * resources are.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * To change the status of a custom health check, submit an
     * <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud Map
     * doesn't monitor the status of the resource, it just keeps a record of the
     * status specified in the most recent
     * <code>UpdateInstanceCustomHealthStatus</code> request.
     * </p>
     * <p>
     * Here's how custom health checks work:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create a service and specify a value for
     * <code>FailureThreshold</code>.
     * </p>
     * <p>
     * The failure threshold indicates the number of 30-second intervals you
     * want AWS Cloud Map to wait between the time that your application sends
     * an <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     * >UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud
     * Map stops routing internet traffic to the corresponding resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * You register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You configure a third-party health checker to monitor the resource that
     * is associated with the new instance.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map doesn't check the health of the resource directly.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The third-party health-checker determines that the resource is unhealthy
     * and notifies your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your application submits an <code>UpdateInstanceCustomHealthStatus</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't
     * arrive during that time to change the status back to healthy, AWS Cloud
     * Map stops routing traffic to the resource.
     * </p>
     * </li>
     * </ol>
     *
     * @return <p>
     *         A complex type that contains information about an optional custom
     *         health check. A custom health check, which requires that you use
     *         a third-party health checker to evaluate the health of your
     *         resources, is useful in the following circumstances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't use a health check that is defined by
     *         <code>HealthCheckConfig</code> because the resource isn't
     *         available over the internet. For example, you can use a custom
     *         health check when the instance is in an Amazon VPC. (To check the
     *         health of resources in a VPC, the health checker must also be in
     *         the VPC.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You want to use a third-party health checker regardless of where
     *         your resources are.
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         If you specify a health check configuration, you can specify
     *         either <code>HealthCheckCustomConfig</code> or
     *         <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         To change the status of a custom health check, submit an
     *         <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud
     *         Map doesn't monitor the status of the resource, it just keeps a
     *         record of the status specified in the most recent
     *         <code>UpdateInstanceCustomHealthStatus</code> request.
     *         </p>
     *         <p>
     *         Here's how custom health checks work:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         You create a service and specify a value for
     *         <code>FailureThreshold</code>.
     *         </p>
     *         <p>
     *         The failure threshold indicates the number of 30-second intervals
     *         you want AWS Cloud Map to wait between the time that your
     *         application sends an <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     *         >UpdateInstanceCustomHealthStatus</a> request and the time that
     *         AWS Cloud Map stops routing internet traffic to the corresponding
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You register an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You configure a third-party health checker to monitor the
     *         resource that is associated with the new instance.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Cloud Map doesn't check the health of the resource directly.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         The third-party health-checker determines that the resource is
     *         unhealthy and notifies your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your application submits an
     *         <code>UpdateInstanceCustomHealthStatus</code> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS Cloud Map waits for (<code>FailureThreshold</code> x 30)
     *         seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If another <code>UpdateInstanceCustomHealthStatus</code> request
     *         doesn't arrive during that time to change the status back to
     *         healthy, AWS Cloud Map stops routing traffic to the resource.
     *         </p>
     *         </li>
     *         </ol>
     */
    public HealthCheckCustomConfig getHealthCheckCustomConfig() {
        return healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check. A custom health check, which requires that you use a third-party
     * health checker to evaluate the health of your resources, is useful in the
     * following circumstances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use a health check that is defined by
     * <code>HealthCheckConfig</code> because the resource isn't available over
     * the internet. For example, you can use a custom health check when the
     * instance is in an Amazon VPC. (To check the health of resources in a VPC,
     * the health checker must also be in the VPC.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to use a third-party health checker regardless of where your
     * resources are.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * To change the status of a custom health check, submit an
     * <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud Map
     * doesn't monitor the status of the resource, it just keeps a record of the
     * status specified in the most recent
     * <code>UpdateInstanceCustomHealthStatus</code> request.
     * </p>
     * <p>
     * Here's how custom health checks work:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create a service and specify a value for
     * <code>FailureThreshold</code>.
     * </p>
     * <p>
     * The failure threshold indicates the number of 30-second intervals you
     * want AWS Cloud Map to wait between the time that your application sends
     * an <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     * >UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud
     * Map stops routing internet traffic to the corresponding resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * You register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You configure a third-party health checker to monitor the resource that
     * is associated with the new instance.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map doesn't check the health of the resource directly.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The third-party health-checker determines that the resource is unhealthy
     * and notifies your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your application submits an <code>UpdateInstanceCustomHealthStatus</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't
     * arrive during that time to change the status back to healthy, AWS Cloud
     * Map stops routing traffic to the resource.
     * </p>
     * </li>
     * </ol>
     *
     * @param healthCheckCustomConfig <p>
     *            A complex type that contains information about an optional
     *            custom health check. A custom health check, which requires
     *            that you use a third-party health checker to evaluate the
     *            health of your resources, is useful in the following
     *            circumstances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You can't use a health check that is defined by
     *            <code>HealthCheckConfig</code> because the resource isn't
     *            available over the internet. For example, you can use a custom
     *            health check when the instance is in an Amazon VPC. (To check
     *            the health of resources in a VPC, the health checker must also
     *            be in the VPC.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You want to use a third-party health checker regardless of
     *            where your resources are.
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            To change the status of a custom health check, submit an
     *            <code>UpdateInstanceCustomHealthStatus</code> request. AWS
     *            Cloud Map doesn't monitor the status of the resource, it just
     *            keeps a record of the status specified in the most recent
     *            <code>UpdateInstanceCustomHealthStatus</code> request.
     *            </p>
     *            <p>
     *            Here's how custom health checks work:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            You create a service and specify a value for
     *            <code>FailureThreshold</code>.
     *            </p>
     *            <p>
     *            The failure threshold indicates the number of 30-second
     *            intervals you want AWS Cloud Map to wait between the time that
     *            your application sends an <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     *            >UpdateInstanceCustomHealthStatus</a> request and the time
     *            that AWS Cloud Map stops routing internet traffic to the
     *            corresponding resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You configure a third-party health checker to monitor the
     *            resource that is associated with the new instance.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Cloud Map doesn't check the health of the resource
     *            directly.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            The third-party health-checker determines that the resource is
     *            unhealthy and notifies your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Your application submits an
     *            <code>UpdateInstanceCustomHealthStatus</code> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS Cloud Map waits for (<code>FailureThreshold</code> x 30)
     *            seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If another <code>UpdateInstanceCustomHealthStatus</code>
     *            request doesn't arrive during that time to change the status
     *            back to healthy, AWS Cloud Map stops routing traffic to the
     *            resource.
     *            </p>
     *            </li>
     *            </ol>
     */
    public void setHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check. A custom health check, which requires that you use a third-party
     * health checker to evaluate the health of your resources, is useful in the
     * following circumstances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't use a health check that is defined by
     * <code>HealthCheckConfig</code> because the resource isn't available over
     * the internet. For example, you can use a custom health check when the
     * instance is in an Amazon VPC. (To check the health of resources in a VPC,
     * the health checker must also be in the VPC.)
     * </p>
     * </li>
     * <li>
     * <p>
     * You want to use a third-party health checker regardless of where your
     * resources are.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * To change the status of a custom health check, submit an
     * <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud Map
     * doesn't monitor the status of the resource, it just keeps a record of the
     * status specified in the most recent
     * <code>UpdateInstanceCustomHealthStatus</code> request.
     * </p>
     * <p>
     * Here's how custom health checks work:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create a service and specify a value for
     * <code>FailureThreshold</code>.
     * </p>
     * <p>
     * The failure threshold indicates the number of 30-second intervals you
     * want AWS Cloud Map to wait between the time that your application sends
     * an <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     * >UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud
     * Map stops routing internet traffic to the corresponding resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * You register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * You configure a third-party health checker to monitor the resource that
     * is associated with the new instance.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map doesn't check the health of the resource directly.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * The third-party health-checker determines that the resource is unhealthy
     * and notifies your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your application submits an <code>UpdateInstanceCustomHealthStatus</code>
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't
     * arrive during that time to change the status back to healthy, AWS Cloud
     * Map stops routing traffic to the resource.
     * </p>
     * </li>
     * </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckCustomConfig <p>
     *            A complex type that contains information about an optional
     *            custom health check. A custom health check, which requires
     *            that you use a third-party health checker to evaluate the
     *            health of your resources, is useful in the following
     *            circumstances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You can't use a health check that is defined by
     *            <code>HealthCheckConfig</code> because the resource isn't
     *            available over the internet. For example, you can use a custom
     *            health check when the instance is in an Amazon VPC. (To check
     *            the health of resources in a VPC, the health checker must also
     *            be in the VPC.)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You want to use a third-party health checker regardless of
     *            where your resources are.
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            To change the status of a custom health check, submit an
     *            <code>UpdateInstanceCustomHealthStatus</code> request. AWS
     *            Cloud Map doesn't monitor the status of the resource, it just
     *            keeps a record of the status specified in the most recent
     *            <code>UpdateInstanceCustomHealthStatus</code> request.
     *            </p>
     *            <p>
     *            Here's how custom health checks work:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            You create a service and specify a value for
     *            <code>FailureThreshold</code>.
     *            </p>
     *            <p>
     *            The failure threshold indicates the number of 30-second
     *            intervals you want AWS Cloud Map to wait between the time that
     *            your application sends an <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html"
     *            >UpdateInstanceCustomHealthStatus</a> request and the time
     *            that AWS Cloud Map stops routing internet traffic to the
     *            corresponding resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You register an instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You configure a third-party health checker to monitor the
     *            resource that is associated with the new instance.
     *            </p>
     *            <note>
     *            <p>
     *            AWS Cloud Map doesn't check the health of the resource
     *            directly.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            The third-party health-checker determines that the resource is
     *            unhealthy and notifies your application.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Your application submits an
     *            <code>UpdateInstanceCustomHealthStatus</code> request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AWS Cloud Map waits for (<code>FailureThreshold</code> x 30)
     *            seconds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If another <code>UpdateInstanceCustomHealthStatus</code>
     *            request doesn't arrive during that time to change the status
     *            back to healthy, AWS Cloud Map stops routing traffic to the
     *            resource.
     *            </p>
     *            </li>
     *            </ol>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withHealthCheckCustomConfig(
            HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        return this;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the service was created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time that the service was created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the service was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time that the service was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSummary withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: " + getDnsConfig() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig() + ",");
        if (getHealthCheckCustomConfig() != null)
            sb.append("HealthCheckCustomConfig: " + getHealthCheckCustomConfig() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckCustomConfig() == null) ? 0 : getHealthCheckCustomConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSummary == false)
            return false;
        ServiceSummary other = (ServiceSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getDnsConfig() == null ^ this.getDnsConfig() == null)
            return false;
        if (other.getDnsConfig() != null
                && other.getDnsConfig().equals(this.getDnsConfig()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null
                && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        if (other.getHealthCheckCustomConfig() == null ^ this.getHealthCheckCustomConfig() == null)
            return false;
        if (other.getHealthCheckCustomConfig() != null
                && other.getHealthCheckCustomConfig().equals(this.getHealthCheckCustomConfig()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }
}
