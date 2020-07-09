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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class ListSecretsResult implements Serializable {
    /**
     * <p>A list of the secrets in the account.</p>
     */
    private java.util.List<SecretListEntry> secretList;

    /**
     * <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>A list of the secrets in the account.</p>
     *
     * @return <p>A list of the secrets in the account.</p>
     */
    public java.util.List<SecretListEntry> getSecretList() {
        return secretList;
    }

    /**
     * <p>A list of the secrets in the account.</p>
     *
     * @param secretList <p>A list of the secrets in the account.</p>
     */
    public void setSecretList(java.util.Collection<SecretListEntry> secretList) {
        if (secretList == null) {
            this.secretList = null;
            return;
        }

        this.secretList = new java.util.ArrayList<SecretListEntry>(secretList);
    }

    /**
     * <p>A list of the secrets in the account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretList <p>A list of the secrets in the account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsResult withSecretList(SecretListEntry... secretList) {
        if (getSecretList() == null) {
            this.secretList = new java.util.ArrayList<SecretListEntry>(secretList.length);
        }
        for (SecretListEntry value : secretList) {
            this.secretList.add(value);
        }
        return this;
    }

    /**
     * <p>A list of the secrets in the account.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretList <p>A list of the secrets in the account.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsResult withSecretList(java.util.Collection<SecretListEntry> secretList) {
        setSecretList(secretList);
        return this;
    }

    /**
     * <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSecretList() != null) sb.append("SecretList: " + getSecretList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretList() == null) ? 0 : getSecretList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSecretsResult == false) return false;
        ListSecretsResult other = (ListSecretsResult)obj;

        if (other.getSecretList() == null ^ this.getSecretList() == null) return false;
        if (other.getSecretList() != null && other.getSecretList().equals(this.getSecretList()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
