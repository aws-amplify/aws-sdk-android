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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the properties of a file transfer protocol-enabled server that was
 * specified. Information returned includes the following: the server Amazon
 * Resource Name (ARN), the authentication configuration and type, the logging
 * role, the server ID and state, and assigned tags or metadata.
 * </p>
 */
public class DescribedServer implements Serializable {
    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. Required when <code>Protocols</code> is set to
     * <code>FTPS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     */
    private String certificate;

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that you configured for
     * your file transfer protocol-enabled server.
     * </p>
     */
    private EndpointDetails endpointDetails;

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     */
    private String endpointType;

    /**
     * <p>
     * Contains the message-digest algorithm (MD5) hash of a file transfer
     * protocol-enabled server's host key. This value is equivalent to the
     * output of the <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     * command.
     * </p>
     */
    private String hostKeyFingerprint;

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API.
     * This field is not populated when the <code>IdentityProviderType</code> of
     * a file transfer protocol-enabled server is <code>SERVICE_MANAGED</code>.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     */
    private String identityProviderType;

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) entity that allows a file
     * transfer protocol-enabled server to turn on Amazon CloudWatch logging for
     * Amazon S3 events. When set, user activity can be viewed in your
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String loggingRole;

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. The
     * available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * Unique system-assigned identifier for a file transfer protocol-enabled
     * server that you instantiate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     */
    private String state;

    /**
     * <p>
     * Contains the key-value pairs that you can use to search for and group
     * file transfer protocol-enabled servers that were assigned to the server
     * that was described.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The number of users that are assigned to a file transfer protocol-enabled
     * server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         Specifies the unique Amazon Resource Name (ARN) for a file
     *         transfer protocol-enabled server to be described.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Specifies the unique Amazon Resource Name (ARN) for a file
     *            transfer protocol-enabled server to be described.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Specifies the unique Amazon Resource Name (ARN) for a file
     *            transfer protocol-enabled server to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. Required when <code>Protocols</code> is set to
     * <code>FTPS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Certificate Manager
     *         (ACM) certificate. Required when <code>Protocols</code> is set to
     *         <code>FTPS</code>.
     *         </p>
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. Required when <code>Protocols</code> is set to
     * <code>FTPS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     *
     * @param certificate <p>
     *            The Amazon Resource Name (ARN) of the AWS Certificate Manager
     *            (ACM) certificate. Required when <code>Protocols</code> is set
     *            to <code>FTPS</code>.
     *            </p>
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM)
     * certificate. Required when <code>Protocols</code> is set to
     * <code>FTPS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1600<br/>
     *
     * @param certificate <p>
     *            The Amazon Resource Name (ARN) of the AWS Certificate Manager
     *            (ACM) certificate. Required when <code>Protocols</code> is set
     *            to <code>FTPS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that you configured for
     * your file transfer protocol-enabled server.
     * </p>
     *
     * @return <p>
     *         The virtual private cloud (VPC) endpoint settings that you
     *         configured for your file transfer protocol-enabled server.
     *         </p>
     */
    public EndpointDetails getEndpointDetails() {
        return endpointDetails;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that you configured for
     * your file transfer protocol-enabled server.
     * </p>
     *
     * @param endpointDetails <p>
     *            The virtual private cloud (VPC) endpoint settings that you
     *            configured for your file transfer protocol-enabled server.
     *            </p>
     */
    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) endpoint settings that you configured for
     * your file transfer protocol-enabled server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointDetails <p>
     *            The virtual private cloud (VPC) endpoint settings that you
     *            configured for your file transfer protocol-enabled server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
        return this;
    }

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @return <p>
     *         The type of endpoint that your file transfer protocol-enabled
     *         server is connected to. If your server is connected to a VPC
     *         endpoint, your server isn't accessible over the public internet.
     *         </p>
     * @see EndpointType
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            The type of endpoint that your file transfer protocol-enabled
     *            server is connected to. If your server is connected to a VPC
     *            endpoint, your server isn't accessible over the public
     *            internet.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            The type of endpoint that your file transfer protocol-enabled
     *            server is connected to. If your server is connected to a VPC
     *            endpoint, your server isn't accessible over the public
     *            internet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public DescribedServer withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            The type of endpoint that your file transfer protocol-enabled
     *            server is connected to. If your server is connected to a VPC
     *            endpoint, your server isn't accessible over the public
     *            internet.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint that your file transfer protocol-enabled server is
     * connected to. If your server is connected to a VPC endpoint, your server
     * isn't accessible over the public internet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            The type of endpoint that your file transfer protocol-enabled
     *            server is connected to. If your server is connected to a VPC
     *            endpoint, your server isn't accessible over the public
     *            internet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public DescribedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Contains the message-digest algorithm (MD5) hash of a file transfer
     * protocol-enabled server's host key. This value is equivalent to the
     * output of the <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     * command.
     * </p>
     *
     * @return <p>
     *         Contains the message-digest algorithm (MD5) hash of a file
     *         transfer protocol-enabled server's host key. This value is
     *         equivalent to the output of the
     *         <code>ssh-keygen -l -E md5 -f my-new-server-key</code> command.
     *         </p>
     */
    public String getHostKeyFingerprint() {
        return hostKeyFingerprint;
    }

    /**
     * <p>
     * Contains the message-digest algorithm (MD5) hash of a file transfer
     * protocol-enabled server's host key. This value is equivalent to the
     * output of the <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     * command.
     * </p>
     *
     * @param hostKeyFingerprint <p>
     *            Contains the message-digest algorithm (MD5) hash of a file
     *            transfer protocol-enabled server's host key. This value is
     *            equivalent to the output of the
     *            <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     *            command.
     *            </p>
     */
    public void setHostKeyFingerprint(String hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
    }

    /**
     * <p>
     * Contains the message-digest algorithm (MD5) hash of a file transfer
     * protocol-enabled server's host key. This value is equivalent to the
     * output of the <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     * command.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostKeyFingerprint <p>
     *            Contains the message-digest algorithm (MD5) hash of a file
     *            transfer protocol-enabled server's host key. This value is
     *            equivalent to the output of the
     *            <code>ssh-keygen -l -E md5 -f my-new-server-key</code>
     *            command.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withHostKeyFingerprint(String hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
        return this;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API.
     * This field is not populated when the <code>IdentityProviderType</code> of
     * a file transfer protocol-enabled server is <code>SERVICE_MANAGED</code>.
     * </p>
     *
     * @return <p>
     *         Specifies information to call a customer-supplied authentication
     *         API. This field is not populated when the
     *         <code>IdentityProviderType</code> of a file transfer
     *         protocol-enabled server is <code>SERVICE_MANAGED</code>.
     *         </p>
     */
    public IdentityProviderDetails getIdentityProviderDetails() {
        return identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API.
     * This field is not populated when the <code>IdentityProviderType</code> of
     * a file transfer protocol-enabled server is <code>SERVICE_MANAGED</code>.
     * </p>
     *
     * @param identityProviderDetails <p>
     *            Specifies information to call a customer-supplied
     *            authentication API. This field is not populated when the
     *            <code>IdentityProviderType</code> of a file transfer
     *            protocol-enabled server is <code>SERVICE_MANAGED</code>.
     *            </p>
     */
    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API.
     * This field is not populated when the <code>IdentityProviderType</code> of
     * a file transfer protocol-enabled server is <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityProviderDetails <p>
     *            Specifies information to call a customer-supplied
     *            authentication API. This field is not populated when the
     *            <code>IdentityProviderType</code> of a file transfer
     *            protocol-enabled server is <code>SERVICE_MANAGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withIdentityProviderDetails(
            IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
        return this;
    }

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @return <p>
     *         Defines the mode of authentication method enabled for this
     *         service. A value of <code>SERVICE_MANAGED</code> means that you
     *         are using this file transfer protocol-enabled server to store and
     *         access user credentials within the service. A value of
     *         <code>API_GATEWAY</code> indicates that you have integrated an
     *         API Gateway endpoint that will be invoked for authenticating your
     *         user into the service.
     *         </p>
     * @see IdentityProviderType
     */
    public String getIdentityProviderType() {
        return identityProviderType;
    }

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Defines the mode of authentication method enabled for this
     *            service. A value of <code>SERVICE_MANAGED</code> means that
     *            you are using this file transfer protocol-enabled server to
     *            store and access user credentials within the service. A value
     *            of <code>API_GATEWAY</code> indicates that you have integrated
     *            an API Gateway endpoint that will be invoked for
     *            authenticating your user into the service.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Defines the mode of authentication method enabled for this
     *            service. A value of <code>SERVICE_MANAGED</code> means that
     *            you are using this file transfer protocol-enabled server to
     *            store and access user credentials within the service. A value
     *            of <code>API_GATEWAY</code> indicates that you have integrated
     *            an API Gateway endpoint that will be invoked for
     *            authenticating your user into the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public DescribedServer withIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Defines the mode of authentication method enabled for this
     *            service. A value of <code>SERVICE_MANAGED</code> means that
     *            you are using this file transfer protocol-enabled server to
     *            store and access user credentials within the service. A value
     *            of <code>API_GATEWAY</code> indicates that you have integrated
     *            an API Gateway endpoint that will be invoked for
     *            authenticating your user into the service.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
    }

    /**
     * <p>
     * Defines the mode of authentication method enabled for this service. A
     * value of <code>SERVICE_MANAGED</code> means that you are using this file
     * transfer protocol-enabled server to store and access user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that
     * you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Defines the mode of authentication method enabled for this
     *            service. A value of <code>SERVICE_MANAGED</code> means that
     *            you are using this file transfer protocol-enabled server to
     *            store and access user credentials within the service. A value
     *            of <code>API_GATEWAY</code> indicates that you have integrated
     *            an API Gateway endpoint that will be invoked for
     *            authenticating your user into the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public DescribedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) entity that allows a file
     * transfer protocol-enabled server to turn on Amazon CloudWatch logging for
     * Amazon S3 events. When set, user activity can be viewed in your
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         An AWS Identity and Access Management (IAM) entity that allows a
     *         file transfer protocol-enabled server to turn on Amazon
     *         CloudWatch logging for Amazon S3 events. When set, user activity
     *         can be viewed in your CloudWatch logs.
     *         </p>
     */
    public String getLoggingRole() {
        return loggingRole;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) entity that allows a file
     * transfer protocol-enabled server to turn on Amazon CloudWatch logging for
     * Amazon S3 events. When set, user activity can be viewed in your
     * CloudWatch logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param loggingRole <p>
     *            An AWS Identity and Access Management (IAM) entity that allows
     *            a file transfer protocol-enabled server to turn on Amazon
     *            CloudWatch logging for Amazon S3 events. When set, user
     *            activity can be viewed in your CloudWatch logs.
     *            </p>
     */
    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) entity that allows a file
     * transfer protocol-enabled server to turn on Amazon CloudWatch logging for
     * Amazon S3 events. When set, user activity can be viewed in your
     * CloudWatch logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param loggingRole <p>
     *            An AWS Identity and Access Management (IAM) entity that allows
     *            a file transfer protocol-enabled server to turn on Amazon
     *            CloudWatch logging for Amazon S3 events. When set, user
     *            activity can be viewed in your CloudWatch logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. The
     * available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specifies the file transfer protocol or protocols over which your
     *         file transfer protocol client can connect to your server's
     *         endpoint. The available protocols are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer
     *         over SSH
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol Secure (FTPS): File transfer with TLS
     *         encryption
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol (FTP): Unencrypted file transfer
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. The
     * available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     *
     * @param protocols <p>
     *            Specifies the file transfer protocol or protocols over which
     *            your file transfer protocol client can connect to your
     *            server's endpoint. The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP): File
     *            transfer over SSH
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS): File transfer with TLS
     *            encryption
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP): Unencrypted file transfer
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. The
     * available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            Specifies the file transfer protocol or protocols over which
     *            your file transfer protocol client can connect to your
     *            server's endpoint. The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP): File
     *            transfer over SSH
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS): File transfer with TLS
     *            encryption
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP): Unencrypted file transfer
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withProtocols(String... protocols) {
        if (getProtocols() == null) {
            this.protocols = new java.util.ArrayList<String>(protocols.length);
        }
        for (String value : protocols) {
            this.protocols.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file
     * transfer protocol client can connect to your server's endpoint. The
     * available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            Specifies the file transfer protocol or protocols over which
     *            your file transfer protocol client can connect to your
     *            server's endpoint. The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP): File
     *            transfer over SSH
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS): File transfer with TLS
     *            encryption
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP): Unencrypted file transfer
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * Unique system-assigned identifier for a file transfer protocol-enabled
     * server that you instantiate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         Unique system-assigned identifier for a file transfer
     *         protocol-enabled server that you instantiate.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * Unique system-assigned identifier for a file transfer protocol-enabled
     * server that you instantiate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            Unique system-assigned identifier for a file transfer
     *            protocol-enabled server that you instantiate.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Unique system-assigned identifier for a file transfer protocol-enabled
     * server that you instantiate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            Unique system-assigned identifier for a file transfer
     *            protocol-enabled server that you instantiate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     *
     * @return <p>
     *         The condition of a file transfer protocol-enabled server for the
     *         server that was described. A value of <code>ONLINE</code>
     *         indicates that the server can accept jobs and transfer files. A
     *         <code>State</code> value of <code>OFFLINE</code> means that the
     *         server cannot perform file transfer operations.
     *         </p>
     *         <p>
     *         The states of <code>STARTING</code> and <code>STOPPING</code>
     *         indicate that the server is in an intermediate state, either not
     *         fully able to respond, or not fully offline. The values of
     *         <code>START_FAILED</code> or <code>STOP_FAILED</code> can
     *         indicate an error condition.
     *         </p>
     * @see State
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     *
     * @param state <p>
     *            The condition of a file transfer protocol-enabled server for
     *            the server that was described. A value of <code>ONLINE</code>
     *            indicates that the server can accept jobs and transfer files.
     *            A <code>State</code> value of <code>OFFLINE</code> means that
     *            the server cannot perform file transfer operations.
     *            </p>
     *            <p>
     *            The states of <code>STARTING</code> and <code>STOPPING</code>
     *            indicate that the server is in an intermediate state, either
     *            not fully able to respond, or not fully offline. The values of
     *            <code>START_FAILED</code> or <code>STOP_FAILED</code> can
     *            indicate an error condition.
     *            </p>
     * @see State
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     *
     * @param state <p>
     *            The condition of a file transfer protocol-enabled server for
     *            the server that was described. A value of <code>ONLINE</code>
     *            indicates that the server can accept jobs and transfer files.
     *            A <code>State</code> value of <code>OFFLINE</code> means that
     *            the server cannot perform file transfer operations.
     *            </p>
     *            <p>
     *            The states of <code>STARTING</code> and <code>STOPPING</code>
     *            indicate that the server is in an intermediate state, either
     *            not fully able to respond, or not fully offline. The values of
     *            <code>START_FAILED</code> or <code>STOP_FAILED</code> can
     *            indicate an error condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public DescribedServer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     *
     * @param state <p>
     *            The condition of a file transfer protocol-enabled server for
     *            the server that was described. A value of <code>ONLINE</code>
     *            indicates that the server can accept jobs and transfer files.
     *            A <code>State</code> value of <code>OFFLINE</code> means that
     *            the server cannot perform file transfer operations.
     *            </p>
     *            <p>
     *            The states of <code>STARTING</code> and <code>STOPPING</code>
     *            indicate that the server is in an intermediate state, either
     *            not fully able to respond, or not fully offline. The values of
     *            <code>START_FAILED</code> or <code>STOP_FAILED</code> can
     *            indicate an error condition.
     *            </p>
     * @see State
     */
    public void setState(State state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The condition of a file transfer protocol-enabled server for the server
     * that was described. A value of <code>ONLINE</code> indicates that the
     * server can accept jobs and transfer files. A <code>State</code> value of
     * <code>OFFLINE</code> means that the server cannot perform file transfer
     * operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate
     * that the server is in an intermediate state, either not fully able to
     * respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFFLINE, ONLINE, STARTING, STOPPING, START_FAILED,
     * STOP_FAILED
     *
     * @param state <p>
     *            The condition of a file transfer protocol-enabled server for
     *            the server that was described. A value of <code>ONLINE</code>
     *            indicates that the server can accept jobs and transfer files.
     *            A <code>State</code> value of <code>OFFLINE</code> means that
     *            the server cannot perform file transfer operations.
     *            </p>
     *            <p>
     *            The states of <code>STARTING</code> and <code>STOPPING</code>
     *            indicate that the server is in an intermediate state, either
     *            not fully able to respond, or not fully offline. The values of
     *            <code>START_FAILED</code> or <code>STOP_FAILED</code> can
     *            indicate an error condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see State
     */
    public DescribedServer withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Contains the key-value pairs that you can use to search for and group
     * file transfer protocol-enabled servers that were assigned to the server
     * that was described.
     * </p>
     *
     * @return <p>
     *         Contains the key-value pairs that you can use to search for and
     *         group file transfer protocol-enabled servers that were assigned
     *         to the server that was described.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains the key-value pairs that you can use to search for and group
     * file transfer protocol-enabled servers that were assigned to the server
     * that was described.
     * </p>
     *
     * @param tags <p>
     *            Contains the key-value pairs that you can use to search for
     *            and group file transfer protocol-enabled servers that were
     *            assigned to the server that was described.
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
     * Contains the key-value pairs that you can use to search for and group
     * file transfer protocol-enabled servers that were assigned to the server
     * that was described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains the key-value pairs that you can use to search for
     *            and group file transfer protocol-enabled servers that were
     *            assigned to the server that was described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withTags(Tag... tags) {
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
     * Contains the key-value pairs that you can use to search for and group
     * file transfer protocol-enabled servers that were assigned to the server
     * that was described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains the key-value pairs that you can use to search for
     *            and group file transfer protocol-enabled servers that were
     *            assigned to the server that was described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The number of users that are assigned to a file transfer protocol-enabled
     * server you specified with the <code>ServerId</code>.
     * </p>
     *
     * @return <p>
     *         The number of users that are assigned to a file transfer
     *         protocol-enabled server you specified with the
     *         <code>ServerId</code>.
     *         </p>
     */
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * <p>
     * The number of users that are assigned to a file transfer protocol-enabled
     * server you specified with the <code>ServerId</code>.
     * </p>
     *
     * @param userCount <p>
     *            The number of users that are assigned to a file transfer
     *            protocol-enabled server you specified with the
     *            <code>ServerId</code>.
     *            </p>
     */
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * The number of users that are assigned to a file transfer protocol-enabled
     * server you specified with the <code>ServerId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userCount <p>
     *            The number of users that are assigned to a file transfer
     *            protocol-enabled server you specified with the
     *            <code>ServerId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedServer withUserCount(Integer userCount) {
        this.userCount = userCount;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: " + getEndpointDetails() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getHostKeyFingerprint() != null)
            sb.append("HostKeyFingerprint: " + getHostKeyFingerprint() + ",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: " + getIdentityProviderDetails() + ",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: " + getIdentityProviderType() + ",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: " + getLoggingRole() + ",");
        if (getProtocols() != null)
            sb.append("Protocols: " + getProtocols() + ",");
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUserCount() != null)
            sb.append("UserCount: " + getUserCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getHostKeyFingerprint() == null) ? 0 : getHostKeyFingerprint().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedServer == false)
            return false;
        DescribedServer other = (DescribedServer) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null
                && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getHostKeyFingerprint() == null ^ this.getHostKeyFingerprint() == null)
            return false;
        if (other.getHostKeyFingerprint() != null
                && other.getHostKeyFingerprint().equals(this.getHostKeyFingerprint()) == false)
            return false;
        if (other.getIdentityProviderDetails() == null ^ this.getIdentityProviderDetails() == null)
            return false;
        if (other.getIdentityProviderDetails() != null
                && other.getIdentityProviderDetails().equals(this.getIdentityProviderDetails()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null
                && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null
                && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null
                && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserCount() == null ^ this.getUserCount() == null)
            return false;
        if (other.getUserCount() != null
                && other.getUserCount().equals(this.getUserCount()) == false)
            return false;
        return true;
    }
}
