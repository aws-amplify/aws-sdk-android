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

public class GetCrawlerMetricsResult implements Serializable {
    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     */
    private java.util.List<CrawlerMetrics> crawlerMetricsList;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     *
     * @return <p>
     *         A list of metrics for the specified crawler.
     *         </p>
     */
    public java.util.List<CrawlerMetrics> getCrawlerMetricsList() {
        return crawlerMetricsList;
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     *
     * @param crawlerMetricsList <p>
     *            A list of metrics for the specified crawler.
     *            </p>
     */
    public void setCrawlerMetricsList(java.util.Collection<CrawlerMetrics> crawlerMetricsList) {
        if (crawlerMetricsList == null) {
            this.crawlerMetricsList = null;
            return;
        }

        this.crawlerMetricsList = new java.util.ArrayList<CrawlerMetrics>(crawlerMetricsList);
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerMetricsList <p>
     *            A list of metrics for the specified crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsResult withCrawlerMetricsList(CrawlerMetrics... crawlerMetricsList) {
        if (getCrawlerMetricsList() == null) {
            this.crawlerMetricsList = new java.util.ArrayList<CrawlerMetrics>(
                    crawlerMetricsList.length);
        }
        for (CrawlerMetrics value : crawlerMetricsList) {
            this.crawlerMetricsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics for the specified crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerMetricsList <p>
     *            A list of metrics for the specified crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsResult withCrawlerMetricsList(
            java.util.Collection<CrawlerMetrics> crawlerMetricsList) {
        setCrawlerMetricsList(crawlerMetricsList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCrawlerMetricsList() != null)
            sb.append("CrawlerMetricsList: " + getCrawlerMetricsList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerMetricsList() == null) ? 0 : getCrawlerMetricsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCrawlerMetricsResult == false)
            return false;
        GetCrawlerMetricsResult other = (GetCrawlerMetricsResult) obj;

        if (other.getCrawlerMetricsList() == null ^ this.getCrawlerMetricsList() == null)
            return false;
        if (other.getCrawlerMetricsList() != null
                && other.getCrawlerMetricsList().equals(this.getCrawlerMetricsList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
