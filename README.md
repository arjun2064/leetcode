# leetcode

Create and save approach used for future reference


### Powers of two table

```
Power    Approx Value (Bytes)       Bytes
-----------------------------------------
10                 1 thousand        1 KB
16                65 thousand       64 KB
20                  1 million        1 MB
30                  1 billion        1 GB
32                  4 billion        4 GB
40                 1 trillion        1 TB
50              1 quadrillion        1 PB
```

### Bytes to store different data types in SQL

```
Data type              Bytes
-----------------------------
ASCII character             1
UNICODE character           2

Bytes calculation for string of length x
-----------------------------------------
(x*(bytes to store the char)*(8 bits)) / 8 bits


https://dev.mysql.com/doc/refman/8.0/en/storage-requirements.html
```

### Latency numbers every programmer should know in seconds
In a system design discussion, we normally discuss numbers in seconds or using relative comparisons. 
I doubt we are expected to know the exact numbers so, I created a cheat sheet that would be easy to remember and includes references to newer technology.
```
Latency Comparison Numbers
--------------------------
L1 cache can be accessed 14x faster than L2 cache.
Main memory access is 20x slower than L2, 200x slower than L1.

Zippy Compression at 250 MB/sec.
Send data over 1 Gbps network at 100 MB/sec.
Read sequentially from 1 Gbps Ethernet at 100 MB/sec.
Read randomly/sequentially from SSD at ~ 1 GB/sec.
Read sequentially from main memory at 4 GB/sec.
Read sequentially from disk at 30 MB/sec.
Disk seeks at 100 seeks/sec.
Round-trips within a data center at 2,000 trips/sec.
World-wide round trips at 6-7 trips/sec.

1MB sequential read from memory --> 250 micro seconds
1MB sequential read from ssd    --> 4x of memory
1MB sequential read from disk   --> 80x of memory
```

### Handy numbers for requests calculations.
```
Numbers for requests calculations
---------------------------------
2.5 million seconds per month

1 million reqs/month   -->  .4 reqs/sec
2.6 million reqs/month -->   1 reqs/sec
5 million reqs/month   -->   2 reqs/sec
10 million reqs/month  -->   4 reqs/sec
100 million reqs/month -->  40 reqs/sec
1 billion reqs/month   --> 400 reqs/sec
```

#### Source(s)
* [System Design Primer](https://github.com/donnemartin/system-design-primer/blob/master/README.md#appendix)
* [Snappy (Used to be Zippy)](https://github.com/google/snappy#introduction)
