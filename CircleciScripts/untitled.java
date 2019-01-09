
    @Test
    public void testWhenWritingTooManyConcurrentRecords() throws
            InterruptedException, IOException {
        File recordsDirectory = null;
        File recordsFile = null;
        FileManager fileManager = new FileManager(TEST_DIRECTORY);
        final FileRecordStore recordStore = new FileRecordStore(TEST_DIRECTORY,
                RECORDER_FILE_NAME, MAX_STORAGE_SIZE);

        recordsDirectory = fileManager.getDirectory(Constants.RECORDS_DIRECTORY);
        recordsFile = new File(recordsDirectory, Constants.RECORDS_FILE_NAME);

        SecureRandom random = new SecureRandom();

        // first fill the disk
        String tempRecordStr = "";
        for (int i = 0; i < 10000; i++) {
            tempRecordStr = tempRecordStr + new BigInteger(130, random).toString(32);
        }

        final String recordStr = tempRecordStr;

        for (int i = 0; i < 30; i++) {
            recordStore.put(recordStr);
        }

        long initialSize = recordsFile.length();
        assertTrue(recordsFile.length() <= MAX_STORAGE_SIZE);

        final CountDownLatch latch = new CountDownLatch(1);
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        RecordIterator itr = recordStore.iterator();
                        if (itr.hasNext()) {
                            String next = itr.next();
                            assertEquals(next.length(), recordStr.length());
                            itr.removeReadRecords();
                        }
                        Thread.sleep(1);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    latch.countDown();
                }
            }
        });

        for (int i = 0; i < 10000; i++) {
            recordStore.put(recordStr);
            assertTrue(recordsFile.length() <= initialSize);
            recordStore.put(recordStr);
            assertTrue(recordsFile.length() <= initialSize);
            recordStore.put(recordStr);
            assertTrue(recordsFile.length() <= initialSize);
            Thread.sleep(1);
        }

        latch.await();
        assertEquals(recordsFile.length(), initialSize);
        assertTrue(recordsFile.length() < MAX_STORAGE_SIZE);

    }