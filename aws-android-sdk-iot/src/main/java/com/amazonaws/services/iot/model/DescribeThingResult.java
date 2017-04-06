/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The attributes, which are name/value pairs in JSON format (for example:
     * {\"attributes\":{\"some-name1\":\"some-value1\"},
     * {\"some-name2\":\"some-value2\"}, {\"some-name3\":\"some-value3\"}})
     * </p>
     */
    private java.util.Map<String, String> attributes;

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
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
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
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
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
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
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
     * The attributes, which are name/value pairs in JSON format (for example:
     * {\"attributes\":{\"some-name1\":\"some-value1\"},
     * {\"some-name2\":\"some-value2\"}, {\"some-name3\":\"some-value3\"}})
     * </p>
     *
     * @return <p>
     *         The attributes, which are name/value pairs in JSON format (for
     *         example: {\"attributes\":{\"some-name1\":\"some-value1\"},
     *         {\"some-name2\":\"some-value2\"},
     *         {\"some-name3\":\"some-value3\"}})
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The attributes, which are name/value pairs in JSON format (for example:
     * {\"attributes\":{\"some-name1\":\"some-value1\"},
     * {\"some-name2\":\"some-value2\"}, {\"some-name3\":\"some-value3\"}})
     * </p>
     *
     * @param attributes <p>
     *            The attributes, which are name/value pairs in JSON format (for
     *            example: {\"attributes\":{\"some-name1\":\"some-value1\"},
     *            {\"some-name2\":\"some-value2\"},
     *            {\"some-name3\":\"some-value3\"}})
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The attributes, which are name/value pairs in JSON format (for example:
     * {\"attributes\":{\"some-name1\":\"some-value1\"},
     * {\"some-name2\":\"some-value2\"}, {\"some-name3\":\"some-value3\"}})
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The attributes, which are name/value pairs in JSON format (for
     *            example: {\"attributes\":{\"some-name1\":\"some-value1\"},
     *            {\"some-name2\":\"some-value2\"},
     *            {\"some-name3\":\"some-value3\"}})
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
     * The attributes, which are name/value pairs in JSON format (for example:
     * {\"attributes\":{\"some-name1\":\"some-value1\"},
     * {\"some-name2\":\"some-value2\"}, {\"some-name3\":\"some-value3\"}})
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
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
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
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
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
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
