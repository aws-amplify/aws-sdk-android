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
 * Changes the settings for an existing DB proxy.
 * </p>
 */
public class ModifyDBProxyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String newDBProxyName;

    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     */
    private java.util.List<UserAuthConfig> auth;

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. By enabling this setting, you can enforce
     * encrypted TLS connections to the proxy, even if the associated database
     * doesn't use TLS.
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
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to
     * access secrets in AWS Secrets Manager.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     *
     * @return <p>
     *         The identifier for the <code>DBProxy</code> to modify.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier for the <code>DBProxy</code> to modify.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier for the <code>DBProxy</code> to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         The new identifier for the <code>DBProxy</code>. An identifier
     *         must begin with a letter and must contain only ASCII letters,
     *         digits, and hyphens; it can't end with a hyphen or contain two
     *         consecutive hyphens.
     *         </p>
     */
    public String getNewDBProxyName() {
        return newDBProxyName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param newDBProxyName <p>
     *            The new identifier for the <code>DBProxy</code>. An identifier
     *            must begin with a letter and must contain only ASCII letters,
     *            digits, and hyphens; it can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     */
    public void setNewDBProxyName(String newDBProxyName) {
        this.newDBProxyName = newDBProxyName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens;
     * it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newDBProxyName <p>
     *            The new identifier for the <code>DBProxy</code>. An identifier
     *            must begin with a letter and must contain only ASCII letters,
     *            digits, and hyphens; it can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withNewDBProxyName(String newDBProxyName) {
        this.newDBProxyName = newDBProxyName;
        return this;
    }

    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     *
     * @return <p>
     *         The new authentication settings for the <code>DBProxy</code>.
     *         </p>
     */
    public java.util.List<UserAuthConfig> getAuth() {
        return auth;
    }

    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     *
     * @param auth <p>
     *            The new authentication settings for the <code>DBProxy</code>.
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
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            The new authentication settings for the <code>DBProxy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withAuth(UserAuthConfig... auth) {
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
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auth <p>
     *            The new authentication settings for the <code>DBProxy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withAuth(java.util.Collection<UserAuthConfig> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. By enabling this setting, you can enforce
     * encrypted TLS connections to the proxy, even if the associated database
     * doesn't use TLS.
     * </p>
     *
     * @return <p>
     *         Whether Transport Layer Security (TLS) encryption is required for
     *         connections to the proxy. By enabling this setting, you can
     *         enforce encrypted TLS connections to the proxy, even if the
     *         associated database doesn't use TLS.
     *         </p>
     */
    public Boolean isRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. By enabling this setting, you can enforce
     * encrypted TLS connections to the proxy, even if the associated database
     * doesn't use TLS.
     * </p>
     *
     * @return <p>
     *         Whether Transport Layer Security (TLS) encryption is required for
     *         connections to the proxy. By enabling this setting, you can
     *         enforce encrypted TLS connections to the proxy, even if the
     *         associated database doesn't use TLS.
     *         </p>
     */
    public Boolean getRequireTLS() {
        return requireTLS;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. By enabling this setting, you can enforce
     * encrypted TLS connections to the proxy, even if the associated database
     * doesn't use TLS.
     * </p>
     *
     * @param requireTLS <p>
     *            Whether Transport Layer Security (TLS) encryption is required
     *            for connections to the proxy. By enabling this setting, you
     *            can enforce encrypted TLS connections to the proxy, even if
     *            the associated database doesn't use TLS.
     *            </p>
     */
    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for
     * connections to the proxy. By enabling this setting, you can enforce
     * encrypted TLS connections to the proxy, even if the associated database
     * doesn't use TLS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requireTLS <p>
     *            Whether Transport Layer Security (TLS) encryption is required
     *            for connections to the proxy. By enabling this setting, you
     *            can enforce encrypted TLS connections to the proxy, even if
     *            the associated database doesn't use TLS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withRequireTLS(Boolean requireTLS) {
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
    public ModifyDBProxyRequest withIdleClientTimeout(Integer idleClientTimeout) {
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
    public ModifyDBProxyRequest withDebugLogging(Boolean debugLogging) {
        this.debugLogging = debugLogging;
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
    public ModifyDBProxyRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     *
     * @return <p>
     *         The new list of security groups for the <code>DBProxy</code>.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     *
     * @param securityGroups <p>
     *            The new list of security groups for the <code>DBProxy</code>.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The new list of security groups for the <code>DBProxy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The new list of security groups for the <code>DBProxy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getNewDBProxyName() != null)
            sb.append("NewDBProxyName: " + getNewDBProxyName() + ",");
        if (getAuth() != null)
            sb.append("Auth: " + getAuth() + ",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: " + getRequireTLS() + ",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: " + getIdleClientTimeout() + ",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: " + getDebugLogging() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups());
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
                + ((getNewDBProxyName() == null) ? 0 : getNewDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode
                + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyRequest == false)
            return false;
        ModifyDBProxyRequest other = (ModifyDBProxyRequest) obj;

        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getNewDBProxyName() == null ^ this.getNewDBProxyName() == null)
            return false;
        if (other.getNewDBProxyName() != null
                && other.getNewDBProxyName().equals(this.getNewDBProxyName()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }
}
