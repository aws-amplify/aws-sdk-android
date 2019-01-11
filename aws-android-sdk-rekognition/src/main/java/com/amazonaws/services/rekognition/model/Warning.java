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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class Warning implements Serializable {
    /**
     * The new value for the errorCode property for this object.
     */
    private String errorCode;

    /**
     * The new value for the message property for this object.
     */
    private String message;

    /**
     * The new value for the sections property for this object.
     */
    private java.util.List<Section> sections;

    /**
     * Returns the value of the errorCode property for this object.
     *
     * @return The value of the errorCode property for this object.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of errorCode
     *
     * @param errorCode The new value for the errorCode property for this
     *            object.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets the value of the errorCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode The new value for the errorCode property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns the value of the message property for this object.
     *
     * @return The value of the message property for this object.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of message
     *
     * @param message The new value for the message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets the value of the message property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message The new value for the message property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns the value of the sections property for this object.
     *
     * @return The value of the sections property for this object.
     */
    public java.util.List<Section> getSections() {
        return sections;
    }

    /**
     * Sets the value of sections
     *
     * @param sections The new value for the sections property for this object.
     */
    public void setSections(java.util.Collection<Section> sections) {
        if (sections == null) {
            this.sections = null;
            return;
        }

        this.sections = new java.util.ArrayList<Section>(sections);
    }

    /**
     * Sets the value of the sections property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sections The new value for the sections property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withSections(Section... sections) {
        if (getSections() == null) {
            this.sections = new java.util.ArrayList<Section>(sections.length);
        }
        for (Section value : sections) {
            this.sections.add(value);
        }
        return this;
    }

    /**
     * Sets the value of the sections property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sections The new value for the sections property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withSections(java.util.Collection<Section> sections) {
        setSections(sections);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSections() != null)
            sb.append("Sections: " + getSections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSections() == null) ? 0 : getSections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Warning == false)
            return false;
        Warning other = (Warning) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSections() == null ^ this.getSections() == null)
            return false;
        if (other.getSections() != null && other.getSections().equals(this.getSections()) == false)
            return false;
        return true;
    }
}
