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


public class GetSecretValueResult implements Serializable {
    /**
     * <p>The ARN of the secret.</p>
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
     * <p>The unique identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     */
    private String versionId;

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     */
    private java.nio.ByteBuffer secretBinary;

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     */
    private String secretString;

    /**
     * <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     */
    private java.util.List<String> versionStages;

    /**
     * <p>The date and time that this version of the secret was created.</p>
     */
    private java.util.Date createdDate;

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The ARN of the secret.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withARN(String aRN) {
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
    public GetSecretValueResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The unique identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @return <p>The unique identifier of this version of the secret.</p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>The unique identifier of this version of the secret.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique identifier of this version of the secret.</p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>The unique identifier of this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 64<br/>
     *
     * @param versionId <p>The unique identifier of this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @return <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     */
    public java.nio.ByteBuffer getSecretBinary() {
        return secretBinary;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretBinary <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     */
    public void setSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretBinary <p>The decrypted part of the protected secret information that was originally provided as binary data in the form of a byte array. The response parameter represents the binary data as a <a href="https://tools.ietf.org/html/rfc4648#section-4">base64-encoded</a> string.</p> <p>This parameter is not used if the secret is created by the Secrets Manager console.</p> <p>If you store custom information in this field of the secret, then you must code your Lambda rotation function to parse and interpret whatever you store in the <code>SecretString</code> or <code>SecretBinary</code> fields.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withSecretBinary(java.nio.ByteBuffer secretBinary) {
        this.secretBinary = secretBinary;
        return this;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @return <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     */
    public String getSecretString() {
        return secretString;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretString <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     */
    public void setSecretString(String secretString) {
        this.secretString = secretString;
    }

    /**
     * <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 65536<br/>
     *
     * @param secretString <p>The decrypted part of the protected secret information that was originally provided as a string.</p> <p>If you create this secret by using the Secrets Manager console then only the <code>SecretString</code> parameter contains data. Secrets Manager stores the information as a JSON structure of key/value pairs that the Lambda rotation function knows how to parse.</p> <p>If you store custom information in the secret by using the <a>CreateSecret</a>, <a>UpdateSecret</a>, or <a>PutSecretValue</a> API operations instead of the Secrets Manager console, or by using the <b>Other secret type</b> in the console, then you must code your Lambda rotation function to parse and interpret those values.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withSecretString(String secretString) {
        this.secretString = secretString;
        return this;
    }

    /**
     * <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     *
     * @return <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     */
    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     *
     * @param versionStages <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     */
    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withVersionStages(String... versionStages) {
        if (getVersionStages() == null) {
            this.versionStages = new java.util.ArrayList<String>(versionStages.length);
        }
        for (String value : versionStages) {
            this.versionStages.add(value);
        }
        return this;
    }

    /**
     * <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versionStages <p>A list of all of the staging labels currently attached to this version of the secret.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
        return this;
    }

    /**
     * <p>The date and time that this version of the secret was created.</p>
     *
     * @return <p>The date and time that this version of the secret was created.</p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>The date and time that this version of the secret was created.</p>
     *
     * @param createdDate <p>The date and time that this version of the secret was created.</p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>The date and time that this version of the secret was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate <p>The date and time that this version of the secret was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetSecretValueResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
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
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId() + ",");
        if (getSecretBinary() != null) sb.append("SecretBinary: " + getSecretBinary() + ",");
        if (getSecretString() != null) sb.append("SecretString: " + getSecretString() + ",");
        if (getVersionStages() != null) sb.append("VersionStages: " + getVersionStages() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate());
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
        hashCode = prime * hashCode + ((getSecretBinary() == null) ? 0 : getSecretBinary().hashCode());
        hashCode = prime * hashCode + ((getSecretString() == null) ? 0 : getSecretString().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetSecretValueResult == false) return false;
        GetSecretValueResult other = (GetSecretValueResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false;
        if (other.getSecretBinary() == null ^ this.getSecretBinary() == null) return false;
        if (other.getSecretBinary() != null && other.getSecretBinary().equals(this.getSecretBinary()) == false) return false;
        if (other.getSecretString() == null ^ this.getSecretString() == null) return false;
        if (other.getSecretString() != null && other.getSecretString().equals(this.getSecretString()) == false) return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null) return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false) return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false;
        return true;
    }
}
