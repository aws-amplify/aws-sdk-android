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


public class UpdateSecretResult implements Serializable {
    /**
     * <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret that was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String versionId;

    /**
     * <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that was updated.</p> <note> <p>Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are different.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret that was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The friendly name of the secret that was updated.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret that was updated.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret that was updated.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret that was updated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret that was updated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>If a new version of the secret was created by this operation, then <code>VersionId</code> contains the unique identifier of the new version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretResult withVersionId(String versionId) {
        this.versionId = versionId;
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
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSecretResult == false) return false;
        UpdateSecretResult other = (UpdateSecretResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false;
        return true;
    }
}
