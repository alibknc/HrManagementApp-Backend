package com.alibknc.hrmanagementapp.util;

@FunctionalInterface
public interface SupplierCallback<R> {
    R get() throws Exception;
}