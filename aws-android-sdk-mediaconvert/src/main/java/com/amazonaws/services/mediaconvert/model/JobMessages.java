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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Provides messages from the service about jobs that you have already
 * successfully submitted.
 */
public class JobMessages implements Serializable {
    /**
     * List of messages that are informational only and don't indicate a problem
     * with your job.
     */
    private java.util.List<String> info;

    /**
     * List of messages that warn about conditions that might cause your job not
     * to run or to fail.
     */
    private java.util.List<String> warning;

    /**
     * List of messages that are informational only and don't indicate a problem
     * with your job.
     *
     * @return List of messages that are informational only and don't indicate a
     *         problem with your job.
     */
    public java.util.List<String> getInfo() {
        return info;
    }

    /**
     * List of messages that are informational only and don't indicate a problem
     * with your job.
     *
     * @param info List of messages that are informational only and don't
     *            indicate a problem with your job.
     */
    public void setInfo(java.util.Collection<String> info) {
        if (info == null) {
            this.info = null;
            return;
        }

        this.info = new java.util.ArrayList<String>(info);
    }

    /**
     * List of messages that are informational only and don't indicate a problem
     * with your job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param info List of messages that are informational only and don't
     *            indicate a problem with your job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMessages withInfo(String... info) {
        if (getInfo() == null) {
            this.info = new java.util.ArrayList<String>(info.length);
        }
        for (String value : info) {
            this.info.add(value);
        }
        return this;
    }

    /**
     * List of messages that are informational only and don't indicate a problem
     * with your job.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param info List of messages that are informational only and don't
     *            indicate a problem with your job.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMessages withInfo(java.util.Collection<String> info) {
        setInfo(info);
        return this;
    }

    /**
     * List of messages that warn about conditions that might cause your job not
     * to run or to fail.
     *
     * @return List of messages that warn about conditions that might cause your
     *         job not to run or to fail.
     */
    public java.util.List<String> getWarning() {
        return warning;
    }

    /**
     * List of messages that warn about conditions that might cause your job not
     * to run or to fail.
     *
     * @param warning List of messages that warn about conditions that might
     *            cause your job not to run or to fail.
     */
    public void setWarning(java.util.Collection<String> warning) {
        if (warning == null) {
            this.warning = null;
            return;
        }

        this.warning = new java.util.ArrayList<String>(warning);
    }

    /**
     * List of messages that warn about conditions that might cause your job not
     * to run or to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warning List of messages that warn about conditions that might
     *            cause your job not to run or to fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMessages withWarning(String... warning) {
        if (getWarning() == null) {
            this.warning = new java.util.ArrayList<String>(warning.length);
        }
        for (String value : warning) {
            this.warning.add(value);
        }
        return this;
    }

    /**
     * List of messages that warn about conditions that might cause your job not
     * to run or to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param warning List of messages that warn about conditions that might
     *            cause your job not to run or to fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobMessages withWarning(java.util.Collection<String> warning) {
        setWarning(warning);
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
        if (getInfo() != null)
            sb.append("Info: " + getInfo() + ",");
        if (getWarning() != null)
            sb.append("Warning: " + getWarning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobMessages == false)
            return false;
        JobMessages other = (JobMessages) obj;

        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
    }
}
