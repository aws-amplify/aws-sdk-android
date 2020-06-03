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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetWorkflowRunPropertiesResult implements Serializable {
    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     */
    private java.util.Map<String, String> runProperties;

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     *
     * @return <p>
     *         The workflow run properties which were set during the specified
     *         run.
     *         </p>
     */
    public java.util.Map<String, String> getRunProperties() {
        return runProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     *
     * @param runProperties <p>
     *            The workflow run properties which were set during the
     *            specified run.
     *            </p>
     */
    public void setRunProperties(java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runProperties <p>
     *            The workflow run properties which were set during the
     *            specified run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowRunPropertiesResult withRunProperties(
            java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
        return this;
    }

    /**
     * <p>
     * The workflow run properties which were set during the specified run.
     * </p>
     * <p>
     * The method adds a new key-value pair into RunProperties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RunProperties.
     * @param value The corresponding value of the entry to be added into
     *            RunProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowRunPropertiesResult addRunPropertiesEntry(String key, String value) {
        if (null == this.runProperties) {
            this.runProperties = new java.util.HashMap<String, String>();
        }
        if (this.runProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.runProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RunProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetWorkflowRunPropertiesResult clearRunPropertiesEntries() {
        this.runProperties = null;
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
        if (getRunProperties() != null)
            sb.append("RunProperties: " + getRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRunProperties() == null) ? 0 : getRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRunPropertiesResult == false)
            return false;
        GetWorkflowRunPropertiesResult other = (GetWorkflowRunPropertiesResult) obj;

        if (other.getRunProperties() == null ^ this.getRunProperties() == null)
            return false;
        if (other.getRunProperties() != null
                && other.getRunProperties().equals(this.getRunProperties()) == false)
            return false;
        return true;
    }
}
