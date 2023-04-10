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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Allows you to opt in or opt out to share data with Rekognition to improve
 * model performance. You can choose this option at the account level or on a
 * per-stream basis. Note that if you opt out at the account level this setting
 * is ignored on individual streams.
 * </p>
 */
public class StreamProcessorDataSharingPreference implements Serializable {
    /**
     * <p>
     * If this option is set to true, you choose to share data with Rekognition
     * to improve model performance.
     * </p>
     */
    private Boolean optIn;

    /**
     * <p>
     * If this option is set to true, you choose to share data with Rekognition
     * to improve model performance.
     * </p>
     *
     * @return <p>
     *         If this option is set to true, you choose to share data with
     *         Rekognition to improve model performance.
     *         </p>
     */
    public Boolean isOptIn() {
        return optIn;
    }

    /**
     * <p>
     * If this option is set to true, you choose to share data with Rekognition
     * to improve model performance.
     * </p>
     *
     * @return <p>
     *         If this option is set to true, you choose to share data with
     *         Rekognition to improve model performance.
     *         </p>
     */
    public Boolean getOptIn() {
        return optIn;
    }

    /**
     * <p>
     * If this option is set to true, you choose to share data with Rekognition
     * to improve model performance.
     * </p>
     *
     * @param optIn <p>
     *            If this option is set to true, you choose to share data with
     *            Rekognition to improve model performance.
     *            </p>
     */
    public void setOptIn(Boolean optIn) {
        this.optIn = optIn;
    }

    /**
     * <p>
     * If this option is set to true, you choose to share data with Rekognition
     * to improve model performance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optIn <p>
     *            If this option is set to true, you choose to share data with
     *            Rekognition to improve model performance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorDataSharingPreference withOptIn(Boolean optIn) {
        this.optIn = optIn;
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
        if (getOptIn() != null)
            sb.append("OptIn: " + getOptIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptIn() == null) ? 0 : getOptIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorDataSharingPreference == false)
            return false;
        StreamProcessorDataSharingPreference other = (StreamProcessorDataSharingPreference) obj;

        if (other.getOptIn() == null ^ this.getOptIn() == null)
            return false;
        if (other.getOptIn() != null && other.getOptIn().equals(this.getOptIn()) == false)
            return false;
        return true;
    }
}
