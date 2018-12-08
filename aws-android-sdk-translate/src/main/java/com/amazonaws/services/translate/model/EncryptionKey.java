/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The encryption key used to encrypt the custom terminologies used by Amazon
 * Translate.
 * </p>
 */
public class EncryptionKey implements Serializable {
    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key being used to
     * encrypt the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     * <b>Pattern:
     * </b>(arn:aws((-us-gov)|(-cn))?:kms:)?([a-z]{2}-[a-z]+-\d:)?(\d
     * {12}:)?(((key/)?[a-zA-Z0-9-_]+)|(alias/[a-zA-Z0-9:/_-]+))<br/>
     */
    private String id;

    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @return <p>
     *         The type of encryption key used by Amazon Translate to encrypt
     *         custom terminologies.
     *         </p>
     * @see EncryptionKeyType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param type <p>
     *            The type of encryption key used by Amazon Translate to encrypt
     *            custom terminologies.
     *            </p>
     * @see EncryptionKeyType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param type <p>
     *            The type of encryption key used by Amazon Translate to encrypt
     *            custom terminologies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionKeyType
     */
    public EncryptionKey withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param type <p>
     *            The type of encryption key used by Amazon Translate to encrypt
     *            custom terminologies.
     *            </p>
     * @see EncryptionKeyType
     */
    public void setType(EncryptionKeyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of encryption key used by Amazon Translate to encrypt custom
     * terminologies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KMS
     *
     * @param type <p>
     *            The type of encryption key used by Amazon Translate to encrypt
     *            custom terminologies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionKeyType
     */
    public EncryptionKey withType(EncryptionKeyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key being used to
     * encrypt the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     * <b>Pattern:
     * </b>(arn:aws((-us-gov)|(-cn))?:kms:)?([a-z]{2}-[a-z]+-\d:)?(\d
     * {12}:)?(((key/)?[a-zA-Z0-9-_]+)|(alias/[a-zA-Z0-9:/_-]+))<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the encryption key being used
     *         to encrypt the custom terminology.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key being used to
     * encrypt the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     * <b>Pattern:
     * </b>(arn:aws((-us-gov)|(-cn))?:kms:)?([a-z]{2}-[a-z]+-\d:)?(\d
     * {12}:)?(((key/)?[a-zA-Z0-9-_]+)|(alias/[a-zA-Z0-9:/_-]+))<br/>
     *
     * @param id <p>
     *            The Amazon Resource Name (ARN) of the encryption key being
     *            used to encrypt the custom terminology.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the encryption key being used to
     * encrypt the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     * <b>Pattern:
     * </b>(arn:aws((-us-gov)|(-cn))?:kms:)?([a-z]{2}-[a-z]+-\d:)?(\d
     * {12}:)?(((key/)?[a-zA-Z0-9-_]+)|(alias/[a-zA-Z0-9:/_-]+))<br/>
     *
     * @param id <p>
     *            The Amazon Resource Name (ARN) of the encryption key being
     *            used to encrypt the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncryptionKey withId(String id) {
        this.id = id;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionKey == false)
            return false;
        EncryptionKey other = (EncryptionKey) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
