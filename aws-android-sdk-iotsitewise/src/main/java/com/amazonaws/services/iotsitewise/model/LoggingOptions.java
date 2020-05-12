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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains logging options.
 * </p>
 */
public class LoggingOptions implements Serializable {
    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     */
    private String level;

    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @return <p>
     *         The AWS IoT SiteWise logging verbosity level.
     *         </p>
     * @see LoggingLevel
     */
    public String getLevel() {
        return level;
    }

    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param level <p>
     *            The AWS IoT SiteWise logging verbosity level.
     *            </p>
     * @see LoggingLevel
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param level <p>
     *            The AWS IoT SiteWise logging verbosity level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public LoggingOptions withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param level <p>
     *            The AWS IoT SiteWise logging verbosity level.
     *            </p>
     * @see LoggingLevel
     */
    public void setLevel(LoggingLevel level) {
        this.level = level.toString();
    }

    /**
     * <p>
     * The AWS IoT SiteWise logging verbosity level.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ERROR, INFO, OFF
     *
     * @param level <p>
     *            The AWS IoT SiteWise logging verbosity level.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoggingLevel
     */
    public LoggingOptions withLevel(LoggingLevel level) {
        this.level = level.toString();
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
        if (getLevel() != null)
            sb.append("level: " + getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingOptions == false)
            return false;
        LoggingOptions other = (LoggingOptions) obj;

        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }
}
