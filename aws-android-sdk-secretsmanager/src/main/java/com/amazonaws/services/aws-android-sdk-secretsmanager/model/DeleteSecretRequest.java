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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Deletes an entire secret and all of its versions. You can optionally include a recovery window during which you can restore the secret. If you don't specify a recovery window value, the operation defaults to 30 days. Secrets Manager attaches a <code>DeletionDate</code> stamp to the secret that specifies the end of the recovery window. At the end of the recovery window, Secrets Manager deletes the secret permanently.</p> <p>At any time before recovery window ends, you can use <a>RestoreSecret</a> to remove the <code>DeletionDate</code> and cancel the deletion of the secret.</p> <p>You cannot access the encrypted secret information in any secret that is scheduled for deletion. If you need to access that information, you must cancel the deletion with <a>RestoreSecret</a> and then retrieve the information.</p> <note> <ul> <li> <p>There is no explicit operation to delete a version of a secret. Instead, remove all staging labels from the <code>VersionStage</code> field of a version. That marks the version as deprecated and allows Secrets Manager to delete it as needed. Versions that do not have any staging labels do not show up in <a>ListSecretVersionIds</a> unless you specify <code>IncludeDeprecated</code>.</p> </li> <li> <p>The permanent secret deletion at the end of the waiting period is performed as a background task with low priority. There is no guarantee of a specific time after the recovery window for the actual delete operation to occur.</p> </li> </ul> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:DeleteSecret</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a secret, use <a>CreateSecret</a>.</p> </li> <li> <p>To cancel deletion of a version of a secret before the recovery window has expired, use <a>RestoreSecret</a>.</p> </li> </ul>
 */
public class DeleteSecretRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     */
    private Long recoveryWindowInDays;

    /**
     * <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     */
    private Boolean forceDeleteWithoutRecovery;

    /**
     * <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret that you want to delete. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     *
     * @return <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     */
    public Long getRecoveryWindowInDays() {
        return recoveryWindowInDays;
    }

    /**
     * <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     *
     * @param recoveryWindowInDays <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     */
    public void setRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
    }

    /**
     * <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recoveryWindowInDays <p>(Optional) Specifies the number of days that Secrets Manager waits before it can delete the secret. You can't use both this parameter and the <code>ForceDeleteWithoutRecovery</code> parameter in the same API call.</p> <p>This value can range from 7 to 30 days. The default value is 30.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretRequest withRecoveryWindowInDays(Long recoveryWindowInDays) {
        this.recoveryWindowInDays = recoveryWindowInDays;
        return this;
    }

    /**
     * <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     *
     * @return <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     */
    public Boolean isForceDeleteWithoutRecovery() {
        return forceDeleteWithoutRecovery;
    }

    /**
     * <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     *
     * @return <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     */
    public Boolean getForceDeleteWithoutRecovery() {
        return forceDeleteWithoutRecovery;
    }

    /**
     * <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     *
     * @param forceDeleteWithoutRecovery <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     */
    public void setForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
    }

    /**
     * <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forceDeleteWithoutRecovery <p>(Optional) Specifies that the secret is to be deleted without any recovery window. You can't use both this parameter and the <code>RecoveryWindowInDays</code> parameter in the same API call.</p> <p>An asynchronous background process performs the actual deletion, so there can be a short delay before the operation completes. If you write code to delete and then immediately recreate a secret with the same name, ensure that your code includes appropriate back off and retry logic.</p> <important> <p>Use this parameter with caution. This parameter causes the operation to skip the normal waiting period before the permanent deletion that AWS would normally impose with the <code>RecoveryWindowInDays</code> parameter. If you delete a secret with the <code>ForceDeleteWithouRecovery</code> parameter, then you have no opportunity to recover the secret. It is permanently lost.</p> </important>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretRequest withForceDeleteWithoutRecovery(Boolean forceDeleteWithoutRecovery) {
        this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
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
        if (getSecretId() != null) sb.append("SecretId: " + getSecretId() + ",");
        if (getRecoveryWindowInDays() != null) sb.append("RecoveryWindowInDays: " + getRecoveryWindowInDays() + ",");
        if (getForceDeleteWithoutRecovery() != null) sb.append("ForceDeleteWithoutRecovery: " + getForceDeleteWithoutRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getRecoveryWindowInDays() == null) ? 0 : getRecoveryWindowInDays().hashCode());
        hashCode = prime * hashCode + ((getForceDeleteWithoutRecovery() == null) ? 0 : getForceDeleteWithoutRecovery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSecretRequest == false) return false;
        DeleteSecretRequest other = (DeleteSecretRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getRecoveryWindowInDays() == null ^ this.getRecoveryWindowInDays() == null) return false;
        if (other.getRecoveryWindowInDays() != null && other.getRecoveryWindowInDays().equals(this.getRecoveryWindowInDays()) == false) return false;
        if (other.getForceDeleteWithoutRecovery() == null ^ this.getForceDeleteWithoutRecovery() == null) return false;
        if (other.getForceDeleteWithoutRecovery() != null && other.getForceDeleteWithoutRecovery().equals(this.getForceDeleteWithoutRecovery()) == false) return false;
        return true;
    }
}
