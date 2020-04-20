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

public class BatchGetCrawlersResult implements Serializable {
    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     */
    private java.util.List<Crawler> crawlers;

    /**
     * <p>
     * A list of names of crawlers that were not found.
     * </p>
     */
    private java.util.List<String> crawlersNotFound;

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     *
     * @return <p>
     *         A list of crawler definitions.
     *         </p>
     */
    public java.util.List<Crawler> getCrawlers() {
        return crawlers;
    }

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     *
     * @param crawlers <p>
     *            A list of crawler definitions.
     *            </p>
     */
    public void setCrawlers(java.util.Collection<Crawler> crawlers) {
        if (crawlers == null) {
            this.crawlers = null;
            return;
        }

        this.crawlers = new java.util.ArrayList<Crawler>(crawlers);
    }

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlers <p>
     *            A list of crawler definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersResult withCrawlers(Crawler... crawlers) {
        if (getCrawlers() == null) {
            this.crawlers = new java.util.ArrayList<Crawler>(crawlers.length);
        }
        for (Crawler value : crawlers) {
            this.crawlers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of crawler definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlers <p>
     *            A list of crawler definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersResult withCrawlers(java.util.Collection<Crawler> crawlers) {
        setCrawlers(crawlers);
        return this;
    }

    /**
     * <p>
     * A list of names of crawlers that were not found.
     * </p>
     *
     * @return <p>
     *         A list of names of crawlers that were not found.
     *         </p>
     */
    public java.util.List<String> getCrawlersNotFound() {
        return crawlersNotFound;
    }

    /**
     * <p>
     * A list of names of crawlers that were not found.
     * </p>
     *
     * @param crawlersNotFound <p>
     *            A list of names of crawlers that were not found.
     *            </p>
     */
    public void setCrawlersNotFound(java.util.Collection<String> crawlersNotFound) {
        if (crawlersNotFound == null) {
            this.crawlersNotFound = null;
            return;
        }

        this.crawlersNotFound = new java.util.ArrayList<String>(crawlersNotFound);
    }

    /**
     * <p>
     * A list of names of crawlers that were not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlersNotFound <p>
     *            A list of names of crawlers that were not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersResult withCrawlersNotFound(String... crawlersNotFound) {
        if (getCrawlersNotFound() == null) {
            this.crawlersNotFound = new java.util.ArrayList<String>(crawlersNotFound.length);
        }
        for (String value : crawlersNotFound) {
            this.crawlersNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of crawlers that were not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlersNotFound <p>
     *            A list of names of crawlers that were not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersResult withCrawlersNotFound(java.util.Collection<String> crawlersNotFound) {
        setCrawlersNotFound(crawlersNotFound);
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
        if (getCrawlers() != null)
            sb.append("Crawlers: " + getCrawlers() + ",");
        if (getCrawlersNotFound() != null)
            sb.append("CrawlersNotFound: " + getCrawlersNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlers() == null) ? 0 : getCrawlers().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlersNotFound() == null) ? 0 : getCrawlersNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCrawlersResult == false)
            return false;
        BatchGetCrawlersResult other = (BatchGetCrawlersResult) obj;

        if (other.getCrawlers() == null ^ this.getCrawlers() == null)
            return false;
        if (other.getCrawlers() != null && other.getCrawlers().equals(this.getCrawlers()) == false)
            return false;
        if (other.getCrawlersNotFound() == null ^ this.getCrawlersNotFound() == null)
            return false;
        if (other.getCrawlersNotFound() != null
                && other.getCrawlersNotFound().equals(this.getCrawlersNotFound()) == false)
            return false;
        return true;
    }
}
