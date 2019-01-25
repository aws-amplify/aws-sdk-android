/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <a>GetRecords</a>.
 * </p>
 */
public class GetRecordsResult implements Serializable {
    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     */
    private java.util.List<Record> records = new java.util.ArrayList<Record>();

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * data records. If set to <code>null</code>, the shard has been closed and
     * the requested iterator does not return any more data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String nextShardIterator;

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip
     * of the stream, indicating how far behind current time the consumer is. A
     * value of zero indicates that record processing is caught up, and there
     * are no new records to process at this moment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long millisBehindLatest;

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     *
     * @return <p>
     *         The data records retrieved from the shard.
     *         </p>
     */
    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     *
     * @param records <p>
     *            The data records retrieved from the shard.
     *            </p>
     */
    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<Record>(records);
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            The data records retrieved from the shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecordsResult withRecords(Record... records) {
        if (getRecords() == null) {
            this.records = new java.util.ArrayList<Record>(records.length);
        }
        for (Record value : records) {
            this.records.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The data records retrieved from the shard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param records <p>
     *            The data records retrieved from the shard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecordsResult withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * data records. If set to <code>null</code>, the shard has been closed and
     * the requested iterator does not return any more data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         The next position in the shard from which to start sequentially
     *         reading data records. If set to <code>null</code>, the shard has
     *         been closed and the requested iterator does not return any more
     *         data.
     *         </p>
     */
    public String getNextShardIterator() {
        return nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * data records. If set to <code>null</code>, the shard has been closed and
     * the requested iterator does not return any more data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param nextShardIterator <p>
     *            The next position in the shard from which to start
     *            sequentially reading data records. If set to <code>null</code>
     *            , the shard has been closed and the requested iterator does
     *            not return any more data.
     *            </p>
     */
    public void setNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * data records. If set to <code>null</code>, the shard has been closed and
     * the requested iterator does not return any more data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param nextShardIterator <p>
     *            The next position in the shard from which to start
     *            sequentially reading data records. If set to <code>null</code>
     *            , the shard has been closed and the requested iterator does
     *            not return any more data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecordsResult withNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip
     * of the stream, indicating how far behind current time the consumer is. A
     * value of zero indicates that record processing is caught up, and there
     * are no new records to process at this moment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of milliseconds the <a>GetRecords</a> response is from
     *         the tip of the stream, indicating how far behind current time the
     *         consumer is. A value of zero indicates that record processing is
     *         caught up, and there are no new records to process at this
     *         moment.
     *         </p>
     */
    public Long getMillisBehindLatest() {
        return millisBehindLatest;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip
     * of the stream, indicating how far behind current time the consumer is. A
     * value of zero indicates that record processing is caught up, and there
     * are no new records to process at this moment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param millisBehindLatest <p>
     *            The number of milliseconds the <a>GetRecords</a> response is
     *            from the tip of the stream, indicating how far behind current
     *            time the consumer is. A value of zero indicates that record
     *            processing is caught up, and there are no new records to
     *            process at this moment.
     *            </p>
     */
    public void setMillisBehindLatest(Long millisBehindLatest) {
        this.millisBehindLatest = millisBehindLatest;
    }

    /**
     * <p>
     * The number of milliseconds the <a>GetRecords</a> response is from the tip
     * of the stream, indicating how far behind current time the consumer is. A
     * value of zero indicates that record processing is caught up, and there
     * are no new records to process at this moment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param millisBehindLatest <p>
     *            The number of milliseconds the <a>GetRecords</a> response is
     *            from the tip of the stream, indicating how far behind current
     *            time the consumer is. A value of zero indicates that record
     *            processing is caught up, and there are no new records to
     *            process at this moment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecordsResult withMillisBehindLatest(Long millisBehindLatest) {
        this.millisBehindLatest = millisBehindLatest;
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
        if (getNextShardIterator() != null)
            sb.append("NextShardIterator: " + getNextShardIterator() + ",");
        if (getMillisBehindLatest() != null)
            sb.append("MillisBehindLatest: " + getMillisBehindLatest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode
                + ((getNextShardIterator() == null) ? 0 : getNextShardIterator().hashCode());
        hashCode = prime * hashCode
                + ((getMillisBehindLatest() == null) ? 0 : getMillisBehindLatest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordsResult == false)
            return false;
        GetRecordsResult other = (GetRecordsResult) obj;

        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getNextShardIterator() == null ^ this.getNextShardIterator() == null)
            return false;
        if (other.getNextShardIterator() != null
                && other.getNextShardIterator().equals(this.getNextShardIterator()) == false)
            return false;
        if (other.getMillisBehindLatest() == null ^ this.getMillisBehindLatest() == null)
            return false;
        if (other.getMillisBehindLatest() != null
                && other.getMillisBehindLatest().equals(this.getMillisBehindLatest()) == false)
            return false;
        return true;
    }
}
