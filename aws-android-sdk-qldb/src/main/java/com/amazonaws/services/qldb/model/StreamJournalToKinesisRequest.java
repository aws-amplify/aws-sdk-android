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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a journal stream for a given Amazon QLDB ledger. The stream captures
 * every document revision that is committed to the ledger's journal and
 * delivers the data to a specified Amazon Kinesis Data Streams resource.
 * </p>
 */
public class StreamJournalToKinesisRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String ledgerName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal stream to write data records to a Kinesis Data
     * Streams resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data. This parameter must be in <code>ISO 8601</code> date and time
     * format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be
     * before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, QLDB effectively defaults it to
     * the ledger's <code>CreationDateTime</code>.
     * </p>
     */
    private java.util.Date inclusiveStartTime;

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you
     * don't define this parameter, the stream runs indefinitely until you
     * cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     */
    private java.util.Date exclusiveEndTime;

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for
     * your stream request.
     * </p>
     */
    private KinesisConfiguration kinesisConfiguration;

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined
     * names can help identify and indicate the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a
     * given ledger. Stream names have the same naming constraints as ledger
     * names, as defined in <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     * >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String streamName;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getLedgerName() {
        return ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal stream to write data records to a Kinesis Data
     * Streams resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     *         permissions for a journal stream to write data records to a
     *         Kinesis Data Streams resource.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal stream to write data records to a Kinesis Data
     * Streams resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal stream to write data records to
     *            a Kinesis Data Streams resource.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal stream to write data records to a Kinesis Data
     * Streams resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal stream to write data records to
     *            a Kinesis Data Streams resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to add as tags to the stream that you want to
     *         create. Tag keys are case sensitive. Tag values are case
     *         sensitive and can be null.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the stream that you want
     *            to create. Tag keys are case sensitive. Tag values are case
     *            sensitive and can be null.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the stream that you want
     *            to create. Tag keys are case sensitive. Tag values are case
     *            sensitive and can be null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the stream that you want to create.
     * Tag keys are case sensitive. Tag values are case sensitive and can be
     * null.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StreamJournalToKinesisRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data. This parameter must be in <code>ISO 8601</code> date and time
     * format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be
     * before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, QLDB effectively defaults it to
     * the ledger's <code>CreationDateTime</code>.
     * </p>
     *
     * @return <p>
     *         The inclusive start date and time from which to start streaming
     *         journal data. This parameter must be in <code>ISO 8601</code>
     *         date and time format and in Universal Coordinated Time (UTC). For
     *         example: <code>2019-06-13T21:36:34Z</code>
     *         </p>
     *         <p>
     *         The <code>InclusiveStartTime</code> cannot be in the future and
     *         must be before <code>ExclusiveEndTime</code>.
     *         </p>
     *         <p>
     *         If you provide an <code>InclusiveStartTime</code> that is before
     *         the ledger's <code>CreationDateTime</code>, QLDB effectively
     *         defaults it to the ledger's <code>CreationDateTime</code>.
     *         </p>
     */
    public java.util.Date getInclusiveStartTime() {
        return inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data. This parameter must be in <code>ISO 8601</code> date and time
     * format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be
     * before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, QLDB effectively defaults it to
     * the ledger's <code>CreationDateTime</code>.
     * </p>
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time from which to start
     *            streaming journal data. This parameter must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> cannot be in the future
     *            and must be before <code>ExclusiveEndTime</code>.
     *            </p>
     *            <p>
     *            If you provide an <code>InclusiveStartTime</code> that is
     *            before the ledger's <code>CreationDateTime</code>, QLDB
     *            effectively defaults it to the ledger's
     *            <code>CreationDateTime</code>.
     *            </p>
     */
    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data. This parameter must be in <code>ISO 8601</code> date and time
     * format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * The <code>InclusiveStartTime</code> cannot be in the future and must be
     * before <code>ExclusiveEndTime</code>.
     * </p>
     * <p>
     * If you provide an <code>InclusiveStartTime</code> that is before the
     * ledger's <code>CreationDateTime</code>, QLDB effectively defaults it to
     * the ledger's <code>CreationDateTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time from which to start
     *            streaming journal data. This parameter must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     *            <p>
     *            The <code>InclusiveStartTime</code> cannot be in the future
     *            and must be before <code>ExclusiveEndTime</code>.
     *            </p>
     *            <p>
     *            If you provide an <code>InclusiveStartTime</code> that is
     *            before the ledger's <code>CreationDateTime</code>, QLDB
     *            effectively defaults it to the ledger's
     *            <code>CreationDateTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
        return this;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you
     * don't define this parameter, the stream runs indefinitely until you
     * cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     *
     * @return <p>
     *         The exclusive date and time that specifies when the stream ends.
     *         If you don't define this parameter, the stream runs indefinitely
     *         until you cancel it.
     *         </p>
     *         <p>
     *         The <code>ExclusiveEndTime</code> must be in
     *         <code>ISO 8601</code> date and time format and in Universal
     *         Coordinated Time (UTC). For example:
     *         <code>2019-06-13T21:36:34Z</code>
     *         </p>
     */
    public java.util.Date getExclusiveEndTime() {
        return exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you
     * don't define this parameter, the stream runs indefinitely until you
     * cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     *
     * @param exclusiveEndTime <p>
     *            The exclusive date and time that specifies when the stream
     *            ends. If you don't define this parameter, the stream runs
     *            indefinitely until you cancel it.
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     */
    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If you
     * don't define this parameter, the stream runs indefinitely until you
     * cancel it.
     * </p>
     * <p>
     * The <code>ExclusiveEndTime</code> must be in <code>ISO 8601</code> date
     * and time format and in Universal Coordinated Time (UTC). For example:
     * <code>2019-06-13T21:36:34Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveEndTime <p>
     *            The exclusive date and time that specifies when the stream
     *            ends. If you don't define this parameter, the stream runs
     *            indefinitely until you cancel it.
     *            </p>
     *            <p>
     *            The <code>ExclusiveEndTime</code> must be in
     *            <code>ISO 8601</code> date and time format and in Universal
     *            Coordinated Time (UTC). For example:
     *            <code>2019-06-13T21:36:34Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for
     * your stream request.
     * </p>
     *
     * @return <p>
     *         The configuration settings of the Kinesis Data Streams
     *         destination for your stream request.
     *         </p>
     */
    public KinesisConfiguration getKinesisConfiguration() {
        return kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for
     * your stream request.
     * </p>
     *
     * @param kinesisConfiguration <p>
     *            The configuration settings of the Kinesis Data Streams
     *            destination for your stream request.
     *            </p>
     */
    public void setKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Kinesis Data Streams destination for
     * your stream request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisConfiguration <p>
     *            The configuration settings of the Kinesis Data Streams
     *            destination for your stream request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withKinesisConfiguration(
            KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
        return this;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined
     * names can help identify and indicate the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a
     * given ledger. Stream names have the same naming constraints as ledger
     * names, as defined in <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     * >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name that you want to assign to the QLDB journal stream.
     *         User-defined names can help identify and indicate the purpose of
     *         a stream.
     *         </p>
     *         <p>
     *         Your stream name must be unique among other <i>active</i> streams
     *         for a given ledger. Stream names have the same naming constraints
     *         as ledger names, as defined in <a href=
     *         "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     *         >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer
     *         Guide</i>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined
     * names can help identify and indicate the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a
     * given ledger. Stream names have the same naming constraints as ledger
     * names, as defined in <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     * >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param streamName <p>
     *            The name that you want to assign to the QLDB journal stream.
     *            User-defined names can help identify and indicate the purpose
     *            of a stream.
     *            </p>
     *            <p>
     *            Your stream name must be unique among other <i>active</i>
     *            streams for a given ledger. Stream names have the same naming
     *            constraints as ledger names, as defined in <a href=
     *            "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     *            >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name that you want to assign to the QLDB journal stream. User-defined
     * names can help identify and indicate the purpose of a stream.
     * </p>
     * <p>
     * Your stream name must be unique among other <i>active</i> streams for a
     * given ledger. Stream names have the same naming constraints as ledger
     * names, as defined in <a href=
     * "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     * >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param streamName <p>
     *            The name that you want to assign to the QLDB journal stream.
     *            User-defined names can help identify and indicate the purpose
     *            of a stream.
     *            </p>
     *            <p>
     *            Your stream name must be unique among other <i>active</i>
     *            streams for a given ledger. Stream names have the same naming
     *            constraints as ledger names, as defined in <a href=
     *            "https://docs.aws.amazon.com/qldb/latest/developerguide/limits.html#limits.naming"
     *            >Quotas in Amazon QLDB</a> in the <i>Amazon QLDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamJournalToKinesisRequest withStreamName(String streamName) {
        this.streamName = streamName;
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
        if (getLedgerName() != null)
            sb.append("LedgerName: " + getLedgerName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: " + getInclusiveStartTime() + ",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: " + getExclusiveEndTime() + ",");
        if (getKinesisConfiguration() != null)
            sb.append("KinesisConfiguration: " + getKinesisConfiguration() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisConfiguration() == null) ? 0 : getKinesisConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamJournalToKinesisRequest == false)
            return false;
        StreamJournalToKinesisRequest other = (StreamJournalToKinesisRequest) obj;

        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null
                && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null
                && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null
                && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getKinesisConfiguration() == null ^ this.getKinesisConfiguration() == null)
            return false;
        if (other.getKinesisConfiguration() != null
                && other.getKinesisConfiguration().equals(this.getKinesisConfiguration()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
