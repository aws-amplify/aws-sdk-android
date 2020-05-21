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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Describes how results of the Select job are serialized.
 * </p>
 */
public class OutputSerialization implements Serializable {
    /**
     * <p>
     * Describes the serialization of CSV-encoded Select results.
     * </p>
     */
    private CSVOutput cSV;

    /**
     * <p>
     * Specifies JSON as request's output serialization format.
     * </p>
     */
    private JSONOutput jSON;

    /**
     * <p>
     * Describes the serialization of CSV-encoded Select results.
     * </p>
     *
     * @return <p>
     *         Describes the serialization of CSV-encoded Select results.
     *         </p>
     */
    public CSVOutput getCSV() {
        return cSV;
    }

    /**
     * <p>
     * Describes the serialization of CSV-encoded Select results.
     * </p>
     *
     * @param cSV <p>
     *            Describes the serialization of CSV-encoded Select results.
     *            </p>
     */
    public void setCSV(CSVOutput cSV) {
        this.cSV = cSV;
    }

    /**
     * <p>
     * Describes the serialization of CSV-encoded Select results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSV <p>
     *            Describes the serialization of CSV-encoded Select results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSerialization withCSV(CSVOutput cSV) {
        this.cSV = cSV;
        return this;
    }

    /**
     * <p>
     * Specifies JSON as request's output serialization format.
     * </p>
     *
     * @return <p>
     *         Specifies JSON as request's output serialization format.
     *         </p>
     */
    public JSONOutput getJSON() {
        return jSON;
    }

    /**
     * <p>
     * Specifies JSON as request's output serialization format.
     * </p>
     *
     * @param jSON <p>
     *            Specifies JSON as request's output serialization format.
     *            </p>
     */
    public void setJSON(JSONOutput jSON) {
        this.jSON = jSON;
    }

    /**
     * <p>
     * Specifies JSON as request's output serialization format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jSON <p>
     *            Specifies JSON as request's output serialization format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSerialization withJSON(JSONOutput jSON) {
        this.jSON = jSON;
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
        if (getCSV() != null)
            sb.append("CSV: " + getCSV() + ",");
        if (getJSON() != null)
            sb.append("JSON: " + getJSON());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCSV() == null) ? 0 : getCSV().hashCode());
        hashCode = prime * hashCode + ((getJSON() == null) ? 0 : getJSON().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSerialization == false)
            return false;
        OutputSerialization other = (OutputSerialization) obj;

        if (other.getCSV() == null ^ this.getCSV() == null)
            return false;
        if (other.getCSV() != null && other.getCSV().equals(this.getCSV()) == false)
            return false;
        if (other.getJSON() == null ^ this.getJSON() == null)
            return false;
        if (other.getJSON() != null && other.getJSON().equals(this.getJSON()) == false)
            return false;
        return true;
    }
}
