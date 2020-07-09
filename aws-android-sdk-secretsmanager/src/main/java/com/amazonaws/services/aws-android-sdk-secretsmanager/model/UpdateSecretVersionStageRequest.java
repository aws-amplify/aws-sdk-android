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
 * <p>Modifies the staging labels attached to a version of a secret. Staging labels are used to track a version as it progresses through the secret rotation process. You can attach a staging label to only one version of a secret at a time. If a staging label to be added is already attached to another version, then it is moved--removed from the other version first and then attached to this one. For more information about staging labels, see <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/terms-concepts.html#term_staging-label">Staging Labels</a> in the <i>AWS Secrets Manager User Guide</i>. </p> <p>The staging labels that you specify in the <code>VersionStage</code> parameter are added to the existing list of staging labels--they don't replace it.</p> <p>You can move the <code>AWSCURRENT</code> staging label to this version by including it in this call.</p> <note> <p>Whenever you move <code>AWSCURRENT</code>, Secrets Manager automatically moves the label <code>AWSPREVIOUS</code> to the version that <code>AWSCURRENT</code> was removed from.</p> </note> <p>If this action results in the last label being removed from a version, then the version is considered to be 'deprecated' and can be deleted by Secrets Manager.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:UpdateSecretVersionStage</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To get the list of staging labels that are currently associated with a version of a secret, use <code> <a>DescribeSecret</a> </code> and examine the <code>SecretVersionsToStages</code> response value. </p> </li> </ul>
 */
public class UpdateSecretVersionStageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>The staging label to add to this version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String versionStage;

    /**
     * <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String removeFromVersionId;

    /**
     * <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String moveToVersionId;

    /**
     * <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret with the version with the list of staging labels you want to modify. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretVersionStageRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>The staging label to add to this version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The staging label to add to this version.</p>
     */
    public String getVersionStage() {
        return versionStage;
    }

    /**
     * <p>The staging label to add to this version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param versionStage <p>The staging label to add to this version.</p>
     */
    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>The staging label to add to this version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param versionStage <p>The staging label to add to this version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretVersionStageRequest withVersionStage(String versionStage) {
        this.versionStage = versionStage;
        return this;
    }

    /**
     * <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     */
    public String getRemoveFromVersionId() {
        return removeFromVersionId;
    }

    /**
     * <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param removeFromVersionId <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     */
    public void setRemoveFromVersionId(String removeFromVersionId) {
        this.removeFromVersionId = removeFromVersionId;
    }

    /**
     * <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param removeFromVersionId <p>Specifies the secret version ID of the version that the staging label is to be removed from. If the staging label you are trying to attach to one version is already attached to a different version, then you must include this parameter and specify the version that the label is to be removed from. If the label is attached and you either do not specify this parameter, or the version ID does not match, then the operation fails.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretVersionStageRequest withRemoveFromVersionId(String removeFromVersionId) {
        this.removeFromVersionId = removeFromVersionId;
        return this;
    }

    /**
     * <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     */
    public String getMoveToVersionId() {
        return moveToVersionId;
    }

    /**
     * <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param moveToVersionId <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     */
    public void setMoveToVersionId(String moveToVersionId) {
        this.moveToVersionId = moveToVersionId;
    }

    /**
     * <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param moveToVersionId <p>(Optional) The secret version ID that you want to add the staging label. If you want to remove a label from a version, then do not specify this parameter.</p> <p>If the staging label is already attached to a different version of the secret, then you must also specify the <code>RemoveFromVersionId</code> parameter. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public UpdateSecretVersionStageRequest withMoveToVersionId(String moveToVersionId) {
        this.moveToVersionId = moveToVersionId;
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
        if (getVersionStage() != null) sb.append("VersionStage: " + getVersionStage() + ",");
        if (getRemoveFromVersionId() != null) sb.append("RemoveFromVersionId: " + getRemoveFromVersionId() + ",");
        if (getMoveToVersionId() != null) sb.append("MoveToVersionId: " + getMoveToVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getVersionStage() == null) ? 0 : getVersionStage().hashCode());
        hashCode = prime * hashCode + ((getRemoveFromVersionId() == null) ? 0 : getRemoveFromVersionId().hashCode());
        hashCode = prime * hashCode + ((getMoveToVersionId() == null) ? 0 : getMoveToVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSecretVersionStageRequest == false) return false;
        UpdateSecretVersionStageRequest other = (UpdateSecretVersionStageRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getVersionStage() == null ^ this.getVersionStage() == null) return false;
        if (other.getVersionStage() != null && other.getVersionStage().equals(this.getVersionStage()) == false) return false;
        if (other.getRemoveFromVersionId() == null ^ this.getRemoveFromVersionId() == null) return false;
        if (other.getRemoveFromVersionId() != null && other.getRemoveFromVersionId().equals(this.getRemoveFromVersionId()) == false) return false;
        if (other.getMoveToVersionId() == null ^ this.getMoveToVersionId() == null) return false;
        if (other.getMoveToVersionId() != null && other.getMoveToVersionId().equals(this.getMoveToVersionId()) == false) return false;
        return true;
    }
}
