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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the status of a sensitive data finding.
 * </p>
 */
public class ClassificationResultStatus implements Serializable {
    /**
     * <p>
     * The status of the finding, such as COMPLETE.
     * </p>
     */
    private String code;

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this
     * value to notify you of any errors, warnings, or considerations that might
     * impact your analysis of the finding.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The status of the finding, such as COMPLETE.
     * </p>
     *
     * @return <p>
     *         The status of the finding, such as COMPLETE.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The status of the finding, such as COMPLETE.
     * </p>
     *
     * @param code <p>
     *            The status of the finding, such as COMPLETE.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status of the finding, such as COMPLETE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The status of the finding, such as COMPLETE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResultStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this
     * value to notify you of any errors, warnings, or considerations that might
     * impact your analysis of the finding.
     * </p>
     *
     * @return <p>
     *         A brief description of the status of the finding. Amazon Macie
     *         uses this value to notify you of any errors, warnings, or
     *         considerations that might impact your analysis of the finding.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this
     * value to notify you of any errors, warnings, or considerations that might
     * impact your analysis of the finding.
     * </p>
     *
     * @param reason <p>
     *            A brief description of the status of the finding. Amazon Macie
     *            uses this value to notify you of any errors, warnings, or
     *            considerations that might impact your analysis of the finding.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A brief description of the status of the finding. Amazon Macie uses this
     * value to notify you of any errors, warnings, or considerations that might
     * impact your analysis of the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            A brief description of the status of the finding. Amazon Macie
     *            uses this value to notify you of any errors, warnings, or
     *            considerations that might impact your analysis of the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassificationResultStatus withReason(String reason) {
        this.reason = reason;
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
        if (getCode() != null)
            sb.append("code: " + getCode() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationResultStatus == false)
            return false;
        ClassificationResultStatus other = (ClassificationResultStatus) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
