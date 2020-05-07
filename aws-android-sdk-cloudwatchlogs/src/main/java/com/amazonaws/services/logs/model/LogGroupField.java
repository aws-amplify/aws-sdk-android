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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * The fields contained in log events found by a <code>GetLogGroupFields</code>
 * operation, along with the percentage of queried log events in which each
 * field appears.
 * </p>
 */
public class LogGroupField implements Serializable {
    /**
     * <p>
     * The name of a log field.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer percent;

    /**
     * <p>
     * The name of a log field.
     * </p>
     *
     * @return <p>
     *         The name of a log field.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a log field.
     * </p>
     *
     * @param name <p>
     *            The name of a log field.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a log field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of a log field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroupField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of log events queried that contained the field.
     *         </p>
     */
    public Integer getPercent() {
        return percent;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percent <p>
     *            The percentage of log events queried that contained the field.
     *            </p>
     */
    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    /**
     * <p>
     * The percentage of log events queried that contained the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param percent <p>
     *            The percentage of log events queried that contained the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroupField withPercent(Integer percent) {
        this.percent = percent;
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
            sb.append("name: " + getName() + ",");
        if (getPercent() != null)
            sb.append("percent: " + getPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPercent() == null) ? 0 : getPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroupField == false)
            return false;
        LogGroupField other = (LogGroupField) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPercent() == null ^ this.getPercent() == null)
            return false;
        if (other.getPercent() != null && other.getPercent().equals(this.getPercent()) == false)
            return false;
        return true;
    }
}
