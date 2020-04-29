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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains changes to an existing service.
 * </p>
 */
public class ServiceChange implements Serializable {
    /**
     * <p>
     * A description for the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records
     * that you want AWS Cloud Map to create when you register an instance.
     * </p>
     */
    private DnsConfigChange dnsConfig;

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
     * A description for the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A description for the service.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            A description for the service.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            A description for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceChange withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records
     * that you want AWS Cloud Map to create when you register an instance.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the Route 53 DNS
     *         records that you want AWS Cloud Map to create when you register
     *         an instance.
     *         </p>
     */
    public DnsConfigChange getDnsConfig() {
        return dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records
     * that you want AWS Cloud Map to create when you register an instance.
     * </p>
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Route 53
     *            DNS records that you want AWS Cloud Map to create when you
     *            register an instance.
     *            </p>
     */
    public void setDnsConfig(DnsConfigChange dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records
     * that you want AWS Cloud Map to create when you register an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Route 53
     *            DNS records that you want AWS Cloud Map to create when you
     *            register an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceChange withDnsConfig(DnsConfigChange dnsConfig) {
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
    public ServiceChange withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: " + getDnsConfig() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceChange == false)
            return false;
        ServiceChange other = (ServiceChange) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }
}
