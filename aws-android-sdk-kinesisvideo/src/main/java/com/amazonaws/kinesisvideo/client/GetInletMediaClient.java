/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.client;

import androidx.annotation.NonNull;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;

import com.amazonaws.kinesisvideo.http.KinesisVideoApacheHttpClient;
import com.amazonaws.kinesisvideo.http.HttpMethodName;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;

import java.net.URI;

public final class GetInletMediaClient {

    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String X_AMZN_REQUEST_ID = "x-amzn-RequestId";

    private URI mUri;
    private KinesisVideoSigner mSigner;
    private String mGetInletMediaInputInJson;
    private Integer mConnectionTimeoutInMillis;
    private Integer mReadTimeoutInMillis;

    
    GetInletMediaClient(GetInletMediaClientBuilder builder) {
        this.mUri = builder.mUri;
        this.mSigner = builder.mSigner;
        this.mGetInletMediaInputInJson = builder.mGetInletMediaInputInJson;
        this.mConnectionTimeoutInMillis = builder.mConnectionTimeoutInMillis;
        this.mReadTimeoutInMillis = builder.mReadTimeoutInMillis;
    }
    
    public GetInletMediaClientBuilder builder() {
        return new GetInletMediaClientBuilder();
    }
    
    public static class GetInletMediaClientBuilder {
        private URI mUri;
        private KinesisVideoSigner mSigner;
        private String mGetInletMediaInputInJson;
        private Integer mConnectionTimeoutInMillis;
        private Integer mReadTimeoutInMillis;
        
        GetInletMediaClientBuilder() { }

        public GetInletMediaClientBuilder uri(URI uri) {
            this.mUri = uri;
            return this;
        }

        public GetInletMediaClientBuilder signer(KinesisVideoSigner signer) {
            this.mSigner = signer;
            return this;
        }

        public GetInletMediaClientBuilder getInletMediaInputInJson(String getInletMediaInputInJson) {
            this.mGetInletMediaInputInJson = getInletMediaInputInJson;
            return this;
        }

        public GetInletMediaClientBuilder connectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
            this.mConnectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }

        public GetInletMediaClientBuilder readTimeoutInMillis(Integer readTimeoutInMillis) {
            this.mReadTimeoutInMillis = readTimeoutInMillis;
            return this;
        }
        
        public GetInletMediaClient build() {
            return new GetInletMediaClient(this);
        }
    }

    public CloseableHttpResponse execute(@NonNull final String requestId) {
        final KinesisVideoApacheHttpClient client = getHttpClient(requestId);
        return client.executeRequest();
    }

    private KinesisVideoApacheHttpClient getHttpClient(@NonNull final String requestId) {
        KinesisVideoApacheHttpClient.Builder clientBuilder =
                KinesisVideoApacheHttpClient.builder()
                        .withUri(mUri)
                        .withContentType(ContentType.APPLICATION_JSON)
                        .withMethod(HttpMethodName.POST)
                        .withContentInJson(mGetInletMediaInputInJson)
                        .withHeader(CONTENT_TYPE_HEADER_KEY, ContentType.APPLICATION_JSON.getMimeType())
                        .withHeader(X_AMZN_REQUEST_ID, requestId);
        
        if (mConnectionTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withConnectionTimeoutInMillis(mConnectionTimeoutInMillis.intValue());
        }
        if (mReadTimeoutInMillis != null) {
            clientBuilder = clientBuilder.withSocketTimeoutInMillis(mReadTimeoutInMillis.intValue());
        }
        final KinesisVideoApacheHttpClient client = clientBuilder.build();
        mSigner.sign(client);
        return client;
    }

    /**
     * @return the uri
     */
    public URI getUri() {
        return mUri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(URI uri) {
        this.mUri = uri;
    }

    /**
     * @return the signer
     */
    public KinesisVideoSigner getSigner() {
        return mSigner;
    }

    /**
     * @param signer the signer to set
     */
    public void setSigner(KinesisVideoSigner signer) {
        this.mSigner = signer;
    }

    /**
     * @return the getInletMediaInputInJson
     */
    public String getGetInletMediaInputInJson() {
        return mGetInletMediaInputInJson;
    }

    /**
     * @param getInletMediaInputInJson the getInletMediaInputInJson to set
     */
    public void setmGetInletMediaInputInJson(String getInletMediaInputInJson) {
        this.mGetInletMediaInputInJson = getInletMediaInputInJson;
    }

    /**
     * @return the connectionTimeoutInMillis
     */
    public Integer getConnectionTimeoutInMillis() {
        return mConnectionTimeoutInMillis;
    }

    /**
     * @param connectionTimeoutInMillis the connectionTimeoutInMillis to set
     */
    public void setConnectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
        this.mConnectionTimeoutInMillis = connectionTimeoutInMillis;
    }

    /**
     * @return the readTimeoutInMillis
     */
    public Integer getReadTimeoutInMillis() {
        return mReadTimeoutInMillis;
    }

    /**
     * @param readTimeoutInMillis the readTimeoutInMillis to set
     */
    public void setReadTimeoutInMillis(Integer readTimeoutInMillis) {
        this.mReadTimeoutInMillis = readTimeoutInMillis;
    }
}
