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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

/**
 * <p>
 * Returns properties of a file transfer protocol-enabled server that was
 * specified.
 * </p>
 */
public class ListedServer implements Serializable {
    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     */
    private String identityProviderType;

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     */
    private String endpointType;

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a
     * file transfer protocol-enabled server to turn on Amazon CloudWatch
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String loggingRole;

    /**
     * <p>
     * Specifies the unique system assigned identifier for a file transfer
     * protocol-enabled servers that were listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     * Specifies the number of users that are assigned to a file transfer
     * protocol-enabled server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         Specifies the unique Amazon Resource Name (ARN) for a file
     *         transfer protocol-enabled server to be listed.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Specifies the unique Amazon Resource Name (ARN) for a file
     *            transfer protocol-enabled server to be listed.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a file transfer
     * protocol-enabled server to be listed.
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
     *            transfer protocol-enabled server to be listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedServer withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @return <p>
     *         Specifies the authentication method used to validate a user for a
     *         file transfer protocol-enabled server that was specified. This
     *         can include Secure Shell (SSH), user name and password
     *         combinations, or your own custom authentication method. Valid
     *         values include <code>SERVICE_MANAGED</code> or
     *         <code>API_GATEWAY</code>.
     *         </p>
     * @see IdentityProviderType
     */
    public String getIdentityProviderType() {
        return identityProviderType;
    }

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Specifies the authentication method used to validate a user
     *            for a file transfer protocol-enabled server that was
     *            specified. This can include Secure Shell (SSH), user name and
     *            password combinations, or your own custom authentication
     *            method. Valid values include <code>SERVICE_MANAGED</code> or
     *            <code>API_GATEWAY</code>.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Specifies the authentication method used to validate a user
     *            for a file transfer protocol-enabled server that was
     *            specified. This can include Secure Shell (SSH), user name and
     *            password combinations, or your own custom authentication
     *            method. Valid values include <code>SERVICE_MANAGED</code> or
     *            <code>API_GATEWAY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public ListedServer withIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Specifies the authentication method used to validate a user
     *            for a file transfer protocol-enabled server that was
     *            specified. This can include Secure Shell (SSH), user name and
     *            password combinations, or your own custom authentication
     *            method. Valid values include <code>SERVICE_MANAGED</code> or
     *            <code>API_GATEWAY</code>.
     *            </p>
     * @see IdentityProviderType
     */
    public void setIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
    }

    /**
     * <p>
     * Specifies the authentication method used to validate a user for a file
     * transfer protocol-enabled server that was specified. This can include
     * Secure Shell (SSH), user name and password combinations, or your own
     * custom authentication method. Valid values include
     * <code>SERVICE_MANAGED</code> or <code>API_GATEWAY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, API_GATEWAY
     *
     * @param identityProviderType <p>
     *            Specifies the authentication method used to validate a user
     *            for a file transfer protocol-enabled server that was
     *            specified. This can include Secure Shell (SSH), user name and
     *            password combinations, or your own custom authentication
     *            method. Valid values include <code>SERVICE_MANAGED</code> or
     *            <code>API_GATEWAY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderType
     */
    public ListedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @return <p>
     *         Specifies the type of VPC endpoint that your file transfer
     *         protocol-enabled server is connected to. If your server is
     *         connected to a VPC endpoint, your server isn't accessible over
     *         the public internet.
     *         </p>
     * @see EndpointType
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            Specifies the type of VPC endpoint that your file transfer
     *            protocol-enabled server is connected to. If your server is
     *            connected to a VPC endpoint, your server isn't accessible over
     *            the public internet.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            Specifies the type of VPC endpoint that your file transfer
     *            protocol-enabled server is connected to. If your server is
     *            connected to a VPC endpoint, your server isn't accessible over
     *            the public internet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public ListedServer withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            Specifies the type of VPC endpoint that your file transfer
     *            protocol-enabled server is connected to. If your server is
     *            connected to a VPC endpoint, your server isn't accessible over
     *            the public internet.
     *            </p>
     * @see EndpointType
     */
    public void setEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your file transfer
     * protocol-enabled server is connected to. If your server is connected to a
     * VPC endpoint, your server isn't accessible over the public internet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, VPC, VPC_ENDPOINT
     *
     * @param endpointType <p>
     *            Specifies the type of VPC endpoint that your file transfer
     *            protocol-enabled server is connected to. If your server is
     *            connected to a VPC endpoint, your server isn't accessible over
     *            the public internet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointType
     */
    public ListedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a
     * file transfer protocol-enabled server to turn on Amazon CloudWatch
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         Specifies the AWS Identity and Access Management (IAM) role that
     *         allows a file transfer protocol-enabled server to turn on Amazon
     *         CloudWatch logging.
     *         </p>
     */
    public String getLoggingRole() {
        return loggingRole;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a
     * file transfer protocol-enabled server to turn on Amazon CloudWatch
     * logging.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param loggingRole <p>
     *            Specifies the AWS Identity and Access Management (IAM) role
     *            that allows a file transfer protocol-enabled server to turn on
     *            Amazon CloudWatch logging.
     *            </p>
     */
    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a
     * file transfer protocol-enabled server to turn on Amazon CloudWatch
     * logging.
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
     *            Specifies the AWS Identity and Access Management (IAM) role
     *            that allows a file transfer protocol-enabled server to turn on
     *            Amazon CloudWatch logging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedServer withLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
        return this;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for a file transfer
     * protocol-enabled servers that were listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         Specifies the unique system assigned identifier for a file
     *         transfer protocol-enabled servers that were listed.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for a file transfer
     * protocol-enabled servers that were listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            Specifies the unique system assigned identifier for a file
     *            transfer protocol-enabled servers that were listed.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for a file transfer
     * protocol-enabled servers that were listed.
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
     *            Specifies the unique system assigned identifier for a file
     *            transfer protocol-enabled servers that were listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedServer withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     *         Specifies the condition of a file transfer protocol-enabled
     *         server for the server that was described. A value of
     *         <code>ONLINE</code> indicates that the server can accept jobs and
     *         transfer files. A <code>State</code> value of
     *         <code>OFFLINE</code> means that the server cannot perform file
     *         transfer operations.
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
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     *            Specifies the condition of a file transfer protocol-enabled
     *            server for the server that was described. A value of
     *            <code>ONLINE</code> indicates that the server can accept jobs
     *            and transfer files. A <code>State</code> value of
     *            <code>OFFLINE</code> means that the server cannot perform file
     *            transfer operations.
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
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     *            Specifies the condition of a file transfer protocol-enabled
     *            server for the server that was described. A value of
     *            <code>ONLINE</code> indicates that the server can accept jobs
     *            and transfer files. A <code>State</code> value of
     *            <code>OFFLINE</code> means that the server cannot perform file
     *            transfer operations.
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
    public ListedServer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     *            Specifies the condition of a file transfer protocol-enabled
     *            server for the server that was described. A value of
     *            <code>ONLINE</code> indicates that the server can accept jobs
     *            and transfer files. A <code>State</code> value of
     *            <code>OFFLINE</code> means that the server cannot perform file
     *            transfer operations.
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
     * Specifies the condition of a file transfer protocol-enabled server for
     * the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code>
     * value of <code>OFFLINE</code> means that the server cannot perform file
     * transfer operations.
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
     *            Specifies the condition of a file transfer protocol-enabled
     *            server for the server that was described. A value of
     *            <code>ONLINE</code> indicates that the server can accept jobs
     *            and transfer files. A <code>State</code> value of
     *            <code>OFFLINE</code> means that the server cannot perform file
     *            transfer operations.
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
    public ListedServer withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a file transfer
     * protocol-enabled server you specified with the <code>ServerId</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the number of users that are assigned to a file
     *         transfer protocol-enabled server you specified with the
     *         <code>ServerId</code>.
     *         </p>
     */
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a file transfer
     * protocol-enabled server you specified with the <code>ServerId</code>.
     * </p>
     *
     * @param userCount <p>
     *            Specifies the number of users that are assigned to a file
     *            transfer protocol-enabled server you specified with the
     *            <code>ServerId</code>.
     *            </p>
     */
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a file transfer
     * protocol-enabled server you specified with the <code>ServerId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userCount <p>
     *            Specifies the number of users that are assigned to a file
     *            transfer protocol-enabled server you specified with the
     *            <code>ServerId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedServer withUserCount(Integer userCount) {
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
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: " + getIdentityProviderType() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: " + getLoggingRole() + ",");
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
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
                + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedServer == false)
            return false;
        ListedServer other = (ListedServer) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null
                && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null
                && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUserCount() == null ^ this.getUserCount() == null)
            return false;
        if (other.getUserCount() != null
                && other.getUserCount().equals(this.getUserCount()) == false)
            return false;
        return true;
    }
}
