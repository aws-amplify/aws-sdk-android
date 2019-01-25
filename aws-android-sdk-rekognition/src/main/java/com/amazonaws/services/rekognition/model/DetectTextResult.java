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

public class DetectTextResult implements Serializable {
    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     */
    private java.util.List<TextDetection> textDetections;

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     *
     * @return <p>
     *         An array of text that was detected in the input image.
     *         </p>
     */
    public java.util.List<TextDetection> getTextDetections() {
        return textDetections;
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     *
     * @param textDetections <p>
     *            An array of text that was detected in the input image.
     *            </p>
     */
    public void setTextDetections(java.util.Collection<TextDetection> textDetections) {
        if (textDetections == null) {
            this.textDetections = null;
            return;
        }

        this.textDetections = new java.util.ArrayList<TextDetection>(textDetections);
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDetections <p>
     *            An array of text that was detected in the input image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextResult withTextDetections(TextDetection... textDetections) {
        if (getTextDetections() == null) {
            this.textDetections = new java.util.ArrayList<TextDetection>(textDetections.length);
        }
        for (TextDetection value : textDetections) {
            this.textDetections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of text that was detected in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDetections <p>
     *            An array of text that was detected in the input image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextResult withTextDetections(java.util.Collection<TextDetection> textDetections) {
        setTextDetections(textDetections);
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
        if (getTextDetections() != null)
            sb.append("TextDetections: " + getTextDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTextDetections() == null) ? 0 : getTextDetections().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTextResult == false)
            return false;
        DetectTextResult other = (DetectTextResult) obj;

        if (other.getTextDetections() == null ^ this.getTextDetections() == null)
            return false;
        if (other.getTextDetections() != null
                && other.getTextDetections().equals(this.getTextDetections()) == false)
            return false;
        return true;
    }
}
