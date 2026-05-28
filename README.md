# Java LRU Cache

A simple implementation of an LRU (Least Recently Used) Cache in Java using:

- HashMap
- Doubly Linked List

## Features

- O(1) `get()`
- O(1) `put()`
- Manual Doubly Linked List implementation
- Dummy head/tail node optimization

## Project Structure

```text
src/
├── Main.java
├── Node.java
├── DLL.java
└── LRUCache.java

## Currently Working On

- Thread-safe / concurrent version of the LRU Cache
- Improving synchronization strategy
- Exploring:
  - `ReentrantLock`
  - `ConcurrentHashMap`
  - Reader-writer locking
- Benchmarking performance under concurrent access

## Future Improvements

- Generic implementation using Java Generics
- Unit testing with JUnit
- Capacity resizing support
- Time-based expiration (TTL)
- LFU Cache implementation
