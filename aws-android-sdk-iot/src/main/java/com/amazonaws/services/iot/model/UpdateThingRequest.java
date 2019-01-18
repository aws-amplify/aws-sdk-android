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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the data for a thing.
 * </p>
 */
public class UpdateThingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs.
     * For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     */
    private AttributePayload attributePayload;

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version
     * of the record in the registry does not match the expected version
     * specified in the request, the <code>UpdateThing</code> request is
     * rejected with a <code>VersionConflictException</code>.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is
     * removed.
     * </p>
     */
    private Boolean removeThingType;

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing to update.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing to update.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing type.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The name of the thing type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs.
     * For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     *
     * @return <p>
     *         A list of thing attributes, a JSON string containing name-value
     *         pairs. For example:
     *         </p>
     *         <p>
     *         <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *         </p>
     *         <p>
     *         This data is used to add new attributes or update existing
     *         attributes.
     *         </p>
     */
    public AttributePayload getAttributePayload() {
        return attributePayload;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs.
     * For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     *
     * @param attributePayload <p>
     *            A list of thing attributes, a JSON string containing
     *            name-value pairs. For example:
     *            </p>
     *            <p>
     *            <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *            </p>
     *            <p>
     *            This data is used to add new attributes or update existing
     *            attributes.
     *            </p>
     */
    public void setAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
    }

    /**
     * <p>
     * A list of thing attributes, a JSON string containing name-value pairs.
     * For example:
     * </p>
     * <p>
     * <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     * </p>
     * <p>
     * This data is used to add new attributes or update existing attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributePayload <p>
     *            A list of thing attributes, a JSON string containing
     *            name-value pairs. For example:
     *            </p>
     *            <p>
     *            <code>{\"attributes\":{\"name1\":\"value2\"}}</code>
     *            </p>
     *            <p>
     *            This data is used to add new attributes or update existing
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withAttributePayload(AttributePayload attributePayload) {
        this.attributePayload = attributePayload;
        return this;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version
     * of the record in the registry does not match the expected version
     * specified in the request, the <code>UpdateThing</code> request is
     * rejected with a <code>VersionConflictException</code>.
     * </p>
     *
     * @return <p>
     *         The expected version of the thing record in the registry. If the
     *         version of the record in the registry does not match the expected
     *         version specified in the request, the <code>UpdateThing</code>
     *         request is rejected with a <code>VersionConflictException</code>.
     *         </p>
     */
    public Long getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version
     * of the record in the registry does not match the expected version
     * specified in the request, the <code>UpdateThing</code> request is
     * rejected with a <code>VersionConflictException</code>.
     * </p>
     *
     * @param expectedVersion <p>
     *            The expected version of the thing record in the registry. If
     *            the version of the record in the registry does not match the
     *            expected version specified in the request, the
     *            <code>UpdateThing</code> request is rejected with a
     *            <code>VersionConflictException</code>.
     *            </p>
     */
    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the thing record in the registry. If the version
     * of the record in the registry does not match the expected version
     * specified in the request, the <code>UpdateThing</code> request is
     * rejected with a <code>VersionConflictException</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedVersion <p>
     *            The expected version of the thing record in the registry. If
     *            the version of the record in the registry does not match the
     *            expected version specified in the request, the
     *            <code>UpdateThing</code> request is rejected with a
     *            <code>VersionConflictException</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is
     * removed.
     * </p>
     *
     * @return <p>
     *         Remove a thing type association. If <b>true</b>, the association
     *         is removed.
     *         </p>
     */
    public Boolean isRemoveThingType() {
        return removeThingType;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is
     * removed.
     * </p>
     *
     * @return <p>
     *         Remove a thing type association. If <b>true</b>, the association
     *         is removed.
     *         </p>
     */
    public Boolean getRemoveThingType() {
        return removeThingType;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is
     * removed.
     * </p>
     *
     * @param removeThingType <p>
     *            Remove a thing type association. If <b>true</b>, the
     *            association is removed.
     *            </p>
     */
    public void setRemoveThingType(Boolean removeThingType) {
        this.removeThingType = removeThingType;
    }

    /**
     * <p>
     * Remove a thing type association. If <b>true</b>, the association is
     * removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeThingType <p>
     *            Remove a thing type association. If <b>true</b>, the
     *            association is removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateThingRequest withRemoveThingType(Boolean removeThingType) {
        this.removeThingType = removeThingType;
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
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getAttributePayload() != null)
            sb.append("attributePayload: " + getAttributePayload() + ",");
        if (getExpectedVersion() != null)
            sb.append("expectedVersion: " + getExpectedVersion() + ",");
        if (getRemoveThingType() != null)
            sb.append("removeThingType: " + getRemoveThingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributePayload() == null) ? 0 : getAttributePayload().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveThingType() == null) ? 0 : getRemoveThingType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingRequest == false)
            return false;
        UpdateThingRequest other = (UpdateThingRequest) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getAttributePayload() == null ^ this.getAttributePayload() == null)
            return false;
        if (other.getAttributePayload() != null
                && other.getAttributePayload().equals(this.getAttributePayload()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null
                && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        if (other.getRemoveThingType() == null ^ this.getRemoveThingType() == null)
            return false;
        if (other.getRemoveThingType() != null
                && other.getRemoveThingType().equals(this.getRemoveThingType()) == false)
            return false;
        return true;
    }
}
