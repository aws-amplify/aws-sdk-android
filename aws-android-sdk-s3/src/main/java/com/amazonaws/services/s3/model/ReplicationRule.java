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
 * Specifies which Amazon S3 objects to replicate and where to store the
 * replicas.
 * </p>
 */
public class ReplicationRule implements Serializable {
    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * The priority associated with the rule. If you specify multiple rules in a
     * replication configuration, Amazon S3 prioritizes the rules to prevent
     * conflicts when filtering. If two or more rules identify the same object
     * based on a specified filter, the rule with higher priority takes
     * precedence. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Same object quality prefix-based filter criteria if prefixes you
     * specified in multiple rules overlap
     * </p>
     * </li>
     * <li>
     * <p>
     * Same object qualify tag-based filter criteria specified in multiple rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     * >Replication</a> in the <i>Amazon Simple Storage Service Developer
     * Guide</i>.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which
     * the rule applies. The maximum prefix length is 1,024 characters. To
     * include all objects in a bucket, specify an empty string.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication
     * rule applies. A <code>Filter</code> must specify exactly one
     * <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child
     * element.
     * </p>
     */
    private ReplicationRuleFilter filter;

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * A container that describes additional filters for identifying the source
     * objects that you want to replicate. You can choose to enable or disable
     * the replication of these objects. Currently, Amazon S3 supports only the
     * filter that you can specify for objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service (SSE-KMS).
     * </p>
     */
    private SourceSelectionCriteria sourceSelectionCriteria;

    /**
     * <p/>
     */
    private ExistingObjectReplication existingObjectReplication;

    /**
     * <p>
     * A container for information about the replication destination and its
     * configurations including enabling the S3 Replication Time Control (S3
     * RTC).
     * </p>
     */
    private Destination destination;

    /**
     * <p>
     * Specifies whether Amazon S3 replicates the delete markers. If you specify
     * a <code>Filter</code>, you must specify this element. However, in the
     * latest version of replication configuration (when <code>Filter</code> is
     * specified), Amazon S3 doesn't replicate delete markers. Therefore, the
     * <code>DeleteMarkerReplication</code> element can contain only
     * &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     * >Basic Rule Configuration</a>.
     * </p>
     * <note>
     * <p>
     * If you don't specify the <code>Filter</code> element, Amazon S3 assumes
     * that the replication configuration is the earlier version, V1. In the
     * earlier version, Amazon S3 handled replication of delete markers
     * differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     */
    private DeleteMarkerReplication deleteMarkerReplication;

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the rule. The maximum value is 255
     *         characters.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     *
     * @param iD <p>
     *            A unique identifier for the rule. The maximum value is 255
     *            characters.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * A unique identifier for the rule. The maximum value is 255 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            A unique identifier for the rule. The maximum value is 255
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withID(String iD) {
        this.iD = iD;
        return this;
    }

    /**
     * <p>
     * The priority associated with the rule. If you specify multiple rules in a
     * replication configuration, Amazon S3 prioritizes the rules to prevent
     * conflicts when filtering. If two or more rules identify the same object
     * based on a specified filter, the rule with higher priority takes
     * precedence. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Same object quality prefix-based filter criteria if prefixes you
     * specified in multiple rules overlap
     * </p>
     * </li>
     * <li>
     * <p>
     * Same object qualify tag-based filter criteria specified in multiple rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     * >Replication</a> in the <i>Amazon Simple Storage Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The priority associated with the rule. If you specify multiple
     *         rules in a replication configuration, Amazon S3 prioritizes the
     *         rules to prevent conflicts when filtering. If two or more rules
     *         identify the same object based on a specified filter, the rule
     *         with higher priority takes precedence. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Same object quality prefix-based filter criteria if prefixes you
     *         specified in multiple rules overlap
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Same object qualify tag-based filter criteria specified in
     *         multiple rules
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     *         >Replication</a> in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority associated with the rule. If you specify multiple rules in a
     * replication configuration, Amazon S3 prioritizes the rules to prevent
     * conflicts when filtering. If two or more rules identify the same object
     * based on a specified filter, the rule with higher priority takes
     * precedence. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Same object quality prefix-based filter criteria if prefixes you
     * specified in multiple rules overlap
     * </p>
     * </li>
     * <li>
     * <p>
     * Same object qualify tag-based filter criteria specified in multiple rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     * >Replication</a> in the <i>Amazon Simple Storage Service Developer
     * Guide</i>.
     * </p>
     *
     * @param priority <p>
     *            The priority associated with the rule. If you specify multiple
     *            rules in a replication configuration, Amazon S3 prioritizes
     *            the rules to prevent conflicts when filtering. If two or more
     *            rules identify the same object based on a specified filter,
     *            the rule with higher priority takes precedence. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Same object quality prefix-based filter criteria if prefixes
     *            you specified in multiple rules overlap
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Same object qualify tag-based filter criteria specified in
     *            multiple rules
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     *            >Replication</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority associated with the rule. If you specify multiple rules in a
     * replication configuration, Amazon S3 prioritizes the rules to prevent
     * conflicts when filtering. If two or more rules identify the same object
     * based on a specified filter, the rule with higher priority takes
     * precedence. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Same object quality prefix-based filter criteria if prefixes you
     * specified in multiple rules overlap
     * </p>
     * </li>
     * <li>
     * <p>
     * Same object qualify tag-based filter criteria specified in multiple rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     * >Replication</a> in the <i>Amazon Simple Storage Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priority <p>
     *            The priority associated with the rule. If you specify multiple
     *            rules in a replication configuration, Amazon S3 prioritizes
     *            the rules to prevent conflicts when filtering. If two or more
     *            rules identify the same object based on a specified filter,
     *            the rule with higher priority takes precedence. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Same object quality prefix-based filter criteria if prefixes
     *            you specified in multiple rules overlap
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Same object qualify tag-based filter criteria specified in
     *            multiple rules
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            " https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html"
     *            >Replication</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which
     * the rule applies. The maximum prefix length is 1,024 characters. To
     * include all objects in a bucket, specify an empty string.
     * </p>
     *
     * @return <p>
     *         An object key name prefix that identifies the object or objects
     *         to which the rule applies. The maximum prefix length is 1,024
     *         characters. To include all objects in a bucket, specify an empty
     *         string.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which
     * the rule applies. The maximum prefix length is 1,024 characters. To
     * include all objects in a bucket, specify an empty string.
     * </p>
     *
     * @param prefix <p>
     *            An object key name prefix that identifies the object or
     *            objects to which the rule applies. The maximum prefix length
     *            is 1,024 characters. To include all objects in a bucket,
     *            specify an empty string.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the object or objects to which
     * the rule applies. The maximum prefix length is 1,024 characters. To
     * include all objects in a bucket, specify an empty string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            An object key name prefix that identifies the object or
     *            objects to which the rule applies. The maximum prefix length
     *            is 1,024 characters. To include all objects in a bucket,
     *            specify an empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication
     * rule applies. A <code>Filter</code> must specify exactly one
     * <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child
     * element.
     * </p>
     *
     * @return <p>
     *         A filter that identifies the subset of objects to which the
     *         replication rule applies. A <code>Filter</code> must specify
     *         exactly one <code>Prefix</code>, <code>Tag</code>, or an
     *         <code>And</code> child element.
     *         </p>
     */
    public ReplicationRuleFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication
     * rule applies. A <code>Filter</code> must specify exactly one
     * <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child
     * element.
     * </p>
     *
     * @param filter <p>
     *            A filter that identifies the subset of objects to which the
     *            replication rule applies. A <code>Filter</code> must specify
     *            exactly one <code>Prefix</code>, <code>Tag</code>, or an
     *            <code>And</code> child element.
     *            </p>
     */
    public void setFilter(ReplicationRuleFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter that identifies the subset of objects to which the replication
     * rule applies. A <code>Filter</code> must specify exactly one
     * <code>Prefix</code>, <code>Tag</code>, or an <code>And</code> child
     * element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            A filter that identifies the subset of objects to which the
     *            replication rule applies. A <code>Filter</code> must specify
     *            exactly one <code>Prefix</code>, <code>Tag</code>, or an
     *            <code>And</code> child element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withFilter(ReplicationRuleFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Specifies whether the rule is enabled.
     *         </p>
     * @see ReplicationRuleStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the rule is enabled.
     *            </p>
     * @see ReplicationRuleStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the rule is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationRuleStatus
     */
    public ReplicationRule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the rule is enabled.
     *            </p>
     * @see ReplicationRuleStatus
     */
    public void setStatus(ReplicationRuleStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies whether the rule is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether the rule is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReplicationRuleStatus
     */
    public ReplicationRule withStatus(ReplicationRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source
     * objects that you want to replicate. You can choose to enable or disable
     * the replication of these objects. Currently, Amazon S3 supports only the
     * filter that you can specify for objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service (SSE-KMS).
     * </p>
     *
     * @return <p>
     *         A container that describes additional filters for identifying the
     *         source objects that you want to replicate. You can choose to
     *         enable or disable the replication of these objects. Currently,
     *         Amazon S3 supports only the filter that you can specify for
     *         objects created with server-side encryption using a customer
     *         master key (CMK) stored in AWS Key Management Service (SSE-KMS).
     *         </p>
     */
    public SourceSelectionCriteria getSourceSelectionCriteria() {
        return sourceSelectionCriteria;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source
     * objects that you want to replicate. You can choose to enable or disable
     * the replication of these objects. Currently, Amazon S3 supports only the
     * filter that you can specify for objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service (SSE-KMS).
     * </p>
     *
     * @param sourceSelectionCriteria <p>
     *            A container that describes additional filters for identifying
     *            the source objects that you want to replicate. You can choose
     *            to enable or disable the replication of these objects.
     *            Currently, Amazon S3 supports only the filter that you can
     *            specify for objects created with server-side encryption using
     *            a customer master key (CMK) stored in AWS Key Management
     *            Service (SSE-KMS).
     *            </p>
     */
    public void setSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
    }

    /**
     * <p>
     * A container that describes additional filters for identifying the source
     * objects that you want to replicate. You can choose to enable or disable
     * the replication of these objects. Currently, Amazon S3 supports only the
     * filter that you can specify for objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service (SSE-KMS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSelectionCriteria <p>
     *            A container that describes additional filters for identifying
     *            the source objects that you want to replicate. You can choose
     *            to enable or disable the replication of these objects.
     *            Currently, Amazon S3 supports only the filter that you can
     *            specify for objects created with server-side encryption using
     *            a customer master key (CMK) stored in AWS Key Management
     *            Service (SSE-KMS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withSourceSelectionCriteria(
            SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public ExistingObjectReplication getExistingObjectReplication() {
        return existingObjectReplication;
    }

    /**
     * <p/>
     *
     * @param existingObjectReplication <p/>
     */
    public void setExistingObjectReplication(ExistingObjectReplication existingObjectReplication) {
        this.existingObjectReplication = existingObjectReplication;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param existingObjectReplication <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withExistingObjectReplication(
            ExistingObjectReplication existingObjectReplication) {
        this.existingObjectReplication = existingObjectReplication;
        return this;
    }

    /**
     * <p>
     * A container for information about the replication destination and its
     * configurations including enabling the S3 Replication Time Control (S3
     * RTC).
     * </p>
     *
     * @return <p>
     *         A container for information about the replication destination and
     *         its configurations including enabling the S3 Replication Time
     *         Control (S3 RTC).
     *         </p>
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * <p>
     * A container for information about the replication destination and its
     * configurations including enabling the S3 Replication Time Control (S3
     * RTC).
     * </p>
     *
     * @param destination <p>
     *            A container for information about the replication destination
     *            and its configurations including enabling the S3 Replication
     *            Time Control (S3 RTC).
     *            </p>
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * A container for information about the replication destination and its
     * configurations including enabling the S3 Replication Time Control (S3
     * RTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            A container for information about the replication destination
     *            and its configurations including enabling the S3 Replication
     *            Time Control (S3 RTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates the delete markers. If you specify
     * a <code>Filter</code>, you must specify this element. However, in the
     * latest version of replication configuration (when <code>Filter</code> is
     * specified), Amazon S3 doesn't replicate delete markers. Therefore, the
     * <code>DeleteMarkerReplication</code> element can contain only
     * &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     * >Basic Rule Configuration</a>.
     * </p>
     * <note>
     * <p>
     * If you don't specify the <code>Filter</code> element, Amazon S3 assumes
     * that the replication configuration is the earlier version, V1. In the
     * earlier version, Amazon S3 handled replication of delete markers
     * differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Specifies whether Amazon S3 replicates the delete markers. If you
     *         specify a <code>Filter</code>, you must specify this element.
     *         However, in the latest version of replication configuration (when
     *         <code>Filter</code> is specified), Amazon S3 doesn't replicate
     *         delete markers. Therefore, the
     *         <code>DeleteMarkerReplication</code> element can contain only
     *         &lt;Status&gt;Disabled&lt;/Status&gt;. For an example
     *         configuration, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     *         >Basic Rule Configuration</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't specify the <code>Filter</code> element, Amazon S3
     *         assumes that the replication configuration is the earlier
     *         version, V1. In the earlier version, Amazon S3 handled
     *         replication of delete markers differently. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     *         >Backward Compatibility</a>.
     *         </p>
     *         </note>
     */
    public DeleteMarkerReplication getDeleteMarkerReplication() {
        return deleteMarkerReplication;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates the delete markers. If you specify
     * a <code>Filter</code>, you must specify this element. However, in the
     * latest version of replication configuration (when <code>Filter</code> is
     * specified), Amazon S3 doesn't replicate delete markers. Therefore, the
     * <code>DeleteMarkerReplication</code> element can contain only
     * &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     * >Basic Rule Configuration</a>.
     * </p>
     * <note>
     * <p>
     * If you don't specify the <code>Filter</code> element, Amazon S3 assumes
     * that the replication configuration is the earlier version, V1. In the
     * earlier version, Amazon S3 handled replication of delete markers
     * differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     *
     * @param deleteMarkerReplication <p>
     *            Specifies whether Amazon S3 replicates the delete markers. If
     *            you specify a <code>Filter</code>, you must specify this
     *            element. However, in the latest version of replication
     *            configuration (when <code>Filter</code> is specified), Amazon
     *            S3 doesn't replicate delete markers. Therefore, the
     *            <code>DeleteMarkerReplication</code> element can contain only
     *            &lt;Status&gt;Disabled&lt;/Status&gt;. For an example
     *            configuration, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     *            >Basic Rule Configuration</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't specify the <code>Filter</code> element, Amazon
     *            S3 assumes that the replication configuration is the earlier
     *            version, V1. In the earlier version, Amazon S3 handled
     *            replication of delete markers differently. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     *            >Backward Compatibility</a>.
     *            </p>
     *            </note>
     */
    public void setDeleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates the delete markers. If you specify
     * a <code>Filter</code>, you must specify this element. However, in the
     * latest version of replication configuration (when <code>Filter</code> is
     * specified), Amazon S3 doesn't replicate delete markers. Therefore, the
     * <code>DeleteMarkerReplication</code> element can contain only
     * &lt;Status&gt;Disabled&lt;/Status&gt;. For an example configuration, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     * >Basic Rule Configuration</a>.
     * </p>
     * <note>
     * <p>
     * If you don't specify the <code>Filter</code> element, Amazon S3 assumes
     * that the replication configuration is the earlier version, V1. In the
     * earlier version, Amazon S3 handled replication of delete markers
     * differently. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     * >Backward Compatibility</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteMarkerReplication <p>
     *            Specifies whether Amazon S3 replicates the delete markers. If
     *            you specify a <code>Filter</code>, you must specify this
     *            element. However, in the latest version of replication
     *            configuration (when <code>Filter</code> is specified), Amazon
     *            S3 doesn't replicate delete markers. Therefore, the
     *            <code>DeleteMarkerReplication</code> element can contain only
     *            &lt;Status&gt;Disabled&lt;/Status&gt;. For an example
     *            configuration, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config"
     *            >Basic Rule Configuration</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't specify the <code>Filter</code> element, Amazon
     *            S3 assumes that the replication configuration is the earlier
     *            version, V1. In the earlier version, Amazon S3 handled
     *            replication of delete markers differently. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations"
     *            >Backward Compatibility</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationRule withDeleteMarkerReplication(
            DeleteMarkerReplication deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
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
        if (getID() != null)
            sb.append("ID: " + getID() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSourceSelectionCriteria() != null)
            sb.append("SourceSelectionCriteria: " + getSourceSelectionCriteria() + ",");
        if (getExistingObjectReplication() != null)
            sb.append("ExistingObjectReplication: " + getExistingObjectReplication() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDeleteMarkerReplication() != null)
            sb.append("DeleteMarkerReplication: " + getDeleteMarkerReplication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceSelectionCriteria() == null) ? 0 : getSourceSelectionCriteria()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExistingObjectReplication() == null) ? 0 : getExistingObjectReplication()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteMarkerReplication() == null) ? 0 : getDeleteMarkerReplication()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRule == false)
            return false;
        ReplicationRule other = (ReplicationRule) obj;

        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceSelectionCriteria() == null ^ this.getSourceSelectionCriteria() == null)
            return false;
        if (other.getSourceSelectionCriteria() != null
                && other.getSourceSelectionCriteria().equals(this.getSourceSelectionCriteria()) == false)
            return false;
        if (other.getExistingObjectReplication() == null
                ^ this.getExistingObjectReplication() == null)
            return false;
        if (other.getExistingObjectReplication() != null
                && other.getExistingObjectReplication().equals(this.getExistingObjectReplication()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDeleteMarkerReplication() == null ^ this.getDeleteMarkerReplication() == null)
            return false;
        if (other.getDeleteMarkerReplication() != null
                && other.getDeleteMarkerReplication().equals(this.getDeleteMarkerReplication()) == false)
            return false;
        return true;
    }
}
