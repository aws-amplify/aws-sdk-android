/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class TransferThreadPool {

    private static final int MAX_CONCURRENT_MAIN_THREADS_ALLOWED = 2;
    private static final int MAX_CONCURRENT_PART_THREADS_ALLOWED = 5;
    private static ExecutorService executorMainTask;
    private static ExecutorService executorPartTask;

    private synchronized static void init() {
        if (executorMainTask == null) {
            executorMainTask = buildExecutor(MAX_CONCURRENT_MAIN_THREADS_ALLOWED);
        }
        if (executorPartTask == null) {
            executorPartTask = buildExecutor(MAX_CONCURRENT_PART_THREADS_ALLOWED);
        }
    }

    public static Future<Boolean> submitTask(Callable<Boolean> c) {
        init();
        if (c instanceof UploadPartTask) {
            return executorPartTask.submit(c);
        } else {
            return executorMainTask.submit(c);
        }
    }

    public static void closeThreadPool() {
        if (executorMainTask != null) {
            executorMainTask.shutdown();
            executorMainTask = null;
        }
        if (executorPartTask != null) {
            executorPartTask.shutdown();
            executorPartTask = null;
        }
    }

    private static ExecutorService buildExecutor(int maxThreadsAllowed) {
        /*
         * Create a bounded thread pool for executing transfers; it creates
         * threads as needed (up to maximum) and reclaims them when finished.
         */
        final ThreadPoolExecutor executor = new ThreadPoolExecutor(maxThreadsAllowed,
                maxThreadsAllowed, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }
}
