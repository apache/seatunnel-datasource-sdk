# Apache SeaTunnel (Incubating)

<img src="https://seatunnel.apache.org/image/logo.png" alt="seatunnel logo" height="200px" align="right" />

[![Backend Workflow](https://github.com/apache/incubator-seatunnel/actions/workflows/backend.yml/badge.svg?branch=dev)](https://github.com/apache/incubator-seatunnel/actions/workflows/backend.yml)
[![Slack](https://img.shields.io/badge/slack-%23seatunnel-4f8eba?logo=slack)](https://join.slack.com/t/apacheseatunnel/shared_invite/zt-123jmewxe-RjB_DW3M3gV~xL91pZ0oVQ)
[![Twitter Follow](https://img.shields.io/twitter/follow/ASFSeaTunnel.svg?label=Follow&logo=twitter)](https://twitter.com/ASFSeaTunnel)

---
[![EN doc](https://img.shields.io/badge/document-English-blue.svg)](README.md)

SeaTunnel was formerly named Waterdrop , and renamed SeaTunnel since October 12, 2021.

---

SeaTunnel is a very easy-to-use ultra-high-performance distributed data integration platform that supports real-time
synchronization of massive data. It can synchronize tens of billions of data stably and efficiently every day, and has
been used in the production of nearly 100 companies.

## Apache SeaTunnel (Incubating) DataSourceSdk
todo
## Downloads

Download address for run-directly software package : https://seatunnel.apache.org/download

## Quick start

**SeaTunnel Engine**
https://seatunnel.apache.org/docs/start-v2/locally/quick-start-seatunnel-engine/

**Spark**
https://seatunnel.apache.org/docs/start-v2/locally/quick-start-spark

**Flink**
https://seatunnel.apache.org/docs/start-v2/locally/quick-start-flink

## Application practice cases

- Weibo, Value-added Business Department Data Platform

Weibo business uses an internal customized version of SeaTunnel and its sub-project Guardian for SeaTunnel On Yarn task
monitoring for hundreds of real-time streaming computing tasks.

- Sina, Big Data Operation Analysis Platform

Sina Data Operation Analysis Platform uses SeaTunnel to perform real-time and offline analysis of data operation and
maintenance for Sina News, CDN and other services, and write it into Clickhouse.

- Sogou, Sogou Qiqian System

Sogou Qiqian System takes SeaTunnel as an ETL tool to help establish a real-time data warehouse system.

- Qutoutiao, Qutoutiao Data Center

Qutoutiao Data Center uses SeaTunnel to support mysql to hive offline ETL tasks, real-time hive to clickhouse backfill
technical support, and well covers most offline and real-time tasks needs.

- Yixia Technology, Yizhibo Data Platform

- Yonghui Superstores Founders' Alliance-Yonghui Yunchuang Technology, Member E-commerce Data Analysis Platform

SeaTunnel provides real-time streaming and offline SQL computing of e-commerce user behavior data for Yonghui Life, a
new retail brand of Yonghui Yunchuang Technology.

- Shuidichou, Data Platform

Shuidichou adopts SeaTunnel to do real-time streaming and regular offline batch processing on Yarn, processing 3~4T data
volume average daily, and later writing the data to Clickhouse.

- Tencent Cloud

Collecting various logs from business services into Apache Kafka, some of the data in Apache Kafka is consumed and extracted through Seatunnel, and then store into Clickhouse.

For more use cases, please refer to: https://seatunnel.apache.org/blog

## Code of conduct

This project adheres to the Contributor Covenant [code of conduct](https://www.apache.org/foundation/policies/conduct).
By participating, you are expected to uphold this code. Please follow
the [REPORTING GUIDELINES](https://www.apache.org/foundation/policies/conduct#reporting-guidelines) to report
unacceptable behavior.

## Developer

Thanks to [all developers](https://github.com/apache/incubator-seatunnel/graphs/contributors)!

<a href="https://github.com/apache/incubator-seatunnel/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=apache/incubator-seatunnel" />
</a>

## Contact Us

* Mail list: **dev@seatunnel.apache.org**. Mail to `dev-subscribe@seatunnel.apache.org`, follow the reply to subscribe
  the mail list.
* Slack: https://join.slack.com/t/apacheseatunnel/shared_invite/zt-123jmewxe-RjB_DW3M3gV~xL91pZ0oVQ
* Twitter: https://twitter.com/ASFSeaTunnel
* [Bilibili](https://space.bilibili.com/1542095008) (for Chinese users)

## Landscapes

<p align="center">
<br/><br/>
<img src="https://landscape.cncf.io/images/left-logo.svg" width="150" alt=""/>&nbsp;&nbsp;<img src="https://landscape.cncf.io/images/right-logo.svg" width="200" alt=""/>
<br/><br/>
SeaTunnel enriches the <a href="https://landscape.cncf.io/?landscape=observability-and-analysis&license=apache-license-2-0">CNCF CLOUD NATIVE Landscape.</a >

</p >

## Our Users
Various companies and organizations use SeaTunnel for research, production and commercial products.
Visit our [website](https://seatunnel.apache.org/user) to find the user page.

## License
[Apache 2.0 License.](LICENSE)
