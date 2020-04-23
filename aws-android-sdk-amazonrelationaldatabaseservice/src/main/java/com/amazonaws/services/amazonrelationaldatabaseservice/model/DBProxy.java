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

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * The data structure representing a proxy managed by the RDS Proxy.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBProxies</code> action.
 * </p>
 */
public class DBProxy implements Serializable {
    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     */
    private String dBProxyArn;

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     */
    private String status;

    /**
     * <p>
     * The engine family applies to MySQL and PostgreSQL for both RDS and
     * Aurora.
     * </p>
     */
    private String engineFamily;

    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     */
    private java.util.List<String> vpcSubnetIds;

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to
     * connect to the associated RDS DB instance or Aurora DB cluster.
     * </p>
     */
    private java.util.List<UserAuthConfigInfo> auth;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to
     * access Amazon Secrets Manager.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the
     * endpoint value in the connection string for a database client
     * application.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required
     * for connections to the proxy.
     * </p>
     */
    private Boolean requireTLS;

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity
     * before the proxy drops the client connection. The proxy keeps the
     * underlying database connection open and puts it back into the connection
     * pool for reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
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
     * The date and time when the proxy was first created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region.
     * </p>
     *
     * @return <p>
     *         The identifier for the proxy. This name must be unique for all
     *         proxies owned by your AWS account in the specified AWS Region.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier for the proxy. This name must be unique for all
     *            proxies owned by your AWS account in the specified AWS Region.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies
     * owned by your AWS account in the specified AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier for the proxy. This name must be unique for all
     *            proxies owned by your AWS account in the specified AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the proxy.
     *         </p>
     */
    public String getDBProxyArn() {
        return dBProxyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     *
     * @param dBProxyArn <p>
     *            The Amazon Resource Name (ARN) for the proxy.
     *            </p>
     */
    public void setDBProxyArn(String dBProxyArn) {
        this.dBProxyArn = dBProxyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyArn <p>
     *            The Amazon Resource Name (ARN) for the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withDBProxyArn(String dBProxyArn) {
        this.dBProxyArn = dBProxyArn;
        return this;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     *
     * @return <p>
     *         The current status of this proxy. A status of
     *         <code>available</code> means the proxy is ready to handle
     *         requests. Other values indicate that you must wait for the proxy
     *         to be ready, or take some action to resolve an issue.
     *         </p>
     * @see DBProxyStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     *
     * @param status <p>
     *            The current status of this proxy. A status of
     *            <code>available</code> means the proxy is ready to handle
     *            requests. Other values indicate that you must wait for the
     *            proxy to be ready, or take some action to resolve an issue.
     *            </p>
     * @see DBProxyStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     *
     * @param status <p>
     *            The current status of this proxy. A status of
     *            <code>available</code> means the proxy is ready to handle
     *            requests. Other values indicate that you must wait for the
     *            proxy to be ready, or take some action to resolve an issue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DBProxyStatus
     */
    public DBProxy withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     *
     * @param status <p>
     *            The current status of this proxy. A status of
     *            <code>available</code> means the proxy is ready to handle
     *            requests. Other values indicate that you must wait for the
     *            proxy to be ready, or take some action to resolve an issue.
     *            </p>
     * @see DBProxyStatus
     */
    public void setStatus(DBProxyStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code>
     * means the proxy is ready to handle requests. Other values indicate that
     * you must wait for the proxy to be ready, or take some action to resolve
     * an issue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, modifying, incompatible-network,
     * insufficient-resource-limits, creating, deleting, suspended, suspending,
     * reactivating
     *
     * @param status <p>
     *            The current status of this proxy. A status of
     *            <code>available</code> means the proxy is ready to handle
     *            requests. Other values indicate that you must wait for the
     *            proxy to be ready, or take some action to resolve an issue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DBProxyStatus
     */
    public DBProxy withStatus(DBProxyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The engine family applies to MySQL and PostgreSQL for both RDS and
     * Aurora.
     * </p>
     *
     * @return <p>
     *         The engine family applies to MySQL and PostgreSQL for both RDS
     *         and Aurora.
     *         </p>
     */
    public String getEngineFamily() {
        return engineFamily;
    }

    /**
     * <p>
     * The engine family applies to MySQL and PostgreSQL for both RDS and
     * Aurora.
     * </p>
     *
     * @param engineFamily <p>
     *            The engine family applies to MySQL and PostgreSQL for both RDS
     *            and Aurora.
     *            </p>
     */
    public void setEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
    }

    /**
     * <p>
     * The engine family applies to MySQL and PostgreSQL for both RDS and
     * Aurora.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineFamily <p>
     *            The engine family applies to MySQL and PostgreSQL for both RDS
     *            and Aurora.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     *
     * @return <p>
     *         Provides a list of VPC security groups that the proxy belongs to.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            Provides a list of VPC security groups that the proxy belongs
     *            to.
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
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            Provides a list of VPC security groups that the proxy belongs
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            Provides a list of VPC security groups that the proxy belongs
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     *
     * @return <p>
     *         The EC2 subnet IDs for the proxy.
     *         </p>
     */
    public java.util.List<String> getVpcSubnetIds() {
        return vpcSubnetIds;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     *
     * @param vpcSubnetIds <p>
     *            The EC2 subnet IDs for the proxy.
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
     * The EC2 subnet IDs for the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSubnetIds <p>
     *            The EC2 subnet IDs for the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withVpcSubnetIds(String... vpcSubnetIds) {
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
     * The EC2 subnet IDs for the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSubnetIds <p>
     *            The EC2 subnet IDs for the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to
     * connect to the associated RDS DB instance or Aurora DB cluster.
     * </p>
     *
     * @return <p>
     *         One or more data structures specifying the authorization
     *         mechanism to connect to the associated RDS DB instance or Aurora
     *         DB cluster.
     *         </p>
     */
    public java.util.List<UserAuthConfigInfo> getAuth() {
        return auth;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to
     * connect to the associated RDS DB instance or Aurora DB cluster.
     * </p>
     *
     * @param auth <p>
     *            One or more data structures specifying the authorization
     *            mechanism to connect to the associated RDS DB instance or
     *            Aurora DB cluster.
     *            </p>
     */
    public void setAuth(java.util.Collection<UserAuthConfigInfo> auth) {
        if (auth == null) {
            this.auth = null;
            return;
        }

        this.auth = new java.util.ArrayList<UserAuthConfigInfo>(auth);
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to
     * connect to the associated RDS DB instance or Aurora DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            One or more data structures specifying the authorization
     *            mechanism to connect to the associated RDS DB instance or
     *            Aurora DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withAuth(UserAuthConfigInfo... auth) {
        if (getAuth() == null) {
            this.auth = new java.util.ArrayList<UserAuthConfigInfo>(auth.length);
        }
        for (UserAuthConfigInfo value : auth) {
            this.auth.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to
     * connect to the associated RDS DB instance or Aurora DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            One or more data structures specifying the authorization
     *            mechanism to connect to the associated RDS DB instance or
     *            Aurora DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withAuth(java.util.Collection<UserAuthConfigInfo> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to
     * access Amazon Secrets Manager.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the IAM role that the proxy
     *         uses to access Amazon Secrets Manager.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to
     * access Amazon Secrets Manager.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) for the IAM role that the proxy
     *            uses to access Amazon Secrets Manager.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to
     * access Amazon Secrets Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) for the IAM role that the proxy
     *            uses to access Amazon Secrets Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the
     * endpoint value in the connection string for a database client
     * application.
     * </p>
     *
     * @return <p>
     *         The endpoint that you can use to connect to the proxy. You
     *         include the endpoint value in the connection string for a
     *         database client application.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the
     * endpoint value in the connection string for a database client
     * application.
     * </p>
     *
     * @param endpoint <p>
     *            The endpoint that you can use to connect to the proxy. You
     *            include the endpoint value in the connection string for a
     *            database client application.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the
     * endpoint value in the connection string for a database client
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The endpoint that you can use to connect to the proxy. You
     *            include the endpoint value in the connection string for a
     *            database client application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required
     * for connections to the proxy.
     * </p>
     *
     * @return <p>
     *         Indicates whether Transport Layer Security (TLS) encryption is
     *         required for connections to the proxy.
     *         </p>
     */
    public Boolean isRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required
     * for connections to the proxy.
     * </p>
     *
     * @return <p>
     *         Indicates whether Transport Layer Security (TLS) encryption is
     *         required for connections to the proxy.
     *         </p>
     */
    public Boolean getRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required
     * for connections to the proxy.
     * </p>
     *
     * @param requireTLS <p>
     *            Indicates whether Transport Layer Security (TLS) encryption is
     *            required for connections to the proxy.
     *            </p>
     */
    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required
     * for connections to the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireTLS <p>
     *            Indicates whether Transport Layer Security (TLS) encryption is
     *            required for connections to the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
        return this;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity
     * before the proxy drops the client connection. The proxy keeps the
     * underlying database connection open and puts it back into the connection
     * pool for reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     *
     * @return <p>
     *         The number of seconds a connection to the proxy can have no
     *         activity before the proxy drops the client connection. The proxy
     *         keeps the underlying database connection open and puts it back
     *         into the connection pool for reuse by later connection requests.
     *         </p>
     *         <p>
     *         Default: 1800 (30 minutes)
     *         </p>
     *         <p>
     *         Constraints: 1 to 28,800
     *         </p>
     */
    public Integer getIdleClientTimeout() {
        return idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity
     * before the proxy drops the client connection. The proxy keeps the
     * underlying database connection open and puts it back into the connection
     * pool for reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     *
     * @param idleClientTimeout <p>
     *            The number of seconds a connection to the proxy can have no
     *            activity before the proxy drops the client connection. The
     *            proxy keeps the underlying database connection open and puts
     *            it back into the connection pool for reuse by later connection
     *            requests.
     *            </p>
     *            <p>
     *            Default: 1800 (30 minutes)
     *            </p>
     *            <p>
     *            Constraints: 1 to 28,800
     *            </p>
     */
    public void setIdleClientTimeout(Integer idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity
     * before the proxy drops the client connection. The proxy keeps the
     * underlying database connection open and puts it back into the connection
     * pool for reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idleClientTimeout <p>
     *            The number of seconds a connection to the proxy can have no
     *            activity before the proxy drops the client connection. The
     *            proxy keeps the underlying database connection open and puts
     *            it back into the connection pool for reuse by later connection
     *            requests.
     *            </p>
     *            <p>
     *            Default: 1800 (30 minutes)
     *            </p>
     *            <p>
     *            Constraints: 1 to 28,800
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withIdleClientTimeout(Integer idleClientTimeout) {
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
    public DBProxy withDebugLogging(Boolean debugLogging) {
        this.debugLogging = debugLogging;
        return this;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     *
     * @return <p>
     *         The date and time when the proxy was first created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     *
     * @param createdDate <p>
     *            The date and time when the proxy was first created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date and time when the proxy was first created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time when the proxy was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     *
     * @param updatedDate <p>
     *            The date and time when the proxy was last updated.
     *            </p>
     */
    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedDate <p>
     *            The date and time when the proxy was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxy withUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
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
        if (getDBProxyArn() != null)
            sb.append("DBProxyArn: " + getDBProxyArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEngineFamily() != null)
            sb.append("EngineFamily: " + getEngineFamily() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: " + getVpcSubnetIds() + ",");
        if (getAuth() != null)
            sb.append("Auth: " + getAuth() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: " + getRequireTLS() + ",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: " + getIdleClientTimeout() + ",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: " + getDebugLogging() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: " + getUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getDBProxyArn() == null) ? 0 : getDBProxyArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEngineFamily() == null) ? 0 : getEngineFamily().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode
                + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxy == false)
            return false;
        DBProxy other = (DBProxy) obj;

        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getDBProxyArn() == null ^ this.getDBProxyArn() == null)
            return false;
        if (other.getDBProxyArn() != null
                && other.getDBProxyArn().equals(this.getDBProxyArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngineFamily() == null ^ this.getEngineFamily() == null)
            return false;
        if (other.getEngineFamily() != null
                && other.getEngineFamily().equals(this.getEngineFamily()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null
                && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null
                && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
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
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null
                && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        return true;
    }
}
