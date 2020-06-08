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
 * A complex type that contains information about a specified namespace.
 * </p>
 */
public class Namespace implements Serializable {
    /**
     * <p>
     * The ID of a namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     * namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the namespace, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     */
    private String type;

    /**
     * <p>
     * The description that you specify for the namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The number of services that are associated with the namespace.
     * </p>
     */
    private Integer serviceCount;

    /**
     * <p>
     * A complex type that contains information that's specific to the type of
     * the namespace.
     * </p>
     */
    private NamespaceProperties properties;

    /**
     * <p>
     * The date that the namespace was created, in Unix date/time format and
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
     * requests to be retried without the risk of executing an operation twice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

    /**
     * <p>
     * The ID of a namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of a namespace.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of a namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID of a namespace.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of a namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param id <p>
     *            The ID of a namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     * namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     *         namespace when you create it.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     * namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) that AWS Cloud Map assigns to
     *            the namespace when you create it.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the
     * namespace when you create it.
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
     *            the namespace when you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the namespace, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the namespace, such as <code>example.com</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the namespace, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the namespace, such as <code>example.com</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the namespace, such as <code>example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the namespace, such as <code>example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     *
     * @return <p>
     *         The type of the namespace. The methods for discovering instances
     *         depends on the value that you specify:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HTTP</code>: Instances can be discovered only
     *         programmatically, using the AWS Cloud Map
     *         <code>DiscoverInstances</code> API.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DNS_PUBLIC</code>: Instances can be discovered using public
     *         DNS queries and using the <code>DiscoverInstances</code> API.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DNS_PRIVATE</code>: Instances can be discovered using DNS
     *         queries in VPCs and using the <code>DiscoverInstances</code> API.
     *         </p>
     *         </li>
     *         </ul>
     * @see NamespaceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     *
     * @param type <p>
     *            The type of the namespace. The methods for discovering
     *            instances depends on the value that you specify:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HTTP</code>: Instances can be discovered only
     *            programmatically, using the AWS Cloud Map
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PUBLIC</code>: Instances can be discovered using
     *            public DNS queries and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PRIVATE</code>: Instances can be discovered using
     *            DNS queries in VPCs and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            </ul>
     * @see NamespaceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     *
     * @param type <p>
     *            The type of the namespace. The methods for discovering
     *            instances depends on the value that you specify:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HTTP</code>: Instances can be discovered only
     *            programmatically, using the AWS Cloud Map
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PUBLIC</code>: Instances can be discovered using
     *            public DNS queries and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PRIVATE</code>: Instances can be discovered using
     *            DNS queries in VPCs and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NamespaceType
     */
    public Namespace withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     *
     * @param type <p>
     *            The type of the namespace. The methods for discovering
     *            instances depends on the value that you specify:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HTTP</code>: Instances can be discovered only
     *            programmatically, using the AWS Cloud Map
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PUBLIC</code>: Instances can be discovered using
     *            public DNS queries and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PRIVATE</code>: Instances can be discovered using
     *            DNS queries in VPCs and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            </ul>
     * @see NamespaceType
     */
    public void setType(NamespaceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the namespace. The methods for discovering instances depends
     * on the value that you specify:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HTTP</code>: Instances can be discovered only programmatically,
     * using the AWS Cloud Map <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PUBLIC</code>: Instances can be discovered using public DNS
     * queries and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_PRIVATE</code>: Instances can be discovered using DNS queries
     * in VPCs and using the <code>DiscoverInstances</code> API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DNS_PUBLIC, DNS_PRIVATE, HTTP
     *
     * @param type <p>
     *            The type of the namespace. The methods for discovering
     *            instances depends on the value that you specify:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>HTTP</code>: Instances can be discovered only
     *            programmatically, using the AWS Cloud Map
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PUBLIC</code>: Instances can be discovered using
     *            public DNS queries and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DNS_PRIVATE</code>: Instances can be discovered using
     *            DNS queries in VPCs and using the
     *            <code>DiscoverInstances</code> API.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NamespaceType
     */
    public Namespace withType(NamespaceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description that you specify for the namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The description that you specify for the namespace when you
     *         create it.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description that you specify for the namespace when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description that you specify for the namespace when you
     *            create it.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that you specify for the namespace when you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The description that you specify for the namespace when you
     *            create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The number of services that are associated with the namespace.
     * </p>
     *
     * @return <p>
     *         The number of services that are associated with the namespace.
     *         </p>
     */
    public Integer getServiceCount() {
        return serviceCount;
    }

    /**
     * <p>
     * The number of services that are associated with the namespace.
     * </p>
     *
     * @param serviceCount <p>
     *            The number of services that are associated with the namespace.
     *            </p>
     */
    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    /**
     * <p>
     * The number of services that are associated with the namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceCount <p>
     *            The number of services that are associated with the namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information that's specific to the type of
     * the namespace.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information that's specific to the
     *         type of the namespace.
     *         </p>
     */
    public NamespaceProperties getProperties() {
        return properties;
    }

    /**
     * <p>
     * A complex type that contains information that's specific to the type of
     * the namespace.
     * </p>
     *
     * @param properties <p>
     *            A complex type that contains information that's specific to
     *            the type of the namespace.
     *            </p>
     */
    public void setProperties(NamespaceProperties properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A complex type that contains information that's specific to the type of
     * the namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param properties <p>
     *            A complex type that contains information that's specific to
     *            the type of the namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withProperties(NamespaceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * <p>
     * The date that the namespace was created, in Unix date/time format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date that the namespace was created, in Unix date/time format
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
     * The date that the namespace was created, in Unix date/time format and
     * Coordinated Universal Time (UTC). The value of <code>CreateDate</code> is
     * accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @param createDate <p>
     *            The date that the namespace was created, in Unix date/time
     *            format and Coordinated Universal Time (UTC). The value of
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
     * The date that the namespace was created, in Unix date/time format and
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
     *            The date that the namespace was created, in Unix date/time
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>CreateDate</code> is accurate to milliseconds. For
     *            example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing an operation twice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed requests to be retried without the risk of executing an
     *         operation twice.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing an operation twice.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed requests to be retried without the risk of executing an
     *            operation twice.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * requests to be retried without the risk of executing an operation twice.
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
     *            failed requests to be retried without the risk of executing an
     *            operation twice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Namespace withCreatorRequestId(String creatorRequestId) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getServiceCount() != null)
            sb.append("ServiceCount: " + getServiceCount() + ",");
        if (getProperties() != null)
            sb.append("Properties: " + getProperties() + ",");
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getServiceCount() == null) ? 0 : getServiceCount().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
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

        if (obj instanceof Namespace == false)
            return false;
        Namespace other = (Namespace) obj;

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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getServiceCount() == null ^ this.getServiceCount() == null)
            return false;
        if (other.getServiceCount() != null
                && other.getServiceCount().equals(this.getServiceCount()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null
                && other.getProperties().equals(this.getProperties()) == false)
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
