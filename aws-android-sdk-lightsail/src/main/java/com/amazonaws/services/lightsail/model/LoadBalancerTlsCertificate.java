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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a load balancer SSL/TLS certificate.
 * </p>
 * <p>
 * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
 * </p>
 */
public class LoadBalancerTlsCertificate implements Serializable {
    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer or SSL/TLS certificate.
     * This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String loadBalancerName;

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     */
    private Boolean isAttached;

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     */
    private String status;

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects
     * describing the records.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords;

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     */
    private String failureReason;

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     */
    private java.util.Date issuedAt;

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String issuer;

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and
     * private key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String keyAlgorithm;

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed
     * renewal for the certificate.
     * </p>
     */
    private LoadBalancerTlsCertificateRenewalSummary renewalSummary;

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     */
    private String revocationReason;

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     */
    private java.util.Date revokedAt;

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String serial;

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String signatureAlgorithm;

    /**
     * <p>
     * The name of the entity that is associated with the public key contained
     * in the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String subject;

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list
     * contains the domain names that are bound to the public key that is
     * contained in the certificate. The subject alternative names include the
     * canonical domain name (CNAME) of the certificate and additional domain
     * names that can be used to connect to the website, such as
     * <code>example.com</code>, <code>www.example.com</code>, or
     * <code>m.example.com</code>.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the SSL/TLS certificate (e.g.,
     *         <code>my-certificate</code>).
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the SSL/TLS certificate (e.g.,
     *            <code>my-certificate</code>).
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the SSL/TLS certificate (e.g.,
     *            <code>my-certificate</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer or SSL/TLS certificate.
     * This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     *
     * @return <p>
     *         The support code. Include this code in your email to support when
     *         you have questions about your Lightsail load balancer or SSL/TLS
     *         certificate. This code enables our support team to look up your
     *         Lightsail information more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer or SSL/TLS certificate.
     * This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail load balancer or
     *            SSL/TLS certificate. This code enables our support team to
     *            look up your Lightsail information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail load balancer or SSL/TLS certificate.
     * This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail load balancer or
     *            SSL/TLS certificate. This code enables our support team to
     *            look up your Lightsail information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSupportCode(String supportCode) {
        this.supportCode = supportCode;
        return this;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     *
     * @return <p>
     *         The time when you created your SSL/TLS certificate.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     *
     * @param createdAt <p>
     *            The time when you created your SSL/TLS certificate.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time when you created your SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     *
     * @return <p>
     *         The AWS Region and Availability Zone where you created your
     *         certificate.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where you created your
     *            certificate.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where you created your
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The resource type (e.g., <code>LoadBalancerTlsCertificate</code>
     *         ).
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Instance</code> </b> - A Lightsail instance (a virtual
     *         private server)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StaticIp</code> </b> - A static IP address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     *         Lightsail instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance
     *         snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Domain</code> </b> - A DNS zone
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PeeredVpc</code> </b> - A peered VPC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS
     *         certificate associated with a Lightsail load balancer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskSnapshot</code> </b> - A block storage disk
     *         snapshot
     *         </p>
     *         </li>
     *         </ul>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g.,
     *            <code>LoadBalancerTlsCertificate</code>).
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance</code> </b> - A Lightsail instance (a
     *            virtual private server)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StaticIp</code> </b> - A static IP address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>KeyPair</code> </b> - The key pair used to connect
     *            to a Lightsail instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance
     *            snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Domain</code> </b> - A DNS zone
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>PeeredVpc</code> </b> - A peered VPC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS
     *            certificate associated with a Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>DiskSnapshot</code> </b> - A block storage disk
     *            snapshot
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g.,
     *            <code>LoadBalancerTlsCertificate</code>).
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance</code> </b> - A Lightsail instance (a
     *            virtual private server)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StaticIp</code> </b> - A static IP address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>KeyPair</code> </b> - The key pair used to connect
     *            to a Lightsail instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance
     *            snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Domain</code> </b> - A DNS zone
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>PeeredVpc</code> </b> - A peered VPC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS
     *            certificate associated with a Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>DiskSnapshot</code> </b> - A block storage disk
     *            snapshot
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LoadBalancerTlsCertificate withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g.,
     *            <code>LoadBalancerTlsCertificate</code>).
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance</code> </b> - A Lightsail instance (a
     *            virtual private server)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StaticIp</code> </b> - A static IP address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>KeyPair</code> </b> - The key pair used to connect
     *            to a Lightsail instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance
     *            snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Domain</code> </b> - A DNS zone
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>PeeredVpc</code> </b> - A peered VPC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS
     *            certificate associated with a Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>DiskSnapshot</code> </b> - A block storage disk
     *            snapshot
     *            </p>
     *            </li>
     *            </ul>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private
     * server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a
     * Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate
     * associated with a Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type (e.g.,
     *            <code>LoadBalancerTlsCertificate</code>).
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>Instance</code> </b> - A Lightsail instance (a
     *            virtual private server)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>StaticIp</code> </b> - A static IP address
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>KeyPair</code> </b> - The key pair used to connect
     *            to a Lightsail instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance
     *            snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Domain</code> </b> - A DNS zone
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>PeeredVpc</code> </b> - A peered VPC
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS
     *            certificate associated with a Lightsail load balancer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>DiskSnapshot</code> </b> - A block storage disk
     *            snapshot
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public LoadBalancerTlsCertificate withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values for the resource. For more
     *         information about tags in Lightsail, see the <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *         >Lightsail Dev Guide</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
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
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withTags(Tag... tags) {
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
     * The tag keys and optional values for the resource. For more information
     * about tags in Lightsail, see the <a href=
     * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     * >Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values for the resource. For more
     *            information about tags in Lightsail, see the <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags"
     *            >Lightsail Dev Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The load balancer name where your SSL/TLS certificate is
     *         attached.
     *         </p>
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name where your SSL/TLS certificate is
     *            attached.
     *            </p>
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param loadBalancerName <p>
     *            The load balancer name where your SSL/TLS certificate is
     *            attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, the SSL/TLS certificate is attached to
     *         the Lightsail load balancer.
     *         </p>
     */
    public Boolean isIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @return <p>
     *         When <code>true</code>, the SSL/TLS certificate is attached to
     *         the Lightsail load balancer.
     *         </p>
     */
    public Boolean getIsAttached() {
        return isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     *
     * @param isAttached <p>
     *            When <code>true</code>, the SSL/TLS certificate is attached to
     *            the Lightsail load balancer.
     *            </p>
     */
    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the
     * Lightsail load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAttached <p>
     *            When <code>true</code>, the SSL/TLS certificate is attached to
     *            the Lightsail load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
        return this;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     *
     * @return <p>
     *         The status of the SSL/TLS certificate. Valid values are below.
     *         </p>
     * @see LoadBalancerTlsCertificateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     *
     * @param status <p>
     *            The status of the SSL/TLS certificate. Valid values are below.
     *            </p>
     * @see LoadBalancerTlsCertificateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     *
     * @param status <p>
     *            The status of the SSL/TLS certificate. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateStatus
     */
    public LoadBalancerTlsCertificate withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     *
     * @param status <p>
     *            The status of the SSL/TLS certificate. Valid values are below.
     *            </p>
     * @see LoadBalancerTlsCertificateStatus
     */
    public void setStatus(LoadBalancerTlsCertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ISSUED, INACTIVE, EXPIRED,
     * VALIDATION_TIMED_OUT, REVOKED, FAILED, UNKNOWN
     *
     * @param status <p>
     *            The status of the SSL/TLS certificate. Valid values are below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateStatus
     */
    public LoadBalancerTlsCertificate withStatus(LoadBalancerTlsCertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     *
     * @return <p>
     *         The domain name for your SSL/TLS certificate.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     *
     * @param domainName <p>
     *            The domain name for your SSL/TLS certificate.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName <p>
     *            The domain name for your SSL/TLS certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects
     * describing the records.
     * </p>
     *
     * @return <p>
     *         An array of LoadBalancerTlsCertificateDomainValidationRecord
     *         objects describing the records.
     *         </p>
     */
    public java.util.List<LoadBalancerTlsCertificateDomainValidationRecord> getDomainValidationRecords() {
        return domainValidationRecords;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects
     * describing the records.
     * </p>
     *
     * @param domainValidationRecords <p>
     *            An array of LoadBalancerTlsCertificateDomainValidationRecord
     *            objects describing the records.
     *            </p>
     */
    public void setDomainValidationRecords(
            java.util.Collection<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords) {
        if (domainValidationRecords == null) {
            this.domainValidationRecords = null;
            return;
        }

        this.domainValidationRecords = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationRecord>(
                domainValidationRecords);
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects
     * describing the records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainValidationRecords <p>
     *            An array of LoadBalancerTlsCertificateDomainValidationRecord
     *            objects describing the records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withDomainValidationRecords(
            LoadBalancerTlsCertificateDomainValidationRecord... domainValidationRecords) {
        if (getDomainValidationRecords() == null) {
            this.domainValidationRecords = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationRecord>(
                    domainValidationRecords.length);
        }
        for (LoadBalancerTlsCertificateDomainValidationRecord value : domainValidationRecords) {
            this.domainValidationRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects
     * describing the records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainValidationRecords <p>
     *            An array of LoadBalancerTlsCertificateDomainValidationRecord
     *            objects describing the records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withDomainValidationRecords(
            java.util.Collection<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords) {
        setDomainValidationRecords(domainValidationRecords);
        return this;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     *
     * @return <p>
     *         The reason for the SSL/TLS certificate validation failure.
     *         </p>
     * @see LoadBalancerTlsCertificateFailureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     *
     * @param failureReason <p>
     *            The reason for the SSL/TLS certificate validation failure.
     *            </p>
     * @see LoadBalancerTlsCertificateFailureReason
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     *
     * @param failureReason <p>
     *            The reason for the SSL/TLS certificate validation failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateFailureReason
     */
    public LoadBalancerTlsCertificate withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     *
     * @param failureReason <p>
     *            The reason for the SSL/TLS certificate validation failure.
     *            </p>
     * @see LoadBalancerTlsCertificateFailureReason
     */
    public void setFailureReason(LoadBalancerTlsCertificateFailureReason failureReason) {
        this.failureReason = failureReason.toString();
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_AVAILABLE_CONTACTS,
     * ADDITIONAL_VERIFICATION_REQUIRED, DOMAIN_NOT_ALLOWED,
     * INVALID_PUBLIC_DOMAIN, OTHER
     *
     * @param failureReason <p>
     *            The reason for the SSL/TLS certificate validation failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateFailureReason
     */
    public LoadBalancerTlsCertificate withFailureReason(
            LoadBalancerTlsCertificateFailureReason failureReason) {
        this.failureReason = failureReason.toString();
        return this;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     *
     * @return <p>
     *         The time when the SSL/TLS certificate was issued.
     *         </p>
     */
    public java.util.Date getIssuedAt() {
        return issuedAt;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     *
     * @param issuedAt <p>
     *            The time when the SSL/TLS certificate was issued.
     *            </p>
     */
    public void setIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issuedAt <p>
     *            The time when the SSL/TLS certificate was issued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The issuer of the certificate.
     *         </p>
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param issuer <p>
     *            The issuer of the certificate.
     *            </p>
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param issuer <p>
     *            The issuer of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and
     * private key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The algorithm that was used to generate the key pair (the public
     *         and private key).
     *         </p>
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and
     * private key).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyAlgorithm <p>
     *            The algorithm that was used to generate the key pair (the
     *            public and private key).
     *            </p>
     */
    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and
     * private key).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param keyAlgorithm <p>
     *            The algorithm that was used to generate the key pair (the
     *            public and private key).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     *
     * @return <p>
     *         The timestamp when the SSL/TLS certificate expires.
     *         </p>
     */
    public java.util.Date getNotAfter() {
        return notAfter;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     *
     * @param notAfter <p>
     *            The timestamp when the SSL/TLS certificate expires.
     *            </p>
     */
    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notAfter <p>
     *            The timestamp when the SSL/TLS certificate expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     *
     * @return <p>
     *         The timestamp when the SSL/TLS certificate is first valid.
     *         </p>
     */
    public java.util.Date getNotBefore() {
        return notBefore;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     *
     * @param notBefore <p>
     *            The timestamp when the SSL/TLS certificate is first valid.
     *            </p>
     */
    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notBefore <p>
     *            The timestamp when the SSL/TLS certificate is first valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed
     * renewal for the certificate.
     * </p>
     *
     * @return <p>
     *         An object containing information about the status of Lightsail's
     *         managed renewal for the certificate.
     *         </p>
     */
    public LoadBalancerTlsCertificateRenewalSummary getRenewalSummary() {
        return renewalSummary;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed
     * renewal for the certificate.
     * </p>
     *
     * @param renewalSummary <p>
     *            An object containing information about the status of
     *            Lightsail's managed renewal for the certificate.
     *            </p>
     */
    public void setRenewalSummary(LoadBalancerTlsCertificateRenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed
     * renewal for the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param renewalSummary <p>
     *            An object containing information about the status of
     *            Lightsail's managed renewal for the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withRenewalSummary(
            LoadBalancerTlsCertificateRenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     *
     * @return <p>
     *         The reason the certificate was revoked. Valid values are below.
     *         </p>
     * @see LoadBalancerTlsCertificateRevocationReason
     */
    public String getRevocationReason() {
        return revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     *
     * @param revocationReason <p>
     *            The reason the certificate was revoked. Valid values are
     *            below.
     *            </p>
     * @see LoadBalancerTlsCertificateRevocationReason
     */
    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     *
     * @param revocationReason <p>
     *            The reason the certificate was revoked. Valid values are
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateRevocationReason
     */
    public LoadBalancerTlsCertificate withRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     *
     * @param revocationReason <p>
     *            The reason the certificate was revoked. Valid values are
     *            below.
     *            </p>
     * @see LoadBalancerTlsCertificateRevocationReason
     */
    public void setRevocationReason(LoadBalancerTlsCertificateRevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNSPECIFIED, KEY_COMPROMISE, CA_COMPROMISE,
     * AFFILIATION_CHANGED, SUPERCEDED, CESSATION_OF_OPERATION,
     * CERTIFICATE_HOLD, REMOVE_FROM_CRL, PRIVILEGE_WITHDRAWN, A_A_COMPROMISE
     *
     * @param revocationReason <p>
     *            The reason the certificate was revoked. Valid values are
     *            below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerTlsCertificateRevocationReason
     */
    public LoadBalancerTlsCertificate withRevocationReason(
            LoadBalancerTlsCertificateRevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     *
     * @return <p>
     *         The timestamp when the SSL/TLS certificate was revoked.
     *         </p>
     */
    public java.util.Date getRevokedAt() {
        return revokedAt;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     *
     * @param revokedAt <p>
     *            The timestamp when the SSL/TLS certificate was revoked.
     *            </p>
     */
    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokedAt <p>
     *            The timestamp when the SSL/TLS certificate was revoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The serial number of the certificate.
     *         </p>
     */
    public String getSerial() {
        return serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param serial <p>
     *            The serial number of the certificate.
     *            </p>
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param serial <p>
     *            The serial number of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The algorithm that was used to sign the certificate.
     *         </p>
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param signatureAlgorithm <p>
     *            The algorithm that was used to sign the certificate.
     *            </p>
     */
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param signatureAlgorithm <p>
     *            The algorithm that was used to sign the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained
     * in the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the entity that is associated with the public key
     *         contained in the certificate.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained
     * in the certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subject <p>
     *            The name of the entity that is associated with the public key
     *            contained in the certificate.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained
     * in the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subject <p>
     *            The name of the entity that is associated with the public key
     *            contained in the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list
     * contains the domain names that are bound to the public key that is
     * contained in the certificate. The subject alternative names include the
     * canonical domain name (CNAME) of the certificate and additional domain
     * names that can be used to connect to the website, such as
     * <code>example.com</code>, <code>www.example.com</code>, or
     * <code>m.example.com</code>.
     * </p>
     *
     * @return <p>
     *         One or more domains or subdomains included in the certificate.
     *         This list contains the domain names that are bound to the public
     *         key that is contained in the certificate. The subject alternative
     *         names include the canonical domain name (CNAME) of the
     *         certificate and additional domain names that can be used to
     *         connect to the website, such as <code>example.com</code>,
     *         <code>www.example.com</code>, or <code>m.example.com</code>.
     *         </p>
     */
    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list
     * contains the domain names that are bound to the public key that is
     * contained in the certificate. The subject alternative names include the
     * canonical domain name (CNAME) of the certificate and additional domain
     * names that can be used to connect to the website, such as
     * <code>example.com</code>, <code>www.example.com</code>, or
     * <code>m.example.com</code>.
     * </p>
     *
     * @param subjectAlternativeNames <p>
     *            One or more domains or subdomains included in the certificate.
     *            This list contains the domain names that are bound to the
     *            public key that is contained in the certificate. The subject
     *            alternative names include the canonical domain name (CNAME) of
     *            the certificate and additional domain names that can be used
     *            to connect to the website, such as <code>example.com</code>,
     *            <code>www.example.com</code>, or <code>m.example.com</code>.
     *            </p>
     */
    public void setSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<String>(subjectAlternativeNames);
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list
     * contains the domain names that are bound to the public key that is
     * contained in the certificate. The subject alternative names include the
     * canonical domain name (CNAME) of the certificate and additional domain
     * names that can be used to connect to the website, such as
     * <code>example.com</code>, <code>www.example.com</code>, or
     * <code>m.example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subjectAlternativeNames <p>
     *            One or more domains or subdomains included in the certificate.
     *            This list contains the domain names that are bound to the
     *            public key that is contained in the certificate. The subject
     *            alternative names include the canonical domain name (CNAME) of
     *            the certificate and additional domain names that can be used
     *            to connect to the website, such as <code>example.com</code>,
     *            <code>www.example.com</code>, or <code>m.example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSubjectAlternativeNames(String... subjectAlternativeNames) {
        if (getSubjectAlternativeNames() == null) {
            this.subjectAlternativeNames = new java.util.ArrayList<String>(
                    subjectAlternativeNames.length);
        }
        for (String value : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list
     * contains the domain names that are bound to the public key that is
     * contained in the certificate. The subject alternative names include the
     * canonical domain name (CNAME) of the certificate and additional domain
     * names that can be used to connect to the website, such as
     * <code>example.com</code>, <code>www.example.com</code>, or
     * <code>m.example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subjectAlternativeNames <p>
     *            One or more domains or subdomains included in the certificate.
     *            This list contains the domain names that are bound to the
     *            public key that is contained in the certificate. The subject
     *            alternative names include the canonical domain name (CNAME) of
     *            the certificate and additional domain names that can be used
     *            to connect to the website, such as <code>example.com</code>,
     *            <code>www.example.com</code>, or <code>m.example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerTlsCertificate withSubjectAlternativeNames(
            java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
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
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getSupportCode() != null)
            sb.append("supportCode: " + getSupportCode() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getLoadBalancerName() != null)
            sb.append("loadBalancerName: " + getLoadBalancerName() + ",");
        if (getIsAttached() != null)
            sb.append("isAttached: " + getIsAttached() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDomainName() != null)
            sb.append("domainName: " + getDomainName() + ",");
        if (getDomainValidationRecords() != null)
            sb.append("domainValidationRecords: " + getDomainValidationRecords() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason() + ",");
        if (getIssuedAt() != null)
            sb.append("issuedAt: " + getIssuedAt() + ",");
        if (getIssuer() != null)
            sb.append("issuer: " + getIssuer() + ",");
        if (getKeyAlgorithm() != null)
            sb.append("keyAlgorithm: " + getKeyAlgorithm() + ",");
        if (getNotAfter() != null)
            sb.append("notAfter: " + getNotAfter() + ",");
        if (getNotBefore() != null)
            sb.append("notBefore: " + getNotBefore() + ",");
        if (getRenewalSummary() != null)
            sb.append("renewalSummary: " + getRenewalSummary() + ",");
        if (getRevocationReason() != null)
            sb.append("revocationReason: " + getRevocationReason() + ",");
        if (getRevokedAt() != null)
            sb.append("revokedAt: " + getRevokedAt() + ",");
        if (getSerial() != null)
            sb.append("serial: " + getSerial() + ",");
        if (getSignatureAlgorithm() != null)
            sb.append("signatureAlgorithm: " + getSignatureAlgorithm() + ",");
        if (getSubject() != null)
            sb.append("subject: " + getSubject() + ",");
        if (getSubjectAlternativeNames() != null)
            sb.append("subjectAlternativeNames: " + getSubjectAlternativeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDomainValidationRecords() == null) ? 0 : getDomainValidationRecords()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode
                + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode
                + ((getRenewalSummary() == null) ? 0 : getRenewalSummary().hashCode());
        hashCode = prime * hashCode
                + ((getRevocationReason() == null) ? 0 : getRevocationReason().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode
                + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificate == false)
            return false;
        LoadBalancerTlsCertificate other = (LoadBalancerTlsCertificate) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null
                && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null
                && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainValidationRecords() == null ^ this.getDomainValidationRecords() == null)
            return false;
        if (other.getDomainValidationRecords() != null
                && other.getDomainValidationRecords().equals(this.getDomainValidationRecords()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null
                && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null
                && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getRenewalSummary() == null ^ this.getRenewalSummary() == null)
            return false;
        if (other.getRenewalSummary() != null
                && other.getRenewalSummary().equals(this.getRenewalSummary()) == false)
            return false;
        if (other.getRevocationReason() == null ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null
                && other.getRevocationReason().equals(this.getRevocationReason()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null
                && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null
                && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null
                && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        return true;
    }
}
