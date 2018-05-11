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

import java.net.URI;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.ContentType;

import com.amazonaws.kinesisvideo.http.KinesisVideoApacheHttpClient;
import com.amazonaws.kinesisvideo.http.HttpMethodName;
import com.amazonaws.kinesisvideo.signing.KinesisVideoSigner;

public class StreamingReadClient {

    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    
    private URI mUri;
    private KinesisVideoSigner mSigner;
    private String mInputInJson;
    private Integer mConnectionTimeoutInMillis;
    private Integer mReadTimeoutInMillis;
    
        StreamingReadClient(StreamingReadClientBuilder builder) {
            this.mUri = builder.mUri;
            this.mSigner = builder.mSigner;
            this.mInputInJson = builder.mInputInJson;
            this.mConnectionTimeoutInMillis = builder.mConnectionTimeoutInMillis;
            this.mReadTimeoutInMillis = builder.mReadTimeoutInMillis;
        }
        
        public static StreamingReadClientBuilder builder() {
            return new StreamingReadClientBuilder();
        }
        
        public static class StreamingReadClientBuilder {
            private URI mUri;
            private KinesisVideoSigner mSigner;
            private String mInputInJson;
            private Integer mConnectionTimeoutInMillis;
            private Integer mReadTimeoutInMillis;
            
            StreamingReadClientBuilder() { }
    
            public StreamingReadClientBuilder uri(URI uri) {
                this.mUri = uri;
                return this;
            }
    
            public StreamingReadClientBuilder signer(KinesisVideoSigner signer) {
                this.mSigner = signer;
                return this;
            }
    
            public StreamingReadClientBuilder inputInJson(String inputInJson) {
                this.mInputInJson = inputInJson;
                return this;
            }
    
            public StreamingReadClientBuilder connectionTimeoutInMillis(Integer connectionTimeoutInMillis) {
                this.mConnectionTimeoutInMillis = connectionTimeoutInMillis;
                return this;
            }
    
            public StreamingReadClientBuilder readTimeoutInMillis(Integer readTimeoutInMillis) {
                this.mReadTimeoutInMillis = readTimeoutInMillis;
                return this;
            }
            
            public StreamingReadClient build() {
                return new StreamingReadClient(this);
            }
        }

    public CloseableHttpResponse execute() {
        final KinesisVideoApacheHttpClient client = getHttpClient();
        return client.executeRequest();
    }

    private KinesisVideoApacheHttpClient getHttpClient() {
        KinesisVideoApacheHttpClient.Builder clientBuilder =
                KinesisVideoApacheHttpClient.builder()
                        .withUri(mUri)
                        .withContentType(ContentType.APPLICATION_JSON)
                        .withMethod(HttpMethodName.POST)
                        .withContentInJson(mInputInJson)
                        .withHeader(CONTENT_TYPE_HEADER_KEY, ContentType.APPLICATION_JSON.getMimeType());

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
     * @return the inputInJson
     */
    public String getInputInJson() {
        return mInputInJson;
    }

    /**
     * @param inputInJson the inputInJson to set
     */
    public void setInputInJson(String inputInJson) {
        this.mInputInJson = inputInJson;
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
