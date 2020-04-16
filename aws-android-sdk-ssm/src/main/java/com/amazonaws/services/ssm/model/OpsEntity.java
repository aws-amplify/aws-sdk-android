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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The result of the query.
 * </p>
 */
public class OpsEntity implements Serializable {
    /**
     * <p>
     * The query ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The data returned by the query.
     * </p>
     */
    private java.util.Map<String, OpsEntityItem> data;

    /**
     * <p>
     * The query ID.
     * </p>
     *
     * @return <p>
     *         The query ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The query ID.
     * </p>
     *
     * @param id <p>
     *            The query ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The query ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The query ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The data returned by the query.
     * </p>
     *
     * @return <p>
     *         The data returned by the query.
     *         </p>
     */
    public java.util.Map<String, OpsEntityItem> getData() {
        return data;
    }

    /**
     * <p>
     * The data returned by the query.
     * </p>
     *
     * @param data <p>
     *            The data returned by the query.
     *            </p>
     */
    public void setData(java.util.Map<String, OpsEntityItem> data) {
        this.data = data;
    }

    /**
     * <p>
     * The data returned by the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The data returned by the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntity withData(java.util.Map<String, OpsEntityItem> data) {
        this.data = data;
        return this;
    }

    /**
     * <p>
     * The data returned by the query.
     * </p>
     * <p>
     * The method adds a new key-value pair into Data parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Data.
     * @param value The corresponding value of the entry to be added into Data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntity addDataEntry(String key, OpsEntityItem value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, OpsEntityItem>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public OpsEntity clearDataEntries() {
        this.data = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsEntity == false)
            return false;
        OpsEntity other = (OpsEntity) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
