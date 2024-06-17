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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an API key resource in your Amazon Web Services account, which lets
 * you grant actions for Amazon Location resources to the API key bearer.
 * </p>
 * <note>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html"
 * >Using API keys</a>.
 * </p>
 * </note>
 */
public class CreateKeyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     */
    private String keyName;

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     */
    private ApiKeyRestrictions restrictions;

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     */
    private String description;

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     * <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     */
    private java.util.Date expireTime;

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API
     * key. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     */
    private Boolean noExpiry;

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair
     * that helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @return <p>
     *         A custom name for the API key resource.
     *         </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *         (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique API key name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            A custom name for the API key resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique API key name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A custom name for the API key resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-),
     * periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique API key name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleAPIKey</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[-._\w]+<br/>
     *
     * @param keyName <p>
     *            A custom name for the API key resource.
     *            </p>
     *            <p>
     *            Requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens
     *            (-), periods (.), and underscores (_).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be a unique API key name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            No spaces allowed. For example, <code>ExampleAPIKey</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     *
     * @return <p>
     *         The API key restrictions for the API key resource.
     *         </p>
     */
    public ApiKeyRestrictions getRestrictions() {
        return restrictions;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     *
     * @param restrictions <p>
     *            The API key restrictions for the API key resource.
     *            </p>
     */
    public void setRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * The API key restrictions for the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restrictions <p>
     *            The API key restrictions for the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withRestrictions(ApiKeyRestrictions restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @return <p>
     *         An optional description for the API key resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the API key resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the API key resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1000<br/>
     *
     * @param description <p>
     *            An optional description for the API key resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     * <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     *
     * @return <p>
     *         The optional timestamp for when the API key resource will expire
     *         in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One
     *         of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     *         </p>
     */
    public java.util.Date getExpireTime() {
        return expireTime;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     * <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     *
     * @param expireTime <p>
     *            The optional timestamp for when the API key resource will
     *            expire in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     *            <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     *            </p>
     */
    public void setExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * <p>
     * The optional timestamp for when the API key resource will expire in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     * <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expireTime <p>
     *            The optional timestamp for when the API key resource will
     *            expire in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. One of
     *            <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withExpireTime(java.util.Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API
     * key. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     *
     * @return <p>
     *         Optionally set to <code>true</code> to set no expiration time for
     *         the API key. One of <code>NoExpiry</code> or
     *         <code>ExpireTime</code> must be set.
     *         </p>
     */
    public Boolean isNoExpiry() {
        return noExpiry;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API
     * key. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     *
     * @return <p>
     *         Optionally set to <code>true</code> to set no expiration time for
     *         the API key. One of <code>NoExpiry</code> or
     *         <code>ExpireTime</code> must be set.
     *         </p>
     */
    public Boolean getNoExpiry() {
        return noExpiry;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API
     * key. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     *
     * @param noExpiry <p>
     *            Optionally set to <code>true</code> to set no expiration time
     *            for the API key. One of <code>NoExpiry</code> or
     *            <code>ExpireTime</code> must be set.
     *            </p>
     */
    public void setNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
    }

    /**
     * <p>
     * Optionally set to <code>true</code> to set no expiration time for the API
     * key. One of <code>NoExpiry</code> or <code>ExpireTime</code> must be set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noExpiry <p>
     *            Optionally set to <code>true</code> to set no expiration time
     *            for the API key. One of <code>NoExpiry</code> or
     *            <code>ExpireTime</code> must be set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withNoExpiry(Boolean noExpiry) {
        this.noExpiry = noExpiry;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair
     * that helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Applies one or more tags to the map resource. A tag is a
     *         key-value pair that helps manage, identify, search, and filter
     *         your resources by labelling them.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *         following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot use "aws:" as a prefix for a key.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair
     * that helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            Applies one or more tags to the map resource. A tag is a
     *            key-value pair that helps manage, identify, search, and filter
     *            your resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair
     * that helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Applies one or more tags to the map resource. A tag is a
     *            key-value pair that helps manage, identify, search, and filter
     *            your resources by labelling them.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each resource tag must be unique with a maximum of one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the map resource. A tag is a key-value pair
     * that helps manage, identify, search, and filter your resources by
     * labelling them.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateKeyRequest addTagsEntry(String key, String value) {
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
    public CreateKeyRequest clearTagsEntries() {
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
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getExpireTime() != null)
            sb.append("ExpireTime: " + getExpireTime() + ",");
        if (getNoExpiry() != null)
            sb.append("NoExpiry: " + getNoExpiry() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        hashCode = prime * hashCode + ((getNoExpiry() == null) ? 0 : getNoExpiry().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeyRequest == false)
            return false;
        CreateKeyRequest other = (CreateKeyRequest) obj;

        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpireTime() == null ^ this.getExpireTime() == null)
            return false;
        if (other.getExpireTime() != null
                && other.getExpireTime().equals(this.getExpireTime()) == false)
            return false;
        if (other.getNoExpiry() == null ^ this.getNoExpiry() == null)
            return false;
        if (other.getNoExpiry() != null && other.getNoExpiry().equals(this.getNoExpiry()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
