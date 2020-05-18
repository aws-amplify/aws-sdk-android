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
 * Reserved for future use.
 * </p>
 */
public class FederatedUser implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String accessKeyId;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private SessionContext sessionContext;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param accessKeyId <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessKeyId <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedUser withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param accountId <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedUser withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param arn <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedUser withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param principalId <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principalId <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedUser withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public SessionContext getSessionContext() {
        return sessionContext;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param sessionContext <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionContext <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FederatedUser withSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
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
        if (getAccessKeyId() != null)
            sb.append("accessKeyId: " + getAccessKeyId() + ",");
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getPrincipalId() != null)
            sb.append("principalId: " + getPrincipalId() + ",");
        if (getSessionContext() != null)
            sb.append("sessionContext: " + getSessionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode
                + ((getSessionContext() == null) ? 0 : getSessionContext().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedUser == false)
            return false;
        FederatedUser other = (FederatedUser) obj;

        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null
                && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
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
        if (other.getSessionContext() == null ^ this.getSessionContext() == null)
            return false;
        if (other.getSessionContext() != null
                && other.getSessionContext().equals(this.getSessionContext()) == false)
            return false;
        return true;
    }
}
