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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Metrics for a specified crawler.
 * </p>
 */
public class CrawlerMetrics implements Serializable {
    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String crawlerName;

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double timeLeftSeconds;

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete
     * this run.
     * </p>
     */
    private Boolean stillEstimating;

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double lastRuntimeSeconds;

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Double medianRuntimeSeconds;

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer tablesCreated;

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer tablesUpdated;

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer tablesDeleted;

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the crawler.
     *         </p>
     */
    public String getCrawlerName() {
        return crawlerName;
    }

    /**
     * <p>
     * The name of the crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler.
     *            </p>
     */
    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler.
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
     *            The name of the crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The estimated time left to complete a running crawl.
     *         </p>
     */
    public Double getTimeLeftSeconds() {
        return timeLeftSeconds;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timeLeftSeconds <p>
     *            The estimated time left to complete a running crawl.
     *            </p>
     */
    public void setTimeLeftSeconds(Double timeLeftSeconds) {
        this.timeLeftSeconds = timeLeftSeconds;
    }

    /**
     * <p>
     * The estimated time left to complete a running crawl.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timeLeftSeconds <p>
     *            The estimated time left to complete a running crawl.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withTimeLeftSeconds(Double timeLeftSeconds) {
        this.timeLeftSeconds = timeLeftSeconds;
        return this;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete
     * this run.
     * </p>
     *
     * @return <p>
     *         True if the crawler is still estimating how long it will take to
     *         complete this run.
     *         </p>
     */
    public Boolean isStillEstimating() {
        return stillEstimating;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete
     * this run.
     * </p>
     *
     * @return <p>
     *         True if the crawler is still estimating how long it will take to
     *         complete this run.
     *         </p>
     */
    public Boolean getStillEstimating() {
        return stillEstimating;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete
     * this run.
     * </p>
     *
     * @param stillEstimating <p>
     *            True if the crawler is still estimating how long it will take
     *            to complete this run.
     *            </p>
     */
    public void setStillEstimating(Boolean stillEstimating) {
        this.stillEstimating = stillEstimating;
    }

    /**
     * <p>
     * True if the crawler is still estimating how long it will take to complete
     * this run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stillEstimating <p>
     *            True if the crawler is still estimating how long it will take
     *            to complete this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withStillEstimating(Boolean stillEstimating) {
        this.stillEstimating = stillEstimating;
        return this;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The duration of the crawler's most recent run, in seconds.
     *         </p>
     */
    public Double getLastRuntimeSeconds() {
        return lastRuntimeSeconds;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastRuntimeSeconds <p>
     *            The duration of the crawler's most recent run, in seconds.
     *            </p>
     */
    public void setLastRuntimeSeconds(Double lastRuntimeSeconds) {
        this.lastRuntimeSeconds = lastRuntimeSeconds;
    }

    /**
     * <p>
     * The duration of the crawler's most recent run, in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lastRuntimeSeconds <p>
     *            The duration of the crawler's most recent run, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withLastRuntimeSeconds(Double lastRuntimeSeconds) {
        this.lastRuntimeSeconds = lastRuntimeSeconds;
        return this;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The median duration of this crawler's runs, in seconds.
     *         </p>
     */
    public Double getMedianRuntimeSeconds() {
        return medianRuntimeSeconds;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param medianRuntimeSeconds <p>
     *            The median duration of this crawler's runs, in seconds.
     *            </p>
     */
    public void setMedianRuntimeSeconds(Double medianRuntimeSeconds) {
        this.medianRuntimeSeconds = medianRuntimeSeconds;
    }

    /**
     * <p>
     * The median duration of this crawler's runs, in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param medianRuntimeSeconds <p>
     *            The median duration of this crawler's runs, in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withMedianRuntimeSeconds(Double medianRuntimeSeconds) {
        this.medianRuntimeSeconds = medianRuntimeSeconds;
        return this;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of tables created by this crawler.
     *         </p>
     */
    public Integer getTablesCreated() {
        return tablesCreated;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesCreated <p>
     *            The number of tables created by this crawler.
     *            </p>
     */
    public void setTablesCreated(Integer tablesCreated) {
        this.tablesCreated = tablesCreated;
    }

    /**
     * <p>
     * The number of tables created by this crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesCreated <p>
     *            The number of tables created by this crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withTablesCreated(Integer tablesCreated) {
        this.tablesCreated = tablesCreated;
        return this;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of tables updated by this crawler.
     *         </p>
     */
    public Integer getTablesUpdated() {
        return tablesUpdated;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesUpdated <p>
     *            The number of tables updated by this crawler.
     *            </p>
     */
    public void setTablesUpdated(Integer tablesUpdated) {
        this.tablesUpdated = tablesUpdated;
    }

    /**
     * <p>
     * The number of tables updated by this crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesUpdated <p>
     *            The number of tables updated by this crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withTablesUpdated(Integer tablesUpdated) {
        this.tablesUpdated = tablesUpdated;
        return this;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of tables deleted by this crawler.
     *         </p>
     */
    public Integer getTablesDeleted() {
        return tablesDeleted;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesDeleted <p>
     *            The number of tables deleted by this crawler.
     *            </p>
     */
    public void setTablesDeleted(Integer tablesDeleted) {
        this.tablesDeleted = tablesDeleted;
    }

    /**
     * <p>
     * The number of tables deleted by this crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param tablesDeleted <p>
     *            The number of tables deleted by this crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CrawlerMetrics withTablesDeleted(Integer tablesDeleted) {
        this.tablesDeleted = tablesDeleted;
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
            sb.append("CrawlerName: " + getCrawlerName() + ",");
        if (getTimeLeftSeconds() != null)
            sb.append("TimeLeftSeconds: " + getTimeLeftSeconds() + ",");
        if (getStillEstimating() != null)
            sb.append("StillEstimating: " + getStillEstimating() + ",");
        if (getLastRuntimeSeconds() != null)
            sb.append("LastRuntimeSeconds: " + getLastRuntimeSeconds() + ",");
        if (getMedianRuntimeSeconds() != null)
            sb.append("MedianRuntimeSeconds: " + getMedianRuntimeSeconds() + ",");
        if (getTablesCreated() != null)
            sb.append("TablesCreated: " + getTablesCreated() + ",");
        if (getTablesUpdated() != null)
            sb.append("TablesUpdated: " + getTablesUpdated() + ",");
        if (getTablesDeleted() != null)
            sb.append("TablesDeleted: " + getTablesDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode
                + ((getTimeLeftSeconds() == null) ? 0 : getTimeLeftSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getStillEstimating() == null) ? 0 : getStillEstimating().hashCode());
        hashCode = prime * hashCode
                + ((getLastRuntimeSeconds() == null) ? 0 : getLastRuntimeSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getMedianRuntimeSeconds() == null) ? 0 : getMedianRuntimeSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getTablesCreated() == null) ? 0 : getTablesCreated().hashCode());
        hashCode = prime * hashCode
                + ((getTablesUpdated() == null) ? 0 : getTablesUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getTablesDeleted() == null) ? 0 : getTablesDeleted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlerMetrics == false)
            return false;
        CrawlerMetrics other = (CrawlerMetrics) obj;

        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null
                && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getTimeLeftSeconds() == null ^ this.getTimeLeftSeconds() == null)
            return false;
        if (other.getTimeLeftSeconds() != null
                && other.getTimeLeftSeconds().equals(this.getTimeLeftSeconds()) == false)
            return false;
        if (other.getStillEstimating() == null ^ this.getStillEstimating() == null)
            return false;
        if (other.getStillEstimating() != null
                && other.getStillEstimating().equals(this.getStillEstimating()) == false)
            return false;
        if (other.getLastRuntimeSeconds() == null ^ this.getLastRuntimeSeconds() == null)
            return false;
        if (other.getLastRuntimeSeconds() != null
                && other.getLastRuntimeSeconds().equals(this.getLastRuntimeSeconds()) == false)
            return false;
        if (other.getMedianRuntimeSeconds() == null ^ this.getMedianRuntimeSeconds() == null)
            return false;
        if (other.getMedianRuntimeSeconds() != null
                && other.getMedianRuntimeSeconds().equals(this.getMedianRuntimeSeconds()) == false)
            return false;
        if (other.getTablesCreated() == null ^ this.getTablesCreated() == null)
            return false;
        if (other.getTablesCreated() != null
                && other.getTablesCreated().equals(this.getTablesCreated()) == false)
            return false;
        if (other.getTablesUpdated() == null ^ this.getTablesUpdated() == null)
            return false;
        if (other.getTablesUpdated() != null
                && other.getTablesUpdated().equals(this.getTablesUpdated()) == false)
            return false;
        if (other.getTablesDeleted() == null ^ this.getTablesDeleted() == null)
            return false;
        if (other.getTablesDeleted() != null
                && other.getTablesDeleted().equals(this.getTablesDeleted()) == false)
            return false;
        return true;
    }
}
