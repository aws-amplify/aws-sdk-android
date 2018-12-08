/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The data associated with the custom terminology.
 * </p>
 */
public class TerminologyData implements Serializable {
    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     */
    private java.nio.ByteBuffer file;

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     */
    private String format;

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @return <p>
     *         The file containing the custom terminology data.
     *         </p>
     */
    public java.nio.ByteBuffer getFile() {
        return file;
    }

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @param file <p>
     *            The file containing the custom terminology data.
     *            </p>
     */
    public void setFile(java.nio.ByteBuffer file) {
        this.file = file;
    }

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10485760<br/>
     *
     * @param file <p>
     *            The file containing the custom terminology data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyData withFile(java.nio.ByteBuffer file) {
        this.file = file;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @return <p>
     *         The data format of the custom terminology. Either CSV or TMX.
     *         </p>
     * @see TerminologyDataFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param format <p>
     *            The data format of the custom terminology. Either CSV or TMX.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param format <p>
     *            The data format of the custom terminology. Either CSV or TMX.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public TerminologyData withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param format <p>
     *            The data format of the custom terminology. Either CSV or TMX.
     *            </p>
     * @see TerminologyDataFormat
     */
    public void setFormat(TerminologyDataFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, TMX
     *
     * @param format <p>
     *            The data format of the custom terminology. Either CSV or TMX.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TerminologyDataFormat
     */
    public TerminologyData withFormat(TerminologyDataFormat format) {
        this.format = format.toString();
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
        if (getFile() != null)
            sb.append("File: " + getFile() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyData == false)
            return false;
        TerminologyData other = (TerminologyData) obj;

        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }
}
