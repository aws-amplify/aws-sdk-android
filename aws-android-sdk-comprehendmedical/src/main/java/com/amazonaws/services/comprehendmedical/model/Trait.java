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
 * Provides contextual information about the extracted entity.
 * </p>
 */
public class Trait implements Serializable {
    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     */
    private String name;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of this trait.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     *
     * @return <p>
     *         Provides a name or contextual description about the trait.
     *         </p>
     * @see AttributeName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     *
     * @param name <p>
     *            Provides a name or contextual description about the trait.
     *            </p>
     * @see AttributeName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     *
     * @param name <p>
     *            Provides a name or contextual description about the trait.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeName
     */
    public Trait withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     *
     * @param name <p>
     *            Provides a name or contextual description about the trait.
     *            </p>
     * @see AttributeName
     */
    public void setName(AttributeName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Provides a name or contextual description about the trait.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIGN, SYMPTOM, DIAGNOSIS, NEGATION
     *
     * @param name <p>
     *            Provides a name or contextual description about the trait.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AttributeName
     */
    public Trait withName(AttributeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of this trait.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend Medical has in the
     *         accuracy of this trait.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of this trait.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has in
     *            the accuracy of this trait.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend Medical has in the
     * accuracy of this trait.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend Medical has in
     *            the accuracy of this trait.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trait withScore(Float score) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trait == false)
            return false;
        Trait other = (Trait) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
