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
 * <p>Retrieves the contents of the encrypted fields <code>SecretString</code> or <code>SecretBinary</code> from the specified version of a secret, whichever contains content.</p> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:GetSecretValue</p> </li> <li> <p>kms:Decrypt - required only if you use a customer-managed AWS KMS key to encrypt the secret. You do not need this permission to use the account's default AWS managed CMK for Secrets Manager.</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To create a new version of the secret with different encrypted information, use <a>PutSecretValue</a>.</p> </li> <li> <p>To retrieve the non-encrypted details for the secret, use <a>DescribeSecret</a>.</p> </li> </ul>
 */
public class GetSecretValueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String versionId;

    /**
     * <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String versionStage;

    /**
     * <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p> <p>This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal digits.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     */
    public String getVersionStage() {
        return versionStage;
    }

    /**
     * <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param versionStage <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     */
    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param versionStage <p>Specifies the secret version that you want to retrieve by the staging label attached to the version.</p> <p>Staging labels are used to keep track of different versions during the rotation process. If you use this parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueRequest withVersionStage(String versionStage) {
        this.versionStage = versionStage;
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
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId() + ",");
        if (getVersionStage() != null) sb.append("VersionStage: " + getVersionStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStage() == null) ? 0 : getVersionStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetSecretValueRequest == false) return false;
        GetSecretValueRequest other = (GetSecretValueRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false;
        if (other.getVersionStage() == null ^ this.getVersionStage() == null) return false;
        if (other.getVersionStage() != null && other.getVersionStage().equals(this.getVersionStage()) == false) return false;
        return true;
    }
}
