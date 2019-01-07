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

/**
 * <p>
 * The output from the DescribeThing operation.
 * </p>
 */
public class DescribeThingResult implements Serializable {
    /**
     * <p>
     * The default client ID.
     * </p>
     */
    private String defaultClientId;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     */
    private String thingId;

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     */
    private String thingArn;

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingTypeName;

    /**
     * <p>
     * The thing attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you
     * can pass the version information in the <code>expectedVersion</code>
     * parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     * calls.
     * </p>
     * </note>
     */
    private Long version;

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String billingGroupName;

    /**
     * <p>
     * The default client ID.
     * </p>
     *
     * @return <p>
     *         The default client ID.
     *         </p>
     */
    public String getDefaultClientId() {
        return defaultClientId;
    }

    /**
     * <p>
     * The default client ID.
     * </p>
     *
     * @param defaultClientId <p>
     *            The default client ID.
     *            </p>
     */
    public void setDefaultClientId(String defaultClientId) {
        this.defaultClientId = defaultClientId;
    }

    /**
     * <p>
     * The default client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultClientId <p>
     *            The default client ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withDefaultClientId(String defaultClientId) {
        this.defaultClientId = defaultClientId;
        return this;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
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
     *            The name of the thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     *
     * @return <p>
     *         The ID of the thing to describe.
     *         </p>
     */
    public String getThingId() {
        return thingId;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     *
     * @param thingId <p>
     *            The ID of the thing to describe.
     *            </p>
     */
    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    /**
     * <p>
     * The ID of the thing to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingId <p>
     *            The ID of the thing to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withThingId(String thingId) {
        this.thingId = thingId;
        return this;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     *
     * @return <p>
     *         The ARN of the thing to describe.
     *         </p>
     */
    public String getThingArn() {
        return thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     *
     * @param thingArn <p>
     *            The ARN of the thing to describe.
     *            </p>
     */
    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thingArn <p>
     *            The ARN of the thing to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withThingArn(String thingArn) {
        this.thingArn = thingArn;
        return this;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The thing type name.
     *         </p>
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingTypeName <p>
     *            The thing type name.
     *            </p>
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The thing type name.
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
     *            The thing type name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     *
     * @return <p>
     *         The thing attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     *
     * @param attributes <p>
     *            The thing attributes.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The thing attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The thing attributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into attributes.
     * @param value The corresponding value of the entry to be added into
     *            attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult addattributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeThingResult clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you
     * can pass the version information in the <code>expectedVersion</code>
     * parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     * calls.
     * </p>
     * </note>
     *
     * @return <p>
     *         The current version of the thing record in the registry.
     *         </p>
     *         <note>
     *         <p>
     *         To avoid unintentional changes to the information in the
     *         registry, you can pass the version information in the
     *         <code>expectedVersion</code> parameter of the
     *         <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     *         </p>
     *         </note>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you
     * can pass the version information in the <code>expectedVersion</code>
     * parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     * calls.
     * </p>
     * </note>
     *
     * @param version <p>
     *            The current version of the thing record in the registry.
     *            </p>
     *            <note>
     *            <p>
     *            To avoid unintentional changes to the information in the
     *            registry, you can pass the version information in the
     *            <code>expectedVersion</code> parameter of the
     *            <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     *            </p>
     *            </note>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the thing record in the registry.
     * </p>
     * <note>
     * <p>
     * To avoid unintentional changes to the information in the registry, you
     * can pass the version information in the <code>expectedVersion</code>
     * parameter of the <code>UpdateThing</code> and <code>DeleteThing</code>
     * calls.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The current version of the thing record in the registry.
     *            </p>
     *            <note>
     *            <p>
     *            To avoid unintentional changes to the information in the
     *            registry, you can pass the version information in the
     *            <code>expectedVersion</code> parameter of the
     *            <code>UpdateThing</code> and <code>DeleteThing</code> calls.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the billing group the thing belongs to.
     *         </p>
     */
    public String getBillingGroupName() {
        return billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name of the billing group the thing belongs to.
     *            </p>
     */
    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group the thing belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name of the billing group the thing belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeThingResult withBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
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
        if (getDefaultClientId() != null)
            sb.append("defaultClientId: " + getDefaultClientId() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getThingId() != null)
            sb.append("thingId: " + getThingId() + ",");
        if (getThingArn() != null)
            sb.append("thingArn: " + getThingArn() + ",");
        if (getThingTypeName() != null)
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getBillingGroupName() != null)
            sb.append("billingGroupName: " + getBillingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultClientId() == null) ? 0 : getDefaultClientId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getThingId() == null) ? 0 : getThingId().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode
                + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingResult == false)
            return false;
        DescribeThingResult other = (DescribeThingResult) obj;

        if (other.getDefaultClientId() == null ^ this.getDefaultClientId() == null)
            return false;
        if (other.getDefaultClientId() != null
                && other.getDefaultClientId().equals(this.getDefaultClientId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getThingId() == null ^ this.getThingId() == null)
            return false;
        if (other.getThingId() != null && other.getThingId().equals(this.getThingId()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null
                && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null
                && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        return true;
    }
}
