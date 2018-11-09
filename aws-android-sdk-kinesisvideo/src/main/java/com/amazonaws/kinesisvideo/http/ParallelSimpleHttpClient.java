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

package com.amazonaws.kinesisvideo.http;

import static com.amazonaws.kinesisvideo.common.preconditions.Preconditions.checkNotNull;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.amazonaws.kinesisvideo.common.function.Consumer;
import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.socket.SocketFactory;

import android.support.annotation.NonNull;

public final class ParallelSimpleHttpClient implements HttpClient {
    private static final String SPACE = " ";
    private static final String CLRF = "\r\n";
    private static final String HTTP_1_1 = "HTTP/1.1";
    private static final String HEADER_FORMAT = "%s: %s";
    private static final String HOST_HEADER = "Host";
    private final Log log;

    private static final Consumer<OutputStream> NO_OP_SENDER = new Consumer<OutputStream>() {
        @Override
        public void accept(final OutputStream outputStream) {
            // no op;
        }
    };

    private static final Consumer<Exception> NO_OP_COMPLETION = new Consumer<Exception>() {
        @Override
        public void accept(Exception object) {
            // No op;
        }
    };

    public static final class Builder {
        private final Map<String, String> mHeaders;
        private URI mUri;
        private HttpMethodName mMethod;
        private Consumer<OutputStream> mSender;
        private Consumer<InputStream> mReceiver;
        private Integer mTimeout;
        private Consumer<Exception> mCompletion;
        // TODO: Set to correct output channel
        private Log mLog = new Log(Log.SYSTEM_OUT);

        private Builder() {
            mHeaders = new HashMap<String, String>();
            mSender = NO_OP_SENDER;
            mCompletion = NO_OP_COMPLETION;
        }

        public Builder uri(final URI uri) {
            mUri = uri;
            mHeaders.put(HOST_HEADER, uri.getHost());
            return this;
        }

        public Builder method(final HttpMethodName method) {
            mMethod = method;
            return this;
        }

        public Builder header(final String key, final String value) {
            mHeaders.put(key, value);
            return this;
        }

        public Builder completionCallback(final Consumer<Exception> completion) {
            // Make sure we don't override the default no-op
            if (completion != null) {
                mCompletion = completion;
            }

            return this;
        }

        public Builder setSenderCallback(final Consumer<OutputStream> sender) {
            mSender = sender;
            return this;
        }

        public Builder setReceiverCallback(final Consumer<InputStream> receiver) {
            mReceiver = receiver;
            return this;
        }

        public Builder setTimeout(final Integer timeout) {
            mTimeout = timeout;
            return this;
        }

        public Builder log(@NonNull final Log log) {
            mLog = log;
            return this;
        }

        public ParallelSimpleHttpClient build() {
            checkNotNull(mUri);
            return new ParallelSimpleHttpClient(this);
        }
    }

    private final Builder mBuilder;
    private Socket mSocket;
    private InputStream mInputStream;
    private OutputStream mOutputStream;
    private ExecutorService payloadSender;
    private ExecutorService responseReceiver;

    private ParallelSimpleHttpClient(final Builder builder) {
            mBuilder = builder;
            log = mBuilder.mLog;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void connectAndProcessInBackground() {
        try {
            checkNotNull(mBuilder.mReceiver, "No callback set for the receiver!");
            initSocket();
            startCommunication();
        } catch (final Throwable e) {
            throw new RuntimeException("Exception while connecting to the server ! ", e);
        }
    }

    private void initSocket() throws IOException {
        mSocket = new SocketFactory().createSocket(mBuilder.mUri);
        if (mBuilder.mTimeout != null) {
            mSocket.setSoTimeout(mBuilder.mTimeout);
        }
        mInputStream = mSocket.getInputStream();
        mOutputStream = mSocket.getOutputStream();
    }

    public InputStream connectAndGetResponse() {
        try {
            initSocket();
            sendInitRequest();
        } catch (final Exception e) {
            throw new RuntimeException("Exception while executing and returning response ! ", e);
        }
        return mInputStream;
    }

    private void startCommunication() throws Exception {
        sendInitRequest();
        sendPayloadInBackground();
        receiveResponseInBackground();
    }

    private void sendInitRequest() throws Exception {
        final Writer outputWriter = new BufferedWriter(new OutputStreamWriter(mOutputStream, Charset.defaultCharset()));
        final String initRequest = new StringBuilder()
                .append(getHttpRequestString())
                .append(getHeadersString())
                .append(CLRF)
                .toString();

        log.debug("Request: " + initRequest);

        outputWriter.write(initRequest);
        outputWriter.flush();
    }

    private String getHttpRequestString() {
        final StringBuilder httpRequest = new StringBuilder();
        return httpRequest
                .append(mBuilder.mMethod)
                .append(SPACE)
                .append(mBuilder.mUri.getPath())
                .append(SPACE)
                .append(HTTP_1_1)
                .append(CLRF)
                .toString();
    }

    @Override
    public HttpMethodName getMethod() {
        return mBuilder.mMethod;
    }

    @Override
    public URI getUri() {
        return mBuilder.mUri;
    }

    @Override
    public Map<String, String> getHeaders() {
        return mBuilder.mHeaders;
    }

    @Override
    public InputStream getContent() {
        return null;
    }

    private String getHeadersString() {
        final StringBuilder builder = new StringBuilder();
        for (final Map.Entry<String, String> header : mBuilder.mHeaders.entrySet()) {
            final String headerString = String.format(HEADER_FORMAT, header.getKey(), header.getValue());
            builder.append(headerString);
            builder.append(CLRF);
        }

        final String allHeaders = builder.toString();
        return allHeaders.isEmpty() ? CLRF : allHeaders;
    }

    private void sendPayloadInBackground() {
        if (mBuilder.mSender != null) {
            payloadSender = Executors.newFixedThreadPool(1);
            payloadSender.execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            Exception storedException = null;
                            try {
                                // This is needed to get the thread Id.
                                log.debug("Start sending data.");
                                mBuilder.mSender.accept(mOutputStream);
                                log.debug("End sending data. Sent all data, close.");
                            } catch (final Exception e) {
                                log.exception(e, "Exception thrown on sending thread");
                                storedException = e;
                            } finally {
                                if (storedException != null) {
                                    mBuilder.mCompletion.accept(storedException);
                                }
                                payloadSender.shutdownNow();
                            }
                        }
                    });
        }
    }

    private void receiveResponseInBackground() {
        if (mBuilder.mReceiver != null) {
            responseReceiver = Executors.newFixedThreadPool(1);
            responseReceiver.execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            Exception storedException = null;
                            try {
                                log.debug("Starting receiving data");
                                mBuilder.mReceiver.accept(mInputStream);
                                log.debug("Received all data, close");
                            } catch (final Exception e) {
                                log.exception(e, "Exception thrown on receiving thread");
                                storedException = e;
                            } finally {
                                mBuilder.mCompletion.accept(storedException);
                                responseReceiver.shutdownNow();
                                closeSocket();
                            }
                        }
                    });
        }
    }

    public void closeSocket() {
        try {
            mSocket.close();
            //Ideally socket close should close this but also explicitly closing the streams
            //as it will fail silently if already closed.
            mInputStream.close();
            mOutputStream.close();
        } catch (final Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("Exception while shutting down!", e);
        }
    }

    @Override
    public void close() throws IOException {
        payloadSender.shutdownNow();
        responseReceiver.shutdownNow();
        closeSocket();
        mBuilder.mCompletion.accept(null);
    }
}
