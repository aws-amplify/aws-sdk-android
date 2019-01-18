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
 * Details of the job execution status.
 * </p>
 */
public class JobExecutionStatusDetails implements Serializable {
    /**
     * <p>
     * The job execution status.
     * </p>
     */
    private java.util.Map<String, String> detailsMap;

    /**
     * <p>
     * The job execution status.
     * </p>
     *
     * @return <p>
     *         The job execution status.
     *         </p>
     */
    public java.util.Map<String, String> getDetailsMap() {
        return detailsMap;
    }

    /**
     * <p>
     * The job execution status.
     * </p>
     *
     * @param detailsMap <p>
     *            The job execution status.
     *            </p>
     */
    public void setDetailsMap(java.util.Map<String, String> detailsMap) {
        this.detailsMap = detailsMap;
    }

    /**
     * <p>
     * The job execution status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailsMap <p>
     *            The job execution status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionStatusDetails withDetailsMap(java.util.Map<String, String> detailsMap) {
        this.detailsMap = detailsMap;
        return this;
    }

    /**
     * <p>
     * The job execution status.
     * </p>
     * <p>
     * The method adds a new key-value pair into detailsMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into detailsMap.
     * @param value The corresponding value of the entry to be added into
     *            detailsMap.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobExecutionStatusDetails adddetailsMapEntry(String key, String value) {
        if (null == this.detailsMap) {
            this.detailsMap = new java.util.HashMap<String, String>();
        }
        if (this.detailsMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.detailsMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into detailsMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public JobExecutionStatusDetails cleardetailsMapEntries() {
        this.detailsMap = null;
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
        if (getDetailsMap() != null)
            sb.append("detailsMap: " + getDetailsMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailsMap() == null) ? 0 : getDetailsMap().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionStatusDetails == false)
            return false;
        JobExecutionStatusDetails other = (JobExecutionStatusDetails) obj;

        if (other.getDetailsMap() == null ^ this.getDetailsMap() == null)
            return false;
        if (other.getDetailsMap() != null
                && other.getDetailsMap().equals(this.getDetailsMap()) == false)
            return false;
        return true;
    }
}
