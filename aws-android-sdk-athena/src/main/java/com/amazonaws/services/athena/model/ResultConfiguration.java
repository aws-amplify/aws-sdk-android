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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The location in Amazon S3 where query results are stored and the encryption
 * option, if any, used for query results. These are known as
 * "client-side settings". If workgroup settings override client-side settings,
 * then the query uses the workgroup settings.
 * </p>
 */
public class ResultConfiguration implements Serializable {
    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. To run the query, you must
     * specify the query results location using one of the ways: either for
     * individual queries using either this setting (client-side), or in the
     * workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set,
     * Athena issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>. If workgroup settings override client-side settings, then
     * the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     */
    private String outputLocation;

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption
     * option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>)
     * and key information. This is a client-side setting. If workgroup settings
     * override client-side settings, then the query uses the encryption
     * configuration that is specified for the workgroup, and also uses the
     * location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. To run the query, you must
     * specify the query results location using one of the ways: either for
     * individual queries using either this setting (client-side), or in the
     * workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set,
     * Athena issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>. If workgroup settings override client-side settings, then
     * the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @return <p>
     *         The location in Amazon S3 where your query results are stored,
     *         such as <code>s3://path/to/query/bucket/</code>. To run the
     *         query, you must specify the query results location using one of
     *         the ways: either for individual queries using either this setting
     *         (client-side), or in the workgroup, using
     *         <a>WorkGroupConfiguration</a>. If none of them is set, Athena
     *         issues an error that no output location is provided. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *         >Query Results</a>. If workgroup settings override client-side
     *         settings, then the query uses the settings specified for the
     *         workgroup. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *         </p>
     */
    public String getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. To run the query, you must
     * specify the query results location using one of the ways: either for
     * individual queries using either this setting (client-side), or in the
     * workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set,
     * Athena issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>. If workgroup settings override client-side settings, then
     * the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     *
     * @param outputLocation <p>
     *            The location in Amazon S3 where your query results are stored,
     *            such as <code>s3://path/to/query/bucket/</code>. To run the
     *            query, you must specify the query results location using one
     *            of the ways: either for individual queries using either this
     *            setting (client-side), or in the workgroup, using
     *            <a>WorkGroupConfiguration</a>. If none of them is set, Athena
     *            issues an error that no output location is provided. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a>. If workgroup settings override client-side
     *            settings, then the query uses the settings specified for the
     *            workgroup. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The location in Amazon S3 where your query results are stored, such as
     * <code>s3://path/to/query/bucket/</code>. To run the query, you must
     * specify the query results location using one of the ways: either for
     * individual queries using either this setting (client-side), or in the
     * workgroup, using <a>WorkGroupConfiguration</a>. If none of them is set,
     * Athena issues an error that no output location is provided. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query
     * Results</a>. If workgroup settings override client-side settings, then
     * the query uses the settings specified for the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputLocation <p>
     *            The location in Amazon S3 where your query results are stored,
     *            such as <code>s3://path/to/query/bucket/</code>. To run the
     *            query, you must specify the query results location using one
     *            of the ways: either for individual queries using either this
     *            setting (client-side), or in the workgroup, using
     *            <a>WorkGroupConfiguration</a>. If none of them is set, Athena
     *            issues an error that no output location is provided. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Query Results</a>. If workgroup settings override client-side
     *            settings, then the query uses the settings specified for the
     *            workgroup. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfiguration withOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption
     * option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>)
     * and key information. This is a client-side setting. If workgroup settings
     * override client-side settings, then the query uses the encryption
     * configuration that is specified for the workgroup, and also uses the
     * location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @return <p>
     *         If query results are encrypted in Amazon S3, indicates the
     *         encryption option used (for example, <code>SSE-KMS</code> or
     *         <code>CSE-KMS</code>) and key information. This is a client-side
     *         setting. If workgroup settings override client-side settings,
     *         then the query uses the encryption configuration that is
     *         specified for the workgroup, and also uses the location for
     *         storing query results specified in the workgroup. See
     *         <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and
     *         <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *         >Workgroup Settings Override Client-Side Settings</a>.
     *         </p>
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption
     * option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>)
     * and key information. This is a client-side setting. If workgroup settings
     * override client-side settings, then the query uses the encryption
     * configuration that is specified for the workgroup, and also uses the
     * location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     *
     * @param encryptionConfiguration <p>
     *            If query results are encrypted in Amazon S3, indicates the
     *            encryption option used (for example, <code>SSE-KMS</code> or
     *            <code>CSE-KMS</code>) and key information. This is a
     *            client-side setting. If workgroup settings override
     *            client-side settings, then the query uses the encryption
     *            configuration that is specified for the workgroup, and also
     *            uses the location for storing query results specified in the
     *            workgroup. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     *            and <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * If query results are encrypted in Amazon S3, indicates the encryption
     * option used (for example, <code>SSE-KMS</code> or <code>CSE-KMS</code>)
     * and key information. This is a client-side setting. If workgroup settings
     * override client-side settings, then the query uses the encryption
     * configuration that is specified for the workgroup, and also uses the
     * location for storing query results specified in the workgroup. See
     * <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a> and <a href=
     * "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     * >Workgroup Settings Override Client-Side Settings</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionConfiguration <p>
     *            If query results are encrypted in Amazon S3, indicates the
     *            encryption option used (for example, <code>SSE-KMS</code> or
     *            <code>CSE-KMS</code>) and key information. This is a
     *            client-side setting. If workgroup settings override
     *            client-side settings, then the query uses the encryption
     *            configuration that is specified for the workgroup, and also
     *            uses the location for storing query results specified in the
     *            workgroup. See
     *            <a>WorkGroupConfiguration$EnforceWorkGroupConfiguration</a>
     *            and <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html"
     *            >Workgroup Settings Override Client-Side Settings</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResultConfiguration withEncryptionConfiguration(
            EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation() + ",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: " + getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultConfiguration == false)
            return false;
        ResultConfiguration other = (ResultConfiguration) obj;

        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null
                && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null
                && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
