## Blockchain

This is a simple `Blockchain` implemented in `Java`

## Getting Started

A blockchain is a type of `distributed` ledger technology (DLT) and `decentralized` that consists of growing lists of records, called blocks, that are securely linked together using `cryptography`.

> Each block contains a cryptographic hash of the previous block, a timestamp, and transaction data (generally represented as a Merkle tree, where data nodes are represented by leaves). The timestamp proves that the transaction data existed when the block was created. Since each block contains information about the previous block, they effectively form a chain (compare linked list data structure), with each additional block linking to the ones before it. Consequently, blockchain transactions are irreversible in that, once they are recorded, the data in any given block cannot be altered retroactively without altering all subsequent blocks.



The workspace contains two folders by default, where:

- `Decentralization`: By storing data across its peer-to-peer network, the blockchain eliminates a number of risks that come with data being held centrally. The decentralized blockchain may use ad hoc message passing and distributed networking. One risk of a lack of decentralization is a so-called "51% attack" where a central entity can gain control of more than half of a network and can manipulate that specific blockchain record at will, allowing double-spending.

- `Openness`: Open blockchains are more user-friendly than some traditional ownership records, which, while open to the public, still require physical access to view. Because all early blockchains were permissionless, controversy has arisen over the blockchain definition. An issue in this ongoing debate is whether a private system with verifiers tasked and authorized (permissioned) by a central authority should be considered a blockchain.


## Required Configuration
>JDK 19

