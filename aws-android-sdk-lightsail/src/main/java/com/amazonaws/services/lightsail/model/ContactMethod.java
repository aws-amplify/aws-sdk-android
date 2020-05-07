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
 * Describes a contact method.
 * </p>
 * <p>
 * A contact method is a way to send you notifications. For more information,
 * see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
 * >Notifications in Amazon Lightsail</a>.
 * </p>
 */
public class ContactMethod implements Serializable {
    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String contactEndpoint;

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     */
    private String status;

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     */
    private String protocol;

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Describes the resource location.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
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
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail contact method. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The destination of the contact method, such as an email address
     *         or a mobile phone number.
     *         </p>
     */
    public String getContactEndpoint() {
        return contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param contactEndpoint <p>
     *            The destination of the contact method, such as an email
     *            address or a mobile phone number.
     *            </p>
     */
    public void setContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param contactEndpoint <p>
     *            The destination of the contact method, such as an email
     *            address or a mobile phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
        return this;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     *
     * @return <p>
     *         The current status of the contact method.
     *         </p>
     *         <p>
     *         A contact method has the following possible status:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PendingVerification</code> - The contact method has not yet
     *         been verified, and the verification has not yet expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Valid</code> - The contact method has been verified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InValid</code> - An attempt was made to verify the contact
     *         method, but the verification has expired.
     *         </p>
     *         </li>
     *         </ul>
     * @see ContactMethodStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     *
     * @param status <p>
     *            The current status of the contact method.
     *            </p>
     *            <p>
     *            A contact method has the following possible status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PendingVerification</code> - The contact method has not
     *            yet been verified, and the verification has not yet expired.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Valid</code> - The contact method has been verified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InValid</code> - An attempt was made to verify the
     *            contact method, but the verification has expired.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContactMethodStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     *
     * @param status <p>
     *            The current status of the contact method.
     *            </p>
     *            <p>
     *            A contact method has the following possible status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PendingVerification</code> - The contact method has not
     *            yet been verified, and the verification has not yet expired.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Valid</code> - The contact method has been verified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InValid</code> - An attempt was made to verify the
     *            contact method, but the verification has expired.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactMethodStatus
     */
    public ContactMethod withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     *
     * @param status <p>
     *            The current status of the contact method.
     *            </p>
     *            <p>
     *            A contact method has the following possible status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PendingVerification</code> - The contact method has not
     *            yet been verified, and the verification has not yet expired.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Valid</code> - The contact method has been verified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InValid</code> - An attempt was made to verify the
     *            contact method, but the verification has expired.
     *            </p>
     *            </li>
     *            </ul>
     * @see ContactMethodStatus
     */
    public void setStatus(ContactMethodStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the contact method.
     * </p>
     * <p>
     * A contact method has the following possible status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingVerification</code> - The contact method has not yet been
     * verified, and the verification has not yet expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Valid</code> - The contact method has been verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InValid</code> - An attempt was made to verify the contact method,
     * but the verification has expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PendingVerification, Valid, Invalid
     *
     * @param status <p>
     *            The current status of the contact method.
     *            </p>
     *            <p>
     *            A contact method has the following possible status:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PendingVerification</code> - The contact method has not
     *            yet been verified, and the verification has not yet expired.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Valid</code> - The contact method has been verified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>InValid</code> - An attempt was made to verify the
     *            contact method, but the verification has expired.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactMethodStatus
     */
    public ContactMethod withStatus(ContactMethodStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @return <p>
     *         The protocol of the contact method, such as email or SMS (text
     *         messaging).
     *         </p>
     * @see ContactProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as email or SMS (text
     *            messaging).
     *            </p>
     * @see ContactProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as email or SMS (text
     *            messaging).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactProtocol
     */
    public ContactMethod withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as email or SMS (text
     *            messaging).
     *            </p>
     * @see ContactProtocol
     */
    public void setProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol of the contact method, such as email or SMS (text
     * messaging).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as email or SMS (text
     *            messaging).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactProtocol
     */
    public ContactMethod withProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the contact method.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the contact method.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the contact method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the contact method.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact method.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the contact method was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the contact method was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the contact method was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the contact method was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Describes the resource location.
     * </p>
     *
     * @return <p>
     *         Describes the resource location.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * Describes the resource location.
     * </p>
     *
     * @param location <p>
     *            Describes the resource location.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * Describes the resource location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Describes the resource location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type (e.g., <code>ContactMethod</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>ContactMethod</code>
     *            ).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
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
     *            The Lightsail resource type (e.g., <code>ContactMethod</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ContactMethod withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g., <code>ContactMethod</code>
     *            ).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ContactMethod</code>).
     * </p>
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
     *            The Lightsail resource type (e.g., <code>ContactMethod</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ContactMethod withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail contact method. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     *
     * @return <p>
     *         The support code. Include this code in your email to support when
     *         you have questions about your Lightsail contact method. This code
     *         enables our support team to look up your Lightsail information
     *         more easily.
     *         </p>
     */
    public String getSupportCode() {
        return supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail contact method. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail contact method.
     *            This code enables our support team to look up your Lightsail
     *            information more easily.
     *            </p>
     */
    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you
     * have questions about your Lightsail contact method. This code enables our
     * support team to look up your Lightsail information more easily.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportCode <p>
     *            The support code. Include this code in your email to support
     *            when you have questions about your Lightsail contact method.
     *            This code enables our support team to look up your Lightsail
     *            information more easily.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactMethod withSupportCode(String supportCode) {
        this.supportCode = supportCode;
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
        if (getContactEndpoint() != null)
            sb.append("contactEndpoint: " + getContactEndpoint() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getSupportCode() != null)
            sb.append("supportCode: " + getSupportCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactEndpoint() == null) ? 0 : getContactEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactMethod == false)
            return false;
        ContactMethod other = (ContactMethod) obj;

        if (other.getContactEndpoint() == null ^ this.getContactEndpoint() == null)
            return false;
        if (other.getContactEndpoint() != null
                && other.getContactEndpoint().equals(this.getContactEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null
                && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        return true;
    }
}
