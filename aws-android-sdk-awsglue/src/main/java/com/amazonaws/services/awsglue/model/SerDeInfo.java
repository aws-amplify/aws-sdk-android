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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a serialization/deserialization program (SerDe) that serves
 * as an extractor and loader.
 * </p>
 */
public class SerDeInfo implements Serializable {
    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String serializationLibrary;

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the SerDe.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the SerDe.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the SerDe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SerDeInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Usually the class that implements the SerDe. An example is
     *         <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>
     *         .
     *         </p>
     */
    public String getSerializationLibrary() {
        return serializationLibrary;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param serializationLibrary <p>
     *            Usually the class that implements the SerDe. An example is
     *            <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>
     *            .
     *            </p>
     */
    public void setSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param serializationLibrary <p>
     *            Usually the class that implements the SerDe. An example is
     *            <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SerDeInfo withSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     *
     * @return <p>
     *         These key-value pairs define initialization parameters for the
     *         SerDe.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     *
     * @param parameters <p>
     *            These key-value pairs define initialization parameters for the
     *            SerDe.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            These key-value pairs define initialization parameters for the
     *            SerDe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SerDeInfo withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SerDeInfo addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SerDeInfo clearParametersEntries() {
        this.parameters = null;
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
        if (getSerializationLibrary() != null)
            sb.append("SerializationLibrary: " + getSerializationLibrary() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSerializationLibrary() == null) ? 0 : getSerializationLibrary().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SerDeInfo == false)
            return false;
        SerDeInfo other = (SerDeInfo) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSerializationLibrary() == null ^ this.getSerializationLibrary() == null)
            return false;
        if (other.getSerializationLibrary() != null
                && other.getSerializationLibrary().equals(this.getSerializationLibrary()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
