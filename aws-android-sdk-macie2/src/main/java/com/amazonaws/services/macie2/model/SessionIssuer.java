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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the source and type of temporary security
 * credentials that were issued to an entity.
 * </p>
 */
public class SessionIssuer implements Serializable {
    /**
     * <p>
     * The account that owns the entity that was used to get the credentials.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role
     * that was used to get the credentials.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The internal identifier for the entity that was used to get the
     * credentials.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser,
     * or Role.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value
     * is null if the credentials were obtained from a root account that doesn't
     * have an alias.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The account that owns the entity that was used to get the credentials.
     * </p>
     *
     * @return <p>
     *         The account that owns the entity that was used to get the
     *         credentials.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account that owns the entity that was used to get the credentials.
     * </p>
     *
     * @param accountId <p>
     *            The account that owns the entity that was used to get the
     *            credentials.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that owns the entity that was used to get the credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The account that owns the entity that was used to get the
     *            credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionIssuer withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role
     * that was used to get the credentials.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the source account, IAM user,
     *         or role that was used to get the credentials.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role
     * that was used to get the credentials.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the source account, IAM
     *            user, or role that was used to get the credentials.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role
     * that was used to get the credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the source account, IAM
     *            user, or role that was used to get the credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionIssuer withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The internal identifier for the entity that was used to get the
     * credentials.
     * </p>
     *
     * @return <p>
     *         The internal identifier for the entity that was used to get the
     *         credentials.
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * The internal identifier for the entity that was used to get the
     * credentials.
     * </p>
     *
     * @param principalId <p>
     *            The internal identifier for the entity that was used to get
     *            the credentials.
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The internal identifier for the entity that was used to get the
     * credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalId <p>
     *            The internal identifier for the entity that was used to get
     *            the credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionIssuer withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser,
     * or Role.
     * </p>
     *
     * @return <p>
     *         The source of the temporary security credentials, such as Root,
     *         IAMUser, or Role.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser,
     * or Role.
     * </p>
     *
     * @param type <p>
     *            The source of the temporary security credentials, such as
     *            Root, IAMUser, or Role.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser,
     * or Role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The source of the temporary security credentials, such as
     *            Root, IAMUser, or Role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionIssuer withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value
     * is null if the credentials were obtained from a root account that doesn't
     * have an alias.
     * </p>
     *
     * @return <p>
     *         The name or alias of the user or role that issued the session.
     *         This value is null if the credentials were obtained from a root
     *         account that doesn't have an alias.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value
     * is null if the credentials were obtained from a root account that doesn't
     * have an alias.
     * </p>
     *
     * @param userName <p>
     *            The name or alias of the user or role that issued the session.
     *            This value is null if the credentials were obtained from a
     *            root account that doesn't have an alias.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value
     * is null if the credentials were obtained from a root account that doesn't
     * have an alias.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userName <p>
     *            The name or alias of the user or role that issued the session.
     *            This value is null if the credentials were obtained from a
     *            root account that doesn't have an alias.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionIssuer withUserName(String userName) {
        this.userName = userName;
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getPrincipalId() != null)
            sb.append("principalId: " + getPrincipalId() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getUserName() != null)
            sb.append("userName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionIssuer == false)
            return false;
        SessionIssuer other = (SessionIssuer) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null
                && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
