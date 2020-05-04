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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Describes the format of a manifest. If the manifest is in CSV format, also describes the columns contained within the manifest.</p>
 */
public class JobManifestSpec implements Serializable {
    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     */
    private String format;

    /**
     * <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     */
    private java.util.List<String> fields;

    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     *
     * @return <p>Indicates which of the available formats the specified manifest uses.</p>
     *
     * @see JobManifestFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     *
     * @param format <p>Indicates which of the available formats the specified manifest uses.</p>
     *
     * @see JobManifestFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     *
     * @param format <p>Indicates which of the available formats the specified manifest uses.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobManifestFormat
     */
    public JobManifestSpec withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     *
     * @param format <p>Indicates which of the available formats the specified manifest uses.</p>
     *
     * @see JobManifestFormat
     */
    public void setFormat(JobManifestFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>Indicates which of the available formats the specified manifest uses.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3BatchOperations_CSV_20180820, S3InventoryReport_CSV_20161130
     *
     * @param format <p>Indicates which of the available formats the specified manifest uses.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobManifestFormat
     */
    public JobManifestSpec withFormat(JobManifestFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     *
     * @return <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     */
    public java.util.List<String> getFields() {
        return fields;
    }

    /**
     * <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     *
     * @param fields <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     */
    public void setFields(java.util.Collection<String> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<String>(fields);
    }

    /**
     * <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifestSpec withFields(String... fields) {
        if (getFields() == null) {
            this.fields = new java.util.ArrayList<String>(fields.length);
        }
        for (String value : fields) {
            this.fields.add(value);
        }
        return this;
    }

    /**
     * <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields <p>If the specified manifest object is in the <code>S3BatchOperations_CSV_20180820</code> format, this element describes which columns contain the required data.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobManifestSpec withFields(java.util.Collection<String> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobManifestSpec == false) return false;
        JobManifestSpec other = (JobManifestSpec)obj;

        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false;
        if (other.getFields() == null ^ this.getFields() == null) return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false) return false;
        return true;
    }
}
