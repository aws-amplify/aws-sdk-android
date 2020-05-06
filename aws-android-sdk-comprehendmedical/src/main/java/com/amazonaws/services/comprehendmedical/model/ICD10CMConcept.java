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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

/**
 * <p>
 * The ICD-10-CM concepts that the entity could refer to, along with a score
 * indicating the likelihood of the match.
 * </p>
 */
public class ICD10CMConcept implements Serializable {
    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String description;

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge
     * base from the Centers for Disease Control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String code;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * entity is accurately linked to an ICD-10-CM concept.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The long description of the ICD-10-CM code in the ontology.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The long description of the ICD-10-CM code in the ontology.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The long description of the ICD-10-CM code in the ontology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param description <p>
     *            The long description of the ICD-10-CM code in the ontology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMConcept withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge
     * base from the Centers for Disease Control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ICD-10-CM code that identifies the concept found in the
     *         knowledge base from the Centers for Disease Control.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge
     * base from the Centers for Disease Control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param code <p>
     *            The ICD-10-CM code that identifies the concept found in the
     *            knowledge base from the Centers for Disease Control.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The ICD-10-CM code that identifies the concept found in the knowledge
     * base from the Centers for Disease Control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param code <p>
     *            The ICD-10-CM code that identifies the concept found in the
     *            knowledge base from the Centers for Disease Control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMConcept withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * entity is accurately linked to an ICD-10-CM concept.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend Medical has that
     *         the entity is accurately linked to an ICD-10-CM concept.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * entity is accurately linked to an ICD-10-CM concept.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that the entity is accurately linked to an ICD-10-CM concept.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has that the
     * entity is accurately linked to an ICD-10-CM concept.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has
     *            that the entity is accurately linked to an ICD-10-CM concept.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ICD10CMConcept withScore(Float score) {
        this.score = score;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ICD10CMConcept == false)
            return false;
        ICD10CMConcept other = (ICD10CMConcept) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
