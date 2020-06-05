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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the average latency for the slowest X percent of requests over the
 * last 10 seconds.
 * </p>
 */
public class Latency implements Serializable {
    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p999;

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p99;

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p95;

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p90;

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p85;

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p75;

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p50;

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last
     * 10 seconds.
     * </p>
     */
    private Double p10;

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 0.1 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP999() {
        return p999;
    }

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p999 <p>
     *            The average latency for the slowest 0.1 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP999(Double p999) {
        this.p999 = p999;
    }

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p999 <p>
     *            The average latency for the slowest 0.1 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP999(Double p999) {
        this.p999 = p999;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 1 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP99() {
        return p99;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p99 <p>
     *            The average latency for the slowest 1 percent of requests over
     *            the last 10 seconds.
     *            </p>
     */
    public void setP99(Double p99) {
        this.p99 = p99;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p99 <p>
     *            The average latency for the slowest 1 percent of requests over
     *            the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP99(Double p99) {
        this.p99 = p99;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 5 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP95() {
        return p95;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p95 <p>
     *            The average latency for the slowest 5 percent of requests over
     *            the last 10 seconds.
     *            </p>
     */
    public void setP95(Double p95) {
        this.p95 = p95;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p95 <p>
     *            The average latency for the slowest 5 percent of requests over
     *            the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP95(Double p95) {
        this.p95 = p95;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 10 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP90() {
        return p90;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p90 <p>
     *            The average latency for the slowest 10 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP90(Double p90) {
        this.p90 = p90;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p90 <p>
     *            The average latency for the slowest 10 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP90(Double p90) {
        this.p90 = p90;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 15 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP85() {
        return p85;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p85 <p>
     *            The average latency for the slowest 15 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP85(Double p85) {
        this.p85 = p85;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p85 <p>
     *            The average latency for the slowest 15 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP85(Double p85) {
        this.p85 = p85;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 25 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP75() {
        return p75;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p75 <p>
     *            The average latency for the slowest 25 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP75(Double p75) {
        this.p75 = p75;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p75 <p>
     *            The average latency for the slowest 25 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP75(Double p75) {
        this.p75 = p75;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 50 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP50() {
        return p50;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p50 <p>
     *            The average latency for the slowest 50 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP50(Double p50) {
        this.p50 = p50;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p50 <p>
     *            The average latency for the slowest 50 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP50(Double p50) {
        this.p50 = p50;
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @return <p>
     *         The average latency for the slowest 90 percent of requests over
     *         the last 10 seconds.
     *         </p>
     */
    public Double getP10() {
        return p10;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last
     * 10 seconds.
     * </p>
     *
     * @param p10 <p>
     *            The average latency for the slowest 90 percent of requests
     *            over the last 10 seconds.
     *            </p>
     */
    public void setP10(Double p10) {
        this.p10 = p10;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last
     * 10 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param p10 <p>
     *            The average latency for the slowest 90 percent of requests
     *            over the last 10 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Latency withP10(Double p10) {
        this.p10 = p10;
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
        if (getP999() != null)
            sb.append("P999: " + getP999() + ",");
        if (getP99() != null)
            sb.append("P99: " + getP99() + ",");
        if (getP95() != null)
            sb.append("P95: " + getP95() + ",");
        if (getP90() != null)
            sb.append("P90: " + getP90() + ",");
        if (getP85() != null)
            sb.append("P85: " + getP85() + ",");
        if (getP75() != null)
            sb.append("P75: " + getP75() + ",");
        if (getP50() != null)
            sb.append("P50: " + getP50() + ",");
        if (getP10() != null)
            sb.append("P10: " + getP10());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getP999() == null) ? 0 : getP999().hashCode());
        hashCode = prime * hashCode + ((getP99() == null) ? 0 : getP99().hashCode());
        hashCode = prime * hashCode + ((getP95() == null) ? 0 : getP95().hashCode());
        hashCode = prime * hashCode + ((getP90() == null) ? 0 : getP90().hashCode());
        hashCode = prime * hashCode + ((getP85() == null) ? 0 : getP85().hashCode());
        hashCode = prime * hashCode + ((getP75() == null) ? 0 : getP75().hashCode());
        hashCode = prime * hashCode + ((getP50() == null) ? 0 : getP50().hashCode());
        hashCode = prime * hashCode + ((getP10() == null) ? 0 : getP10().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Latency == false)
            return false;
        Latency other = (Latency) obj;

        if (other.getP999() == null ^ this.getP999() == null)
            return false;
        if (other.getP999() != null && other.getP999().equals(this.getP999()) == false)
            return false;
        if (other.getP99() == null ^ this.getP99() == null)
            return false;
        if (other.getP99() != null && other.getP99().equals(this.getP99()) == false)
            return false;
        if (other.getP95() == null ^ this.getP95() == null)
            return false;
        if (other.getP95() != null && other.getP95().equals(this.getP95()) == false)
            return false;
        if (other.getP90() == null ^ this.getP90() == null)
            return false;
        if (other.getP90() != null && other.getP90().equals(this.getP90()) == false)
            return false;
        if (other.getP85() == null ^ this.getP85() == null)
            return false;
        if (other.getP85() != null && other.getP85().equals(this.getP85()) == false)
            return false;
        if (other.getP75() == null ^ this.getP75() == null)
            return false;
        if (other.getP75() != null && other.getP75().equals(this.getP75()) == false)
            return false;
        if (other.getP50() == null ^ this.getP50() == null)
            return false;
        if (other.getP50() != null && other.getP50().equals(this.getP50()) == false)
            return false;
        if (other.getP10() == null ^ this.getP10() == null)
            return false;
        if (other.getP10() != null && other.getP10().equals(this.getP10()) == false)
            return false;
        return true;
    }
}
