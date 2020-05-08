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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information for tensor collections.
 * </p>
 */
public class CollectionConfiguration implements Serializable {
    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to
     * other rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String collectionName;

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are
     * <code>"name"</code>, <code>"include_regex"</code>,
     * <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     */
    private java.util.Map<String, String> collectionParameters;

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to
     * other rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the tensor collection. The name must be unique
     *         relative to other rule configuration names.
     *         </p>
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to
     * other rule configuration names.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param collectionName <p>
     *            The name of the tensor collection. The name must be unique
     *            relative to other rule configuration names.
     *            </p>
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the tensor collection. The name must be unique relative to
     * other rule configuration names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param collectionName <p>
     *            The name of the tensor collection. The name must be unique
     *            relative to other rule configuration names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CollectionConfiguration withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are
     * <code>"name"</code>, <code>"include_regex"</code>,
     * <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     *
     * @return <p>
     *         Parameter values for the tensor collection. The allowed
     *         parameters are <code>"name"</code>, <code>"include_regex"</code>,
     *         <code>"reduction_config"</code>, <code>"save_config"</code>,
     *         <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     *         </p>
     */
    public java.util.Map<String, String> getCollectionParameters() {
        return collectionParameters;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are
     * <code>"name"</code>, <code>"include_regex"</code>,
     * <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     *
     * @param collectionParameters <p>
     *            Parameter values for the tensor collection. The allowed
     *            parameters are <code>"name"</code>,
     *            <code>"include_regex"</code>, <code>"reduction_config"</code>,
     *            <code>"save_config"</code>, <code>"tensor_names"</code>, and
     *            <code>"save_histogram"</code>.
     *            </p>
     */
    public void setCollectionParameters(java.util.Map<String, String> collectionParameters) {
        this.collectionParameters = collectionParameters;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are
     * <code>"name"</code>, <code>"include_regex"</code>,
     * <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param collectionParameters <p>
     *            Parameter values for the tensor collection. The allowed
     *            parameters are <code>"name"</code>,
     *            <code>"include_regex"</code>, <code>"reduction_config"</code>,
     *            <code>"save_config"</code>, <code>"tensor_names"</code>, and
     *            <code>"save_histogram"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CollectionConfiguration withCollectionParameters(
            java.util.Map<String, String> collectionParameters) {
        this.collectionParameters = collectionParameters;
        return this;
    }

    /**
     * <p>
     * Parameter values for the tensor collection. The allowed parameters are
     * <code>"name"</code>, <code>"include_regex"</code>,
     * <code>"reduction_config"</code>, <code>"save_config"</code>,
     * <code>"tensor_names"</code>, and <code>"save_histogram"</code>.
     * </p>
     * <p>
     * The method adds a new key-value pair into CollectionParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into CollectionParameters.
     * @param value The corresponding value of the entry to be added into
     *            CollectionParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CollectionConfiguration addCollectionParametersEntry(String key, String value) {
        if (null == this.collectionParameters) {
            this.collectionParameters = new java.util.HashMap<String, String>();
        }
        if (this.collectionParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.collectionParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CollectionParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CollectionConfiguration clearCollectionParametersEntries() {
        this.collectionParameters = null;
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
        if (getCollectionName() != null)
            sb.append("CollectionName: " + getCollectionName() + ",");
        if (getCollectionParameters() != null)
            sb.append("CollectionParameters: " + getCollectionParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode
                + ((getCollectionParameters() == null) ? 0 : getCollectionParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollectionConfiguration == false)
            return false;
        CollectionConfiguration other = (CollectionConfiguration) obj;

        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null
                && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCollectionParameters() == null ^ this.getCollectionParameters() == null)
            return false;
        if (other.getCollectionParameters() != null
                && other.getCollectionParameters().equals(this.getCollectionParameters()) == false)
            return false;
        return true;
    }
}
