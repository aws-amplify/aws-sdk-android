/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class DescribeKeyResult implements Serializable {
    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String key;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     */
    private String keyArn;

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String keyName;

    /**
     * <p>
     * API Restrictions on the allowed actions, resources, and referers for an
     * API key resource.
     * </p>
     */
    private ApiKeyRestrictions restrictions;

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date expireTime;

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The key value/string of an API key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The key value/string of an API key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key value/string of an API key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param key <p>
     *            The key value/string of an API key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the API key resource. Used
     *         when you need to specify a resource across all Amazon Web
     *         Services.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyArn() {
        return keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param keyArn <p>
     *            The Amazon Resource Name (ARN) for the API key resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the API key resource. Used when you
     * need to specify a resource across all Amazon Web Services.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-9
     * ]+)*)?){2}:([^/].*)?<br/>
     *
     * @param keyArn <p>
     *            The Amazon Resource Name (ARN) for the API key resource. Used
     *            when you need to specify a resource across all Amazon Web
     *            Services.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:key/ExampleKey</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withKeyArn(String keyArn) {
        this.keyArn = keyArn;
        return this;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         The name of the API key resource.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            The name of the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * API Restrictions on the allowed actions, resources, and referers for an
     * API key resource.
     * </p>
     *
     * @return <p>
     *         API Restrictions on the allowed actions, resources, and referers
     *         for an API key resource.
     *         </p>
     */
    public ApiKeyRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * API Restrictions on the allowed actions, resources, and referers for an
     * API key resource.
     * </p>
     *
     * @param restrictions <p>
     *            API Restrictions on the allowed actions, resources, and
     *            referers for an API key resource.
     *            </p>
     */
    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * API Restrictions on the allowed actions, resources, and referers for an
     * API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictions <p>
     *            API Restrictions on the allowed actions, resources, and
     *            referers for an API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the API key resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param createTime <p>
     *            The timestamp for when the API key resource was created in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The timestamp for when the API key resource was created in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the API key resource will expire in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getExpireTime() {
        return expireTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param expireTime <p>
     *            The timestamp for when the API key resource will expire in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expireTime <p>
     *            The timestamp for when the API key resource will expire in <a
     *            href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *            ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the API key resource was last updated in
     *         <a href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     *
     * @param updateTime <p>
     *            The timestamp for when the API key resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the API key resource was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The timestamp for when the API key resource was last updated
     *            in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         The optional description for the API key resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the API key resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            The optional description for the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     *
     * @return <p>
     *         Tags associated with the API key resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with the API key resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Tags associated with the API key resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeKeyResult clearTagsEntries() {
        this.tags = null;
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getKeyArn() != null)
            sb.append("KeyArn: " + getKeyArn() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: " + getExpireTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyResult == false)
            return false;
        DescribeKeyResult other = (DescribeKeyResult) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null
                && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
