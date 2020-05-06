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

public class DescribePHIDetectionJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     */
    private ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with a
     *         detection job.
     *         </p>
     */
    public ComprehendMedicalAsyncJobProperties getComprehendMedicalAsyncJobProperties() {
        return comprehendMedicalAsyncJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     *
     * @param comprehendMedicalAsyncJobProperties <p>
     *            An object that contains the properties associated with a
     *            detection job.
     *            </p>
     */
    public void setComprehendMedicalAsyncJobProperties(
            ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties) {
        this.comprehendMedicalAsyncJobProperties = comprehendMedicalAsyncJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comprehendMedicalAsyncJobProperties <p>
     *            An object that contains the properties associated with a
     *            detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePHIDetectionJobResult withComprehendMedicalAsyncJobProperties(
            ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties) {
        this.comprehendMedicalAsyncJobProperties = comprehendMedicalAsyncJobProperties;
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
        if (getComprehendMedicalAsyncJobProperties() != null)
            sb.append("ComprehendMedicalAsyncJobProperties: "
                    + getComprehendMedicalAsyncJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getComprehendMedicalAsyncJobProperties() == null) ? 0
                        : getComprehendMedicalAsyncJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePHIDetectionJobResult == false)
            return false;
        DescribePHIDetectionJobResult other = (DescribePHIDetectionJobResult) obj;

        if (other.getComprehendMedicalAsyncJobProperties() == null
                ^ this.getComprehendMedicalAsyncJobProperties() == null)
            return false;
        if (other.getComprehendMedicalAsyncJobProperties() != null
                && other.getComprehendMedicalAsyncJobProperties().equals(
                        this.getComprehendMedicalAsyncJobProperties()) == false)
            return false;
        return true;
    }
}
