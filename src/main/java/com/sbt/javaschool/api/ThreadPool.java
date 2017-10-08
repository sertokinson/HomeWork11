package com.sbt.javaschool.api;
public interface ThreadPool {
    void start();
    void execute(Runnable runnable);
}
