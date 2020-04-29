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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an AWS CloudFormation WAFV2 template for the specified web ACL in the
 * specified Amazon S3 bucket. Then, in CloudFormation, you create a stack from
 * the template, to create the web ACL and its resources in AWS WAFV2. Use this
 * to migrate your AWS WAF Classic web ACL to the latest version of AWS WAF.
 * </p>
 * <p>
 * This is part of a larger migration procedure for web ACLs from AWS WAF
 * Classic to the latest version of AWS WAF. For the full procedure, including
 * caveats and manual steps to complete the migration and switch over to the new
 * web ACL, see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-migrating-from-classic.html"
 * >Migrating your AWS WAF Classic resources to AWS WAF</a> in the <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>.
 * </p>
 */
public class CreateWebACLMigrationStackRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webACLId;

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in.
     * The S3 bucket must be configured as follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For
     * example, <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template.
     * For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket
     * in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For
     * listings of the bucket policies, see the Examples section.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^aws-waf-migration-[0-9A-Za-z\.\-_]*<br/>
     */
    private String s3BucketName;

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop
     * the migration. Set this to true to ignore unsupported entities in the web
     * ACL during the migration. Otherwise, if AWS WAF encounters unsupported
     * entities, it stops the process and throws an exception.
     * </p>
     */
    private Boolean ignoreUnsupportedType;

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The UUID of the WAF Classic web ACL that you want to migrate to
     *         WAF v2.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The UUID of the WAF Classic web ACL that you want to migrate
     *            to WAF v2.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The UUID of the WAF Classic web ACL that you want to migrate
     *            to WAF v2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLMigrationStackRequest withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in.
     * The S3 bucket must be configured as follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For
     * example, <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template.
     * For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket
     * in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For
     * listings of the bucket policies, see the Examples section.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^aws-waf-migration-[0-9A-Za-z\.\-_]*<br/>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket to store the CloudFormation
     *         template in. The S3 bucket must be configured as follows for the
     *         migration:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The bucket name must start with <code>aws-waf-migration-</code>.
     *         For example, <code>aws-waf-migration-my-web-acl</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket must be in the Region where you are deploying the
     *         template. For example, for a web ACL in us-west-2, you must use
     *         an Amazon S3 bucket in us-west-2 and you must deploy the template
     *         stack to us-west-2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket policies must permit the migration process to write
     *         data. For listings of the bucket policies, see the Examples
     *         section.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in.
     * The S3 bucket must be configured as follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For
     * example, <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template.
     * For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket
     * in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For
     * listings of the bucket policies, see the Examples section.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^aws-waf-migration-[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket to store the CloudFormation
     *            template in. The S3 bucket must be configured as follows for
     *            the migration:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The bucket name must start with
     *            <code>aws-waf-migration-</code>. For example,
     *            <code>aws-waf-migration-my-web-acl</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The bucket must be in the Region where you are deploying the
     *            template. For example, for a web ACL in us-west-2, you must
     *            use an Amazon S3 bucket in us-west-2 and you must deploy the
     *            template stack to us-west-2.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The bucket policies must permit the migration process to write
     *            data. For listings of the bucket policies, see the Examples
     *            section.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to store the CloudFormation template in.
     * The S3 bucket must be configured as follows for the migration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The bucket name must start with <code>aws-waf-migration-</code>. For
     * example, <code>aws-waf-migration-my-web-acl</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket must be in the Region where you are deploying the template.
     * For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket
     * in us-west-2 and you must deploy the template stack to us-west-2.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket policies must permit the migration process to write data. For
     * listings of the bucket policies, see the Examples section.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     * <b>Pattern: </b>^aws-waf-migration-[0-9A-Za-z\.\-_]*<br/>
     *
     * @param s3BucketName <p>
     *            The name of the Amazon S3 bucket to store the CloudFormation
     *            template in. The S3 bucket must be configured as follows for
     *            the migration:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The bucket name must start with
     *            <code>aws-waf-migration-</code>. For example,
     *            <code>aws-waf-migration-my-web-acl</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The bucket must be in the Region where you are deploying the
     *            template. For example, for a web ACL in us-west-2, you must
     *            use an Amazon S3 bucket in us-west-2 and you must deploy the
     *            template stack to us-west-2.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The bucket policies must permit the migration process to write
     *            data. For listings of the bucket policies, see the Examples
     *            section.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLMigrationStackRequest withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop
     * the migration. Set this to true to ignore unsupported entities in the web
     * ACL during the migration. Otherwise, if AWS WAF encounters unsupported
     * entities, it stops the process and throws an exception.
     * </p>
     *
     * @return <p>
     *         Indicates whether to exclude entities that can't be migrated or
     *         to stop the migration. Set this to true to ignore unsupported
     *         entities in the web ACL during the migration. Otherwise, if AWS
     *         WAF encounters unsupported entities, it stops the process and
     *         throws an exception.
     *         </p>
     */
    public Boolean isIgnoreUnsupportedType() {
        return ignoreUnsupportedType;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop
     * the migration. Set this to true to ignore unsupported entities in the web
     * ACL during the migration. Otherwise, if AWS WAF encounters unsupported
     * entities, it stops the process and throws an exception.
     * </p>
     *
     * @return <p>
     *         Indicates whether to exclude entities that can't be migrated or
     *         to stop the migration. Set this to true to ignore unsupported
     *         entities in the web ACL during the migration. Otherwise, if AWS
     *         WAF encounters unsupported entities, it stops the process and
     *         throws an exception.
     *         </p>
     */
    public Boolean getIgnoreUnsupportedType() {
        return ignoreUnsupportedType;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop
     * the migration. Set this to true to ignore unsupported entities in the web
     * ACL during the migration. Otherwise, if AWS WAF encounters unsupported
     * entities, it stops the process and throws an exception.
     * </p>
     *
     * @param ignoreUnsupportedType <p>
     *            Indicates whether to exclude entities that can't be migrated
     *            or to stop the migration. Set this to true to ignore
     *            unsupported entities in the web ACL during the migration.
     *            Otherwise, if AWS WAF encounters unsupported entities, it
     *            stops the process and throws an exception.
     *            </p>
     */
    public void setIgnoreUnsupportedType(Boolean ignoreUnsupportedType) {
        this.ignoreUnsupportedType = ignoreUnsupportedType;
    }

    /**
     * <p>
     * Indicates whether to exclude entities that can't be migrated or to stop
     * the migration. Set this to true to ignore unsupported entities in the web
     * ACL during the migration. Otherwise, if AWS WAF encounters unsupported
     * entities, it stops the process and throws an exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreUnsupportedType <p>
     *            Indicates whether to exclude entities that can't be migrated
     *            or to stop the migration. Set this to true to ignore
     *            unsupported entities in the web ACL during the migration.
     *            Otherwise, if AWS WAF encounters unsupported entities, it
     *            stops the process and throws an exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLMigrationStackRequest withIgnoreUnsupportedType(Boolean ignoreUnsupportedType) {
        this.ignoreUnsupportedType = ignoreUnsupportedType;
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
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getIgnoreUnsupportedType() != null)
            sb.append("IgnoreUnsupportedType: " + getIgnoreUnsupportedType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIgnoreUnsupportedType() == null) ? 0 : getIgnoreUnsupportedType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebACLMigrationStackRequest == false)
            return false;
        CreateWebACLMigrationStackRequest other = (CreateWebACLMigrationStackRequest) obj;

        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getIgnoreUnsupportedType() == null ^ this.getIgnoreUnsupportedType() == null)
            return false;
        if (other.getIgnoreUnsupportedType() != null
                && other.getIgnoreUnsupportedType().equals(this.getIgnoreUnsupportedType()) == false)
            return false;
        return true;
    }
}
