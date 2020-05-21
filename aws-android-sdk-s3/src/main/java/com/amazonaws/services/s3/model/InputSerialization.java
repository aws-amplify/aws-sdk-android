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
 * Describes the serialization format of the object.
 * </p>
 */
public class InputSerialization implements Serializable {
    /**
     * <p>
     * Describes the serialization of a CSV-encoded object.
     * </p>
     */
    private CSVInput cSV;

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     */
    private String compressionType;

    /**
     * <p>
     * Specifies JSON as object's input serialization format.
     * </p>
     */
    private JSONInput jSON;

    /**
     * <p>
     * Specifies Parquet as object's input serialization format.
     * </p>
     */
    private ParquetInput parquet;

    /**
     * <p>
     * Describes the serialization of a CSV-encoded object.
     * </p>
     *
     * @return <p>
     *         Describes the serialization of a CSV-encoded object.
     *         </p>
     */
    public CSVInput getCSV() {
        return cSV;
    }

    /**
     * <p>
     * Describes the serialization of a CSV-encoded object.
     * </p>
     *
     * @param cSV <p>
     *            Describes the serialization of a CSV-encoded object.
     *            </p>
     */
    public void setCSV(CSVInput cSV) {
        this.cSV = cSV;
    }

    /**
     * <p>
     * Describes the serialization of a CSV-encoded object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSV <p>
     *            Describes the serialization of a CSV-encoded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSerialization withCSV(CSVInput cSV) {
        this.cSV = cSV;
        return this;
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     *
     * @return <p>
     *         Specifies object's compression format. Valid values: NONE, GZIP,
     *         BZIP2. Default Value: NONE.
     *         </p>
     * @see CompressionType
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     *
     * @param compressionType <p>
     *            Specifies object's compression format. Valid values: NONE,
     *            GZIP, BZIP2. Default Value: NONE.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     *
     * @param compressionType <p>
     *            Specifies object's compression format. Valid values: NONE,
     *            GZIP, BZIP2. Default Value: NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public InputSerialization withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     *
     * @param compressionType <p>
     *            Specifies object's compression format. Valid values: NONE,
     *            GZIP, BZIP2. Default Value: NONE.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
    }

    /**
     * <p>
     * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2.
     * Default Value: NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, GZIP, BZIP2
     *
     * @param compressionType <p>
     *            Specifies object's compression format. Valid values: NONE,
     *            GZIP, BZIP2. Default Value: NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public InputSerialization withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies JSON as object's input serialization format.
     * </p>
     *
     * @return <p>
     *         Specifies JSON as object's input serialization format.
     *         </p>
     */
    public JSONInput getJSON() {
        return jSON;
    }

    /**
     * <p>
     * Specifies JSON as object's input serialization format.
     * </p>
     *
     * @param jSON <p>
     *            Specifies JSON as object's input serialization format.
     *            </p>
     */
    public void setJSON(JSONInput jSON) {
        this.jSON = jSON;
    }

    /**
     * <p>
     * Specifies JSON as object's input serialization format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jSON <p>
     *            Specifies JSON as object's input serialization format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSerialization withJSON(JSONInput jSON) {
        this.jSON = jSON;
        return this;
    }

    /**
     * <p>
     * Specifies Parquet as object's input serialization format.
     * </p>
     *
     * @return <p>
     *         Specifies Parquet as object's input serialization format.
     *         </p>
     */
    public ParquetInput getParquet() {
        return parquet;
    }

    /**
     * <p>
     * Specifies Parquet as object's input serialization format.
     * </p>
     *
     * @param parquet <p>
     *            Specifies Parquet as object's input serialization format.
     *            </p>
     */
    public void setParquet(ParquetInput parquet) {
        this.parquet = parquet;
    }

    /**
     * <p>
     * Specifies Parquet as object's input serialization format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parquet <p>
     *            Specifies Parquet as object's input serialization format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputSerialization withParquet(ParquetInput parquet) {
        this.parquet = parquet;
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
        if (getCompressionType() != null)
            sb.append("CompressionType: " + getCompressionType() + ",");
        if (getJSON() != null)
            sb.append("JSON: " + getJSON() + ",");
        if (getParquet() != null)
            sb.append("Parquet: " + getParquet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCSV() == null) ? 0 : getCSV().hashCode());
        hashCode = prime * hashCode
                + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getJSON() == null) ? 0 : getJSON().hashCode());
        hashCode = prime * hashCode + ((getParquet() == null) ? 0 : getParquet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSerialization == false)
            return false;
        InputSerialization other = (InputSerialization) obj;

        if (other.getCSV() == null ^ this.getCSV() == null)
            return false;
        if (other.getCSV() != null && other.getCSV().equals(this.getCSV()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null
                && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getJSON() == null ^ this.getJSON() == null)
            return false;
        if (other.getJSON() != null && other.getJSON().equals(this.getJSON()) == false)
            return false;
        if (other.getParquet() == null ^ this.getParquet() == null)
            return false;
        if (other.getParquet() != null && other.getParquet().equals(this.getParquet()) == false)
            return false;
        return true;
    }
}
