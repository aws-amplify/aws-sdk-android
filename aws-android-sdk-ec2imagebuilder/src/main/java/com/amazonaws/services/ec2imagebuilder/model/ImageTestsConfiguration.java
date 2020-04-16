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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Image tests configuration.
 * </p>
 */
public class ImageTestsConfiguration implements Serializable {
    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     */
    private Boolean imageTestsEnabled;

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     */
    private Integer timeoutMinutes;

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     *
     * @return <p>
     *         Defines if tests should be executed when building this image.
     *         </p>
     */
    public Boolean isImageTestsEnabled() {
        return imageTestsEnabled;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     *
     * @return <p>
     *         Defines if tests should be executed when building this image.
     *         </p>
     */
    public Boolean getImageTestsEnabled() {
        return imageTestsEnabled;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     *
     * @param imageTestsEnabled <p>
     *            Defines if tests should be executed when building this image.
     *            </p>
     */
    public void setImageTestsEnabled(Boolean imageTestsEnabled) {
        this.imageTestsEnabled = imageTestsEnabled;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTestsEnabled <p>
     *            Defines if tests should be executed when building this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageTestsConfiguration withImageTestsEnabled(Boolean imageTestsEnabled) {
        this.imageTestsEnabled = imageTestsEnabled;
        return this;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @return <p>
     *         The maximum time in minutes that tests are permitted to run.
     *         </p>
     */
    public Integer getTimeoutMinutes() {
        return timeoutMinutes;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @param timeoutMinutes <p>
     *            The maximum time in minutes that tests are permitted to run.
     *            </p>
     */
    public void setTimeoutMinutes(Integer timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>60 - 1440<br/>
     *
     * @param timeoutMinutes <p>
     *            The maximum time in minutes that tests are permitted to run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageTestsConfiguration withTimeoutMinutes(Integer timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
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
        if (getImageTestsEnabled() != null)
            sb.append("imageTestsEnabled: " + getImageTestsEnabled() + ",");
        if (getTimeoutMinutes() != null)
            sb.append("timeoutMinutes: " + getTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageTestsEnabled() == null) ? 0 : getImageTestsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutMinutes() == null) ? 0 : getTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageTestsConfiguration == false)
            return false;
        ImageTestsConfiguration other = (ImageTestsConfiguration) obj;

        if (other.getImageTestsEnabled() == null ^ this.getImageTestsEnabled() == null)
            return false;
        if (other.getImageTestsEnabled() != null
                && other.getImageTestsEnabled().equals(this.getImageTestsEnabled()) == false)
            return false;
        if (other.getTimeoutMinutes() == null ^ this.getTimeoutMinutes() == null)
            return false;
        if (other.getTimeoutMinutes() != null
                && other.getTimeoutMinutes().equals(this.getTimeoutMinutes()) == false)
            return false;
        return true;
    }
}
