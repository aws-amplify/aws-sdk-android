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
 * The source analysis of the template.
 * </p>
 */
public class TemplateSourceAnalysis implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * A structure containing information about the dataset references used as
     * placeholders in the template.
     * </p>
     */
    private java.util.List<DataSetReference> dataSetReferences;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateSourceAnalysis withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as
     * placeholders in the template.
     * </p>
     *
     * @return <p>
     *         A structure containing information about the dataset references
     *         used as placeholders in the template.
     *         </p>
     */
    public java.util.List<DataSetReference> getDataSetReferences() {
        return dataSetReferences;
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as
     * placeholders in the template.
     * </p>
     *
     * @param dataSetReferences <p>
     *            A structure containing information about the dataset
     *            references used as placeholders in the template.
     *            </p>
     */
    public void setDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        if (dataSetReferences == null) {
            this.dataSetReferences = null;
            return;
        }

        this.dataSetReferences = new java.util.ArrayList<DataSetReference>(dataSetReferences);
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as
     * placeholders in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetReferences <p>
     *            A structure containing information about the dataset
     *            references used as placeholders in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateSourceAnalysis withDataSetReferences(DataSetReference... dataSetReferences) {
        if (getDataSetReferences() == null) {
            this.dataSetReferences = new java.util.ArrayList<DataSetReference>(
                    dataSetReferences.length);
        }
        for (DataSetReference value : dataSetReferences) {
            this.dataSetReferences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as
     * placeholders in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetReferences <p>
     *            A structure containing information about the dataset
     *            references used as placeholders in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateSourceAnalysis withDataSetReferences(
            java.util.Collection<DataSetReference> dataSetReferences) {
        setDataSetReferences(dataSetReferences);
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDataSetReferences() != null)
            sb.append("DataSetReferences: " + getDataSetReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataSetReferences() == null) ? 0 : getDataSetReferences().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSourceAnalysis == false)
            return false;
        TemplateSourceAnalysis other = (TemplateSourceAnalysis) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSetReferences() == null ^ this.getDataSetReferences() == null)
            return false;
        if (other.getDataSetReferences() != null
                && other.getDataSetReferences().equals(this.getDataSetReferences()) == false)
            return false;
        return true;
    }
}
