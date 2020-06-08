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
 * Creates a service, which defines the configuration for the following
 * entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For public and private DNS namespaces, one of the following combinations of
 * DNS records in Amazon Route 53:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A
 * </p>
 * </li>
 * <li>
 * <p>
 * AAAA
 * </p>
 * </li>
 * <li>
 * <p>
 * A and AAAA
 * </p>
 * </li>
 * <li>
 * <p>
 * SRV
 * </p>
 * </li>
 * <li>
 * <p>
 * CNAME
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Optionally, a health check
 * </p>
 * </li>
 * </ul>
 * <p>
 * After you create the service, you can submit a <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html"
 * >RegisterInstance</a> request, and AWS Cloud Map uses the values in the
 * configuration to create the specified entities.
 * </p>
 * <p>
 * For the current limit on the number of instances that you can register using
 * the same namespace and using the same service, see <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS
 * Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
 * </p>
 */
public class CreateServiceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an SRV record when you register an
     * instance, and if you're using a system that requires a specific SRV
     * format, such as <a href="http://www.haproxy.org/">HAProxy</a>, specify
     * the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as
     * <code>_exampleservice</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, AWS Cloud Map creates an SRV record and
     * assigns a name to the record by concatenating the service name and the
     * namespace name, for example:
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>
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
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String namespaceId;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateService</code> requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

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
     * A complex type that contains information about the Amazon Route 53
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     */
    private DnsConfig dnsConfig;

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional Route 53 health check. If you specify settings
     * for a health check, AWS Cloud Map associates the health check with all
     * the Route 53 DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a
     * href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     * Pricing</a>.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
     * configuration from an existing service.
     * </p>
     */
    private HealthCheckCustomConfig healthCheckCustomConfig;

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an SRV record when you register an
     * instance, and if you're using a system that requires a specific SRV
     * format, such as <a href="http://www.haproxy.org/">HAProxy</a>, specify
     * the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as
     * <code>_exampleservice</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, AWS Cloud Map creates an SRV record and
     * assigns a name to the record by concatenating the service name and the
     * namespace name, for example:
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @return <p>
     *         The name that you want to assign to the service.
     *         </p>
     *         <p>
     *         If you want AWS Cloud Map to create an SRV record when you
     *         register an instance, and if you're using a system that requires
     *         a specific SRV format, such as <a
     *         href="http://www.haproxy.org/">HAProxy</a>, specify the following
     *         for <code>Name</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start the name with an underscore (_), such as
     *         <code>_exampleservice</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         End the name with <i>._protocol</i>, such as <code>._tcp</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you register an instance, AWS Cloud Map creates an SRV
     *         record and assigns a name to the record by concatenating the
     *         service name and the namespace name, for example:
     *         </p>
     *         <p>
     *         <code>_exampleservice._tcp.example.com</code>
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an SRV record when you register an
     * instance, and if you're using a system that requires a specific SRV
     * format, such as <a href="http://www.haproxy.org/">HAProxy</a>, specify
     * the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as
     * <code>_exampleservice</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, AWS Cloud Map creates an SRV record and
     * assigns a name to the record by concatenating the service name and the
     * namespace name, for example:
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @param name <p>
     *            The name that you want to assign to the service.
     *            </p>
     *            <p>
     *            If you want AWS Cloud Map to create an SRV record when you
     *            register an instance, and if you're using a system that
     *            requires a specific SRV format, such as <a
     *            href="http://www.haproxy.org/">HAProxy</a>, specify the
     *            following for <code>Name</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Start the name with an underscore (_), such as
     *            <code>_exampleservice</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            End the name with <i>._protocol</i>, such as
     *            <code>._tcp</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you register an instance, AWS Cloud Map creates an SRV
     *            record and assigns a name to the record by concatenating the
     *            service name and the namespace name, for example:
     *            </p>
     *            <p>
     *            <code>_exampleservice._tcp.example.com</code>
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an SRV record when you register an
     * instance, and if you're using a system that requires a specific SRV
     * format, such as <a href="http://www.haproxy.org/">HAProxy</a>, specify
     * the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as
     * <code>_exampleservice</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, AWS Cloud Map creates an SRV record and
     * assigns a name to the record by concatenating the service name and the
     * namespace name, for example:
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>
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
     *            The name that you want to assign to the service.
     *            </p>
     *            <p>
     *            If you want AWS Cloud Map to create an SRV record when you
     *            register an instance, and if you're using a system that
     *            requires a specific SRV format, such as <a
     *            href="http://www.haproxy.org/">HAProxy</a>, specify the
     *            following for <code>Name</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Start the name with an underscore (_), such as
     *            <code>_exampleservice</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            End the name with <i>._protocol</i>, such as
     *            <code>._tcp</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you register an instance, AWS Cloud Map creates an SRV
     *            record and assigns a name to the record by concatenating the
     *            service name and the namespace name, for example:
     *            </p>
     *            <p>
     *            <code>_exampleservice._tcp.example.com</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the namespace that you want to use to create the
     *         service.
     *         </p>
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param namespaceId <p>
     *            The ID of the namespace that you want to use to create the
     *            service.
     *            </p>
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param namespaceId <p>
     *            The ID of the namespace that you want to use to create the
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateService</code> requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed <code>CreateService</code> requests to be retried without
     *         the risk of executing the operation twice.
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
     * <code>CreateService</code> requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreateService</code> requests to be retried
     *            without the risk of executing the operation twice.
     *            <code>CreatorRequestId</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateService</code> requests to be retried without the risk of
     * executing the operation twice. <code>CreatorRequestId</code> can be any
     * unique string, for example, a date/time stamp.
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
     *            failed <code>CreateService</code> requests to be retried
     *            without the risk of executing the operation twice.
     *            <code>CreatorRequestId</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
        return this;
    }

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
    public CreateServiceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the Amazon Route
     *         53 records that you want AWS Cloud Map to create when you
     *         register an instance.
     *         </p>
     */
    public DnsConfig getDnsConfig() {
        return dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Amazon
     *            Route 53 records that you want AWS Cloud Map to create when
     *            you register an instance.
     *            </p>
     */
    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53
     * records that you want AWS Cloud Map to create when you register an
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsConfig <p>
     *            A complex type that contains information about the Amazon
     *            Route 53 records that you want AWS Cloud Map to create when
     *            you register an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional Route 53 health check. If you specify settings
     * for a health check, AWS Cloud Map associates the health check with all
     * the Route 53 DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a
     * href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     * Pricing</a>.
     * </p>
     *
     * @return <p>
     *         <i>Public DNS and HTTP namespaces only.</i> A complex type that
     *         contains settings for an optional Route 53 health check. If you
     *         specify settings for a health check, AWS Cloud Map associates the
     *         health check with all the Route 53 DNS records that you specify
     *         in <code>DnsConfig</code>.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify a health check configuration, you can specify
     *         either <code>HealthCheckCustomConfig</code> or
     *         <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         For information about the charges for health checks, see <a
     *         href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     *         Pricing</a>.
     *         </p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional Route 53 health check. If you specify settings
     * for a health check, AWS Cloud Map associates the health check with all
     * the Route 53 DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a
     * href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     * Pricing</a>.
     * </p>
     *
     * @param healthCheckConfig <p>
     *            <i>Public DNS and HTTP namespaces only.</i> A complex type
     *            that contains settings for an optional Route 53 health check.
     *            If you specify settings for a health check, AWS Cloud Map
     *            associates the health check with all the Route 53 DNS records
     *            that you specify in <code>DnsConfig</code>.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            For information about the charges for health checks, see <a
     *            href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     *            Pricing</a>.
     *            </p>
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains
     * settings for an optional Route 53 health check. If you specify settings
     * for a health check, AWS Cloud Map associates the health check with all
     * the Route 53 DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a
     * href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     * Pricing</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckConfig <p>
     *            <i>Public DNS and HTTP namespaces only.</i> A complex type
     *            that contains settings for an optional Route 53 health check.
     *            If you specify settings for a health check, AWS Cloud Map
     *            associates the health check with all the Route 53 DNS records
     *            that you specify in <code>DnsConfig</code>.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            For information about the charges for health checks, see <a
     *            href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map
     *            Pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
     * configuration from an existing service.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about an optional custom
     *         health check.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify a health check configuration, you can specify
     *         either <code>HealthCheckCustomConfig</code> or
     *         <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         You can't add, update, or delete a
     *         <code>HealthCheckCustomConfig</code> configuration from an
     *         existing service.
     *         </p>
     */
    public HealthCheckCustomConfig getHealthCheckCustomConfig() {
        return healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
     * configuration from an existing service.
     * </p>
     *
     * @param healthCheckCustomConfig <p>
     *            A complex type that contains information about an optional
     *            custom health check.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            You can't add, update, or delete a
     *            <code>HealthCheckCustomConfig</code> configuration from an
     *            existing service.
     *            </p>
     */
    public void setHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health
     * check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either
     * <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code>
     * but not both.
     * </p>
     * </important>
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code>
     * configuration from an existing service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckCustomConfig <p>
     *            A complex type that contains information about an optional
     *            custom health check.
     *            </p>
     *            <important>
     *            <p>
     *            If you specify a health check configuration, you can specify
     *            either <code>HealthCheckCustomConfig</code> or
     *            <code>HealthCheckConfig</code> but not both.
     *            </p>
     *            </important>
     *            <p>
     *            You can't add, update, or delete a
     *            <code>HealthCheckCustomConfig</code> configuration from an
     *            existing service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withHealthCheckCustomConfig(
            HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        return this;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @return <p>
     *         The tags to add to the service. Each tag consists of a key and an
     *         optional value, both of which you define. Tag keys can have a
     *         maximum character length of 128 characters, and tag values can
     *         have a maximum length of 256 characters.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The tags to add to the service. Each tag consists of a key and
     *            an optional value, both of which you define. Tag keys can have
     *            a maximum character length of 128 characters, and tag values
     *            can have a maximum length of 256 characters.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the service. Each tag consists of a key and
     *            an optional value, both of which you define. Tag keys can have
     *            a maximum character length of 128 characters, and tag values
     *            can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the service. Each tag consists of a key and
     *            an optional value, both of which you define. Tag keys can have
     *            a maximum character length of 128 characters, and tag values
     *            can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNamespaceId() != null)
            sb.append("NamespaceId: " + getNamespaceId() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: " + getDnsConfig() + ",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: " + getHealthCheckConfig() + ",");
        if (getHealthCheckCustomConfig() != null)
            sb.append("HealthCheckCustomConfig: " + getHealthCheckCustomConfig() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckCustomConfig() == null) ? 0 : getHealthCheckCustomConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null
                && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
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
        if (other.getHealthCheckCustomConfig() == null ^ this.getHealthCheckCustomConfig() == null)
            return false;
        if (other.getHealthCheckCustomConfig() != null
                && other.getHealthCheckCustomConfig().equals(this.getHealthCheckCustomConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
