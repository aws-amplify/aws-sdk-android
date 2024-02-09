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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Toxicity analysis result for one string. For more information about toxicity
 * detection, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/toxicity-detection.html"
 * >Toxicity detection</a> in the <i>Amazon Comprehend Developer Guide</i>.
 * </p>
 */
public class ToxicLabels implements Serializable {
    /**
     * <p>
     * Array of toxic content types identified in the string.
     * </p>
     */
    private java.util.List<ToxicContent> labels;

    /**
     * <p>
     * Overall toxicity score for the string. Value range is zero to one, where
     * one is the highest confidence.
     * </p>
     */
    private Float toxicity;

    /**
     * <p>
     * Array of toxic content types identified in the string.
     * </p>
     *
     * @return <p>
     *         Array of toxic content types identified in the string.
     *         </p>
     */
    public java.util.List<ToxicContent> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Array of toxic content types identified in the string.
     * </p>
     *
     * @param labels <p>
     *            Array of toxic content types identified in the string.
     *            </p>
     */
    public void setLabels(java.util.Collection<ToxicContent> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<ToxicContent>(labels);
    }

    /**
     * <p>
     * Array of toxic content types identified in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            Array of toxic content types identified in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ToxicLabels withLabels(ToxicContent... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<ToxicContent>(labels.length);
        }
        for (ToxicContent value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Array of toxic content types identified in the string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            Array of toxic content types identified in the string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ToxicLabels withLabels(java.util.Collection<ToxicContent> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Overall toxicity score for the string. Value range is zero to one, where
     * one is the highest confidence.
     * </p>
     *
     * @return <p>
     *         Overall toxicity score for the string. Value range is zero to
     *         one, where one is the highest confidence.
     *         </p>
     */
    public Float getToxicity() {
        return toxicity;
    }

    /**
     * <p>
     * Overall toxicity score for the string. Value range is zero to one, where
     * one is the highest confidence.
     * </p>
     *
     * @param toxicity <p>
     *            Overall toxicity score for the string. Value range is zero to
     *            one, where one is the highest confidence.
     *            </p>
     */
    public void setToxicity(Float toxicity) {
        this.toxicity = toxicity;
    }

    /**
     * <p>
     * Overall toxicity score for the string. Value range is zero to one, where
     * one is the highest confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toxicity <p>
     *            Overall toxicity score for the string. Value range is zero to
     *            one, where one is the highest confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ToxicLabels withToxicity(Float toxicity) {
        this.toxicity = toxicity;
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getToxicity() != null)
            sb.append("Toxicity: " + getToxicity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getToxicity() == null) ? 0 : getToxicity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToxicLabels == false)
            return false;
        ToxicLabels other = (ToxicLabels) obj;

        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getToxicity() == null ^ this.getToxicity() == null)
            return false;
        if (other.getToxicity() != null && other.getToxicity().equals(this.getToxicity()) == false)
            return false;
        return true;
    }
}
