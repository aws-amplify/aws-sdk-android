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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

/**
 * <p>
 * A time range, in percentage, between two points in your media file.
 * </p>
 * <p>
 * You can use <code>StartPercentage</code> and <code>EndPercentage</code> to
 * search a custom segment. For example, setting <code>StartPercentage</code> to
 * 10 and <code>EndPercentage</code> to 50 only searches for your specified
 * criteria in the audio contained between the 10 percent mark and the 50
 * percent mark of your media file.
 * </p>
 * <p>
 * You can use also <code>First</code> to search from the start of the media
 * file until the time that you specify. Or use <code>Last</code> to search from
 * the time that you specify until the end of the media file. For example,
 * setting <code>First</code> to 10 only searches for your specified criteria in
 * the audio contained in the first 10 percent of the media file.
 * </p>
 * <p>
 * If you prefer to use milliseconds instead of percentage, see .
 * </p>
 */
public class RelativeTimeRange implements Serializable {
    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the
     * specified criteria in your media file. If you include
     * <code>StartPercentage</code> in your request, you must also include
     * <code>EndPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer startPercentage;

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the
     * specified criteria in your media file. If you include
     * <code>EndPercentage</code> in your request, you must also include
     * <code>StartPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer endPercentage;

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the
     * specified value. Amazon Transcribe searches for your specified criteria
     * in this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer first;

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your
     * media file. Amazon Transcribe searches for your specified criteria in
     * this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer last;

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the
     * specified criteria in your media file. If you include
     * <code>StartPercentage</code> in your request, you must also include
     * <code>EndPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The time, in percentage, when Amazon Transcribe starts searching
     *         for the specified criteria in your media file. If you include
     *         <code>StartPercentage</code> in your request, you must also
     *         include <code>EndPercentage</code>.
     *         </p>
     */
    public Integer getStartPercentage() {
        return startPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the
     * specified criteria in your media file. If you include
     * <code>StartPercentage</code> in your request, you must also include
     * <code>EndPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param startPercentage <p>
     *            The time, in percentage, when Amazon Transcribe starts
     *            searching for the specified criteria in your media file. If
     *            you include <code>StartPercentage</code> in your request, you
     *            must also include <code>EndPercentage</code>.
     *            </p>
     */
    public void setStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe starts searching for the
     * specified criteria in your media file. If you include
     * <code>StartPercentage</code> in your request, you must also include
     * <code>EndPercentage</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param startPercentage <p>
     *            The time, in percentage, when Amazon Transcribe starts
     *            searching for the specified criteria in your media file. If
     *            you include <code>StartPercentage</code> in your request, you
     *            must also include <code>EndPercentage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withStartPercentage(Integer startPercentage) {
        this.startPercentage = startPercentage;
        return this;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the
     * specified criteria in your media file. If you include
     * <code>EndPercentage</code> in your request, you must also include
     * <code>StartPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The time, in percentage, when Amazon Transcribe stops searching
     *         for the specified criteria in your media file. If you include
     *         <code>EndPercentage</code> in your request, you must also include
     *         <code>StartPercentage</code>.
     *         </p>
     */
    public Integer getEndPercentage() {
        return endPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the
     * specified criteria in your media file. If you include
     * <code>EndPercentage</code> in your request, you must also include
     * <code>StartPercentage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param endPercentage <p>
     *            The time, in percentage, when Amazon Transcribe stops
     *            searching for the specified criteria in your media file. If
     *            you include <code>EndPercentage</code> in your request, you
     *            must also include <code>StartPercentage</code>.
     *            </p>
     */
    public void setEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
    }

    /**
     * <p>
     * The time, in percentage, when Amazon Transcribe stops searching for the
     * specified criteria in your media file. If you include
     * <code>EndPercentage</code> in your request, you must also include
     * <code>StartPercentage</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param endPercentage <p>
     *            The time, in percentage, when Amazon Transcribe stops
     *            searching for the specified criteria in your media file. If
     *            you include <code>EndPercentage</code> in your request, you
     *            must also include <code>StartPercentage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withEndPercentage(Integer endPercentage) {
        this.endPercentage = endPercentage;
        return this;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the
     * specified value. Amazon Transcribe searches for your specified criteria
     * in this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The time, in percentage, from the start of your media file until
     *         the specified value. Amazon Transcribe searches for your
     *         specified criteria in this time segment.
     *         </p>
     */
    public Integer getFirst() {
        return first;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the
     * specified value. Amazon Transcribe searches for your specified criteria
     * in this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param first <p>
     *            The time, in percentage, from the start of your media file
     *            until the specified value. Amazon Transcribe searches for your
     *            specified criteria in this time segment.
     *            </p>
     */
    public void setFirst(Integer first) {
        this.first = first;
    }

    /**
     * <p>
     * The time, in percentage, from the start of your media file until the
     * specified value. Amazon Transcribe searches for your specified criteria
     * in this time segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param first <p>
     *            The time, in percentage, from the start of your media file
     *            until the specified value. Amazon Transcribe searches for your
     *            specified criteria in this time segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withFirst(Integer first) {
        this.first = first;
        return this;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your
     * media file. Amazon Transcribe searches for your specified criteria in
     * this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The time, in percentage, from the specified value until the end
     *         of your media file. Amazon Transcribe searches for your specified
     *         criteria in this time segment.
     *         </p>
     */
    public Integer getLast() {
        return last;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your
     * media file. Amazon Transcribe searches for your specified criteria in
     * this time segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param last <p>
     *            The time, in percentage, from the specified value until the
     *            end of your media file. Amazon Transcribe searches for your
     *            specified criteria in this time segment.
     *            </p>
     */
    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * <p>
     * The time, in percentage, from the specified value until the end of your
     * media file. Amazon Transcribe searches for your specified criteria in
     * this time segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param last <p>
     *            The time, in percentage, from the specified value until the
     *            end of your media file. Amazon Transcribe searches for your
     *            specified criteria in this time segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelativeTimeRange withLast(Integer last) {
        this.last = last;
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
        if (getStartPercentage() != null)
            sb.append("StartPercentage: " + getStartPercentage() + ",");
        if (getEndPercentage() != null)
            sb.append("EndPercentage: " + getEndPercentage() + ",");
        if (getFirst() != null)
            sb.append("First: " + getFirst() + ",");
        if (getLast() != null)
            sb.append("Last: " + getLast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartPercentage() == null) ? 0 : getStartPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getEndPercentage() == null) ? 0 : getEndPercentage().hashCode());
        hashCode = prime * hashCode + ((getFirst() == null) ? 0 : getFirst().hashCode());
        hashCode = prime * hashCode + ((getLast() == null) ? 0 : getLast().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelativeTimeRange == false)
            return false;
        RelativeTimeRange other = (RelativeTimeRange) obj;

        if (other.getStartPercentage() == null ^ this.getStartPercentage() == null)
            return false;
        if (other.getStartPercentage() != null
                && other.getStartPercentage().equals(this.getStartPercentage()) == false)
            return false;
        if (other.getEndPercentage() == null ^ this.getEndPercentage() == null)
            return false;
        if (other.getEndPercentage() != null
                && other.getEndPercentage().equals(this.getEndPercentage()) == false)
            return false;
        if (other.getFirst() == null ^ this.getFirst() == null)
            return false;
        if (other.getFirst() != null && other.getFirst().equals(this.getFirst()) == false)
            return false;
        if (other.getLast() == null ^ this.getLast() == null)
            return false;
        if (other.getLast() != null && other.getLast().equals(this.getLast()) == false)
            return false;
        return true;
    }
}
