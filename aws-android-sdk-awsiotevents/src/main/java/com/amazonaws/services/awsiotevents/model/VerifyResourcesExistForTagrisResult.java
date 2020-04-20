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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class VerifyResourcesExistForTagrisResult implements Serializable {
    /**
     * The new value for the tagrisSweepListResult property for this object.
     */
    private java.util.Map<String, String> tagrisSweepListResult;

    /**
     * Returns the value of the tagrisSweepListResult property for this object.
     *
     * @return The value of the tagrisSweepListResult property for this object.
     */
    public java.util.Map<String, String> getTagrisSweepListResult() {
        return tagrisSweepListResult;
    }

    /**
     * Sets the value of tagrisSweepListResult
     *
     * @param tagrisSweepListResult The new value for the tagrisSweepListResult
     *            property for this object.
     */
    public void setTagrisSweepListResult(java.util.Map<String, String> tagrisSweepListResult) {
        this.tagrisSweepListResult = tagrisSweepListResult;
    }

    /**
     * Sets the value of the tagrisSweepListResult property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagrisSweepListResult The new value for the tagrisSweepListResult
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResourcesExistForTagrisResult withTagrisSweepListResult(
            java.util.Map<String, String> tagrisSweepListResult) {
        this.tagrisSweepListResult = tagrisSweepListResult;
        return this;
    }

    /**
     * Sets the value of the tagrisSweepListResult property for this object.
     * <p>
     * The method adds a new key-value pair into TagrisSweepListResult
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into TagrisSweepListResult.
     * @param value The corresponding value of the entry to be added into
     *            TagrisSweepListResult.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyResourcesExistForTagrisResult addTagrisSweepListResultEntry(String key,
            String value) {
        if (null == this.tagrisSweepListResult) {
            this.tagrisSweepListResult = new java.util.HashMap<String, String>();
        }
        if (this.tagrisSweepListResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tagrisSweepListResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagrisSweepListResult.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public VerifyResourcesExistForTagrisResult clearTagrisSweepListResultEntries() {
        this.tagrisSweepListResult = null;
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
        if (getTagrisSweepListResult() != null)
            sb.append("TagrisSweepListResult: " + getTagrisSweepListResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTagrisSweepListResult() == null) ? 0 : getTagrisSweepListResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyResourcesExistForTagrisResult == false)
            return false;
        VerifyResourcesExistForTagrisResult other = (VerifyResourcesExistForTagrisResult) obj;

        if (other.getTagrisSweepListResult() == null ^ this.getTagrisSweepListResult() == null)
            return false;
        if (other.getTagrisSweepListResult() != null
                && other.getTagrisSweepListResult().equals(this.getTagrisSweepListResult()) == false)
            return false;
        return true;
    }
}
