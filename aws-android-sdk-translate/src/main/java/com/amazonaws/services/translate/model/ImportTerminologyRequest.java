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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a custom terminology, depending on whether or not one
 * already exists for the given terminology name. Importing a terminology with
 * the same name as an existing one will merge the terminologies based on the
 * chosen merge strategy. Currently, the only supported merge strategy is
 * OVERWRITE, and so the imported terminology will overwrite an existing
 * terminology of the same name.
 * </p>
 * <p>
 * If you import a terminology that overwrites an existing one, the new
 * terminology take up to 10 minutes to fully propagate and be available for use
 * in a translation due to cache policies with the DataPlane service that
 * performs the translations.
 * </p>
 */
public class ImportTerminologyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     */
    private String mergeStrategy;

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     */
    private String description;

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     */
    private TerminologyData terminologyData;

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the custom terminology being imported.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology being imported.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology being imported.
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
     *            The name of the custom terminology being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     *
     * @return <p>
     *         The merge strategy of the custom terminology being imported.
     *         Currently, only the OVERWRITE merge strategy is supported. In
     *         this case, the imported terminology will overwrite an existing
     *         terminology of the same name.
     *         </p>
     * @see MergeStrategy
     */
    public String getMergeStrategy() {
        return mergeStrategy;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     *
     * @param mergeStrategy <p>
     *            The merge strategy of the custom terminology being imported.
     *            Currently, only the OVERWRITE merge strategy is supported. In
     *            this case, the imported terminology will overwrite an existing
     *            terminology of the same name.
     *            </p>
     * @see MergeStrategy
     */
    public void setMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     *
     * @param mergeStrategy <p>
     *            The merge strategy of the custom terminology being imported.
     *            Currently, only the OVERWRITE merge strategy is supported. In
     *            this case, the imported terminology will overwrite an existing
     *            terminology of the same name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public ImportTerminologyRequest withMergeStrategy(String mergeStrategy) {
        this.mergeStrategy = mergeStrategy;
        return this;
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     *
     * @param mergeStrategy <p>
     *            The merge strategy of the custom terminology being imported.
     *            Currently, only the OVERWRITE merge strategy is supported. In
     *            this case, the imported terminology will overwrite an existing
     *            terminology of the same name.
     *            </p>
     * @see MergeStrategy
     */
    public void setMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
    }

    /**
     * <p>
     * The merge strategy of the custom terminology being imported. Currently,
     * only the OVERWRITE merge strategy is supported. In this case, the
     * imported terminology will overwrite an existing terminology of the same
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERWRITE
     *
     * @param mergeStrategy <p>
     *            The merge strategy of the custom terminology being imported.
     *            Currently, only the OVERWRITE merge strategy is supported. In
     *            this case, the imported terminology will overwrite an existing
     *            terminology of the same name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MergeStrategy
     */
    public ImportTerminologyRequest withMergeStrategy(MergeStrategy mergeStrategy) {
        this.mergeStrategy = mergeStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @return <p>
     *         The description of the custom terminology being imported.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            The description of the custom terminology being imported.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom terminology being imported.
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
     *            The description of the custom terminology being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     *
     * @return <p>
     *         The terminology data for the custom terminology being imported.
     *         </p>
     */
    public TerminologyData getTerminologyData() {
        return terminologyData;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     *
     * @param terminologyData <p>
     *            The terminology data for the custom terminology being
     *            imported.
     *            </p>
     */
    public void setTerminologyData(TerminologyData terminologyData) {
        this.terminologyData = terminologyData;
    }

    /**
     * <p>
     * The terminology data for the custom terminology being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyData <p>
     *            The terminology data for the custom terminology being
     *            imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyRequest withTerminologyData(TerminologyData terminologyData) {
        this.terminologyData = terminologyData;
        return this;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     *
     * @return <p>
     *         The encryption key for the custom terminology being imported.
     *         </p>
     */
    public EncryptionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     *
     * @param encryptionKey <p>
     *            The encryption key for the custom terminology being imported.
     *            </p>
     */
    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key for the custom terminology being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKey <p>
     *            The encryption key for the custom terminology being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyRequest withEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
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
        if (getMergeStrategy() != null)
            sb.append("MergeStrategy: " + getMergeStrategy() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTerminologyData() != null)
            sb.append("TerminologyData: " + getTerminologyData() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getMergeStrategy() == null) ? 0 : getMergeStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTerminologyData() == null) ? 0 : getTerminologyData().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTerminologyRequest == false)
            return false;
        ImportTerminologyRequest other = (ImportTerminologyRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMergeStrategy() == null ^ this.getMergeStrategy() == null)
            return false;
        if (other.getMergeStrategy() != null
                && other.getMergeStrategy().equals(this.getMergeStrategy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTerminologyData() == null ^ this.getTerminologyData() == null)
            return false;
        if (other.getTerminologyData() != null
                && other.getTerminologyData().equals(this.getTerminologyData()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }
}
