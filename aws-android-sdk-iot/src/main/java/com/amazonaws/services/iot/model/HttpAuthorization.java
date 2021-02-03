/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The authorization method used to send messages.
 * </p>
 */
public class HttpAuthorization implements Serializable {
    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     */
    private SigV4Authorization sigv4;

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     *
     * @return <p>
     *         Use Sig V4 authorization. For more information, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *         >Signature Version 4 Signing Process</a>.
     *         </p>
     */
    public SigV4Authorization getSigv4() {
        return sigv4;
    }

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     *
     * @param sigv4 <p>
     *            Use Sig V4 authorization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            >Signature Version 4 Signing Process</a>.
     *            </p>
     */
    public void setSigv4(SigV4Authorization sigv4) {
        this.sigv4 = sigv4;
    }

    /**
     * <p>
     * Use Sig V4 authorization. For more information, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sigv4 <p>
     *            Use Sig V4 authorization. For more information, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            >Signature Version 4 Signing Process</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpAuthorization withSigv4(SigV4Authorization sigv4) {
        this.sigv4 = sigv4;
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
        if (getSigv4() != null)
            sb.append("sigv4: " + getSigv4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigv4() == null) ? 0 : getSigv4().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpAuthorization == false)
            return false;
        HttpAuthorization other = (HttpAuthorization) obj;

        if (other.getSigv4() == null ^ this.getSigv4() == null)
            return false;
        if (other.getSigv4() != null && other.getSigv4().equals(this.getSigv4()) == false)
            return false;
        return true;
    }
}
