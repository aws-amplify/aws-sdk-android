/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Create a dimension that you can use to limit the scope of a metric used in a
 * security profile for IoT Device Defender. For example, using a
 * <code>TOPIC_FILTER</code> dimension, you can narrow down the scope of the
 * metric only to MQTT topics whose name match the pattern specified in the
 * dimension.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateDimension</a> action.
 * </p>
 */
public class CreateDimensionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     */
    private String type;

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to
     * create a new dimension with the same token as a dimension that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the dimension. Choose something that
     *         describes the type and value to make it easy to remember what it
     *         does.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            A unique identifier for the dimension. Choose something that
     *            describes the type and value to make it easy to remember what
     *            it does.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the dimension. Choose something that describes
     * the type and value to make it easy to remember what it does.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param name <p>
     *            A unique identifier for the dimension. Choose something that
     *            describes the type and value to make it easy to remember what
     *            it does.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @return <p>
     *         Specifies the type of dimension. Supported types:
     *         <code>TOPIC_FILTER.</code>
     *         </p>
     * @see DimensionType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            Specifies the type of dimension. Supported types:
     *            <code>TOPIC_FILTER.</code>
     *            </p>
     * @see DimensionType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            Specifies the type of dimension. Supported types:
     *            <code>TOPIC_FILTER.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionType
     */
    public CreateDimensionRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            Specifies the type of dimension. Supported types:
     *            <code>TOPIC_FILTER.</code>
     *            </p>
     * @see DimensionType
     */
    public void setType(DimensionType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the type of dimension. Supported types:
     * <code>TOPIC_FILTER.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOPIC_FILTER
     *
     * @param type <p>
     *            Specifies the type of dimension. Supported types:
     *            <code>TOPIC_FILTER.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionType
     */
    public CreateDimensionRequest withType(DimensionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     *
     * @return <p>
     *         Specifies the value or list of values for the dimension. For
     *         <code>TOPIC_FILTER</code> dimensions, this is a pattern used to
     *         match the MQTT topic (for example, "admin/#").
     *         </p>
     */
    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
     *            </p>
     */
    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withStringValues(String... stringValues) {
        if (getStringValues() == null) {
            this.stringValues = new java.util.ArrayList<String>(stringValues.length);
        }
        for (String value : stringValues) {
            this.stringValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the value or list of values for the dimension. For
     * <code>TOPIC_FILTER</code> dimensions, this is a pattern used to match the
     * MQTT topic (for example, "admin/#").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValues <p>
     *            Specifies the value or list of values for the dimension. For
     *            <code>TOPIC_FILTER</code> dimensions, this is a pattern used
     *            to match the MQTT topic (for example, "admin/#").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the dimension.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the dimension.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the dimension.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the dimension.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to
     * create a new dimension with the same token as a dimension that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Each dimension must have a unique client request token. If you
     *         try to create a new dimension with the same token as a dimension
     *         that already exists, an exception occurs. If you omit this value,
     *         Amazon Web Services SDKs will automatically generate a unique
     *         client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to
     * create a new dimension with the same token as a dimension that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each dimension must have a unique client request token. If you
     *            try to create a new dimension with the same token as a
     *            dimension that already exists, an exception occurs. If you
     *            omit this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each dimension must have a unique client request token. If you try to
     * create a new dimension with the same token as a dimension that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each dimension must have a unique client request token. If you
     *            try to create a new dimension with the same token as a
     *            dimension that already exists, an exception occurs. If you
     *            omit this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDimensionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getStringValues() != null)
            sb.append("stringValues: " + getStringValues() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDimensionRequest == false)
            return false;
        CreateDimensionRequest other = (CreateDimensionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null
                && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
