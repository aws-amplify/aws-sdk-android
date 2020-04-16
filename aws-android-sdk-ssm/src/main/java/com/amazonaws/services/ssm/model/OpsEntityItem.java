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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The OpsItem summaries result item.
 * </p>
 */
public class OpsEntityItem implements Serializable {
    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     */
    private String captureTime;

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> content;

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @return <p>
     *         The time OpsItem data was captured.
     *         </p>
     */
    public String getCaptureTime() {
        return captureTime;
    }

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time OpsItem data was captured.
     *            </p>
     */
    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * The time OpsItem data was captured.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T
     * )(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$<br/>
     *
     * @param captureTime <p>
     *            The time OpsItem data was captured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntityItem withCaptureTime(String captureTime) {
        this.captureTime = captureTime;
        return this;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     *
     * @return <p>
     *         The detailed data content for an OpsItem summaries result item.
     *         </p>
     */
    public java.util.List<java.util.Map<String, String>> getContent() {
        return content;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     *
     * @param content <p>
     *            The detailed data content for an OpsItem summaries result
     *            item.
     *            </p>
     */
    public void setContent(java.util.Collection<java.util.Map<String, String>> content) {
        if (content == null) {
            this.content = null;
            return;
        }

        this.content = new java.util.ArrayList<java.util.Map<String, String>>(content);
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The detailed data content for an OpsItem summaries result
     *            item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntityItem withContent(java.util.Map<String, String>... content) {
        if (getContent() == null) {
            this.content = new java.util.ArrayList<java.util.Map<String, String>>(content.length);
        }
        for (java.util.Map<String, String> value : content) {
            this.content.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The detailed data content for an OpsItem summaries result item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The detailed data content for an OpsItem summaries result
     *            item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsEntityItem withContent(java.util.Collection<java.util.Map<String, String>> content) {
        setContent(content);
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
        if (getCaptureTime() != null)
            sb.append("CaptureTime: " + getCaptureTime() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsEntityItem == false)
            return false;
        OpsEntityItem other = (OpsEntityItem) obj;

        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null
                && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
