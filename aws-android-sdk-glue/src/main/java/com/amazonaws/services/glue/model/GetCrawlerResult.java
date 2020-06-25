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

public class GetCrawlerResult implements Serializable {
    /**
     * <p>
     * The metadata for the specified crawler.
     * </p>
     */
    private Crawler crawler;

    /**
     * <p>
     * The metadata for the specified crawler.
     * </p>
     *
     * @return <p>
     *         The metadata for the specified crawler.
     *         </p>
     */
    public Crawler getCrawler() {
        return crawler;
    }

    /**
     * <p>
     * The metadata for the specified crawler.
     * </p>
     *
     * @param crawler <p>
     *            The metadata for the specified crawler.
     *            </p>
     */
    public void setCrawler(Crawler crawler) {
        this.crawler = crawler;
    }

    /**
     * <p>
     * The metadata for the specified crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawler <p>
     *            The metadata for the specified crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerResult withCrawler(Crawler crawler) {
        this.crawler = crawler;
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
        if (getCrawler() != null)
            sb.append("Crawler: " + getCrawler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawler() == null) ? 0 : getCrawler().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCrawlerResult == false)
            return false;
        GetCrawlerResult other = (GetCrawlerResult) obj;

        if (other.getCrawler() == null ^ this.getCrawler() == null)
            return false;
        if (other.getCrawler() != null && other.getCrawler().equals(this.getCrawler()) == false)
            return false;
        return true;
    }
}
