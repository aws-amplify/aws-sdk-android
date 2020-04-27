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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class CaptureContentTypeHeader implements Serializable {
    /**
     * <p/>
     */
    private java.util.List<String> csvContentTypes;

    /**
     * <p/>
     */
    private java.util.List<String> jsonContentTypes;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<String> getCsvContentTypes() {
        return csvContentTypes;
    }

    /**
     * <p/>
     *
     * @param csvContentTypes <p/>
     */
    public void setCsvContentTypes(java.util.Collection<String> csvContentTypes) {
        if (csvContentTypes == null) {
            this.csvContentTypes = null;
            return;
        }

        this.csvContentTypes = new java.util.ArrayList<String>(csvContentTypes);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvContentTypes <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptureContentTypeHeader withCsvContentTypes(String... csvContentTypes) {
        if (getCsvContentTypes() == null) {
            this.csvContentTypes = new java.util.ArrayList<String>(csvContentTypes.length);
        }
        for (String value : csvContentTypes) {
            this.csvContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvContentTypes <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptureContentTypeHeader withCsvContentTypes(java.util.Collection<String> csvContentTypes) {
        setCsvContentTypes(csvContentTypes);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<String> getJsonContentTypes() {
        return jsonContentTypes;
    }

    /**
     * <p/>
     *
     * @param jsonContentTypes <p/>
     */
    public void setJsonContentTypes(java.util.Collection<String> jsonContentTypes) {
        if (jsonContentTypes == null) {
            this.jsonContentTypes = null;
            return;
        }

        this.jsonContentTypes = new java.util.ArrayList<String>(jsonContentTypes);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonContentTypes <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptureContentTypeHeader withJsonContentTypes(String... jsonContentTypes) {
        if (getJsonContentTypes() == null) {
            this.jsonContentTypes = new java.util.ArrayList<String>(jsonContentTypes.length);
        }
        for (String value : jsonContentTypes) {
            this.jsonContentTypes.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonContentTypes <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaptureContentTypeHeader withJsonContentTypes(
            java.util.Collection<String> jsonContentTypes) {
        setJsonContentTypes(jsonContentTypes);
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
        if (getCsvContentTypes() != null)
            sb.append("CsvContentTypes: " + getCsvContentTypes() + ",");
        if (getJsonContentTypes() != null)
            sb.append("JsonContentTypes: " + getJsonContentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCsvContentTypes() == null) ? 0 : getCsvContentTypes().hashCode());
        hashCode = prime * hashCode
                + ((getJsonContentTypes() == null) ? 0 : getJsonContentTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptureContentTypeHeader == false)
            return false;
        CaptureContentTypeHeader other = (CaptureContentTypeHeader) obj;

        if (other.getCsvContentTypes() == null ^ this.getCsvContentTypes() == null)
            return false;
        if (other.getCsvContentTypes() != null
                && other.getCsvContentTypes().equals(this.getCsvContentTypes()) == false)
            return false;
        if (other.getJsonContentTypes() == null ^ this.getJsonContentTypes() == null)
            return false;
        if (other.getJsonContentTypes() != null
                && other.getJsonContentTypes().equals(this.getJsonContentTypes()) == false)
            return false;
        return true;
    }
}
