/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A set of optional parameters that you can use to set the criteria that the
 * text must meet to be included in your response. <code>WordFilter</code> looks
 * at a word’s height, width, and minimum confidence.
 * <code>RegionOfInterest</code> lets you set a specific region of the image to
 * look for text in.
 * </p>
 */
public class DetectTextFilters implements Serializable {
    /**
     * <p>
     * A set of parameters that allow you to filter out certain results from
     * your returned results.
     * </p>
     */
    private DetectionFilter wordFilter;

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a
     * <code>BoundingBox</code> object to set the region of the image.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterest;

    /**
     * <p>
     * A set of parameters that allow you to filter out certain results from
     * your returned results.
     * </p>
     *
     * @return <p>
     *         A set of parameters that allow you to filter out certain results
     *         from your returned results.
     *         </p>
     */
    public DetectionFilter getWordFilter() {
        return wordFilter;
    }

    /**
     * <p>
     * A set of parameters that allow you to filter out certain results from
     * your returned results.
     * </p>
     *
     * @param wordFilter <p>
     *            A set of parameters that allow you to filter out certain
     *            results from your returned results.
     *            </p>
     */
    public void setWordFilter(DetectionFilter wordFilter) {
        this.wordFilter = wordFilter;
    }

    /**
     * <p>
     * A set of parameters that allow you to filter out certain results from
     * your returned results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param wordFilter <p>
     *            A set of parameters that allow you to filter out certain
     *            results from your returned results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextFilters withWordFilter(DetectionFilter wordFilter) {
        this.wordFilter = wordFilter;
        return this;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a
     * <code>BoundingBox</code> object to set the region of the image.
     * </p>
     *
     * @return <p>
     *         A Filter focusing on a certain area of the image. Uses a
     *         <code>BoundingBox</code> object to set the region of the image.
     *         </p>
     */
    public java.util.List<RegionOfInterest> getRegionsOfInterest() {
        return regionsOfInterest;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a
     * <code>BoundingBox</code> object to set the region of the image.
     * </p>
     *
     * @param regionsOfInterest <p>
     *            A Filter focusing on a certain area of the image. Uses a
     *            <code>BoundingBox</code> object to set the region of the
     *            image.
     *            </p>
     */
    public void setRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        if (regionsOfInterest == null) {
            this.regionsOfInterest = null;
            return;
        }

        this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(regionsOfInterest);
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a
     * <code>BoundingBox</code> object to set the region of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterest <p>
     *            A Filter focusing on a certain area of the image. Uses a
     *            <code>BoundingBox</code> object to set the region of the
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextFilters withRegionsOfInterest(RegionOfInterest... regionsOfInterest) {
        if (getRegionsOfInterest() == null) {
            this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(
                    regionsOfInterest.length);
        }
        for (RegionOfInterest value : regionsOfInterest) {
            this.regionsOfInterest.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a
     * <code>BoundingBox</code> object to set the region of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterest <p>
     *            A Filter focusing on a certain area of the image. Uses a
     *            <code>BoundingBox</code> object to set the region of the
     *            image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectTextFilters withRegionsOfInterest(
            java.util.Collection<RegionOfInterest> regionsOfInterest) {
        setRegionsOfInterest(regionsOfInterest);
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
        if (getWordFilter() != null)
            sb.append("WordFilter: " + getWordFilter() + ",");
        if (getRegionsOfInterest() != null)
            sb.append("RegionsOfInterest: " + getRegionsOfInterest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWordFilter() == null) ? 0 : getWordFilter().hashCode());
        hashCode = prime * hashCode
                + ((getRegionsOfInterest() == null) ? 0 : getRegionsOfInterest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTextFilters == false)
            return false;
        DetectTextFilters other = (DetectTextFilters) obj;

        if (other.getWordFilter() == null ^ this.getWordFilter() == null)
            return false;
        if (other.getWordFilter() != null
                && other.getWordFilter().equals(this.getWordFilter()) == false)
            return false;
        if (other.getRegionsOfInterest() == null ^ this.getRegionsOfInterest() == null)
            return false;
        if (other.getRegionsOfInterest() != null
                && other.getRegionsOfInterest().equals(this.getRegionsOfInterest()) == false)
            return false;
        return true;
    }
}
