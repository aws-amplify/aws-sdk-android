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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The properties of the custom terminology.
 * </p>
 */
public class TerminologyProperties implements Serializable {
    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws((-us-gov)|(-cn))?:translate:[a-zA-Z0-9-]+:[0-9]{12
     * }:terminology/.+?/.+?$<br/>
     */
    private String arn;

    /**
     * <p>
     * The language code for the source text of the translation request for
     * which the custom terminology is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     */
    private String sourceLanguageCode;

    /**
     * <p>
     * The language codes for the target languages available with the custom
     * terminology file. All possible target languages are returned in array.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     */
    private Integer sizeBytes;

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     */
    private Integer termCount;

    /**
     * <p>
     * The time at which the custom terminology was created, based on the
     * timestamp.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the
     * timestamp.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the custom terminology.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @return <p>
     *         The description of the custom terminology properties.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            The description of the custom terminology properties.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom terminology properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            The description of the custom terminology properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws((-us-gov)|(-cn))?:translate:[a-zA-Z0-9-]+:[0-9]{12
     * }:terminology/.+?/.+?$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom terminology.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws((-us-gov)|(-cn))?:translate:[a-zA-Z0-9-]+:[0-9]{12
     * }:terminology/.+?/.+?$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom terminology.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws((-us-gov)|(-cn))?:translate:[a-zA-Z0-9-]+:[0-9]{12
     * }:terminology/.+?/.+?$<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for
     * which the custom terminology is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @return <p>
     *         The language code for the source text of the translation request
     *         for which the custom terminology is being used.
     *         </p>
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for
     * which the custom terminology is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the source text of the translation
     *            request for which the custom terminology is being used.
     *            </p>
     */
    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The language code for the source text of the translation request for
     * which the custom terminology is being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 5<br/>
     *
     * @param sourceLanguageCode <p>
     *            The language code for the source text of the translation
     *            request for which the custom terminology is being used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom
     * terminology file. All possible target languages are returned in array.
     * </p>
     *
     * @return <p>
     *         The language codes for the target languages available with the
     *         custom terminology file. All possible target languages are
     *         returned in array.
     *         </p>
     */
    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom
     * terminology file. All possible target languages are returned in array.
     * </p>
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available with the
     *            custom terminology file. All possible target languages are
     *            returned in array.
     *            </p>
     */
    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom
     * terminology file. All possible target languages are returned in array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available with the
     *            custom terminology file. All possible target languages are
     *            returned in array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withTargetLanguageCodes(String... targetLanguageCodes) {
        if (getTargetLanguageCodes() == null) {
            this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes.length);
        }
        for (String value : targetLanguageCodes) {
            this.targetLanguageCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available with the custom
     * terminology file. All possible target languages are returned in array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLanguageCodes <p>
     *            The language codes for the target languages available with the
     *            custom terminology file. All possible target languages are
     *            returned in array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withTargetLanguageCodes(
            java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     *
     * @return <p>
     *         The encryption key for the custom terminology.
     *         </p>
     */
    public EncryptionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     *
     * @param encryptionKey <p>
     *            The encryption key for the custom terminology.
     *            </p>
     */
    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKey <p>
     *            The encryption key for the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     *
     * @return <p>
     *         The size of the file used when importing a custom terminology.
     *         </p>
     */
    public Integer getSizeBytes() {
        return sizeBytes;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     *
     * @param sizeBytes <p>
     *            The size of the file used when importing a custom terminology.
     *            </p>
     */
    public void setSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * <p>
     * The size of the file used when importing a custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeBytes <p>
     *            The size of the file used when importing a custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     *
     * @return <p>
     *         The number of terms included in the custom terminology.
     *         </p>
     */
    public Integer getTermCount() {
        return termCount;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     *
     * @param termCount <p>
     *            The number of terms included in the custom terminology.
     *            </p>
     */
    public void setTermCount(Integer termCount) {
        this.termCount = termCount;
    }

    /**
     * <p>
     * The number of terms included in the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param termCount <p>
     *            The number of terms included in the custom terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withTermCount(Integer termCount) {
        this.termCount = termCount;
        return this;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the
     * timestamp.
     * </p>
     *
     * @return <p>
     *         The time at which the custom terminology was created, based on
     *         the timestamp.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the
     * timestamp.
     * </p>
     *
     * @param createdAt <p>
     *            The time at which the custom terminology was created, based on
     *            the timestamp.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was created, based on the
     * timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time at which the custom terminology was created, based on
     *            the timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the
     * timestamp.
     * </p>
     *
     * @return <p>
     *         The time at which the custom terminology was last update, based
     *         on the timestamp.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the
     * timestamp.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The time at which the custom terminology was last update,
     *            based on the timestamp.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the custom terminology was last update, based on the
     * timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The time at which the custom terminology was last update,
     *            based on the timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyProperties withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: " + getSourceLanguageCode() + ",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: " + getTargetLanguageCodes() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey() + ",");
        if (getSizeBytes() != null)
            sb.append("SizeBytes: " + getSizeBytes() + ",");
        if (getTermCount() != null)
            sb.append("TermCount: " + getTermCount() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: " + getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getTermCount() == null) ? 0 : getTermCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyProperties == false)
            return false;
        TerminologyProperties other = (TerminologyProperties) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null
                && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null
                && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getSizeBytes() == null ^ this.getSizeBytes() == null)
            return false;
        if (other.getSizeBytes() != null
                && other.getSizeBytes().equals(this.getSizeBytes()) == false)
            return false;
        if (other.getTermCount() == null ^ this.getTermCount() == null)
            return false;
        if (other.getTermCount() != null
                && other.getTermCount().equals(this.getTermCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }
}
