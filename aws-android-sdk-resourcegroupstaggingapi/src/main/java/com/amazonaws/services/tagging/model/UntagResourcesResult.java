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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

public class UntagResourcesResult implements Serializable {
    /**
     * <p>
     * Details of resources that could not be untagged. An error code, status
     * code, and error message are returned for each failed item.
     * </p>
     */
    private java.util.Map<String, FailureInfo> failedResourcesMap;

    /**
     * <p>
     * Details of resources that could not be untagged. An error code, status
     * code, and error message are returned for each failed item.
     * </p>
     *
     * @return <p>
     *         Details of resources that could not be untagged. An error code,
     *         status code, and error message are returned for each failed item.
     *         </p>
     */
    public java.util.Map<String, FailureInfo> getFailedResourcesMap() {
        return failedResourcesMap;
    }

    /**
     * <p>
     * Details of resources that could not be untagged. An error code, status
     * code, and error message are returned for each failed item.
     * </p>
     *
     * @param failedResourcesMap <p>
     *            Details of resources that could not be untagged. An error
     *            code, status code, and error message are returned for each
     *            failed item.
     *            </p>
     */
    public void setFailedResourcesMap(java.util.Map<String, FailureInfo> failedResourcesMap) {
        this.failedResourcesMap = failedResourcesMap;
    }

    /**
     * <p>
     * Details of resources that could not be untagged. An error code, status
     * code, and error message are returned for each failed item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedResourcesMap <p>
     *            Details of resources that could not be untagged. An error
     *            code, status code, and error message are returned for each
     *            failed item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesResult withFailedResourcesMap(
            java.util.Map<String, FailureInfo> failedResourcesMap) {
        this.failedResourcesMap = failedResourcesMap;
        return this;
    }

    /**
     * <p>
     * Details of resources that could not be untagged. An error code, status
     * code, and error message are returned for each failed item.
     * </p>
     * <p>
     * The method adds a new key-value pair into FailedResourcesMap parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into FailedResourcesMap.
     * @param value The corresponding value of the entry to be added into
     *            FailedResourcesMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourcesResult addFailedResourcesMapEntry(String key, FailureInfo value) {
        if (null == this.failedResourcesMap) {
            this.failedResourcesMap = new java.util.HashMap<String, FailureInfo>();
        }
        if (this.failedResourcesMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.failedResourcesMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedResourcesMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UntagResourcesResult clearFailedResourcesMapEntries() {
        this.failedResourcesMap = null;
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
        if (getFailedResourcesMap() != null)
            sb.append("FailedResourcesMap: " + getFailedResourcesMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailedResourcesMap() == null) ? 0 : getFailedResourcesMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourcesResult == false)
            return false;
        UntagResourcesResult other = (UntagResourcesResult) obj;

        if (other.getFailedResourcesMap() == null ^ this.getFailedResourcesMap() == null)
            return false;
        if (other.getFailedResourcesMap() != null
                && other.getFailedResourcesMap().equals(this.getFailedResourcesMap()) == false)
            return false;
        return true;
    }
}
