# Distributed Key-Value Store

A distributed key-value store built to understand the core concepts behind production systems like Amazon DynamoDB and LinkedIn's Voldemort.

## Learning Objectives

### Core Concepts
- **Quorum replication** - How systems achieve fault tolerance without a single leader
- **Consistent hashing** - Minimizing data movement when nodes join/leave the cluster
- **Eventual consistency** - Trading strong consistency for availability and partition tolerance
- **Conflict resolution** - Using vector clocks to handle concurrent writes

### Architecture
- N=3, W=2, R=2 (configurable quorum for reads/writes)
- Virtual nodes for even data distribution
- Leaderless replication - all nodes are equal peers

## Resources

**Designing Data-Intensive Applications** by Martin Kleppmann
- Chapter 5: Replication (leaderless replication patterns)
- Chapter 6: Partitioning (consistent hashing, virtual nodes)

**Dynamo: Amazon's Highly Available Key-value Store**
- System architecture and design trade-offs
- Quorum-based replication
- Vector clocks for versioning

## Technologies
- Java
- Distributed systems concepts

## Goal?

Built to understand how production distributed databases work under the hood - the same architecture used by Cassandra, DynamoDB, and Voldemort.
