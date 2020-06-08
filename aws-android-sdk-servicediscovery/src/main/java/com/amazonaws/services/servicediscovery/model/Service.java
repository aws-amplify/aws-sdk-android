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
 * A complex type that contains information about the specified service.
 * </p>
 */
public class Service implements Serializable {
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
     * The ID of the namespace that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String namespaceId;

    /**
     * <p>
     * The description of the service.
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
     * A complex type that contains information about the Route 53 DNS records
     * that you want AWS Cloud Map to create when you register an instance.
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
     * <p>
     * For information about the charges for health checks, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
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
     */
    private HealthCheckCustomConfig healthCheckCustomConfig;

    /**
     * <p>
     * The date and time that the service was created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing the operation twice.
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
    public Service withId(String id) {
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
    public Service withArn(String arn) {
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
    public Service withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the namespace that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the namespace that was used to create the service.
     *         </p>
     */
    public String getNamespaceId() {
        return namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that was used to create the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param namespaceId <p>
     *            The ID of the namespace that was used to create the service.
     *            </p>
     */
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that was used to create the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param namespaceId <p>
     *            The ID of the namespace that was used to create the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The description of the service.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description of the service.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description of the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDescription(String description) {
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
    public Service withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
    public DnsConfig getDnsConfig() {
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
    public void setDnsConfig(DnsConfig dnsConfig) {
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
    public Service withDnsConfig(DnsConfig dnsConfig) {
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
     * <p>
     * For information about the charges for health checks, see <a
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
     *         <p>
     *         For information about the charges for health checks, see <a
     *         href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     *         Pricing</a>.
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
     * <p>
     * For information about the charges for health checks, see <a
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
     *            <p>
     *            For information about the charges for health checks, see <a
     *            href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     *            Pricing</a>.
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
     * <p>
     * For information about the charges for health checks, see <a
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
     *            <p>
     *            For information about the charges for health checks, see <a
     *            href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     *            Pricing</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
        return this;
    }

    /**
     * <p>
     * The date and time that the service was created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that the service was created, in Unix format
     *         and Coordinated Universal Time (UTC). The value of
     *         <code>CreateDate</code> is accurate to milliseconds. For example,
     *         the value <code>1516925490.087</code> represents Friday, January
     *         26, 2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time that the service was created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @param createDate <p>
     *            The date and time that the service was created, in Unix format
     *            and Coordinated Universal Time (UTC). The value of
     *            <code>CreateDate</code> is accurate to milliseconds. For
     *            example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the service was created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time that the service was created, in Unix format
     *            and Coordinated Universal Time (UTC). The value of
     *            <code>CreateDate</code> is accurate to milliseconds. For
     *            example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing the operation twice.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed requests to be retried without the risk of executing the
     *         operation twice. <code>CreatorRequestId</code> can be any unique
     *         string, for example, a date/time stamp.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing the operation twice.
     * <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed requests to be retried without the risk of executing
     *            the operation twice. <code>CreatorRequestId</code> can be any
     *            unique string, for example, a date/time stamp.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing the operation twice.
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
     *            failed requests to be retried without the risk of executing
     *            the operation twice. <code>CreatorRequestId</code> can be any
     *            unique string, for example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
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
        if (getNamespaceId() != null)
            sb.append("NamespaceId: " + getNamespaceId() + ",");
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
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId());
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
                + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
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
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;

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
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null
                && other.getNamespaceId().equals(this.getNamespaceId()) == false)
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
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        return true;
    }
}
