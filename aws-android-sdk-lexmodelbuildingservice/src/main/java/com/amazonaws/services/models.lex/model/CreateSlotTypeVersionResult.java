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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class CreateSlotTypeVersionResult implements Serializable {
    /**
     * <p>
     * The name of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take.
     * </p>
     */
    private java.util.List<EnumerationValue> enumerationValues;

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the
     * creation date and last update date are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The version assigned to the new slot type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     */
    private String valueSelectionStrategy;

    /**
     * <p>
     * The built-in slot type used a the parent of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     */
    private String parentSlotTypeSignature;

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     */
    private java.util.List<SlotTypeConfiguration> slotTypeConfigurations;

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the slot type.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return <p>
     *         A description of the slot type.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot type.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description <p>
     *            A description of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take.
     * </p>
     *
     * @return <p>
     *         A list of <code>EnumerationValue</code> objects that defines the
     *         values that the slot type can take.
     *         </p>
     */
    public java.util.List<EnumerationValue> getEnumerationValues() {
        return enumerationValues;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take.
     * </p>
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take.
     *            </p>
     */
    public void setEnumerationValues(java.util.Collection<EnumerationValue> enumerationValues) {
        if (enumerationValues == null) {
            this.enumerationValues = null;
            return;
        }

        this.enumerationValues = new java.util.ArrayList<EnumerationValue>(enumerationValues);
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withEnumerationValues(EnumerationValue... enumerationValues) {
        if (getEnumerationValues() == null) {
            this.enumerationValues = new java.util.ArrayList<EnumerationValue>(
                    enumerationValues.length);
        }
        for (EnumerationValue value : enumerationValues) {
            this.enumerationValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnumerationValue</code> objects that defines the values
     * that the slot type can take.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enumerationValues <p>
     *            A list of <code>EnumerationValue</code> objects that defines
     *            the values that the slot type can take.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withEnumerationValues(
            java.util.Collection<EnumerationValue> enumerationValues) {
        setEnumerationValues(enumerationValues);
        return this;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the
     * creation date and last update date are the same.
     * </p>
     *
     * @return <p>
     *         The date that the slot type was updated. When you create a
     *         resource, the creation date and last update date are the same.
     *         </p>
     */
    public java.util.Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the
     * creation date and last update date are the same.
     * </p>
     *
     * @param lastUpdatedDate <p>
     *            The date that the slot type was updated. When you create a
     *            resource, the creation date and last update date are the same.
     *            </p>
     */
    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the slot type was updated. When you create a resource, the
     * creation date and last update date are the same.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDate <p>
     *            The date that the slot type was updated. When you create a
     *            resource, the creation date and last update date are the same.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     *
     * @return <p>
     *         The date that the slot type was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date that the slot type was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the slot type was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date that the slot type was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The version assigned to the new slot type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @return <p>
     *         The version assigned to the new slot type version.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version assigned to the new slot type version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param version <p>
     *            The version assigned to the new slot type version.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version assigned to the new slot type version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>\$LATEST|[0-9]+<br/>
     *
     * @param version <p>
     *            The version assigned to the new slot type version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     *
     * @return <p>
     *         Checksum of the <code>$LATEST</code> version of the slot type.
     *         </p>
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     *
     * @param checksum <p>
     *            Checksum of the <code>$LATEST</code> version of the slot type.
     *            </p>
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the <code>$LATEST</code> version of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checksum <p>
     *            Checksum of the <code>$LATEST</code> version of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @return <p>
     *         The strategy that Amazon Lex uses to determine the value of the
     *         slot. For more information, see <a>PutSlotType</a>.
     *         </p>
     * @see SlotValueSelectionStrategy
     */
    public String getValueSelectionStrategy() {
        return valueSelectionStrategy;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            The strategy that Amazon Lex uses to determine the value of
     *            the slot. For more information, see <a>PutSlotType</a>.
     *            </p>
     * @see SlotValueSelectionStrategy
     */
    public void setValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            The strategy that Amazon Lex uses to determine the value of
     *            the slot. For more information, see <a>PutSlotType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotValueSelectionStrategy
     */
    public CreateSlotTypeVersionResult withValueSelectionStrategy(String valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy;
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            The strategy that Amazon Lex uses to determine the value of
     *            the slot. For more information, see <a>PutSlotType</a>.
     *            </p>
     * @see SlotValueSelectionStrategy
     */
    public void setValueSelectionStrategy(SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to determine the value of the slot. For
     * more information, see <a>PutSlotType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL_VALUE, TOP_RESOLUTION
     *
     * @param valueSelectionStrategy <p>
     *            The strategy that Amazon Lex uses to determine the value of
     *            the slot. For more information, see <a>PutSlotType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlotValueSelectionStrategy
     */
    public CreateSlotTypeVersionResult withValueSelectionStrategy(
            SlotValueSelectionStrategy valueSelectionStrategy) {
        this.valueSelectionStrategy = valueSelectionStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The built-in slot type used a the parent of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @return <p>
     *         The built-in slot type used a the parent of the slot type.
     *         </p>
     */
    public String getParentSlotTypeSignature() {
        return parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used a the parent of the slot type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param parentSlotTypeSignature <p>
     *            The built-in slot type used a the parent of the slot type.
     *            </p>
     */
    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used a the parent of the slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^((AMAZON\.)_?|[A-Za-z]_?)+<br/>
     *
     * @param parentSlotTypeSignature <p>
     *            The built-in slot type used a the parent of the slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     *
     * @return <p>
     *         Configuration information that extends the parent built-in slot
     *         type.
     *         </p>
     */
    public java.util.List<SlotTypeConfiguration> getSlotTypeConfigurations() {
        return slotTypeConfigurations;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type.
     *            </p>
     */
    public void setSlotTypeConfigurations(
            java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        if (slotTypeConfigurations == null) {
            this.slotTypeConfigurations = null;
            return;
        }

        this.slotTypeConfigurations = new java.util.ArrayList<SlotTypeConfiguration>(
                slotTypeConfigurations);
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withSlotTypeConfigurations(
            SlotTypeConfiguration... slotTypeConfigurations) {
        if (getSlotTypeConfigurations() == null) {
            this.slotTypeConfigurations = new java.util.ArrayList<SlotTypeConfiguration>(
                    slotTypeConfigurations.length);
        }
        for (SlotTypeConfiguration value : slotTypeConfigurations) {
            this.slotTypeConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information that extends the parent built-in slot type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypeConfigurations <p>
     *            Configuration information that extends the parent built-in
     *            slot type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSlotTypeVersionResult withSlotTypeConfigurations(
            java.util.Collection<SlotTypeConfiguration> slotTypeConfigurations) {
        setSlotTypeConfigurations(slotTypeConfigurations);
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
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getEnumerationValues() != null)
            sb.append("enumerationValues: " + getEnumerationValues() + ",");
        if (getLastUpdatedDate() != null)
            sb.append("lastUpdatedDate: " + getLastUpdatedDate() + ",");
        if (getCreatedDate() != null)
            sb.append("createdDate: " + getCreatedDate() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getChecksum() != null)
            sb.append("checksum: " + getChecksum() + ",");
        if (getValueSelectionStrategy() != null)
            sb.append("valueSelectionStrategy: " + getValueSelectionStrategy() + ",");
        if (getParentSlotTypeSignature() != null)
            sb.append("parentSlotTypeSignature: " + getParentSlotTypeSignature() + ",");
        if (getSlotTypeConfigurations() != null)
            sb.append("slotTypeConfigurations: " + getSlotTypeConfigurations());
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
        hashCode = prime * hashCode
                + ((getEnumerationValues() == null) ? 0 : getEnumerationValues().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime
                * hashCode
                + ((getValueSelectionStrategy() == null) ? 0 : getValueSelectionStrategy()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getParentSlotTypeSignature() == null) ? 0 : getParentSlotTypeSignature()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSlotTypeConfigurations() == null) ? 0 : getSlotTypeConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSlotTypeVersionResult == false)
            return false;
        CreateSlotTypeVersionResult other = (CreateSlotTypeVersionResult) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnumerationValues() == null ^ this.getEnumerationValues() == null)
            return false;
        if (other.getEnumerationValues() != null
                && other.getEnumerationValues().equals(this.getEnumerationValues()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null
                && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getValueSelectionStrategy() == null ^ this.getValueSelectionStrategy() == null)
            return false;
        if (other.getValueSelectionStrategy() != null
                && other.getValueSelectionStrategy().equals(this.getValueSelectionStrategy()) == false)
            return false;
        if (other.getParentSlotTypeSignature() == null ^ this.getParentSlotTypeSignature() == null)
            return false;
        if (other.getParentSlotTypeSignature() != null
                && other.getParentSlotTypeSignature().equals(this.getParentSlotTypeSignature()) == false)
            return false;
        if (other.getSlotTypeConfigurations() == null ^ this.getSlotTypeConfigurations() == null)
            return false;
        if (other.getSlotTypeConfigurations() != null
                && other.getSlotTypeConfigurations().equals(this.getSlotTypeConfigurations()) == false)
            return false;
        return true;
    }
}
