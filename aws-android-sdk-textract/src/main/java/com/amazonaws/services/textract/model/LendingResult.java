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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the detections for each page analyzed through the Analyze Lending
 * API.
 * </p>
 */
public class LendingResult implements Serializable {
    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer page;

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     */
    private PageClassification pageClassification;

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value
     * pairs instead of raw OCR detections .
     * </p>
     */
    private java.util.List<Extraction> extractions;

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The page number for a page, with regard to whole submission.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param page <p>
     *            The page number for a page, with regard to whole submission.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * The page number for a page, with regard to whole submission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param page <p>
     *            The page number for a page, with regard to whole submission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingResult withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     *
     * @return <p>
     *         The classifier result for a given page.
     *         </p>
     */
    public PageClassification getPageClassification() {
        return pageClassification;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     *
     * @param pageClassification <p>
     *            The classifier result for a given page.
     *            </p>
     */
    public void setPageClassification(PageClassification pageClassification) {
        this.pageClassification = pageClassification;
    }

    /**
     * <p>
     * The classifier result for a given page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageClassification <p>
     *            The classifier result for a given page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingResult withPageClassification(PageClassification pageClassification) {
        this.pageClassification = pageClassification;
        return this;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value
     * pairs instead of raw OCR detections .
     * </p>
     *
     * @return <p>
     *         An array of Extraction to hold structured data. e.g. normalized
     *         key value pairs instead of raw OCR detections .
     *         </p>
     */
    public java.util.List<Extraction> getExtractions() {
        return extractions;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value
     * pairs instead of raw OCR detections .
     * </p>
     *
     * @param extractions <p>
     *            An array of Extraction to hold structured data. e.g.
     *            normalized key value pairs instead of raw OCR detections .
     *            </p>
     */
    public void setExtractions(java.util.Collection<Extraction> extractions) {
        if (extractions == null) {
            this.extractions = null;
            return;
        }

        this.extractions = new java.util.ArrayList<Extraction>(extractions);
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value
     * pairs instead of raw OCR detections .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractions <p>
     *            An array of Extraction to hold structured data. e.g.
     *            normalized key value pairs instead of raw OCR detections .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingResult withExtractions(Extraction... extractions) {
        if (getExtractions() == null) {
            this.extractions = new java.util.ArrayList<Extraction>(extractions.length);
        }
        for (Extraction value : extractions) {
            this.extractions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Extraction to hold structured data. e.g. normalized key value
     * pairs instead of raw OCR detections .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractions <p>
     *            An array of Extraction to hold structured data. e.g.
     *            normalized key value pairs instead of raw OCR detections .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LendingResult withExtractions(java.util.Collection<Extraction> extractions) {
        setExtractions(extractions);
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
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getPageClassification() != null)
            sb.append("PageClassification: " + getPageClassification() + ",");
        if (getExtractions() != null)
            sb.append("Extractions: " + getExtractions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode
                + ((getPageClassification() == null) ? 0 : getPageClassification().hashCode());
        hashCode = prime * hashCode
                + ((getExtractions() == null) ? 0 : getExtractions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingResult == false)
            return false;
        LendingResult other = (LendingResult) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getPageClassification() == null ^ this.getPageClassification() == null)
            return false;
        if (other.getPageClassification() != null
                && other.getPageClassification().equals(this.getPageClassification()) == false)
            return false;
        if (other.getExtractions() == null ^ this.getExtractions() == null)
            return false;
        if (other.getExtractions() != null
                && other.getExtractions().equals(this.getExtractions()) == false)
            return false;
        return true;
    }
}
