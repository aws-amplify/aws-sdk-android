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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of resource metadata for a given list of crawler names. After
 * calling the <code>ListCrawlers</code> operation, you can call this operation
 * to access the data to which you have been granted permissions. This operation
 * supports all IAM permissions, including permission conditions that uses tags.
 * </p>
 */
public class BatchGetCrawlersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of crawler names, which might be the names returned from the
     * <code>ListCrawlers</code> operation.
     * </p>
     */
    private java.util.List<String> crawlerNames;

    /**
     * <p>
     * A list of crawler names, which might be the names returned from the
     * <code>ListCrawlers</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of crawler names, which might be the names returned from
     *         the <code>ListCrawlers</code> operation.
     *         </p>
     */
    public java.util.List<String> getCrawlerNames() {
        return crawlerNames;
    }

    /**
     * <p>
     * A list of crawler names, which might be the names returned from the
     * <code>ListCrawlers</code> operation.
     * </p>
     *
     * @param crawlerNames <p>
     *            A list of crawler names, which might be the names returned
     *            from the <code>ListCrawlers</code> operation.
     *            </p>
     */
    public void setCrawlerNames(java.util.Collection<String> crawlerNames) {
        if (crawlerNames == null) {
            this.crawlerNames = null;
            return;
        }

        this.crawlerNames = new java.util.ArrayList<String>(crawlerNames);
    }

    /**
     * <p>
     * A list of crawler names, which might be the names returned from the
     * <code>ListCrawlers</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNames <p>
     *            A list of crawler names, which might be the names returned
     *            from the <code>ListCrawlers</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersRequest withCrawlerNames(String... crawlerNames) {
        if (getCrawlerNames() == null) {
            this.crawlerNames = new java.util.ArrayList<String>(crawlerNames.length);
        }
        for (String value : crawlerNames) {
            this.crawlerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of crawler names, which might be the names returned from the
     * <code>ListCrawlers</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNames <p>
     *            A list of crawler names, which might be the names returned
     *            from the <code>ListCrawlers</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCrawlersRequest withCrawlerNames(java.util.Collection<String> crawlerNames) {
        setCrawlerNames(crawlerNames);
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
        if (getCrawlerNames() != null)
            sb.append("CrawlerNames: " + getCrawlerNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerNames() == null) ? 0 : getCrawlerNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCrawlersRequest == false)
            return false;
        BatchGetCrawlersRequest other = (BatchGetCrawlersRequest) obj;

        if (other.getCrawlerNames() == null ^ this.getCrawlerNames() == null)
            return false;
        if (other.getCrawlerNames() != null
                && other.getCrawlerNames().equals(this.getCrawlerNames()) == false)
            return false;
        return true;
    }
}
