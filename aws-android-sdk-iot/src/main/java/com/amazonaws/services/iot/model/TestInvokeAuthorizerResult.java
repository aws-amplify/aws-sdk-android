/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class TestInvokeAuthorizerResult implements Serializable {
    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     */
    private Boolean isAuthenticated;

    /**
     * <p>
     * The principal ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String principalId;

    /**
     * <p>
     * IAM policy documents.
     * </p>
     */
    private java.util.List<String> policyDocuments;

    /**
     * <p>
     * The number of seconds after which the temporary credentials are
     * refreshed.
     * </p>
     */
    private Integer refreshAfterInSeconds;

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     */
    private Integer disconnectAfterInSeconds;

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the token is authenticated, otherwise false.
     *         </p>
     */
    public Boolean isIsAuthenticated() {
        return isAuthenticated;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the token is authenticated, otherwise false.
     *         </p>
     */
    public Boolean getIsAuthenticated() {
        return isAuthenticated;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     *
     * @param isAuthenticated <p>
     *            True if the token is authenticated, otherwise false.
     *            </p>
     */
    public void setIsAuthenticated(Boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    /**
     * <p>
     * True if the token is authenticated, otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAuthenticated <p>
     *            True if the token is authenticated, otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withIsAuthenticated(Boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
        return this;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The principal ID.
     *         </p>
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param principalId <p>
     *            The principal ID.
     *            </p>
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param principalId <p>
     *            The principal ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     *
     * @return <p>
     *         IAM policy documents.
     *         </p>
     */
    public java.util.List<String> getPolicyDocuments() {
        return policyDocuments;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     *
     * @param policyDocuments <p>
     *            IAM policy documents.
     *            </p>
     */
    public void setPolicyDocuments(java.util.Collection<String> policyDocuments) {
        if (policyDocuments == null) {
            this.policyDocuments = null;
            return;
        }

        this.policyDocuments = new java.util.ArrayList<String>(policyDocuments);
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocuments <p>
     *            IAM policy documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withPolicyDocuments(String... policyDocuments) {
        if (getPolicyDocuments() == null) {
            this.policyDocuments = new java.util.ArrayList<String>(policyDocuments.length);
        }
        for (String value : policyDocuments) {
            this.policyDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * IAM policy documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocuments <p>
     *            IAM policy documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withPolicyDocuments(
            java.util.Collection<String> policyDocuments) {
        setPolicyDocuments(policyDocuments);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are
     * refreshed.
     * </p>
     *
     * @return <p>
     *         The number of seconds after which the temporary credentials are
     *         refreshed.
     *         </p>
     */
    public Integer getRefreshAfterInSeconds() {
        return refreshAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are
     * refreshed.
     * </p>
     *
     * @param refreshAfterInSeconds <p>
     *            The number of seconds after which the temporary credentials
     *            are refreshed.
     *            </p>
     */
    public void setRefreshAfterInSeconds(Integer refreshAfterInSeconds) {
        this.refreshAfterInSeconds = refreshAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the temporary credentials are
     * refreshed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshAfterInSeconds <p>
     *            The number of seconds after which the temporary credentials
     *            are refreshed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withRefreshAfterInSeconds(Integer refreshAfterInSeconds) {
        this.refreshAfterInSeconds = refreshAfterInSeconds;
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     *
     * @return <p>
     *         The number of seconds after which the connection is terminated.
     *         </p>
     */
    public Integer getDisconnectAfterInSeconds() {
        return disconnectAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     *
     * @param disconnectAfterInSeconds <p>
     *            The number of seconds after which the connection is
     *            terminated.
     *            </p>
     */
    public void setDisconnectAfterInSeconds(Integer disconnectAfterInSeconds) {
        this.disconnectAfterInSeconds = disconnectAfterInSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the connection is terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disconnectAfterInSeconds <p>
     *            The number of seconds after which the connection is
     *            terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerResult withDisconnectAfterInSeconds(Integer disconnectAfterInSeconds) {
        this.disconnectAfterInSeconds = disconnectAfterInSeconds;
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
        if (getIsAuthenticated() != null)
            sb.append("isAuthenticated: " + getIsAuthenticated() + ",");
        if (getPrincipalId() != null)
            sb.append("principalId: " + getPrincipalId() + ",");
        if (getPolicyDocuments() != null)
            sb.append("policyDocuments: " + getPolicyDocuments() + ",");
        if (getRefreshAfterInSeconds() != null)
            sb.append("refreshAfterInSeconds: " + getRefreshAfterInSeconds() + ",");
        if (getDisconnectAfterInSeconds() != null)
            sb.append("disconnectAfterInSeconds: " + getDisconnectAfterInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIsAuthenticated() == null) ? 0 : getIsAuthenticated().hashCode());
        hashCode = prime * hashCode
                + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocuments() == null) ? 0 : getPolicyDocuments().hashCode());
        hashCode = prime
                * hashCode
                + ((getRefreshAfterInSeconds() == null) ? 0 : getRefreshAfterInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisconnectAfterInSeconds() == null) ? 0 : getDisconnectAfterInSeconds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerResult == false)
            return false;
        TestInvokeAuthorizerResult other = (TestInvokeAuthorizerResult) obj;

        if (other.getIsAuthenticated() == null ^ this.getIsAuthenticated() == null)
            return false;
        if (other.getIsAuthenticated() != null
                && other.getIsAuthenticated().equals(this.getIsAuthenticated()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null
                && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPolicyDocuments() == null ^ this.getPolicyDocuments() == null)
            return false;
        if (other.getPolicyDocuments() != null
                && other.getPolicyDocuments().equals(this.getPolicyDocuments()) == false)
            return false;
        if (other.getRefreshAfterInSeconds() == null ^ this.getRefreshAfterInSeconds() == null)
            return false;
        if (other.getRefreshAfterInSeconds() != null
                && other.getRefreshAfterInSeconds().equals(this.getRefreshAfterInSeconds()) == false)
            return false;
        if (other.getDisconnectAfterInSeconds() == null
                ^ this.getDisconnectAfterInSeconds() == null)
            return false;
        if (other.getDisconnectAfterInSeconds() != null
                && other.getDisconnectAfterInSeconds().equals(this.getDisconnectAfterInSeconds()) == false)
            return false;
        return true;
    }
}
