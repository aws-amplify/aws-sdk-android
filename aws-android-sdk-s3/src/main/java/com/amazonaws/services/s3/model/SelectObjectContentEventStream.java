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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * The container for selecting objects from a content event stream.
 * </p>
 */
public class SelectObjectContentEventStream implements Serializable {
    /**
     * <p>
     * The Records Event.
     * </p>
     */
    private RecordsEvent records;

    /**
     * <p>
     * The Stats Event.
     * </p>
     */
    private StatsEvent stats;

    /**
     * <p>
     * The Progress Event.
     * </p>
     */
    private ProgressEvent progress;

    /**
     * <p>
     * The Continuation Event.
     * </p>
     */
    private ContinuationEvent cont;

    /**
     * <p>
     * The End Event.
     * </p>
     */
    private EndEvent end;

    /**
     * <p>
     * The Records Event.
     * </p>
     *
     * @return <p>
     *         The Records Event.
     *         </p>
     */
    public RecordsEvent getRecords() {
        return records;
    }

    /**
     * <p>
     * The Records Event.
     * </p>
     *
     * @param records <p>
     *            The Records Event.
     *            </p>
     */
    public void setRecords(RecordsEvent records) {
        this.records = records;
    }

    /**
     * <p>
     * The Records Event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            The Records Event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentEventStream withRecords(RecordsEvent records) {
        this.records = records;
        return this;
    }

    /**
     * <p>
     * The Stats Event.
     * </p>
     *
     * @return <p>
     *         The Stats Event.
     *         </p>
     */
    public StatsEvent getStats() {
        return stats;
    }

    /**
     * <p>
     * The Stats Event.
     * </p>
     *
     * @param stats <p>
     *            The Stats Event.
     *            </p>
     */
    public void setStats(StatsEvent stats) {
        this.stats = stats;
    }

    /**
     * <p>
     * The Stats Event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stats <p>
     *            The Stats Event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentEventStream withStats(StatsEvent stats) {
        this.stats = stats;
        return this;
    }

    /**
     * <p>
     * The Progress Event.
     * </p>
     *
     * @return <p>
     *         The Progress Event.
     *         </p>
     */
    public ProgressEvent getProgress() {
        return progress;
    }

    /**
     * <p>
     * The Progress Event.
     * </p>
     *
     * @param progress <p>
     *            The Progress Event.
     *            </p>
     */
    public void setProgress(ProgressEvent progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The Progress Event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progress <p>
     *            The Progress Event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentEventStream withProgress(ProgressEvent progress) {
        this.progress = progress;
        return this;
    }

    /**
     * <p>
     * The Continuation Event.
     * </p>
     *
     * @return <p>
     *         The Continuation Event.
     *         </p>
     */
    public ContinuationEvent getCont() {
        return cont;
    }

    /**
     * <p>
     * The Continuation Event.
     * </p>
     *
     * @param cont <p>
     *            The Continuation Event.
     *            </p>
     */
    public void setCont(ContinuationEvent cont) {
        this.cont = cont;
    }

    /**
     * <p>
     * The Continuation Event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cont <p>
     *            The Continuation Event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentEventStream withCont(ContinuationEvent cont) {
        this.cont = cont;
        return this;
    }

    /**
     * <p>
     * The End Event.
     * </p>
     *
     * @return <p>
     *         The End Event.
     *         </p>
     */
    public EndEvent getEnd() {
        return end;
    }

    /**
     * <p>
     * The End Event.
     * </p>
     *
     * @param end <p>
     *            The End Event.
     *            </p>
     */
    public void setEnd(EndEvent end) {
        this.end = end;
    }

    /**
     * <p>
     * The End Event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            The End Event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelectObjectContentEventStream withEnd(EndEvent end) {
        this.end = end;
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
        if (getRecords() != null)
            sb.append("Records: " + getRecords() + ",");
        if (getStats() != null)
            sb.append("Stats: " + getStats() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getCont() != null)
            sb.append("Cont: " + getCont() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getStats() == null) ? 0 : getStats().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getCont() == null) ? 0 : getCont().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectObjectContentEventStream == false)
            return false;
        SelectObjectContentEventStream other = (SelectObjectContentEventStream) obj;

        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getStats() == null ^ this.getStats() == null)
            return false;
        if (other.getStats() != null && other.getStats().equals(this.getStats()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getCont() == null ^ this.getCont() == null)
            return false;
        if (other.getCont() != null && other.getCont().equals(this.getCont()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }
}
