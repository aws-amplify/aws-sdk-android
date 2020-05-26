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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Dataset reference.
 * </p>
 */
public class DataSetReference implements Serializable {
    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String dataSetPlaceholder;

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     */
    private String dataSetArn;

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Dataset placeholder.
     *         </p>
     */
    public String getDataSetPlaceholder() {
        return dataSetPlaceholder;
    }

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dataSetPlaceholder <p>
     *            Dataset placeholder.
     *            </p>
     */
    public void setDataSetPlaceholder(String dataSetPlaceholder) {
        this.dataSetPlaceholder = dataSetPlaceholder;
    }

    /**
     * <p>
     * Dataset placeholder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param dataSetPlaceholder <p>
     *            Dataset placeholder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetReference withDataSetPlaceholder(String dataSetPlaceholder) {
        this.dataSetPlaceholder = dataSetPlaceholder;
        return this;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         Dataset Amazon Resource Name (ARN).
     *         </p>
     */
    public String getDataSetArn() {
        return dataSetArn;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     *
     * @param dataSetArn <p>
     *            Dataset Amazon Resource Name (ARN).
     *            </p>
     */
    public void setDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
    }

    /**
     * <p>
     * Dataset Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetArn <p>
     *            Dataset Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetReference withDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
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
        if (getDataSetPlaceholder() != null)
            sb.append("DataSetPlaceholder: " + getDataSetPlaceholder() + ",");
        if (getDataSetArn() != null)
            sb.append("DataSetArn: " + getDataSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDataSetPlaceholder() == null) ? 0 : getDataSetPlaceholder().hashCode());
        hashCode = prime * hashCode + ((getDataSetArn() == null) ? 0 : getDataSetArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetReference == false)
            return false;
        DataSetReference other = (DataSetReference) obj;

        if (other.getDataSetPlaceholder() == null ^ this.getDataSetPlaceholder() == null)
            return false;
        if (other.getDataSetPlaceholder() != null
                && other.getDataSetPlaceholder().equals(this.getDataSetPlaceholder()) == false)
            return false;
        if (other.getDataSetArn() == null ^ this.getDataSetArn() == null)
            return false;
        if (other.getDataSetArn() != null
                && other.getDataSetArn().equals(this.getDataSetArn()) == false)
            return false;
        return true;
    }
}
