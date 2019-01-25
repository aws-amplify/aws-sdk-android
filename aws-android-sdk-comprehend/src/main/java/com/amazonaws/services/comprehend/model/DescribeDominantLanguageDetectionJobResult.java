/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeDominantLanguageDetectionJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with a dominant
     * language detection job.
     * </p>
     */
    private DominantLanguageDetectionJobProperties dominantLanguageDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a dominant
     * language detection job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with a dominant
     *         language detection job.
     *         </p>
     */
    public DominantLanguageDetectionJobProperties getDominantLanguageDetectionJobProperties() {
        return dominantLanguageDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a dominant
     * language detection job.
     * </p>
     *
     * @param dominantLanguageDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            dominant language detection job.
     *            </p>
     */
    public void setDominantLanguageDetectionJobProperties(
            DominantLanguageDetectionJobProperties dominantLanguageDetectionJobProperties) {
        this.dominantLanguageDetectionJobProperties = dominantLanguageDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a dominant
     * language detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantLanguageDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            dominant language detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDominantLanguageDetectionJobResult withDominantLanguageDetectionJobProperties(
            DominantLanguageDetectionJobProperties dominantLanguageDetectionJobProperties) {
        this.dominantLanguageDetectionJobProperties = dominantLanguageDetectionJobProperties;
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
        if (getDominantLanguageDetectionJobProperties() != null)
            sb.append("DominantLanguageDetectionJobProperties: "
                    + getDominantLanguageDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDominantLanguageDetectionJobProperties() == null) ? 0
                        : getDominantLanguageDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDominantLanguageDetectionJobResult == false)
            return false;
        DescribeDominantLanguageDetectionJobResult other = (DescribeDominantLanguageDetectionJobResult) obj;

        if (other.getDominantLanguageDetectionJobProperties() == null
                ^ this.getDominantLanguageDetectionJobProperties() == null)
            return false;
        if (other.getDominantLanguageDetectionJobProperties() != null
                && other.getDominantLanguageDetectionJobProperties().equals(
                        this.getDominantLanguageDetectionJobProperties()) == false)
            return false;
        return true;
    }
}
