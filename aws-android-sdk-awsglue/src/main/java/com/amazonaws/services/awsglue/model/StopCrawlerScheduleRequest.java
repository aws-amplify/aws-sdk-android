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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the schedule state of the specified crawler to
 * <code>NOT_SCHEDULED</code>, but does not stop the crawler if it is already
 * running.
 * </p>
 */
public class StopCrawlerScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the crawler whose schedule state to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String crawlerName;

    /**
     * <p>
     * Name of the crawler whose schedule state to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the crawler whose schedule state to set.
     *         </p>
     */
    public String getCrawlerName() {
        return crawlerName;
    }

    /**
     * <p>
     * Name of the crawler whose schedule state to set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            Name of the crawler whose schedule state to set.
     *            </p>
     */
    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * Name of the crawler whose schedule state to set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            Name of the crawler whose schedule state to set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopCrawlerScheduleRequest withCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
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
        if (getCrawlerName() != null)
            sb.append("CrawlerName: " + getCrawlerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopCrawlerScheduleRequest == false)
            return false;
        StopCrawlerScheduleRequest other = (StopCrawlerScheduleRequest) obj;

        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null
                && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        return true;
    }
}
