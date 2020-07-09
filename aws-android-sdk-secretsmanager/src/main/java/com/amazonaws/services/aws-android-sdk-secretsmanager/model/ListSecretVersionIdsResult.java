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


public class ListSecretVersionIdsResult implements Serializable {
    /**
     * <p>The list of the currently available versions of the specified secret.</p>
     */
    private java.util.List<SecretVersionsListEntry> versions;

    /**
     * <p>If present in the response, this value indicates that there's more output available than included in the current response. This can occur even when the response includes no values at all, such as when you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to continue processing and get the next part of the output. You should repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>The list of the currently available versions of the specified secret.</p>
     *
     * @return <p>The list of the currently available versions of the specified secret.</p>
     */
    public java.util.List<SecretVersionsListEntry> getVersions() {
        return versions;
    }

    /**
     * <p>The list of the currently available versions of the specified secret.</p>
     *
     * @param versions <p>The list of the currently available versions of the specified secret.</p>
     */
    public void setVersions(java.util.Collection<SecretVersionsListEntry> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<SecretVersionsListEntry>(versions);
    }

    /**
     * <p>The list of the currently available versions of the specified secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p>The list of the currently available versions of the specified secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsResult withVersions(SecretVersionsListEntry... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<SecretVersionsListEntry>(versions.length);
        }
        for (SecretVersionsListEntry value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>The list of the currently available versions of the specified secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p>The list of the currently available versions of the specified secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsResult withVersions(java.util.Collection<SecretVersionsListEntry> versions) {
        setVersions(versions);
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
    public ListSecretVersionIdsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The Amazon Resource Name (ARN) for the secret.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The friendly name of the secret.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsResult withName(String name) {
        this.name = name;
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
        if (getVersions() != null) sb.append("Versions: " + getVersions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSecretVersionIdsResult == false) return false;
        ListSecretVersionIdsResult other = (ListSecretVersionIdsResult)obj;

        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        return true;
    }
}
