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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The Output data type.
 * </p>
 */
public class Output implements Serializable {
    /**
     * <p>
     * The key associated with the output.
     * </p>
     */
    private String outputKey;

    /**
     * <p>
     * The value associated with the output.
     * </p>
     */
    private String outputValue;

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     */
    private String exportName;

    /**
     * <p>
     * The key associated with the output.
     * </p>
     *
     * @return <p>
     *         The key associated with the output.
     *         </p>
     */
    public String getOutputKey() {
        return outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     *
     * @param outputKey <p>
     *            The key associated with the output.
     *            </p>
     */
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputKey <p>
     *            The key associated with the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     *
     * @return <p>
     *         The value associated with the output.
     *         </p>
     */
    public String getOutputValue() {
        return outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     *
     * @param outputValue <p>
     *            The value associated with the output.
     *            </p>
     */
    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputValue <p>
     *            The value associated with the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withOutputValue(String outputValue) {
        this.outputValue = outputValue;
        return this;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         User defined description associated with the output.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the output.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     *
     * @return <p>
     *         The name of the export associated with the output.
     *         </p>
     */
    public String getExportName() {
        return exportName;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     *
     * @param exportName <p>
     *            The name of the export associated with the output.
     *            </p>
     */
    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportName <p>
     *            The name of the export associated with the output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withExportName(String exportName) {
        this.exportName = exportName;
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
        if (getOutputKey() != null)
            sb.append("OutputKey: " + getOutputKey() + ",");
        if (getOutputValue() != null)
            sb.append("OutputValue: " + getOutputValue() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getExportName() != null)
            sb.append("ExportName: " + getExportName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode
                + ((getOutputValue() == null) ? 0 : getOutputValue().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExportName() == null) ? 0 : getExportName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;

        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null
                && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputValue() == null ^ this.getOutputValue() == null)
            return false;
        if (other.getOutputValue() != null
                && other.getOutputValue().equals(this.getOutputValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportName() == null ^ this.getExportName() == null)
            return false;
        if (other.getExportName() != null
                && other.getExportName().equals(this.getExportName()) == false)
            return false;
        return true;
    }
}
