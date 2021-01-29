package ru.ivanarh.jndcrash;

/**
 * Unwinder type. Matches ndcrash_unwinder values in ndcrash.h.
 */
public enum NDCrashUnwinder {
    libunwind,
    libunwindstack,
    libcorkscrew,
    cxxabi,
    stackscan,
}