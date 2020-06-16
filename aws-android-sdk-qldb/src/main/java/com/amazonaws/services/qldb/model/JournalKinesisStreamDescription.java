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

/**
 * <p>
 * The information about an Amazon QLDB journal stream, including the Amazon
 * Resource Name (ARN), stream name, creation time, current status, and the
 * parameters of your original stream creation request.
 * </p>
 */
public class JournalKinesisStreamDescription implements Serializable {
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
     * The date and time, in epoch time format, when the QLDB journal stream was
     * created. (Epoch time format is the number of seconds elapsed since
     * 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data.
     * </p>
     */
    private java.util.Date inclusiveStartTime;

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this
     * parameter is blank, the stream runs indefinitely until you cancel it.
     * </p>
     */
    private java.util.Date exclusiveEndTime;

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
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String streamId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String arn;

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     */
    private String status;

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination
     * for your QLDB journal stream.
     * </p>
     */
    private KinesisConfiguration kinesisConfiguration;

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     */
    private String errorCause;

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
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
    public JournalKinesisStreamDescription withLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was
     * created. (Epoch time format is the number of seconds elapsed since
     * 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     *
     * @return <p>
     *         The date and time, in epoch time format, when the QLDB journal
     *         stream was created. (Epoch time format is the number of seconds
     *         elapsed since 12:00:00 AM January 1, 1970 UTC.)
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was
     * created. (Epoch time format is the number of seconds elapsed since
     * 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     *
     * @param creationTime <p>
     *            The date and time, in epoch time format, when the QLDB journal
     *            stream was created. (Epoch time format is the number of
     *            seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the QLDB journal stream was
     * created. (Epoch time format is the number of seconds elapsed since
     * 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time, in epoch time format, when the QLDB journal
     *            stream was created. (Epoch time format is the number of
     *            seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data.
     * </p>
     *
     * @return <p>
     *         The inclusive start date and time from which to start streaming
     *         journal data.
     *         </p>
     */
    public java.util.Date getInclusiveStartTime() {
        return inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data.
     * </p>
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time from which to start
     *            streaming journal data.
     *            </p>
     */
    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time from which to start streaming journal
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time from which to start
     *            streaming journal data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
        return this;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this
     * parameter is blank, the stream runs indefinitely until you cancel it.
     * </p>
     *
     * @return <p>
     *         The exclusive date and time that specifies when the stream ends.
     *         If this parameter is blank, the stream runs indefinitely until
     *         you cancel it.
     *         </p>
     */
    public java.util.Date getExclusiveEndTime() {
        return exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this
     * parameter is blank, the stream runs indefinitely until you cancel it.
     * </p>
     *
     * @param exclusiveEndTime <p>
     *            The exclusive date and time that specifies when the stream
     *            ends. If this parameter is blank, the stream runs indefinitely
     *            until you cancel it.
     *            </p>
     */
    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive date and time that specifies when the stream ends. If this
     * parameter is blank, the stream runs indefinitely until you cancel it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveEndTime <p>
     *            The exclusive date and time that specifies when the stream
     *            ends. If this parameter is blank, the stream runs indefinitely
     *            until you cancel it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
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
    public JournalKinesisStreamDescription withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The unique ID that QLDB assigns to each QLDB journal stream.
     *         </p>
     */
    public String getStreamId() {
        return streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param streamId <p>
     *            The unique ID that QLDB assigns to each QLDB journal stream.
     *            </p>
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param streamId <p>
     *            The unique ID that QLDB assigns to each QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the QLDB journal stream.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the QLDB journal stream.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     *
     * @return <p>
     *         The current state of the QLDB journal stream.
     *         </p>
     * @see StreamStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     *
     * @param status <p>
     *            The current state of the QLDB journal stream.
     *            </p>
     * @see StreamStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     *
     * @param status <p>
     *            The current state of the QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public JournalKinesisStreamDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     *
     * @param status <p>
     *            The current state of the QLDB journal stream.
     *            </p>
     * @see StreamStatus
     */
    public void setStatus(StreamStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, COMPLETED, CANCELED, FAILED, IMPAIRED
     *
     * @param status <p>
     *            The current state of the QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public JournalKinesisStreamDescription withStatus(StreamStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination
     * for your QLDB journal stream.
     * </p>
     *
     * @return <p>
     *         The configuration settings of the Amazon Kinesis Data Streams
     *         destination for your QLDB journal stream.
     *         </p>
     */
    public KinesisConfiguration getKinesisConfiguration() {
        return kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination
     * for your QLDB journal stream.
     * </p>
     *
     * @param kinesisConfiguration <p>
     *            The configuration settings of the Amazon Kinesis Data Streams
     *            destination for your QLDB journal stream.
     *            </p>
     */
    public void setKinesisConfiguration(KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the Amazon Kinesis Data Streams destination
     * for your QLDB journal stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisConfiguration <p>
     *            The configuration settings of the Amazon Kinesis Data Streams
     *            destination for your QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withKinesisConfiguration(
            KinesisConfiguration kinesisConfiguration) {
        this.kinesisConfiguration = kinesisConfiguration;
        return this;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     *
     * @return <p>
     *         The error message that describes the reason that a stream has a
     *         status of <code>IMPAIRED</code> or <code>FAILED</code>. This is
     *         not applicable to streams that have other status values.
     *         </p>
     * @see ErrorCause
     */
    public String getErrorCause() {
        return errorCause;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     *
     * @param errorCause <p>
     *            The error message that describes the reason that a stream has
     *            a status of <code>IMPAIRED</code> or <code>FAILED</code>. This
     *            is not applicable to streams that have other status values.
     *            </p>
     * @see ErrorCause
     */
    public void setErrorCause(String errorCause) {
        this.errorCause = errorCause;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     *
     * @param errorCause <p>
     *            The error message that describes the reason that a stream has
     *            a status of <code>IMPAIRED</code> or <code>FAILED</code>. This
     *            is not applicable to streams that have other status values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCause
     */
    public JournalKinesisStreamDescription withErrorCause(String errorCause) {
        this.errorCause = errorCause;
        return this;
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     *
     * @param errorCause <p>
     *            The error message that describes the reason that a stream has
     *            a status of <code>IMPAIRED</code> or <code>FAILED</code>. This
     *            is not applicable to streams that have other status values.
     *            </p>
     * @see ErrorCause
     */
    public void setErrorCause(ErrorCause errorCause) {
        this.errorCause = errorCause.toString();
    }

    /**
     * <p>
     * The error message that describes the reason that a stream has a status of
     * <code>IMPAIRED</code> or <code>FAILED</code>. This is not applicable to
     * streams that have other status values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>KINESIS_STREAM_NOT_FOUND, IAM_PERMISSION_REVOKED
     *
     * @param errorCause <p>
     *            The error message that describes the reason that a stream has
     *            a status of <code>IMPAIRED</code> or <code>FAILED</code>. This
     *            is not applicable to streams that have other status values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ErrorCause
     */
    public JournalKinesisStreamDescription withErrorCause(ErrorCause errorCause) {
        this.errorCause = errorCause.toString();
        return this;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The user-defined name of the QLDB journal stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param streamName <p>
     *            The user-defined name of the QLDB journal stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The user-defined name of the QLDB journal stream.
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
     *            The user-defined name of the QLDB journal stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalKinesisStreamDescription withStreamName(String streamName) {
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: " + getInclusiveStartTime() + ",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: " + getExclusiveEndTime() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getStreamId() != null)
            sb.append("StreamId: " + getStreamId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getKinesisConfiguration() != null)
            sb.append("KinesisConfiguration: " + getKinesisConfiguration() + ",");
        if (getErrorCause() != null)
            sb.append("ErrorCause: " + getErrorCause() + ",");
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
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisConfiguration() == null) ? 0 : getKinesisConfiguration().hashCode());
        hashCode = prime * hashCode + ((getErrorCause() == null) ? 0 : getErrorCause().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JournalKinesisStreamDescription == false)
            return false;
        JournalKinesisStreamDescription other = (JournalKinesisStreamDescription) obj;

        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null
                && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKinesisConfiguration() == null ^ this.getKinesisConfiguration() == null)
            return false;
        if (other.getKinesisConfiguration() != null
                && other.getKinesisConfiguration().equals(this.getKinesisConfiguration()) == false)
            return false;
        if (other.getErrorCause() == null ^ this.getErrorCause() == null)
            return false;
        if (other.getErrorCause() != null
                && other.getErrorCause().equals(this.getErrorCause()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }
}
