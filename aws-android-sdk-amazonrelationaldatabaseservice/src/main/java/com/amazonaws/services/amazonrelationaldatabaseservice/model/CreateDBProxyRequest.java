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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Creates a new DB proxy.
 * </p>
 */
public class CreateDBProxyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region. An identifier must
     * begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     */
    private String engineFamily;

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     */
    private java.util.List<UserAuthConfig> auth;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to
     * access secrets in AWS Secrets Manager.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     */
    private java.util.List<String> vpcSubnetIds;

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     */
    private Boolean requireTLS;

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. You can set this value higher or lower
     * than the connection timeout limit for the associated database.
     * </p>
     */
    private Integer idleClientTimeout;

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in
     * its logs. This information helps you to debug issues involving SQL
     * behavior or the performance and scalability of the proxy connections. The
     * debug information includes the text of SQL statements that you submit
     * through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard
     * any sensitive information that appears in the logs.
     * </p>
     */
    private Boolean debugLogging;

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your
     * choosing with the proxy.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region. An identifier must
     * begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         The identifier for the proxy. This name must be unique for all
     *         proxies owned by your AWS account in the specified AWS Region. An
     *         identifier must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens; it can't end with a hyphen or
     *         contain two consecutive hyphens.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region. An identifier must
     * begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier for the proxy. This name must be unique for all
     *            proxies owned by your AWS account in the specified AWS Region.
     *            An identifier must begin with a letter and must contain only
     *            ASCII letters, digits, and hyphens; it can't end with a hyphen
     *            or contain two consecutive hyphens.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region. An identifier must
     * begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier for the proxy. This name must be unique for all
     *            proxies owned by your AWS account in the specified AWS Region.
     *            An identifier must begin with a letter and must contain only
     *            ASCII letters, digits, and hyphens; it can't end with a hyphen
     *            or contain two consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     *
     * @return <p>
     *         The kinds of databases that the proxy can connect to. This value
     *         determines which database network protocol the proxy recognizes
     *         when it interprets network traffic to and from the database. The
     *         engine family applies to MySQL and PostgreSQL for both RDS and
     *         Aurora.
     *         </p>
     * @see EngineFamily
     */
    public String getEngineFamily() {
        return engineFamily;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     *
     * @param engineFamily <p>
     *            The kinds of databases that the proxy can connect to. This
     *            value determines which database network protocol the proxy
     *            recognizes when it interprets network traffic to and from the
     *            database. The engine family applies to MySQL and PostgreSQL
     *            for both RDS and Aurora.
     *            </p>
     * @see EngineFamily
     */
    public void setEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     *
     * @param engineFamily <p>
     *            The kinds of databases that the proxy can connect to. This
     *            value determines which database network protocol the proxy
     *            recognizes when it interprets network traffic to and from the
     *            database. The engine family applies to MySQL and PostgreSQL
     *            for both RDS and Aurora.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EngineFamily
     */
    public CreateDBProxyRequest withEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
        return this;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     *
     * @param engineFamily <p>
     *            The kinds of databases that the proxy can connect to. This
     *            value determines which database network protocol the proxy
     *            recognizes when it interprets network traffic to and from the
     *            database. The engine family applies to MySQL and PostgreSQL
     *            for both RDS and Aurora.
     *            </p>
     * @see EngineFamily
     */
    public void setEngineFamily(EngineFamily engineFamily) {
        this.engineFamily = engineFamily.toString();
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value
     * determines which database network protocol the proxy recognizes when it
     * interprets network traffic to and from the database. The engine family
     * applies to MySQL and PostgreSQL for both RDS and Aurora.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MYSQL, POSTGRESQL
     *
     * @param engineFamily <p>
     *            The kinds of databases that the proxy can connect to. This
     *            value determines which database network protocol the proxy
     *            recognizes when it interprets network traffic to and from the
     *            database. The engine family applies to MySQL and PostgreSQL
     *            for both RDS and Aurora.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EngineFamily
     */
    public CreateDBProxyRequest withEngineFamily(EngineFamily engineFamily) {
        this.engineFamily = engineFamily.toString();
        return this;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     *
     * @return <p>
     *         The authorization mechanism that the proxy uses.
     *         </p>
     */
    public java.util.List<UserAuthConfig> getAuth() {
        return auth;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     *
     * @param auth <p>
     *            The authorization mechanism that the proxy uses.
     *            </p>
     */
    public void setAuth(java.util.Collection<UserAuthConfig> auth) {
        if (auth == null) {
            this.auth = null;
            return;
        }

        this.auth = new java.util.ArrayList<UserAuthConfig>(auth);
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            The authorization mechanism that the proxy uses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withAuth(UserAuthConfig... auth) {
        if (getAuth() == null) {
            this.auth = new java.util.ArrayList<UserAuthConfig>(auth.length);
        }
        for (UserAuthConfig value : auth) {
            this.auth.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            The authorization mechanism that the proxy uses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withAuth(java.util.Collection<UserAuthConfig> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to
     * access secrets in AWS Secrets Manager.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that the proxy
     *         uses to access secrets in AWS Secrets Manager.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to
     * access secrets in AWS Secrets Manager.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that the proxy
     *            uses to access secrets in AWS Secrets Manager.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to
     * access secrets in AWS Secrets Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that the proxy
     *            uses to access secrets in AWS Secrets Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     *
     * @return <p>
     *         One or more VPC subnet IDs to associate with the new proxy.
     *         </p>
     */
    public java.util.List<String> getVpcSubnetIds() {
        return vpcSubnetIds;
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     *
     * @param vpcSubnetIds <p>
     *            One or more VPC subnet IDs to associate with the new proxy.
     *            </p>
     */
    public void setVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        if (vpcSubnetIds == null) {
            this.vpcSubnetIds = null;
            return;
        }

        this.vpcSubnetIds = new java.util.ArrayList<String>(vpcSubnetIds);
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSubnetIds <p>
     *            One or more VPC subnet IDs to associate with the new proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withVpcSubnetIds(String... vpcSubnetIds) {
        if (getVpcSubnetIds() == null) {
            this.vpcSubnetIds = new java.util.ArrayList<String>(vpcSubnetIds.length);
        }
        for (String value : vpcSubnetIds) {
            this.vpcSubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSubnetIds <p>
     *            One or more VPC subnet IDs to associate with the new proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     *
     * @return <p>
     *         One or more VPC security group IDs to associate with the new
     *         proxy.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            One or more VPC security group IDs to associate with the new
     *            proxy.
     *            </p>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            One or more VPC security group IDs to associate with the new
     *            proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) {
            this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds.length);
        }
        for (String value : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            One or more VPC security group IDs to associate with the new
     *            proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     *
     * @return <p>
     *         A Boolean parameter that specifies whether Transport Layer
     *         Security (TLS) encryption is required for connections to the
     *         proxy. By enabling this setting, you can enforce encrypted TLS
     *         connections to the proxy.
     *         </p>
     */
    public Boolean isRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     *
     * @return <p>
     *         A Boolean parameter that specifies whether Transport Layer
     *         Security (TLS) encryption is required for connections to the
     *         proxy. By enabling this setting, you can enforce encrypted TLS
     *         connections to the proxy.
     *         </p>
     */
    public Boolean getRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     *
     * @param requireTLS <p>
     *            A Boolean parameter that specifies whether Transport Layer
     *            Security (TLS) encryption is required for connections to the
     *            proxy. By enabling this setting, you can enforce encrypted TLS
     *            connections to the proxy.
     *            </p>
     */
    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS)
     * encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireTLS <p>
     *            A Boolean parameter that specifies whether Transport Layer
     *            Security (TLS) encryption is required for connections to the
     *            proxy. By enabling this setting, you can enforce encrypted TLS
     *            connections to the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
        return this;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. You can set this value higher or lower
     * than the connection timeout limit for the associated database.
     * </p>
     *
     * @return <p>
     *         The number of seconds that a connection to the proxy can be
     *         inactive before the proxy disconnects it. You can set this value
     *         higher or lower than the connection timeout limit for the
     *         associated database.
     *         </p>
     */
    public Integer getIdleClientTimeout() {
        return idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. You can set this value higher or lower
     * than the connection timeout limit for the associated database.
     * </p>
     *
     * @param idleClientTimeout <p>
     *            The number of seconds that a connection to the proxy can be
     *            inactive before the proxy disconnects it. You can set this
     *            value higher or lower than the connection timeout limit for
     *            the associated database.
     *            </p>
     */
    public void setIdleClientTimeout(Integer idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive
     * before the proxy disconnects it. You can set this value higher or lower
     * than the connection timeout limit for the associated database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idleClientTimeout <p>
     *            The number of seconds that a connection to the proxy can be
     *            inactive before the proxy disconnects it. You can set this
     *            value higher or lower than the connection timeout limit for
     *            the associated database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withIdleClientTimeout(Integer idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
        return this;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in
     * its logs. This information helps you to debug issues involving SQL
     * behavior or the performance and scalability of the proxy connections. The
     * debug information includes the text of SQL statements that you submit
     * through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard
     * any sensitive information that appears in the logs.
     * </p>
     *
     * @return <p>
     *         Whether the proxy includes detailed information about SQL
     *         statements in its logs. This information helps you to debug
     *         issues involving SQL behavior or the performance and scalability
     *         of the proxy connections. The debug information includes the text
     *         of SQL statements that you submit through the proxy. Thus, only
     *         enable this setting when needed for debugging, and only when you
     *         have security measures in place to safeguard any sensitive
     *         information that appears in the logs.
     *         </p>
     */
    public Boolean isDebugLogging() {
        return debugLogging;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in
     * its logs. This information helps you to debug issues involving SQL
     * behavior or the performance and scalability of the proxy connections. The
     * debug information includes the text of SQL statements that you submit
     * through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard
     * any sensitive information that appears in the logs.
     * </p>
     *
     * @return <p>
     *         Whether the proxy includes detailed information about SQL
     *         statements in its logs. This information helps you to debug
     *         issues involving SQL behavior or the performance and scalability
     *         of the proxy connections. The debug information includes the text
     *         of SQL statements that you submit through the proxy. Thus, only
     *         enable this setting when needed for debugging, and only when you
     *         have security measures in place to safeguard any sensitive
     *         information that appears in the logs.
     *         </p>
     */
    public Boolean getDebugLogging() {
        return debugLogging;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in
     * its logs. This information helps you to debug issues involving SQL
     * behavior or the performance and scalability of the proxy connections. The
     * debug information includes the text of SQL statements that you submit
     * through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard
     * any sensitive information that appears in the logs.
     * </p>
     *
     * @param debugLogging <p>
     *            Whether the proxy includes detailed information about SQL
     *            statements in its logs. This information helps you to debug
     *            issues involving SQL behavior or the performance and
     *            scalability of the proxy connections. The debug information
     *            includes the text of SQL statements that you submit through
     *            the proxy. Thus, only enable this setting when needed for
     *            debugging, and only when you have security measures in place
     *            to safeguard any sensitive information that appears in the
     *            logs.
     *            </p>
     */
    public void setDebugLogging(Boolean debugLogging) {
        this.debugLogging = debugLogging;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in
     * its logs. This information helps you to debug issues involving SQL
     * behavior or the performance and scalability of the proxy connections. The
     * debug information includes the text of SQL statements that you submit
     * through the proxy. Thus, only enable this setting when needed for
     * debugging, and only when you have security measures in place to safeguard
     * any sensitive information that appears in the logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param debugLogging <p>
     *            Whether the proxy includes detailed information about SQL
     *            statements in its logs. This information helps you to debug
     *            issues involving SQL behavior or the performance and
     *            scalability of the proxy connections. The debug information
     *            includes the text of SQL statements that you submit through
     *            the proxy. Thus, only enable this setting when needed for
     *            debugging, and only when you have security measures in place
     *            to safeguard any sensitive information that appears in the
     *            logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withDebugLogging(Boolean debugLogging) {
        this.debugLogging = debugLogging;
        return this;
    }

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your
     * choosing with the proxy.
     * </p>
     *
     * @return <p>
     *         An optional set of key-value pairs to associate arbitrary data of
     *         your choosing with the proxy.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your
     * choosing with the proxy.
     * </p>
     *
     * @param tags <p>
     *            An optional set of key-value pairs to associate arbitrary data
     *            of your choosing with the proxy.
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
     * An optional set of key-value pairs to associate arbitrary data of your
     * choosing with the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of key-value pairs to associate arbitrary data
     *            of your choosing with the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withTags(Tag... tags) {
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
     * An optional set of key-value pairs to associate arbitrary data of your
     * choosing with the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An optional set of key-value pairs to associate arbitrary data
     *            of your choosing with the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBProxyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: " + getDBProxyName() + ",");
        if (getEngineFamily() != null)
            sb.append("EngineFamily: " + getEngineFamily() + ",");
        if (getAuth() != null)
            sb.append("Auth: " + getAuth() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: " + getVpcSubnetIds() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: " + getRequireTLS() + ",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: " + getIdleClientTimeout() + ",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: " + getDebugLogging() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode
                + ((getEngineFamily() == null) ? 0 : getEngineFamily().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode
                + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBProxyRequest == false)
            return false;
        CreateDBProxyRequest other = (CreateDBProxyRequest) obj;

        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getEngineFamily() == null ^ this.getEngineFamily() == null)
            return false;
        if (other.getEngineFamily() != null
                && other.getEngineFamily().equals(this.getEngineFamily()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null
                && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getRequireTLS() == null ^ this.getRequireTLS() == null)
            return false;
        if (other.getRequireTLS() != null
                && other.getRequireTLS().equals(this.getRequireTLS()) == false)
            return false;
        if (other.getIdleClientTimeout() == null ^ this.getIdleClientTimeout() == null)
            return false;
        if (other.getIdleClientTimeout() != null
                && other.getIdleClientTimeout().equals(this.getIdleClientTimeout()) == false)
            return false;
        if (other.getDebugLogging() == null ^ this.getDebugLogging() == null)
            return false;
        if (other.getDebugLogging() != null
                && other.getDebugLogging().equals(this.getDebugLogging()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
