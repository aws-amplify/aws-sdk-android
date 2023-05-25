/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a section from an evaluation form. A section can contain
 * sections and/or questions. Evaluation forms can only contain sections and
 * subsections (two level nesting).
 * </p>
 */
public class EvaluationFormSection implements Serializable {
    /**
     * <p>
     * The title of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String title;

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String refId;

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String instructions;

    /**
     * <p>
     * The items of the section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     */
    private Double weight;

    /**
     * <p>
     * The title of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         The title of the section.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * The title of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param title <p>
     *            The title of the section.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param title <p>
     *            The title of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return <p>
     *         The identifier of the section. An identifier must be unique
     *         within the evaluation form.
     *         </p>
     */
    public String getRefId() {
        return refId;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the section. An identifier must be unique
     *            within the evaluation form.
     *            </p>
     */
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the
     * evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param refId <p>
     *            The identifier of the section. An identifier must be unique
     *            within the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The instructions of the section.
     *         </p>
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param instructions <p>
     *            The instructions of the section.
     *            </p>
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param instructions <p>
     *            The instructions of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     *
     * @return <p>
     *         The items of the section.
     *         </p>
     */
    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     *
     * @param items <p>
     *            The items of the section.
     *            </p>
     */
    public void setItems(java.util.Collection<EvaluationFormItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EvaluationFormItem>(items);
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The items of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withItems(EvaluationFormItem... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<EvaluationFormItem>(items.length);
        }
        for (EvaluationFormItem value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The items of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The scoring weight of the section.
     *         </p>
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param weight <p>
     *            The scoring weight of the section.
     *            </p>
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0.0 - 100.0<br/>
     *
     * @param weight <p>
     *            The scoring weight of the section.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSection withWeight(Double weight) {
        this.weight = weight;
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
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getRefId() != null)
            sb.append("RefId: " + getRefId() + ",");
        if (getInstructions() != null)
            sb.append("Instructions: " + getInstructions() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode
                + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSection == false)
            return false;
        EvaluationFormSection other = (EvaluationFormSection) obj;

        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getInstructions() == null ^ this.getInstructions() == null)
            return false;
        if (other.getInstructions() != null
                && other.getInstructions().equals(this.getInstructions()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }
}
